import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class191 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!ha;")
	private Class1_Sub6_Sub5 aClass1_Sub6_Sub5_3;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "Lclient!mca;")
	public Class8_Sub7 aClass8_Sub7_4;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	private int anInt4747;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	private int anInt4748;

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
	private int anInt4753;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "Lclient!rk;")
	private Class290 aClass290_2;

	@OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
	private int anInt4760;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "Lclient!da;")
	private Class63 aClass63_4;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "Z")
	private boolean aBoolean357 = false;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	private int anInt4751 = -1;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
	private int anInt4758 = 0;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	private int anInt4765 = -1;

	@OriginalMember(owner = "client!kh", name = "k", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
	private int anInt4767 = 0;

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
	private int anInt4769 = -1;

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	public final int anInt4755;

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "B")
	private final byte aByte74;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	public final int anInt4749;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	public final int anInt4757;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "B")
	private final byte aByte73;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
	private int anInt4752;

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "Z")
	private final boolean aBoolean359;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!r;Lclient!et;IIIIIIZI)V")
	public Class191(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt4755 = arg1.lb;
		this.aBoolean357 = arg8;
		this.aByte74 = (byte) arg5;
		this.anInt4749 = arg2;
		this.anInt4757 = arg3;
		this.anInt4770 = arg7;
		this.aByte73 = (byte) arg4;
		this.anInt4752 = arg6;
		this.aBoolean359 = arg0.method6905() && arg1.aBoolean176 && !this.aBoolean357;
		if (arg9 != -1) {
			this.aBoolean358 = true;
		}
		this.method3848(arg9);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!da;IILclient!q;ZIIILclient!r;)V")
	public void method3842(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class113 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class134 arg7) {
		@Pc(20) Class206[] local20 = arg0.method7421();
		@Pc(23) Class158[] local23 = arg0.method7413();
		if ((this.aClass8_Sub7_4 == null || this.aClass8_Sub7_4.aBoolean436) && (local20 != null || local23 != null)) {
			@Pc(40) Class95 local40 = Static518.aClass96_4.method1925(this.anInt4755);
			if (local40.anIntArray208 != null) {
				local40 = local40.method1922(Static430.aClass321_1);
			}
			if (local40 != null) {
				this.aClass8_Sub7_4 = Static318.method4392(Static301.anInt5197, true);
			}
		}
		if (this.aClass8_Sub7_4 == null) {
			return;
		}
		arg0.method7409(arg3);
		if (arg4) {
			this.aClass8_Sub7_4.method4399(arg7, (long) Static301.anInt5197, local20, local23);
		} else {
			this.aClass8_Sub7_4.method4391((long) Static301.anInt5197);
		}
		this.aClass8_Sub7_4.method4396(this.aByte73, arg5, arg2, arg1, arg6);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)V")
	private void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass290_2 == null) {
				if (this.aBoolean358) {
					return;
				}
				this.method3848(-1);
				if (this.aClass290_2 == null) {
					return;
				}
			}
			@Pc(35) int local35 = Static301.anInt5197 - this.anInt4760;
			if (local35 > 100 && this.aClass290_2.anInt7806 > 0) {
				@Pc(52) int local52 = this.aClass290_2.anIntArray604.length - this.aClass290_2.anInt7806;
				while (this.anInt4747 < local52 && local35 > this.aClass290_2.anIntArray603[this.anInt4747]) {
					local35 -= this.aClass290_2.anIntArray603[this.anInt4747];
					this.anInt4747++;
				}
				if (local52 <= this.anInt4747) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local52; local93 < this.aClass290_2.anIntArray604.length; local93++) {
						local91 += this.aClass290_2.anIntArray603[local93];
					}
					local35 %= local91;
				}
				this.anInt4748 = this.anInt4747 + 1;
				if (this.anInt4748 >= this.aClass290_2.anIntArray604.length) {
					this.anInt4748 -= this.aClass290_2.anInt7806;
					if (this.anInt4748 < 0 || this.anInt4748 >= this.aClass290_2.anIntArray604.length) {
						this.anInt4748 = -1;
					}
				}
			}
			while (local35 > this.aClass290_2.anIntArray603[this.anInt4747]) {
				Static137.method2090(this.aClass290_2, arg0, this.anInt4747, false, arg1, this.aByte73);
				local35 -= this.aClass290_2.anIntArray603[this.anInt4747];
				this.anInt4747++;
				if (this.aClass290_2.anIntArray604.length <= this.anInt4747) {
					this.anInt4747 -= this.aClass290_2.anInt7806;
					if (this.anInt4747 < 0 || this.anInt4747 >= this.aClass290_2.anIntArray604.length) {
						this.aClass290_2 = null;
						continue label80;
					}
				}
				this.anInt4748 = this.anInt4747 + 1;
				if (this.anInt4748 >= this.aClass290_2.anIntArray604.length) {
					this.anInt4748 -= this.aClass290_2.anInt7806;
					if (this.anInt4748 < 0 || this.aClass290_2.anIntArray604.length <= this.anInt4748) {
						this.anInt4748 = -1;
					}
				}
			}
			this.anInt4760 = Static301.anInt5197 - local35;
			this.anInt4753 = local35;
			return;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z")
	public boolean method3844() {
		return this.aBoolean359;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
	public void method3846(@OriginalArg(0) int arg0) {
		this.aBoolean358 = true;
		this.method3848(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
	public int method3847() {
		return this.anInt4758;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(II)V")
	private void method3848(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(17) boolean local17 = false;
		if (arg0 == -1) {
			@Pc(27) Class95 local27 = Static518.aClass96_4.method1925(this.anInt4755);
			@Pc(29) Class95 local29 = local27;
			if (local27.anIntArray208 != null) {
				local27 = local27.method1922(Static430.aClass321_1);
			}
			if (local27 == null) {
				return;
			}
			if (local29 == local27) {
				local29 = null;
			}
			if (local27.anIntArray209 != null) {
				if (this.aClass290_2 != null && local27.method1921(this.aClass290_2.anInt7809)) {
					return;
				}
				local7 = local27.method1918();
				if (local27.lb != this.anInt4769) {
					local17 = local27.aBoolean185;
				}
			} else if (local27.anInt2406 == -1) {
				if (local29 != null && local29.anIntArray209 != null) {
					if (this.aClass290_2 != null && local29.method1921(this.aClass290_2.anInt7809)) {
						return;
					}
					local7 = local29.method1918();
					if (this.anInt4769 != local29.lb) {
						local17 = local29.aBoolean185;
					}
				} else if (local29 != null && local29.anInt2406 != -1 && local29.lb != this.anInt4769) {
					local17 = local29.aBoolean185;
					local7 = local29.anInt2406;
				}
			} else if (local27.lb != this.anInt4769) {
				local17 = local27.aBoolean185;
				local7 = local27.anInt2406;
			}
		}
		if (local7 == -1) {
			this.aClass290_2 = null;
			return;
		}
		this.aClass63_4 = null;
		if (this.aClass290_2 == null || this.aClass290_2.anInt7809 != local7) {
			this.aClass290_2 = Static192.aClass211_1.method4277(local7);
		} else if (this.aClass290_2.anInt7801 == 0) {
			return;
		}
		if (this.aClass290_2.anIntArray604 == null) {
			this.aClass290_2 = null;
			return;
		}
		if (local17) {
			this.anInt4747 = (int) (Math.random() * (double) this.aClass290_2.anIntArray604.length);
			this.anInt4753 = (int) ((double) this.aClass290_2.anIntArray603[this.anInt4747] * Math.random()) + 1;
		} else {
			this.anInt4747 = 0;
			this.anInt4753 = 1;
		}
		this.anInt4748 = this.anInt4747 + 1;
		if (this.anInt4748 < 0 || this.anInt4748 >= this.aClass290_2.anIntArray604.length) {
			this.anInt4748 = -1;
		}
		this.anInt4760 = Static301.anInt5197 - this.anInt4753;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZLclient!r;IZII)Lclient!da;")
	public Class63 method3850(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class95 local11 = Static518.aClass96_4.method1925(this.anInt4755);
		if (local11.anIntArray208 != null) {
			local11 = local11.method1922(Static430.aClass321_1);
		}
		if (local11 == null) {
			this.method3851(arg1);
			this.anInt4765 = -1;
			this.anInt4751 = -1;
			this.anInt4769 = -1;
			return null;
		}
		if (!this.aBoolean358 && this.anInt4769 != local11.lb) {
			this.aClass63_4 = null;
			this.method3848(-1);
		}
		this.method3843(arg5, arg4);
		if (arg3) {
			@Pc(74) boolean local74 = arg3 & this.aBoolean359 & Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222) != 0;
			arg3 = local74 & (this.anInt4765 != local11.lb || this.aClass290_2 != null && Static348.aClass1_Sub30_Sub1_1.method3908(Static113.anInt2222) >= 2 && (this.anInt4751 != this.anInt4747 || (this.aClass290_2.aBoolean602 || Static444.aBoolean410) && this.anInt4747 != this.anInt4748));
		}
		if (arg0 && !arg3) {
			this.anInt4769 = local11.lb;
			return null;
		}
		if (arg3) {
			Static443.method6124(this.aClass1_Sub6_Sub5_3, this.aByte74, this.anInt4752, this.anInt4770, this.aBooleanArray8);
			this.anInt4751 = -1;
			this.anInt4765 = -1;
		}
		@Pc(150) Class47 local150 = Static199.aClass47Array1[this.aByte74];
		@Pc(163) Class47 local163;
		if (this.aBoolean357) {
			local163 = Static216.aClass47Array2[0];
		} else {
			local163 = this.aByte74 >= 3 ? null : Static199.aClass47Array1[this.aByte74 + 1];
		}
		@Pc(182) Class63 local182 = null;
		if (this.aClass290_2 != null) {
			if (arg3) {
				arg2 |= 0x40000;
			}
			local182 = local11.method1911(this.anInt4747, this.anInt4748, this.anInt4753, this.anInt4749 == 11 ? this.anInt4757 + 4 : this.anInt4757, this.aClass290_2, this.anInt4770, arg1, local150.method7550(this.anInt4752, this.anInt4770), this.anInt4752, this.anInt4749 == 11 ? 10 : this.anInt4749, local150, arg2, local163);
			if (local182 == null) {
				this.aClass1_Sub6_Sub5_3 = null;
				this.anInt4767 = 0;
				this.aBooleanArray8 = null;
				this.anInt4758 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray8 == null) {
						this.aBooleanArray8 = new boolean[4];
					}
					this.aClass1_Sub6_Sub5_3 = local182.S(this.aClass1_Sub6_Sub5_3);
					Static439.method6098(this.aClass1_Sub6_Sub5_3, this.aByte74, arg5, arg4, this.aBooleanArray8);
					this.anInt4751 = this.anInt4747;
					this.anInt4765 = local11.lb;
				}
				this.anInt4758 = local182.J();
				this.anInt4767 = local182.RA();
			}
			this.aClass63_4 = null;
		} else if (this.aClass63_4 != null && arg2 == (arg2 & this.aClass63_4.PA()) && this.anInt4769 == local11.lb) {
			local182 = this.aClass63_4;
		} else {
			if (this.aClass63_4 != null) {
				arg2 |= this.aClass63_4.PA();
			}
			@Pc(365) Class254 local365 = local11.method1909(local150, local150.method7550(this.anInt4752, this.anInt4770), this.anInt4749 == 11 ? 10 : this.anInt4749, arg1, arg3, this.anInt4752, arg2, this.anInt4749 == 11 ? this.anInt4757 + 4 : this.anInt4757, local163, this.anInt4770);
			if (local365 == null) {
				this.aClass1_Sub6_Sub5_3 = null;
				this.anInt4767 = 0;
				this.anInt4758 = 0;
				this.aBooleanArray8 = null;
				this.aClass63_4 = null;
			} else {
				local182 = local365.aClass63_5;
				this.aClass63_4 = local365.aClass63_5;
				if (arg3) {
					this.aClass1_Sub6_Sub5_3 = local365.aClass1_Sub6_Sub5_4;
					this.aBooleanArray8 = null;
					Static439.method6098(this.aClass1_Sub6_Sub5_3, this.aByte74, arg5, arg4, null);
					this.anInt4751 = -1;
					this.anInt4765 = local11.lb;
				}
				this.anInt4758 = local182.J();
				this.anInt4767 = local182.RA();
			}
		}
		this.anInt4769 = local11.lb;
		this.anInt4752 = arg5;
		this.anInt4770 = arg4;
		return local182;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!r;)V")
	public void method3851(@OriginalArg(1) Class134 arg0) {
		if (this.aClass1_Sub6_Sub5_3 != null) {
			Static443.method6124(this.aClass1_Sub6_Sub5_3, this.aByte74, this.anInt4752, this.anInt4770, this.aBooleanArray8);
			this.aBooleanArray8 = null;
			this.aClass1_Sub6_Sub5_3 = null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub7_4 != null) {
			this.aClass8_Sub7_4.method4397();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)I")
	public int method3852(@OriginalArg(0) int arg0) {
		return arg0 > -38 ? 120 : this.anInt4767;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BLclient!r;)V")
	public void method3854(@OriginalArg(1) Class134 arg0) {
		this.method3850(true, arg0, 262144, true, this.anInt4770, this.anInt4752);
	}
}
