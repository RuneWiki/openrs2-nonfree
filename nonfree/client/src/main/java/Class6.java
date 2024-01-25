import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "m", descriptor = "J")
	private long aLong5;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private int anInt30 = 0;

	@OriginalMember(owner = "client!af", name = "k", descriptor = "J")
	private long aLong4 = -1L;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "J")
	private long aLong2 = -1L;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!wi;")
	private final Class266 aClass266_1;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "J")
	private long aLong1;

	@OriginalMember(owner = "client!af", name = "r", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "J")
	private long aLong3;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "[B")
	private final byte[] aByteArray1;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[B")
	private final byte[] aByteArray2;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!wi;II)V")
	public Class6(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass266_1 = arg0;
		this.aLong6 = this.aLong1 = arg0.method5673();
		this.aLong3 = 0L;
		this.aByteArray1 = new byte[arg2];
		this.aByteArray2 = new byte[arg1];
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
	private void method24() throws IOException {
		if (this.aLong4 == -1L) {
			return;
		}
		if (this.aLong5 != this.aLong4) {
			this.aClass266_1.method5676(this.aLong4);
			this.aLong5 = this.aLong4;
		}
		this.aClass266_1.method5678(0, this.anInt30, this.aByteArray1);
		this.aLong5 += this.anInt30;
		if (this.aLong5 > this.aLong1) {
			this.aLong1 = this.aLong5;
		}
		@Pc(59) long local59 = -1L;
		if (this.aLong4 >= this.aLong2 && this.aLong4 < this.aLong2 + (long) this.anInt31) {
			local59 = this.aLong4;
		} else if (this.aLong4 <= this.aLong2 && this.aLong2 < this.aLong4 + (long) this.anInt30) {
			local59 = this.aLong2;
		}
		@Pc(114) long local114 = -1L;
		if ((long) this.anInt30 + this.aLong4 > this.aLong2 && this.aLong4 + (long) this.anInt30 <= (long) this.anInt31 + this.aLong2) {
			local114 = this.aLong4 + (long) this.anInt30;
		} else if (this.aLong4 < (long) this.anInt31 + this.aLong2 && (long) this.anInt31 + this.aLong2 <= this.aLong4 - -((long) this.anInt30)) {
			local114 = (long) this.anInt31 + this.aLong2;
		}
		if (local59 > -1L && local59 < local114) {
			@Pc(203) int local203 = (int) (local114 - local59);
			Static464.method3633(this.aByteArray1, (int) (local59 - this.aLong4), this.aByteArray2, (int) (local59 - this.aLong2), local203);
		}
		this.anInt30 = 0;
		this.aLong4 = -1L;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	private void method25() throws IOException {
		this.anInt31 = 0;
		if (this.aLong3 != this.aLong5) {
			this.aClass266_1.method5676(this.aLong3);
			this.aLong5 = this.aLong3;
		}
		this.aLong2 = this.aLong3;
		while (this.aByteArray2.length > this.anInt31) {
			@Pc(50) int local50 = this.aByteArray2.length - this.anInt31;
			if (local50 > 200000000) {
				local50 = 200000000;
			}
			@Pc(67) int local67 = this.aClass266_1.method5677(this.anInt31, this.aByteArray2, local50);
			if (local67 == -1) {
				break;
			}
			this.anInt31 += local67;
			this.aLong5 += local67;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)J")
	public long method27() {
		return this.aLong6;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(JB)V")
	public void method28(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("Invalid seek to " + arg0 + " in file " + this.method30());
		}
		this.aLong3 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[BI)V")
	public void method29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong6 < this.aLong3 + (long) arg0) {
				this.aLong6 = this.aLong3 + (long) arg0;
			}
			if (this.aLong4 != -1L && (this.aLong4 > this.aLong3 || this.aLong3 > this.aLong4 + (long) this.anInt30)) {
				this.method24();
			}
			if (this.aLong4 != -1L && this.aLong4 + (long) this.aByteArray1.length < this.aLong3 + (long) arg0) {
				@Pc(89) int local89 = (int) ((long) this.aByteArray1.length + this.aLong4 - this.aLong3);
				Static464.method3633(arg2, arg1, this.aByteArray1, (int) (this.aLong3 - this.aLong4), local89);
				arg0 -= local89;
				arg1 += local89;
				this.aLong3 += local89;
				this.anInt30 = this.aByteArray1.length;
				this.method24();
			}
			if (arg0 > this.aByteArray1.length) {
				if (this.aLong5 != this.aLong3) {
					this.aClass266_1.method5676(this.aLong3);
					this.aLong5 = this.aLong3;
				}
				this.aClass266_1.method5678(arg1, arg0, arg2);
				this.aLong5 += arg0;
				if (this.aLong5 > this.aLong1) {
					this.aLong1 = this.aLong5;
				}
				@Pc(172) long local172 = -1L;
				@Pc(174) long local174 = -1L;
				if (this.aLong2 <= this.aLong3 && this.aLong2 + (long) this.anInt31 > this.aLong3) {
					local172 = this.aLong3;
				} else if (this.aLong2 >= this.aLong3 && this.aLong3 + (long) arg0 > this.aLong2) {
					local172 = this.aLong2;
				}
				if (this.aLong3 + (long) arg0 > this.aLong2 && (long) this.anInt31 + this.aLong2 >= (long) arg0 + this.aLong3) {
					local174 = this.aLong3 + (long) arg0;
				} else if (this.aLong2 + (long) this.anInt31 > this.aLong3 && (long) arg0 + this.aLong3 >= this.aLong2 + (long) this.anInt31) {
					local174 = this.aLong2 + (long) this.anInt31;
				}
				if (local172 > -1L && local172 < local174) {
					@Pc(308) int local308 = (int) (local174 - local172);
					Static464.method3633(arg2, (int) ((long) arg1 + local172 - this.aLong3), this.aByteArray2, (int) (local172 - this.aLong2), local308);
				}
				this.aLong3 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong4 == -1L) {
					this.aLong4 = this.aLong3;
				}
				Static464.method3633(arg2, arg1, this.aByteArray1, (int) (this.aLong3 - this.aLong4), arg0);
				this.aLong3 += arg0;
				if ((long) this.anInt30 < this.aLong3 - this.aLong4) {
					this.anInt30 = (int) (this.aLong3 - this.aLong4);
				}
			}
		} catch (@Pc(387) IOException local387) {
			this.aLong5 = -1L;
			throw local387;
		}
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(B)Ljava/io/File;")
	private File method30() {
		return this.aClass266_1.method5675();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BI)V")
	public void method31(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method32(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BZII)V")
	public void method32(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong4 != -1L && this.aLong4 <= this.aLong3 && (long) this.anInt30 + this.aLong4 >= this.aLong3 - -((long) arg2)) {
				Static464.method3633(this.aByteArray1, (int) (this.aLong3 - this.aLong4), arg0, 0, arg2);
				this.aLong3 += arg2;
				return;
			}
			@Pc(77) long local77 = this.aLong3;
			@Pc(81) int local81 = arg2;
			@Pc(119) int local119;
			if (this.aLong3 >= this.aLong2 && (long) this.anInt31 + this.aLong2 > this.aLong3) {
				local119 = (int) (this.aLong2 + (long) this.anInt31 - this.aLong3);
				if (local119 > arg2) {
					local119 = arg2;
				}
				Static464.method3633(this.aByteArray2, (int) (this.aLong3 - this.aLong2), arg0, 0, local119);
				arg1 = local119;
				this.aLong3 += local119;
				arg2 -= local119;
			}
			if (arg2 > this.aByteArray2.length) {
				this.aClass266_1.method5676(this.aLong3);
				this.aLong5 = this.aLong3;
				while (arg2 > 0) {
					local119 = this.aClass266_1.method5677(arg1, arg0, arg2);
					if (local119 == -1) {
						break;
					}
					this.aLong5 += local119;
					arg2 -= local119;
					this.aLong3 += local119;
					arg1 += local119;
				}
			} else if (arg2 > 0) {
				this.method25();
				local119 = arg2;
				if (this.anInt31 < arg2) {
					local119 = this.anInt31;
				}
				Static464.method3633(this.aByteArray2, 0, arg0, arg1, local119);
				this.aLong3 += local119;
				arg2 -= local119;
				arg1 += local119;
			}
			if (this.aLong4 != -1L) {
				if (this.aLong4 > this.aLong3 && arg2 > 0) {
					local119 = arg1 + (int) (this.aLong4 - this.aLong3);
					if (arg2 + arg1 < local119) {
						local119 = arg2 + arg1;
					}
					while (arg1 < local119) {
						arg2--;
						arg0[arg1++] = 0;
						this.aLong3++;
					}
				}
				@Pc(306) long local306 = -1L;
				@Pc(308) long local308 = -1L;
				if (local77 <= this.aLong4 && this.aLong4 < (long) local81 + local77) {
					local306 = this.aLong4;
				} else if (local77 >= this.aLong4 && local77 < this.aLong4 + (long) this.anInt30) {
					local306 = local77;
				}
				if (local77 < this.aLong4 + (long) this.anInt30 && local77 + (long) local81 >= (long) this.anInt30 + this.aLong4) {
					local308 = (long) this.anInt30 + this.aLong4;
				} else if (this.aLong4 < (long) local81 + local77 && local77 + (long) local81 <= (long) this.anInt30 + this.aLong4) {
					local308 = local77 + (long) local81;
				}
				if (local306 > -1L && local306 < local308) {
					@Pc(429) int local429 = (int) (local308 - local306);
					Static464.method3633(this.aByteArray1, (int) (local306 - this.aLong4), arg0, (int) (local306 - local77), local429);
					if (local308 > this.aLong3) {
						arg2 = (int) ((long) arg2 + this.aLong3 - local308);
						this.aLong3 = local308;
					}
				}
			}
		} catch (@Pc(467) IOException local467) {
			this.aLong5 = -1L;
			throw local467;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}
}
