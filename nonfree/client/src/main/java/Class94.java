import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class94 implements Runnable {

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "[I")
	public static final int[] anIntArray223 = new int[256];

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
	private int anInt2759 = 0;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	private int anInt2758 = 0;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
	private final int anInt2756;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray223[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class94(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt2756 = arg1 + 1;
		this.aByteArray29 = new byte[this.anInt2756];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
	public void method2484() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[BIZ)I")
	public int method2485(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg2 + arg0 > arg1.length) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(55) int local55;
			if (this.anInt2759 < this.anInt2758) {
				local55 = this.anInt2756 + this.anInt2759 - this.anInt2758;
			} else {
				local55 = this.anInt2759 - this.anInt2758;
			}
			if (local55 < arg2) {
				arg2 = local55;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt2758 > this.anInt2756) {
				@Pc(98) int local98 = this.anInt2756 - this.anInt2758;
				Static554.method3498(this.aByteArray29, this.anInt2758, arg1, arg0, local98);
				Static554.method3498(this.aByteArray29, 0, arg1, local98 + arg0, arg2 + -local98);
			} else {
				Static554.method3498(this.aByteArray29, this.anInt2758, arg1, arg0, arg2);
			}
			this.anInt2758 = (this.anInt2758 + arg2) % this.anInt2756;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)Z")
	public boolean method2486(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt2756) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(32) int local32;
			if (this.anInt2759 < this.anInt2758) {
				local32 = this.anInt2759 + this.anInt2756 - this.anInt2758;
			} else {
				local32 = this.anInt2759 - this.anInt2758;
			}
			if (arg0 <= local32) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public void method2487() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!eq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt2758 == 0) {
						local29 = this.anInt2756 - this.anInt2759 - 1;
					} else if (this.anInt2758 < this.anInt2759) {
						local29 = this.anInt2756 - this.anInt2759;
					} else {
						local29 = this.anInt2758 - this.anInt2759 - 1;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(57) InterruptedException local57) {
					}
				}
			}
			@Pc(74) int local74;
			try {
				local74 = this.anInputStream2.read(this.aByteArray29, this.anInt2759, local29);
				if (local74 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(82) IOException local82) {
				@Pc(82) IOException local82x = local82;
				synchronized (this) {
					this.anIOException1 = local82x;
					return;
				}
			}
			synchronized (this) {
				this.anInt2759 = (this.anInt2759 + local74) % this.anInt2756;
			}
		}
	}
}
