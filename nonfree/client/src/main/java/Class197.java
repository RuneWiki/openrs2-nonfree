import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class197 implements Runnable {

	@OriginalMember(owner = "client!kea", name = "k", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
	private int anInt4628 = 0;

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "I")
	private int anInt4633 = 0;

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "I")
	private final int anInt4629;

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "[B")
	private final byte[] aByteArray51;

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class197(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt4629 = arg1 + 1;
		this.aByteArray51 = new byte[this.anInt4629];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!kea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4633 == 0) {
						local29 = this.anInt4629 - this.anInt4628 - 1;
					} else if (this.anInt4628 > this.anInt4633) {
						local29 = this.anInt4629 - this.anInt4628;
					} else {
						local29 = this.anInt4633 - this.anInt4628 - 1;
					}
					if (local29 > 0) {
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
				local80 = this.anInputStream1.read(this.aByteArray51, this.anInt4628, local29);
				if (local80 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(89) IOException local89) {
				@Pc(89) IOException local89x = local89;
				synchronized (this) {
					this.anIOException1 = local89x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4628 = (this.anInt4628 + local80) % this.anInt4629;
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I[BII)I")
	public int method4069(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg1.length < arg2 + arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt4628 < this.anInt4633) {
				local44 = this.anInt4629 + this.anInt4628 - this.anInt4633;
			} else {
				local44 = this.anInt4628 - this.anInt4633;
			}
			if (local44 < arg2) {
				arg2 = local44;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt4633 + arg2 <= this.anInt4629) {
				Static685.method8328(this.aByteArray51, this.anInt4633, arg1, arg0, arg2);
			} else {
				@Pc(99) int local99 = this.anInt4629 - this.anInt4633;
				Static685.method8328(this.aByteArray51, this.anInt4633, arg1, arg0, local99);
				Static685.method8328(this.aByteArray51, 0, arg1, arg0 + local99, -local99 + arg2);
			}
			this.anInt4633 = (arg2 + this.anInt4633) % this.anInt4629;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IB)Z")
	public boolean method4071(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt4629 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(34) int local34;
			if (this.anInt4628 >= this.anInt4633) {
				local34 = this.anInt4628 - this.anInt4633;
			} else {
				local34 = this.anInt4629 + this.anInt4628 - this.anInt4633;
			}
			if (arg0 <= local34) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
	public void method4072() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(I)V")
	public void method4074() {
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
}
