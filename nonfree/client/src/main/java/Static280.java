import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
	private static int anInt767;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
	private static int anInt768;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[J")
	public static long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "S")
	public static short aShort11 = 32767;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "J")
	public static long aLong35 = 0L;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)V")
	public static void method664(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static73.anIntArray117[arg0];
		@Pc(19) int local19 = Static262.anIntArray543[arg0];
		@Pc(24) int local24 = (int) Static141.aLongArray56[arg0];
		@Pc(28) int local28 = Static262.aShortArray100[arg0];
		@Pc(32) long local32 = Static141.aLongArray56[arg0];
		if (local28 >= 2000) {
			local28 -= 2000;
		}
		@Pc(46) Class53_Sub1_Sub1 local46;
		if (local28 == 24) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static268.anInt5178 = Static79.anInt1797;
				Static309.anInt6012 = 2;
				Static73.anInt1629 = 0;
				Static165.anInt3275 = Static278.anInt5313;
				Static110.aClass4_Sub10_Sub1_1.method4687(52);
				Static110.aClass4_Sub10_Sub1_1.method4668(local24);
				Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 17) {
			Static110.aClass4_Sub10_Sub1_1.method4687(95);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			Static110.aClass4_Sub10_Sub1_1.method4621(local19);
			Static110.aClass4_Sub10_Sub1_1.method4673(local15);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		@Pc(146) Class53_Sub1_Sub2 local146;
		if (local28 == 33) {
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static268.anInt5178 = Static79.anInt1797;
				Static309.anInt6012 = 2;
				Static165.anInt3275 = Static278.anInt5313;
				Static73.anInt1629 = 0;
				Static110.aClass4_Sub10_Sub1_1.method4687(160);
				Static110.aClass4_Sub10_Sub1_1.method4615(Static54.aBooleanArray4[82] ? 1 : 0);
				Static110.aClass4_Sub10_Sub1_1.method4661(Static223.anInt4303);
				Static110.aClass4_Sub10_Sub1_1.method4650(local24);
				Static110.aClass4_Sub10_Sub1_1.method4668(Static22.anInt314);
				Static110.aClass4_Sub10_Sub1_1.method4673(Static15.anInt243);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3324(), local15);
			}
		}
		if (local28 == 40) {
			Static165.anInt3275 = Static278.anInt5313;
			Static309.anInt6012 = 2;
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static110.aClass4_Sub10_Sub1_1.method4687(134);
			Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4651(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static110.aClass4_Sub10_Sub1_1.method4651(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4673(Static220.anInt3983 + local15);
			Static60.method1004(local19, local32, local15);
		}
		if (local28 == 46) {
			Static73.anInt1629 = 0;
			Static268.anInt5178 = Static79.anInt1797;
			Static309.anInt6012 = 2;
			Static165.anInt3275 = Static278.anInt5313;
			Static110.aClass4_Sub10_Sub1_1.method4687(227);
			Static110.aClass4_Sub10_Sub1_1.method4668(local15 + Static220.anInt3983);
			Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 21) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static165.anInt3275 = Static278.anInt5313;
				Static268.anInt5178 = Static79.anInt1797;
				Static309.anInt6012 = 2;
				Static73.anInt1629 = 0;
				Static110.aClass4_Sub10_Sub1_1.method4687(123);
				Static110.aClass4_Sub10_Sub1_1.method4673(local24);
				Static110.aClass4_Sub10_Sub1_1.method4654(Static223.anInt4303);
				Static110.aClass4_Sub10_Sub1_1.method4651(Static22.anInt314);
				Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
				Static110.aClass4_Sub10_Sub1_1.method4673(Static15.anInt243);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 1004) {
			Static165.anInt3275 = Static278.anInt5313;
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static309.anInt6012 = 2;
			Static110.aClass4_Sub10_Sub1_1.method4687(72);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
		}
		if (local28 == 19) {
			if (local24 == 0) {
				Static78.anInt1767 = 1;
				Static197.method3199(Static281.anInt5335, local15, local19);
			} else if (local24 == 1) {
				Static110.aClass4_Sub10_Sub1_1.method4687(204);
				Static110.aClass4_Sub10_Sub1_1.method4651(local19 + Static295.anInt5480);
				Static110.aClass4_Sub10_Sub1_1.method4651(Static71.anInt1367);
				Static110.aClass4_Sub10_Sub1_1.method4621(Static21.anInt1053);
				Static110.aClass4_Sub10_Sub1_1.method4650(local15 + Static220.anInt3983);
			}
		}
		if (local28 == 28) {
			Static165.anInt3275 = Static278.anInt5313;
			Static309.anInt6012 = 2;
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static110.aClass4_Sub10_Sub1_1.method4687(119);
			Static110.aClass4_Sub10_Sub1_1.method4621(Static223.anInt4303);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4651(Static15.anInt243);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static22.anInt314);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static220.anInt3983 + local15);
			Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 36) {
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static309.anInt6012 = 2;
				Static73.anInt1629 = 0;
				Static268.anInt5178 = Static79.anInt1797;
				Static165.anInt3275 = Static278.anInt5313;
				Static110.aClass4_Sub10_Sub1_1.method4687(37);
				Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
				Static110.aClass4_Sub10_Sub1_1.method4673(local24);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3324(), local15);
			}
		}
		if (local28 == 12) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static309.anInt6012 = 2;
				Static268.anInt5178 = Static79.anInt1797;
				Static73.anInt1629 = 0;
				Static165.anInt3275 = Static278.anInt5313;
				Static110.aClass4_Sub10_Sub1_1.method4687(4);
				Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
				Static110.aClass4_Sub10_Sub1_1.method4651(local24);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 10) {
			Static110.aClass4_Sub10_Sub1_1.method4687(102);
			Static110.aClass4_Sub10_Sub1_1.method4654(local19);
			Static110.aClass4_Sub10_Sub1_1.method4651(local15);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 25) {
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static73.anInt1629 = 0;
				Static165.anInt3275 = Static278.anInt5313;
				Static309.anInt6012 = 2;
				Static268.anInt5178 = Static79.anInt1797;
				Static110.aClass4_Sub10_Sub1_1.method4687(33);
				Static110.aClass4_Sub10_Sub1_1.method4673(local24);
				Static110.aClass4_Sub10_Sub1_1.method4648(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3324(), local15);
			}
		}
		if (local28 == 1007) {
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static165.anInt3275 = Static278.anInt5313;
			Static309.anInt6012 = 2;
			Static110.aClass4_Sub10_Sub1_1.method4687(176);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
		}
		if (local28 == 4) {
			Static309.anInt6012 = 2;
			Static165.anInt3275 = Static278.anInt5313;
			Static73.anInt1629 = 0;
			Static268.anInt5178 = Static79.anInt1797;
			Static110.aClass4_Sub10_Sub1_1.method4687(89);
			Static110.aClass4_Sub10_Sub1_1.method4668((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static110.aClass4_Sub10_Sub1_1.method4615(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4673(Static220.anInt3983 + local15);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static71.anInt1367);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4621(Static21.anInt1053);
			Static60.method1004(local19, local32, local15);
		}
		if (local28 == 6) {
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static309.anInt6012 = 2;
			Static165.anInt3275 = Static278.anInt5313;
			Static110.aClass4_Sub10_Sub1_1.method4687(232);
			Static110.aClass4_Sub10_Sub1_1.method4650(local19 + Static295.anInt5480);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static110.aClass4_Sub10_Sub1_1.method4648(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4650(local15 + Static220.anInt3983);
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 42) {
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static73.anInt1629 = 0;
				Static268.anInt5178 = Static79.anInt1797;
				Static165.anInt3275 = Static278.anInt5313;
				Static309.anInt6012 = 2;
				Static110.aClass4_Sub10_Sub1_1.method4687(155);
				Static110.aClass4_Sub10_Sub1_1.method4651(local24);
				Static110.aClass4_Sub10_Sub1_1.method4615(Static54.aBooleanArray4[82] ? 1 : 0);
				Static110.aClass4_Sub10_Sub1_1.method4668(Static71.anInt1367);
				Static110.aClass4_Sub10_Sub1_1.method4621(Static21.anInt1053);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3324(), local15);
			}
		}
		if (local28 == 31) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static165.anInt3275 = Static278.anInt5313;
				Static73.anInt1629 = 0;
				Static268.anInt5178 = Static79.anInt1797;
				Static309.anInt6012 = 2;
				Static110.aClass4_Sub10_Sub1_1.method4687(105);
				Static110.aClass4_Sub10_Sub1_1.method4668(local24);
				Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 47) {
			if (local24 == 0) {
				Static259.anInt4947 = 1;
				Static197.method3199(Static281.anInt5335, local15, local19);
			} else if (Static133.anInt2576 > 0 && Static54.aBooleanArray4[82] && Static54.aBooleanArray4[81]) {
				Static167.method2958(Static220.anInt3983 + local15, Static295.anInt5480 + local19, Static281.anInt5335);
			} else {
				Static110.aClass4_Sub10_Sub1_1.method4687(85);
				Static110.aClass4_Sub10_Sub1_1.method4673(Static220.anInt3983 + local15);
				Static110.aClass4_Sub10_Sub1_1.method4650(Static295.anInt5480 + local19);
			}
		}
		if (local28 == 59) {
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static165.anInt3275 = Static278.anInt5313;
				Static268.anInt5178 = Static79.anInt1797;
				Static73.anInt1629 = 0;
				Static309.anInt6012 = 2;
				Static110.aClass4_Sub10_Sub1_1.method4687(53);
				Static110.aClass4_Sub10_Sub1_1.method4673(local24);
				Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3324(), local15);
			}
		}
		if (local28 == 51) {
			Static110.aClass4_Sub10_Sub1_1.method4687(88);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static110.aClass4_Sub10_Sub1_1.method4628(local19);
			Static110.aClass4_Sub10_Sub1_1.method4673(local15);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 13) {
			Static110.aClass4_Sub10_Sub1_1.method4687(242);
			Static110.aClass4_Sub10_Sub1_1.method4673(local15);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static110.aClass4_Sub10_Sub1_1.method4628(local19);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 3 && Static252.aClass189_14 == null) {
			Static308.method4773(local15, local19);
			Static252.aClass189_14 = Static152.method2432(local19, local15);
			Static205.method3283(Static252.aClass189_14);
		}
		if (local28 == 1) {
			Static110.aClass4_Sub10_Sub1_1.method4687(40);
			Static110.aClass4_Sub10_Sub1_1.method4628(local19);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static71.anInt1367);
			Static110.aClass4_Sub10_Sub1_1.method4650(local15);
			Static110.aClass4_Sub10_Sub1_1.method4654(Static21.anInt1053);
		}
		if (local28 == 29) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static73.anInt1629 = 0;
				Static165.anInt3275 = Static278.anInt5313;
				Static268.anInt5178 = Static79.anInt1797;
				Static309.anInt6012 = 2;
				Static110.aClass4_Sub10_Sub1_1.method4687(148);
				Static110.aClass4_Sub10_Sub1_1.method4651(local24);
				Static110.aClass4_Sub10_Sub1_1.method4648(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		@Pc(1452) int local1452;
		@Pc(1434) Class189 local1434;
		if (local28 == 11) {
			Static110.aClass4_Sub10_Sub1_1.method4687(158);
			Static110.aClass4_Sub10_Sub1_1.method4654(local19);
			local1434 = Static114.method1814(local19);
			if (local1434.anIntArrayArray50 != null && local1434.anIntArrayArray50[0][0] == 5) {
				local1452 = local1434.anIntArrayArray50[0][1];
				if (local1434.anIntArray671[0] != Static2.anIntArray2[local1452]) {
					Static2.anIntArray2[local1452] = local1434.anIntArray671[0];
					Static221.method3571(local1452);
				}
			}
		}
		if (local28 == 32) {
			Static268.anInt5178 = Static79.anInt1797;
			Static309.anInt6012 = 2;
			Static73.anInt1629 = 0;
			Static165.anInt3275 = Static278.anInt5313;
			Static110.aClass4_Sub10_Sub1_1.method4687(159);
			Static110.aClass4_Sub10_Sub1_1.method4673(local15 + Static220.anInt3983);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4673((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static60.method1004(local19, local32, local15);
		}
		if (local28 == 39) {
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static268.anInt5178 = Static79.anInt1797;
				Static165.anInt3275 = Static278.anInt5313;
				Static73.anInt1629 = 0;
				Static309.anInt6012 = 2;
				Static110.aClass4_Sub10_Sub1_1.method4687(245);
				Static110.aClass4_Sub10_Sub1_1.method4668(local24);
				Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3324(), local15);
			}
		}
		if (local28 == 15) {
			Static110.aClass4_Sub10_Sub1_1.method4687(58);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			Static110.aClass4_Sub10_Sub1_1.method4621(local19);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static22.anInt314);
			Static110.aClass4_Sub10_Sub1_1.method4668(local15);
			Static110.aClass4_Sub10_Sub1_1.method4651(Static15.anInt243);
			Static110.aClass4_Sub10_Sub1_1.method4621(Static223.anInt4303);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 57) {
			local1434 = Static114.method1814(local19);
			@Pc(1662) boolean local1662 = true;
			if (local1434.anInt5908 > 0) {
				local1662 = Static291.method4439(local1434);
			}
			if (local1662) {
				Static110.aClass4_Sub10_Sub1_1.method4687(158);
				Static110.aClass4_Sub10_Sub1_1.method4654(local19);
			}
		}
		if (local28 == 30) {
			Static110.aClass4_Sub10_Sub1_1.method4687(81);
			Static110.aClass4_Sub10_Sub1_1.method4650(local15);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static110.aClass4_Sub10_Sub1_1.method4661(local19);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 14) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static309.anInt6012 = 2;
				Static165.anInt3275 = Static278.anInt5313;
				Static73.anInt1629 = 0;
				Static268.anInt5178 = Static79.anInt1797;
				Static110.aClass4_Sub10_Sub1_1.method4687(77);
				Static110.aClass4_Sub10_Sub1_1.method4650(local24);
				Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 26) {
			if (local24 == 0) {
				Static197.method3199(Static281.anInt5335, local15, local19);
			} else if (local24 == 1) {
				if (Static133.anInt2576 > 0 && Static54.aBooleanArray4[82] && Static54.aBooleanArray4[81]) {
					Static167.method2958(local15 + Static220.anInt3983, local19 + Static295.anInt5480, Static281.anInt5335);
				} else {
					Static304.method4698(local15, 1, local19);
					Static110.aClass4_Sub10_Sub1_1.method4618(Static83.anInt1941);
					Static110.aClass4_Sub10_Sub1_1.method4618(Static304.anInt5802);
					Static110.aClass4_Sub10_Sub1_1.method4668((int) Static202.aFloat97);
					Static110.aClass4_Sub10_Sub1_1.method4618(57);
					Static110.aClass4_Sub10_Sub1_1.method4618(Static269.anInt3585);
					Static110.aClass4_Sub10_Sub1_1.method4618(Static250.anInt4762);
					Static110.aClass4_Sub10_Sub1_1.method4618(89);
					Static110.aClass4_Sub10_Sub1_1.method4668(Static154.aClass53_Sub1_Sub1_2.anInt3974);
					Static110.aClass4_Sub10_Sub1_1.method4668(Static154.aClass53_Sub1_Sub1_2.anInt4002);
					Static110.aClass4_Sub10_Sub1_1.method4618(Static50.anInt946);
					Static110.aClass4_Sub10_Sub1_1.method4618(63);
					Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
				}
			}
		}
		if (local28 == 9) {
			Static188.method4849();
			local1434 = Static114.method1814(local19);
			Static22.anInt314 = local15;
			Static69.anInt1334 = 1;
			Static223.anInt4303 = local19;
			Static15.anInt243 = local24;
			Static205.method3283(local1434);
			Static313.aString372 = "<col=ff9040>" + Static287.method4398(local24).aString315 + "<col=ffffff>";
			if (Static313.aString372 == null) {
				Static313.aString372 = "null";
			}
			return;
		}
		if (local28 == 1012 || local28 == 1002 || local28 == 1008 || local28 == 1003 || local28 == 1011) {
			Static61.method1007(local24, local28, local15);
		}
		if (local28 == 48) {
			Static268.anInt5178 = Static79.anInt1797;
			Static309.anInt6012 = 2;
			Static73.anInt1629 = 0;
			Static165.anInt3275 = Static278.anInt5313;
			Static110.aClass4_Sub10_Sub1_1.method4687(28);
			Static110.aClass4_Sub10_Sub1_1.method4673(local19 + Static295.anInt5480);
			Static110.aClass4_Sub10_Sub1_1.method4654(Static21.anInt1053);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static71.anInt1367);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			Static110.aClass4_Sub10_Sub1_1.method4650(local15 + Static220.anInt3983);
			Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 5) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static309.anInt6012 = 2;
				Static268.anInt5178 = Static79.anInt1797;
				Static165.anInt3275 = Static278.anInt5313;
				Static73.anInt1629 = 0;
				Static110.aClass4_Sub10_Sub1_1.method4687(224);
				Static110.aClass4_Sub10_Sub1_1.method4651(local24);
				Static110.aClass4_Sub10_Sub1_1.method4668(Static71.anInt1367);
				Static110.aClass4_Sub10_Sub1_1.method4661(Static21.anInt1053);
				Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 37) {
			Static73.anInt1629 = 0;
			Static309.anInt6012 = 2;
			Static165.anInt3275 = Static278.anInt5313;
			Static268.anInt5178 = Static79.anInt1797;
			Static110.aClass4_Sub10_Sub1_1.method4687(48);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static220.anInt3983 + local15);
			Static110.aClass4_Sub10_Sub1_1.method4651((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static295.anInt5480 + local19);
			Static60.method1004(local19, local32, local15);
		}
		if (local28 == 34) {
			local1434 = Static152.method2432(local19, local15);
			if (local1434 != null) {
				Static188.method4849();
				@Pc(2195) Class4_Sub21 local2195 = Static41.method687(local1434);
				Static140.method2082(local2195.method3286(), local2195.anInt3939, local1434.anInt5894, local15, local1434.anInt5934, local19);
				Static69.anInt1334 = 0;
				Static155.aString140 = Static51.method780(local1434);
				if (Static155.aString140 == null) {
					Static155.aString140 = "Null";
				}
				if (local1434.aBoolean417) {
					Static69.aString81 = local1434.aString359 + "<col=ffffff>";
				} else {
					Static69.aString81 = "<col=00ff00>" + local1434.aString360 + "<col=ffffff>";
				}
			}
			return;
		}
		if (local28 == 49) {
			Static110.aClass4_Sub10_Sub1_1.method4687(145);
			Static110.aClass4_Sub10_Sub1_1.method4651(local15);
			Static110.aClass4_Sub10_Sub1_1.method4621(local19);
			Static110.aClass4_Sub10_Sub1_1.method4651(local24);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 58) {
			Static110.aClass4_Sub10_Sub1_1.method4687(214);
			Static110.aClass4_Sub10_Sub1_1.method4673(local15);
			Static110.aClass4_Sub10_Sub1_1.method4651(local24);
			Static110.aClass4_Sub10_Sub1_1.method4654(local19);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 8) {
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				Static268.anInt5178 = Static79.anInt1797;
				Static309.anInt6012 = 2;
				Static73.anInt1629 = 0;
				Static165.anInt3275 = Static278.anInt5313;
				Static110.aClass4_Sub10_Sub1_1.method4687(12);
				Static110.aClass4_Sub10_Sub1_1.method4650(local24);
				Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local146.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local146.method3324(), local15);
			}
		}
		if (local28 == 35) {
			Static110.aClass4_Sub10_Sub1_1.method4687(103);
			Static110.aClass4_Sub10_Sub1_1.method4628(local19);
			Static110.aClass4_Sub10_Sub1_1.method4650(local15);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 43) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static165.anInt3275 = Static278.anInt5313;
				Static268.anInt5178 = Static79.anInt1797;
				Static73.anInt1629 = 0;
				Static309.anInt6012 = 2;
				Static110.aClass4_Sub10_Sub1_1.method4687(212);
				Static110.aClass4_Sub10_Sub1_1.method4651(local24);
				Static110.aClass4_Sub10_Sub1_1.method4648(Static54.aBooleanArray4[82] ? 1 : 0);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 16) {
			Static165.anInt3275 = Static278.anInt5313;
			Static309.anInt6012 = 2;
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static110.aClass4_Sub10_Sub1_1.method4687(116);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static22.anInt314);
			Static110.aClass4_Sub10_Sub1_1.method4673(local15 + Static220.anInt3983);
			Static110.aClass4_Sub10_Sub1_1.method4673((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static110.aClass4_Sub10_Sub1_1.method4661(Static223.anInt4303);
			Static110.aClass4_Sub10_Sub1_1.method4615(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static15.anInt243);
			Static60.method1004(local19, local32, local15);
		}
		if (local28 == 44) {
			Static165.anInt3275 = Static278.anInt5313;
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static309.anInt6012 = 2;
			Static110.aClass4_Sub10_Sub1_1.method4687(3);
			Static110.aClass4_Sub10_Sub1_1.method4615(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4650(local24);
			Static110.aClass4_Sub10_Sub1_1.method4651(local15 + Static220.anInt3983);
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 23 || local28 == 1009) {
			Static309.method4789(local19, local15, local24, Static249.aStringArray27[arg0]);
		}
		if (local28 == 1010) {
			Static73.anInt1629 = 0;
			Static309.anInt6012 = 2;
			Static165.anInt3275 = Static278.anInt5313;
			Static268.anInt5178 = Static79.anInt1797;
			local146 = Static110.aClass53_Sub1_Sub2Array1[local24];
			if (local146 != null) {
				@Pc(2665) Class171 local2665 = local146.aClass171_1;
				if (local2665.anIntArray590 != null) {
					local2665 = local2665.method4302();
				}
				if (local2665 != null) {
					Static110.aClass4_Sub10_Sub1_1.method4687(65);
					Static110.aClass4_Sub10_Sub1_1.method4650(local2665.anInt5256);
				}
			}
		}
		if (local28 == 7) {
			Static138.method2064();
		}
		if (local28 == 1005) {
			Static165.anInt3275 = Static278.anInt5313;
			Static309.anInt6012 = 2;
			Static268.anInt5178 = Static79.anInt1797;
			Static73.anInt1629 = 0;
			Static110.aClass4_Sub10_Sub1_1.method4687(60);
			Static110.aClass4_Sub10_Sub1_1.method4651(local19 + Static295.anInt5480);
			Static110.aClass4_Sub10_Sub1_1.method4650((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static220.anInt3983 + local15);
			Static60.method1004(local19, local32, local15);
		}
		if (local28 == 41) {
			Static309.anInt6012 = 2;
			Static73.anInt1629 = 0;
			Static268.anInt5178 = Static79.anInt1797;
			Static165.anInt3275 = Static278.anInt5313;
			Static110.aClass4_Sub10_Sub1_1.method4687(92);
			Static110.aClass4_Sub10_Sub1_1.method4623(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4650((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static110.aClass4_Sub10_Sub1_1.method4651(local15 + Static220.anInt3983);
			Static110.aClass4_Sub10_Sub1_1.method4651(local19 + Static295.anInt5480);
			Static60.method1004(local19, local32, local15);
		}
		if (local28 == 50) {
			Static110.aClass4_Sub10_Sub1_1.method4687(177);
			Static110.aClass4_Sub10_Sub1_1.method4628(local19);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			Static110.aClass4_Sub10_Sub1_1.method4661(Static21.anInt1053);
			Static110.aClass4_Sub10_Sub1_1.method4650(local15);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static71.anInt1367);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 20) {
			Static110.aClass4_Sub10_Sub1_1.method4687(124);
			Static110.aClass4_Sub10_Sub1_1.method4673(local15);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static110.aClass4_Sub10_Sub1_1.method4661(local19);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 2) {
			Static110.aClass4_Sub10_Sub1_1.method4687(205);
			Static110.aClass4_Sub10_Sub1_1.method4628(local19);
			Static110.aClass4_Sub10_Sub1_1.method4650(local15);
			Static110.aClass4_Sub10_Sub1_1.method4651(local24);
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 45) {
			Static309.anInt6012 = 2;
			Static268.anInt5178 = Static79.anInt1797;
			Static165.anInt3275 = Static278.anInt5313;
			Static73.anInt1629 = 0;
			Static110.aClass4_Sub10_Sub1_1.method4687(54);
			Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
			Static110.aClass4_Sub10_Sub1_1.method4650(Static295.anInt5480 + local19);
			Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			Static110.aClass4_Sub10_Sub1_1.method4668(local15 + Static220.anInt3983);
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (local28 == 22) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static165.anInt3275 = Static278.anInt5313;
				Static309.anInt6012 = 2;
				Static268.anInt5178 = Static79.anInt1797;
				Static73.anInt1629 = 0;
				Static110.aClass4_Sub10_Sub1_1.method4687(96);
				Static110.aClass4_Sub10_Sub1_1.method4648(Static54.aBooleanArray4[82] ? 1 : 0);
				Static110.aClass4_Sub10_Sub1_1.method4668(local24);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 60) {
			local46 = Static182.aClass53_Sub1_Sub1Array1[local24];
			if (local46 != null) {
				Static309.anInt6012 = 2;
				Static73.anInt1629 = 0;
				Static268.anInt5178 = Static79.anInt1797;
				Static165.anInt3275 = Static278.anInt5313;
				Static110.aClass4_Sub10_Sub1_1.method4687(223);
				Static110.aClass4_Sub10_Sub1_1.method4618(Static54.aBooleanArray4[82] ? 1 : 0);
				Static110.aClass4_Sub10_Sub1_1.method4673(local24);
				Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, local46.method3324(), local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, local46.method3324(), local15);
			}
		}
		if (local28 == 1001) {
			local1434 = Static114.method1814(local19);
			if (local1434 == null || local1434.anIntArray661[local15] < 100000) {
				Static110.aClass4_Sub10_Sub1_1.method4687(72);
				Static110.aClass4_Sub10_Sub1_1.method4668(local24);
			} else {
				Static186.method4394("", 0, local1434.anIntArray661[local15] + " x " + Static287.method4398(local24).aString315);
			}
			Static52.anInt2246 = 0;
			Static48.aClass189_3 = Static114.method1814(local19);
			Static201.anInt3884 = local15;
		}
		if (local28 == 18) {
			Static110.aClass4_Sub10_Sub1_1.method4687(158);
			Static110.aClass4_Sub10_Sub1_1.method4654(local19);
			local1434 = Static114.method1814(local19);
			if (local1434.anIntArrayArray50 != null && local1434.anIntArrayArray50[0][0] == 5) {
				local1452 = local1434.anIntArrayArray50[0][1];
				Static2.anIntArray2[local1452] = 1 - Static2.anIntArray2[local1452];
				Static221.method3571(local1452);
			}
		}
		if (local28 == 38) {
			Static73.anInt1629 = 0;
			Static309.anInt6012 = 2;
			Static165.anInt3275 = Static278.anInt5313;
			Static268.anInt5178 = Static79.anInt1797;
			Static110.aClass4_Sub10_Sub1_1.method4687(8);
			Static110.aClass4_Sub10_Sub1_1.method4673(local24);
			Static110.aClass4_Sub10_Sub1_1.method4668(local19 + Static295.anInt5480);
			Static110.aClass4_Sub10_Sub1_1.method4668(Static220.anInt3983 + local15);
			Static110.aClass4_Sub10_Sub1_1.method4648(Static54.aBooleanArray4[82] ? 1 : 0);
			Static78.method1337(Static154.aClass53_Sub1_Sub1_2.anIntArray422[0], 0, 0, 0, local19, Static154.aClass53_Sub1_Sub1_2.anIntArray426[0], 0, 0, local15);
		}
		if (Static69.anInt1334 != 0) {
			Static69.anInt1334 = 0;
			Static205.method3283(Static114.method1814(Static223.anInt4303));
		}
		if (Static135.aBoolean177) {
			Static188.method4849();
		}
		if (Static48.aClass189_3 != null && Static52.anInt2246 == 0) {
			Static205.method3283(Static48.aClass189_3);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V")
	public static void method665(@OriginalArg(1) boolean arg0) {
		Static98.aBoolean144 = arg0;
		Static239.aBoolean314 = !Static29.method456();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method667(@OriginalArg(0) Class58 arg0) {
		Static52.aClass4_Sub3_Sub14Array10 = Static200.method3238(arg0, Static99.anInt2120);
		Static63.aClass4_Sub3_Sub14Array7 = Static200.method3238(arg0, Static227.anInt4364);
		Static89.aClass4_Sub3_Sub14Array8 = Static200.method3238(arg0, Static221.anInt4282);
		Static10.aClass4_Sub3_Sub14Array1 = Static200.method3238(arg0, Static85.anInt1975);
		Static241.aClass4_Sub3_Sub14Array11 = Static200.method3238(arg0, Static214.anInt4207);
		Static40.aClass4_Sub3_Sub14Array3 = Static200.method3238(arg0, Static281.anInt5333);
		Static11.aClass4_Sub3_Sub14Array2 = Static273.method1548(Static275.anInt5231, arg0);
		Static251.aClass4_Sub3_Sub14Array12 = Static273.method1548(Static245.anInt3786, arg0);
		Static56.aClass4_Sub3_Sub14Array6 = Static273.method1548(Static113.anInt2296, arg0);
		Static182.aClass56Array5 = Static30.method495(arg0, Static212.anInt4163);
		Static125.aClass56Array3 = Static30.method495(arg0, Static124.anInt2449);
		Static32.aClass4_Sub3_Sub5_1.method2274(Static125.aClass56Array3, null);
		Static197.aClass4_Sub3_Sub5_2.method2274(Static125.aClass56Array3, null);
		Static211.aClass4_Sub3_Sub5_3.method2274(Static125.aClass56Array3, null);
		if (Static94.aBoolean138) {
			Static74.aClass56_Sub1Array2 = Static86.method1523(arg0, Static73.anInt1632);
			for (@Pc(94) int local94 = 0; local94 < Static74.aClass56_Sub1Array2.length; local94++) {
				Static74.aClass56_Sub1Array2[local94].method1320();
			}
		}
		@Pc(115) Class4_Sub3_Sub14_Sub1 local115 = Static164.method2667(arg0, Static9.anInt130, 0);
		local115.method2177();
		if (Static94.aBoolean138) {
			Static254.aClass4_Sub3_Sub14_6 = new Class4_Sub3_Sub14_Sub2(local115);
		} else {
			Static254.aClass4_Sub3_Sub14_6 = local115;
		}
		@Pc(134) Class4_Sub3_Sub14_Sub1[] local134 = Static175.method2742(Static228.anInt4372, arg0);
		@Pc(136) int local136;
		for (local136 = 0; local136 < local134.length; local136++) {
			local134[local136].method2177();
		}
		if (Static94.aBoolean138) {
			Static52.aClass4_Sub3_Sub14Array9 = new Class4_Sub3_Sub14[local134.length];
			for (local136 = 0; local136 < local134.length; local136++) {
				Static52.aClass4_Sub3_Sub14Array9[local136] = new Class4_Sub3_Sub14_Sub2(local134[local136]);
			}
		} else {
			Static52.aClass4_Sub3_Sub14Array9 = local134;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public static void method676(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub3_Sub9 local10 = Static43.method2329(9, arg0);
		local10.method1519();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IZ)V")
	public static void method680(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub3_Sub9 local13 = Static43.method2329(5, arg0);
		local13.method1519();
	}
}
