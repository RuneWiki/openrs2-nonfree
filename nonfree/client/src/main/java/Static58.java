import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Lclient!r;")
	public static Class53 aClass53_2;

	@OriginalMember(owner = "client!le", name = "j", descriptor = "Z")
	public static boolean aBoolean74;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!va;")
	public static Class61 aClass61_643 = Static88.method1421("backleft2");

	@OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!va;")
	private static Class61 aClass61_644 = Static88.method1421("Loaded update list");

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!va;")
	private static Class61 aClass61_645 = Static88.method1421("Enter name of player to add to list");

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public static int anInt1533 = 0;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[I")
	public static int[] anIntArray170 = new int[2048];

	@OriginalMember(owner = "client!le", name = "o", descriptor = "Lclient!va;")
	public static Class61 aClass61_646 = aClass61_645;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!va;")
	public static Class61 aClass61_647 = aClass61_644;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
	public static void method839(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static38.anIntArray121[arg0];
		@Pc(16) int local16 = Static22.anIntArray78[arg0];
		@Pc(20) int local20 = Static29.anIntArray96[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(28) int local28 = Static33.anIntArray108[arg0];
		if (Static1.anInt6 != 0 && local20 != 1002) {
			Static1.anInt6 = 0;
			Static7.aBoolean1 = true;
		}
		if (local20 == 38) {
			Static50.aClass10_Sub10_Sub1_3.method1167(64);
			Static50.aClass10_Sub10_Sub1_3.method1114(local16);
			Static50.aClass10_Sub10_Sub1_3.method1140(local12);
			Static50.aClass10_Sub10_Sub1_3.method1152(local28);
			Static104.anInt2625 = 2;
			Static62.anInt1710 = local16;
			Static55.anInt1491 = local12;
			Static20.anInt2657 = 0;
			if (Static23.anInt752 == local16 >> 16) {
				Static104.anInt2625 = 1;
			}
			if (local16 >> 16 == Static74.anInt1871) {
				Static104.anInt2625 = 3;
			}
		}
		@Pc(95) Class10_Sub1_Sub5_Sub2_Sub2 local95;
		if (local20 == 54) {
			local95 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local28];
			if (local95 != null) {
				Static95.method1509(false, local95.anIntArray186[0], 1, 0, 2, 0, 1, local95.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static55.anInt1487 = Static12.anInt333;
				Static80.anInt2157 = Static67.anInt1776;
				Static33.anInt987 = 0;
				Static9.anInt303 = 2;
				Static50.aClass10_Sub10_Sub1_3.method1167(112);
				Static50.aClass10_Sub10_Sub1_3.method1157(Static22.anInt733);
				Static50.aClass10_Sub10_Sub1_3.method1146(local28);
			}
		}
		if (local20 == 19) {
			local95 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local28];
			if (local95 != null) {
				Static95.method1509(false, local95.anIntArray186[0], 1, 0, 2, 0, 1, local95.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static55.anInt1487 = Static12.anInt333;
				Static33.anInt987 = 0;
				Static80.anInt2157 = Static67.anInt1776;
				Static9.anInt303 = 2;
				Static50.aClass10_Sub10_Sub1_3.method1167(98);
				Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			}
		}
		if (local20 == 28) {
			Static103.method595(Static98.anInt2479);
			Static7.aBoolean1 = true;
			Static98.anInt2479 = -1;
		}
		@Pc(235) boolean local235;
		if (local20 == 21) {
			local235 = Static95.method1509(false, local16, 0, 0, 2, 0, 0, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (!local235) {
				Static95.method1509(false, local16, 1, 0, 2, 0, 1, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			}
			Static80.anInt2157 = Static67.anInt1776;
			Static33.anInt987 = 0;
			Static55.anInt1487 = Static12.anInt333;
			Static9.anInt303 = 2;
			Static50.aClass10_Sub10_Sub1_3.method1167(28);
			Static50.aClass10_Sub10_Sub1_3.method1129(local16 + Static7.anInt80);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static50.aClass10_Sub10_Sub1_3.method1129(Static107.anInt2431 + local12);
		}
		if (local20 == 46) {
			local235 = Static95.method1509(false, local16, 0, 0, 2, 0, 0, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (!local235) {
				Static95.method1509(false, local16, 1, 0, 2, 0, 1, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			}
			Static55.anInt1487 = Static12.anInt333;
			Static33.anInt987 = 0;
			Static80.anInt2157 = Static67.anInt1776;
			Static9.anInt303 = 2;
			Static50.aClass10_Sub10_Sub1_3.method1167(5);
			Static50.aClass10_Sub10_Sub1_3.method1152(local28);
			Static50.aClass10_Sub10_Sub1_3.method1140(Static7.anInt80 + local16);
			Static50.aClass10_Sub10_Sub1_3.method1146(Static107.anInt2431 + local12);
		}
		@Pc(376) Class10_Sub1_Sub5_Sub2_Sub1 local376;
		if (local20 == 1003) {
			local376 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local376 != null) {
				@Pc(381) Class10_Sub1_Sub3 local381 = local376.aClass10_Sub1_Sub3_1;
				if (local381.anIntArray48 != null) {
					local381 = local381.method278();
				}
				if (local381 != null) {
					Static50.aClass10_Sub10_Sub1_3.method1167(121);
					Static50.aClass10_Sub10_Sub1_3.method1129(local381.anInt389);
				}
			}
		}
		if (local20 == 9) {
			local376 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local376 != null) {
				Static95.method1509(false, local376.anIntArray186[0], 1, 0, 2, 0, 1, local376.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static33.anInt987 = 0;
				Static55.anInt1487 = Static12.anInt333;
				Static9.anInt303 = 2;
				Static80.anInt2157 = Static67.anInt1776;
				Static50.aClass10_Sub10_Sub1_3.method1167(181);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			}
		}
		if (local20 == 6) {
			Static50.aClass10_Sub10_Sub1_3.method1167(161);
			Static50.aClass10_Sub10_Sub1_3.method1146(local28);
			Static50.aClass10_Sub10_Sub1_3.method1140(local12);
			Static50.aClass10_Sub10_Sub1_3.method1114(local16);
			Static55.anInt1491 = local12;
			Static104.anInt2625 = 2;
			Static62.anInt1710 = local16;
			if (Static23.anInt752 == local16 >> 16) {
				Static104.anInt2625 = 1;
			}
			if (Static74.anInt1871 == local16 >> 16) {
				Static104.anInt2625 = 3;
			}
			Static20.anInt2657 = 0;
		}
		if (local20 == 12) {
			Static50.aClass10_Sub10_Sub1_3.method1167(131);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static50.aClass10_Sub10_Sub1_3.method1146(Static23.anInt761);
			Static50.aClass10_Sub10_Sub1_3.method1152(Static78.anInt2125);
			Static50.aClass10_Sub10_Sub1_3.method1140(local12);
			Static50.aClass10_Sub10_Sub1_3.method1157(local16);
			Static50.aClass10_Sub10_Sub1_3.method1157(Static11.anInt323);
			Static55.anInt1491 = local12;
			Static104.anInt2625 = 2;
			if (Static23.anInt752 == local16 >> 16) {
				Static104.anInt2625 = 1;
			}
			if (local16 >> 16 == Static74.anInt1871) {
				Static104.anInt2625 = 3;
			}
			Static62.anInt1710 = local16;
			Static20.anInt2657 = 0;
		}
		if (local20 == 1) {
			local376 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local376 != null) {
				Static95.method1509(false, local376.anIntArray186[0], 1, 0, 2, 0, 1, local376.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static9.anInt303 = 2;
				Static55.anInt1487 = Static12.anInt333;
				Static33.anInt987 = 0;
				Static80.anInt2157 = Static67.anInt1776;
				Static50.aClass10_Sub10_Sub1_3.method1167(242);
				Static50.aClass10_Sub10_Sub1_3.method1129(local28);
				Static50.aClass10_Sub10_Sub1_3.method1140(Static78.anInt2125);
				Static50.aClass10_Sub10_Sub1_3.method1140(Static23.anInt761);
				Static50.aClass10_Sub10_Sub1_3.method1150(Static11.anInt323);
			}
		}
		if (local20 == 40 && Static62.method929(local16, local28, local12)) {
			Static50.aClass10_Sub10_Sub1_3.method1167(252);
			Static50.aClass10_Sub10_Sub1_3.method1152(Static107.anInt2431 + local12);
			Static50.aClass10_Sub10_Sub1_3.method1146(local28 >> 14 & 0x7FFF);
			Static50.aClass10_Sub10_Sub1_3.method1129(Static7.anInt80 + local16);
			Static50.aClass10_Sub10_Sub1_3.method1130(Static22.anInt733);
		}
		if (local20 == 25) {
			local95 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local28];
			if (local95 != null) {
				Static95.method1509(false, local95.anIntArray186[0], 1, 0, 2, 0, 1, local95.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static33.anInt987 = 0;
				Static9.anInt303 = 2;
				Static55.anInt1487 = Static12.anInt333;
				Static80.anInt2157 = Static67.anInt1776;
				Static50.aClass10_Sub10_Sub1_3.method1167(175);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			}
		}
		@Pc(769) int local769;
		if (local20 == 55) {
			@Pc(746) Class61 local746 = Static19.aClass61Array7[arg0];
			@Pc(751) int local751 = local746.method1604(Static78.aClass61_851);
			if (local751 != -1) {
				@Pc(756) int local756 = -1;
				@Pc(767) long local767 = local746.method1619(local751 + 5).method1609().method1586();
				for (local769 = 0; local769 < Static6.anInt70; local769++) {
					if (Static76.aLongArray6[local769] == local767) {
						local756 = local769;
						break;
					}
				}
				if (local756 != -1 && Static33.anIntArray112[local756] > 0) {
					Static32.aBoolean44 = true;
					Static15.aClass61_154 = Static15.aClass61_166;
					Static10.anInt310 = 3;
					Static1.anInt6 = 0;
					Static7.aBoolean1 = true;
					Static89.aLong72 = Static76.aLongArray6[local756];
					Static15.aClass61_151 = Static93.method1156(new Class61[] { Static28.aClass61_336, Static106.aClass61Array15[local756] });
				}
			}
		}
		if (local20 == 56) {
			Static62.method929(local16, local28, local12);
			Static50.aClass10_Sub10_Sub1_3.method1167(201);
			Static50.aClass10_Sub10_Sub1_3.method1146(local16 + Static7.anInt80);
			Static50.aClass10_Sub10_Sub1_3.method1129(Static107.anInt2431 + local12);
			Static50.aClass10_Sub10_Sub1_3.method1140(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 39) {
			local376 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local376 != null) {
				Static95.method1509(false, local376.anIntArray186[0], 1, 0, 2, 0, 1, local376.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static9.anInt303 = 2;
				Static55.anInt1487 = Static12.anInt333;
				Static80.anInt2157 = Static67.anInt1776;
				Static33.anInt987 = 0;
				Static50.aClass10_Sub10_Sub1_3.method1167(178);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			}
		}
		if (local20 == 45) {
			local376 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local376 != null) {
				Static95.method1509(false, local376.anIntArray186[0], 1, 0, 2, 0, 1, local376.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static55.anInt1487 = Static12.anInt333;
				Static33.anInt987 = 0;
				Static80.anInt2157 = Static67.anInt1776;
				Static9.anInt303 = 2;
				Static50.aClass10_Sub10_Sub1_3.method1167(147);
				Static50.aClass10_Sub10_Sub1_3.method1152(local28);
			}
		}
		if (local20 == 18) {
			Static50.aClass10_Sub10_Sub1_3.method1167(10);
			Static50.aClass10_Sub10_Sub1_3.method1130(local16);
			Static50.aClass10_Sub10_Sub1_3.method1146(local12);
			Static50.aClass10_Sub10_Sub1_3.method1146(local28);
			Static104.anInt2625 = 2;
			if (Static23.anInt752 == local16 >> 16) {
				Static104.anInt2625 = 1;
			}
			if (Static74.anInt1871 == local16 >> 16) {
				Static104.anInt2625 = 3;
			}
			Static20.anInt2657 = 0;
			Static55.anInt1491 = local12;
			Static62.anInt1710 = local16;
		}
		if (local20 == 47) {
			local95 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local28];
			if (local95 != null) {
				Static95.method1509(false, local95.anIntArray186[0], 1, 0, 2, 0, 1, local95.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static33.anInt987 = 0;
				Static9.anInt303 = 2;
				Static55.anInt1487 = Static12.anInt333;
				Static80.anInt2157 = Static67.anInt1776;
				Static50.aClass10_Sub10_Sub1_3.method1167(47);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			}
		}
		if (local20 == 1004) {
			Static62.method929(local16, local28, local12);
			Static50.aClass10_Sub10_Sub1_3.method1167(212);
			Static50.aClass10_Sub10_Sub1_3.method1146(local16 + Static7.anInt80);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28 >> 14 & 0x7FFF);
			Static50.aClass10_Sub10_Sub1_3.method1146(local12 + Static107.anInt2431);
		}
		if (local20 == 3) {
			Static50.aClass10_Sub10_Sub1_3.method1167(146);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static50.aClass10_Sub10_Sub1_3.method1130(local16);
			Static50.aClass10_Sub10_Sub1_3.method1146(local12);
			Static104.anInt2625 = 2;
			Static62.anInt1710 = local16;
			Static20.anInt2657 = 0;
			Static55.anInt1491 = local12;
			if (local16 >> 16 == Static23.anInt752) {
				Static104.anInt2625 = 1;
			}
			if (Static74.anInt1871 == local16 >> 16) {
				Static104.anInt2625 = 3;
			}
		}
		if (local20 == 1005) {
			Static50.aClass10_Sub10_Sub1_3.method1167(233);
			Static50.aClass10_Sub10_Sub1_3.method1140(local28);
		}
		if (local20 == 23) {
			local235 = Static95.method1509(false, local16, 0, 0, 2, 0, 0, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (!local235) {
				Static95.method1509(false, local16, 1, 0, 2, 0, 1, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			}
			Static55.anInt1487 = Static12.anInt333;
			Static33.anInt987 = 0;
			Static80.anInt2157 = Static67.anInt1776;
			Static9.anInt303 = 2;
			Static50.aClass10_Sub10_Sub1_3.method1167(80);
			Static50.aClass10_Sub10_Sub1_3.method1152(local28);
			Static50.aClass10_Sub10_Sub1_3.method1129(local12 + Static107.anInt2431);
			Static50.aClass10_Sub10_Sub1_3.method1129(Static7.anInt80 + local16);
		}
		@Pc(1305) boolean local1305;
		if (local20 == 14) {
			local1305 = Static95.method1509(false, local16, 0, 0, 2, 0, 0, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (!local1305) {
				Static95.method1509(false, local16, 1, 0, 2, 0, 1, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			}
			Static80.anInt2157 = Static67.anInt1776;
			Static33.anInt987 = 0;
			Static55.anInt1487 = Static12.anInt333;
			Static9.anInt303 = 2;
			Static50.aClass10_Sub10_Sub1_3.method1167(162);
			Static50.aClass10_Sub10_Sub1_3.method1129(local16 + Static7.anInt80);
			Static50.aClass10_Sub10_Sub1_3.method1157(Static11.anInt323);
			Static50.aClass10_Sub10_Sub1_3.method1129(local12 + Static107.anInt2431);
			Static50.aClass10_Sub10_Sub1_3.method1129(Static78.anInt2125);
			Static50.aClass10_Sub10_Sub1_3.method1140(Static23.anInt761);
			Static50.aClass10_Sub10_Sub1_3.method1152(local28);
		}
		if (local20 == 7) {
			local1305 = Static95.method1509(false, local16, 0, 0, 2, 0, 0, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (!local1305) {
				Static95.method1509(false, local16, 1, 0, 2, 0, 1, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			}
			Static9.anInt303 = 2;
			Static80.anInt2157 = Static67.anInt1776;
			Static55.anInt1487 = Static12.anInt333;
			Static33.anInt987 = 0;
			Static50.aClass10_Sub10_Sub1_3.method1167(202);
			Static50.aClass10_Sub10_Sub1_3.method1152(Static7.anInt80 + local16);
			Static50.aClass10_Sub10_Sub1_3.method1150(Static22.anInt733);
			Static50.aClass10_Sub10_Sub1_3.method1129(local12 + Static107.anInt2431);
			Static50.aClass10_Sub10_Sub1_3.method1140(local28);
		}
		if (local20 == 29) {
			Static50.aClass10_Sub10_Sub1_3.method1167(2);
			Static50.aClass10_Sub10_Sub1_3.method1152(local28);
			Static50.aClass10_Sub10_Sub1_3.method1114(local16);
			Static50.aClass10_Sub10_Sub1_3.method1152(local12);
			Static104.anInt2625 = 2;
			Static20.anInt2657 = 0;
			if (Static23.anInt752 == local16 >> 16) {
				Static104.anInt2625 = 1;
			}
			Static62.anInt1710 = local16;
			Static55.anInt1491 = local12;
			if (local16 >> 16 == Static74.anInt1871) {
				Static104.anInt2625 = 3;
			}
		}
		@Pc(1509) Class10_Sub1_Sub5_Sub2_Sub2 local1509;
		if (local20 == 52) {
			local1509 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local28];
			if (local1509 != null) {
				Static95.method1509(false, local1509.anIntArray186[0], 1, 0, 2, 0, 1, local1509.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static9.anInt303 = 2;
				Static55.anInt1487 = Static12.anInt333;
				Static33.anInt987 = 0;
				Static80.anInt2157 = Static67.anInt1776;
				Static50.aClass10_Sub10_Sub1_3.method1167(86);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			}
		}
		if (local20 == 37 && Static62.method929(local16, local28, local12)) {
			Static50.aClass10_Sub10_Sub1_3.method1167(68);
			Static50.aClass10_Sub10_Sub1_3.method1129(local16 + Static7.anInt80);
			Static50.aClass10_Sub10_Sub1_3.method1140(Static78.anInt2125);
			Static50.aClass10_Sub10_Sub1_3.method1152(Static23.anInt761);
			Static50.aClass10_Sub10_Sub1_3.method1146(local12 + Static107.anInt2431);
			Static50.aClass10_Sub10_Sub1_3.method1130(Static11.anInt323);
			Static50.aClass10_Sub10_Sub1_3.method1152(local28 >> 14 & 0x7FFF);
		}
		@Pc(1616) Class10_Sub1_Sub5_Sub2_Sub1 local1616;
		if (local20 == 33) {
			local1616 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local1616 != null) {
				Static95.method1509(false, local1616.anIntArray186[0], 1, 0, 2, 0, 1, local1616.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static55.anInt1487 = Static12.anInt333;
				Static80.anInt2157 = Static67.anInt1776;
				Static9.anInt303 = 2;
				Static33.anInt987 = 0;
				Static50.aClass10_Sub10_Sub1_3.method1167(37);
				Static50.aClass10_Sub10_Sub1_3.method1146(local28);
			}
		}
		if (local20 == 34) {
			local1305 = Static95.method1509(false, local16, 0, 0, 2, 0, 0, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (!local1305) {
				Static95.method1509(false, local16, 1, 0, 2, 0, 1, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			}
			Static33.anInt987 = 0;
			Static80.anInt2157 = Static67.anInt1776;
			Static9.anInt303 = 2;
			Static55.anInt1487 = Static12.anInt333;
			Static50.aClass10_Sub10_Sub1_3.method1167(183);
			Static50.aClass10_Sub10_Sub1_3.method1129(local12 + Static107.anInt2431);
			Static50.aClass10_Sub10_Sub1_3.method1146(local28);
			Static50.aClass10_Sub10_Sub1_3.method1140(Static7.anInt80 + local16);
		}
		if (local20 == 13) {
			if (Static82.aBoolean97) {
				Static48.aClass54_1.method1388(local12 - 4, local16 + -4);
			} else {
				Static48.aClass54_1.method1388(Static12.anInt333 - 4, Static67.anInt1776 + -4);
			}
		}
		if (local20 == 27) {
			Static23.anInt761 = local12;
			Static11.anInt323 = local16;
			Static78.anInt2125 = local28;
			Static94.anInt2408 = 1;
			Static37.aClass61_435 = Static93.method1156(new Class61[] { Static16.aClass61_178, Static94.method1491(local28).aClass61_1029, Static78.aClass61_851 });
			Static20.anInt2651 = 0;
			Static80.aBoolean94 = true;
			if (Static37.aClass61_435 == null) {
				Static37.aClass61_435 = Static71.aClass61_761;
			}
			return;
		}
		if (local20 == 51) {
			Static42.method1472();
		}
		@Pc(1851) int local1851;
		@Pc(1831) Class10_Sub1_Sub4 local1831;
		if (local20 == 32) {
			Static50.aClass10_Sub10_Sub1_3.method1167(189);
			Static50.aClass10_Sub10_Sub1_3.method1157(local16);
			local1831 = Static103.method591(local16);
			if (local1831.anIntArrayArray7 != null && local1831.anIntArrayArray7[0][0] == 5) {
				local1851 = local1831.anIntArrayArray7[0][1];
				if (Static74.anIntArray228[local1851] != local1831.anIntArray62[0]) {
					Static74.anIntArray228[local1851] = local1831.anIntArray62[0];
					Static26.method922(local1851);
					Static80.aBoolean94 = true;
				}
			}
		}
		if (local20 == 20) {
			Static50.aClass10_Sub10_Sub1_3.method1167(109);
			Static50.aClass10_Sub10_Sub1_3.method1157(local16);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static50.aClass10_Sub10_Sub1_3.method1140(local12);
			Static104.anInt2625 = 2;
			Static55.anInt1491 = local12;
			Static62.anInt1710 = local16;
			Static20.anInt2657 = 0;
			if (local16 >> 16 == Static23.anInt752) {
				Static104.anInt2625 = 1;
			}
			if (Static74.anInt1871 == local16 >> 16) {
				Static104.anInt2625 = 3;
			}
		}
		if (local20 == 53) {
			Static62.method929(local16, local28, local12);
			Static50.aClass10_Sub10_Sub1_3.method1167(184);
			Static50.aClass10_Sub10_Sub1_3.method1129(Static107.anInt2431 + local12);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28 >> 14 & 0x7FFF);
			Static50.aClass10_Sub10_Sub1_3.method1146(local16 + Static7.anInt80);
		}
		if (local20 == 1006) {
			local1831 = Static103.method591(local16);
			if (local1831 == null || local1831.anIntArray65[local12] < 100000) {
				Static50.aClass10_Sub10_Sub1_3.method1167(233);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			} else {
				Static52.method794(Static15.aClass61_166, Static93.method1156(new Class61[] { Static29.method529(local1831.anIntArray65[local12]), Static70.aClass61_1084, Static94.method1491(local28).aClass61_1029 }), 0);
			}
		}
		if (local20 == 2) {
			Static62.method929(local16, local28, local12);
			Static50.aClass10_Sub10_Sub1_3.method1167(159);
			Static50.aClass10_Sub10_Sub1_3.method1152(local12 + Static107.anInt2431);
			Static50.aClass10_Sub10_Sub1_3.method1146(local28 >> 14 & 0x7FFF);
			Static50.aClass10_Sub10_Sub1_3.method1152(Static7.anInt80 + local16);
		}
		if (local20 == 22 && !Static104.aBoolean120) {
			Static50.aClass10_Sub10_Sub1_3.method1167(72);
			Static104.aBoolean120 = true;
		}
		if (local20 == 5) {
			local1509 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local28];
			if (local1509 != null) {
				Static95.method1509(false, local1509.anIntArray186[0], 1, 0, 2, 0, 1, local1509.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static33.anInt987 = 0;
				Static9.anInt303 = 2;
				Static80.anInt2157 = Static67.anInt1776;
				Static55.anInt1487 = Static12.anInt333;
				Static50.aClass10_Sub10_Sub1_3.method1167(244);
				Static50.aClass10_Sub10_Sub1_3.method1152(local28);
			}
		}
		if (local20 == 50) {
			local1616 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local1616 != null) {
				Static95.method1509(false, local1616.anIntArray186[0], 1, 0, 2, 0, 1, local1616.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static9.anInt303 = 2;
				Static80.anInt2157 = Static67.anInt1776;
				Static33.anInt987 = 0;
				Static55.anInt1487 = Static12.anInt333;
				Static50.aClass10_Sub10_Sub1_3.method1167(90);
				Static50.aClass10_Sub10_Sub1_3.method1157(Static22.anInt733);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			}
		}
		if (local20 == 49) {
			Static50.aClass10_Sub10_Sub1_3.method1167(107);
			Static50.aClass10_Sub10_Sub1_3.method1150(Static22.anInt733);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static50.aClass10_Sub10_Sub1_3.method1150(local16);
			Static50.aClass10_Sub10_Sub1_3.method1146(local12);
			Static62.anInt1710 = local16;
			Static20.anInt2657 = 0;
			Static104.anInt2625 = 2;
			if (Static23.anInt752 == local16 >> 16) {
				Static104.anInt2625 = 1;
			}
			Static55.anInt1491 = local12;
			if (local16 >> 16 == Static74.anInt1871) {
				Static104.anInt2625 = 3;
			}
		}
		if (local20 == 31) {
			local1509 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local28];
			if (local1509 != null) {
				Static95.method1509(false, local1509.anIntArray186[0], 1, 0, 2, 0, 1, local1509.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static80.anInt2157 = Static67.anInt1776;
				Static55.anInt1487 = Static12.anInt333;
				Static9.anInt303 = 2;
				Static33.anInt987 = 0;
				Static50.aClass10_Sub10_Sub1_3.method1167(253);
				Static50.aClass10_Sub10_Sub1_3.method1129(local28);
				Static50.aClass10_Sub10_Sub1_3.method1157(Static11.anInt323);
				Static50.aClass10_Sub10_Sub1_3.method1129(Static78.anInt2125);
				Static50.aClass10_Sub10_Sub1_3.method1129(Static23.anInt761);
			}
		}
		if (local20 == 8) {
			local1831 = Static103.method591(local16);
			@Pc(2324) boolean local2324 = true;
			if (local1831.anInt600 > 0) {
				local2324 = Static105.method1648(local1831);
			}
			if (local2324) {
				Static50.aClass10_Sub10_Sub1_3.method1167(189);
				Static50.aClass10_Sub10_Sub1_3.method1157(local16);
			}
		}
		@Pc(2357) Class61 local2357;
		if (local20 == 24 || local20 == 35) {
			local2357 = Static19.aClass61Array7[arg0];
			local1851 = local2357.method1604(Static78.aClass61_851);
			if (local1851 != -1) {
				local2357 = local2357.method1619(local1851 + 5).method1609();
				@Pc(2380) Class61 local2380 = local2357.method1591().method1617();
				@Pc(2382) boolean local2382 = false;
				for (local769 = 0; local769 < Static10.anInt305; local769++) {
					@Pc(2392) Class10_Sub1_Sub5_Sub2_Sub2 local2392 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[anIntArray170[local769]];
					if (local2392 != null && local2392.aClass61_699 != null && local2392.aClass61_699.method1594(local2380)) {
						Static95.method1509(false, local2392.anIntArray186[0], 1, 0, 2, 0, 1, local2392.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
						local2382 = true;
						if (local20 == 24) {
							Static50.aClass10_Sub10_Sub1_3.method1167(244);
							Static50.aClass10_Sub10_Sub1_3.method1152(anIntArray170[local769]);
						}
						if (local20 == 35) {
							Static50.aClass10_Sub10_Sub1_3.method1167(86);
							Static50.aClass10_Sub10_Sub1_3.method1140(anIntArray170[local769]);
						}
						break;
					}
				}
				if (!local2382) {
					Static52.method794(Static15.aClass61_166, Static93.method1156(new Class61[] { Static49.aClass61_569, local2380 }), 0);
				}
			}
		}
		if (local20 == 4) {
			local1831 = Static103.method591(local16);
			Static22.anInt733 = local16;
			Static88.anInt2310 = local1831.anInt595;
			Static20.anInt2651 = 1;
			Static94.anInt2408 = 0;
			Static80.aBoolean94 = true;
			Static49.aClass61_568 = Static93.method1156(new Class61[] { local1831.aClass61_193, Static52.aClass61_602, local1831.aClass61_190, Static78.aClass61_851 });
			if (Static88.anInt2310 == 16) {
				Static22.aBoolean35 = true;
				Static25.anInt782 = 3;
				Static80.aBoolean94 = true;
			}
			return;
		}
		if (local20 == 11) {
			Static50.aClass10_Sub10_Sub1_3.method1167(166);
			Static50.aClass10_Sub10_Sub1_3.method1129(local12);
			Static50.aClass10_Sub10_Sub1_3.method1157(local16);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static104.anInt2625 = 2;
			Static62.anInt1710 = local16;
			if (local16 >> 16 == Static23.anInt752) {
				Static104.anInt2625 = 1;
			}
			Static20.anInt2657 = 0;
			if (local16 >> 16 == Static74.anInt1871) {
				Static104.anInt2625 = 3;
			}
			Static55.anInt1491 = local12;
		}
		if (local20 == 44) {
			local2357 = Static19.aClass61Array7[arg0];
			local1851 = local2357.method1604(Static78.aClass61_851);
			if (local1851 != -1) {
				if (Static23.anInt752 == -1) {
					Static42.method1472();
					if (Static6.anInt63 != -1) {
						Static15.aClass61_144 = local2357.method1619(local1851 + 5).method1609();
						Static16.aBoolean23 = false;
						Static39.anInt276 = Static23.anInt752 = Static6.anInt63;
					}
				} else {
					Static52.method794(Static15.aClass61_166, Static57.aClass61_629, 0);
				}
			}
		}
		if (local20 == 1001) {
			Static50.aClass10_Sub10_Sub1_3.method1167(74);
			Static50.aClass10_Sub10_Sub1_3.method1152(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 17 || local20 == 15 || local20 == 48 || local20 == 30) {
			local2357 = Static19.aClass61Array7[arg0];
			local1851 = local2357.method1604(Static78.aClass61_851);
			if (local1851 != -1) {
				@Pc(2700) long local2700 = local2357.method1619(local1851 + 5).method1609().method1586();
				if (local20 == 17) {
					Static78.method1243(local2700);
				}
				if (local20 == 15) {
					Static52.method795(local2700);
				}
				if (local20 == 48) {
					Static65.method952(local2700);
				}
				if (local20 == 30) {
					Static103.method593(local2700);
				}
			}
		}
		if (local20 == 43) {
			Static50.aClass10_Sub10_Sub1_3.method1167(189);
			Static50.aClass10_Sub10_Sub1_3.method1157(local16);
			local1831 = Static103.method591(local16);
			if (local1831.anIntArrayArray7 != null && local1831.anIntArrayArray7[0][0] == 5) {
				local1851 = local1831.anIntArrayArray7[0][1];
				Static74.anIntArray228[local1851] = 1 - Static74.anIntArray228[local1851];
				Static26.method922(local1851);
				Static80.aBoolean94 = true;
			}
		}
		if (local20 == 16) {
			Static50.aClass10_Sub10_Sub1_3.method1167(240);
			Static50.aClass10_Sub10_Sub1_3.method1130(local16);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static50.aClass10_Sub10_Sub1_3.method1152(local12);
			Static62.anInt1710 = local16;
			Static20.anInt2657 = 0;
			Static55.anInt1491 = local12;
			Static104.anInt2625 = 2;
			if (local16 >> 16 == Static23.anInt752) {
				Static104.anInt2625 = 1;
			}
			if (local16 >> 16 == Static74.anInt1871) {
				Static104.anInt2625 = 3;
			}
		}
		if (local20 == 10) {
			local1305 = Static95.method1509(false, local16, 0, 0, 2, 0, 0, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (!local1305) {
				Static95.method1509(false, local16, 1, 0, 2, 0, 1, local12, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			}
			Static55.anInt1487 = Static12.anInt333;
			Static80.anInt2157 = Static67.anInt1776;
			Static9.anInt303 = 2;
			Static33.anInt987 = 0;
			Static50.aClass10_Sub10_Sub1_3.method1167(99);
			Static50.aClass10_Sub10_Sub1_3.method1152(local16 + Static7.anInt80);
			Static50.aClass10_Sub10_Sub1_3.method1146(local12 + Static107.anInt2431);
			Static50.aClass10_Sub10_Sub1_3.method1146(local28);
		}
		if (local20 == 36) {
			Static50.aClass10_Sub10_Sub1_3.method1167(148);
			Static50.aClass10_Sub10_Sub1_3.method1130(local16);
			Static50.aClass10_Sub10_Sub1_3.method1146(local28);
			Static50.aClass10_Sub10_Sub1_3.method1152(local12);
			Static104.anInt2625 = 2;
			Static62.anInt1710 = local16;
			if (Static23.anInt752 == local16 >> 16) {
				Static104.anInt2625 = 1;
			}
			Static20.anInt2657 = 0;
			Static55.anInt1491 = local12;
			if (local16 >> 16 == Static74.anInt1871) {
				Static104.anInt2625 = 3;
			}
		}
		if (local20 == 42) {
			Static50.aClass10_Sub10_Sub1_3.method1167(249);
			Static50.aClass10_Sub10_Sub1_3.method1146(local12);
			Static50.aClass10_Sub10_Sub1_3.method1129(local28);
			Static50.aClass10_Sub10_Sub1_3.method1114(local16);
			Static20.anInt2657 = 0;
			Static55.anInt1491 = local12;
			Static104.anInt2625 = 2;
			Static62.anInt1710 = local16;
			if (local16 >> 16 == Static23.anInt752) {
				Static104.anInt2625 = 1;
			}
			if (Static74.anInt1871 == local16 >> 16) {
				Static104.anInt2625 = 3;
			}
		}
		if (local20 == 26) {
			Static62.method929(local16, local28, local12);
			Static50.aClass10_Sub10_Sub1_3.method1167(213);
			Static50.aClass10_Sub10_Sub1_3.method1140(local16 + Static7.anInt80);
			Static50.aClass10_Sub10_Sub1_3.method1140(local28 >> 14 & 0x7FFF);
			Static50.aClass10_Sub10_Sub1_3.method1152(Static107.anInt2431 + local12);
		}
		if (local20 == 41) {
			local1616 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[local28];
			if (local1616 != null) {
				Static95.method1509(false, local1616.anIntArray186[0], 1, 0, 2, 0, 1, local1616.anIntArray189[0], Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
				Static80.anInt2157 = Static67.anInt1776;
				Static33.anInt987 = 0;
				Static9.anInt303 = 2;
				Static55.anInt1487 = Static12.anInt333;
				Static50.aClass10_Sub10_Sub1_3.method1167(153);
				Static50.aClass10_Sub10_Sub1_3.method1140(local28);
			}
		}
		if (Static94.anInt2408 != 0) {
			Static94.anInt2408 = 0;
			Static80.aBoolean94 = true;
		}
		if (Static20.anInt2651 != 0) {
			Static20.anInt2651 = 0;
			Static80.aBoolean94 = true;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLclient!va;ILclient!va;)V")
	public static void method840(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(3) Class61 arg2) {
		if (Static40.aBoolean51) {
			Static40.aBoolean51 = false;
			Static15.method338();
			Static37.method619();
			Static30.method552();
			Static66.method955();
			Static13.method279(Static4.anInt25, Static17.anInt584, Static53.anInt1449, Static99.aClass10_Sub1_Sub1_Sub4_4);
			Static35.method603(-1, Static34.anIntArray114, Static25.anInt782, Static57.anInt1518 == -1);
			Static7.aBoolean3 = true;
			Static25.aBoolean36 = true;
			Static7.aBoolean2 = true;
		}
		Static43.method694();
		@Pc(45) short local45 = 151;
		@Pc(46) int local46 = local45 - 3;
		Static99.aClass10_Sub1_Sub1_Sub4_4.method1544(arg2, 257, 148, 0);
		Static99.aClass10_Sub1_Sub1_Sub4_4.method1544(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local46 += 15;
			if (arg0) {
				@Pc(76) int local76 = Static99.aClass10_Sub1_Sub1_Sub4_4.method1549(arg1) + 4;
				Static45.method1531(257 - local76 / 2, 152, local76, 11, 0);
			}
			Static99.aClass10_Sub1_Sub1_Sub4_4.method1544(arg1, 257, 163, 0);
			Static99.aClass10_Sub1_Sub1_Sub4_4.method1544(arg1, 256, 162, 16777215);
		}
		Static74.method1042();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method841() {
		aClass61_647 = null;
		aClass61_644 = null;
		aClass53_2 = null;
		anIntArray170 = null;
		aClass61_645 = null;
		aClass61_646 = null;
		aClass61_643 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method842() {
		@Pc(5) Object local5 = Static89.anObject4;
		synchronized (Static89.anObject4) {
			if (Static74.anInt1869 != 0) {
				Static74.anInt1869 = 1;
				try {
					Static89.anObject4.wait();
				} catch (@Pc(15) InterruptedException local15) {
				}
			}
		}
	}
}
