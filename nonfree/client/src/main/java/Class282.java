import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class282 implements Runnable {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	private int anInt8563 = 0;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	private int anInt8572 = 0;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	private final int anInt8569;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[B")
	private final byte[] aByteArray111;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class282(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt8569 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray111 = new byte[this.anInt8569];
		this.aThread4 = new Thread(this);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!ue", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(37) int local37;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8563 == 0) {
						local37 = this.anInt8569 - this.anInt8572 - 1;
					} else if (this.anInt8572 > this.anInt8563) {
						local37 = this.anInt8569 - this.anInt8572;
					} else {
						local37 = this.anInt8563 - this.anInt8572 - 1;
					}
					if (local37 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(65) InterruptedException local65) {
					}
				}
			}
			@Pc(82) int local82;
			try {
				local82 = this.anInputStream2.read(this.aByteArray111, this.anInt8572, local37);
				if (local82 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(91) IOException local91) {
				@Pc(91) IOException local91x = local91;
				synchronized (this) {
					this.anIOException2 = local91x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8572 = (this.anInt8572 + local82) % this.anInt8569;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public void method7153() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(32) InterruptedException local32) {
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public void method7154() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(III[B)I")
	public int method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg2.length < arg1 + arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt8572 < this.anInt8563) {
				local46 = this.anInt8572 + this.anInt8569 - this.anInt8563;
			} else {
				local46 = this.anInt8572 - this.anInt8563;
			}
			if (local46 < arg1) {
				arg1 = local46;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt8569 >= this.anInt8563 + arg1) {
				Static553.method3373(this.aByteArray111, this.anInt8563, arg2, arg0, arg1);
			} else {
				@Pc(104) int local104 = this.anInt8569 - this.anInt8563;
				Static553.method3373(this.aByteArray111, this.anInt8563, arg2, arg0, local104);
				Static553.method3373(this.aByteArray111, 0, arg2, arg0 + local104, -local104 + arg1);
			}
			this.anInt8563 = (arg1 + this.anInt8563) % this.anInt8569;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)Z")
	public boolean method7157(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt8569 <= arg0) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt8572 < this.anInt8563) {
				local44 = this.anInt8569 + this.anInt8572 - this.anInt8563;
			} else {
				local44 = this.anInt8572 - this.anInt8563;
			}
			if (local44 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}
}
