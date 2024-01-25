import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "I")
	private int anInt1997 = 0;

	@OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
	private int anInt1994 = 0;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
	private final int anInt1989;

	@OriginalMember(owner = "client!dfa", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "[B")
	private final byte[] aByteArray15;

	@OriginalMember(owner = "client!dfa", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class68(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1989 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray15 = new byte[this.anInt1989];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B)V")
	public void method1757() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ZII[B)I")
	public int method1758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg1 + arg0 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(49) int local49;
			if (this.anInt1997 > this.anInt1994) {
				local49 = this.anInt1989 + this.anInt1994 - this.anInt1997;
			} else {
				local49 = this.anInt1994 - this.anInt1997;
			}
			if (arg1 > local49) {
				arg1 = local49;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt1989 < arg1 + this.anInt1997) {
				@Pc(101) int local101 = this.anInt1989 - this.anInt1997;
				Static600.method3768(this.aByteArray15, this.anInt1997, arg2, arg0, local101);
				Static600.method3768(this.aByteArray15, 0, arg2, arg0 + local101, arg1 + -local101);
			} else {
				Static600.method3768(this.aByteArray15, this.anInt1997, arg2, arg0, arg1);
			}
			this.anInt1997 = (arg1 + this.anInt1997) % this.anInt1989;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)Z")
	public boolean method1759(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt1989 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(35) int local35;
			if (this.anInt1997 > this.anInt1994) {
				local35 = this.anInt1994 + this.anInt1989 - this.anInt1997;
			} else {
				local35 = this.anInt1994 - this.anInt1997;
			}
			if (arg0 <= local35) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)V")
	public void method1760() {
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

	@OriginalMember(owner = "client!dfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1997 == 0) {
						local29 = this.anInt1989 - this.anInt1994 - 1;
					} else if (this.anInt1994 <= this.anInt1997) {
						local29 = this.anInt1997 - this.anInt1994 - 1;
					} else {
						local29 = this.anInt1989 - this.anInt1994;
					}
					if (local29 > 0) {
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
				local79 = this.anInputStream1.read(this.aByteArray15, this.anInt1994, local29);
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
				this.anInt1994 = (this.anInt1994 + local79) % this.anInt1989;
			}
		}
	}
}
