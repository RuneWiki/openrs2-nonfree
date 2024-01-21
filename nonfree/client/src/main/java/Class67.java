import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class67 {

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	private int anInt2877;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "J")
	private long aLong97 = -1L;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "J")
	private long aLong101 = -1L;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	private int anInt2873 = 0;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!pg;")
	private final Class80 aClass80_4;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "[B")
	private final byte[] aByteArray29;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "[B")
	private final byte[] aByteArray30;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!pg;II)V")
	public Class67(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass80_4 = arg0;
		this.aLong99 = this.aLong98 = arg0.method2325();
		this.aLong102 = 0L;
		this.aByteArray29 = new byte[arg2];
		this.aByteArray30 = new byte[arg1];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public void method2202() throws IOException {
		this.method2209();
		this.aClass80_4.method2322();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)J")
	public long method2204() {
		return this.aLong99;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method2206() {
		return this.aClass80_4.method2323();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([BB)V")
	public void method2207(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method2208(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIB[B)V")
	public void method2208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg2.length);
			}
			if (this.aLong101 != -1L && this.aLong101 <= this.aLong102 && (long) arg0 + this.aLong102 <= (long) this.anInt2873 + this.aLong101) {
				Static222.method2224(this.aByteArray29, (int) (this.aLong102 - this.aLong101), arg2, 0, arg0);
				this.aLong102 += arg0;
				return;
			}
			@Pc(82) long local82 = this.aLong102;
			@Pc(86) int local86 = arg0;
			@Pc(119) int local119;
			if (this.aLong97 <= this.aLong102 && this.aLong102 < (long) this.anInt2877 + this.aLong97) {
				local119 = (int) ((long) this.anInt2877 + this.aLong97 - this.aLong102);
				if (arg0 < local119) {
					local119 = arg0;
				}
				arg0 -= local119;
				Static222.method2224(this.aByteArray30, (int) (this.aLong102 - this.aLong97), arg2, 0, local119);
				this.aLong102 += local119;
				arg1 = local119;
			}
			if (this.aByteArray30.length < arg0) {
				this.aClass80_4.method2324(this.aLong102);
				this.aLong100 = this.aLong102;
				while (arg0 > 0) {
					local119 = this.aClass80_4.method2321(arg0, arg1, arg2);
					if (local119 == -1) {
						break;
					}
					this.aLong100 += local119;
					this.aLong102 += local119;
					arg1 += local119;
					arg0 -= local119;
				}
			} else if (arg0 > 0) {
				this.method2210();
				local119 = arg0;
				if (arg0 > this.anInt2877) {
					local119 = this.anInt2877;
				}
				Static222.method2224(this.aByteArray30, 0, arg2, arg1, local119);
				arg1 += local119;
				arg0 -= local119;
				this.aLong102 += local119;
			}
			if (this.aLong101 != -1L) {
				if (this.aLong102 < this.aLong101 && arg0 > 0) {
					local119 = arg1 + (int) (this.aLong101 - this.aLong102);
					if (local119 > arg0 + arg1) {
						local119 = arg1 + arg0;
					}
					while (arg1 < local119) {
						arg2[arg1++] = 0;
						this.aLong102++;
						arg0--;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if (this.aLong101 >= local82 && this.aLong101 < (long) local86 + local82) {
					local306 = this.aLong101;
				} else if (local82 >= this.aLong101 && (long) this.anInt2873 + this.aLong101 > local82) {
					local306 = local82;
				}
				if (local82 < (long) this.anInt2873 + this.aLong101 && (long) this.anInt2873 + this.aLong101 <= local82 - -((long) local86)) {
					local308 = (long) this.anInt2873 + this.aLong101;
				} else if ((long) local86 + local82 > this.aLong101 && (long) this.anInt2873 + this.aLong101 >= local82 - -((long) local86)) {
					local308 = (long) local86 + local82;
				}
				if (local306 > -1L && local308 > local306) {
					@Pc(426) int local426 = (int) (local308 - local306);
					Static222.method2224(this.aByteArray29, (int) (local306 - this.aLong101), arg2, (int) (local306 - local82), local426);
					if (local308 > this.aLong102) {
						arg0 = (int) ((long) arg0 + this.aLong102 - local308);
						this.aLong102 = local308;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong100 = -1L;
			throw local467;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	private void method2209() throws IOException {
		if (this.aLong101 == -1L) {
			return;
		}
		if (this.aLong101 != this.aLong100) {
			this.aClass80_4.method2324(this.aLong101);
			this.aLong100 = this.aLong101;
		}
		@Pc(34) long local34 = -1L;
		this.aClass80_4.method2320(this.anInt2873, this.aByteArray29, 0);
		this.aLong100 += this.anInt2873;
		if (this.aLong97 <= this.aLong101 && this.aLong101 < this.aLong97 + (long) this.anInt2877) {
			local34 = this.aLong101;
		} else if (this.aLong97 >= this.aLong101 && (long) this.anInt2873 + this.aLong101 > this.aLong97) {
			local34 = this.aLong97;
		}
		if (this.aLong98 < this.aLong100) {
			this.aLong98 = this.aLong100;
		}
		@Pc(112) long local112 = -1L;
		if ((long) this.anInt2873 + this.aLong101 > this.aLong97 && this.aLong97 + (long) this.anInt2877 >= this.aLong101 - -((long) this.anInt2873)) {
			local112 = (long) this.anInt2873 + this.aLong101;
		} else if (this.aLong97 + (long) this.anInt2877 > this.aLong101 && (long) this.anInt2877 + this.aLong97 <= (long) this.anInt2873 + this.aLong101) {
			local112 = (long) this.anInt2877 + this.aLong97;
		}
		if (local34 > -1L && local34 < local112) {
			@Pc(204) int local204 = (int) (local112 - local34);
			Static222.method2224(this.aByteArray29, (int) (local34 - this.aLong101), this.aByteArray30, (int) (local34 - this.aLong97), local204);
		}
		this.aLong101 = -1L;
		this.anInt2873 = 0;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	private void method2210() throws IOException {
		this.anInt2877 = 0;
		if (this.aLong100 != this.aLong102) {
			this.aClass80_4.method2324(this.aLong102);
			this.aLong100 = this.aLong102;
		}
		this.aLong97 = this.aLong102;
		while (this.anInt2877 < this.aByteArray30.length) {
			@Pc(38) int local38 = this.aByteArray30.length - this.anInt2877;
			if (local38 > 200000000) {
				local38 = 200000000;
			}
			@Pc(55) int local55 = this.aClass80_4.method2321(local38, this.anInt2877, this.aByteArray30);
			if (local55 == -1) {
				break;
			}
			this.aLong100 += local55;
			this.anInt2877 += local55;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z[BII)V")
	public void method2212(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong102 + (long) arg2 > this.aLong99) {
				this.aLong99 = (long) arg2 + this.aLong102;
			}
			if (this.aLong101 != -1L && (this.aLong102 < this.aLong101 || this.aLong101 + (long) this.anInt2873 < this.aLong102)) {
				this.method2209();
			}
			if (this.aLong101 != -1L && (long) this.aByteArray29.length + this.aLong101 < this.aLong102 + (long) arg2) {
				@Pc(101) int local101 = (int) (this.aLong101 + (long) this.aByteArray29.length - this.aLong102);
				arg2 -= local101;
				Static222.method2224(arg0, arg1, this.aByteArray29, (int) (this.aLong102 - this.aLong101), local101);
				arg1 += local101;
				this.aLong102 += local101;
				this.anInt2873 = this.aByteArray29.length;
				this.method2209();
			}
			if (arg2 > this.aByteArray29.length) {
				@Pc(144) long local144 = -1L;
				if (this.aLong102 != this.aLong100) {
					this.aClass80_4.method2324(this.aLong102);
					this.aLong100 = this.aLong102;
				}
				@Pc(162) long local162 = -1L;
				this.aClass80_4.method2320(arg2, arg0, arg1);
				if (this.aLong102 + (long) arg2 > this.aLong97 && (long) arg2 + this.aLong102 <= (long) this.anInt2877 + this.aLong97) {
					local162 = this.aLong102 + (long) arg2;
				} else if (this.aLong102 < (long) this.anInt2877 + this.aLong97 && this.aLong97 + (long) this.anInt2877 <= (long) arg2 + this.aLong102) {
					local162 = (long) this.anInt2877 + this.aLong97;
				}
				this.aLong100 += arg2;
				if (this.aLong102 >= this.aLong97 && (long) this.anInt2877 + this.aLong97 > this.aLong102) {
					local144 = this.aLong102;
				} else if (this.aLong102 <= this.aLong97 && this.aLong102 + (long) arg2 > this.aLong97) {
					local144 = this.aLong97;
				}
				if (this.aLong100 > this.aLong98) {
					this.aLong98 = this.aLong100;
				}
				if (local144 > -1L && local144 < local162) {
					@Pc(324) int local324 = (int) (local162 - local144);
					Static222.method2224(arg0, (int) (local144 + (long) arg1 - this.aLong102), this.aByteArray30, (int) (local144 - this.aLong97), local324);
				}
				this.aLong102 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong101 == -1L) {
					this.aLong101 = this.aLong102;
				}
				Static222.method2224(arg0, arg1, this.aByteArray29, (int) (this.aLong102 - this.aLong101), arg2);
				this.aLong102 += arg2;
				if ((long) this.anInt2873 < this.aLong102 - this.aLong101) {
					this.anInt2873 = (int) (this.aLong102 - this.aLong101);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong100 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BJ)V")
	public void method2215(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2206());
		}
		this.aLong102 = arg0;
	}
}
