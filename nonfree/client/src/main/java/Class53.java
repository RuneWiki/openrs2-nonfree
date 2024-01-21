import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class53 {

	@OriginalMember(owner = "client!r", name = "u", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	private int anInt2210;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "J")
	private long aLong64 = -1L;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	private int anInt2202 = 0;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "J")
	private long aLong69 = -1L;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "Lclient!qc;")
	private final Class52 aClass52_1;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[B")
	private final byte[] aByteArray10;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "[B")
	private final byte[] aByteArray11;

	@OriginalMember(owner = "client!r", name = "m", descriptor = "J")
	private long aLong66;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!qc;II)V")
	public Class53(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass52_1 = arg0;
		this.aLong67 = this.aLong65 = arg0.method1258();
		this.aByteArray10 = new byte[arg2];
		this.aByteArray11 = new byte[arg1];
		this.aLong66 = 0L;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	private void method1279() throws IOException {
		this.anInt2210 = 0;
		if (this.aLong66 != this.aLong68) {
			this.aClass52_1.method1262(this.aLong66);
			this.aLong68 = this.aLong66;
		}
		this.aLong64 = this.aLong66;
		while (this.aByteArray11.length > this.anInt2210) {
			@Pc(52) int local52 = this.aClass52_1.method1261(this.anInt2210, this.aByteArray11, this.aByteArray11.length - this.anInt2210);
			if (local52 == -1) {
				break;
			}
			this.aLong68 += local52;
			this.anInt2210 += local52;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public void method1280() throws IOException {
		this.method1286();
		this.aClass52_1.method1263();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V")
	public void method1285(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong66 = arg0;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	private void method1286() throws IOException {
		if (this.aLong69 == -1L) {
			return;
		}
		if (this.aLong69 != this.aLong68) {
			this.aClass52_1.method1262(this.aLong69);
			this.aLong68 = this.aLong69;
		}
		@Pc(37) long local37 = -1L;
		@Pc(39) long local39 = -1L;
		this.aClass52_1.method1260(this.anInt2202, this.aByteArray10, 0);
		if ((long) this.anInt2202 + this.aLong69 > this.aLong64 && this.aLong64 + (long) this.anInt2210 >= (long) this.anInt2202 + this.aLong69) {
			local39 = (long) this.anInt2202 + this.aLong69;
		} else if (this.aLong69 < this.aLong64 + (long) this.anInt2210 && this.aLong69 + (long) this.anInt2202 >= this.aLong64 + (long) this.anInt2210) {
			local39 = (long) this.anInt2210 + this.aLong64;
		}
		this.aLong68 += this.anInt2202;
		if (this.aLong65 < this.aLong68) {
			this.aLong65 = this.aLong68;
		}
		if (this.aLong69 >= this.aLong64 && this.aLong69 < this.aLong64 + (long) this.anInt2210) {
			local37 = this.aLong69;
		} else if (this.aLong69 <= this.aLong64 && this.aLong64 < this.aLong69 + (long) this.anInt2202) {
			local37 = this.aLong64;
		}
		if (local37 > -1L && local37 < local39) {
			@Pc(198) int local198 = (int) (local39 - local37);
			Static110.method560(this.aByteArray10, (int) (local37 - this.aLong69), this.aByteArray11, (int) (local37 - this.aLong64), local198);
		}
		this.anInt2202 = 0;
		this.aLong69 = -1L;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BIIZ)V")
	public void method1287(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (this.aLong67 < this.aLong66 + (long) arg2) {
				this.aLong67 = (long) arg2 + this.aLong66;
			}
			if (this.aLong69 != -1L && (this.aLong69 > this.aLong66 || this.aLong69 + (long) this.anInt2202 < this.aLong66)) {
				this.method1286();
			}
			if (this.aLong69 != -1L && this.aLong69 + (long) this.aByteArray10.length < this.aLong66 - -((long) arg2)) {
				@Pc(101) int local101 = (int) (this.aLong69 + (long) this.aByteArray10.length - this.aLong66);
				Static110.method560(arg0, arg1, this.aByteArray10, (int) (this.aLong66 - this.aLong69), local101);
				arg2 -= local101;
				this.aLong66 += local101;
				arg1 += local101;
				this.anInt2202 = this.aByteArray10.length;
				this.method1286();
			}
			if (this.aByteArray10.length < arg2) {
				if (this.aLong66 != this.aLong68) {
					this.aClass52_1.method1262(this.aLong66);
					this.aLong68 = this.aLong66;
				}
				this.aClass52_1.method1260(arg2, arg0, arg1);
				this.aLong68 += arg2;
				@Pc(178) long local178 = -1L;
				if (this.aLong65 < this.aLong68) {
					this.aLong65 = this.aLong68;
				}
				if (this.aLong66 >= this.aLong64 && this.aLong64 + (long) this.anInt2210 > this.aLong66) {
					local178 = this.aLong66;
				} else if (this.aLong64 >= this.aLong66 && this.aLong64 < this.aLong66 + (long) arg2) {
					local178 = this.aLong64;
				}
				@Pc(243) long local243 = -1L;
				if ((long) arg2 + this.aLong66 > this.aLong64 && this.aLong64 + (long) this.anInt2210 >= this.aLong66 - -((long) arg2)) {
					local243 = this.aLong66 + (long) arg2;
				} else if ((long) this.anInt2210 + this.aLong64 > this.aLong66 && (long) this.anInt2210 + this.aLong64 <= (long) arg2 + this.aLong66) {
					local243 = this.aLong64 + (long) this.anInt2210;
				}
				if (local178 > -1L && local243 > local178) {
					@Pc(334) int local334 = (int) (local243 - local178);
					Static110.method560(arg0, (int) ((long) arg1 + local178 - this.aLong66), this.aByteArray11, (int) (local178 - this.aLong64), local334);
				}
				this.aLong66 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong69 == -1L) {
					this.aLong69 = this.aLong66;
				}
				Static110.method560(arg0, arg1, this.aByteArray10, (int) (this.aLong66 - this.aLong69), arg2);
				this.aLong66 += arg2;
				if (this.aLong66 - this.aLong69 > (long) this.anInt2202) {
					this.anInt2202 = (int) (this.aLong66 - this.aLong69);
				}
			}
		} catch (@Pc(416) IOException local416) {
			this.aLong68 = -1L;
			throw local416;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[BI)V")
	public void method1288(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong69 != -1L && this.aLong66 >= this.aLong69 && (long) arg0 + this.aLong66 <= (long) this.anInt2202 + this.aLong69) {
				Static110.method560(this.aByteArray10, (int) (this.aLong66 - this.aLong69), arg1, 0, arg0);
				this.aLong66 += arg0;
				return;
			}
			@Pc(80) long local80 = this.aLong66;
			@Pc(82) int local82 = arg0;
			@Pc(119) int local119;
			if (this.aLong66 >= this.aLong64 && (long) this.anInt2210 + this.aLong64 > this.aLong66) {
				local119 = (int) (this.aLong64 + (long) this.anInt2210 - this.aLong66);
				if (arg0 < local119) {
					local119 = arg0;
				}
				arg0 -= local119;
				Static110.method560(this.aByteArray11, (int) (this.aLong66 - this.aLong64), arg1, 0, local119);
				arg2 = local119;
				this.aLong66 += local119;
			}
			if (arg0 > this.aByteArray11.length) {
				this.aClass52_1.method1262(this.aLong66);
				this.aLong68 = this.aLong66;
				while (arg0 > 0) {
					local119 = this.aClass52_1.method1261(arg2, arg1, arg0);
					if (local119 == -1) {
						break;
					}
					arg2 += local119;
					arg0 -= local119;
					this.aLong68 += local119;
					this.aLong66 += local119;
				}
			} else if (arg0 > 0) {
				this.method1279();
				local119 = arg0;
				if (this.anInt2210 < arg0) {
					local119 = this.anInt2210;
				}
				Static110.method560(this.aByteArray11, 0, arg1, arg2, local119);
				this.aLong66 += local119;
				arg0 -= local119;
				arg2 += local119;
			}
			if (this.aLong69 != -1L) {
				if (this.aLong69 > this.aLong66 && arg0 > 0) {
					local119 = (int) (this.aLong69 - this.aLong66) + arg2;
					if (arg0 + arg2 < local119) {
						local119 = arg2 + arg0;
					}
					while (arg2 < local119) {
						arg0--;
						arg1[arg2++] = 0;
						this.aLong66++;
					}
				}
				@Pc(312) long local312 = -1L;
				@Pc(314) long local314 = -1L;
				if (local80 <= this.aLong69 && local80 + (long) local82 > this.aLong69) {
					local312 = this.aLong69;
				} else if (local80 >= this.aLong69 && (long) this.anInt2202 + this.aLong69 > local80) {
					local312 = local80;
				}
				if (local80 < this.aLong69 + (long) this.anInt2202 && this.aLong69 + (long) this.anInt2202 <= local80 + (long) local82) {
					local314 = (long) this.anInt2202 + this.aLong69;
				} else if (this.aLong69 < (long) local82 + local80 && this.aLong69 + (long) this.anInt2202 >= local80 + (long) local82) {
					local314 = local80 + (long) local82;
				}
				if (local312 > -1L && local312 < local314) {
					@Pc(430) int local430 = (int) (local314 - local312);
					Static110.method560(this.aByteArray10, (int) (local312 - this.aLong69), arg1, (int) (local312 - local80), local430);
					if (local314 > this.aLong66) {
						arg0 = (int) ((long) arg0 + this.aLong66 - local314);
						this.aLong66 = local314;
					}
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong68 = -1L;
			throw local472;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)J")
	public long method1289() {
		return this.aLong67;
	}
}
