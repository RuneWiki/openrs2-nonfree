import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class71 implements Runnable {

	@OriginalMember(owner = "client!du", name = "l", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	private int anInt2259 = 0;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "I")
	private int anInt2265 = 0;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	private final int anInt2263;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class71(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt2263 = arg1 + 1;
		this.aByteArray32 = new byte[this.anInt2263];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZI)Z")
	public boolean method2085(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt2263 <= arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(32) int local32;
			if (this.anInt2265 < this.anInt2259) {
				local32 = this.anInt2265 + this.anInt2263 - this.anInt2259;
			} else {
				local32 = this.anInt2265 - this.anInt2259;
			}
			if (arg0 <= local32) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V")
	public void method2086() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(III[B)I")
	public int method2090(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg2.length) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(55) int local55;
			if (this.anInt2265 >= this.anInt2259) {
				local55 = this.anInt2265 - this.anInt2259;
			} else {
				local55 = this.anInt2265 + this.anInt2263 - this.anInt2259;
			}
			if (arg1 > local55) {
				arg1 = local55;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg1 + this.anInt2259 <= this.anInt2263) {
				Static553.method2534(this.aByteArray32, this.anInt2259, arg2, arg0, arg1);
			} else {
				@Pc(116) int local116 = this.anInt2263 - this.anInt2259;
				Static553.method2534(this.aByteArray32, this.anInt2259, arg2, arg0, local116);
				Static553.method2534(this.aByteArray32, 0, arg2, local116 + arg0, -local116 + arg1);
			}
			this.anInt2259 = (arg1 + this.anInt2259) % this.anInt2263;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!du", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(32) int local32;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt2259 == 0) {
						local32 = this.anInt2263 - this.anInt2265 - 1;
					} else if (this.anInt2265 <= this.anInt2259) {
						local32 = this.anInt2259 - this.anInt2265 - 1;
					} else {
						local32 = this.anInt2263 - this.anInt2265;
					}
					if (local32 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(58) InterruptedException local58) {
					}
				}
			}
			@Pc(75) int local75;
			try {
				local75 = this.anInputStream1.read(this.aByteArray32, this.anInt2265, local32);
				if (local75 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(84) IOException local84) {
				@Pc(84) IOException local84x = local84;
				synchronized (this) {
					this.anIOException2 = local84x;
					return;
				}
			}
			synchronized (this) {
				this.anInt2265 = (this.anInt2265 + local75) % this.anInt2263;
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(I)V")
	public void method2091() {
		this.anInputStream1 = new InputStream_Sub2();
	}
}
