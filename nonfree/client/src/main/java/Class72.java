import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class72 implements Runnable {

	@OriginalMember(owner = "client!dk", name = "i", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	private int anInt2065 = 0;

	@OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
	private int anInt2074 = 0;

	@OriginalMember(owner = "client!dk", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
	private final int anInt2069;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "[B")
	private final byte[] aByteArray17;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class72(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt2069 = arg1 + 1;
		this.aByteArray17 = new byte[this.anInt2069];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!dk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(36) int local36;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt2065 == 0) {
						local36 = this.anInt2069 - this.anInt2074 - 1;
					} else if (this.anInt2074 <= this.anInt2065) {
						local36 = this.anInt2065 - this.anInt2074 - 1;
					} else {
						local36 = this.anInt2069 - this.anInt2074;
					}
					if (local36 > 0) {
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
				local78 = this.anInputStream1.read(this.aByteArray17, this.anInt2074, local36);
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
				this.anInt2074 = (local78 + this.anInt2074) % this.anInt2069;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	public void method1715() {
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

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II[BI)I")
	public int method1718(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg1.length < arg0 + arg2) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(42) int local42;
			if (this.anInt2074 < this.anInt2065) {
				local42 = this.anInt2069 + this.anInt2074 - this.anInt2065;
			} else {
				local42 = this.anInt2074 - this.anInt2065;
			}
			if (arg0 > local42) {
				arg0 = local42;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt2069 >= arg0 + this.anInt2065) {
				Static651.method749(this.aByteArray17, this.anInt2065, arg1, arg2, arg0);
			} else {
				@Pc(108) int local108 = this.anInt2069 - this.anInt2065;
				Static651.method749(this.aByteArray17, this.anInt2065, arg1, arg2, local108);
				Static651.method749(this.aByteArray17, 0, arg1, arg2 + local108, -local108 + arg0);
			}
			this.anInt2065 = (arg0 + this.anInt2065) % this.anInt2069;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Z")
	public boolean method1719(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt2069) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(37) int local37;
			if (this.anInt2074 >= this.anInt2065) {
				local37 = this.anInt2074 - this.anInt2065;
			} else {
				local37 = this.anInt2074 + this.anInt2069 - this.anInt2065;
			}
			if (local37 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public void method1720() {
		this.anInputStream1 = new InputStream_Sub1();
	}
}
