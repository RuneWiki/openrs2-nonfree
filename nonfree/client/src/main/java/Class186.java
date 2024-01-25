import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class186 implements Runnable {

	@OriginalMember(owner = "client!jn", name = "r", descriptor = "[I")
	public static final int[] anIntArray395 = new int[128];

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	private int anInt4870 = 0;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
	private int anInt4877 = 0;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
	private final int anInt4879;

	@OriginalMember(owner = "client!jn", name = "o", descriptor = "[B")
	private final byte[] aByteArray63;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	static {
		for (@Pc(9) int local9 = 0; local9 < anIntArray395.length; local9++) {
			anIntArray395[local9] = -1;
		}
		for (@Pc(25) int local25 = 65; local25 <= 90; local25++) {
			anIntArray395[local25] = local25 - 65;
		}
		for (@Pc(38) int local38 = 97; local38 <= 122; local38++) {
			anIntArray395[local38] = local38 + 26 - 97;
		}
		for (@Pc(53) int local53 = 48; local53 <= 57; local53++) {
			anIntArray395[local53] = local53 + 52 - 48;
		}
		anIntArray395[45] = anIntArray395[47] = 63;
		anIntArray395[42] = anIntArray395[43] = 62;
	}

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class186(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt4879 = arg1 + 1;
		this.aByteArray63 = new byte[this.anInt4879];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public void method4067() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Z")
	public boolean method4069(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt4879) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(34) int local34;
			if (this.anInt4877 <= this.anInt4870) {
				local34 = this.anInt4870 - this.anInt4877;
			} else {
				local34 = this.anInt4870 + this.anInt4879 - this.anInt4877;
			}
			if (arg0 <= local34) {
				return true;
			} else if (this.anIOException1 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
	public void method4070() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([BZII)I")
	public int method4073(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt4877 <= this.anInt4870) {
				local45 = this.anInt4870 - this.anInt4877;
			} else {
				local45 = this.anInt4879 + this.anInt4870 - this.anInt4877;
			}
			if (local45 < arg2) {
				arg2 = local45;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt4877 + arg2 > this.anInt4879) {
				@Pc(98) int local98 = this.anInt4879 - this.anInt4877;
				Static681.method2476(this.aByteArray63, this.anInt4877, arg0, arg1, local98);
				Static681.method2476(this.aByteArray63, 0, arg0, arg1 + local98, arg2 - local98);
			} else {
				Static681.method2476(this.aByteArray63, this.anInt4877, arg0, arg1, arg2);
			}
			this.anInt4877 = (this.anInt4877 + arg2) % this.anInt4879;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!jn", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4877 == 0) {
						local35 = this.anInt4879 - this.anInt4870 - 1;
					} else if (this.anInt4877 > this.anInt4870) {
						local35 = this.anInt4877 - this.anInt4870 - 1;
					} else {
						local35 = this.anInt4879 - this.anInt4870;
					}
					if (local35 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(64) InterruptedException local64) {
					}
				}
			}
			@Pc(81) int local81;
			try {
				local81 = this.anInputStream1.read(this.aByteArray63, this.anInt4870, local35);
				if (local81 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(90) IOException local90) {
				@Pc(90) IOException local90x = local90;
				synchronized (this) {
					this.anIOException1 = local90x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4870 = (this.anInt4870 + local81) % this.anInt4879;
			}
		}
	}
}
