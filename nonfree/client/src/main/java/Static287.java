import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject7;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "Lclient!wt;")
	public static final Class268 aClass268_97 = new Class268("", 13);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	public static void method3732(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(10, arg0);
		local8.method3458();
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method3734() {
		Static94.method1357(Static68.aClass250_2);
		Static221.anInt3584++;
		if (Static118.aBoolean147 && Static245.aBoolean313) {
			@Pc(28) int local28 = Static210.aClass26_1.method576();
			@Pc(32) int local32 = Static210.aClass26_1.method574();
			local28 -= Static380.anInt6320;
			local32 -= Static16.anInt3240;
			if (Static15.anInt285 > local28) {
				local28 = Static15.anInt285;
			}
			if (Static68.aClass250_2.anInt7041 + local28 > Static6.aClass250_1.anInt7041 + Static15.anInt285) {
				local28 = Static15.anInt285 + Static6.aClass250_1.anInt7041 - Static68.aClass250_2.anInt7041;
			}
			if (Static118.anInt2023 > local32) {
				local32 = Static118.anInt2023;
			}
			if (Static68.aClass250_2.anInt6997 + local32 > Static118.anInt2023 - -Static6.aClass250_1.anInt6997) {
				local32 = Static6.aClass250_1.anInt6997 + Static118.anInt2023 - Static68.aClass250_2.anInt6997;
			}
			@Pc(103) int local103 = local28 + Static6.aClass250_1.anInt7015 - Static15.anInt285;
			@Pc(111) int local111 = Static6.aClass250_1.anInt6966 + local32 - Static118.anInt2023;
			@Pc(160) Class1_Sub31 local160;
			if (Static210.aClass26_1.method572()) {
				if (Static68.aClass250_2.anInt7004 < Static221.anInt3584) {
					@Pc(203) int local203 = local28 - Static79.anInt1463;
					@Pc(207) int local207 = local32 - Static442.anInt7350;
					if (local203 > Static68.aClass250_2.anInt6959 || -Static68.aClass250_2.anInt6959 > local203 || local207 > Static68.aClass250_2.anInt6959 || -Static68.aClass250_2.anInt6959 > local207) {
						Static359.aBoolean496 = true;
					}
				}
				if (Static68.aClass250_2.anObjectArray10 != null && Static359.aBoolean496) {
					local160 = new Class1_Sub31();
					local160.aClass250_8 = Static68.aClass250_2;
					local160.anInt5071 = local103;
					local160.anObjectArray5 = Static68.aClass250_2.anObjectArray10;
					local160.anInt5068 = local111;
					Static267.method3402(local160);
				}
			} else {
				if (Static359.aBoolean496) {
					Static172.method2334();
					if (Static68.aClass250_2.anObjectArray15 != null) {
						local160 = new Class1_Sub31();
						local160.anObjectArray5 = Static68.aClass250_2.anObjectArray15;
						local160.anInt5068 = local111;
						local160.anInt5071 = local103;
						local160.aClass250_9 = Static70.aClass250_3;
						local160.aClass250_8 = Static68.aClass250_2;
						Static267.method3402(local160);
					}
					if (Static70.aClass250_3 != null && Static52.method814(Static68.aClass250_2) != null) {
						Static184.method2460(Static68.aClass250_2, Static70.aClass250_3);
					}
				} else if ((Static354.anInt5869 == 1 || Static286.method3731()) && Static19.anInt396 > 2) {
					Static23.method431(Static79.anInt1463 + Static380.anInt6320, Static16.anInt3240 + Static442.anInt7350);
				} else if (Static18.method279()) {
					Static23.method431(Static79.anInt1463 + Static380.anInt6320, Static16.anInt3240 + Static442.anInt7350);
				}
				Static68.aClass250_2 = null;
			}
		} else if (Static221.anInt3584 > 1) {
			Static68.aClass250_2 = null;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLclient!m;Lclient!qa;)V")
	public static void method3735(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Class128 arg1) {
		if (Static114.aClass1_Sub3_Sub16_3 == null) {
			return;
		}
		if (Static37.anInt732 < 10) {
			if (!Static114.aClass113_128.method2254(Static114.aClass1_Sub3_Sub16_3.aString56)) {
				Static37.anInt732 = Static274.aClass113_84.method2267(Static114.aClass1_Sub3_Sub16_3.aString56) / 10;
				return;
			}
			Static132.method1791();
			Static37.anInt732 = 10;
		}
		if (Static37.anInt732 == 10) {
			Static114.anInt6798 = Static114.aClass1_Sub3_Sub16_3.anInt6747 >> 6 << 6;
			Static114.anInt6800 = Static114.aClass1_Sub3_Sub16_3.anInt6749 >> 6 << 6;
			Static114.anInt6796 = (Static114.aClass1_Sub3_Sub16_3.anInt6750 >> 6 << 6) + 64 - Static114.anInt6798;
			Static114.anInt6803 = (Static114.aClass1_Sub3_Sub16_3.anInt6760 >> 6 << 6) + 64 - Static114.anInt6800;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static114.aClass1_Sub3_Sub16_3.method5178(Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89, local80, Static101.anInt6646 + (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7), (Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7) + Static278.anInt4392)) {
				local82 = local80[1] - Static114.anInt6798;
				local84 = local80[2] - Static114.anInt6800;
			}
			if (!Static351.aBoolean482 && local82 >= 0 && local82 < Static114.anInt6796 && local84 >= 0 && Static114.anInt6803 > local84) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local84 += (int) (Math.random() * 10.0D) - 5;
				Static257.anInt6932 = local82;
				Static2.anInt3076 = local84;
			} else if (Static43.anInt5197 == -1 || Static274.anInt4341 == -1) {
				Static114.aClass1_Sub3_Sub16_3.method5177(local80, Static114.aClass1_Sub3_Sub16_3.anInt6753 & 0x3FFF, Static114.aClass1_Sub3_Sub16_3.anInt6753 >> 14 & 0x3FFF);
				Static2.anInt3076 = local80[2] - Static114.anInt6800;
				Static257.anInt6932 = local80[1] - Static114.anInt6798;
			} else {
				Static114.aClass1_Sub3_Sub16_3.method5177(local80, Static274.anInt4341, Static43.anInt5197);
				Static351.aBoolean482 = false;
				Static274.anInt4341 = -1;
				Static43.anInt5197 = -1;
				if (local80 != null) {
					Static257.anInt6932 = local80[1] - Static114.anInt6798;
					Static2.anInt3076 = local80[2] - Static114.anInt6800;
				}
			}
			if (Static114.aClass1_Sub3_Sub16_3.anInt6755 == 37) {
				Static114.aFloat93 = 3.0F;
				Static114.aFloat94 = 3.0F;
			} else if (Static114.aClass1_Sub3_Sub16_3.anInt6755 == 50) {
				Static114.aFloat93 = 4.0F;
				Static114.aFloat94 = 4.0F;
			} else if (Static114.aClass1_Sub3_Sub16_3.anInt6755 == 75) {
				Static114.aFloat93 = 6.0F;
				Static114.aFloat94 = 6.0F;
			} else if (Static114.aClass1_Sub3_Sub16_3.anInt6755 == 100) {
				Static114.aFloat93 = 8.0F;
				Static114.aFloat94 = 8.0F;
			} else if (Static114.aClass1_Sub3_Sub16_3.anInt6755 == 200) {
				Static114.aFloat93 = 16.0F;
				Static114.aFloat94 = 16.0F;
			} else {
				Static114.aFloat93 = 8.0F;
				Static114.aFloat94 = 8.0F;
			}
			Static114.anInt6795 = (int) Static114.aFloat93 >> 1;
			Static114.aByteArrayArrayArray18 = Static327.method4189(Static114.anInt6795);
			Static144.method1907();
			Static114.method5213();
			Static110.aClass254_11 = new Class254();
			Static114.anInt6793 += (int) (Math.random() * 5.0D) - 2;
			if (Static114.anInt6793 < -8) {
				Static114.anInt6793 = -8;
			}
			if (Static114.anInt6793 > 8) {
				Static114.anInt6793 = 8;
			}
			Static114.anInt6794 += (int) (Math.random() * 5.0D) - 2;
			if (Static114.anInt6794 < -16) {
				Static114.anInt6794 = -16;
			}
			if (Static114.anInt6794 > 16) {
				Static114.anInt6794 = 16;
			}
			Static114.method5224(arg0, Static114.anInt6793 >> 2 << 10, Static114.anInt6794 >> 1);
			Static114.aClass101_4.method2103(1024, 256);
			Static114.aClass135_4.method2795(256, 256);
			Static114.aClass95_4.method1830(4096);
			Static182.aClass205_1.method4216(256);
			Static37.anInt732 = 20;
		} else if (Static37.anInt732 == 20) {
			Static27.method869(true);
			Static114.method5223(arg1, Static114.anInt6793, Static114.anInt6794);
			Static37.anInt732 = 60;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 60) {
			if (Static114.aClass113_128.method2277(Static114.aClass1_Sub3_Sub16_3.aString56 + "_staticelements")) {
				if (!Static114.aClass113_128.method2254(Static114.aClass1_Sub3_Sub16_3.aString56 + "_staticelements")) {
					return;
				}
				Static114.aClass22_3 = Static420.method210(Static114.aClass1_Sub3_Sub16_3.aString56 + "_staticelements", Static305.aBoolean410, Static114.aClass113_128);
			} else {
				Static114.aClass22_3 = new Class22(0);
			}
			Static114.method5216();
			Static37.anInt732 = 70;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 70) {
			Static365.aClass244_8 = new Class244(arg1, 11, true, Static226.aCanvas9);
			Static37.anInt732 = 73;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 73) {
			Static326.aClass244_6 = new Class244(arg1, 12, true, Static226.aCanvas9);
			Static37.anInt732 = 76;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 76) {
			Static433.aClass244_10 = new Class244(arg1, 14, true, Static226.aCanvas9);
			Static37.anInt732 = 79;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 79) {
			Static133.aClass244_3 = new Class244(arg1, 17, true, Static226.aCanvas9);
			Static37.anInt732 = 82;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 82) {
			Static69.aClass244_7 = new Class244(arg1, 19, true, Static226.aCanvas9);
			Static37.anInt732 = 85;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 85) {
			Static290.aClass244_5 = new Class244(arg1, 22, true, Static226.aCanvas9);
			Static37.anInt732 = 88;
			Static27.method869(true);
			Static285.method3724();
		} else if (Static37.anInt732 == 88) {
			Static5.aClass244_1 = new Class244(arg1, 26, true, Static226.aCanvas9);
			Static37.anInt732 = 91;
			Static27.method869(true);
			Static285.method3724();
		} else {
			Static411.aClass244_9 = new Class244(arg1, 30, true, Static226.aCanvas9);
			Static37.anInt732 = 100;
			Static27.method869(true);
			Static285.method3724();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
	public static void method3736() {
		for (@Pc(17) Class1_Sub30 local17 = (Class1_Sub30) Static204.aClass254_22.method5437(); local17 != null; local17 = (Class1_Sub30) Static204.aClass254_22.method5433()) {
			if (local17.anInt4693 > 0) {
				local17.anInt4693--;
			}
			if (local17.anInt4693 != 0) {
				if (local17.anInt4694 > 0) {
					local17.anInt4694--;
				}
				if (local17.anInt4694 == 0 && local17.anInt4697 >= 1 && local17.anInt4691 >= 1 && local17.anInt4697 <= Static425.anInt6922 - 2 && local17.anInt4691 <= Static251.anInt4072 - 2 && (local17.anInt4695 < 0 || Static42.method5390(local17.anInt4701, local17.anInt4695))) {
					Static108.method1514(local17.anInt4704, -1, local17.anInt4701, local17.anInt4703, local17.anInt4691, local17.anInt4695, local17.anInt4697, local17.anInt4702);
					local17.anInt4694 = -1;
					if (local17.anInt4699 == local17.anInt4695 && local17.anInt4699 == -1) {
						local17.method5617();
					} else if (local17.anInt4699 == local17.anInt4695 && local17.anInt4702 == local17.anInt4696 && local17.anInt4701 == local17.anInt4698) {
						local17.method5617();
					}
				}
			} else if (local17.anInt4699 < 0 || Static42.method5390(local17.anInt4698, local17.anInt4699)) {
				Static108.method1514(local17.anInt4704, -1, local17.anInt4698, local17.anInt4703, local17.anInt4691, local17.anInt4699, local17.anInt4697, local17.anInt4696);
				local17.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!jd;IIII)V")
	public static void method3737(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static402.method5017(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static362.anInt6113) {
			Static402.method5017(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static402.method5017(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static195.anInt3127) {
			Static402.method5017(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static195.anInt3127) {
			Static402.method5017(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static362.anInt6113 && arg4 <= Static195.anInt3127) {
			Static402.method5017(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static402.method5017(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static362.anInt6113 && arg4 > 0) {
			Static402.method5017(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}
}
