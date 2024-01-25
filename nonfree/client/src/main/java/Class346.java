import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class346 implements Runnable {

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	private int anInt9315 = 0;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	private int anInt9317 = 0;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	private final int anInt9313;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "[B")
	private final byte[] aByteArray116;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class346(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt9313 = arg1 + 1;
		this.aByteArray116 = new byte[this.anInt9313];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	public void method7609() {
		this.anOutputStream2 = new OutputStream_Sub2();
	}

	@OriginalMember(owner = "client!vn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(33) int local33;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9317 > this.anInt9315) {
						local33 = this.anInt9315 + this.anInt9313 - this.anInt9317;
					} else {
						local33 = this.anInt9315 - this.anInt9317;
					}
					if (local33 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(51) InterruptedException local51) {
					}
				}
			}
			try {
				if (local33 + this.anInt9317 > this.anInt9313) {
					@Pc(73) int local73 = this.anInt9313 - this.anInt9317;
					this.anOutputStream2.write(this.aByteArray116, this.anInt9317, local73);
					this.anOutputStream2.write(this.aByteArray116, 0, local33 - local73);
				} else {
					this.anOutputStream2.write(this.aByteArray116, this.anInt9317, local33);
				}
			} catch (@Pc(101) IOException local101) {
				@Pc(101) IOException local101x = local101;
				synchronized (this) {
					this.anIOException2 = local101x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9317 = (this.anInt9317 + local33) % this.anInt9313;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB[B)V")
	public void method7611(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (arg0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(50) int local50;
			if (this.anInt9317 > this.anInt9315) {
				local50 = this.anInt9317 - this.anInt9315 - 1;
			} else {
				local50 = this.anInt9317 + this.anInt9313 - this.anInt9315 - 1;
			}
			if (local50 < arg0) {
				throw new IOException("");
			}
			if (this.anInt9315 + arg0 <= this.anInt9313) {
				Static601.method2938(arg1, 0, this.aByteArray116, this.anInt9315, arg0);
			} else {
				@Pc(105) int local105 = this.anInt9313 - this.anInt9315;
				Static601.method2938(arg1, 0, this.aByteArray116, this.anInt9315, local105);
				Static601.method2938(arg1, local105, this.aByteArray116, 0, arg0 - local105);
			}
			this.anInt9315 = (arg0 + this.anInt9315) % this.anInt9313;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
	public void method7612() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}
}
