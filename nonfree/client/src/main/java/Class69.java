import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class69 {

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	private int anInt2102;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "J")
	private long aLong86;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "J")
	private long aLong84 = -1L;

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
	private int anInt2111 = 0;

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "J")
	private long aLong87 = -1L;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!jc;")
	private final Class99 aClass99_1;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "J")
	private long aLong88;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "[B")
	private final byte[] aByteArray38;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "[B")
	private final byte[] aByteArray37;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!jc;II)V")
	public Class69(@OriginalArg(0) Class99 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass99_1 = arg0;
		this.aLong85 = this.aLong89 = arg0.method2722();
		this.aLong88 = 0L;
		this.aByteArray38 = new byte[arg1];
		this.aByteArray37 = new byte[arg2];
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B[BII)V")
	public void method1916(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong85 < (long) arg2 + this.aLong88) {
				this.aLong85 = (long) arg2 + this.aLong88;
			}
			if (this.aLong87 != -1L && (this.aLong87 > this.aLong88 || (long) this.anInt2111 + this.aLong87 < this.aLong88)) {
				this.method1924();
			}
			if (this.aLong87 != -1L && (long) arg2 + this.aLong88 > this.aLong87 + (long) this.aByteArray37.length) {
				@Pc(98) int local98 = (int) (this.aLong87 + (long) this.aByteArray37.length - this.aLong88);
				Static367.method5383(arg0, arg1, this.aByteArray37, (int) (this.aLong88 - this.aLong87), local98);
				arg1 += local98;
				this.aLong88 += local98;
				arg2 -= local98;
				this.anInt2111 = this.aByteArray37.length;
				this.method1924();
			}
			if (this.aByteArray37.length < arg2) {
				if (this.aLong86 != this.aLong88) {
					this.aClass99_1.method2726(this.aLong88);
					this.aLong86 = this.aLong88;
				}
				this.aClass99_1.method2723(arg1, arg2, arg0);
				this.aLong86 += arg2;
				if (this.aLong89 < this.aLong86) {
					this.aLong89 = this.aLong86;
				}
				@Pc(185) long local185 = -1L;
				if (this.aLong88 >= this.aLong84 && this.aLong84 + (long) this.anInt2102 > this.aLong88) {
					local185 = this.aLong88;
				} else if (this.aLong84 >= this.aLong88 && (long) arg2 + this.aLong88 > this.aLong84) {
					local185 = this.aLong84;
				}
				@Pc(234) long local234 = -1L;
				if ((long) arg2 + this.aLong88 > this.aLong84 && (long) this.anInt2102 + this.aLong84 >= (long) arg2 + this.aLong88) {
					local234 = this.aLong88 + (long) arg2;
				} else if (this.aLong88 < this.aLong84 + (long) this.anInt2102 && (long) arg2 + this.aLong88 >= (long) this.anInt2102 + this.aLong84) {
					local234 = this.aLong84 + (long) this.anInt2102;
				}
				if (local185 > -1L && local234 > local185) {
					@Pc(321) int local321 = (int) (local234 - local185);
					Static367.method5383(arg0, (int) (local185 + (long) arg1 - this.aLong88), this.aByteArray38, (int) (local185 - this.aLong84), local321);
				}
				this.aLong88 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong87 == -1L) {
					this.aLong87 = this.aLong88;
				}
				Static367.method5383(arg0, arg1, this.aByteArray37, (int) (this.aLong88 - this.aLong87), arg2);
				this.aLong88 += arg2;
				if ((long) this.anInt2111 < this.aLong88 - this.aLong87) {
					this.anInt2111 = (int) (this.aLong88 - this.aLong87);
				}
			}
		} catch (@Pc(405) IOException local405) {
			this.aLong86 = -1L;
			throw local405;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)V")
	public void method1917(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1920());
		}
		this.aLong88 = arg0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BIII)V")
	public void method1918(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong87 != -1L && this.aLong88 >= this.aLong87 && (long) arg1 + this.aLong88 <= (long) this.anInt2111 + this.aLong87) {
				Static367.method5383(this.aByteArray37, (int) (this.aLong88 - this.aLong87), arg0, 0, arg1);
				this.aLong88 += arg1;
				return;
			}
			@Pc(74) long local74 = this.aLong88;
			@Pc(78) int local78 = arg1;
			@Pc(110) int local110;
			if (this.aLong88 >= this.aLong84 && this.aLong88 < this.aLong84 + (long) this.anInt2102) {
				local110 = (int) ((long) this.anInt2102 + this.aLong84 - this.aLong88);
				if (local110 > arg1) {
					local110 = arg1;
				}
				Static367.method5383(this.aByteArray38, (int) (this.aLong88 - this.aLong84), arg0, 0, local110);
				arg1 -= local110;
				arg2 = local110;
				this.aLong88 += local110;
			}
			if (arg1 > this.aByteArray38.length) {
				this.aClass99_1.method2726(this.aLong88);
				this.aLong86 = this.aLong88;
				while (arg1 > 0) {
					local110 = this.aClass99_1.method2724(arg0, arg2, arg1);
					if (local110 == -1) {
						break;
					}
					this.aLong86 += local110;
					this.aLong88 += local110;
					arg1 -= local110;
					arg2 += local110;
				}
			} else if (arg1 > 0) {
				this.method1923();
				local110 = arg1;
				if (arg1 > this.anInt2102) {
					local110 = this.anInt2102;
				}
				Static367.method5383(this.aByteArray38, 0, arg0, arg2, local110);
				this.aLong88 += local110;
				arg1 -= local110;
				arg2 += local110;
			}
			if ((long) -1 != this.aLong87) {
				if (this.aLong87 > this.aLong88 && arg1 > 0) {
					local110 = (int) (this.aLong87 - this.aLong88) + arg2;
					if (local110 > arg2 + arg1) {
						local110 = arg1 + arg2;
					}
					while (arg2 < local110) {
						arg1--;
						arg0[arg2++] = 0;
						this.aLong88++;
					}
				}
				@Pc(298) long local298 = -1L;
				if (this.aLong87 >= local74 && this.aLong87 < local74 + (long) local78) {
					local298 = this.aLong87;
				} else if (this.aLong87 <= local74 && local74 < (long) this.anInt2111 + this.aLong87) {
					local298 = local74;
				}
				@Pc(346) long local346 = -1L;
				if (this.aLong87 + (long) this.anInt2111 > local74 && (long) this.anInt2111 + this.aLong87 <= (long) local78 + local74) {
					local346 = (long) this.anInt2111 + this.aLong87;
				} else if (this.aLong87 < local74 + (long) local78 && (long) this.anInt2111 + this.aLong87 >= (long) local78 + local74) {
					local346 = local74 + (long) local78;
				}
				if (local298 > -1L && local298 < local346) {
					@Pc(427) int local427 = (int) (local346 - local298);
					Static367.method5383(this.aByteArray37, (int) (local298 - this.aLong87), arg0, (int) (local298 - local74), local427);
					if (this.aLong88 < local346) {
						arg1 = (int) ((long) arg1 + this.aLong88 - local346);
						this.aLong88 = local346;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong86 = -1L;
			throw local464;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)J")
	public long method1919() {
		return this.aLong85;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method1920() {
		return this.aClass99_1.method2721();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BI)V")
	public void method1921(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1918(arg0, arg0.length, 0);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
	private void method1923() throws IOException {
		this.anInt2102 = 0;
		if (this.aLong86 != this.aLong88) {
			this.aClass99_1.method2726(this.aLong88);
			this.aLong86 = this.aLong88;
		}
		this.aLong84 = this.aLong88;
		while (this.aByteArray38.length > this.anInt2102) {
			@Pc(42) int local42 = this.aByteArray38.length - this.anInt2102;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass99_1.method2724(this.aByteArray38, this.anInt2102, local42);
			if (local57 == -1) {
				break;
			}
			this.aLong86 += local57;
			this.anInt2102 += local57;
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	private void method1924() throws IOException {
		if ((long) -1 == this.aLong87) {
			return;
		}
		if (this.aLong87 != this.aLong86) {
			this.aClass99_1.method2726(this.aLong87);
			this.aLong86 = this.aLong87;
		}
		this.aClass99_1.method2723(0, this.anInt2111, this.aByteArray37);
		this.aLong86 += this.anInt2111;
		if (this.aLong86 > this.aLong89) {
			this.aLong89 = this.aLong86;
		}
		@Pc(62) long local62 = -1L;
		if (this.aLong84 <= this.aLong87 && this.aLong87 < this.aLong84 + (long) this.anInt2102) {
			local62 = this.aLong87;
		} else if (this.aLong84 >= this.aLong87 && this.aLong84 < (long) this.anInt2111 + this.aLong87) {
			local62 = this.aLong84;
		}
		@Pc(112) long local112 = -1L;
		if (this.aLong84 < (long) this.anInt2111 + this.aLong87 && this.aLong84 + (long) this.anInt2102 >= (long) this.anInt2111 + this.aLong87) {
			local112 = this.aLong87 + (long) this.anInt2111;
		} else if (this.aLong87 < this.aLong84 + (long) this.anInt2102 && this.aLong84 + (long) this.anInt2102 <= (long) this.anInt2111 + this.aLong87) {
			local112 = (long) this.anInt2102 + this.aLong84;
		}
		if (local62 > -1L && local62 < local112) {
			@Pc(203) int local203 = (int) (local112 - local62);
			Static367.method5383(this.aByteArray37, (int) (local62 - this.aLong87), this.aByteArray38, (int) (local62 - this.aLong84), local203);
		}
		this.anInt2111 = 0;
		this.aLong87 = -1L;
	}
}
