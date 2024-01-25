import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
	private int anInt2064;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt2069;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!ww;")
	private final Class1_Sub2 aClass1_Sub2_2;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!nk;")
	private final Class205_Sub1 aClass205_Sub1_1;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_9;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	private final int anInt2067;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	private final int anInt2060;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	private final int anInt2058;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
	private final int anInt2057;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "Lclient!cd;")
	private final Class43 aClass43_2;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Lclient!ee;")
	private final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "Lclient!nu;")
	private final Interface10 anInterface10_1;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!cd;")
	private final Class43 aClass43_1;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "Lclient!ge;")
	private Class1_Sub6 aClass1_Sub6_2;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "Lclient!aw;")
	private Class1_Sub6_Sub1 aClass1_Sub6_Sub1_1;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!ba;")
	private Class17 aClass17_10;

	static {
		new Class306("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!uq;Lclient!nk;Lclient!ww;[I)V")
	public Class1_Sub14(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class205_Sub1 arg1, @OriginalArg(2) Class1_Sub2 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub2_2 = arg2;
		this.aClass205_Sub1_1 = arg1;
		this.aClass122_Sub3_9 = arg0;
		@Pc(22) int local22 = this.aClass1_Sub2_2.method2434() - (arg1.anInt8175 >> 1);
		this.anInt2067 = this.aClass1_Sub2_2.method2426() - local22 >> arg1.anInt8176;
		this.anInt2060 = this.aClass1_Sub2_2.method2426() + local22 >> arg1.anInt8176;
		this.anInt2058 = this.aClass1_Sub2_2.method2427() - local22 >> arg1.anInt8176;
		this.anInt2057 = this.aClass1_Sub2_2.method2427() + local22 >> arg1.anInt8176;
		@Pc(77) int local77 = this.anInt2060 + 1 - this.anInt2067;
		@Pc(85) int local85 = this.anInt2057 + 1 - this.anInt2058;
		this.aFloatArrayArray4 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray2 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(139) int local139;
		@Pc(146) int local146;
		@Pc(172) int local172;
		@Pc(186) int local186;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt2058 + local114;
			if (local121 > 0 && this.aClass205_Sub1_1.anInt8177 - 1 > local121) {
				for (local139 = 0; local139 <= local77; local139++) {
					local146 = this.anInt2067 + local139;
					if (local146 > 0 && this.aClass205_Sub1_1.anInt8174 - 1 > local146) {
						local172 = arg1.ba(local146 + 1, local121) - arg1.ba(local146 - 1, local121);
						local186 = arg1.ba(local146, local121 + 1) - arg1.ba(local146, local121 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local186 * local186 + local172 * local172 + 65536)));
						this.aFloatArrayArray3[local139][local114] = local201 * (float) local172;
						this.aFloatArrayArray4[local139][local114] = -256.0F * local201;
						this.aFloatArrayArray2[local139][local114] = (float) local186 * local201;
					}
				}
			}
		}
		local121 = 0;
		local139 = 0;
		for (local146 = this.anInt2058; local146 <= this.anInt2057; local146++) {
			if (local146 >= 0 && arg1.anInt8177 > local146) {
				for (local172 = this.anInt2067; local172 <= this.anInt2060; local172++) {
					if (local172 >= 0 && arg1.anInt8174 > local172) {
						local186 = arg3[local139];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray8[local172][local146];
						if (local290 != null && local186 != 0) {
							if (local186 == 1) {
								local121 += local290.length;
							} else {
								local121 += 3;
							}
						}
					}
					local139++;
				}
			} else {
				local139 += this.anInt2060 - this.anInt2067;
			}
		}
		if (local121 <= 0) {
			this.aClass43_2 = null;
			this.anInterface2_2 = null;
			this.anInterface10_1 = null;
			this.aClass43_1 = null;
		} else {
			this.aClass1_Sub6_2 = new Class1_Sub6(local121 * 2);
			this.aClass1_Sub6_Sub1_1 = new Class1_Sub6_Sub1(local121 * 16);
			this.aClass17_10 = new Class17(Static352.method5306(local121));
			local172 = 0;
			local139 = 0;
			for (local186 = this.anInt2058; local186 <= this.anInt2057; local186++) {
				if (local186 >= 0 && arg1.anInt8177 > local186) {
					@Pc(404) int local404 = 0;
					for (@Pc(407) int local407 = this.anInt2067; local407 <= this.anInt2060; local407++) {
						if (local407 >= 0 && local407 < arg1.anInt8174) {
							@Pc(419) int local419 = arg3[local139];
							@Pc(426) int[] local426 = arg1.anIntArrayArrayArray8[local407][local186];
							@Pc(433) int[] local433 = arg1.anIntArrayArrayArray11[local407][local186];
							if (local426 != null && local419 != 0) {
								if (local419 == 1) {
									for (@Pc(447) int local447 = 0; local447 < local426.length; local447++) {
										this.method1750(local172, local404, local426[local447], local433[local447], local407, local186);
									}
								} else if (local419 == 3) {
									this.method1750(local172, local404, 0, 0, local407, local186);
									this.method1750(local172, local404, arg1.anInt8175, 0, local407, local186);
									this.method1750(local172, local404, 0, arg1.anInt8175, local407, local186);
								} else if (local419 == 2) {
									this.method1750(local172, local404, arg1.anInt8175, 0, local407, local186);
									this.method1750(local172, local404, arg1.anInt8175, arg1.anInt8175, local407, local186);
									this.method1750(local172, local404, 0, 0, local407, local186);
								} else if (local419 == 5) {
									this.method1750(local172, local404, arg1.anInt8175, arg1.anInt8175, local407, local186);
									this.method1750(local172, local404, 0, arg1.anInt8175, local407, local186);
									this.method1750(local172, local404, arg1.anInt8175, 0, local407, local186);
								} else if (local419 == 4) {
									this.method1750(local172, local404, 0, arg1.anInt8175, local407, local186);
									this.method1750(local172, local404, 0, 0, local407, local186);
									this.method1750(local172, local404, arg1.anInt8175, arg1.anInt8175, local407, local186);
								}
							}
						}
						local139++;
						local404++;
					}
				} else {
					local139 += this.anInt2060 - this.anInt2067;
				}
				local172++;
			}
			this.anInterface10_1 = this.aClass122_Sub3_9.method6901(this.aClass1_Sub6_2.aByteArray66, this.aClass1_Sub6_2.anInt4555, false);
			this.anInterface2_2 = this.aClass122_Sub3_9.method6892(this.aClass1_Sub6_Sub1_1.aByteArray66, 16, false, this.aClass1_Sub6_Sub1_1.anInt4555);
			this.aClass43_1 = new Class43(this.anInterface2_2, 5126, 3, 0);
			this.aClass43_2 = new Class43(this.anInterface2_2, 5121, 4, 12);
		}
		this.aClass17_10 = null;
		this.aClass1_Sub6_Sub1_1 = null;
		this.aClass1_Sub6_2 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray4 = this.aFloatArrayArray2 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IS)V")
	private void method1749(@OriginalArg(1) short arg0) {
		if (this.aClass122_Sub3_9.aBoolean594) {
			this.aClass1_Sub6_2.method3919(arg0);
		} else {
			this.aClass1_Sub6_2.method3971(arg0);
		}
		this.anInt2069++;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIBIII)V")
	private void method1750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg2 + (arg4 << this.aClass205_Sub1_1.anInt8176);
		@Pc(23) int local23 = (arg5 << this.aClass205_Sub1_1.anInt8176) + arg3;
		@Pc(29) int local29 = this.aClass205_Sub1_1.aa(local15, local23);
		if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | 0xFFFFL << 16 & (long) local23 << 16;
			@Pc(60) Class1 local60 = this.aClass17_10.method738(local7);
			if (local60 != null) {
				this.method1749(((Class1_Sub29) local60).aShort76);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt2064++;
		if (local7 != -1L) {
			this.aClass17_10.method737(new Class1_Sub29(local78), local7);
		}
		@Pc(119) float local119;
		@Pc(126) float local126;
		@Pc(112) float local112;
		@Pc(193) float local193;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(267) float local267;
		if (arg2 == 0 && arg3 == 0) {
			local112 = this.aFloatArrayArray2[arg1][arg0];
			local119 = this.aFloatArrayArray3[arg1][arg0];
			local126 = this.aFloatArrayArray4[arg1][arg0];
		} else if (arg2 == this.aClass205_Sub1_1.anInt8175 && arg3 == 0) {
			local126 = this.aFloatArrayArray4[arg1 + 1][arg0];
			local112 = this.aFloatArrayArray2[arg1 + 1][arg0];
			local119 = this.aFloatArrayArray3[arg1 + 1][arg0];
		} else if (this.aClass205_Sub1_1.anInt8175 == arg2 && arg3 == this.aClass205_Sub1_1.anInt8175) {
			local112 = this.aFloatArrayArray2[arg1 + 1][arg0 + 1];
			local119 = this.aFloatArrayArray3[arg1 + 1][arg0 + 1];
			local126 = this.aFloatArrayArray4[arg1 + 1][arg0 + 1];
		} else if (arg2 == 0 && arg3 == this.aClass205_Sub1_1.anInt8175) {
			local112 = this.aFloatArrayArray2[arg1][arg0 + 1];
			local126 = this.aFloatArrayArray4[arg1][arg0 + 1];
			local119 = this.aFloatArrayArray3[arg1][arg0 + 1];
		} else {
			local193 = (float) arg2 / (float) this.aClass205_Sub1_1.anInt8175;
			local201 = (float) arg3 / (float) this.aClass205_Sub1_1.anInt8175;
			local208 = this.aFloatArrayArray3[arg1][arg0];
			local215 = this.aFloatArrayArray4[arg1][arg0];
			local222 = this.aFloatArrayArray2[arg1][arg0];
			local231 = this.aFloatArrayArray3[arg1 + 1][arg0];
			local240 = this.aFloatArrayArray4[arg1 + 1][arg0];
			@Pc(258) float local258 = local240 + local193 * (this.aFloatArrayArray4[arg1 + 1][arg0 + 1] - local240);
			local267 = this.aFloatArrayArray2[arg1 + 1][arg0];
			@Pc(283) float local283 = local222 + local193 * (this.aFloatArrayArray2[arg1][arg0 + 1] - local222);
			@Pc(298) float local298 = local215 + (this.aFloatArrayArray4[arg1][arg0 + 1] - local215) * local193;
			@Pc(316) float local316 = local231 + (this.aFloatArrayArray3[arg1 + 1][arg0 + 1] - local231) * local193;
			@Pc(332) float local332 = local208 + local193 * (this.aFloatArrayArray3[arg1][arg0 + 1] - local208);
			@Pc(349) float local349 = local267 + (this.aFloatArrayArray2[arg1 + 1][arg0 + 1] - local267) * local193;
			local119 = local332 + local201 * (local316 - local332);
			local126 = local298 + (local258 - local298) * local201;
			local112 = local283 + local201 * (local349 - local283);
		}
		local193 = this.aClass1_Sub2_2.method2426() - local15;
		local201 = this.aClass1_Sub2_2.method2428() - local29;
		local208 = this.aClass1_Sub2_2.method2427() - local23;
		local215 = (float) Math.sqrt((double) (local208 * local208 + local201 * local201 + local193 * local193));
		local222 = 1.0F / local215;
		local208 *= local222;
		local201 *= local222;
		local193 *= local222;
		local231 = local215 / (float) this.aClass1_Sub2_2.method2434();
		local240 = 1.0F - local231 * local231;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		local267 = local112 * local208 + local193 * local119 + local126 * local201;
		if (local267 < 0.0F) {
			local267 = 0.0F;
		}
		@Pc(537) float local537 = local267 * 2.0F * local240;
		if (local537 > 1.0F) {
			local537 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass1_Sub2_2.method2432();
		@Pc(563) int local563 = (int) (local537 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) (local537 * (float) (local553 >> 8 & 0xFF));
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(595) int local595 = (int) (local537 * (float) (local553 & 0xFF));
		if (local595 > 255) {
			local595 = 255;
		}
		if (this.aClass122_Sub3_9.aBoolean594) {
			this.aClass1_Sub6_Sub1_1.method726((float) local15);
			this.aClass1_Sub6_Sub1_1.method726((float) local29);
			this.aClass1_Sub6_Sub1_1.method726((float) local23);
		} else {
			this.aClass1_Sub6_Sub1_1.method724((float) local15);
			this.aClass1_Sub6_Sub1_1.method724((float) local29);
			this.aClass1_Sub6_Sub1_1.method724((float) local23);
		}
		this.aClass1_Sub6_Sub1_1.method3937(local563);
		this.aClass1_Sub6_Sub1_1.method3937(local580);
		this.aClass1_Sub6_Sub1_1.method3937(local595);
		this.aClass1_Sub6_Sub1_1.method3937(255);
		this.method1749(local78);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII[[Z)V")
	public void method1751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface10_1 == null || (arg2 + arg0 < this.anInt2067 || (arg0 - arg2 > this.anInt2060 || (this.anInt2058 > arg1 + arg2 || arg1 - arg2 > this.anInt2057)))) {
			return;
		}
		for (@Pc(50) int local50 = this.anInt2058; local50 <= this.anInt2057; local50++) {
			for (@Pc(55) int local55 = this.anInt2067; local55 <= this.anInt2060; local55++) {
				@Pc(62) int local62 = local55 - arg0;
				@Pc(66) int local66 = local50 - arg1;
				if (local62 > -arg2 && arg2 > local62 && local66 > -arg2 && arg2 > local66 && arg3[arg2 + local62][local66 + arg2]) {
					this.aClass122_Sub3_9.method6851((int) (this.aClass1_Sub2_2.method2436() * 255.0F) << 24);
					this.aClass122_Sub3_9.method6890(null, this.aClass43_1, null, this.aClass43_2);
					this.aClass122_Sub3_9.method6889(this.anInt2069, this.anInterface10_1, 0);
					return;
				}
			}
		}
	}
}
