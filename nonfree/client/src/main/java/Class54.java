import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class54 {

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	private int anInt2160;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "J")
	private long aLong68 = -1L;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "J")
	private long aLong71 = -1L;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "I")
	private int anInt2162 = 0;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "Lclient!ee;")
	private final Class19 aClass19_1;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "[B")
	private final byte[] aByteArray30;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!ee;II)V")
	public Class54(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass19_1 = arg0;
		this.aLong69 = this.aLong70 = arg0.method661();
		this.aByteArray31 = new byte[arg1];
		this.aLong67 = 0L;
		this.aByteArray30 = new byte[arg2];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([BBII)V")
	public void method1495(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (this.aLong69 < this.aLong67 + (long) arg1) {
				this.aLong69 = (long) arg1 + this.aLong67;
			}
			if (this.aLong71 != -1L && (this.aLong67 < this.aLong71 || this.aLong67 > (long) this.anInt2162 + this.aLong71)) {
				this.method1505();
			}
			if (this.aLong71 != -1L && this.aLong67 + (long) arg1 > (long) this.aByteArray30.length + this.aLong71) {
				@Pc(94) int local94 = (int) (this.aLong71 + (long) this.aByteArray30.length - this.aLong67);
				Static138.method1878(arg0, arg2, this.aByteArray30, (int) (this.aLong67 - this.aLong71), local94);
				this.aLong67 += local94;
				arg1 -= local94;
				this.anInt2162 = this.aByteArray30.length;
				arg2 += local94;
				this.method1505();
			}
			if (arg1 > this.aByteArray30.length) {
				if (this.aLong67 != this.aLong72) {
					this.aClass19_1.method662(this.aLong67);
					this.aLong72 = this.aLong67;
				}
				@Pc(157) long local157 = -1L;
				this.aClass19_1.method663(arg1, arg2, arg0);
				@Pc(166) long local166 = -1L;
				this.aLong72 += arg1;
				if (this.aLong68 < this.aLong67 + (long) arg1 && this.aLong68 + (long) this.anInt2160 >= this.aLong67 + (long) arg1) {
					local157 = (long) arg1 + this.aLong67;
				} else if (this.aLong68 + (long) this.anInt2160 > this.aLong67 && this.aLong68 + (long) this.anInt2160 <= this.aLong67 - -((long) arg1)) {
					local157 = this.aLong68 + (long) this.anInt2160;
				}
				if (this.aLong67 >= this.aLong68 && this.aLong67 < (long) this.anInt2160 + this.aLong68) {
					local166 = this.aLong67;
				} else if (this.aLong68 >= this.aLong67 && (long) arg1 + this.aLong67 > this.aLong68) {
					local166 = this.aLong68;
				}
				if (this.aLong70 < this.aLong72) {
					this.aLong70 = this.aLong72;
				}
				if (local166 > -1L && local157 > local166) {
					@Pc(316) int local316 = (int) (local157 - local166);
					Static138.method1878(arg0, (int) (local166 + (long) arg2 - this.aLong67), this.aByteArray31, (int) (local166 - this.aLong68), local316);
				}
				this.aLong67 += arg1;
			} else if (arg1 > 0) {
				if (this.aLong71 == -1L) {
					this.aLong71 = this.aLong67;
				}
				Static138.method1878(arg0, arg2, this.aByteArray30, (int) (this.aLong67 - this.aLong71), arg1);
				this.aLong67 += arg1;
				if (this.aLong67 - this.aLong71 > (long) this.anInt2162) {
					this.anInt2162 = (int) (this.aLong67 - this.aLong71);
				}
			}
		} catch (@Pc(399) IOException local399) {
			this.aLong72 = -1L;
			throw local399;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZJ)V")
	public void method1496(@OriginalArg(1) long arg0) {
		if (arg0 >= 0L) {
			this.aLong67 = arg0;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)J")
	public long method1498() {
		return this.aLong69;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II[BI)V")
	public void method1501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg2.length < arg1) {
				throw new ArrayIndexOutOfBoundsException(arg1 - arg2.length);
			}
			if (this.aLong71 != -1L && this.aLong71 <= this.aLong67 && (long) this.anInt2162 + this.aLong71 >= (long) arg1 + this.aLong67) {
				Static138.method1878(this.aByteArray30, (int) (this.aLong67 - this.aLong71), arg2, 0, arg1);
				this.aLong67 += arg1;
				return;
			}
			@Pc(74) long local74 = this.aLong67;
			@Pc(78) int local78 = arg1;
			@Pc(117) int local117;
			if (this.aLong67 >= this.aLong68 && (long) this.anInt2160 + this.aLong68 > this.aLong67) {
				local117 = (int) ((long) this.anInt2160 + this.aLong68 - this.aLong67);
				if (arg1 < local117) {
					local117 = arg1;
				}
				Static138.method1878(this.aByteArray31, (int) (this.aLong67 - this.aLong68), arg2, 0, local117);
				arg1 -= local117;
				this.aLong67 += local117;
				arg0 = local117;
			}
			if (this.aByteArray31.length < arg1) {
				this.aClass19_1.method662(this.aLong67);
				this.aLong72 = this.aLong67;
				while (arg1 > 0) {
					local117 = this.aClass19_1.method659(arg0, arg2, arg1);
					if (local117 == -1) {
						break;
					}
					this.aLong72 += local117;
					this.aLong67 += local117;
					arg1 -= local117;
					arg0 += local117;
				}
			} else if (arg1 > 0) {
				this.method1503();
				local117 = arg1;
				if (this.anInt2160 < arg1) {
					local117 = this.anInt2160;
				}
				arg1 -= local117;
				Static138.method1878(this.aByteArray31, 0, arg2, arg0, local117);
				this.aLong67 += local117;
				arg0 += local117;
			}
			if (this.aLong71 != -1L) {
				if (this.aLong71 > this.aLong67 && arg1 > 0) {
					local117 = (int) (this.aLong71 - this.aLong67) + arg0;
					if (arg1 + arg0 < local117) {
						local117 = arg1 + arg0;
					}
					while (local117 > arg0) {
						arg2[arg0++] = 0;
						this.aLong67++;
						arg1--;
					}
				}
				@Pc(314) long local314 = -1L;
				@Pc(316) long local316 = -1L;
				if (local74 <= this.aLong71 && local74 + (long) local78 > this.aLong71) {
					local314 = this.aLong71;
				} else if (local74 >= this.aLong71 && local74 < this.aLong71 + (long) this.anInt2162) {
					local314 = local74;
				}
				if (local74 < this.aLong71 + (long) this.anInt2162 && (long) this.anInt2162 + this.aLong71 <= local74 + (long) local78) {
					local316 = (long) this.anInt2162 + this.aLong71;
				} else if (this.aLong71 < local74 + (long) local78 && (long) local78 + local74 <= (long) this.anInt2162 + this.aLong71) {
					local316 = local74 + (long) local78;
				}
				if (local314 > -1L && local314 < local316) {
					@Pc(434) int local434 = (int) (local316 - local314);
					Static138.method1878(this.aByteArray30, (int) (local314 - this.aLong71), arg2, (int) (local314 - local74), local434);
					if (this.aLong67 < local316) {
						arg1 = (int) ((long) arg1 + this.aLong67 - local316);
						this.aLong67 = local316;
					}
				}
			}
		} catch (@Pc(475) IOException local475) {
			this.aLong72 = -1L;
			throw local475;
		}
		if (arg1 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
	private void method1503() throws IOException {
		this.anInt2160 = 0;
		if (this.aLong67 != this.aLong72) {
			this.aClass19_1.method662(this.aLong67);
			this.aLong72 = this.aLong67;
		}
		this.aLong68 = this.aLong67;
		while (this.aByteArray31.length > this.anInt2160) {
			@Pc(56) int local56 = this.aClass19_1.method659(this.anInt2160, this.aByteArray31, this.aByteArray31.length - this.anInt2160);
			if (local56 == -1) {
				break;
			}
			this.aLong72 += local56;
			this.anInt2160 += local56;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public void method1504() throws IOException {
		this.method1505();
		this.aClass19_1.method658();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	private void method1505() throws IOException {
		if (this.aLong71 == -1L) {
			return;
		}
		if (this.aLong71 != this.aLong72) {
			this.aClass19_1.method662(this.aLong71);
			this.aLong72 = this.aLong71;
		}
		@Pc(28) long local28 = -1L;
		this.aClass19_1.method663(this.anInt2162, 0, this.aByteArray30);
		this.aLong72 += this.anInt2162;
		@Pc(47) long local47 = -1L;
		if (this.aLong71 + (long) this.anInt2162 > this.aLong68 && this.aLong68 + (long) this.anInt2160 >= this.aLong71 - -((long) this.anInt2162)) {
			local28 = (long) this.anInt2162 + this.aLong71;
		} else if (this.aLong71 < (long) this.anInt2160 + this.aLong68 && (long) this.anInt2162 + this.aLong71 >= (long) this.anInt2160 + this.aLong68) {
			local28 = (long) this.anInt2160 + this.aLong68;
		}
		if (this.aLong71 >= this.aLong68 && this.aLong68 + (long) this.anInt2160 > this.aLong71) {
			local47 = this.aLong71;
		} else if (this.aLong68 >= this.aLong71 && this.aLong68 < this.aLong71 + (long) this.anInt2162) {
			local47 = this.aLong68;
		}
		if (this.aLong72 > this.aLong70) {
			this.aLong70 = this.aLong72;
		}
		if (local47 > -1L && local47 < local28) {
			@Pc(200) int local200 = (int) (local28 - local47);
			Static138.method1878(this.aByteArray30, (int) (local47 - this.aLong71), this.aByteArray31, (int) (local47 - this.aLong68), local200);
		}
		this.anInt2162 = 0;
		this.aLong71 = -1L;
	}
}
