import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class10_Sub6 extends Class10 {

	@OriginalMember(owner = "client!se", name = "s", descriptor = "Lclient!em;")
	private Class47_Sub1 aClass47_Sub1_5;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!kk;")
	private Class81_Sub2 aClass81_Sub2_3 = null;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	private int anInt5130 = -1;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "I")
	private int anInt5137 = 0;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "I")
	private int anInt5135 = -32768;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "I")
	private int anInt5147 = 0;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "I")
	private int anInt5149 = -1;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!se", name = "X", descriptor = "Z")
	private boolean aBoolean359 = false;

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "I")
	private int anInt5156 = 0;

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "Z")
	private boolean aBoolean360 = true;

	@OriginalMember(owner = "client!se", name = "O", descriptor = "I")
	private int anInt5148;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	private int anInt5129;

	@OriginalMember(owner = "client!se", name = "S", descriptor = "I")
	private int anInt5152;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "I")
	private int anInt5143;

	@OriginalMember(owner = "client!se", name = "J", descriptor = "I")
	private int anInt5144;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	private int anInt5131;

	@OriginalMember(owner = "client!se", name = "L", descriptor = "Lclient!bg;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "I")
	private int anInt5142;

	@OriginalMember(owner = "client!se", name = "V", descriptor = "I")
	private int anInt5154;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "I")
	private int anInt5141;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "I")
	private int anInt5153;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIIIZLclient!qf;)V")
	public Class10_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class10 arg8) {
		this.anInt5148 = arg3;
		this.anInt5129 = arg0;
		this.anInt5152 = arg1;
		this.anInt5143 = arg5;
		this.anInt5144 = arg2;
		this.anInt5131 = arg4;
		if (arg8 != null) {
			this.aBoolean358 = true;
			if (arg8 instanceof Class10_Sub6) {
				@Pc(61) Class10_Sub6 local61 = (Class10_Sub6) arg8;
				if (Static283.aBoolean393) {
					local61.method4233();
				}
				this.aClass15_2 = local61.aClass15_2;
				this.anInt5142 = local61.anInt5142;
				this.anInt5154 = local61.anInt5154;
				this.anInt5141 = local61.anInt5141;
				this.anInt5153 = local61.anInt5153;
			} else if (Static283.aBoolean393) {
				@Pc(96) Class49 local96 = Static175.method2874(this.anInt5129);
				if (local96.anIntArray131 != null) {
					local96 = local96.method1112();
				}
				if (local96 != null) {
					Static253.method4290(this.anInt5148, this.anInt5144, this.anInt5152, this.anInt5131, 0, local96, 0, this.anInt5143);
				}
			}
		}
		if (this.aBoolean358) {
			this.method4229(arg6);
		}
		if (Static283.aBoolean393 && arg8 != null) {
			this.method4227(true);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BZ)Lclient!qf;")
	private Class10 method4227(@OriginalArg(1) boolean arg0) {
		@Pc(12) boolean local12 = Static258.anIntArrayArrayArray15 != Static256.anIntArrayArrayArray14;
		@Pc(17) Class49 local17 = Static175.method2874(this.anInt5129);
		if (local17.anIntArray131 != null) {
			local17 = local17.method1112();
		}
		if (local17 == null) {
			if (Static283.aBoolean393 && !local12) {
				this.method4233();
			}
			this.anInt5149 = this.anInt5153;
			this.anInt5130 = -1;
			return null;
		}
		if (!this.aBoolean358 && this.anInt5130 != local17.anInt1376) {
			this.method4229(-1);
		}
		@Pc(62) int local62 = this.anInt5144 & 0x3;
		@Pc(74) int local74;
		@Pc(71) int local71;
		if (local62 == 1 || local62 == 3) {
			local71 = local17.anInt1360;
			local74 = local17.anInt1329;
		} else {
			local71 = local17.anInt1329;
			local74 = local17.anInt1360;
		}
		@Pc(91) int local91 = (local74 + 1 >> 1) + this.anInt5131;
		@Pc(98) int local98 = (local71 >> 1) + this.anInt5143;
		@Pc(105) int local105 = (local74 >> 1) + this.anInt5131;
		@Pc(114) int local114 = this.anInt5143 + (local71 + 1 >> 1);
		this.method4231(local98 * 128, local105 * 128);
		@Pc(168) boolean local168 = !local12 && local17.aBoolean112 && (local17.anInt1376 != this.anInt5130 || (this.anInt5153 != this.anInt5149 || this.aClass15_2 != null && (this.aClass15_2.aBoolean38 || Static146.aBoolean417) && this.anInt5141 != this.anInt5153) && Static86.anInt1599 >= 2);
		if (arg0 && !local168) {
			this.anInt5130 = local17.anInt1376;
			this.anInt5149 = this.anInt5153;
			return null;
		}
		@Pc(188) int[][] local188 = Static256.anIntArrayArrayArray14[this.anInt5148];
		@Pc(215) int local215 = local188[local105][local98] + local188[local91][local98] + local188[local105][local114] + local188[local91][local114] >> 2;
		@Pc(225) int local225 = (this.anInt5131 << 7) + (local74 << 6);
		@Pc(235) int local235 = (this.anInt5143 << 7) + (local71 << 6);
		@Pc(238) int[][] local238 = null;
		if (local12) {
			local238 = Static258.anIntArrayArrayArray15[0];
		} else if (this.anInt5148 < 3) {
			local238 = Static256.anIntArrayArrayArray14[this.anInt5148 + 1];
		}
		if (Static283.aBoolean393 && local168) {
			Static193.method3206(this.aClass81_Sub2_3, this.anInt5147, this.anInt5137, this.anInt5156);
		}
		@Pc(288) boolean local288 = this.aClass81_Sub2_3 == null;
		@Pc(320) Class174 local320;
		if (this.aClass15_2 == null) {
			local320 = local17.method1115(false, local235, local188, this.anInt5152, local288 ? Static63.aClass81_Sub2_1 : this.aClass81_Sub2_3, local225, local215, local168, this.anInt5144, local238);
		} else {
			local320 = local17.method1120(this.anInt5142, local238, this.anInt5153, this.anInt5152, this.anInt5144, local188, local215, local235, local168, local288 ? Static63.aClass81_Sub2_1 : this.aClass81_Sub2_3, this.anInt5141, this.aClass15_2, local225);
		}
		if (local320 == null) {
			this.anInt5130 = local17.anInt1376;
			this.anInt5149 = this.anInt5153;
			return null;
		}
		if (Static283.aBoolean393 && local168) {
			if (local288) {
				Static63.aClass81_Sub2_1 = local320.aClass81_Sub2_4;
			}
			@Pc(369) int local369 = 0;
			if (this.anInt5148 != 0) {
				@Pc(379) int[][] local379 = Static256.anIntArrayArrayArray14[0];
				local369 = local215 - (local379[local91][local114] + local379[local91][local98] + local379[local105][local98] + local379[local105][local114] >> 2);
			}
			@Pc(410) Class81_Sub2 local410 = local320.aClass81_Sub2_4;
			if (this.aBoolean360 && Static193.method3212(local410, local225, local369, local235)) {
				this.aBoolean360 = false;
			}
			if (!this.aBoolean360) {
				Static193.method3207(local410, local225, local369, local235);
				this.aClass81_Sub2_3 = local410;
				this.anInt5156 = local235;
				this.anInt5147 = local225;
				if (local288) {
					Static63.aClass81_Sub2_1 = null;
				}
				this.anInt5137 = local369;
			}
		}
		this.anInt5149 = this.anInt5153;
		this.anInt5130 = local17.anInt1376;
		return local320.aClass10_10;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		return this.anInt5135;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	private void method4229(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class49 local19 = Static175.method2874(this.anInt5129);
			@Pc(21) Class49 local21 = local19;
			if (local19.anIntArray131 != null) {
				local19 = local19.method1112();
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray129 != null) {
				if (this.aClass15_2 != null && local19.method1125(this.aClass15_2.anInt417)) {
					return;
				}
				local7 = local19.method1107();
				if (this.anInt5130 != local19.anInt1376) {
					local9 = local19.aBoolean111;
				}
			} else if (local19.anInt1354 == -1) {
				if (local21 != null && local21.anIntArray129 != null) {
					if (this.aClass15_2 != null && local21.method1125(this.aClass15_2.anInt417)) {
						return;
					}
					local7 = local21.method1107();
					if (this.anInt5130 != local21.anInt1376) {
						local9 = local21.aBoolean111;
					}
				} else if (local21 != null && local21.anInt1354 != -1 && this.anInt5130 != local21.anInt1376) {
					local7 = local21.anInt1354;
					local9 = local21.aBoolean111;
				}
			} else if (local19.anInt1376 != this.anInt5130) {
				local9 = local19.aBoolean111;
				local7 = local19.anInt1354;
			}
		}
		if (local7 == -1) {
			this.aClass15_2 = null;
			return;
		}
		if (this.aClass15_2 == null || this.aClass15_2.anInt417 != local7) {
			this.aClass15_2 = Static253.method4288(local7);
		} else if (this.aClass15_2.anInt412 == 0) {
			return;
		}
		if (local9) {
			this.anInt5153 = (int) (Math.random() * (double) this.aClass15_2.anIntArray35.length);
			this.anInt5142 = (int) ((double) this.aClass15_2.anIntArray36[this.anInt5153] * Math.random()) + 1;
		} else {
			this.anInt5142 = 1;
			this.anInt5153 = 0;
		}
		this.anInt5141 = this.anInt5153 + 1;
		if (this.anInt5141 < 0 || this.anInt5141 >= this.aClass15_2.anIntArray35.length) {
			this.anInt5141 = -1;
		}
		this.anInt5154 = Static124.anInt2371 - this.anInt5142;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qf;I)V")
	private void method4230(@OriginalArg(0) Class10 arg0) {
		@Pc(32) Class49 local32;
		if (Static283.aBoolean393) {
			@Pc(12) Class10_Sub4_Sub1 local12 = (Class10_Sub4_Sub1) arg0;
			if ((this.aClass47_Sub1_5 == null || this.aClass47_Sub1_5.aBoolean103) && (local12.aClass190Array2 != null || local12.aClass67Array2 != null)) {
				local32 = Static175.method2874(this.anInt5129);
				if (local32.anIntArray131 != null) {
					local32 = local32.method1112();
				}
				if (local32 != null) {
					this.aClass47_Sub1_5 = new Class47_Sub1(Static124.anInt2371, local32.anInt1360, local32.anInt1329);
				}
			}
			if (this.aClass47_Sub1_5 != null) {
				this.aClass47_Sub1_5.method1089(local12.aClass190Array2, local12.aClass67Array2, false, local12.anIntArray174, local12.anIntArray177, local12.anIntArray173);
			}
		} else {
			@Pc(78) Class10_Sub4_Sub2 local78 = (Class10_Sub4_Sub2) arg0;
			if ((this.aClass47_Sub1_5 == null || this.aClass47_Sub1_5.aBoolean103) && (local78.aClass190Array3 != null || local78.aClass67Array3 != null)) {
				local32 = Static175.method2874(this.anInt5129);
				if (local32.anIntArray131 != null) {
					local32 = local32.method1112();
				}
				if (local32 != null) {
					this.aClass47_Sub1_5 = new Class47_Sub1(Static124.anInt2371, local32.anInt1360, local32.anInt1329);
				}
			}
			if (this.aClass47_Sub1_5 != null) {
				this.aClass47_Sub1_5.method1089(local78.aClass190Array3, local78.aClass67Array3, false, local78.anIntArray239, local78.anIntArray233, local78.anIntArray245);
			}
		}
		this.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
	private void method4231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label86: while (true) {
			if (this.aClass15_2 == null) {
				if (this.aBoolean358) {
					return;
				}
				this.method4229(-1);
				if (this.aClass15_2 == null) {
					return;
				}
			}
			@Pc(35) int local35 = Static124.anInt2371 - this.anInt5154;
			if (local35 > 100 && this.aClass15_2.anInt424 > 0) {
				@Pc(58) int local58 = this.aClass15_2.anIntArray35.length - this.aClass15_2.anInt424;
				while (this.anInt5153 < local58 && this.aClass15_2.anIntArray36[this.anInt5153] < local35) {
					local35 -= this.aClass15_2.anIntArray36[this.anInt5153];
					this.anInt5153++;
				}
				if (local58 <= this.anInt5153) {
					@Pc(101) int local101 = 0;
					for (@Pc(103) int local103 = local58; local103 < this.aClass15_2.anIntArray35.length; local103++) {
						local101 += this.aClass15_2.anIntArray36[local103];
					}
					local35 %= local101;
				}
				this.anInt5141 = this.anInt5153 + 1;
				if (this.anInt5141 >= this.aClass15_2.anIntArray35.length) {
					this.anInt5141 -= this.aClass15_2.anInt424;
					if (this.anInt5141 < 0 || this.aClass15_2.anIntArray35.length <= this.anInt5141) {
						this.anInt5141 = -1;
					}
				}
			}
			while (this.aClass15_2.anIntArray36[this.anInt5153] < local35) {
				Static158.method2622(arg1, this.anInt5153, this.aClass15_2, false, arg0);
				local35 -= this.aClass15_2.anIntArray36[this.anInt5153];
				this.anInt5153++;
				if (this.aClass15_2.anIntArray35.length <= this.anInt5153) {
					this.anInt5153 -= this.aClass15_2.anInt424;
					if (this.anInt5153 < 0 || this.aClass15_2.anIntArray35.length <= this.anInt5153) {
						this.aClass15_2 = null;
						continue label86;
					}
				}
				this.anInt5141 = this.anInt5153 + 1;
				if (this.anInt5141 >= this.aClass15_2.anIntArray35.length) {
					this.anInt5141 -= this.aClass15_2.anInt424;
					if (this.anInt5141 < 0 || this.aClass15_2.anIntArray35.length <= this.anInt5141) {
						this.anInt5141 = -1;
					}
				}
			}
			this.anInt5142 = local35;
			this.anInt5154 = Static124.anInt2371 - local35;
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class10 local5 = null;
		if (Static283.aBoolean393) {
			local5 = this.method4227(true);
		} else {
			this.method4231(arg4, arg3);
		}
		if (!this.aBoolean359) {
			if (local5 == null) {
				local5 = this.method4232();
			}
			if (local5 == null) {
				return;
			}
			this.method4230(local5);
		}
		if (this.aClass47_Sub1_5 != null) {
			this.aClass47_Sub1_5.method1093(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!se", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass47_Sub1_5 != null) {
			this.aClass47_Sub1_5.method1092();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		@Pc(7) Class10 local7 = this.method4232();
		if (local7 != null) {
			this.method4230(local7);
			local7.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_5);
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)Lclient!qf;")
	public Class10 method4232() {
		return this.method4227(false);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	public void method4233() {
		if (this.aClass81_Sub2_3 != null) {
			Static193.method3206(this.aClass81_Sub2_3, this.anInt5147, this.anInt5137, this.anInt5156);
			this.aClass81_Sub2_3 = null;
		}
	}
}
