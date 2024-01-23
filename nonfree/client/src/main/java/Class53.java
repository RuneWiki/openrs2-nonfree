import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class53 {

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
	private int anInt1870;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	private int anInt1865 = 0;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "J")
	private long aLong78 = -1L;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "J")
	private long aLong77 = -1L;

	@OriginalMember(owner = "client!ie", name = "A", descriptor = "Lclient!fg;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!fg;II)V")
	public Class53(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass34_1 = arg0;
		this.aLong82 = this.aLong80 = arg0.method948();
		this.aLong81 = 0L;
		this.aByteArray24 = new byte[arg2];
		this.aByteArray23 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	private void method1432() throws IOException {
		if (this.aLong78 == -1L) {
			return;
		}
		if (this.aLong78 != this.aLong79) {
			this.aClass34_1.method945(this.aLong78);
			this.aLong79 = this.aLong78;
		}
		this.aClass34_1.method946(this.anInt1865, this.aByteArray24, 0);
		this.aLong79 += this.anInt1865;
		if (this.aLong79 > this.aLong80) {
			this.aLong80 = this.aLong79;
		}
		@Pc(72) long local72 = -1L;
		if (this.aLong78 >= this.aLong77 && this.aLong78 < (long) this.anInt1870 + this.aLong77) {
			local72 = this.aLong78;
		} else if (this.aLong78 <= this.aLong77 && this.aLong78 + (long) this.anInt1865 > this.aLong77) {
			local72 = this.aLong77;
		}
		@Pc(118) long local118 = -1L;
		if ((long) this.anInt1865 + this.aLong78 > this.aLong77 && (long) this.anInt1865 + this.aLong78 <= this.aLong77 + (long) this.anInt1870) {
			local118 = (long) this.anInt1865 + this.aLong78;
		} else if (this.aLong78 < (long) this.anInt1870 + this.aLong77 && (long) this.anInt1865 + this.aLong78 >= this.aLong77 + (long) this.anInt1870) {
			local118 = (long) this.anInt1870 + this.aLong77;
		}
		if (local72 > -1L && local118 > local72) {
			@Pc(206) int local206 = (int) (local118 - local72);
			Static235.method866(this.aByteArray24, (int) (local72 - this.aLong78), this.aByteArray23, (int) (local72 - this.aLong77), local206);
		}
		this.anInt1865 = 0;
		this.aLong78 = -1L;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public void method1434() throws IOException {
		this.method1432();
		this.aClass34_1.method949();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BZII)V")
	public void method1435(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong78 != -1L && this.aLong78 <= this.aLong81 && this.aLong81 + (long) arg1 <= this.aLong78 + (long) this.anInt1865) {
				Static235.method866(this.aByteArray24, (int) (this.aLong81 - this.aLong78), arg0, 0, arg1);
				this.aLong81 += arg1;
				return;
			}
			@Pc(80) long local80 = this.aLong81;
			@Pc(84) int local84 = arg1;
			@Pc(120) int local120;
			if (this.aLong81 >= this.aLong77 && this.aLong81 < (long) this.anInt1870 + this.aLong77) {
				local120 = (int) ((long) this.anInt1870 + this.aLong77 - this.aLong81);
				if (arg1 < local120) {
					local120 = arg1;
				}
				Static235.method866(this.aByteArray23, (int) (this.aLong81 - this.aLong77), arg0, 0, local120);
				arg1 -= local120;
				arg2 = local120;
				this.aLong81 += local120;
			}
			if (this.aByteArray23.length < arg1) {
				this.aClass34_1.method945(this.aLong81);
				this.aLong79 = this.aLong81;
				while (arg1 > 0) {
					local120 = this.aClass34_1.method944(arg0, arg2, arg1);
					if (local120 == -1) {
						break;
					}
					arg1 -= local120;
					this.aLong79 += local120;
					this.aLong81 += local120;
					arg2 += local120;
				}
			} else if (arg1 > 0) {
				this.method1436();
				local120 = arg1;
				if (this.anInt1870 < arg1) {
					local120 = this.anInt1870;
				}
				Static235.method866(this.aByteArray23, 0, arg0, arg2, local120);
				arg1 -= local120;
				this.aLong81 += local120;
				arg2 += local120;
			}
			if (this.aLong78 != -1L) {
				if (this.aLong81 < this.aLong78 && arg1 > 0) {
					local120 = arg2 + (int) (this.aLong78 - this.aLong81);
					if (local120 > arg2 + arg1) {
						local120 = arg2 + arg1;
					}
					while (arg2 < local120) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong81++;
					}
				}
				@Pc(314) long local314 = -1L;
				if (this.aLong78 + (long) this.anInt1865 > local80 && this.aLong78 + (long) this.anInt1865 <= (long) local84 + local80) {
					local314 = (long) this.anInt1865 + this.aLong78;
				} else if (this.aLong78 < local80 + (long) local84 && this.aLong78 + (long) this.anInt1865 >= local80 - -((long) local84)) {
					local314 = local80 + (long) local84;
				}
				@Pc(382) long local382 = -1L;
				if (this.aLong78 >= local80 && this.aLong78 < local80 + (long) local84) {
					local382 = this.aLong78;
				} else if (this.aLong78 <= local80 && local80 < (long) this.anInt1865 + this.aLong78) {
					local382 = local80;
				}
				if (local382 > -1L && local314 > local382) {
					@Pc(443) int local443 = (int) (local314 - local382);
					Static235.method866(this.aByteArray24, (int) (local382 - this.aLong78), arg0, (int) (local382 - local80), local443);
					if (local314 > this.aLong81) {
						arg1 = (int) ((long) arg1 + this.aLong81 - local314);
						this.aLong81 = local314;
					}
				}
			}
		} catch (@Pc(480) IOException local480) {
			this.aLong79 = -1L;
			throw local480;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	private void method1436() throws IOException {
		this.anInt1870 = 0;
		if (this.aLong79 != this.aLong81) {
			this.aClass34_1.method945(this.aLong81);
			this.aLong79 = this.aLong81;
		}
		this.aLong77 = this.aLong81;
		while (this.aByteArray23.length > this.anInt1870) {
			@Pc(42) int local42 = this.aByteArray23.length - this.anInt1870;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(59) int local59 = this.aClass34_1.method944(this.aByteArray23, this.anInt1870, local42);
			if (local59 == -1) {
				break;
			}
			this.anInt1870 += local59;
			this.aLong79 += local59;
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)J")
	public long method1437() {
		return this.aLong82;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Ljava/io/File;")
	private File method1439() {
		return this.aClass34_1.method947();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BIII)V")
	public void method1440(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong82 < (long) arg2 + this.aLong81) {
				this.aLong82 = (long) arg2 + this.aLong81;
			}
			if (this.aLong78 != -1L && (this.aLong81 < this.aLong78 || this.aLong81 > (long) this.anInt1865 + this.aLong78)) {
				this.method1432();
			}
			if (this.aLong78 != -1L && this.aLong81 + (long) arg2 > (long) this.aByteArray24.length + this.aLong78) {
				@Pc(79) int local79 = (int) ((long) this.aByteArray24.length + this.aLong78 - this.aLong81);
				Static235.method866(arg0, arg1, this.aByteArray24, (int) (this.aLong81 - this.aLong78), local79);
				this.aLong81 += local79;
				arg1 += local79;
				arg2 -= local79;
				this.anInt1865 = this.aByteArray24.length;
				this.method1432();
			}
			if (arg2 > this.aByteArray24.length) {
				@Pc(126) long local126 = -1L;
				if (this.aLong79 != this.aLong81) {
					this.aClass34_1.method945(this.aLong81);
					this.aLong79 = this.aLong81;
				}
				this.aClass34_1.method946(arg2, arg0, arg1);
				this.aLong79 += arg2;
				if (this.aLong81 >= this.aLong77 && this.aLong81 < this.aLong77 + (long) this.anInt1870) {
					local126 = this.aLong81;
				} else if (this.aLong81 <= this.aLong77 && this.aLong77 < (long) arg2 + this.aLong81) {
					local126 = this.aLong77;
				}
				if (this.aLong80 < this.aLong79) {
					this.aLong80 = this.aLong79;
				}
				@Pc(220) long local220 = -1L;
				if (this.aLong81 + (long) arg2 > this.aLong77 && (long) this.anInt1870 + this.aLong77 >= this.aLong81 - -((long) arg2)) {
					local220 = (long) arg2 + this.aLong81;
				} else if ((long) this.anInt1870 + this.aLong77 > this.aLong81 && this.aLong81 + (long) arg2 >= (long) this.anInt1870 + this.aLong77) {
					local220 = this.aLong77 + (long) this.anInt1870;
				}
				if (local126 > -1L && local126 < local220) {
					@Pc(301) int local301 = (int) (local220 - local126);
					Static235.method866(arg0, (int) ((long) arg1 + local126 - this.aLong81), this.aByteArray23, (int) (local126 - this.aLong77), local301);
				}
				this.aLong81 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong78 == -1L) {
					this.aLong78 = this.aLong81;
				}
				Static235.method866(arg0, arg1, this.aByteArray24, (int) (this.aLong81 - this.aLong78), arg2);
				this.aLong81 += arg2;
				if (this.aLong81 - this.aLong78 > (long) this.anInt1865) {
					this.anInt1865 = (int) (this.aLong81 - this.aLong78);
				}
			}
		} catch (@Pc(386) IOException local386) {
			this.aLong79 = -1L;
			throw local386;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JB)V")
	public void method1441(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1439());
		}
		this.aLong81 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
	public void method1442(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1435(arg0, arg0.length, 0);
	}
}
