import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class371 implements Runnable {

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!vea", name = "m", descriptor = "I")
	private int anInt10913 = 0;

	@OriginalMember(owner = "client!vea", name = "q", descriptor = "I")
	private int anInt10917 = 0;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vea", name = "l", descriptor = "I")
	private final int anInt10912;

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "[B")
	private final byte[] aByteArray100;

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread7;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class371(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt10912 = arg1 + 1;
		this.aByteArray100 = new byte[this.anInt10912];
		this.aThread7 = new Thread(this);
		this.aThread7.setDaemon(true);
		this.aThread7.start();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
	public void method9327() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Z")
	public boolean method9329(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt10912) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(42) int local42;
			if (this.anInt10913 <= this.anInt10917) {
				local42 = this.anInt10917 - this.anInt10913;
			} else {
				local42 = this.anInt10912 + this.anInt10917 - this.anInt10913;
			}
			if (local42 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt10913 == 0) {
						local29 = this.anInt10912 - this.anInt10917 - 1;
					} else if (this.anInt10917 > this.anInt10913) {
						local29 = this.anInt10912 - this.anInt10917;
					} else {
						local29 = this.anInt10913 - this.anInt10917 - 1;
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
				local79 = this.anInputStream2.read(this.aByteArray100, this.anInt10917, local29);
				if (local79 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(88) IOException local88) {
				@Pc(88) IOException local88x = local88;
				synchronized (this) {
					this.anIOException2 = local88x;
					return;
				}
			}
			synchronized (this) {
				this.anInt10917 = (local79 + this.anInt10917) % this.anInt10912;
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V")
	public void method9331() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(37) InterruptedException local37) {
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I[BIB)I")
	public int method9332(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg0 < 0 || arg2 < 0 || arg1.length < arg2 + arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt10917 >= this.anInt10913) {
				local44 = this.anInt10917 - this.anInt10913;
			} else {
				local44 = this.anInt10912 + this.anInt10917 - this.anInt10913;
			}
			if (local44 < arg0) {
				arg0 = local44;
			}
			if (arg0 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt10912 < arg0 + this.anInt10913) {
				@Pc(99) int local99 = this.anInt10912 - this.anInt10913;
				Static679.method4129(this.aByteArray100, this.anInt10913, arg1, arg2, local99);
				Static679.method4129(this.aByteArray100, 0, arg1, arg2 + local99, arg0 + -local99);
			} else {
				Static679.method4129(this.aByteArray100, this.anInt10913, arg1, arg2, arg0);
			}
			this.anInt10913 = (this.anInt10913 + arg0) % this.anInt10912;
			this.notifyAll();
			return arg0;
		}
	}
}
