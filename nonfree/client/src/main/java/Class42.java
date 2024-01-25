import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
	private int anInt1092 = 0;

	@OriginalMember(owner = "client!bu", name = "o", descriptor = "I")
	private int anInt1097 = 0;

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
	private final int anInt1090;

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class42(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt1090 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray14 = new byte[this.anInt1090];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Z")
	public boolean method840(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt1090 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt1097 > this.anInt1092) {
				local46 = this.anInt1090 + this.anInt1092 - this.anInt1097;
			} else {
				local46 = this.anInt1092 - this.anInt1097;
			}
			if (arg0 <= local46) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V")
	public void method841() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZ[BI)I")
	public int method842(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg2 + arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(47) int local47;
			if (this.anInt1097 > this.anInt1092) {
				local47 = this.anInt1092 + this.anInt1090 - this.anInt1097;
			} else {
				local47 = this.anInt1092 - this.anInt1097;
			}
			if (arg2 > local47) {
				arg2 = local47;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt1090 < this.anInt1097 + arg2) {
				@Pc(98) int local98 = this.anInt1090 - this.anInt1097;
				Static653.method5398(this.aByteArray14, this.anInt1097, arg1, arg0, local98);
				Static653.method5398(this.aByteArray14, 0, arg1, arg0 + local98, -local98 + arg2);
			} else {
				Static653.method5398(this.aByteArray14, this.anInt1097, arg1, arg0, arg2);
			}
			this.anInt1097 = (this.anInt1097 + arg2) % this.anInt1090;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!bu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1097 == 0) {
						local35 = this.anInt1090 - this.anInt1092 - 1;
					} else if (this.anInt1097 >= this.anInt1092) {
						local35 = this.anInt1097 - this.anInt1092 - 1;
					} else {
						local35 = this.anInt1090 - this.anInt1092;
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
				local81 = this.anInputStream1.read(this.aByteArray14, this.anInt1092, local35);
				if (local81 == -1) {
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
				this.anInt1092 = (this.anInt1092 + local81) % this.anInt1090;
			}
		}
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
	public void method845() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}
}
