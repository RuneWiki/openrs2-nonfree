import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sia")
public final class Class325 implements Runnable {

	@OriginalMember(owner = "client!sia", name = "o", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
	private int anInt8894 = 0;

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "I")
	private int anInt8897 = 0;

	@OriginalMember(owner = "client!sia", name = "l", descriptor = "I")
	private final int anInt8899;

	@OriginalMember(owner = "client!sia", name = "k", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!sia", name = "f", descriptor = "[B")
	private final byte[] aByteArray97;

	@OriginalMember(owner = "client!sia", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread6;

	@OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class325(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt8899 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray97 = new byte[this.anInt8899];
		this.aThread6 = new Thread(this);
		this.aThread6.setDaemon(true);
		this.aThread6.start();
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)Z")
	public boolean method7552(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt8899) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt8894 >= this.anInt8897) {
				local36 = this.anInt8894 - this.anInt8897;
			} else {
				local36 = this.anInt8894 + this.anInt8899 - this.anInt8897;
			}
			if (arg0 <= local36) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B[BII)I")
	public int method7553(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg2 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(44) int local44;
			if (this.anInt8897 <= this.anInt8894) {
				local44 = this.anInt8894 - this.anInt8897;
			} else {
				local44 = this.anInt8894 + this.anInt8899 - this.anInt8897;
			}
			if (arg1 > local44) {
				arg1 = local44;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg1 + this.anInt8897 > this.anInt8899) {
				@Pc(94) int local94 = this.anInt8899 - this.anInt8897;
				Static689.method8055(this.aByteArray97, this.anInt8897, arg0, arg2, local94);
				Static689.method8055(this.aByteArray97, 0, arg0, local94 + arg2, arg1 + -local94);
			} else {
				Static689.method8055(this.aByteArray97, this.anInt8897, arg0, arg2, arg1);
			}
			this.anInt8897 = (arg1 + this.anInt8897) % this.anInt8899;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!sia", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt8897 == 0) {
						local27 = this.anInt8899 - this.anInt8894 - 1;
					} else if (this.anInt8894 <= this.anInt8897) {
						local27 = this.anInt8897 - this.anInt8894 - 1;
					} else {
						local27 = this.anInt8899 - this.anInt8894;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(58) InterruptedException local58) {
					}
				}
			}
			@Pc(75) int local75;
			try {
				local75 = this.anInputStream2.read(this.aByteArray97, this.anInt8894, local27);
				if (local75 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(83) IOException local83) {
				@Pc(83) IOException local83x = local83;
				synchronized (this) {
					this.anIOException2 = local83x;
					return;
				}
			}
			synchronized (this) {
				this.anInt8894 = (this.anInt8894 + local75) % this.anInt8899;
			}
		}
	}

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(B)V")
	public void method7555() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread6.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)V")
	public void method7557() {
		this.anInputStream2 = new InputStream_Sub2();
	}
}
