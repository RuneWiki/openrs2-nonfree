import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class314 implements Runnable {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
	private int anInt8718 = 0;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	private int anInt8720 = 0;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	private final int anInt8717;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[B")
	private final byte[] aByteArray109;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class314(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt8717 = arg1 + 1;
		this.aByteArray109 = new byte[this.anInt8717];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!tg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8720 == 0) {
						local30 = this.anInt8717 - this.anInt8718 - 1;
					} else if (this.anInt8718 <= this.anInt8720) {
						local30 = this.anInt8720 - this.anInt8718 - 1;
					} else {
						local30 = this.anInt8717 - this.anInt8718;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(60) InterruptedException local60) {
					}
				}
			}
			@Pc(77) int local77;
			try {
				local77 = this.anInputStream2.read(this.aByteArray109, this.anInt8718, local30);
				if (local77 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException2 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8718 = (local77 + this.anInt8718) % this.anInt8717;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	public void method7170() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
	public void method7171() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III[B)I")
	public int method7173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg2.length < arg0 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt8718 < this.anInt8720) {
				local48 = this.anInt8718 + this.anInt8717 - this.anInt8720;
			} else {
				local48 = this.anInt8718 - this.anInt8720;
			}
			if (arg1 > local48) {
				arg1 = local48;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt8720 + arg1 <= this.anInt8717) {
				Static602.method1586(this.aByteArray109, this.anInt8720, arg2, arg0, arg1);
			} else {
				@Pc(98) int local98 = this.anInt8717 - this.anInt8720;
				Static602.method1586(this.aByteArray109, this.anInt8720, arg2, arg0, local98);
				Static602.method1586(this.aByteArray109, 0, arg2, local98 + arg0, arg1 - local98);
			}
			this.anInt8720 = (this.anInt8720 + arg1) % this.anInt8717;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Z")
	public boolean method7174(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt8717 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(50) int local50;
			if (this.anInt8718 < this.anInt8720) {
				local50 = this.anInt8717 + this.anInt8718 - this.anInt8720;
			} else {
				local50 = this.anInt8718 - this.anInt8720;
			}
			if (arg0 <= local50) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}
}
