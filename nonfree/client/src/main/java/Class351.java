import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class351 implements Runnable {

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	private int anInt9932 = 0;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "I")
	private int anInt9937 = 0;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
	private final int anInt9933;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "[B")
	private final byte[] aByteArray102;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class351(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt9933 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray102 = new byte[this.anInt9933];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt9932 == 0) {
						local30 = this.anInt9933 - this.anInt9937 - 1;
					} else if (this.anInt9937 > this.anInt9932) {
						local30 = this.anInt9933 - this.anInt9937;
					} else {
						local30 = this.anInt9932 - this.anInt9937 - 1;
					}
					if (local30 > 0) {
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
				local78 = this.anInputStream2.read(this.aByteArray102, this.anInt9937, local30);
				if (local78 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(86) IOException local86) {
				@Pc(86) IOException local86x = local86;
				synchronized (this) {
					this.anIOException2 = local86x;
					return;
				}
			}
			synchronized (this) {
				this.anInt9937 = (local78 + this.anInt9937) % this.anInt9933;
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public void method8153() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	public void method8154() {
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

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III[B)I")
	public int method8156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg1 + arg0 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(42) int local42;
			if (this.anInt9932 <= this.anInt9937) {
				local42 = this.anInt9937 - this.anInt9932;
			} else {
				local42 = this.anInt9933 + this.anInt9937 - this.anInt9932;
			}
			if (local42 < arg1) {
				arg1 = local42;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt9933 < this.anInt9932 + arg1) {
				@Pc(101) int local101 = this.anInt9933 - this.anInt9932;
				Static655.method6406(this.aByteArray102, this.anInt9932, arg2, arg0, local101);
				Static655.method6406(this.aByteArray102, 0, arg2, arg0 + local101, -local101 + arg1);
			} else {
				Static655.method6406(this.aByteArray102, this.anInt9932, arg2, arg0, arg1);
			}
			this.anInt9932 = (this.anInt9932 + arg1) % this.anInt9933;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)Z")
	public boolean method8157(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt9933 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt9937 < this.anInt9932) {
				local41 = this.anInt9937 + this.anInt9933 - this.anInt9932;
			} else {
				local41 = this.anInt9937 - this.anInt9932;
			}
			if (local41 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}
}
