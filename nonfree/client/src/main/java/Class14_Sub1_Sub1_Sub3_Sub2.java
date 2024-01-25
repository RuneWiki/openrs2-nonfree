import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class14_Sub1_Sub1_Sub3_Sub2 extends Class14_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!fs", name = "id", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!fs", name = "md", descriptor = "I")
	public int anInt2995;

	@OriginalMember(owner = "client!fs", name = "qd", descriptor = "Lclient!hh;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!fs", name = "sd", descriptor = "Lclient!pha;")
	public Class271 aClass271_1;

	@OriginalMember(owner = "client!fs", name = "Zc", descriptor = "I")
	public int anInt2983 = 1;

	@OriginalMember(owner = "client!fs", name = "gd", descriptor = "I")
	public int anInt2990 = -1;

	@OriginalMember(owner = "client!fs", name = "Yc", descriptor = "I")
	public int anInt2982 = -1;

	@OriginalMember(owner = "client!fs", name = "dd", descriptor = "I")
	public int anInt2987 = 1;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)I")
	@Override
	public int method7994() {
		return this.aClass271_1 == null ? 0 : this.aClass271_1.anInt7319;
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7992() {
		return false;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!kf;Lclient!ha;IIIZI)V")
	@Override
	public void method7996(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(Z)I")
	@Override
	public int method2518() {
		if (this.aClass271_1.anIntArray591 != null) {
			@Pc(13) Class271 local13 = this.aClass271_1.method6476(Static564.aClass304_1);
			if (local13 != null && local13.anInt7326 != -1) {
				return local13.anInt7326;
			}
		}
		return this.aClass271_1.anInt7326 == -1 ? super.method2518() : this.aClass271_1.anInt7326;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)Z")
	public boolean method2527() {
		return this.aClass271_1 != null;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7997(@OriginalArg(0) Class126 arg0) {
		if (this.aClass271_1 == null || !super.aBoolean259 && !this.method2531(0, arg0)) {
			return;
		}
		@Pc(20) Class117 local20 = arg0.method7018();
		local20.method7242(super.aClass130_7.method2930());
		local20.method7247(super.anInt9317, super.anInt9321 - 20, super.anInt9315);
		this.method2516(super.aClass180Array3, arg0, local20, super.aBoolean259);
		super.aClass180Array3[0] = super.aClass180Array3[1] = super.aClass180Array3[2] = null;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!ha;)Lclient!ck;")
	@Override
	public Class55 method7999(@OriginalArg(1) Class126 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)I")
	@Override
	protected int method2524() {
		if (this.aClass271_1.anIntArray591 != null) {
			@Pc(13) Class271 local13 = this.aClass271_1.method6476(Static564.aClass304_1);
			if (local13 != null && local13.anInt7312 != -1) {
				return local13.anInt7312;
			}
		}
		return this.aClass271_1.anInt7312;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(ILclient!ha;)Lclient!ww;")
	@Override
	public Class14_Sub10 method8002(@OriginalArg(1) Class126 arg0) {
		if (this.aClass271_1 == null || !this.method2531(2048, arg0)) {
			return null;
		}
		@Pc(19) Class117 local19 = arg0.method7018();
		@Pc(24) int local24 = super.aClass130_7.method2930();
		local19.method7242(local24);
		@Pc(42) Class156 local42 = Static535.aClass156ArrayArrayArray2[super.aByte125][super.anInt9317 >> Static162.anInt2830][super.anInt9315 >> Static162.anInt2830];
		if (local42 == null || local42.aClass14_Sub1_Sub5_1 == null) {
			super.anInt2907 = (int) ((float) super.anInt2907 - (float) super.anInt2907 / 10.0F);
		} else {
			@Pc(60) int local60 = super.anInt2907 - local42.aClass14_Sub1_Sub5_1.aShort102;
			super.anInt2907 = (int) ((float) super.anInt2907 - (float) local60 / 10.0F);
		}
		local19.method7247(super.anInt9317, -super.anInt2907 + super.anInt9321 - 20, super.anInt9315);
		@Pc(103) Class295 local103 = this.method2519();
		@Pc(116) Class271 local116 = this.aClass271_1.anIntArray591 == null ? this.aClass271_1 : this.aClass271_1.method6476(Static564.aClass304_1);
		super.aBoolean258 = false;
		@Pc(121) Class14_Sub10 local121 = null;
		if (Static627.aClass5_Sub46_31.aClass11_Sub26_1.method7773() == 1 && local116.aBoolean610 && local103.aBoolean661) {
			@Pc(154) Class200 local154 = super.anInt2930 != -1 && super.anInt2918 == 0 ? Static396.aClass359_2.method8415(super.anInt2930) : null;
			@Pc(171) Class200 local171 = super.anInt2924 == -1 || super.aBoolean257 && local154 != null ? null : Static396.aClass359_2.method8415(super.anInt2924);
			@Pc(221) Class180 local221 = Static106.method1535(super.anInt2958, super.aClass180Array3[0], this.aClass271_1.anInt7335, arg0, super.anInt2932, super.anInt2917, local171 == null ? super.anInt2914 : super.anInt2933, local24, this.aClass271_1.aByte102 & 0xFF, this.aClass271_1.aByte98 & 0xFF, this.aClass271_1.aShort97 & 0xFFFF, local171 == null ? local154 : local171, this.aClass271_1.aShort98 & 0xFFFF);
			if (local221 != null) {
				local121 = Static443.method6589(this.method2533(), super.aClass180Array3.length + 1);
				super.aBoolean258 = true;
				arg0.C(false);
				if (Static605.aBoolean812) {
					local221.method7950(local19, local121.aClass14_Sub9Array1[super.aClass180Array3.length], Static461.anInt7840, 0);
				} else {
					local221.method7949(local19, local121.aClass14_Sub9Array1[super.aClass180Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method7242(local24);
		local19.method7247(super.anInt9317, -super.anInt2907 + super.anInt9321 - 5, super.anInt9315);
		if (local121 == null) {
			local121 = Static443.method6589(this.method2533(), super.aClass180Array3.length);
		}
		this.method2516(super.aClass180Array3, arg0, local19, false);
		@Pc(308) int local308;
		if (Static605.aBoolean812) {
			for (local308 = 0; local308 < super.aClass180Array3.length; local308++) {
				if (super.aClass180Array3[local308] != null) {
					super.aClass180Array3[local308].method7950(local19, local121.aClass14_Sub9Array1[local308], Static461.anInt7840, 0);
				}
			}
		} else {
			for (local308 = 0; super.aClass180Array3.length > local308; local308++) {
				if (super.aClass180Array3[local308] != null) {
					super.aClass180Array3[local308].method7949(local19, local121.aClass14_Sub9Array1[local308], 0);
				}
			}
		}
		if (super.aClass14_Sub8_4 != null) {
			@Pc(372) Class345 local372 = super.aClass14_Sub8_4.method4458();
			if (Static605.aBoolean812) {
				arg0.method6986(local372, Static461.anInt7840);
			} else {
				arg0.method7058(local372);
			}
		}
		for (local308 = 0; super.aClass180Array3.length > local308; local308++) {
			if (super.aClass180Array3[local308] != null) {
				super.aBoolean258 |= super.aClass180Array3[local308].F();
			}
		}
		super.anInt2931 = Static92.anInt9992;
		super.aClass180Array3[0] = super.aClass180Array3[1] = super.aClass180Array3[2] = null;
		return local121;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZIIIII)V")
	public void method2530(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte125 = super.aByte126 = (byte) arg4;
		if (Static353.method5596(arg1, arg2)) {
			super.aByte126++;
		}
		if (super.anInt2930 != -1 && Static396.aClass359_2.method8415(super.anInt2930).anInt4873 == 1) {
			super.anIntArray243 = null;
			super.anInt2930 = -1;
		}
		for (@Pc(47) int local47 = 0; super.aClass315Array3.length > local47; local47++) {
			if (super.aClass315Array3[local47].anInt8720 != -1) {
				@Pc(65) Class68 local65 = Static452.aClass170_4.method4001(super.aClass315Array3[local47].anInt8720);
				if (local65.aBoolean114 && local65.anInt1416 != -1 && Static396.aClass359_2.method8415(local65.anInt1416).anInt4873 == 1) {
					super.aClass315Array3[local47].anInt8720 = -1;
				}
			}
		}
		if (!arg0) {
			@Pc(104) int local104 = arg1 - super.anIntArray253[0];
			@Pc(112) int local112 = arg2 - super.anIntArray252[0];
			if (local104 >= -8 && local104 <= 8 && local112 >= -8 && local112 <= 8) {
				if (super.anInt2972 < 9) {
					super.anInt2972++;
				}
				for (@Pc(141) int local141 = super.anInt2972; local141 > 0; local141--) {
					super.anIntArray253[local141] = super.anIntArray253[local141 - 1];
					super.anIntArray252[local141] = super.anIntArray252[local141 - 1];
					super.aByteArray27[local141] = super.aByteArray27[local141 - 1];
				}
				super.anIntArray253[0] = arg1;
				super.anIntArray252[0] = arg2;
				super.aByteArray27[0] = 1;
				return;
			}
		}
		super.anInt2972 = 0;
		super.anIntArray253[0] = arg1;
		super.anInt2971 = 0;
		super.anInt2973 = 0;
		super.anIntArray252[0] = arg2;
		super.anInt9317 = (arg3 << 8) + (super.anIntArray253[0] << 9);
		super.anInt9315 = (super.anIntArray252[0] << 9) + (arg3 << 8);
		if (super.aClass14_Sub8_4 != null) {
			super.aClass14_Sub8_4.method4457();
		}
	}

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "(I)V")
	@Override
	public void method8001() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BILclient!ha;)Z")
	private boolean method2531(@OriginalArg(1) int arg0, @OriginalArg(2) Class126 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(21) Class295 local21 = this.method2519();
		@Pc(36) Class200 local36 = super.anInt2930 != -1 && super.anInt2918 == 0 ? Static396.aClass359_2.method8415(super.anInt2930) : null;
		@Pc(54) Class200 local54 = super.anInt2924 == -1 || super.aBoolean257 && local36 != null ? null : Static396.aClass359_2.method8415(super.anInt2924);
		@Pc(57) int local57 = local21.anInt7981;
		@Pc(60) int local60 = local21.anInt7971;
		if (local57 != 0 || local60 != 0 || local21.anInt7983 != 0 || local21.anInt7992 != 0) {
			arg0 |= 0x7;
		}
		@Pc(106) boolean local106 = super.aByte69 != 0 && Static235.anInt3998 >= super.anInt2955 && Static235.anInt3998 < super.anInt2915;
		if (local106) {
			arg0 |= 0x80000;
		}
		@Pc(117) int local117 = super.aClass130_7.method2930();
		@Pc(153) Class180 local153 = super.aClass180Array3[0] = this.aClass271_1.method6477(super.anIntArray244, local36, this.aClass141_1, arg0, Static608.aClass151_1, local54, super.anInt2914, super.anInt2903, super.anInt2947, Static564.aClass304_1, super.anInt2933, super.anInt2963, arg1, super.anInt2954, local117, super.aClass299Array3, Static396.aClass359_2);
		if (local153 == null) {
			return false;
		}
		super.anInt2967 = local153.fa();
		super.anInt2938 = local153.ma();
		this.method2510(local153);
		if (local57 == 0 && local60 == 0) {
			this.method2511(this.method2509() << 9, 0, this.method2509() << 9, local117, 0);
		} else {
			this.method2511(local57, local21.anInt7994, local60, local117, local21.anInt8000);
			if (super.anInt2917 != 0) {
				super.aClass180Array3[0].FA(super.anInt2917);
			}
			if (super.anInt2958 != 0) {
				super.aClass180Array3[0].VA(super.anInt2958);
			}
			if (super.anInt2932 != 0) {
				super.aClass180Array3[0].H(0, super.anInt2932, 0);
			}
		}
		if (local106) {
			local153.method7942(super.aByte70, super.aByte67, super.aByte71, super.aByte69 & 0xFF);
		}
		this.method2523(local57, local5, local117, local21, local60, arg1);
		return true;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
	@Override
	public int method2517() {
		if (this.aClass271_1.anIntArray591 != null) {
			@Pc(19) Class271 local19 = this.aClass271_1.method6476(Static564.aClass304_1);
			if (local19 != null && local19.anInt7318 != -1) {
				return local19.anInt7318;
			}
		}
		return this.aClass271_1.anInt7318;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!ha;IIB)Z")
	@Override
	public boolean method8003(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass271_1 == null || !this.method2531(131072, arg0)) {
			return false;
		}
		@Pc(19) Class117 local19 = arg0.method7018();
		@Pc(24) int local24 = super.aClass130_7.method2930();
		local19.method7242(local24);
		local19.method7247(super.anInt9317, super.anInt9321, super.anInt9315);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass180Array3.length > local39; local39++) {
			if (super.aClass180Array3[local39] != null) {
				@Pc(65) boolean var10000;
				label41: {
					if (this.aClass271_1.anInt7319 <= 0) {
						label39: {
							if (this.aClass271_1.anInt7315 == -1) {
								if (this.aClass271_1.anInt7335 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass271_1.anInt7315 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(80) boolean local80 = var10000;
				@Pc(96) boolean local96;
				if (Static605.aBoolean812) {
					local96 = super.aClass180Array3[local39].method7929(arg2, arg1, local19, local80, this.aClass271_1.anInt7319, Static461.anInt7840);
				} else {
					local96 = super.aClass180Array3[local39].method7946(arg2, arg1, local19, local80, this.aClass271_1.anInt7319);
				}
				if (local96) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass180Array3[0] = super.aClass180Array3[1] = super.aClass180Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "(I)Z")
	private boolean method2533() {
		return this.aClass271_1.aBoolean614;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLclient!pha;)V")
	public void method2534(@OriginalArg(1) Class271 arg0) {
		this.aClass271_1 = arg0;
		if (this.aClass271_1 != null) {
			this.anInt2995 = this.aClass271_1.anInt7310;
			this.aString51 = this.aClass271_1.aString110;
		}
		if (super.aClass14_Sub8_4 != null) {
			super.aClass14_Sub8_4.method4457();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)V")
	public void method2535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray253[0];
		@Pc(19) int local19 = super.anIntArray252[0];
		if (arg1 == 0) {
			local19++;
		}
		if (arg1 == 1) {
			local19++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local19--;
			local10++;
		}
		if (arg1 == 4) {
			local19--;
		}
		if (arg1 == 5) {
			local10--;
			local19--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local19++;
			local10--;
		}
		if (super.anInt2930 != -1 && Static396.aClass359_2.method8415(super.anInt2930).anInt4873 == 1) {
			super.anInt2930 = -1;
			super.anIntArray243 = null;
		}
		for (@Pc(87) int local87 = 0; local87 < super.aClass315Array3.length; local87++) {
			if (super.aClass315Array3[local87].anInt8720 != -1) {
				@Pc(106) Class68 local106 = Static452.aClass170_4.method4001(super.aClass315Array3[local87].anInt8720);
				if (local106.aBoolean114 && local106.anInt1416 != -1 && Static396.aClass359_2.method8415(local106.anInt1416).anInt4873 == 1) {
					super.aClass315Array3[local87].anInt8720 = -1;
				}
			}
		}
		if (super.anInt2972 < 9) {
			super.anInt2972++;
		}
		for (@Pc(155) int local155 = super.anInt2972; local155 > 0; local155--) {
			super.anIntArray253[local155] = super.anIntArray253[local155 - 1];
			super.anIntArray252[local155] = super.anIntArray252[local155 - 1];
			super.aByteArray27[local155] = super.aByteArray27[local155 - 1];
		}
		super.anIntArray253[0] = local10;
		super.aByteArray27[0] = (byte) arg0;
		super.anIntArray252[0] = local19;
	}
}
