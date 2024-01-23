import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
	public static int anInt6044;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Z")
	public static boolean aBoolean422 = true;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString371 = "Connecting to update server";

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
	public static int anInt6042 = 0;

	@OriginalMember(owner = "client!wj", name = "x", descriptor = "[I")
	public static int[] anIntArray679 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
	public static void method4821() {
		if (Static83.anInt1940 == 2) {
			if (Static175.anInt3341 == Static139.anInt2663 && Static47.anInt891 == Static198.anInt5852) {
				Static83.anInt1940 = 0;
				if (Static60.aBoolean68 && Static54.aBooleanArray4[81] && Static300.anInt5638 > 2) {
					Static280.method664(Static300.anInt5638 - 2);
				} else {
					Static280.method664(Static300.anInt5638 - 1);
				}
			}
		} else if (Static175.anInt3341 == Static79.anInt1797 && Static198.anInt5852 == Static278.anInt5313) {
			Static83.anInt1940 = 0;
			if (Static60.aBoolean68 && Static54.aBooleanArray4[81] && Static300.anInt5638 > 2) {
				Static280.method664(Static300.anInt5638 - 2);
			} else {
				Static280.method664(Static300.anInt5638 - 1);
			}
		} else {
			Static83.anInt1940 = 2;
			Static47.anInt891 = Static278.anInt5313;
			Static139.anInt2663 = Static79.anInt1797;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;Lclient!fh;Lclient!fh;I)V")
	public static void method4822(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class58 arg2) {
		Static92.aClass58_44 = arg0;
		Static58.aClass58_35 = arg2;
		Static292.aClass58_101 = arg1;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;ILclient!fh;Lclient!fh;Lclient!fh;)V")
	public static void method4824(@OriginalArg(0) Class58 arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) Class58 arg2, @OriginalArg(4) Class58 arg3) {
		Static136.aClass58_61 = arg0;
		Static279.aClass58_99 = arg3;
		Static126.aClass58_56 = arg2;
		Static110.aClass58_49 = arg1;
		Static188.aClass189ArrayArray115 = new Class189[Static126.aClass58_56.method1351()][];
		Static93.aBooleanArray12 = new boolean[Static126.aClass58_56.method1351()];
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
	public static void method4826() {
		@Pc(15) int local15;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(41) int local41;
		@Pc(47) int local47;
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(61) int local61;
		@Pc(89) int local89;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(161) Class53_Sub6 local161;
		if (Static34.anInt552 == 17) {
			local15 = Static189.aClass4_Sub10_Sub1_2.method4666();
			local26 = Static48.anInt894 * 2 + (local15 >> 4 & 0xF);
			local34 = (local15 & 0xF) + Static44.anInt818 * 2;
			local41 = local26 + Static189.aClass4_Sub10_Sub1_2.method4674();
			local47 = Static189.aClass4_Sub10_Sub1_2.method4674() + local34;
			local51 = Static189.aClass4_Sub10_Sub1_2.method4613();
			local55 = Static189.aClass4_Sub10_Sub1_2.method4653();
			local61 = Static189.aClass4_Sub10_Sub1_2.method4666() * 4;
			local67 = Static189.aClass4_Sub10_Sub1_2.method4666() * 4;
			local71 = Static189.aClass4_Sub10_Sub1_2.method4653();
			local75 = Static189.aClass4_Sub10_Sub1_2.method4653();
			local79 = Static189.aClass4_Sub10_Sub1_2.method4666();
			if (local79 == 255) {
				local79 = -1;
			}
			local89 = Static189.aClass4_Sub10_Sub1_2.method4666();
			if (local26 >= 0 && local34 >= 0 && local26 < 208 && local34 < 208 && local41 >= 0 && local47 >= 0 && local41 < 208 && local47 < 208 && local55 != 65535) {
				local26 = local26 * 64;
				local34 *= 64;
				local41 = local41 * 64;
				local161 = new Class53_Sub6(local55, Static281.anInt5335, local26, local34, Static33.method522(local34, local26, Static281.anInt5335) - local61, local71 - -Static50.anInt954, Static50.anInt954 + local75, local79, local89, local51, local67);
				local47 = local47 * 64;
				local161.method3118(Static33.method522(local47, local41, Static281.anInt5335) - local67, local41, Static50.anInt954 + local71, local47);
				Static10.aClass114_1.method2625(new Class4_Sub3_Sub2(local161));
			}
		} else if (Static34.anInt552 == 114) {
			local15 = Static189.aClass4_Sub10_Sub1_2.method4666();
			local26 = Static48.anInt894 + (local15 >> 4 & 0x7);
			local34 = (local15 & 0x7) + Static44.anInt818;
			local41 = Static189.aClass4_Sub10_Sub1_2.method4653();
			local47 = Static189.aClass4_Sub10_Sub1_2.method4653();
			local51 = Static189.aClass4_Sub10_Sub1_2.method4653();
			if (local26 >= 0 && local34 >= 0 && local26 < 104 && local34 < 104) {
				@Pc(247) Class114 local247 = Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local26][local34];
				if (local247 != null) {
					for (@Pc(256) Class4_Sub3_Sub21 local256 = (Class4_Sub3_Sub21) local247.method2623(); local256 != null; local256 = (Class4_Sub3_Sub21) local247.method2629()) {
						@Pc(262) Class53_Sub2 local262 = local256.aClass53_Sub2_1;
						if (local262.anInt2168 == (local41 & 0x7FFF) && local47 == local262.anInt2166) {
							local262.anInt2166 = local51;
							break;
						}
					}
					Static5.method89(local26, local34);
				}
			}
		} else {
			@Pc(364) int local364;
			if (Static34.anInt552 == 133) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4663();
				local26 = Static189.aClass4_Sub10_Sub1_2.method4660();
				local41 = (local26 & 0x7) + Static44.anInt818;
				local34 = (local26 >> 4 & 0x7) + Static48.anInt894;
				local47 = Static189.aClass4_Sub10_Sub1_2.method4625();
				local51 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local55 = local51 >> 2;
				@Pc(340) byte local340 = Static189.aClass4_Sub10_Sub1_2.method4645();
				local61 = local51 & 0x3;
				@Pc(348) byte local348 = Static189.aClass4_Sub10_Sub1_2.method4652();
				@Pc(352) byte local352 = Static189.aClass4_Sub10_Sub1_2.method4674();
				@Pc(356) byte local356 = Static189.aClass4_Sub10_Sub1_2.method4652();
				local89 = Static189.aClass4_Sub10_Sub1_2.method4625();
				local364 = Static189.aClass4_Sub10_Sub1_2.method4653();
				if (!Static94.aBoolean138) {
					Static56.method967(local340, local15, local47, local89, local55, local348, local352, local364, local61, local41, local356, local34);
				}
			}
			if (Static34.anInt552 == 111) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local26 = Static48.anInt894 * 2 + (local15 >> 4 & 0xF);
				local34 = (local15 & 0xF) + Static44.anInt818 * 2;
				local41 = Static189.aClass4_Sub10_Sub1_2.method4674() + local26;
				local47 = local34 + Static189.aClass4_Sub10_Sub1_2.method4674();
				local51 = Static189.aClass4_Sub10_Sub1_2.method4613();
				local55 = Static189.aClass4_Sub10_Sub1_2.method4613();
				local61 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local67 = Static189.aClass4_Sub10_Sub1_2.method4674();
				local71 = Static189.aClass4_Sub10_Sub1_2.method4666() * 4;
				local75 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local79 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local89 = Static189.aClass4_Sub10_Sub1_2.method4666();
				if (local89 == 255) {
					local89 = -1;
				}
				local364 = Static189.aClass4_Sub10_Sub1_2.method4666();
				if (local26 >= 0 && local34 >= 0 && local26 < 208 && local34 < 208 && local41 >= 0 && local47 >= 0 && local41 < 208 && local47 < 208 && local61 != 65535) {
					local47 = local47 * 64;
					local41 *= 64;
					local26 = local26 * 64;
					local34 = local34 * 64;
					if (local51 != 0) {
						@Pc(534) int local534;
						@Pc(542) Class53_Sub1 local542;
						@Pc(528) int local528;
						@Pc(538) int local538;
						if (local51 >= 0) {
							local528 = local51 - 1;
							local534 = local528 >> 11 & 0xF;
							local538 = local528 & 0x7FF;
							local542 = Static110.aClass53_Sub1_Sub2Array1[local538];
						} else {
							local528 = -local51 - 1;
							local534 = local528 >> 11 & 0xF;
							local538 = local528 & 0x7FF;
							if (local538 == Static273.anInt2022) {
								local542 = Static154.aClass53_Sub1_Sub1_2;
							} else {
								local542 = Static182.aClass53_Sub1_Sub1Array1[local538];
							}
						}
						if (local542 != null) {
							@Pc(581) Class34 local581 = local542.method3327();
							if (local581.anIntArrayArray7 != null && local581.anIntArrayArray7[local534] != null) {
								local67 -= local581.anIntArrayArray7[local534][1];
								local538 = local581.anIntArrayArray7[local534][0];
								@Pc(612) int local612 = Class111.anIntArray299[local542.anInt4031];
								@Pc(619) int local619 = local581.anIntArrayArray7[local534][2];
								@Pc(624) int local624 = Class111.anIntArray298[local542.anInt4031];
								@Pc(634) int local634 = local538 * local624 + local612 * local619 >> 16;
								@Pc(645) int local645 = local624 * local619 - local538 * local612 >> 16;
								local34 += local645;
								local26 += local634;
							}
						}
					}
					@Pc(682) Class53_Sub6 local682 = new Class53_Sub6(local61, Static281.anInt5335, local26, local34, Static33.method522(local34, local26, Static281.anInt5335) - local67, local75 - -Static50.anInt954, Static50.anInt954 + local79, local89, local364, local55, local71);
					local682.method3118(Static33.method522(local47, local41, Static281.anInt5335) - local71, local41, Static50.anInt954 + local75, local47);
					Static10.aClass114_1.method2625(new Class4_Sub3_Sub2(local682));
				}
			} else if (Static34.anInt552 == 158) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local26 = (local15 >> 4 & 0x7) + Static48.anInt894;
				local34 = Static44.anInt818 + (local15 & 0x7);
				local41 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local47 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local51 = Static189.aClass4_Sub10_Sub1_2.method4653();
				if (local26 >= 0 && local34 >= 0 && local26 < 104 && local34 < 104) {
					local34 = local34 * 128 + 64;
					local26 = local26 * 128 + 64;
					@Pc(789) Class53_Sub5 local789 = new Class53_Sub5(local41, Static281.anInt5335, local26, local34, Static33.method522(local34, local26, Static281.anInt5335) - local47, local51, Static50.anInt954);
					Static73.aClass114_8.method2625(new Class4_Sub3_Sub6(local789));
				}
			} else if (Static34.anInt552 == 179) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4653();
				if (local15 == 65535) {
					local15 = -1;
				}
				local26 = Static189.aClass4_Sub10_Sub1_2.method4642();
				local34 = local26 >> 2;
				local41 = local26 & 0x3;
				local47 = Static37.anIntArray52[local34];
				local51 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local61 = (local51 & 0x7) + Static44.anInt818;
				local55 = Static48.anInt894 + (local51 >> 4 & 0x7);
				Static272.method4287(local15, local55, Static281.anInt5335, local61, local47, local41, local34);
			} else if (Static34.anInt552 == 131) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4642();
				local26 = local15 >> 2;
				local41 = Static37.anIntArray52[local26];
				local34 = local15 & 0x3;
				local47 = Static189.aClass4_Sub10_Sub1_2.method4672();
				local51 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local61 = (local51 & 0x7) + Static44.anInt818;
				local55 = (local51 >> 4 & 0x7) + Static48.anInt894;
				if (local55 >= 0 && local61 >= 0 && local55 < 104 && local61 < 104) {
					Static61.method1011(local47, Static281.anInt5335, local34, local55, -1, local61, local26, local41, 0);
				}
			} else if (Static34.anInt552 == 115) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local26 = Static189.aClass4_Sub10_Sub1_2.method4666();
				Static6.method99(local15).method4494(local26);
			} else if (Static34.anInt552 == 232) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4626();
				local34 = Static44.anInt818 + (local15 & 0x7);
				local26 = (local15 >> 4 & 0x7) + Static48.anInt894;
				local41 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local47 = local41 >> 2;
				local55 = Static37.anIntArray52[local47];
				local51 = local41 & 0x3;
				if (local26 >= 0 && local34 >= 0 && local26 < 104 && local34 < 104) {
					Static61.method1011(-1, Static281.anInt5335, local51, local26, -1, local34, local47, local55, 0);
				}
			} else if (Static34.anInt552 == 105) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local26 = (local15 >> 4 & 0x7) + Static48.anInt894;
				local34 = (local15 & 0x7) + Static44.anInt818;
				local41 = Static189.aClass4_Sub10_Sub1_2.method4674() + local26;
				local47 = Static189.aClass4_Sub10_Sub1_2.method4674() + local34;
				local51 = Static189.aClass4_Sub10_Sub1_2.method4613();
				local55 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local61 = Static189.aClass4_Sub10_Sub1_2.method4666() * 4;
				local67 = Static189.aClass4_Sub10_Sub1_2.method4666() * 4;
				local71 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local75 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local79 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local89 = Static189.aClass4_Sub10_Sub1_2.method4666();
				if (local79 == 255) {
					local79 = -1;
				}
				if (local26 >= 0 && local34 >= 0 && local26 < 104 && local34 < 104 && local41 >= 0 && local47 >= 0 && local41 < 104 && local47 < 104 && local55 != 65535) {
					local34 = local34 * 128 + 64;
					local41 = local41 * 128 + 64;
					local47 = local47 * 128 + 64;
					local26 = local26 * 128 + 64;
					local161 = new Class53_Sub6(local55, Static281.anInt5335, local26, local34, Static33.method522(local34, local26, Static281.anInt5335) - local61, Static50.anInt954 + local71, local75 + Static50.anInt954, local79, local89, local51, local67);
					local161.method3118(Static33.method522(local47, local41, Static281.anInt5335) - local67, local41, local71 + Static50.anInt954, local47);
					Static10.aClass114_1.method2625(new Class4_Sub3_Sub2(local161));
				}
			} else if (Static34.anInt552 == 120) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4642();
				local26 = Static48.anInt894 + (local15 >> 4 & 0x7);
				local34 = (local15 & 0x7) + Static44.anInt818;
				local41 = Static189.aClass4_Sub10_Sub1_2.method4667();
				if (local26 >= 0 && local34 >= 0 && local26 < 104 && local34 < 104) {
					@Pc(1245) Class114 local1245 = Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local26][local34];
					if (local1245 != null) {
						for (@Pc(1253) Class4_Sub3_Sub21 local1253 = (Class4_Sub3_Sub21) local1245.method2623(); local1253 != null; local1253 = (Class4_Sub3_Sub21) local1245.method2629()) {
							if ((local41 & 0x7FFF) == local1253.aClass53_Sub2_1.anInt2168) {
								local1253.method4854();
								break;
							}
						}
						if (local1245.method2623() == null) {
							Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local26][local34] = null;
						}
						Static5.method89(local26, local34);
					}
				}
			} else if (Static34.anInt552 == 60) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4660();
				local34 = Static44.anInt818 + (local15 & 0x7);
				local26 = (local15 >> 4 & 0x7) + Static48.anInt894;
				local41 = Static189.aClass4_Sub10_Sub1_2.method4672();
				local47 = Static189.aClass4_Sub10_Sub1_2.method4667();
				if (local26 >= 0 && local34 >= 0 && local26 < 104 && local34 < 104) {
					@Pc(1352) Class53_Sub2 local1352 = new Class53_Sub2();
					local1352.anInt2166 = local47;
					local1352.anInt2168 = local41;
					if (Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local26][local34] == null) {
						Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local26][local34] = new Class114();
					}
					Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local26][local34].method2625(new Class4_Sub3_Sub21(local1352));
					Static5.method89(local26, local34);
				}
			} else if (Static34.anInt552 == 144) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local34 = Static44.anInt818 + (local15 & 0x7);
				local26 = Static48.anInt894 + (local15 >> 4 & 0x7);
				local41 = Static189.aClass4_Sub10_Sub1_2.method4653();
				if (local41 == 65535) {
					local41 = -1;
				}
				local47 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local51 = local47 >> 4 & 0xF;
				local55 = local47 & 0x7;
				local61 = Static189.aClass4_Sub10_Sub1_2.method4666();
				local67 = Static189.aClass4_Sub10_Sub1_2.method4666();
				if (local26 >= 0 && local34 >= 0 && local26 < 104 && local34 < 104) {
					local71 = local51 + 1;
					if (local26 - local71 <= Static154.aClass53_Sub1_Sub1_2.anIntArray422[0] && Static154.aClass53_Sub1_Sub1_2.anIntArray422[0] <= local71 + local26 && local34 - local71 <= Static154.aClass53_Sub1_Sub1_2.anIntArray426[0] && local34 + local71 >= Static154.aClass53_Sub1_Sub1_2.anIntArray426[0] && Static208.anInt4120 != 0 && local55 > 0 && Static237.anInt4458 < 50 && local41 != -1) {
						Static157.anIntArray294[Static237.anInt4458] = local41;
						Static298.anIntArray629[Static237.anInt4458] = local55;
						Static124.anIntArray217[Static237.anInt4458] = local61;
						Static169.aClass7Array1[Static237.anInt4458] = null;
						Static282.anIntArray601[Static237.anInt4458] = local51 + (local34 << 8) + (local26 << 16);
						Static10.anIntArray21[Static237.anInt4458] = local67;
						Static237.anInt4458++;
					}
				}
			} else if (Static34.anInt552 == 47) {
				local15 = Static189.aClass4_Sub10_Sub1_2.method4625();
				local26 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local34 = Static189.aClass4_Sub10_Sub1_2.method4653();
				local41 = Static189.aClass4_Sub10_Sub1_2.method4660();
				local47 = (local41 >> 4 & 0x7) + Static48.anInt894;
				local51 = Static44.anInt818 + (local41 & 0x7);
				if (local47 >= 0 && local51 >= 0 && local47 < 104 && local51 < 104 && local26 != Static273.anInt2022) {
					@Pc(1629) Class53_Sub2 local1629 = new Class53_Sub2();
					local1629.anInt2166 = local34;
					local1629.anInt2168 = local15;
					if (Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local47][local51] == null) {
						Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local47][local51] = new Class114();
					}
					Static139.aClass114ArrayArrayArray1[Static281.anInt5335][local47][local51].method2625(new Class4_Sub3_Sub21(local1629));
					Static5.method89(local47, local51);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!fh;IB)[Lclient!fe;")
	public static Class56_Sub1[] method4827(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1) {
		return Static265.method4168(arg0, arg1) ? Static186.method4395() : null;
	}
}
