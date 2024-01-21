import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class70 {

	@OriginalMember(owner = "client!r", name = "F", descriptor = "[I")
	public static int[] anIntArray289 = new int[99];

	@OriginalMember(owner = "client!r", name = "l", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	private int anInt2235;

	@OriginalMember(owner = "client!r", name = "s", descriptor = "J")
	private long aLong72 = -1L;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	private int anInt2241 = 0;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "J")
	private long aLong73 = -1L;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "Lclient!oa;")
	private final Class59 aClass59_4;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!r", name = "x", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "[B")
	private final byte[] aByteArray30;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "J")
	private long aLong70;

	static {
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < 99; local24++) {
			@Pc(29) int local29 = local24 + 1;
			@Pc(42) int local42 = (int) ((double) local29 + Math.pow(2.0D, (double) local29 / 7.0D) * 300.0D);
			local22 += local42;
			anIntArray289[local24] = local22 / 4;
		}
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lclient!oa;II)V")
	public Class70(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass59_4 = arg0;
		this.aLong71 = this.aLong68 = arg0.method1324();
		this.aByteArray31 = new byte[arg1];
		this.aByteArray30 = new byte[arg2];
		this.aLong70 = 0L;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	private void method1603() throws IOException {
		if (this.aLong72 == -1L) {
			return;
		}
		@Pc(21) long local21 = -1L;
		if (this.aLong72 != this.aLong69) {
			this.aClass59_4.method1322(this.aLong72);
			this.aLong69 = this.aLong72;
		}
		this.aClass59_4.method1320(this.anInt2241, this.aByteArray30, 0);
		this.aLong69 += this.anInt2241;
		if (this.aLong69 > this.aLong68) {
			this.aLong68 = this.aLong69;
		}
		@Pc(70) long local70 = -1L;
		if (this.aLong72 + (long) this.anInt2241 > this.aLong73 && this.aLong73 + (long) this.anInt2235 >= (long) this.anInt2241 + this.aLong72) {
			local70 = this.aLong72 + (long) this.anInt2241;
		} else if (this.aLong73 + (long) this.anInt2235 > this.aLong72 && (long) this.anInt2235 + this.aLong73 <= this.aLong72 - -((long) this.anInt2241)) {
			local70 = this.aLong73 + (long) this.anInt2235;
		}
		if (this.aLong72 >= this.aLong73 && this.aLong73 + (long) this.anInt2235 > this.aLong72) {
			local21 = this.aLong72;
		} else if (this.aLong72 <= this.aLong73 && (long) this.anInt2241 + this.aLong72 > this.aLong73) {
			local21 = this.aLong73;
		}
		if (local21 > -1L && local70 > local21) {
			@Pc(219) int local219 = (int) (local70 - local21);
			Static135.method359(this.aByteArray30, (int) (local21 - this.aLong72), this.aByteArray31, (int) (local21 - this.aLong73), local219);
		}
		this.aLong72 = -1L;
		this.anInt2241 = 0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
	public void method1606() throws IOException {
		this.method1603();
		this.aClass59_4.method1319();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(JI)V")
	public void method1607(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1612());
		}
		this.aLong70 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	private void method1608() throws IOException {
		this.anInt2235 = 0;
		if (this.aLong69 != this.aLong70) {
			this.aClass59_4.method1322(this.aLong70);
			this.aLong69 = this.aLong70;
		}
		this.aLong73 = this.aLong70;
		while (this.anInt2235 < this.aByteArray31.length) {
			@Pc(59) int local59 = this.aClass59_4.method1321(this.aByteArray31.length - this.anInt2235, this.aByteArray31, this.anInt2235);
			if (local59 == -1) {
				break;
			}
			this.aLong69 += local59;
			this.anInt2235 += local59;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III[B)V")
	public void method1609(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		try {
			if (this.aLong71 < this.aLong70 + (long) arg1) {
				this.aLong71 = (long) arg1 + this.aLong70;
			}
			if (this.aLong72 != -1L && (this.aLong70 < this.aLong72 || this.aLong70 > (long) this.anInt2241 + this.aLong72)) {
				this.method1603();
			}
			if (this.aLong72 != -1L && this.aLong72 + (long) this.aByteArray30.length < (long) arg1 + this.aLong70) {
				@Pc(92) int local92 = (int) (this.aLong72 + (long) this.aByteArray30.length - this.aLong70);
				Static135.method359(arg2, arg0, this.aByteArray30, (int) (this.aLong70 - this.aLong72), local92);
				this.aLong70 += local92;
				arg1 -= local92;
				this.anInt2241 = this.aByteArray30.length;
				this.method1603();
				arg0 += local92;
			}
			if (this.aByteArray30.length < arg1) {
				if (this.aLong69 != this.aLong70) {
					this.aClass59_4.method1322(this.aLong70);
					this.aLong69 = this.aLong70;
				}
				@Pc(157) long local157 = -1L;
				this.aClass59_4.method1320(arg1, arg2, arg0);
				this.aLong69 += arg1;
				@Pc(173) long local173 = -1L;
				if (this.aLong73 <= this.aLong70 && this.aLong70 < (long) this.anInt2235 + this.aLong73) {
					local173 = this.aLong70;
				} else if (this.aLong70 <= this.aLong73 && (long) arg1 + this.aLong70 > this.aLong73) {
					local173 = this.aLong73;
				}
				if (this.aLong73 < (long) arg1 + this.aLong70 && (long) arg1 + this.aLong70 <= (long) this.anInt2235 + this.aLong73) {
					local157 = this.aLong70 + (long) arg1;
				} else if ((long) this.anInt2235 + this.aLong73 > this.aLong70 && (long) arg1 + this.aLong70 >= (long) this.anInt2235 + this.aLong73) {
					local157 = (long) this.anInt2235 + this.aLong73;
				}
				if (this.aLong68 < this.aLong69) {
					this.aLong68 = this.aLong69;
				}
				if (local173 > -1L && local173 < local157) {
					@Pc(326) int local326 = (int) (local157 - local173);
					Static135.method359(arg2, (int) ((long) arg0 + local173 - this.aLong70), this.aByteArray31, (int) (local173 - this.aLong73), local326);
				}
				this.aLong70 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong72 == -1L) {
					this.aLong72 = this.aLong70;
				}
				Static135.method359(arg2, arg0, this.aByteArray30, (int) (this.aLong70 - this.aLong72), arg1);
				this.aLong70 += arg1;
				if (this.aLong70 - this.aLong72 > (long) this.anInt2241) {
					this.anInt2241 = (int) (this.aLong70 - this.aLong72);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong69 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)J")
	public long method1611() {
		return this.aLong71;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Ljava/io/File;")
	private File method1612() {
		return this.aClass59_4.method1323();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)V")
	public void method1616(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method1617(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)V")
	public void method1617(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg0.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong72 != -1L && this.aLong72 <= this.aLong70 && (long) arg2 + this.aLong70 <= this.aLong72 - -((long) this.anInt2241)) {
				Static135.method359(this.aByteArray30, (int) (this.aLong70 - this.aLong72), arg0, 0, arg2);
				this.aLong70 += arg2;
				return;
			}
			@Pc(85) long local85 = this.aLong70;
			@Pc(89) int local89 = arg2;
			@Pc(119) int local119;
			if (this.aLong73 <= this.aLong70 && this.aLong73 + (long) this.anInt2235 > this.aLong70) {
				local119 = (int) ((long) this.anInt2235 + this.aLong73 - this.aLong70);
				if (arg2 < local119) {
					local119 = arg2;
				}
				Static135.method359(this.aByteArray31, (int) (this.aLong70 - this.aLong73), arg0, 0, local119);
				arg1 = local119;
				this.aLong70 += local119;
				arg2 -= local119;
			}
			if (arg2 > this.aByteArray31.length) {
				this.aClass59_4.method1322(this.aLong70);
				this.aLong69 = this.aLong70;
				while (arg2 > 0) {
					local119 = this.aClass59_4.method1321(arg2, arg0, arg1);
					if (local119 == -1) {
						break;
					}
					arg2 -= local119;
					arg1 += local119;
					this.aLong70 += local119;
					this.aLong69 += local119;
				}
			} else if (arg2 > 0) {
				this.method1608();
				local119 = arg2;
				if (arg2 > this.anInt2235) {
					local119 = this.anInt2235;
				}
				arg2 -= local119;
				Static135.method359(this.aByteArray31, 0, arg0, arg1, local119);
				arg1 += local119;
				this.aLong70 += local119;
			}
			if (this.aLong72 != -1L) {
				if (this.aLong72 > this.aLong70 && arg2 > 0) {
					local119 = arg1 + (int) (this.aLong72 - this.aLong70);
					if (local119 > arg2 + arg1) {
						local119 = arg2 + arg1;
					}
					while (local119 > arg1) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong70++;
					}
				}
				@Pc(315) long local315 = -1L;
				@Pc(317) long local317 = -1L;
				if (this.aLong72 >= local85 && this.aLong72 < local85 + (long) local89) {
					local317 = this.aLong72;
				} else if (local85 >= this.aLong72 && local85 < (long) this.anInt2241 + this.aLong72) {
					local317 = local85;
				}
				if (this.aLong72 + (long) this.anInt2241 > local85 && (long) this.anInt2241 + this.aLong72 <= local85 - -((long) local89)) {
					local315 = (long) this.anInt2241 + this.aLong72;
				} else if (local85 + (long) local89 > this.aLong72 && local85 + (long) local89 <= (long) this.anInt2241 + this.aLong72) {
					local315 = local85 + (long) local89;
				}
				if (local317 > -1L && local317 < local315) {
					@Pc(440) int local440 = (int) (local315 - local317);
					Static135.method359(this.aByteArray30, (int) (local317 - this.aLong72), arg0, (int) (local317 - local85), local440);
					if (local315 > this.aLong70) {
						arg2 = (int) ((long) arg2 + this.aLong70 - local315);
						this.aLong70 = local315;
					}
				}
			}
		} catch (@Pc(477) IOException local477) {
			this.aLong69 = -1L;
			throw local477;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
