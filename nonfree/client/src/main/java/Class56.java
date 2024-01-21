import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class56 {

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	private int anInt2600;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "J")
	private long aLong89 = -1L;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	private int anInt2604 = 0;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "J")
	private long aLong94 = -1L;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Lclient!kh;")
	private final Class51 aClass51_1;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "J")
	private long aLong92;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "J")
	private long aLong93;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!kh;II)V")
	public Class56(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass51_1 = arg0;
		this.aLong91 = this.aLong92 = arg0.method1863();
		this.aByteArray28 = new byte[arg2];
		this.aLong93 = 0L;
		this.aByteArray29 = new byte[arg1];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)V")
	public void method1958(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if ((long) arg1 + this.aLong93 > this.aLong91) {
				this.aLong91 = this.aLong93 + (long) arg1;
			}
			if (this.aLong89 != -1L && (this.aLong93 < this.aLong89 || this.aLong93 > (long) this.anInt2604 + this.aLong89)) {
				this.method1959();
			}
			if (this.aLong89 != -1L && (long) arg1 + this.aLong93 > (long) this.aByteArray28.length + this.aLong89) {
				@Pc(92) int local92 = (int) ((long) this.aByteArray28.length + this.aLong89 - this.aLong93);
				Static189.method187(arg0, arg2, this.aByteArray28, (int) (this.aLong93 - this.aLong89), local92);
				arg1 -= local92;
				arg2 += local92;
				this.aLong93 += local92;
				this.anInt2604 = this.aByteArray28.length;
				this.method1959();
			}
			if (this.aByteArray28.length < arg1) {
				if (this.aLong90 != this.aLong93) {
					this.aClass51_1.method1862(this.aLong93);
					this.aLong90 = this.aLong93;
				}
				this.aClass51_1.method1867(arg2, arg1, arg0);
				@Pc(158) long local158 = -1L;
				if (this.aLong94 <= this.aLong93 && this.aLong94 + (long) this.anInt2600 > this.aLong93) {
					local158 = this.aLong93;
				} else if (this.aLong93 <= this.aLong94 && this.aLong93 + (long) arg1 > this.aLong94) {
					local158 = this.aLong94;
				}
				this.aLong90 += arg1;
				if (this.aLong92 < this.aLong90) {
					this.aLong92 = this.aLong90;
				}
				@Pc(232) long local232 = -1L;
				if ((long) arg1 + this.aLong93 > this.aLong94 && (long) this.anInt2600 + this.aLong94 >= this.aLong93 + (long) arg1) {
					local232 = this.aLong93 + (long) arg1;
				} else if (this.aLong93 < (long) this.anInt2600 + this.aLong94 && this.aLong94 + (long) this.anInt2600 <= this.aLong93 + (long) arg1) {
					local232 = (long) this.anInt2600 + this.aLong94;
				}
				if (local158 > -1L && local232 > local158) {
					@Pc(325) int local325 = (int) (local232 - local158);
					Static189.method187(arg0, (int) (local158 + (long) arg2 - this.aLong93), this.aByteArray29, (int) (local158 - this.aLong94), local325);
				}
				this.aLong93 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong89 == -1L) {
					this.aLong89 = this.aLong93;
				}
				Static189.method187(arg0, arg2, this.aByteArray28, (int) (this.aLong93 - this.aLong89), arg1);
				this.aLong93 += arg1;
				if ((long) this.anInt2604 < this.aLong93 - this.aLong89) {
					this.anInt2604 = (int) (this.aLong93 - this.aLong89);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong90 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	private void method1959() throws IOException {
		if (this.aLong89 == (long) -1) {
			return;
		}
		if (this.aLong90 != this.aLong89) {
			this.aClass51_1.method1862(this.aLong89);
			this.aLong90 = this.aLong89;
		}
		this.aClass51_1.method1867(0, this.anInt2604, this.aByteArray28);
		@Pc(34) long local34 = -1L;
		@Pc(36) long local36 = -1L;
		this.aLong90 += this.anInt2604;
		if (this.aLong94 < this.aLong89 + (long) this.anInt2604 && this.aLong89 + (long) this.anInt2604 <= this.aLong94 - -((long) this.anInt2600)) {
			local34 = (long) this.anInt2604 + this.aLong89;
		} else if (this.aLong94 + (long) this.anInt2600 > this.aLong89 && this.aLong94 + (long) this.anInt2600 <= this.aLong89 - -((long) this.anInt2604)) {
			local34 = this.aLong94 + (long) this.anInt2600;
		}
		if (this.aLong89 >= this.aLong94 && (long) this.anInt2600 + this.aLong94 > this.aLong89) {
			local36 = this.aLong89;
		} else if (this.aLong94 >= this.aLong89 && (long) this.anInt2604 + this.aLong89 > this.aLong94) {
			local36 = this.aLong94;
		}
		if (this.aLong92 < this.aLong90) {
			this.aLong92 = this.aLong90;
		}
		if (local36 > -1L && local34 > local36) {
			@Pc(194) int local194 = (int) (local34 - local36);
			Static189.method187(this.aByteArray28, (int) (local36 - this.aLong89), this.aByteArray29, (int) (local36 - this.aLong94), local194);
		}
		this.anInt2604 = 0;
		this.aLong89 = -1L;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)J")
	public long method1960() {
		return this.aLong91;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	private void method1961() throws IOException {
		this.anInt2600 = 0;
		if (this.aLong90 != this.aLong93) {
			this.aClass51_1.method1862(this.aLong93);
			this.aLong90 = this.aLong93;
		}
		this.aLong94 = this.aLong93;
		while (this.anInt2600 < this.aByteArray29.length) {
			@Pc(42) int local42 = this.aByteArray29.length - this.anInt2600;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass51_1.method1866(this.anInt2600, local42, this.aByteArray29);
			if (local57 == -1) {
				break;
			}
			this.aLong90 += local57;
			this.anInt2600 += local57;
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "([BIII)V")
	public void method1962(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong89 != -1L && this.aLong89 <= this.aLong93 && (long) this.anInt2604 + this.aLong89 >= (long) arg2 + this.aLong93) {
				Static189.method187(this.aByteArray28, (int) (this.aLong93 - this.aLong89), arg0, 0, arg2);
				this.aLong93 += arg2;
				return;
			}
			@Pc(80) long local80 = this.aLong93;
			@Pc(82) int local82 = arg2;
			@Pc(117) int local117;
			if (this.aLong93 >= this.aLong94 && this.aLong94 + (long) this.anInt2600 > this.aLong93) {
				local117 = (int) ((long) this.anInt2600 + this.aLong94 - this.aLong93);
				if (local117 > arg2) {
					local117 = arg2;
				}
				Static189.method187(this.aByteArray29, (int) (this.aLong93 - this.aLong94), arg0, 0, local117);
				this.aLong93 += local117;
				arg1 = local117;
				arg2 -= local117;
			}
			if (arg2 > this.aByteArray29.length) {
				this.aClass51_1.method1862(this.aLong93);
				this.aLong90 = this.aLong93;
				while (arg2 > 0) {
					local117 = this.aClass51_1.method1866(arg1, arg2, arg0);
					if (local117 == -1) {
						break;
					}
					arg2 -= local117;
					this.aLong93 += local117;
					arg1 += local117;
					this.aLong90 += local117;
				}
			} else if (arg2 > 0) {
				this.method1961();
				local117 = arg2;
				if (arg2 > this.anInt2600) {
					local117 = this.anInt2600;
				}
				Static189.method187(this.aByteArray29, 0, arg0, arg1, local117);
				arg2 -= local117;
				this.aLong93 += local117;
				arg1 += local117;
			}
			if (this.aLong89 != -1L) {
				if (this.aLong89 > this.aLong93 && arg2 > 0) {
					local117 = (int) (this.aLong89 - this.aLong93) + arg1;
					if (arg2 + arg1 < local117) {
						local117 = arg1 + arg2;
					}
					while (arg1 < local117) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong93++;
					}
				}
				@Pc(319) long local319 = -1L;
				if (local80 < this.aLong89 + (long) this.anInt2604 && (long) this.anInt2604 + this.aLong89 <= local80 - -((long) local82)) {
					local319 = (long) this.anInt2604 + this.aLong89;
				} else if ((long) local82 + local80 > this.aLong89 && (long) this.anInt2604 + this.aLong89 >= local80 + (long) local82) {
					local319 = local80 + (long) local82;
				}
				@Pc(390) long local390 = -1L;
				if (local80 <= this.aLong89 && local80 + (long) local82 > this.aLong89) {
					local390 = this.aLong89;
				} else if (this.aLong89 <= local80 && (long) this.anInt2604 + this.aLong89 > local80) {
					local390 = local80;
				}
				if (local390 > -1L && local390 < local319) {
					@Pc(452) int local452 = (int) (local319 - local390);
					Static189.method187(this.aByteArray28, (int) (local390 - this.aLong89), arg0, (int) (local390 - local80), local452);
					if (this.aLong93 < local319) {
						arg2 = (int) ((long) arg2 + this.aLong93 - local319);
						this.aLong93 = local319;
					}
				}
			}
		} catch (@Pc(491) IOException local491) {
			this.aLong90 = -1L;
			throw local491;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method1963() {
		return this.aClass51_1.method1864();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BI)V")
	public void method1964(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method1962(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
	public void method1965() throws IOException {
		this.method1959();
		this.aClass51_1.method1865();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IJ)V")
	public void method1966(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1963());
		}
		this.aLong93 = arg0;
	}
}
