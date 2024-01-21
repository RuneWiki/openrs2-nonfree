import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class8 {

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt333 = 0;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "J")
	private long aLong16 = -1L;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "J")
	private long aLong14 = -1L;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!ne;")
	private final Class53 aClass53_1;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!ne;II)V")
	public Class8(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass53_1 = arg0;
		this.aLong12 = this.aLong13 = arg0.method1240();
		this.aByteArray1 = new byte[arg2];
		this.aLong11 = 0L;
		this.aByteArray2 = new byte[arg1];
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	private void method219() throws IOException {
		this.anInt340 = 0;
		if (this.aLong11 != this.aLong15) {
			this.aClass53_1.method1243(this.aLong11);
			this.aLong15 = this.aLong11;
		}
		this.aLong16 = this.aLong11;
		while (this.aByteArray2.length > this.anInt340) {
			@Pc(53) int local53 = this.aClass53_1.method1241(this.aByteArray2, this.anInt340, this.aByteArray2.length - this.anInt340);
			if (local53 == -1) {
				break;
			}
			this.aLong15 += local53;
			this.anInt340 += local53;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIII)V")
	public void method220(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong14 != -1L && this.aLong11 >= this.aLong14 && (long) this.anInt333 + this.aLong14 >= (long) arg2 + this.aLong11) {
				Static124.method523(this.aByteArray1, (int) (this.aLong11 - this.aLong14), arg0, 0, arg2);
				this.aLong11 += arg2;
				return;
			}
			@Pc(81) long local81 = this.aLong11;
			@Pc(85) int local85 = arg2;
			@Pc(116) int local116;
			if (this.aLong16 <= this.aLong11 && this.aLong11 < this.aLong16 + (long) this.anInt340) {
				local116 = (int) (this.aLong16 + (long) this.anInt340 - this.aLong11);
				if (arg2 < local116) {
					local116 = arg2;
				}
				arg2 -= local116;
				Static124.method523(this.aByteArray2, (int) (this.aLong11 - this.aLong16), arg0, 0, local116);
				arg1 = local116;
				this.aLong11 += local116;
			}
			if (arg2 > this.aByteArray2.length) {
				this.aClass53_1.method1243(this.aLong11);
				this.aLong15 = this.aLong11;
				while (arg2 > 0) {
					local116 = this.aClass53_1.method1241(arg0, arg1, arg2);
					if (local116 == -1) {
						break;
					}
					this.aLong15 += local116;
					arg2 -= local116;
					arg1 += local116;
					this.aLong11 += local116;
				}
			} else if (arg2 > 0) {
				this.method219();
				local116 = arg2;
				if (this.anInt340 < arg2) {
					local116 = this.anInt340;
				}
				Static124.method523(this.aByteArray2, 0, arg0, arg1, local116);
				arg1 += local116;
				arg2 -= local116;
				this.aLong11 += local116;
			}
			if (this.aLong14 != -1L) {
				if (this.aLong11 < this.aLong14 && arg2 > 0) {
					local116 = arg1 + (int) (this.aLong14 - this.aLong11);
					if (local116 > arg1 + arg2) {
						local116 = arg2 + arg1;
					}
					while (arg1 < local116) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong11++;
					}
				}
				@Pc(313) long local313 = -1L;
				@Pc(315) long local315 = -1L;
				if (this.aLong14 >= local81 && (long) local85 + local81 > this.aLong14) {
					local315 = this.aLong14;
				} else if (local81 >= this.aLong14 && local81 < (long) this.anInt333 + this.aLong14) {
					local315 = local81;
				}
				if (local81 < (long) this.anInt333 + this.aLong14 && local81 + (long) local85 >= (long) this.anInt333 + this.aLong14) {
					local313 = (long) this.anInt333 + this.aLong14;
				} else if (this.aLong14 < (long) local85 + local81 && this.aLong14 + (long) this.anInt333 >= (long) local85 + local81) {
					local313 = local81 + (long) local85;
				}
				if (local315 > -1L && local315 < local313) {
					@Pc(440) int local440 = (int) (local313 - local315);
					Static124.method523(this.aByteArray1, (int) (local315 - this.aLong14), arg0, (int) (local315 - local81), local440);
					if (local313 > this.aLong11) {
						arg2 = (int) ((long) arg2 + this.aLong11 - local313);
						this.aLong11 = local313;
					}
				}
			}
		} catch (@Pc(478) IOException local478) {
			this.aLong15 = -1L;
			throw local478;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JB)V")
	public void method222(@OriginalArg(0) long arg0) {
		if (arg0 >= 0L) {
			this.aLong11 = arg0;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)J")
	public long method223() {
		return this.aLong12;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[BI)V")
	public void method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong11 + (long) arg0 > this.aLong12) {
				this.aLong12 = (long) arg0 + this.aLong11;
			}
			if (this.aLong14 != -1L && (this.aLong14 > this.aLong11 || (long) this.anInt333 + this.aLong14 < this.aLong11)) {
				this.method228();
			}
			if (this.aLong14 != -1L && this.aLong11 + (long) arg0 > (long) this.aByteArray1.length + this.aLong14) {
				@Pc(99) int local99 = (int) (this.aLong14 + (long) this.aByteArray1.length - this.aLong11);
				arg0 -= local99;
				Static124.method523(arg2, arg1, this.aByteArray1, (int) (this.aLong11 - this.aLong14), local99);
				this.aLong11 += local99;
				arg1 += local99;
				this.anInt333 = this.aByteArray1.length;
				this.method228();
			}
			if (this.aByteArray1.length < arg0) {
				if (this.aLong11 != this.aLong15) {
					this.aClass53_1.method1243(this.aLong11);
					this.aLong15 = this.aLong11;
				}
				this.aClass53_1.method1238(arg0, arg2, arg1);
				this.aLong15 += arg0;
				@Pc(171) long local171 = -1L;
				@Pc(173) long local173 = -1L;
				if (this.aLong13 < this.aLong15) {
					this.aLong13 = this.aLong15;
				}
				if (this.aLong11 >= this.aLong16 && this.aLong11 < this.aLong16 + (long) this.anInt340) {
					local171 = this.aLong11;
				} else if (this.aLong11 <= this.aLong16 && (long) arg0 + this.aLong11 > this.aLong16) {
					local171 = this.aLong16;
				}
				if ((long) arg0 + this.aLong11 > this.aLong16 && (long) arg0 + this.aLong11 <= this.aLong16 + (long) this.anInt340) {
					local173 = this.aLong11 + (long) arg0;
				} else if (this.aLong16 + (long) this.anInt340 > this.aLong11 && (long) this.anInt340 + this.aLong16 <= this.aLong11 - -((long) arg0)) {
					local173 = this.aLong16 + (long) this.anInt340;
				}
				if (local171 > -1L && local171 < local173) {
					@Pc(310) int local310 = (int) (local173 - local171);
					Static124.method523(arg2, (int) ((long) arg1 + local171 - this.aLong11), this.aByteArray2, (int) (local171 - this.aLong16), local310);
				}
				this.aLong11 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong14 == -1L) {
					this.aLong14 = this.aLong11;
				}
				Static124.method523(arg2, arg1, this.aByteArray1, (int) (this.aLong11 - this.aLong14), arg0);
				this.aLong11 += arg0;
				if (this.aLong11 - this.aLong14 > (long) this.anInt333) {
					this.anInt333 = (int) (this.aLong11 - this.aLong14);
				}
			}
		} catch (@Pc(396) IOException local396) {
			this.aLong15 = -1L;
			throw local396;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public void method226() throws IOException {
		this.method228();
		this.aClass53_1.method1239();
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
	private void method228() throws IOException {
		if (this.aLong14 == -1L) {
			return;
		}
		if (this.aLong14 != this.aLong15) {
			this.aClass53_1.method1243(this.aLong14);
			this.aLong15 = this.aLong14;
		}
		this.aClass53_1.method1238(this.anInt333, this.aByteArray1, 0);
		this.aLong15 += this.anInt333;
		@Pc(58) long local58 = -1L;
		if (this.aLong16 <= this.aLong14 && this.aLong14 < (long) this.anInt340 + this.aLong16) {
			local58 = this.aLong14;
		} else if (this.aLong14 <= this.aLong16 && this.aLong14 + (long) this.anInt333 > this.aLong16) {
			local58 = this.aLong16;
		}
		if (this.aLong13 < this.aLong15) {
			this.aLong13 = this.aLong15;
		}
		@Pc(122) long local122 = -1L;
		if (this.aLong16 < (long) this.anInt333 + this.aLong14 && (long) this.anInt333 + this.aLong14 <= this.aLong16 + (long) this.anInt340) {
			local122 = this.aLong14 + (long) this.anInt333;
		} else if (this.aLong14 < (long) this.anInt340 + this.aLong16 && this.aLong16 + (long) this.anInt340 <= this.aLong14 + (long) this.anInt333) {
			local122 = this.aLong16 + (long) this.anInt340;
		}
		if (local58 > -1L && local58 < local122) {
			@Pc(218) int local218 = (int) (local122 - local58);
			Static124.method523(this.aByteArray1, (int) (local58 - this.aLong14), this.aByteArray2, (int) (local58 - this.aLong16), local218);
		}
		this.anInt333 = 0;
		this.aLong14 = -1L;
	}
}
