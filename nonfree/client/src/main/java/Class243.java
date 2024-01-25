import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class243 implements Runnable {

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	private int anInt6605 = 0;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	private int anInt6607 = 0;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	private final int anInt6603;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "[B")
	private final byte[] aByteArray85;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class243(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt6603 = arg1 + 1;
		this.aByteArray85 = new byte[this.anInt6603];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([BIII)I")
	public int method5577(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg2 + arg1) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(42) int local42;
			if (this.anInt6605 >= this.anInt6607) {
				local42 = this.anInt6605 - this.anInt6607;
			} else {
				local42 = this.anInt6603 + this.anInt6605 - this.anInt6607;
			}
			if (local42 < arg1) {
				arg1 = local42;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt6603 < arg1 + this.anInt6607) {
				@Pc(84) int local84 = this.anInt6603 - this.anInt6607;
				Static601.method2938(this.aByteArray85, this.anInt6607, arg0, arg2, local84);
				Static601.method2938(this.aByteArray85, 0, arg0, arg2 + local84, arg1 - local84);
			} else {
				Static601.method2938(this.aByteArray85, this.anInt6607, arg0, arg2, arg1);
			}
			this.anInt6607 = (this.anInt6607 + arg1) % this.anInt6603;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
	public void method5579() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
	public void method5580() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(35) InterruptedException local35) {
		}
	}

	@OriginalMember(owner = "client!oo", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt6607 == 0) {
						local30 = this.anInt6603 - this.anInt6605 - 1;
					} else if (this.anInt6607 < this.anInt6605) {
						local30 = this.anInt6603 - this.anInt6605;
					} else {
						local30 = this.anInt6607 - this.anInt6605 - 1;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(67) InterruptedException local67) {
					}
				}
			}
			@Pc(84) int local84;
			try {
				local84 = this.anInputStream2.read(this.aByteArray85, this.anInt6605, local30);
				if (local84 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(92) IOException local92) {
				@Pc(92) IOException local92x = local92;
				synchronized (this) {
					this.anIOException1 = local92x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6605 = (this.anInt6605 + local84) % this.anInt6603;
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)Z")
	public boolean method5581(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt6603 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(39) int local39;
			if (this.anInt6607 > this.anInt6605) {
				local39 = this.anInt6603 + this.anInt6605 - this.anInt6607;
			} else {
				local39 = this.anInt6605 - this.anInt6607;
			}
			if (arg0 <= local39) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}
}
