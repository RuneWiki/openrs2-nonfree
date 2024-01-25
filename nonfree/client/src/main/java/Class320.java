import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class320 {

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "J")
	private long aLong226;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
	private int anInt8976;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
	private int anInt8973 = 0;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "J")
	private long aLong224 = -1L;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "J")
	private long aLong228 = -1L;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Lclient!hh;")
	private final Class133 aClass133_4;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "J")
	private long aLong227;

	@OriginalMember(owner = "client!uo", name = "w", descriptor = "J")
	private long aLong229;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "[B")
	private final byte[] aByteArray114;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[B")
	private final byte[] aByteArray115;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "J")
	private long aLong225;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!hh;II)V")
	public Class320(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass133_4 = arg0;
		this.aLong229 = this.aLong227 = arg0.method2789();
		this.aByteArray114 = new byte[arg1];
		this.aByteArray115 = new byte[arg2];
		this.aLong225 = 0L;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[BI)V")
	public void method7332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong225 + (long) arg1 > this.aLong229) {
				this.aLong229 = (long) arg1 + this.aLong225;
			}
			if (this.aLong224 != -1L && (this.aLong224 > this.aLong225 || this.aLong225 > this.aLong224 + (long) this.anInt8973)) {
				this.method7342();
			}
			if (this.aLong224 != -1L && (long) this.aByteArray115.length + this.aLong224 < (long) arg1 + this.aLong225) {
				@Pc(91) int local91 = (int) ((long) this.aByteArray115.length + this.aLong224 - this.aLong225);
				Static585.method3080(arg2, arg0, this.aByteArray115, (int) (this.aLong225 - this.aLong224), local91);
				arg0 += local91;
				this.aLong225 += local91;
				arg1 -= local91;
				this.anInt8973 = this.aByteArray115.length;
				this.method7342();
			}
			if (this.aByteArray115.length < arg1) {
				if (this.aLong226 != this.aLong225) {
					this.aClass133_4.method2784(this.aLong225);
					this.aLong226 = this.aLong225;
				}
				this.aClass133_4.method2786(arg2, arg0, arg1);
				this.aLong226 += arg1;
				if (this.aLong227 < this.aLong226) {
					this.aLong227 = this.aLong226;
				}
				@Pc(181) long local181 = -1L;
				if (this.aLong228 <= this.aLong225 && this.aLong228 + (long) this.anInt8976 > this.aLong225) {
					local181 = this.aLong225;
				} else if (this.aLong228 >= this.aLong225 && this.aLong225 + (long) arg1 > this.aLong228) {
					local181 = this.aLong228;
				}
				@Pc(235) long local235 = -1L;
				if (this.aLong228 < (long) arg1 + this.aLong225 && this.aLong225 + (long) arg1 <= this.aLong228 + (long) this.anInt8976) {
					local235 = (long) arg1 + this.aLong225;
				} else if (this.aLong228 + (long) this.anInt8976 > this.aLong225 && (long) this.anInt8976 + this.aLong228 <= this.aLong225 + (long) arg1) {
					local235 = (long) this.anInt8976 + this.aLong228;
				}
				if (local181 > -1L && local181 < local235) {
					@Pc(313) int local313 = (int) (local235 - local181);
					Static585.method3080(arg2, (int) ((long) arg0 + local181 - this.aLong225), this.aByteArray114, (int) (local181 - this.aLong228), local313);
				}
				this.aLong225 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong224 == -1L) {
					this.aLong224 = this.aLong225;
				}
				Static585.method3080(arg2, arg0, this.aByteArray115, (int) (this.aLong225 - this.aLong224), arg1);
				this.aLong225 += arg1;
				if ((long) this.anInt8973 < this.aLong225 - this.aLong224) {
					this.anInt8973 = (int) (this.aLong225 - this.aLong224);
				}
			}
		} catch (@Pc(399) IOException local399) {
			this.aLong226 = -1L;
			throw local399;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)J")
	public long method7333() {
		return this.aLong229;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BJ)V")
	public void method7334(@OriginalArg(1) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method7336());
		}
		this.aLong225 = arg0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)Ljava/io/File;")
	private File method7336() {
		return this.aClass133_4.method2790();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)V")
	public void method7337(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method7339(arg0.length, arg0, 0);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[BII)V")
	public void method7339(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg1.length < arg0) {
				throw new ArrayIndexOutOfBoundsException(arg0 - arg1.length);
			}
			if (this.aLong224 != -1L && this.aLong225 >= this.aLong224 && (long) arg0 + this.aLong225 <= this.aLong224 + (long) this.anInt8973) {
				Static585.method3080(this.aByteArray115, (int) (this.aLong225 - this.aLong224), arg1, 0, arg0);
				this.aLong225 += arg0;
				return;
			}
			@Pc(84) long local84 = this.aLong225;
			@Pc(88) int local88 = arg0;
			@Pc(120) int local120;
			if (this.aLong228 <= this.aLong225 && (long) this.anInt8976 + this.aLong228 > this.aLong225) {
				local120 = (int) ((long) this.anInt8976 + this.aLong228 - this.aLong225);
				if (local120 > arg0) {
					local120 = arg0;
				}
				Static585.method3080(this.aByteArray114, (int) (this.aLong225 - this.aLong228), arg1, 0, local120);
				arg0 -= local120;
				this.aLong225 += local120;
				arg2 = local120;
			}
			if (this.aByteArray114.length < arg0) {
				this.aClass133_4.method2784(this.aLong225);
				this.aLong226 = this.aLong225;
				while (arg0 > 0) {
					local120 = this.aClass133_4.method2787(arg1, arg2, arg0);
					if (local120 == -1) {
						break;
					}
					arg2 += local120;
					this.aLong225 += local120;
					arg0 -= local120;
					this.aLong226 += local120;
				}
			} else if (arg0 > 0) {
				this.method7343();
				local120 = arg0;
				if (arg0 > this.anInt8976) {
					local120 = this.anInt8976;
				}
				Static585.method3080(this.aByteArray114, 0, arg1, arg2, local120);
				arg2 += local120;
				arg0 -= local120;
				this.aLong225 += local120;
			}
			if (this.aLong224 != -1L) {
				if (this.aLong225 < this.aLong224 && arg0 > 0) {
					local120 = (int) (this.aLong224 - this.aLong225) + arg2;
					if (local120 > arg0 + arg2) {
						local120 = arg2 + arg0;
					}
					while (local120 > arg2) {
						arg1[arg2++] = 0;
						arg0--;
						this.aLong225++;
					}
				}
				@Pc(303) long local303 = -1L;
				if (local84 <= this.aLong224 && this.aLong224 < local84 + (long) local88) {
					local303 = this.aLong224;
				} else if (this.aLong224 <= local84 && (long) this.anInt8973 + this.aLong224 > local84) {
					local303 = local84;
				}
				@Pc(347) long local347 = -1L;
				if ((long) this.anInt8973 + this.aLong224 > local84 && this.aLong224 + (long) this.anInt8973 <= (long) local88 + local84) {
					local347 = (long) this.anInt8973 + this.aLong224;
				} else if (this.aLong224 < local84 + (long) local88 && this.aLong224 + (long) this.anInt8973 >= (long) local88 + local84) {
					local347 = local84 + (long) local88;
				}
				if (local303 > -1L && local347 > local303) {
					@Pc(427) int local427 = (int) (local347 - local303);
					Static585.method3080(this.aByteArray115, (int) (local303 - this.aLong224), arg1, (int) (local303 - local84), local427);
					if (local347 > this.aLong225) {
						arg0 = (int) ((long) arg0 + this.aLong225 - local347);
						this.aLong225 = local347;
					}
				}
			}
		} catch (@Pc(469) IOException local469) {
			this.aLong226 = -1L;
			throw local469;
		}
		if (arg0 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
	public void method7341() throws IOException {
		this.method7342();
		this.aClass133_4.method2788();
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
	private void method7342() throws IOException {
		if (this.aLong224 == -1L) {
			return;
		}
		if (this.aLong226 != this.aLong224) {
			this.aClass133_4.method2784(this.aLong224);
			this.aLong226 = this.aLong224;
		}
		this.aClass133_4.method2786(this.aByteArray115, 0, this.anInt8973);
		this.aLong226 += this.anInt8973;
		if (this.aLong227 < this.aLong226) {
			this.aLong227 = this.aLong226;
		}
		@Pc(71) long local71 = -1L;
		@Pc(73) long local73 = -1L;
		if (this.aLong228 <= this.aLong224 && this.aLong228 + (long) this.anInt8976 > this.aLong224) {
			local71 = this.aLong224;
		} else if (this.aLong224 <= this.aLong228 && this.aLong224 + (long) this.anInt8973 > this.aLong228) {
			local71 = this.aLong228;
		}
		if (this.aLong228 < this.aLong224 + (long) this.anInt8973 && this.aLong224 + (long) this.anInt8973 <= (long) this.anInt8976 + this.aLong228) {
			local73 = this.aLong224 + (long) this.anInt8973;
		} else if ((long) this.anInt8976 + this.aLong228 > this.aLong224 && (long) this.anInt8973 + this.aLong224 >= (long) this.anInt8976 + this.aLong228) {
			local73 = this.aLong228 + (long) this.anInt8976;
		}
		if (local71 > -1L && local71 < local73) {
			@Pc(220) int local220 = (int) (local73 - local71);
			Static585.method3080(this.aByteArray115, (int) (local71 - this.aLong224), this.aByteArray114, (int) (local71 - this.aLong228), local220);
		}
		this.aLong224 = -1L;
		this.anInt8973 = 0;
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	private void method7343() throws IOException {
		this.anInt8976 = 0;
		if (this.aLong225 != this.aLong226) {
			this.aClass133_4.method2784(this.aLong225);
			this.aLong226 = this.aLong225;
		}
		this.aLong228 = this.aLong225;
		while (this.aByteArray114.length > this.anInt8976) {
			@Pc(38) int local38 = this.aByteArray114.length - this.anInt8976;
			if (local38 > 200000000) {
				local38 = 200000000;
			}
			@Pc(55) int local55 = this.aClass133_4.method2787(this.aByteArray114, this.anInt8976, local38);
			if (local55 == -1) {
				break;
			}
			this.anInt8976 += local55;
			this.aLong226 += local55;
		}
	}
}
