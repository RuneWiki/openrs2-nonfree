import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class142 {

	@OriginalMember(owner = "client!jv", name = "d", descriptor = "[B")
	public static final byte[] aByteArray35;

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
	private int anInt3529;

	@OriginalMember(owner = "client!jv", name = "l", descriptor = "J")
	private long aLong102;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
	private int anInt3527 = 0;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "J")
	private long aLong100 = -1L;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "J")
	private long aLong104 = -1L;

	@OriginalMember(owner = "client!jv", name = "g", descriptor = "Lclient!en;")
	private final Class70 aClass70_1;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!jv", name = "m", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "[B")
	private final byte[] aByteArray36;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "[B")
	private final byte[] aByteArray37;

	static {
		@Pc(1) int local1 = 0;
		aByteArray35 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray35[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!en;II)V")
	public Class142(@OriginalArg(0) Class70 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass70_1 = arg0;
		this.aLong99 = this.aLong101 = arg0.method1446();
		this.aLong103 = 0L;
		this.aByteArray36 = new byte[arg1];
		this.aByteArray37 = new byte[arg2];
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	private void method2803() throws IOException {
		if (this.aLong100 == -1L) {
			return;
		}
		if (this.aLong102 != this.aLong100) {
			this.aClass70_1.method1444(this.aLong100);
			this.aLong102 = this.aLong100;
		}
		this.aClass70_1.method1441(this.aByteArray37, this.anInt3527, 0);
		this.aLong102 += this.anInt3527;
		if (this.aLong102 > this.aLong101) {
			this.aLong101 = this.aLong102;
		}
		@Pc(55) long local55 = -1L;
		@Pc(57) long local57 = -1L;
		if (this.aLong104 <= this.aLong100 && (long) this.anInt3529 + this.aLong104 > this.aLong100) {
			local55 = this.aLong100;
		} else if (this.aLong104 >= this.aLong100 && this.aLong104 < this.aLong100 + (long) this.anInt3527) {
			local55 = this.aLong104;
		}
		if (this.aLong104 < (long) this.anInt3527 + this.aLong100 && (long) this.anInt3529 + this.aLong104 >= this.aLong100 + (long) this.anInt3527) {
			local57 = this.aLong100 + (long) this.anInt3527;
		} else if (this.aLong100 < (long) this.anInt3529 + this.aLong104 && this.aLong100 + (long) this.anInt3527 >= (long) this.anInt3529 + this.aLong104) {
			local57 = (long) this.anInt3529 + this.aLong104;
		}
		if (local55 > -1L && local57 > local55) {
			@Pc(189) int local189 = (int) (local57 - local55);
			Static461.method1985(this.aByteArray37, (int) (local55 - this.aLong100), this.aByteArray36, (int) (local55 - this.aLong104), local189);
		}
		this.anInt3527 = 0;
		this.aLong100 = -1L;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
	private void method2804() throws IOException {
		this.anInt3529 = 0;
		if (this.aLong103 != this.aLong102) {
			this.aClass70_1.method1444(this.aLong103);
			this.aLong102 = this.aLong103;
		}
		this.aLong104 = this.aLong103;
		while (this.anInt3529 < this.aByteArray36.length) {
			@Pc(47) int local47 = this.aByteArray36.length - this.anInt3529;
			if (local47 > 200000000) {
				local47 = 200000000;
			}
			@Pc(62) int local62 = this.aClass70_1.method1445(this.anInt3529, this.aByteArray36, local47);
			if (local62 == -1) {
				break;
			}
			this.anInt3529 += local62;
			this.aLong102 += local62;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)J")
	public long method2806() {
		return this.aLong99;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method2807() {
		return this.aClass70_1.method1442();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IJ)V")
	public void method2808(@OriginalArg(1) long arg0) throws IOException {
		if ((long) 0 > arg0) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2807());
		}
		this.aLong103 = arg0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[B)V")
	public void method2809(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method2812(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "([BBII)V")
	public void method2810(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong103 + (long) arg1 > this.aLong99) {
				this.aLong99 = this.aLong103 + (long) arg1;
			}
			if (this.aLong100 != -1L && (this.aLong103 < this.aLong100 || this.aLong100 + (long) this.anInt3527 < this.aLong103)) {
				this.method2803();
			}
			if (this.aLong100 != -1L && this.aLong103 + (long) arg1 > this.aLong100 - -((long) this.aByteArray37.length)) {
				@Pc(86) int local86 = (int) (this.aLong100 + (long) this.aByteArray37.length - this.aLong103);
				Static461.method1985(arg0, arg2, this.aByteArray37, (int) (this.aLong103 - this.aLong100), local86);
				arg2 += local86;
				arg1 -= local86;
				this.aLong103 += local86;
				this.anInt3527 = this.aByteArray37.length;
				this.method2803();
			}
			if (this.aByteArray37.length < arg1) {
				if (this.aLong103 != this.aLong102) {
					this.aClass70_1.method1444(this.aLong103);
					this.aLong102 = this.aLong103;
				}
				this.aClass70_1.method1441(arg0, arg1, arg2);
				this.aLong102 += arg1;
				if (this.aLong101 < this.aLong102) {
					this.aLong101 = this.aLong102;
				}
				@Pc(173) long local173 = -1L;
				@Pc(175) long local175 = -1L;
				if (this.aLong103 >= this.aLong104 && this.aLong103 < (long) this.anInt3529 + this.aLong104) {
					local173 = this.aLong103;
				} else if (this.aLong104 >= this.aLong103 && this.aLong104 < this.aLong103 + (long) arg1) {
					local173 = this.aLong104;
				}
				if (this.aLong104 < (long) arg1 + this.aLong103 && this.aLong104 + (long) this.anInt3529 >= (long) arg1 + this.aLong103) {
					local175 = (long) arg1 + this.aLong103;
				} else if (this.aLong103 < (long) this.anInt3529 + this.aLong104 && (long) arg1 + this.aLong103 >= this.aLong104 - -((long) this.anInt3529)) {
					local175 = this.aLong104 + (long) this.anInt3529;
				}
				if (local173 > -1L && local175 > local173) {
					@Pc(318) int local318 = (int) (local175 - local173);
					Static461.method1985(arg0, (int) (local173 + (long) arg2 - this.aLong103), this.aByteArray36, (int) (local173 - this.aLong104), local318);
				}
				this.aLong103 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong100 == -1L) {
					this.aLong100 = this.aLong103;
				}
				Static461.method1985(arg0, arg2, this.aByteArray37, (int) (this.aLong103 - this.aLong100), arg1);
				this.aLong103 += arg1;
				if ((long) this.anInt3527 < this.aLong103 - this.aLong100) {
					this.anInt3527 = (int) (this.aLong103 - this.aLong100);
				}
			}
		} catch (@Pc(408) IOException local408) {
			this.aLong102 = -1L;
			throw local408;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II[BI)V")
	public void method2812(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg1.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong100 != (long) -1 && this.aLong100 <= this.aLong103 && (long) this.anInt3527 + this.aLong100 >= this.aLong103 + (long) arg2) {
				Static461.method1985(this.aByteArray37, (int) (this.aLong103 - this.aLong100), arg1, 0, arg2);
				this.aLong103 += arg2;
				return;
			}
			@Pc(75) long local75 = this.aLong103;
			@Pc(79) int local79 = arg2;
			@Pc(112) int local112;
			if (this.aLong104 <= this.aLong103 && this.aLong103 < this.aLong104 + (long) this.anInt3529) {
				local112 = (int) (this.aLong104 + (long) this.anInt3529 - this.aLong103);
				if (arg2 < local112) {
					local112 = arg2;
				}
				Static461.method1985(this.aByteArray36, (int) (this.aLong103 - this.aLong104), arg1, 0, local112);
				this.aLong103 += local112;
				arg2 -= local112;
				arg0 = local112;
			}
			if (arg2 > this.aByteArray36.length) {
				this.aClass70_1.method1444(this.aLong103);
				this.aLong102 = this.aLong103;
				while (arg2 > 0) {
					local112 = this.aClass70_1.method1445(arg0, arg1, arg2);
					if (local112 == -1) {
						break;
					}
					arg2 -= local112;
					this.aLong102 += local112;
					arg0 += local112;
					this.aLong103 += local112;
				}
			} else if (arg2 > 0) {
				this.method2804();
				local112 = arg2;
				if (arg2 > this.anInt3529) {
					local112 = this.anInt3529;
				}
				Static461.method1985(this.aByteArray36, 0, arg1, arg0, local112);
				arg0 += local112;
				this.aLong103 += local112;
				arg2 -= local112;
			}
			if (this.aLong100 != -1L) {
				if (this.aLong100 > this.aLong103 && arg2 > 0) {
					local112 = arg0 + (int) (this.aLong100 - this.aLong103);
					if (local112 > arg0 + arg2) {
						local112 = arg2 + arg0;
					}
					while (local112 > arg0) {
						arg1[arg0++] = 0;
						arg2--;
						this.aLong103++;
					}
				}
				@Pc(317) long local317 = -1L;
				@Pc(319) long local319 = -1L;
				if (local75 <= this.aLong100 && (long) local79 + local75 > this.aLong100) {
					local317 = this.aLong100;
				} else if (local75 >= this.aLong100 && local75 < this.aLong100 + (long) this.anInt3527) {
					local317 = local75;
				}
				if ((long) this.anInt3527 + this.aLong100 > local75 && this.aLong100 + (long) this.anInt3527 <= local75 - -((long) local79)) {
					local319 = (long) this.anInt3527 + this.aLong100;
				} else if (local75 + (long) local79 > this.aLong100 && (long) local79 + local75 <= (long) this.anInt3527 + this.aLong100) {
					local319 = (long) local79 + local75;
				}
				if (local317 > -1L && local319 > local317) {
					@Pc(451) int local451 = (int) (local319 - local317);
					Static461.method1985(this.aByteArray37, (int) (local317 - this.aLong100), arg1, (int) (local317 - local75), local451);
					if (local319 > this.aLong103) {
						arg2 = (int) ((long) arg2 + this.aLong103 - local319);
						this.aLong103 = local319;
					}
				}
			}
		} catch (@Pc(492) IOException local492) {
			this.aLong102 = -1L;
			throw local492;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
