import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class135 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	private int anInt4149;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "J")
	private long aLong218;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
	private long aLong220 = -1L;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt4153 = 0;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "J")
	private long aLong223 = -1L;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!mc;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "J")
	private long aLong219;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "J")
	private long aLong222;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!mc;II)V")
	public Class135(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass110_1 = arg0;
		this.aLong221 = this.aLong219 = arg0.method2679();
		this.aByteArray44 = new byte[arg1];
		this.aByteArray43 = new byte[arg2];
		this.aLong222 = 0L;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J")
	public long method3368() {
		return this.aLong221;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Ljava/io/File;")
	private File method3369() {
		return this.aClass110_1.method2680();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	private void method3370() throws IOException {
		this.anInt4149 = 0;
		if (this.aLong222 != this.aLong218) {
			this.aClass110_1.method2684(this.aLong222);
			this.aLong218 = this.aLong222;
		}
		this.aLong220 = this.aLong222;
		while (this.aByteArray44.length > this.anInt4149) {
			@Pc(52) int local52 = this.aByteArray44.length - this.anInt4149;
			if (local52 > 200000000) {
				local52 = 200000000;
			}
			@Pc(68) int local68 = this.aClass110_1.method2682(this.aByteArray44, this.anInt4149, local52);
			if (local68 == -1) {
				break;
			}
			this.aLong218 += local68;
			this.anInt4149 += local68;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BJ)V")
	public void method3372(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method3369());
		}
		this.aLong222 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BI)V")
	public void method3373(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method3375(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BII)V")
	public void method3374(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong222 + (long) arg2 > this.aLong221) {
				this.aLong221 = (long) arg2 + this.aLong222;
			}
			if (this.aLong223 != -1L && (this.aLong223 > this.aLong222 || this.aLong222 > (long) this.anInt4153 + this.aLong223)) {
				this.method3376();
			}
			if ((long) -1 != this.aLong223 && this.aLong223 + (long) this.aByteArray43.length < this.aLong222 - -((long) arg2)) {
				@Pc(87) int local87 = (int) (this.aLong223 + (long) this.aByteArray43.length - this.aLong222);
				arg2 -= local87;
				Static301.method302(arg1, arg0, this.aByteArray43, (int) (this.aLong222 - this.aLong223), local87);
				this.aLong222 += local87;
				this.anInt4153 = this.aByteArray43.length;
				arg0 += local87;
				this.method3376();
			}
			if (this.aByteArray43.length < arg2) {
				if (this.aLong222 != this.aLong218) {
					this.aClass110_1.method2684(this.aLong222);
					this.aLong218 = this.aLong222;
				}
				@Pc(154) long local154 = -1L;
				this.aClass110_1.method2683(arg2, arg1, arg0);
				if (this.aLong220 <= this.aLong222 && this.aLong220 + (long) this.anInt4149 > this.aLong222) {
					local154 = this.aLong222;
				} else if (this.aLong220 >= this.aLong222 && (long) arg2 + this.aLong222 > this.aLong220) {
					local154 = this.aLong220;
				}
				this.aLong218 += arg2;
				@Pc(218) long local218 = -1L;
				if (this.aLong218 > this.aLong219) {
					this.aLong219 = this.aLong218;
				}
				if (this.aLong220 < (long) arg2 + this.aLong222 && this.aLong222 + (long) arg2 <= this.aLong220 + (long) this.anInt4149) {
					local218 = (long) arg2 + this.aLong222;
				} else if (this.aLong222 < this.aLong220 + (long) this.anInt4149 && (long) this.anInt4149 + this.aLong220 <= (long) arg2 + this.aLong222) {
					local218 = this.aLong220 + (long) this.anInt4149;
				}
				if (local154 > -1L && local218 > local154) {
					@Pc(316) int local316 = (int) (local218 - local154);
					Static301.method302(arg1, (int) (local154 + (long) arg0 - this.aLong222), this.aByteArray44, (int) (local154 - this.aLong220), local316);
				}
				this.aLong222 += arg2;
			} else if (arg2 > 0) {
				if (this.aLong223 == -1L) {
					this.aLong223 = this.aLong222;
				}
				Static301.method302(arg1, arg0, this.aByteArray43, (int) (this.aLong222 - this.aLong223), arg2);
				this.aLong222 += arg2;
				if (this.aLong222 - this.aLong223 > (long) this.anInt4153) {
					this.anInt4153 = (int) (this.aLong222 - this.aLong223);
				}
			}
		} catch (@Pc(403) IOException local403) {
			this.aLong218 = -1L;
			throw local403;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BZI)V")
	public void method3375(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg2) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg1.length);
			}
			if (this.aLong223 != -1L && this.aLong223 <= this.aLong222 && this.aLong222 + (long) arg2 <= (long) this.anInt4153 + this.aLong223) {
				Static301.method302(this.aByteArray43, (int) (this.aLong222 - this.aLong223), arg1, 0, arg2);
				this.aLong222 += arg2;
				return;
			}
			@Pc(82) long local82 = this.aLong222;
			@Pc(84) int local84 = arg2;
			@Pc(119) int local119;
			if (this.aLong220 <= this.aLong222 && this.aLong220 + (long) this.anInt4149 > this.aLong222) {
				local119 = (int) ((long) this.anInt4149 + this.aLong220 - this.aLong222);
				if (local119 > arg2) {
					local119 = arg2;
				}
				arg2 -= local119;
				Static301.method302(this.aByteArray44, (int) (this.aLong222 - this.aLong220), arg1, 0, local119);
				arg0 = local119;
				this.aLong222 += local119;
			}
			if (arg2 > this.aByteArray44.length) {
				this.aClass110_1.method2684(this.aLong222);
				this.aLong218 = this.aLong222;
				while (arg2 > 0) {
					local119 = this.aClass110_1.method2682(arg1, arg0, arg2);
					if (local119 == -1) {
						break;
					}
					this.aLong222 += local119;
					arg2 -= local119;
					this.aLong218 += local119;
					arg0 += local119;
				}
			} else if (arg2 > 0) {
				this.method3370();
				local119 = arg2;
				if (arg2 > this.anInt4149) {
					local119 = this.anInt4149;
				}
				arg2 -= local119;
				Static301.method302(this.aByteArray44, 0, arg1, arg0, local119);
				arg0 += local119;
				this.aLong222 += local119;
			}
			if (this.aLong223 != -1L) {
				if (this.aLong223 > this.aLong222 && arg2 > 0) {
					local119 = arg0 + (int) (this.aLong223 - this.aLong222);
					if (local119 > arg2 + arg0) {
						local119 = arg0 + arg2;
					}
					while (local119 > arg0) {
						arg2--;
						arg1[arg0++] = 0;
						this.aLong222++;
					}
				}
				@Pc(311) long local311 = -1L;
				if (this.aLong223 >= local82 && this.aLong223 < local82 + (long) local84) {
					local311 = this.aLong223;
				} else if (this.aLong223 <= local82 && local82 < (long) this.anInt4153 + this.aLong223) {
					local311 = local82;
				}
				@Pc(359) long local359 = -1L;
				if (this.aLong223 + (long) this.anInt4153 > local82 && (long) this.anInt4153 + this.aLong223 <= local82 + (long) local84) {
					local359 = (long) this.anInt4153 + this.aLong223;
				} else if (local82 + (long) local84 > this.aLong223 && (long) local84 + local82 <= this.aLong223 + (long) this.anInt4153) {
					local359 = local82 + (long) local84;
				}
				if (local311 > -1L && local311 < local359) {
					@Pc(445) int local445 = (int) (local359 - local311);
					Static301.method302(this.aByteArray43, (int) (local311 - this.aLong223), arg1, (int) (local311 - local82), local445);
					if (this.aLong222 < local359) {
						arg2 = (int) ((long) arg2 + this.aLong222 - local359);
						this.aLong222 = local359;
					}
				}
			}
		} catch (@Pc(483) IOException local483) {
			this.aLong218 = -1L;
			throw local483;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
	private void method3376() throws IOException {
		if (this.aLong223 == -1L) {
			return;
		}
		if (this.aLong218 != this.aLong223) {
			this.aClass110_1.method2684(this.aLong223);
			this.aLong218 = this.aLong223;
		}
		this.aClass110_1.method2683(this.anInt4153, this.aByteArray43, 0);
		this.aLong218 += this.anInt4153;
		@Pc(54) long local54 = -1L;
		if (this.aLong219 < this.aLong218) {
			this.aLong219 = this.aLong218;
		}
		@Pc(71) long local71 = -1L;
		if (this.aLong220 < (long) this.anInt4153 + this.aLong223 && this.aLong220 + (long) this.anInt4149 >= (long) this.anInt4153 + this.aLong223) {
			local71 = this.aLong223 + (long) this.anInt4153;
		} else if (this.aLong223 < (long) this.anInt4149 + this.aLong220 && (long) this.anInt4153 + this.aLong223 >= (long) this.anInt4149 + this.aLong220) {
			local71 = (long) this.anInt4149 + this.aLong220;
		}
		if (this.aLong223 >= this.aLong220 && this.aLong220 + (long) this.anInt4149 > this.aLong223) {
			local54 = this.aLong223;
		} else if (this.aLong223 <= this.aLong220 && this.aLong220 < this.aLong223 + (long) this.anInt4153) {
			local54 = this.aLong220;
		}
		if (local54 > -1L && local54 < local71) {
			@Pc(221) int local221 = (int) (local71 - local54);
			Static301.method302(this.aByteArray43, (int) (local54 - this.aLong223), this.aByteArray44, (int) (local54 - this.aLong220), local221);
		}
		this.aLong223 = -1L;
		this.anInt4153 = 0;
	}
}
