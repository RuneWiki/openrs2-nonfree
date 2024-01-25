import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
	private int anInt356 = 0;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	private int anInt364 = 0;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	private final int anInt362;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "[B")
	private final byte[] aByteArray4;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class14(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt362 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray4 = new byte[this.anInt362];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([BBII)I")
	public int method548(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg2 + arg1) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(50) int local50;
			if (this.anInt364 > this.anInt356) {
				local50 = this.anInt362 + this.anInt356 - this.anInt364;
			} else {
				local50 = this.anInt356 - this.anInt364;
			}
			if (local50 < arg1) {
				arg1 = local50;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt362 < arg1 + this.anInt364) {
				@Pc(92) int local92 = this.anInt362 - this.anInt364;
				Static556.method7044(this.aByteArray4, this.anInt364, arg0, arg2, local92);
				Static556.method7044(this.aByteArray4, 0, arg0, arg2 + local92, arg1 - local92);
			} else {
				Static556.method7044(this.aByteArray4, this.anInt364, arg0, arg2, arg1);
			}
			this.anInt364 = (arg1 + this.anInt364) % this.anInt362;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ap", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt364 == 0) {
						local27 = this.anInt362 - this.anInt356 - 1;
					} else if (this.anInt356 > this.anInt364) {
						local27 = this.anInt362 - this.anInt356;
					} else {
						local27 = this.anInt364 - this.anInt356 - 1;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(61) InterruptedException local61) {
					}
				}
			}
			@Pc(78) int local78;
			try {
				local78 = this.anInputStream1.read(this.aByteArray4, this.anInt356, local27);
				if (local78 == -1) {
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
				this.anInt356 = (this.anInt356 + local78) % this.anInt362;
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZ)Z")
	public boolean method551(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt362 <= arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt364 <= this.anInt356) {
				local40 = this.anInt356 - this.anInt364;
			} else {
				local40 = this.anInt356 + this.anInt362 - this.anInt364;
			}
			if (arg0 <= local40) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
	public void method552() {
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

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(I)V")
	public void method554() {
		this.anInputStream1 = new InputStream_Sub2();
	}
}
