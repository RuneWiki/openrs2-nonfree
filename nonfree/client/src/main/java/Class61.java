import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class61 {

	@OriginalMember(owner = "client!w", name = "e", descriptor = "J")
	private long aLong74;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "I")
	private int anInt2780;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "J")
	private long aLong77 = -1L;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "J")
	private long aLong78 = -1L;

	@OriginalMember(owner = "client!w", name = "G", descriptor = "I")
	private int anInt2781 = 0;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "Lclient!qb;")
	private final Class49 aClass49_3;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "[B")
	private final byte[] aByteArray24;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[B")
	private final byte[] aByteArray23;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "J")
	private long aLong73;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!qb;II)V")
	public Class61(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass49_3 = arg0;
		this.aLong75 = this.aLong76 = arg0.method1452();
		this.aByteArray24 = new byte[arg2];
		this.aByteArray23 = new byte[arg1];
		this.aLong73 = 0L;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BIIZ)V")
	public void method1734(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong78 != -1L && this.aLong78 <= this.aLong73 && this.aLong73 + (long) arg2 <= (long) this.anInt2781 + this.aLong78) {
				Static112.method991(this.aByteArray24, (int) (this.aLong73 - this.aLong78), arg0, 0, arg2);
				this.aLong73 += arg2;
				return;
			}
			@Pc(80) long local80 = this.aLong73;
			@Pc(88) int local88 = arg2;
			@Pc(121) int local121;
			if (this.aLong73 >= this.aLong77 && (long) this.anInt2780 + this.aLong77 > this.aLong73) {
				local121 = (int) ((long) this.anInt2780 + this.aLong77 - this.aLong73);
				if (local121 > arg2) {
					local121 = arg2;
				}
				Static112.method991(this.aByteArray23, (int) (this.aLong73 - this.aLong77), arg0, 0, local121);
				arg2 -= local121;
				arg1 = local121;
				this.aLong73 += local121;
			}
			if (this.aByteArray23.length < arg2) {
				this.aClass49_3.method1454(this.aLong73);
				this.aLong74 = this.aLong73;
				while (arg2 > 0) {
					local121 = this.aClass49_3.method1450(arg1, arg0, arg2);
					if (local121 == -1) {
						break;
					}
					arg2 -= local121;
					this.aLong74 += local121;
					this.aLong73 += local121;
					arg1 += local121;
				}
			} else if (arg2 > 0) {
				this.method1735();
				local121 = arg2;
				if (this.anInt2780 < arg2) {
					local121 = this.anInt2780;
				}
				arg2 -= local121;
				Static112.method991(this.aByteArray23, 0, arg0, arg1, local121);
				arg1 += local121;
				this.aLong73 += local121;
			}
			if (this.aLong78 != -1L) {
				if (this.aLong73 < this.aLong78 && arg2 > 0) {
					local121 = (int) (this.aLong78 - this.aLong73) + arg1;
					if (arg2 + arg1 < local121) {
						local121 = arg1 + arg2;
					}
					while (local121 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong73++;
					}
				}
				@Pc(310) long local310 = -1L;
				if (local80 <= this.aLong78 && this.aLong78 < (long) local88 + local80) {
					local310 = this.aLong78;
				} else if (local80 >= this.aLong78 && local80 < this.aLong78 + (long) this.anInt2781) {
					local310 = local80;
				}
				@Pc(354) long local354 = -1L;
				if (local80 < this.aLong78 + (long) this.anInt2781 && this.aLong78 + (long) this.anInt2781 <= (long) local88 + local80) {
					local354 = (long) this.anInt2781 + this.aLong78;
				} else if (this.aLong78 < (long) local88 + local80 && this.aLong78 + (long) this.anInt2781 >= local80 + (long) local88) {
					local354 = local80 + (long) local88;
				}
				if (local310 > -1L && local310 < local354) {
					@Pc(427) int local427 = (int) (local354 - local310);
					Static112.method991(this.aByteArray24, (int) (local310 - this.aLong78), arg0, (int) (local310 - local80), local427);
					if (local354 > this.aLong73) {
						arg2 = (int) ((long) arg2 + this.aLong73 - local354);
						this.aLong73 = local354;
					}
				}
			}
		} catch (@Pc(466) IOException local466) {
			this.aLong74 = -1L;
			throw local466;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	private void method1735() throws IOException {
		this.anInt2780 = 0;
		if (this.aLong74 != this.aLong73) {
			this.aClass49_3.method1454(this.aLong73);
			this.aLong74 = this.aLong73;
		}
		this.aLong77 = this.aLong73;
		while (this.aByteArray23.length > this.anInt2780) {
			@Pc(55) int local55 = this.aClass49_3.method1450(this.anInt2780, this.aByteArray23, this.aByteArray23.length - this.anInt2780);
			if (local55 == -1) {
				break;
			}
			this.aLong74 += local55;
			this.anInt2780 += local55;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public void method1737() throws IOException {
		this.method1739();
		this.aClass49_3.method1451();
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	private void method1739() throws IOException {
		if (this.aLong78 == -1L) {
			return;
		}
		if (this.aLong74 != this.aLong78) {
			this.aClass49_3.method1454(this.aLong78);
			this.aLong74 = this.aLong78;
		}
		@Pc(26) long local26 = -1L;
		@Pc(28) long local28 = -1L;
		this.aClass49_3.method1453(this.aByteArray24, this.anInt2781, 0);
		if ((long) this.anInt2781 + this.aLong78 > this.aLong77 && this.aLong77 + (long) this.anInt2780 >= (long) this.anInt2781 + this.aLong78) {
			local26 = this.aLong78 + (long) this.anInt2781;
		} else if (this.aLong77 + (long) this.anInt2780 > this.aLong78 && (long) this.anInt2781 + this.aLong78 >= this.aLong77 + (long) this.anInt2780) {
			local26 = (long) this.anInt2780 + this.aLong77;
		}
		if (this.aLong78 >= this.aLong77 && (long) this.anInt2780 + this.aLong77 > this.aLong78) {
			local28 = this.aLong78;
		} else if (this.aLong77 >= this.aLong78 && this.aLong77 < (long) this.anInt2781 + this.aLong78) {
			local28 = this.aLong77;
		}
		this.aLong74 += this.anInt2781;
		if (this.aLong74 > this.aLong76) {
			this.aLong76 = this.aLong74;
		}
		if (local28 > -1L && local26 > local28) {
			@Pc(190) int local190 = (int) (local26 - local28);
			Static112.method991(this.aByteArray24, (int) (local28 - this.aLong78), this.aByteArray23, (int) (local28 - this.aLong77), local190);
		}
		this.anInt2781 = 0;
		this.aLong78 = -1L;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BJ)V")
	public void method1740(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong73 = arg0;
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)J")
	public long method1741() {
		return this.aLong75;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I[BIZ)V")
	public void method1742(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong73 + (long) arg0 > this.aLong75) {
				this.aLong75 = (long) arg0 + this.aLong73;
			}
			if (this.aLong78 != -1L && (this.aLong78 > this.aLong73 || this.aLong73 > (long) this.anInt2781 + this.aLong78)) {
				this.method1739();
			}
			if (this.aLong78 != -1L && (long) arg0 + this.aLong73 > (long) this.aByteArray24.length + this.aLong78) {
				@Pc(101) int local101 = (int) (this.aLong78 + (long) this.aByteArray24.length - this.aLong73);
				Static112.method991(arg1, arg2, this.aByteArray24, (int) (this.aLong73 - this.aLong78), local101);
				this.aLong73 += local101;
				arg2 += local101;
				arg0 -= local101;
				this.anInt2781 = this.aByteArray24.length;
				this.method1739();
			}
			if (arg0 > this.aByteArray24.length) {
				if (this.aLong74 != this.aLong73) {
					this.aClass49_3.method1454(this.aLong73);
					this.aLong74 = this.aLong73;
				}
				@Pc(160) long local160 = -1L;
				@Pc(162) long local162 = -1L;
				this.aClass49_3.method1453(arg1, arg0, arg2);
				if (this.aLong77 < this.aLong73 + (long) arg0 && this.aLong73 + (long) arg0 <= this.aLong77 - -((long) this.anInt2780)) {
					local162 = (long) arg0 + this.aLong73;
				} else if (this.aLong73 < (long) this.anInt2780 + this.aLong77 && this.aLong77 + (long) this.anInt2780 <= this.aLong73 - -((long) arg0)) {
					local162 = this.aLong77 + (long) this.anInt2780;
				}
				if (this.aLong77 <= this.aLong73 && this.aLong73 < this.aLong77 + (long) this.anInt2780) {
					local160 = this.aLong73;
				} else if (this.aLong77 >= this.aLong73 && this.aLong73 + (long) arg0 > this.aLong77) {
					local160 = this.aLong77;
				}
				this.aLong74 += arg0;
				if (this.aLong74 > this.aLong76) {
					this.aLong76 = this.aLong74;
				}
				if (local160 > -1L && local162 > local160) {
					@Pc(333) int local333 = (int) (local162 - local160);
					Static112.method991(arg1, (int) ((long) arg2 + local160 - this.aLong73), this.aByteArray23, (int) (local160 - this.aLong77), local333);
				}
				this.aLong73 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong78 == -1L) {
					this.aLong78 = this.aLong73;
				}
				Static112.method991(arg1, arg2, this.aByteArray24, (int) (this.aLong73 - this.aLong78), arg0);
				this.aLong73 += arg0;
				if (this.aLong73 - this.aLong78 > (long) this.anInt2781) {
					this.anInt2781 = (int) (this.aLong73 - this.aLong78);
				}
			}
		} catch (@Pc(422) IOException local422) {
			this.aLong74 = -1L;
			throw local422;
		}
	}
}
