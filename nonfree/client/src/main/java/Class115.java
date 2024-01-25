import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class115 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	private int anInt2863;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "J")
	private long aLong100 = -1L;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "J")
	private long aLong101 = -1L;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	private int anInt2872 = 0;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!st;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "[B")
	private final byte[] aByteArray32;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!st;II)V")
	public Class115(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass235_1 = arg0;
		this.aLong102 = this.aLong103 = arg0.method4941();
		this.aLong99 = 0L;
		this.aByteArray31 = new byte[arg2];
		this.aByteArray32 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	private void method2287() throws IOException {
		if (this.aLong100 == -1L) {
			return;
		}
		if (this.aLong104 != this.aLong100) {
			this.aClass235_1.method4939(this.aLong100);
			this.aLong104 = this.aLong100;
		}
		this.aClass235_1.method4943(0, this.anInt2872, this.aByteArray31);
		this.aLong104 += this.anInt2872;
		if (this.aLong104 > this.aLong103) {
			this.aLong103 = this.aLong104;
		}
		@Pc(65) long local65 = -1L;
		@Pc(67) long local67 = -1L;
		if (this.aLong100 >= this.aLong101 && this.aLong100 < this.aLong101 + (long) this.anInt2863) {
			local65 = this.aLong100;
		} else if (this.aLong100 <= this.aLong101 && this.aLong101 < (long) this.anInt2872 + this.aLong100) {
			local65 = this.aLong101;
		}
		if ((long) this.anInt2872 + this.aLong100 > this.aLong101 && this.aLong101 + (long) this.anInt2863 >= this.aLong100 + (long) this.anInt2872) {
			local67 = this.aLong100 + (long) this.anInt2872;
		} else if ((long) this.anInt2863 + this.aLong101 > this.aLong100 && this.aLong100 + (long) this.anInt2872 >= this.aLong101 + (long) this.anInt2863) {
			local67 = this.aLong101 + (long) this.anInt2863;
		}
		if (local65 > -1L && local67 > local65) {
			@Pc(199) int local199 = (int) (local67 - local65);
			Static471.method3062(this.aByteArray31, (int) (local65 - this.aLong100), this.aByteArray32, (int) (local65 - this.aLong101), local199);
		}
		this.aLong100 = -1L;
		this.anInt2872 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI[BI)V")
	public void method2288(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong100 != -1L && this.aLong100 <= this.aLong99 && (long) arg2 + this.aLong99 <= (long) this.anInt2872 + this.aLong100) {
				Static471.method3062(this.aByteArray31, (int) (this.aLong99 - this.aLong100), arg1, 0, arg2);
				this.aLong99 += arg2;
				return;
			}
			@Pc(71) long local71 = this.aLong99;
			@Pc(81) int local81 = arg2;
			@Pc(118) int local118;
			if (this.aLong101 <= this.aLong99 && this.aLong99 < (long) this.anInt2863 + this.aLong101) {
				local118 = (int) (this.aLong101 + (long) this.anInt2863 - this.aLong99);
				if (local118 > arg2) {
					local118 = arg2;
				}
				Static471.method3062(this.aByteArray32, (int) (this.aLong99 - this.aLong101), arg1, 0, local118);
				arg2 -= local118;
				arg0 = local118;
				this.aLong99 += local118;
			}
			if (arg2 > this.aByteArray32.length) {
				this.aClass235_1.method4939(this.aLong99);
				this.aLong104 = this.aLong99;
				while (arg2 > 0) {
					local118 = this.aClass235_1.method4940(arg0, arg1, arg2);
					if (local118 == -1) {
						break;
					}
					arg2 -= local118;
					this.aLong104 += local118;
					this.aLong99 += local118;
					arg0 += local118;
				}
			} else if (arg2 > 0) {
				this.method2291();
				local118 = arg2;
				if (arg2 > this.anInt2863) {
					local118 = this.anInt2863;
				}
				Static471.method3062(this.aByteArray32, 0, arg1, arg0, local118);
				arg0 += local118;
				this.aLong99 += local118;
				arg2 -= local118;
			}
			if (this.aLong100 != -1L) {
				if (this.aLong99 < this.aLong100 && arg2 > 0) {
					local118 = arg0 + (int) (this.aLong100 - this.aLong99);
					if (local118 > arg2 + arg0) {
						local118 = arg2 + arg0;
					}
					while (local118 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong99++;
					}
				}
				@Pc(310) long local310 = -1L;
				@Pc(312) long local312 = -1L;
				if (local71 <= this.aLong100 && (long) local81 + local71 > this.aLong100) {
					local310 = this.aLong100;
				} else if (this.aLong100 <= local71 && this.aLong100 + (long) this.anInt2872 > local71) {
					local310 = local71;
				}
				if ((long) this.anInt2872 + this.aLong100 > local71 && this.aLong100 + (long) this.anInt2872 <= local71 + (long) local81) {
					local312 = this.aLong100 + (long) this.anInt2872;
				} else if (this.aLong100 < local71 + (long) local81 && (long) this.anInt2872 + this.aLong100 >= local71 - -((long) local81)) {
					local312 = (long) local81 + local71;
				}
				if (local310 > -1L && local312 > local310) {
					@Pc(449) int local449 = (int) (local312 - local310);
					Static471.method3062(this.aByteArray31, (int) (local310 - this.aLong100), arg1, (int) (local310 - local71), local449);
					if (local312 > this.aLong99) {
						arg2 = (int) ((long) arg2 + this.aLong99 - local312);
						this.aLong99 = local312;
					}
				}
			}
		} catch (@Pc(490) IOException local490) {
			this.aLong104 = -1L;
			throw local490;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[BI)V")
	public void method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong102 < this.aLong99 + (long) arg0) {
				this.aLong102 = this.aLong99 + (long) arg0;
			}
			if (this.aLong100 != -1L && (this.aLong99 < this.aLong100 || (long) this.anInt2872 + this.aLong100 < this.aLong99)) {
				this.method2287();
			}
			if ((long) -1 != this.aLong100 && (long) this.aByteArray31.length + this.aLong100 < this.aLong99 + (long) arg0) {
				@Pc(89) int local89 = (int) (this.aLong100 + (long) this.aByteArray31.length - this.aLong99);
				Static471.method3062(arg2, arg1, this.aByteArray31, (int) (this.aLong99 - this.aLong100), local89);
				this.aLong99 += local89;
				arg0 -= local89;
				arg1 += local89;
				this.anInt2872 = this.aByteArray31.length;
				this.method2287();
			}
			if (arg0 > this.aByteArray31.length) {
				if (this.aLong104 != this.aLong99) {
					this.aClass235_1.method4939(this.aLong99);
					this.aLong104 = this.aLong99;
				}
				this.aClass235_1.method4943(arg1, arg0, arg2);
				this.aLong104 += arg0;
				if (this.aLong103 < this.aLong104) {
					this.aLong103 = this.aLong104;
				}
				@Pc(180) long local180 = -1L;
				if (this.aLong101 <= this.aLong99 && (long) this.anInt2863 + this.aLong101 > this.aLong99) {
					local180 = this.aLong99;
				} else if (this.aLong101 >= this.aLong99 && this.aLong99 + (long) arg0 > this.aLong101) {
					local180 = this.aLong101;
				}
				@Pc(237) long local237 = -1L;
				if ((long) arg0 + this.aLong99 > this.aLong101 && this.aLong99 + (long) arg0 <= (long) this.anInt2863 + this.aLong101) {
					local237 = this.aLong99 + (long) arg0;
				} else if (this.aLong101 + (long) this.anInt2863 > this.aLong99 && this.aLong101 + (long) this.anInt2863 <= this.aLong99 - -((long) arg0)) {
					local237 = this.aLong101 + (long) this.anInt2863;
				}
				if (local180 > -1L && local237 > local180) {
					@Pc(328) int local328 = (int) (local237 - local180);
					Static471.method3062(arg2, (int) ((long) arg1 + local180 - this.aLong99), this.aByteArray32, (int) (local180 - this.aLong101), local328);
				}
				this.aLong99 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong100 == -1L) {
					this.aLong100 = this.aLong99;
				}
				Static471.method3062(arg2, arg1, this.aByteArray31, (int) (this.aLong99 - this.aLong100), arg0);
				this.aLong99 += arg0;
				if ((long) this.anInt2872 < this.aLong99 - this.aLong100) {
					this.anInt2872 = (int) (this.aLong99 - this.aLong100);
				}
			}
		} catch (@Pc(414) IOException local414) {
			this.aLong104 = -1L;
			throw local414;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Ljava/io/File;")
	private File method2290() {
		return this.aClass235_1.method4944();
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	private void method2291() throws IOException {
		this.anInt2863 = 0;
		if (this.aLong104 != this.aLong99) {
			this.aClass235_1.method4939(this.aLong99);
			this.aLong104 = this.aLong99;
		}
		this.aLong101 = this.aLong99;
		while (this.anInt2863 < this.aByteArray32.length) {
			@Pc(45) int local45 = this.aByteArray32.length - this.anInt2863;
			if (local45 > 200000000) {
				local45 = 200000000;
			}
			@Pc(62) int local62 = this.aClass235_1.method4940(this.anInt2863, this.aByteArray32, local45);
			if (local62 == -1) {
				break;
			}
			this.anInt2863 += local62;
			this.aLong104 += local62;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
	public void method2293(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2288(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(JI)V")
	public void method2294(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2290());
		}
		this.aLong99 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)J")
	public long method2295() {
		return this.aLong102;
	}
}
