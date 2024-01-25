import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class284 implements Runnable {

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
	private int anInt7908 = 0;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	private int anInt7912 = 0;

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
	private final int anInt7907;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class284(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt7907 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray78 = new byte[this.anInt7907];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)V")
	public void method6790() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!pw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt7912 > this.anInt7908) {
						local34 = this.anInt7908 + this.anInt7907 - this.anInt7912;
					} else {
						local34 = this.anInt7908 - this.anInt7912;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(51) IOException local51) {
						this.anIOException2 = local51;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(61) InterruptedException local61) {
					}
				}
			}
			try {
				if (this.anInt7907 < this.anInt7912 + local34) {
					@Pc(83) int local83 = this.anInt7907 - this.anInt7912;
					this.anOutputStream2.write(this.aByteArray78, this.anInt7912, local83);
					this.anOutputStream2.write(this.aByteArray78, 0, local34 - local83);
				} else {
					this.anOutputStream2.write(this.aByteArray78, this.anInt7912, local34);
				}
			} catch (@Pc(112) IOException local112x) {
				@Pc(112) IOException local112 = local112x;
				synchronized (this) {
					this.anIOException2 = local112;
					return;
				}
			}
			synchronized (this) {
				this.anInt7912 = (local34 + this.anInt7912) % this.anInt7907;
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B)V")
	public void method6793() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II[BI)V")
	public void method6795(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (arg0 < 0 || 0 < 0 || arg1.length < arg0) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(58) int local58;
			if (this.anInt7908 < this.anInt7912) {
				local58 = this.anInt7912 - this.anInt7908 - 1;
			} else {
				local58 = this.anInt7912 + this.anInt7907 - this.anInt7908 - 1;
			}
			if (local58 < arg0) {
				throw new IOException("");
			}
			if (this.anInt7908 + arg0 > this.anInt7907) {
				@Pc(98) int local98 = this.anInt7907 - this.anInt7908;
				Static682.method799(arg1, 0, this.aByteArray78, this.anInt7908, local98);
				Static682.method799(arg1, local98, this.aByteArray78, 0, arg0 - local98);
			} else {
				Static682.method799(arg1, 0, this.aByteArray78, this.anInt7908, arg0);
			}
			this.anInt7908 = (arg0 + this.anInt7908) % this.anInt7907;
			this.notifyAll();
		}
	}
}
