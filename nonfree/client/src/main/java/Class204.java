import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class204 implements Runnable {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
	public static final int[] anIntArray347 = new int[32];

	@OriginalMember(owner = "client!le", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "I")
	private int anInt5015 = 0;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	private int anInt5018 = 0;

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	private final int anInt5022;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "[B")
	private final byte[] aByteArray51;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray347[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class204(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt5022 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray51 = new byte[this.anInt5022];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method4348() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!le", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(38) int local38;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5018 == 0) {
						local38 = this.anInt5022 - this.anInt5015 - 1;
					} else if (this.anInt5015 <= this.anInt5018) {
						local38 = this.anInt5018 - this.anInt5015 - 1;
					} else {
						local38 = this.anInt5022 - this.anInt5015;
					}
					if (local38 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(63) InterruptedException local63) {
					}
				}
			}
			@Pc(80) int local80;
			try {
				local80 = this.anInputStream1.read(this.aByteArray51, this.anInt5015, local38);
				if (local80 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(89) IOException local89) {
				@Pc(89) IOException local89x = local89;
				synchronized (this) {
					this.anIOException2 = local89x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5015 = (this.anInt5015 + local80) % this.anInt5022;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public void method4349() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
	public boolean method4351(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt5022) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt5015 < this.anInt5018) {
				local40 = this.anInt5022 + this.anInt5015 - this.anInt5018;
			} else {
				local40 = this.anInt5015 - this.anInt5018;
			}
			if (arg0 <= local40) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I[BII)I")
	public int method4353(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(38) int local38;
			if (this.anInt5018 <= this.anInt5015) {
				local38 = this.anInt5015 - this.anInt5018;
			} else {
				local38 = this.anInt5022 + this.anInt5015 - this.anInt5018;
			}
			if (local38 < arg1) {
				arg1 = local38;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg1 + this.anInt5018 <= this.anInt5022) {
				Static598.method4261(this.aByteArray51, this.anInt5018, arg0, arg2, arg1);
			} else {
				@Pc(96) int local96 = this.anInt5022 - this.anInt5018;
				Static598.method4261(this.aByteArray51, this.anInt5018, arg0, arg2, local96);
				Static598.method4261(this.aByteArray51, 0, arg0, local96 + arg2, arg1 + -local96);
			}
			this.anInt5018 = (arg1 + this.anInt5018) % this.anInt5022;
			this.notifyAll();
			return arg1;
		}
	}
}
