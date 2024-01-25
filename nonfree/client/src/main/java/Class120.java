import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class120 implements Runnable {

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	private int anInt3419 = 0;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
	private int anInt3426 = 0;

	@OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
	private final int anInt3425;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "[B")
	private final byte[] aByteArray41;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class120(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt3425 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray41 = new byte[this.anInt3425];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method2955() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public void method2956() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!gl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(35) int local35;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt3426 == 0) {
						local35 = this.anInt3425 - this.anInt3419 - 1;
					} else if (this.anInt3419 <= this.anInt3426) {
						local35 = this.anInt3426 - this.anInt3419 - 1;
					} else {
						local35 = this.anInt3425 - this.anInt3419;
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
				local78 = this.anInputStream2.read(this.aByteArray41, this.anInt3419, local35);
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
				this.anInt3419 = (this.anInt3419 + local78) % this.anInt3425;
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZ[BI)I")
	public int method2959(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg1.length < arg0 + arg2) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt3426 <= this.anInt3419) {
				local45 = this.anInt3419 - this.anInt3426;
			} else {
				local45 = this.anInt3419 + this.anInt3425 - this.anInt3426;
			}
			if (arg2 > local45) {
				arg2 = local45;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt3425 < this.anInt3426 + arg2) {
				@Pc(91) int local91 = this.anInt3425 - this.anInt3426;
				Static596.method7719(this.aByteArray41, this.anInt3426, arg1, arg0, local91);
				Static596.method7719(this.aByteArray41, 0, arg1, arg0 + local91, -local91 + arg2);
			} else {
				Static596.method7719(this.aByteArray41, this.anInt3426, arg1, arg0, arg2);
			}
			this.anInt3426 = (arg2 + this.anInt3426) % this.anInt3425;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)Z")
	public boolean method2960(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt3425 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(29) int local29;
			if (this.anInt3419 >= this.anInt3426) {
				local29 = this.anInt3419 - this.anInt3426;
			} else {
				local29 = this.anInt3419 + this.anInt3425 - this.anInt3426;
			}
			if (local29 >= arg0) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}
}
