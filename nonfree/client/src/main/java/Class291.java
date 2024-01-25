import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class291 implements Runnable {

	@OriginalMember(owner = "client!qu", name = "p", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
	private int anInt8813 = 0;

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	private int anInt8812 = 0;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
	private final int anInt8816;

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "[B")
	private final byte[] aByteArray113;

	@OriginalMember(owner = "client!qu", name = "r", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class291(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt8816 = arg1 + 1;
		this.aByteArray113 = new byte[this.anInt8816];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
	public void method7318() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III[B)V")
	public void method7320(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(62) int local62;
			if (this.anInt8813 < this.anInt8812) {
				local62 = this.anInt8812 - this.anInt8813 - 1;
			} else {
				local62 = this.anInt8812 + this.anInt8816 - this.anInt8813 - 1;
			}
			if (local62 < arg0) {
				throw new IOException("");
			}
			if (this.anInt8813 + arg0 <= this.anInt8816) {
				Static681.method2476(arg1, 0, this.aByteArray113, this.anInt8813, arg0);
			} else {
				@Pc(113) int local113 = this.anInt8816 - this.anInt8813;
				Static681.method2476(arg1, 0, this.aByteArray113, this.anInt8813, local113);
				Static681.method2476(arg1, local113, this.aByteArray113, 0, arg0 - local113);
			}
			this.anInt8813 = (arg0 + this.anInt8813) % this.anInt8816;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
	public void method7321() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!qu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(31) int local31;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8813 < this.anInt8812) {
						local31 = this.anInt8816 + this.anInt8813 - this.anInt8812;
					} else {
						local31 = this.anInt8813 - this.anInt8812;
					}
					if (local31 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(50) IOException local50) {
						this.anIOException2 = local50;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(60) InterruptedException local60) {
					}
				}
			}
			try {
				if (this.anInt8812 + local31 <= this.anInt8816) {
					this.anOutputStream1.write(this.aByteArray113, this.anInt8812, local31);
				} else {
					@Pc(96) int local96 = this.anInt8816 - this.anInt8812;
					this.anOutputStream1.write(this.aByteArray113, this.anInt8812, local96);
					this.anOutputStream1.write(this.aByteArray113, 0, local31 - local96);
				}
			} catch (@Pc(116) IOException local116x) {
				@Pc(116) IOException local116 = local116x;
				synchronized (this) {
					this.anIOException2 = local116;
					return;
				}
			}
			synchronized (this) {
				this.anInt8812 = (this.anInt8812 + local31) % this.anInt8816;
			}
		}
	}
}
