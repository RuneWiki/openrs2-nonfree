import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class17 implements Runnable {

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	private int anInt470 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
	private int anInt464 = 0;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
	private final int anInt467;

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "[B")
	private final byte[] aByteArray5;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class17(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt467 = arg1 + 1;
		this.aByteArray5 = new byte[this.anInt467];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	public void method293() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Z")
	public boolean method295(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt467) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(38) int local38;
			if (this.anInt464 <= this.anInt470) {
				local38 = this.anInt470 - this.anInt464;
			} else {
				local38 = this.anInt470 + this.anInt467 - this.anInt464;
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

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method296() {
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

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[BI)I")
	public int method297(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg1.length < arg2 + arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt470 >= this.anInt464) {
				local45 = this.anInt470 - this.anInt464;
			} else {
				local45 = this.anInt470 + this.anInt467 - this.anInt464;
			}
			if (arg0 > local45) {
				arg0 = local45;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt467 < arg0 + this.anInt464) {
				@Pc(88) int local88 = this.anInt467 - this.anInt464;
				Static598.method1137(this.aByteArray5, this.anInt464, arg1, arg2, local88);
				Static598.method1137(this.aByteArray5, 0, arg1, local88 + arg2, arg0 - local88);
			} else {
				Static598.method1137(this.aByteArray5, this.anInt464, arg1, arg2, arg0);
			}
			this.anInt464 = (this.anInt464 + arg0) % this.anInt467;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ak", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt464 == 0) {
						local27 = this.anInt467 - this.anInt470 - 1;
					} else if (this.anInt470 > this.anInt464) {
						local27 = this.anInt467 - this.anInt470;
					} else {
						local27 = this.anInt464 - this.anInt470 - 1;
					}
					if (local27 > 0) {
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
				local74 = this.anInputStream1.read(this.aByteArray5, this.anInt470, local27);
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
				this.anInt470 = (this.anInt470 + local74) % this.anInt467;
			}
		}
	}
}
