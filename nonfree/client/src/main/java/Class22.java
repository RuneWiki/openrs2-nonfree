import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class22 implements Runnable {

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	private int anInt291 = 0;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	private int anInt290 = 0;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	private final int anInt295;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	public Class22(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt295 = arg1 + 1;
		this.anOutputStream2 = arg0;
		this.aByteArray4 = new byte[this.anInt295];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	public void method326() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BII)V")
	public void method327(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		if (arg0 < 0 || 0 < 0 || arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(67) int local67;
			if (this.anInt291 <= this.anInt290) {
				local67 = this.anInt291 + this.anInt295 - this.anInt290 - 1;
			} else {
				local67 = this.anInt291 - this.anInt290 - 1;
			}
			if (local67 < arg0) {
				throw new IOException("");
			}
			if (this.anInt295 >= arg0 + this.anInt290) {
				Static691.method82(arg1, 0, this.aByteArray4, this.anInt290, arg0);
			} else {
				@Pc(116) int local116 = this.anInt295 - this.anInt290;
				Static691.method82(arg1, 0, this.aByteArray4, this.anInt290, local116);
				Static691.method82(arg1, local116, this.aByteArray4, 0, arg0 - local116);
			}
			this.anInt290 = (this.anInt290 + arg0) % this.anInt295;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ap", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(34) int local34;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt290 < this.anInt291) {
						local34 = this.anInt295 + this.anInt290 - this.anInt291;
					} else {
						local34 = this.anInt290 - this.anInt291;
					}
					if (local34 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(51) IOException local51) {
						this.anIOException1 = local51;
						return;
					}
					try {
						this.wait();
					} catch (@Pc(61) InterruptedException local61) {
					}
				}
			}
			try {
				if (this.anInt295 < local34 + this.anInt291) {
					@Pc(83) int local83 = this.anInt295 - this.anInt291;
					this.anOutputStream2.write(this.aByteArray4, this.anInt291, local83);
					this.anOutputStream2.write(this.aByteArray4, 0, local34 - local83);
				} else {
					this.anOutputStream2.write(this.aByteArray4, this.anInt291, local34);
				}
			} catch (@Pc(112) IOException local112x) {
				@Pc(112) IOException local112 = local112x;
				synchronized (this) {
					this.anIOException1 = local112;
					return;
				}
			}
			synchronized (this) {
				this.anInt291 = (this.anInt291 + local34) % this.anInt295;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	public void method329() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}
}
