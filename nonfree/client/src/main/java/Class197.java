import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class197 implements Runnable {

	@OriginalMember(owner = "client!js", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!js", name = "j", descriptor = "I")
	private int anInt5229 = 0;

	@OriginalMember(owner = "client!js", name = "b", descriptor = "I")
	private int anInt5230 = 0;

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	private final int anInt5228;

	@OriginalMember(owner = "client!js", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!js", name = "h", descriptor = "[B")
	private final byte[] aByteArray49;

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class197(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt5228 = arg1 + 1;
		this.anOutputStream1 = arg0;
		this.aByteArray49 = new byte[this.anInt5228];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
	public void method4778() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([BIIZ)V")
	public void method4779(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg1 < 0 || 0 < 0 || arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(55) int local55;
			if (this.anInt5229 > this.anInt5230) {
				local55 = this.anInt5229 - this.anInt5230 - 1;
			} else {
				local55 = this.anInt5228 + this.anInt5229 - this.anInt5230 - 1;
			}
			if (local55 < arg1) {
				throw new IOException("");
			}
			if (this.anInt5228 >= arg1 + this.anInt5230) {
				Static695.method5648(arg0, 0, this.aByteArray49, this.anInt5230, arg1);
			} else {
				@Pc(108) int local108 = this.anInt5228 - this.anInt5230;
				Static695.method5648(arg0, 0, this.aByteArray49, this.anInt5230, local108);
				Static695.method5648(arg0, local108, this.aByteArray49, 0, arg1 - local108);
			}
			this.anInt5230 = (this.anInt5230 + arg1) % this.anInt5228;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!js", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5230 < this.anInt5229) {
						local34 = this.anInt5230 + this.anInt5228 - this.anInt5229;
					} else {
						local34 = this.anInt5230 - this.anInt5229;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(54) IOException local54) {
						this.anIOException2 = local54;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(64) InterruptedException local64) {
					}
				}
			}
			try {
				if (this.anInt5229 + local34 > this.anInt5228) {
					@Pc(87) int local87 = this.anInt5228 - this.anInt5229;
					this.anOutputStream1.write(this.aByteArray49, this.anInt5229, local87);
					this.anOutputStream1.write(this.aByteArray49, 0, local34 - local87);
				} else {
					this.anOutputStream1.write(this.aByteArray49, this.anInt5229, local34);
				}
			} catch (@Pc(116) IOException local116x) {
				@Pc(116) IOException local116 = local116x;
				synchronized (this) {
					this.anIOException2 = local116;
					return;
				}
			}
			synchronized (this) {
				this.anInt5229 = (local34 + this.anInt5229) % this.anInt5228;
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public void method4783() {
		this.anOutputStream1 = new OutputStream_Sub2();
	}
}
