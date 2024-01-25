import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class5_Sub47 extends Class5 {

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	private int anInt9675;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "Lclient!mu;")
	private final Class40_Sub2 aClass40_Sub2_3;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_34;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!tn;")
	private final Class5_Sub27 aClass5_Sub27_3;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "I")
	private final int anInt9672;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "I")
	private final int anInt9676;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "I")
	private final int anInt9673;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	private final int anInt9678;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!v", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	private int anInt9679;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!ee;")
	private Class5_Sub12 aClass5_Sub12_10;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "Lclient!uf;")
	private Class5_Sub12_Sub1 aClass5_Sub12_Sub1_3;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!du;")
	private Class81 aClass81_69;

	@OriginalMember(owner = "client!v", name = "m", descriptor = "Lclient!as;")
	private final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "Lclient!cs;")
	private final Interface7 anInterface7_7;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "Lclient!im;")
	private final Class159 aClass159_15;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "Lclient!im;")
	private final Class159 aClass159_16;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!rda;Lclient!mu;Lclient!tn;[I)V")
	public Class5_Sub47(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) Class40_Sub2 arg1, @OriginalArg(2) Class5_Sub27 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass40_Sub2_3 = arg1;
		this.aClass126_Sub3_34 = arg0;
		this.aClass5_Sub27_3 = arg2;
		@Pc(22) int local22 = this.aClass5_Sub27_3.method6338() - (arg1.anInt9918 >> 1);
		this.anInt9672 = this.aClass5_Sub27_3.method6330() - local22 >> arg1.anInt9919;
		this.anInt9676 = local22 + this.aClass5_Sub27_3.method6330() >> arg1.anInt9919;
		this.anInt9673 = this.aClass5_Sub27_3.method6335() - local22 >> arg1.anInt9919;
		this.anInt9678 = local22 + this.aClass5_Sub27_3.method6335() >> arg1.anInt9919;
		@Pc(77) int local77 = this.anInt9676 + 1 - this.anInt9672;
		@Pc(85) int local85 = this.anInt9678 + 1 - this.anInt9673;
		this.aFloatArrayArray12 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray13 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray14 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(139) int local139;
		@Pc(169) int local169;
		@Pc(185) int local185;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt9673;
			if (local121 > 0 && this.aClass40_Sub2_3.anInt9923 - 1 > local121) {
				for (local132 = 0; local132 <= local77; local132++) {
					local139 = this.anInt9672 + local132;
					if (local139 > 0 && this.aClass40_Sub2_3.anInt9920 - 1 > local139) {
						local169 = arg1.method8442(local139 + 1, local121) - arg1.method8442(local139 - 1, local121);
						local185 = arg1.method8442(local139, local121 + 1) - arg1.method8442(local139, local121 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local169 * local169 + 65536)));
						this.aFloatArrayArray12[local132][local114] = local200 * (float) local169;
						this.aFloatArrayArray14[local132][local114] = -256.0F * local200;
						this.aFloatArrayArray13[local132][local114] = local200 * (float) local185;
					}
				}
			}
		}
		local121 = 0;
		@Pc(296) int local296;
		for (local132 = this.anInt9673; local132 <= this.anInt9678; local132++) {
			if (local132 >= 0 && arg1.anInt9923 > local132) {
				for (local139 = this.anInt9672; local139 <= this.anInt9676; local139++) {
					if (local139 >= 0 && local139 < arg1.anInt9920) {
						local169 = arg3[local121];
						@Pc(284) int[] local284 = arg1.anIntArrayArrayArray6[local139][local132];
						if (local284 != null && local169 != 0) {
							if (local169 == 1) {
								local296 = 0;
								while (local284.length > local296) {
									if (local284[local296++] != -1 && local284[local296++] != -1 && local284[local296++] != -1) {
										this.anInt9679 += 3;
									}
								}
							} else {
								this.anInt9679 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt9676 - this.anInt9672;
			}
		}
		if (this.anInt9679 > 0) {
			this.aClass5_Sub12_10 = new Class5_Sub12(this.anInt9679 * 2);
			this.aClass5_Sub12_Sub1_3 = new Class5_Sub12_Sub1(this.anInt9679 * 16);
			this.aClass81_69 = new Class81(Static522.method6795(this.anInt9679));
			local139 = 0;
			local121 = 0;
			for (local169 = this.anInt9673; local169 <= this.anInt9678; local169++) {
				if (local169 >= 0 && arg1.anInt9923 > local169) {
					local185 = 0;
					for (local296 = this.anInt9672; local296 <= this.anInt9676; local296++) {
						if (local296 >= 0 && arg1.anInt9920 > local296) {
							@Pc(456) int local456 = arg3[local121];
							@Pc(463) int[] local463 = arg1.anIntArrayArrayArray6[local296][local169];
							if (local463 != null && local456 != 0) {
								if (local456 == 1) {
									@Pc(477) int[] local477 = arg1.anIntArrayArrayArray5[local296][local169];
									@Pc(484) int[] local484 = arg1.anIntArrayArrayArray4[local296][local169];
									@Pc(486) int local486 = 0;
									label107: while (true) {
										while (true) {
											if (local486 >= local463.length) {
												break label107;
											}
											if (local463[local486] == -1 || local463[local486 + 1] == -1 || local463[local486 + 2] == -1) {
												local486 += 3;
											} else {
												this.method8305(local477[local486], local169, local296, local185, local139, local484[local486]);
												local486++;
												this.method8305(local477[local486], local169, local296, local185, local139, local484[local486]);
												local486++;
												this.method8305(local477[local486], local169, local296, local185, local139, local484[local486]);
												local486++;
											}
										}
									}
								} else if (local456 == 3) {
									this.method8305(0, local169, local296, local185, local139, 0);
									this.method8305(arg1.anInt9918, local169, local296, local185, local139, 0);
									this.method8305(0, local169, local296, local185, local139, arg1.anInt9918);
								} else if (local456 == 2) {
									this.method8305(arg1.anInt9918, local169, local296, local185, local139, 0);
									this.method8305(arg1.anInt9918, local169, local296, local185, local139, arg1.anInt9918);
									this.method8305(0, local169, local296, local185, local139, 0);
								} else if (local456 == 5) {
									this.method8305(arg1.anInt9918, local169, local296, local185, local139, arg1.anInt9918);
									this.method8305(0, local169, local296, local185, local139, arg1.anInt9918);
									this.method8305(arg1.anInt9918, local169, local296, local185, local139, 0);
								} else if (local456 == 4) {
									this.method8305(0, local169, local296, local185, local139, arg1.anInt9918);
									this.method8305(0, local169, local296, local185, local139, 0);
									this.method8305(arg1.anInt9918, local169, local296, local185, local139, arg1.anInt9918);
								}
							}
						}
						local121++;
						local185++;
					}
				} else {
					local121 += this.anInt9676 - this.anInt9672;
				}
				local139++;
			}
			this.anInterface2_3 = this.aClass126_Sub3_34.method7101(this.aClass5_Sub12_10.aByteArray104, this.aClass5_Sub12_10.anInt10154, false);
			this.anInterface7_7 = this.aClass126_Sub3_34.method7093(this.aClass5_Sub12_Sub1_3.anInt10154, false, 16, this.aClass5_Sub12_Sub1_3.aByteArray104);
			this.aClass159_15 = new Class159(this.anInterface7_7, 5126, 3, 0);
			this.aClass159_16 = new Class159(this.anInterface7_7, 5121, 4, 12);
		} else {
			this.aClass159_16 = null;
			this.anInterface7_7 = null;
			this.aClass159_15 = null;
			this.anInterface2_3 = null;
		}
		this.aFloatArrayArray12 = this.aFloatArrayArray14 = this.aFloatArrayArray13 = null;
		this.aClass5_Sub12_Sub1_3 = null;
		this.aClass5_Sub12_10 = null;
		this.aClass81_69 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)V")
	private void method8305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg2 << this.aClass40_Sub2_3.anInt9919) + arg0;
		@Pc(23) int local23 = arg5 + (arg1 << this.aClass40_Sub2_3.anInt9919);
		@Pc(30) int local30 = this.aClass40_Sub2_3.method8447(local15, local23);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class5 local59 = this.aClass81_69.method1599(local7);
			if (local59 != null) {
				this.method8308(((Class5_Sub6) local59).aShort17);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt9675++;
		if (local7 != -1L) {
			this.aClass81_69.method1607(new Class5_Sub6(local77), local7);
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(229) float local229;
		@Pc(237) float local237;
		@Pc(244) float local244;
		@Pc(251) float local251;
		@Pc(258) float local258;
		@Pc(267) float local267;
		@Pc(276) float local276;
		@Pc(332) float local332;
		if (arg0 == 0 && arg5 == 0) {
			local109 = this.aFloatArrayArray12[arg3][arg4];
			local116 = this.aFloatArrayArray14[arg3][arg4];
			local123 = this.aFloatArrayArray13[arg3][arg4];
		} else if (arg0 == this.aClass40_Sub2_3.anInt9918 && arg5 == 0) {
			local123 = this.aFloatArrayArray13[arg3 + 1][arg4];
			local109 = this.aFloatArrayArray12[arg3 + 1][arg4];
			local116 = this.aFloatArrayArray14[arg3 + 1][arg4];
		} else if (this.aClass40_Sub2_3.anInt9918 == arg0 && this.aClass40_Sub2_3.anInt9918 == arg5) {
			local116 = this.aFloatArrayArray14[arg3 + 1][arg4 + 1];
			local109 = this.aFloatArrayArray12[arg3 + 1][arg4 + 1];
			local123 = this.aFloatArrayArray13[arg3 + 1][arg4 + 1];
		} else if (arg0 == 0 && arg5 == this.aClass40_Sub2_3.anInt9918) {
			local123 = this.aFloatArrayArray13[arg3][arg4 + 1];
			local116 = this.aFloatArrayArray14[arg3][arg4 + 1];
			local109 = this.aFloatArrayArray12[arg3][arg4 + 1];
		} else {
			local229 = (float) arg0 / (float) this.aClass40_Sub2_3.anInt9918;
			local237 = (float) arg5 / (float) this.aClass40_Sub2_3.anInt9918;
			local244 = this.aFloatArrayArray12[arg3][arg4];
			local251 = this.aFloatArrayArray14[arg3][arg4];
			local258 = this.aFloatArrayArray13[arg3][arg4];
			local267 = this.aFloatArrayArray12[arg3 + 1][arg4];
			local276 = this.aFloatArrayArray14[arg3 + 1][arg4];
			@Pc(293) float local293 = local276 + local229 * (this.aFloatArrayArray14[arg3 + 1][arg4 + 1] - local276);
			@Pc(308) float local308 = local251 + local229 * (this.aFloatArrayArray14[arg3][arg4 + 1] - local251);
			@Pc(323) float local323 = local244 + local229 * (this.aFloatArrayArray12[arg3][arg4 + 1] - local244);
			local332 = this.aFloatArrayArray13[arg3 + 1][arg4];
			@Pc(349) float local349 = local267 + (this.aFloatArrayArray12[arg3 + 1][arg4 + 1] - local267) * local229;
			@Pc(364) float local364 = local258 + local229 * (this.aFloatArrayArray13[arg3][arg4 + 1] - local258);
			local109 = local237 * (local349 - local323) + local323;
			local116 = local308 + local237 * (local293 - local308);
			@Pc(398) float local398 = local332 + (this.aFloatArrayArray13[arg3 + 1][arg4 + 1] - local332) * local229;
			local123 = local237 * (local398 - local364) + local364;
		}
		local229 = (float) (this.aClass5_Sub27_3.method6330() - local15);
		local237 = (float) (this.aClass5_Sub27_3.method6334() - local30);
		local244 = (float) (this.aClass5_Sub27_3.method6335() - local23);
		local251 = (float) Math.sqrt((double) (local229 * local229 + local237 * local237 + local244 * local244));
		local258 = (float) 1 / local251;
		local237 *= local258;
		local229 *= local258;
		local244 *= local258;
		local267 = local251 / (float) this.aClass5_Sub27_3.method6338();
		local276 = 1.0F - local267 * local267;
		if (local276 < 0.0F) {
			local276 = 0.0F;
		}
		local332 = local229 * local109 + local237 * local116 + local244 * local123;
		if (local332 < 0.0F) {
			local332 = 0.0F;
		}
		@Pc(543) float local543 = local332 * 2.0F * local276;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass5_Sub27_3.method6336();
		@Pc(564) int local564 = (int) ((float) (local554 >> 16 & 0xFF) * local543);
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(579) int local579 = (int) (local543 * (float) (local554 >> 8 & 0xFF));
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(594) int local594 = (int) (local543 * (float) (local554 & 0xFF));
		if (this.aClass126_Sub3_34.aBoolean674) {
			this.aClass5_Sub12_Sub1_3.method8130((float) local15);
			this.aClass5_Sub12_Sub1_3.method8130((float) local30);
			this.aClass5_Sub12_Sub1_3.method8130((float) local23);
		} else {
			this.aClass5_Sub12_Sub1_3.method8129((float) local15);
			this.aClass5_Sub12_Sub1_3.method8129((float) local30);
			this.aClass5_Sub12_Sub1_3.method8129((float) local23);
		}
		if (local594 > 255) {
			local594 = 255;
		}
		this.aClass5_Sub12_Sub1_3.method8647(local564);
		this.aClass5_Sub12_Sub1_3.method8647(local579);
		this.aClass5_Sub12_Sub1_3.method8647(local594);
		this.aClass5_Sub12_Sub1_3.method8647(255);
		this.method8308(local77);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZII[[Z)V")
	public void method8307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface2_3 == null || (arg2 + arg0 < this.anInt9672 || (arg2 - arg0 > this.anInt9676 || (arg0 + arg1 < this.anInt9673 || arg1 - arg0 > this.anInt9678)))) {
			return;
		}
		for (@Pc(59) int local59 = this.anInt9673; local59 <= this.anInt9678; local59++) {
			for (@Pc(64) int local64 = this.anInt9672; local64 <= this.anInt9676; local64++) {
				@Pc(71) int local71 = local64 - arg2;
				@Pc(76) int local76 = local59 - arg1;
				if (local71 > -arg0 && local71 < arg0 && -arg0 < local76 && arg0 > local76 && arg3[arg0 + local71][arg0 + local76]) {
					this.aClass126_Sub3_34.method7125((int) (this.aClass5_Sub27_3.method6331() * 255.0F) << 24);
					this.aClass126_Sub3_34.method7067((Class159) null, this.aClass159_15, (Class159) null, this.aClass159_16);
					this.aClass126_Sub3_34.method7121(this.anInterface2_3, 0, this.anInt9679);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(SI)V")
	private void method8308(@OriginalArg(0) short arg0) {
		if (this.aClass126_Sub3_34.aBoolean674) {
			this.aClass5_Sub12_10.method8655(arg0);
		} else {
			this.aClass5_Sub12_10.method8643(arg0);
		}
	}
}
