import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class193 {

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
	private int anInt5632;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "J")
	private long aLong132 = -1L;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "J")
	private long aLong133 = -1L;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	private int anInt5627 = 0;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "Lclient!fn;")
	private final Class108 aClass108_1;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "[B")
	private final byte[] aByteArray76;

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "[B")
	private final byte[] aByteArray75;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!fn;II)V")
	public Class193(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass108_1 = arg0;
		this.aLong136 = this.aLong134 = arg0.method2449();
		this.aByteArray76 = new byte[arg1];
		this.aByteArray75 = new byte[arg2];
		this.aLong137 = 0L;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	private void method4598() throws IOException {
		this.anInt5632 = 0;
		if (this.aLong137 != this.aLong135) {
			this.aClass108_1.method2450(this.aLong137);
			this.aLong135 = this.aLong137;
		}
		this.aLong133 = this.aLong137;
		while (this.anInt5632 < this.aByteArray76.length) {
			@Pc(50) int local50 = this.aByteArray76.length - this.anInt5632;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(67) int local67 = this.aClass108_1.method2451(this.anInt5632, local50, this.aByteArray76);
			if (local67 == -1) {
				break;
			}
			this.anInt5632 += local67;
			this.aLong135 += local67;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II[BZ)V")
	public void method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong136 < this.aLong137 + (long) arg0) {
				this.aLong136 = this.aLong137 + (long) arg0;
			}
			if (this.aLong132 != -1L && (this.aLong132 > this.aLong137 || (long) this.anInt5627 + this.aLong132 < this.aLong137)) {
				this.method4608();
			}
			if (this.aLong132 != -1L && (long) arg0 + this.aLong137 > this.aLong132 + (long) this.aByteArray75.length) {
				@Pc(78) int local78 = (int) (this.aLong132 + (long) this.aByteArray75.length - this.aLong137);
				Static596.method7719(arg2, arg1, this.aByteArray75, (int) (this.aLong137 - this.aLong132), local78);
				this.aLong137 += local78;
				arg1 += local78;
				arg0 -= local78;
				this.anInt5627 = this.aByteArray75.length;
				this.method4608();
			}
			if (this.aByteArray75.length < arg0) {
				if (this.aLong135 != this.aLong137) {
					this.aClass108_1.method2450(this.aLong137);
					this.aLong135 = this.aLong137;
				}
				this.aClass108_1.method2447(arg2, arg1, arg0);
				this.aLong135 += arg0;
				if (this.aLong135 > this.aLong134) {
					this.aLong134 = this.aLong135;
				}
				@Pc(169) long local169 = -1L;
				@Pc(171) long local171 = -1L;
				if (this.aLong137 >= this.aLong133 && this.aLong137 < this.aLong133 + (long) this.anInt5632) {
					local169 = this.aLong137;
				} else if (this.aLong133 >= this.aLong137 && this.aLong133 < (long) arg0 + this.aLong137) {
					local169 = this.aLong133;
				}
				if (this.aLong137 + (long) arg0 > this.aLong133 && this.aLong137 + (long) arg0 <= this.aLong133 + (long) this.anInt5632) {
					local171 = this.aLong137 + (long) arg0;
				} else if (this.aLong137 < (long) this.anInt5632 + this.aLong133 && (long) arg0 + this.aLong137 >= this.aLong133 - -((long) this.anInt5632)) {
					local171 = this.aLong133 + (long) this.anInt5632;
				}
				if (local169 > -1L && local169 < local171) {
					@Pc(299) int local299 = (int) (local171 - local169);
					Static596.method7719(arg2, (int) (local169 + (long) arg1 - this.aLong137), this.aByteArray76, (int) (local169 - this.aLong133), local299);
				}
				this.aLong137 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong132 == -1L) {
					this.aLong132 = this.aLong137;
				}
				Static596.method7719(arg2, arg1, this.aByteArray75, (int) (this.aLong137 - this.aLong132), arg0);
				this.aLong137 += arg0;
				if ((long) this.anInt5627 < this.aLong137 - this.aLong132) {
					this.anInt5627 = (int) (this.aLong137 - this.aLong132);
				}
			}
		} catch (@Pc(388) IOException local388) {
			this.aLong135 = -1L;
			throw local388;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method4601() {
		return this.aClass108_1.method2445();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B[B)V")
	public void method4602(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method4604(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)J")
	public long method4603() {
		return this.aLong136;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "([BIII)V")
	public void method4604(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong132 != -1L && this.aLong132 <= this.aLong137 && (long) arg2 + this.aLong137 <= this.aLong132 - -((long) this.anInt5627)) {
				Static596.method7719(this.aByteArray75, (int) (this.aLong137 - this.aLong132), arg0, 0, arg2);
				this.aLong137 += arg2;
				return;
			}
			@Pc(86) long local86 = this.aLong137;
			@Pc(90) int local90 = arg2;
			@Pc(118) int local118;
			if (this.aLong137 >= this.aLong133 && this.aLong137 < this.aLong133 + (long) this.anInt5632) {
				local118 = (int) (this.aLong133 + (long) this.anInt5632 - this.aLong137);
				if (local118 > arg2) {
					local118 = arg2;
				}
				Static596.method7719(this.aByteArray76, (int) (this.aLong137 - this.aLong133), arg0, 0, local118);
				this.aLong137 += local118;
				arg1 = local118;
				arg2 -= local118;
			}
			if (this.aByteArray76.length < arg2) {
				this.aClass108_1.method2450(this.aLong137);
				this.aLong135 = this.aLong137;
				while (arg2 > 0) {
					local118 = this.aClass108_1.method2451(arg1, arg2, arg0);
					if (local118 == -1) {
						break;
					}
					arg1 += local118;
					this.aLong135 += local118;
					this.aLong137 += local118;
					arg2 -= local118;
				}
			} else if (arg2 > 0) {
				this.method4598();
				local118 = arg2;
				if (this.anInt5632 < arg2) {
					local118 = this.anInt5632;
				}
				Static596.method7719(this.aByteArray76, 0, arg0, arg1, local118);
				this.aLong137 += local118;
				arg2 -= local118;
				arg1 += local118;
			}
			if (this.aLong132 != -1L) {
				if (this.aLong132 > this.aLong137 && arg2 > 0) {
					local118 = arg1 + (int) (this.aLong132 - this.aLong137);
					if (local118 > arg1 + arg2) {
						local118 = arg1 + arg2;
					}
					while (local118 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong137++;
					}
				}
				@Pc(316) long local316 = -1L;
				@Pc(318) long local318 = -1L;
				if (local86 <= this.aLong132 && local86 + (long) local90 > this.aLong132) {
					local316 = this.aLong132;
				} else if (local86 >= this.aLong132 && (long) this.anInt5627 + this.aLong132 > local86) {
					local316 = local86;
				}
				if (local86 < this.aLong132 + (long) this.anInt5627 && local86 + (long) local90 >= this.aLong132 + (long) this.anInt5627) {
					local318 = this.aLong132 + (long) this.anInt5627;
				} else if (this.aLong132 < local86 + (long) local90 && (long) this.anInt5627 + this.aLong132 >= (long) local90 + local86) {
					local318 = local86 + (long) local90;
				}
				if (local316 > -1L && local318 > local316) {
					@Pc(435) int local435 = (int) (local318 - local316);
					Static596.method7719(this.aByteArray75, (int) (local316 - this.aLong132), arg0, (int) (local316 - local86), local435);
					if (local318 > this.aLong137) {
						arg2 = (int) ((long) arg2 + this.aLong137 - local318);
						this.aLong137 = local318;
					}
				}
			}
		} catch (@Pc(478) IOException local478) {
			this.aLong135 = -1L;
			throw local478;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V")
	public void method4606() throws IOException {
		this.method4608();
		this.aClass108_1.method2453();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IJ)V")
	public void method4607(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < (long) 0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method4601());
		}
		this.aLong137 = arg0;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
	private void method4608() throws IOException {
		if (this.aLong132 == -1L) {
			return;
		}
		if (this.aLong135 != this.aLong132) {
			this.aClass108_1.method2450(this.aLong132);
			this.aLong135 = this.aLong132;
		}
		this.aClass108_1.method2447(this.aByteArray75, 0, this.anInt5627);
		this.aLong135 += this.anInt5627;
		if (this.aLong134 < this.aLong135) {
			this.aLong134 = this.aLong135;
		}
		@Pc(59) long local59 = -1L;
		if (this.aLong133 <= this.aLong132 && this.aLong132 < (long) this.anInt5632 + this.aLong133) {
			local59 = this.aLong132;
		} else if (this.aLong132 <= this.aLong133 && this.aLong133 < this.aLong132 + (long) this.anInt5627) {
			local59 = this.aLong133;
		}
		@Pc(113) long local113 = -1L;
		if (this.aLong133 < this.aLong132 + (long) this.anInt5627 && (long) this.anInt5632 + this.aLong133 >= (long) this.anInt5627 + this.aLong132) {
			local113 = (long) this.anInt5627 + this.aLong132;
		} else if ((long) this.anInt5632 + this.aLong133 > this.aLong132 && (long) this.anInt5627 + this.aLong132 >= this.aLong133 - -((long) this.anInt5632)) {
			local113 = this.aLong133 + (long) this.anInt5632;
		}
		if (local59 > -1L && local59 < local113) {
			@Pc(194) int local194 = (int) (local113 - local59);
			Static596.method7719(this.aByteArray75, (int) (local59 - this.aLong132), this.aByteArray76, (int) (local59 - this.aLong133), local194);
		}
		this.anInt5627 = 0;
		this.aLong132 = -1L;
	}
}
