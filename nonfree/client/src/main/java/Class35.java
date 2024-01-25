import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class35 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	private int anInt993;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "J")
	private long aLong30;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "J")
	private long aLong33 = -1L;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	private int anInt997 = 0;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "J")
	private long aLong35 = -1L;

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "Lclient!le;")
	private final Class117 aClass117_4;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "J")
	private long aLong34;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "[B")
	private final byte[] aByteArray8;

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "[B")
	private final byte[] aByteArray9;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!le;II)V")
	public Class35(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass117_4 = arg0;
		this.aLong31 = this.aLong34 = arg0.method3259();
		this.aByteArray8 = new byte[arg2];
		this.aByteArray9 = new byte[arg1];
		this.aLong32 = 0L;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(JI)V")
	public void method892(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method895());
		}
		this.aLong32 = arg0;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[BII)V")
	public void method893(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong32 + (long) arg0 > this.aLong31) {
				this.aLong31 = this.aLong32 + (long) arg0;
			}
			if (this.aLong33 != -1L && (this.aLong33 > this.aLong32 || this.aLong32 > this.aLong33 + (long) this.anInt997)) {
				this.method898();
			}
			if (this.aLong33 != -1L && this.aLong32 + (long) arg0 > this.aLong33 - -((long) this.aByteArray8.length)) {
				@Pc(91) int local91 = (int) (this.aLong33 + (long) this.aByteArray8.length - this.aLong32);
				Static359.method756(arg1, arg2, this.aByteArray8, (int) (this.aLong32 - this.aLong33), local91);
				this.aLong32 += local91;
				arg2 += local91;
				arg0 -= local91;
				this.anInt997 = this.aByteArray8.length;
				this.method898();
			}
			if (this.aByteArray8.length < arg0) {
				if (this.aLong30 != this.aLong32) {
					this.aClass117_4.method3257(this.aLong32);
					this.aLong30 = this.aLong32;
				}
				this.aClass117_4.method3256(arg0, arg2, arg1);
				this.aLong30 += arg0;
				if (this.aLong34 < this.aLong30) {
					this.aLong34 = this.aLong30;
				}
				@Pc(178) long local178 = -1L;
				@Pc(180) long local180 = -1L;
				if (this.aLong35 <= this.aLong32 && this.aLong32 < this.aLong35 + (long) this.anInt993) {
					local178 = this.aLong32;
				} else if (this.aLong35 >= this.aLong32 && this.aLong35 < this.aLong32 + (long) arg0) {
					local178 = this.aLong35;
				}
				if ((long) arg0 + this.aLong32 > this.aLong35 && (long) this.anInt993 + this.aLong35 >= this.aLong32 + (long) arg0) {
					local180 = (long) arg0 + this.aLong32;
				} else if (this.aLong32 < this.aLong35 + (long) this.anInt993 && this.aLong32 + (long) arg0 >= (long) this.anInt993 + this.aLong35) {
					local180 = this.aLong35 + (long) this.anInt993;
				}
				if (local178 > -1L && local180 > local178) {
					@Pc(317) int local317 = (int) (local180 - local178);
					Static359.method756(arg1, (int) ((long) arg2 + local178 - this.aLong32), this.aByteArray9, (int) (local178 - this.aLong35), local317);
				}
				this.aLong32 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong33 == -1L) {
					this.aLong33 = this.aLong32;
				}
				Static359.method756(arg1, arg2, this.aByteArray8, (int) (this.aLong32 - this.aLong33), arg0);
				this.aLong32 += arg0;
				if ((long) this.anInt997 < this.aLong32 - this.aLong33) {
					this.anInt997 = (int) (this.aLong32 - this.aLong33);
				}
			}
		} catch (@Pc(406) IOException local406) {
			this.aLong30 = -1L;
			throw local406;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)J")
	public long method894() {
		return this.aLong31;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)Ljava/io/File;")
	private File method895() {
		return this.aClass117_4.method3258();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([BIII)V")
	public void method897(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg0.length);
			}
			if (this.aLong33 != (long) -1 && this.aLong32 >= this.aLong33 && this.aLong32 + (long) arg1 <= (long) this.anInt997 + this.aLong33) {
				Static359.method756(this.aByteArray8, (int) (this.aLong32 - this.aLong33), arg0, 0, arg1);
				this.aLong32 += arg1;
				return;
			}
			@Pc(73) long local73 = this.aLong32;
			@Pc(77) int local77 = arg1;
			@Pc(109) int local109;
			if (this.aLong32 >= this.aLong35 && this.aLong32 < (long) this.anInt993 + this.aLong35) {
				local109 = (int) ((long) this.anInt993 + this.aLong35 - this.aLong32);
				if (local109 > arg1) {
					local109 = arg1;
				}
				Static359.method756(this.aByteArray9, (int) (this.aLong32 - this.aLong35), arg0, 0, local109);
				arg2 = local109;
				arg1 -= local109;
				this.aLong32 += local109;
			}
			if (arg1 > this.aByteArray9.length) {
				this.aClass117_4.method3257(this.aLong32);
				this.aLong30 = this.aLong32;
				while (arg1 > 0) {
					local109 = this.aClass117_4.method3261(arg0, arg2, arg1);
					if (local109 == -1) {
						break;
					}
					this.aLong32 += local109;
					this.aLong30 += local109;
					arg1 -= local109;
					arg2 += local109;
				}
			} else if (arg1 > 0) {
				this.method899();
				local109 = arg1;
				if (this.anInt993 < arg1) {
					local109 = this.anInt993;
				}
				Static359.method756(this.aByteArray9, 0, arg0, arg2, local109);
				this.aLong32 += local109;
				arg2 += local109;
				arg1 -= local109;
			}
			if (this.aLong33 != -1L) {
				if (this.aLong32 < this.aLong33 && arg1 > 0) {
					local109 = arg2 + (int) (this.aLong33 - this.aLong32);
					if (local109 > arg1 + arg2) {
						local109 = arg1 + arg2;
					}
					while (local109 > arg2) {
						arg0[arg2++] = 0;
						arg1--;
						this.aLong32++;
					}
				}
				@Pc(297) long local297 = -1L;
				@Pc(299) long local299 = -1L;
				if (this.aLong33 >= local73 && local73 + (long) local77 > this.aLong33) {
					local297 = this.aLong33;
				} else if (this.aLong33 <= local73 && local73 < this.aLong33 + (long) this.anInt997) {
					local297 = local73;
				}
				if (local73 < (long) this.anInt997 + this.aLong33 && (long) local77 + local73 >= (long) this.anInt997 + this.aLong33) {
					local299 = (long) this.anInt997 + this.aLong33;
				} else if (this.aLong33 < (long) local77 + local73 && local73 + (long) local77 <= (long) this.anInt997 + this.aLong33) {
					local299 = (long) local77 + local73;
				}
				if (local297 > -1L && local297 < local299) {
					@Pc(417) int local417 = (int) (local299 - local297);
					Static359.method756(this.aByteArray8, (int) (local297 - this.aLong33), arg0, (int) (local297 - local73), local417);
					if (this.aLong32 < local299) {
						arg1 = (int) ((long) arg1 + this.aLong32 - local299);
						this.aLong32 = local299;
					}
				}
			}
		} catch (@Pc(458) IOException local458) {
			this.aLong30 = -1L;
			throw local458;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	private void method898() throws IOException {
		if (this.aLong33 == -1L) {
			return;
		}
		if (this.aLong33 != this.aLong30) {
			this.aClass117_4.method3257(this.aLong33);
			this.aLong30 = this.aLong33;
		}
		this.aClass117_4.method3256(this.anInt997, 0, this.aByteArray8);
		this.aLong30 += this.anInt997;
		if (this.aLong30 > this.aLong34) {
			this.aLong34 = this.aLong30;
		}
		@Pc(59) long local59 = -1L;
		if (this.aLong35 <= this.aLong33 && this.aLong33 < this.aLong35 + (long) this.anInt993) {
			local59 = this.aLong33;
		} else if (this.aLong33 <= this.aLong35 && (long) this.anInt997 + this.aLong33 > this.aLong35) {
			local59 = this.aLong35;
		}
		@Pc(114) long local114 = -1L;
		if (this.aLong35 < (long) this.anInt997 + this.aLong33 && (long) this.anInt993 + this.aLong35 >= (long) this.anInt997 + this.aLong33) {
			local114 = (long) this.anInt997 + this.aLong33;
		} else if (this.aLong33 < this.aLong35 + (long) this.anInt993 && (long) this.anInt993 + this.aLong35 <= this.aLong33 - -((long) this.anInt997)) {
			local114 = this.aLong35 + (long) this.anInt993;
		}
		if (local59 > -1L && local114 > local59) {
			@Pc(206) int local206 = (int) (local114 - local59);
			Static359.method756(this.aByteArray8, (int) (local59 - this.aLong33), this.aByteArray9, (int) (local59 - this.aLong35), local206);
		}
		this.anInt997 = 0;
		this.aLong33 = -1L;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
	private void method899() throws IOException {
		this.anInt993 = 0;
		if (this.aLong32 != this.aLong30) {
			this.aClass117_4.method3257(this.aLong32);
			this.aLong30 = this.aLong32;
		}
		this.aLong35 = this.aLong32;
		while (this.aByteArray9.length > this.anInt993) {
			@Pc(42) int local42 = this.aByteArray9.length - this.anInt993;
			if (local42 > 200000000) {
				local42 = 200000000;
			}
			@Pc(57) int local57 = this.aClass117_4.method3261(this.aByteArray9, this.anInt993, local42);
			if (local57 == -1) {
				break;
			}
			this.aLong30 += local57;
			this.anInt993 += local57;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B[B)V")
	public void method900(@OriginalArg(1) byte[] arg0) throws IOException {
		this.method897(arg0, arg0.length, 0);
	}
}
