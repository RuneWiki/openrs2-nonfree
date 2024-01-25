import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class150 implements Runnable {

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	private int anInt4524 = 0;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	private int anInt4529 = 0;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	private final int anInt4532;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "[B")
	private final byte[] aByteArray40;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class150(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt4532 = arg1 + 1;
		this.aByteArray40 = new byte[this.anInt4532];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	public void method3743() {
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

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I[BII)I")
	public int method3745(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg1.length < arg0 + arg2) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(54) int local54;
			if (this.anInt4524 > this.anInt4529) {
				local54 = this.anInt4532 + this.anInt4529 - this.anInt4524;
			} else {
				local54 = this.anInt4529 - this.anInt4524;
			}
			if (local54 < arg0) {
				arg0 = local54;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt4532 < this.anInt4524 + arg0) {
				@Pc(101) int local101 = this.anInt4532 - this.anInt4524;
				Static649.method4863(this.aByteArray40, this.anInt4524, arg1, arg2, local101);
				Static649.method4863(this.aByteArray40, 0, arg1, arg2 + local101, -local101 + arg0);
			} else {
				Static649.method4863(this.aByteArray40, this.anInt4524, arg1, arg2, arg0);
			}
			this.anInt4524 = (this.anInt4524 + arg0) % this.anInt4532;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ho", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(36) int local36;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4524 == 0) {
						local36 = this.anInt4532 - this.anInt4529 - 1;
					} else if (this.anInt4524 >= this.anInt4529) {
						local36 = this.anInt4524 - this.anInt4529 - 1;
					} else {
						local36 = this.anInt4532 - this.anInt4529;
					}
					if (local36 > 0) {
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
				local79 = this.anInputStream1.read(this.aByteArray40, this.anInt4529, local36);
				if (local79 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(88) IOException local88) {
				@Pc(88) IOException local88x = local88;
				synchronized (this) {
					this.anIOException1 = local88x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4529 = (this.anInt4529 + local79) % this.anInt4532;
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	public void method3747() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)Z")
	public boolean method3748(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt4532) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(38) int local38;
			if (this.anInt4524 > this.anInt4529) {
				local38 = this.anInt4532 + this.anInt4529 - this.anInt4524;
			} else {
				local38 = this.anInt4529 - this.anInt4524;
			}
			if (arg0 <= local38) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}
}
