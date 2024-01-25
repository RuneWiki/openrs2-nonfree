import java.awt.Rectangle;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class81 implements Runnable {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	private int anInt2105 = 0;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	private int anInt2104 = 0;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private final int anInt2095;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "[B")
	private final byte[] aByteArray18;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	static {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			aRectangleArray1[local6] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class81(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt2095 = arg1 + 1;
		this.aByteArray18 = new byte[this.anInt2095];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
	public void method1715() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Z")
	public boolean method1717(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt2095 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(37) int local37;
			if (this.anInt2104 >= this.anInt2105) {
				local37 = this.anInt2104 - this.anInt2105;
			} else {
				local37 = this.anInt2104 + this.anInt2095 - this.anInt2105;
			}
			if (local37 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI[B)I")
	public int method1720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg2.length < arg1 + arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(54) int local54;
			if (this.anInt2104 < this.anInt2105) {
				local54 = this.anInt2095 + this.anInt2104 - this.anInt2105;
			} else {
				local54 = this.anInt2104 - this.anInt2105;
			}
			if (local54 < arg1) {
				arg1 = local54;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt2105 + arg1 <= this.anInt2095) {
				Static598.method1173(this.aByteArray18, this.anInt2105, arg2, arg0, arg1);
			} else {
				@Pc(109) int local109 = this.anInt2095 - this.anInt2105;
				Static598.method1173(this.aByteArray18, this.anInt2105, arg2, arg0, local109);
				Static598.method1173(this.aByteArray18, 0, arg2, arg0 + local109, arg1 + -local109);
			}
			this.anInt2105 = (arg1 + this.anInt2105) % this.anInt2095;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ec", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt2105 == 0) {
						local35 = this.anInt2095 - this.anInt2104 - 1;
					} else if (this.anInt2104 <= this.anInt2105) {
						local35 = this.anInt2105 - this.anInt2104 - 1;
					} else {
						local35 = this.anInt2095 - this.anInt2104;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(62) InterruptedException local62) {
					}
				}
			}
			@Pc(79) int local79;
			try {
				local79 = this.anInputStream1.read(this.aByteArray18, this.anInt2104, local35);
				if (local79 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(87) IOException local87) {
				@Pc(87) IOException local87x = local87;
				synchronized (this) {
					this.anIOException1 = local87x;
					return;
				}
			}
			synchronized (this) {
				this.anInt2104 = (this.anInt2104 + local79) % this.anInt2095;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method1721() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}
}
