import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rja")
public final class Class317 implements Runnable {

	@OriginalMember(owner = "client!rja", name = "q", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "I")
	private int anInt8076 = 0;

	@OriginalMember(owner = "client!rja", name = "p", descriptor = "I")
	private int anInt8083 = 0;

	@OriginalMember(owner = "client!rja", name = "m", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "I")
	private final int anInt8075;

	@OriginalMember(owner = "client!rja", name = "d", descriptor = "[B")
	private final byte[] aByteArray74;

	@OriginalMember(owner = "client!rja", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!rja", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class317(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt8075 = arg1 + 1;
		this.aByteArray74 = new byte[this.anInt8075];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!rja", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt8076 == 0) {
						local26 = this.anInt8075 - this.anInt8083 - 1;
					} else if (this.anInt8083 < this.anInt8076) {
						local26 = this.anInt8076 - this.anInt8083 - 1;
					} else {
						local26 = this.anInt8075 - this.anInt8083;
					}
					if (local26 > 0) {
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
				local78 = this.anInputStream1.read(this.aByteArray74, this.anInt8083, local26);
				if (local78 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(86) IOException local86) {
				@Pc(86) IOException local86x = local86;
				synchronized (this) {
					this.anIOException1 = local86x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8083 = (this.anInt8083 + local78) % this.anInt8075;
			}
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(B)V")
	public void method7031() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(IZ)Z")
	public boolean method7032(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt8075) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(43) int local43;
			if (this.anInt8083 < this.anInt8076) {
				local43 = this.anInt8075 + this.anInt8083 - this.anInt8076;
			} else {
				local43 = this.anInt8083 - this.anInt8076;
			}
			if (local43 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!rja", name = "b", descriptor = "(B)V")
	public void method7033() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(III[B)I")
	public int method7036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg1 + arg0 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt8083 >= this.anInt8076) {
				local44 = this.anInt8083 - this.anInt8076;
			} else {
				local44 = this.anInt8075 + this.anInt8083 - this.anInt8076;
			}
			if (arg0 > local44) {
				arg0 = local44;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg0 + this.anInt8076 <= this.anInt8075) {
				Static685.method6464(this.aByteArray74, this.anInt8076, arg2, arg1, arg0);
			} else {
				@Pc(107) int local107 = this.anInt8075 - this.anInt8076;
				Static685.method6464(this.aByteArray74, this.anInt8076, arg2, arg1, local107);
				Static685.method6464(this.aByteArray74, 0, arg2, local107 + arg1, arg0 - local107);
			}
			this.anInt8076 = (arg0 + this.anInt8076) % this.anInt8075;
			this.notifyAll();
			return arg0;
		}
	}
}
