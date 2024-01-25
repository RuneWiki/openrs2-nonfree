import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class234 implements Runnable {

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
	private int anInt5861 = 0;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	private int anInt5867 = 0;

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
	private final int anInt5863;

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class234(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt5863 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray59 = new byte[this.anInt5863];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	public void method5207() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Z")
	public boolean method5209(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt5863) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt5861 < this.anInt5867) {
				local40 = this.anInt5863 + this.anInt5861 - this.anInt5867;
			} else {
				local40 = this.anInt5861 - this.anInt5867;
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

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
	public void method5211() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!mm", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5867 == 0) {
						local26 = this.anInt5863 - this.anInt5861 - 1;
					} else if (this.anInt5861 <= this.anInt5867) {
						local26 = this.anInt5867 - this.anInt5861 - 1;
					} else {
						local26 = this.anInt5863 - this.anInt5861;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(59) InterruptedException local59) {
					}
				}
			}
			@Pc(76) int local76;
			try {
				local76 = this.anInputStream1.read(this.aByteArray59, this.anInt5861, local26);
				if (local76 == -1) {
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
				this.anInt5861 = (this.anInt5861 + local76) % this.anInt5863;
			}
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[BI)I")
	public int method5213(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg0 + arg2 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5867 <= this.anInt5861) {
				local36 = this.anInt5861 - this.anInt5867;
			} else {
				local36 = this.anInt5861 + this.anInt5863 - this.anInt5867;
			}
			if (local36 < arg2) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt5867 + arg2 <= this.anInt5863) {
				Static652.method4548(this.aByteArray59, this.anInt5867, arg1, arg0, arg2);
			} else {
				@Pc(90) int local90 = this.anInt5863 - this.anInt5867;
				Static652.method4548(this.aByteArray59, this.anInt5867, arg1, arg0, local90);
				Static652.method4548(this.aByteArray59, 0, arg1, arg0 + local90, -local90 + arg2);
			}
			this.anInt5867 = (arg2 + this.anInt5867) % this.anInt5863;
			this.notifyAll();
			return arg2;
		}
	}
}
