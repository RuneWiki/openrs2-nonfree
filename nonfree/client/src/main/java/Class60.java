import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class60 implements Runnable {

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	private int anInt1284 = 0;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	private int anInt1285 = 0;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
	private final int anInt1286;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "[B")
	private final byte[] aByteArray14;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class60(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt1286 = arg1 + 1;
		this.aByteArray14 = new byte[this.anInt1286];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(32) int local32;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt1285 == 0) {
						local32 = this.anInt1286 - this.anInt1284 - 1;
					} else if (this.anInt1285 < this.anInt1284) {
						local32 = this.anInt1286 - this.anInt1284;
					} else {
						local32 = this.anInt1285 - this.anInt1284 - 1;
					}
					if (local32 > 0) {
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
				local79 = this.anInputStream1.read(this.aByteArray14, this.anInt1284, local32);
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
				this.anInt1284 = (this.anInt1284 + local79) % this.anInt1286;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public void method1180() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)Z")
	public boolean method1181(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt1286 <= arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt1285 <= this.anInt1284) {
				local46 = this.anInt1284 - this.anInt1285;
			} else {
				local46 = this.anInt1284 + this.anInt1286 - this.anInt1285;
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

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public void method1183() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([BIII)I")
	public int method1184(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg0.length < arg1 + arg2) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt1285 <= this.anInt1284) {
				local48 = this.anInt1284 - this.anInt1285;
			} else {
				local48 = this.anInt1286 + this.anInt1284 - this.anInt1285;
			}
			if (local48 < arg2) {
				arg2 = local48;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt1285 + arg2 <= this.anInt1286) {
				Static472.method5022(this.aByteArray14, this.anInt1285, arg0, arg1, arg2);
			} else {
				@Pc(110) int local110 = this.anInt1286 - this.anInt1285;
				Static472.method5022(this.aByteArray14, this.anInt1285, arg0, arg1, local110);
				Static472.method5022(this.aByteArray14, 0, arg0, arg1 + local110, -local110 + arg2);
			}
			this.anInt1285 = (arg2 + this.anInt1285) % this.anInt1286;
			this.notifyAll();
			return arg2;
		}
	}
}
