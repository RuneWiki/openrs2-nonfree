import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class44 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	private int anInt1573;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	private int anInt1574 = 0;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "J")
	private long aLong51 = -1L;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "J")
	private long aLong50 = -1L;

	@OriginalMember(owner = "client!na", name = "q", descriptor = "Lclient!k;")
	private final Class36 aClass36_1;

	@OriginalMember(owner = "client!na", name = "t", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!na", name = "b", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "[B")
	private final byte[] aByteArray22;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "[B")
	private final byte[] aByteArray21;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lclient!k;II)V")
	public Class44(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass36_1 = arg0;
		this.aLong53 = this.aLong54 = arg0.method888();
		this.aLong49 = 0L;
		this.aByteArray22 = new byte[arg1];
		this.aByteArray21 = new byte[arg2];
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([BIII)V")
	public void method1099(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 - arg0.length);
			}
			if (this.aLong51 != -1L && this.aLong49 >= this.aLong51 && this.aLong49 + (long) arg2 <= (long) this.anInt1574 + this.aLong51) {
				Static114.method777(this.aByteArray21, (int) (this.aLong49 - this.aLong51), arg0, 0, arg2);
				this.aLong49 += arg2;
				return;
			}
			@Pc(75) long local75 = this.aLong49;
			@Pc(79) int local79 = arg2;
			@Pc(116) int local116;
			if (this.aLong49 >= this.aLong50 && this.aLong49 < this.aLong50 + (long) this.anInt1573) {
				local116 = (int) (this.aLong50 + (long) this.anInt1573 - this.aLong49);
				if (local116 > arg2) {
					local116 = arg2;
				}
				arg2 -= local116;
				Static114.method777(this.aByteArray22, (int) (this.aLong49 - this.aLong50), arg0, 0, local116);
				this.aLong49 += local116;
				arg1 = local116;
			}
			if (this.aByteArray22.length < arg2) {
				this.aClass36_1.method890(this.aLong49);
				this.aLong52 = this.aLong49;
				while (arg2 > 0) {
					local116 = this.aClass36_1.method891(arg2, arg1, arg0);
					if (local116 == -1) {
						break;
					}
					arg1 += local116;
					arg2 -= local116;
					this.aLong52 += local116;
					this.aLong49 += local116;
				}
			} else if (arg2 > 0) {
				this.method1100();
				local116 = arg2;
				if (this.anInt1573 < arg2) {
					local116 = this.anInt1573;
				}
				arg2 -= local116;
				Static114.method777(this.aByteArray22, 0, arg0, arg1, local116);
				arg1 += local116;
				this.aLong49 += local116;
			}
			if (this.aLong51 != -1L) {
				if (this.aLong49 < this.aLong51 && arg2 > 0) {
					@Pc(282) int local282 = arg1 + (int) (this.aLong51 - this.aLong49);
					if (arg2 + arg1 < local282) {
						local282 = arg1 + arg2;
					}
					while (local282 > arg1) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong49++;
					}
				}
				@Pc(314) long local314 = -1L;
				@Pc(316) long local316 = -1L;
				if (local75 <= this.aLong51 && this.aLong51 < (long) local79 + local75) {
					local316 = this.aLong51;
				} else if (local75 >= this.aLong51 && local75 < (long) this.anInt1574 + this.aLong51) {
					local316 = local75;
				}
				if ((long) this.anInt1574 + this.aLong51 > local75 && local75 + (long) local79 >= (long) this.anInt1574 + this.aLong51) {
					local314 = (long) this.anInt1574 + this.aLong51;
				} else if ((long) local79 + local75 > this.aLong51 && local75 + (long) local79 <= this.aLong51 + (long) this.anInt1574) {
					local314 = local75 + (long) local79;
				}
				if (local316 > -1L && local314 > local316) {
					@Pc(427) int local427 = (int) (local314 - local316);
					Static114.method777(this.aByteArray21, (int) (local316 - this.aLong51), arg0, (int) (local316 - local75), local427);
					if (this.aLong49 < local314) {
						arg2 = (int) ((long) arg2 + this.aLong49 - local314);
						this.aLong49 = local314;
					}
				}
			}
		} catch (@Pc(464) IOException local464) {
			this.aLong52 = -1L;
			throw local464;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
	private void method1100() throws IOException {
		this.anInt1573 = 0;
		if (this.aLong49 != this.aLong52) {
			this.aClass36_1.method890(this.aLong49);
			this.aLong52 = this.aLong49;
		}
		this.aLong50 = this.aLong49;
		while (this.anInt1573 < this.aByteArray22.length) {
			@Pc(51) int local51 = this.aClass36_1.method891(this.aByteArray22.length - this.anInt1573, this.anInt1573, this.aByteArray22);
			if (local51 == -1) {
				break;
			}
			this.anInt1573 += local51;
			this.aLong52 += local51;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(JI)V")
	public void method1101(@OriginalArg(0) long arg0) {
		if (arg0 >= (long) 0) {
			this.aLong49 = arg0;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
	public void method1102() throws IOException {
		this.method1104();
		this.aClass36_1.method887();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[BI)V")
	public void method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (this.aLong53 < (long) arg0 + this.aLong49) {
				this.aLong53 = (long) arg0 + this.aLong49;
			}
			if (this.aLong51 != -1L && (this.aLong49 < this.aLong51 || this.aLong51 + (long) this.anInt1574 < this.aLong49)) {
				this.method1104();
			}
			if (this.aLong51 != -1L && (long) arg0 + this.aLong49 > this.aLong51 + (long) this.aByteArray21.length) {
				@Pc(95) int local95 = (int) ((long) this.aByteArray21.length + this.aLong51 - this.aLong49);
				Static114.method777(arg2, arg1, this.aByteArray21, (int) (this.aLong49 - this.aLong51), local95);
				arg1 += local95;
				this.aLong49 += local95;
				arg0 -= local95;
				this.anInt1574 = this.aByteArray21.length;
				this.method1104();
			}
			if (arg0 > this.aByteArray21.length) {
				@Pc(138) long local138 = -1L;
				if (this.aLong49 != this.aLong52) {
					this.aClass36_1.method890(this.aLong49);
					this.aLong52 = this.aLong49;
				}
				@Pc(160) long local160 = -1L;
				this.aClass36_1.method892(arg2, arg0, arg1);
				if (this.aLong50 <= this.aLong49 && this.aLong49 < this.aLong50 + (long) this.anInt1573) {
					local138 = this.aLong49;
				} else if (this.aLong50 >= this.aLong49 && this.aLong49 + (long) arg0 > this.aLong50) {
					local138 = this.aLong50;
				}
				this.aLong52 += arg0;
				if (this.aLong50 < (long) arg0 + this.aLong49 && (long) arg0 + this.aLong49 <= (long) this.anInt1573 + this.aLong50) {
					local160 = this.aLong49 + (long) arg0;
				} else if (this.aLong49 < this.aLong50 + (long) this.anInt1573 && this.aLong50 + (long) this.anInt1573 <= this.aLong49 + (long) arg0) {
					local160 = this.aLong50 + (long) this.anInt1573;
				}
				if (this.aLong52 > this.aLong54) {
					this.aLong54 = this.aLong52;
				}
				if (local138 > -1L && local160 > local138) {
					@Pc(310) int local310 = (int) (local160 - local138);
					Static114.method777(arg2, (int) (local138 + (long) arg1 - this.aLong49), this.aByteArray22, (int) (local138 - this.aLong50), local310);
				}
				this.aLong49 += arg0;
			} else if (arg0 > 0) {
				if (this.aLong51 == -1L) {
					this.aLong51 = this.aLong49;
				}
				Static114.method777(arg2, arg1, this.aByteArray21, (int) (this.aLong49 - this.aLong51), arg0);
				this.aLong49 += arg0;
				if ((long) this.anInt1574 < this.aLong49 - this.aLong51) {
					this.anInt1574 = (int) (this.aLong49 - this.aLong51);
				}
			}
		} catch (@Pc(390) IOException local390) {
			this.aLong52 = -1L;
			throw local390;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	private void method1104() throws IOException {
		if (this.aLong51 == -1L) {
			return;
		}
		if (this.aLong52 != this.aLong51) {
			this.aClass36_1.method890(this.aLong51);
			this.aLong52 = this.aLong51;
		}
		this.aClass36_1.method892(this.aByteArray21, this.anInt1574, 0);
		@Pc(39) long local39 = -1L;
		this.aLong52 += this.anInt1574;
		@Pc(49) long local49 = -1L;
		if (this.aLong52 > this.aLong54) {
			this.aLong54 = this.aLong52;
		}
		if (this.aLong51 + (long) this.anInt1574 > this.aLong50 && this.aLong51 + (long) this.anInt1574 <= (long) this.anInt1573 + this.aLong50) {
			local49 = this.aLong51 + (long) this.anInt1574;
		} else if (this.aLong51 < (long) this.anInt1573 + this.aLong50 && this.aLong50 + (long) this.anInt1573 <= this.aLong51 + (long) this.anInt1574) {
			local49 = (long) this.anInt1573 + this.aLong50;
		}
		if (this.aLong50 <= this.aLong51 && this.aLong51 < (long) this.anInt1573 + this.aLong50) {
			local39 = this.aLong51;
		} else if (this.aLong51 <= this.aLong50 && this.aLong50 < this.aLong51 + (long) this.anInt1574) {
			local39 = this.aLong50;
		}
		if (local39 > -1L && local49 > local39) {
			@Pc(197) int local197 = (int) (local49 - local39);
			Static114.method777(this.aByteArray21, (int) (local39 - this.aLong51), this.aByteArray22, (int) (local39 - this.aLong50), local197);
		}
		this.anInt1574 = 0;
		this.aLong51 = -1L;
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)J")
	public long method1105() {
		return this.aLong53;
	}
}
