import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class231 implements Runnable {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
	private int anInt6403 = 0;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
	private int anInt6404 = 0;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
	private final int anInt6401;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "[B")
	private final byte[] aByteArray84;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class231(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt6401 = arg1 + 1;
		this.aByteArray84 = new byte[this.anInt6401];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(IZ)Z")
	public boolean method5095(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt6401 <= arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt6403 <= this.anInt6404) {
				local36 = this.anInt6404 - this.anInt6403;
			} else {
				local36 = this.anInt6401 + this.anInt6404 - this.anInt6403;
			}
			if (local36 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt6403 == 0) {
						local35 = this.anInt6401 - this.anInt6404 - 1;
					} else if (this.anInt6404 <= this.anInt6403) {
						local35 = this.anInt6403 - this.anInt6404 - 1;
					} else {
						local35 = this.anInt6401 - this.anInt6404;
					}
					if (local35 > 0) {
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
				local78 = this.anInputStream2.read(this.aByteArray84, this.anInt6404, local35);
				if (local78 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(87) IOException local87) {
				@Pc(87) IOException local87x = local87;
				synchronized (this) {
					this.anIOException2 = local87x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6404 = (this.anInt6404 + local78) % this.anInt6401;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[BI)I")
	public int method5097(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg1.length < arg2 + arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(51) int local51;
			if (this.anInt6404 < this.anInt6403) {
				local51 = this.anInt6404 + this.anInt6401 - this.anInt6403;
			} else {
				local51 = this.anInt6404 - this.anInt6403;
			}
			if (arg0 > local51) {
				arg0 = local51;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt6401 >= this.anInt6403 + arg0) {
				Static468.method3858(this.aByteArray84, this.anInt6403, arg1, arg2, arg0);
			} else {
				@Pc(109) int local109 = this.anInt6401 - this.anInt6403;
				Static468.method3858(this.aByteArray84, this.anInt6403, arg1, arg2, local109);
				Static468.method3858(this.aByteArray84, 0, arg1, arg2 + local109, -local109 + arg0);
			}
			this.anInt6403 = (arg0 + this.anInt6403) % this.anInt6401;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
	public void method5098() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
	public void method5099() {
		this.anInputStream2 = new InputStream_Sub1();
	}
}
