import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
	public static int anInt2137;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "Lclient!pe;")
	public static Class13 aClass13_14;

	@OriginalMember(owner = "client!hf", name = "z", descriptor = "[S")
	public static short[] aShortArray42;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_517 = Static158.method3034("Wed");

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_521 = Static158.method3034("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!ob;")
	public static Class60 aClass60_518 = aClass60_521;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "J")
	public static volatile long aLong71 = 0L;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_22 = new Class89(260);

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_523 = Static158.method3034("Sun");

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_520 = Static158.method3034("Mon");

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_522 = Static158.method3034("Tue");

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_519 = Static158.method3034("Thu");

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_525 = Static158.method3034("Fri");

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_524 = Static158.method3034("Sat");

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array13 = new Class60[] { aClass60_523, aClass60_520, aClass60_522, aClass60_517, aClass60_519, aClass60_525, aClass60_524 };

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_531 = Static158.method3034("Please wait)3)3)3");

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "Lclient!ob;")
	public static Class60 aClass60_526 = aClass60_531;

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_527 = Static158.method3034("Select a world");

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "Lclient!ob;")
	public static Class60 aClass60_528 = aClass60_527;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "[[[Lclient!pi;")
	public static final Class67[][][] aClass67ArrayArrayArray1 = new Class67[4][104][104];

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_530 = Static158.method3034("Started 3d library");

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "Lclient!ob;")
	public static Class60 aClass60_529 = aClass60_530;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
	public static boolean method1638(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIILclient!aa;JZ)V")
	public static void method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class52 local6 = new Class52();
		local6.aClass2_Sub1_Sub1_7 = arg4;
		local6.anInt3136 = arg1 * 128 + 64;
		local6.anInt3135 = arg2 * 128 + 64;
		local6.anInt3138 = arg3;
		local6.aLong105 = arg5;
		if (Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub17(arg0, arg1, arg2);
		}
		Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local6;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public static void method1640(@OriginalArg(0) int arg0) {
		if (Static62.method1443(arg0)) {
			Static104.method2367(Static197.aClass72ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)V")
	public static void method1641(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static6.anIntArray27[arg0];
		@Pc(14) int local14 = Static120.anIntArray375[arg0];
		@Pc(26) int local26 = (int) Static144.aLongArray7[arg0];
		@Pc(30) long local30 = Static144.aLongArray7[arg0];
		@Pc(34) int local34 = Static140.aShortArray53[arg0];
		if (local34 >= 2000) {
			local34 -= 2000;
		}
		if (local34 == 10) {
			Static7.aClass2_Sub3_Sub1_43.method244(61);
			Static7.aClass2_Sub3_Sub1_43.method202(local14);
			Static7.aClass2_Sub3_Sub1_43.method199(local26);
			Static7.aClass2_Sub3_Sub1_43.method199(local10);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 8) {
			Static7.aClass2_Sub3_Sub1_43.method244(210);
			Static7.aClass2_Sub3_Sub1_43.method199(local10);
			Static7.aClass2_Sub3_Sub1_43.method236(local26);
			Static7.aClass2_Sub3_Sub1_43.method191(local14);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		@Pc(109) Class2_Sub1_Sub1_Sub3_Sub1 local109;
		if (local34 == 6) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static89.anInt2602 = Static74.anInt2294;
				Static7.anInt4637 = Static174.anInt4254;
				Static10.anInt346 = 0;
				Static84.anInt2513 = 2;
				Static7.aClass2_Sub3_Sub1_43.method244(35);
				Static7.aClass2_Sub3_Sub1_43.method231(local26);
			}
		}
		if (local34 == 46) {
			Static111.method2464(local10, local30, local14);
			Static7.aClass2_Sub3_Sub1_43.method244(69);
			Static7.aClass2_Sub3_Sub1_43.method231(Static76.anInt2317 + local14);
			Static7.aClass2_Sub3_Sub1_43.method236(Static76.anInt2319 + local10);
			Static7.aClass2_Sub3_Sub1_43.method221((int) (local30 >>> 32) & Integer.MAX_VALUE);
		}
		@Pc(202) Class2_Sub1_Sub1_Sub3_Sub2 local202;
		if (local34 == 11) {
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				Static145.method2926(2, 1, local202.anIntArray369[0], local202.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static89.anInt2602 = Static74.anInt2294;
				Static10.anInt346 = 0;
				Static7.anInt4637 = Static174.anInt4254;
				Static84.anInt2513 = 2;
				Static7.aClass2_Sub3_Sub1_43.method244(65);
				Static7.aClass2_Sub3_Sub1_43.method199(local26);
			}
		}
		if (local34 == 42) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static84.anInt2513 = 2;
				Static10.anInt346 = 0;
				Static7.anInt4637 = Static174.anInt4254;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.aClass2_Sub3_Sub1_43.method244(157);
				Static7.aClass2_Sub3_Sub1_43.method213(Static141.anInt3690);
				Static7.aClass2_Sub3_Sub1_43.method236(Static115.anInt3208);
				Static7.aClass2_Sub3_Sub1_43.method236(local26);
			}
		}
		if (local34 == 30) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static10.anInt346 = 0;
				Static84.anInt2513 = 2;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.anInt4637 = Static174.anInt4254;
				Static7.aClass2_Sub3_Sub1_43.method244(247);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
			}
		}
		@Pc(387) Class72 local387;
		if (local34 == 3) {
			Static36.method830();
			local387 = Static173.method3201(local14);
			Static6.anInt275 = local10;
			Static119.anInt3314 = local26;
			Static16.anInt517 = local14;
			Static29.anInt889 = 1;
			Static39.method900(local387);
			Static162.aClass60_1102 = Static193.method3536(new Class60[] { Static103.aClass60_840, Static88.method2046(local26).aClass60_363, Static54.aClass60_396 });
			if (Static162.aClass60_1102 == null) {
				Static162.aClass60_1102 = Static197.aClass60_1333;
			}
			return;
		}
		if (local34 == 23) {
			Static111.method2464(local10, local30, local14);
			Static7.aClass2_Sub3_Sub1_43.method244(233);
			Static7.aClass2_Sub3_Sub1_43.method236(local10 + Static76.anInt2319);
			Static7.aClass2_Sub3_Sub1_43.method199((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static7.aClass2_Sub3_Sub1_43.method199(Static76.anInt2317 + local14);
		}
		if (local34 == 31) {
			Static7.aClass2_Sub3_Sub1_43.method244(47);
			Static7.aClass2_Sub3_Sub1_43.method236(local26);
			Static7.aClass2_Sub3_Sub1_43.method213(local14);
			Static7.aClass2_Sub3_Sub1_43.method199(local10);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 1004) {
			Static84.anInt2513 = 2;
			Static89.anInt2602 = Static74.anInt2294;
			Static10.anInt346 = 0;
			Static7.anInt4637 = Static174.anInt4254;
			Static7.aClass2_Sub3_Sub1_43.method244(191);
			Static7.aClass2_Sub3_Sub1_43.method221(local26);
		}
		if (local34 == 14) {
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				Static145.method2926(2, 1, local202.anIntArray369[0], local202.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static7.anInt4637 = Static174.anInt4254;
				Static10.anInt346 = 0;
				Static84.anInt2513 = 2;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.aClass2_Sub3_Sub1_43.method244(245);
				Static7.aClass2_Sub3_Sub1_43.method199(Static6.anInt275);
				Static7.aClass2_Sub3_Sub1_43.method199(local26);
				Static7.aClass2_Sub3_Sub1_43.method231(Static119.anInt3314);
				Static7.aClass2_Sub3_Sub1_43.method213(Static16.anInt517);
			}
		}
		if (local34 == 7) {
			Static7.aClass2_Sub3_Sub1_43.method244(118);
			Static7.aClass2_Sub3_Sub1_43.method191(local14);
			Static7.aClass2_Sub3_Sub1_43.method236(local26);
			Static7.aClass2_Sub3_Sub1_43.method199(local10);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 1001) {
			local387 = Static173.method3201(local14);
			if (local387 == null || local387.anIntArray430[local10] < 100000) {
				Static7.aClass2_Sub3_Sub1_43.method244(59);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
			} else {
				Static118.method2563(0, Static101.aClass60_807, Static193.method3536(new Class60[] { Static72.method1661(local387.anIntArray430[local10]), Static89.aClass60_710, Static88.method2046(local26).aClass60_363 }));
			}
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 24) {
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				Static145.method2926(2, 1, local202.anIntArray369[0], local202.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static10.anInt346 = 0;
				Static84.anInt2513 = 2;
				Static7.anInt4637 = Static174.anInt4254;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.aClass2_Sub3_Sub1_43.method244(49);
				Static7.aClass2_Sub3_Sub1_43.method231(local26);
			}
		}
		if (local34 == 1002) {
			Static10.anInt346 = 0;
			Static7.anInt4637 = Static174.anInt4254;
			Static89.anInt2602 = Static74.anInt2294;
			Static84.anInt2513 = 2;
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				@Pc(776) Class2_Sub1_Sub2 local776 = local202.aClass2_Sub1_Sub2_1;
				if (local776.anIntArray32 != null) {
					local776 = local776.method273();
				}
				if (local776 != null) {
					Static7.aClass2_Sub3_Sub1_43.method244(22);
					Static7.aClass2_Sub3_Sub1_43.method236(local776.anInt322);
				}
			}
		}
		if (local34 == 5 && Static111.method2464(local10, local30, local14)) {
			Static7.aClass2_Sub3_Sub1_43.method244(239);
			Static7.aClass2_Sub3_Sub1_43.method199((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static7.aClass2_Sub3_Sub1_43.method221(local14 + Static76.anInt2317);
			Static7.aClass2_Sub3_Sub1_43.method236(Static76.anInt2319 + local10);
			Static7.aClass2_Sub3_Sub1_43.method197(Static141.anInt3690);
			Static7.aClass2_Sub3_Sub1_43.method221(Static115.anInt3208);
		}
		if (local34 == 4) {
			Static7.aClass2_Sub3_Sub1_43.method244(106);
			Static7.aClass2_Sub3_Sub1_43.method231(local10);
			Static7.aClass2_Sub3_Sub1_43.method199(local26);
			Static7.aClass2_Sub3_Sub1_43.method197(local14);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 51) {
			Static111.method2464(local10, local30, local14);
			Static7.aClass2_Sub3_Sub1_43.method244(87);
			Static7.aClass2_Sub3_Sub1_43.method236(local10 + Static76.anInt2319);
			Static7.aClass2_Sub3_Sub1_43.method221(Integer.MAX_VALUE & (int) (local30 >>> 32));
			Static7.aClass2_Sub3_Sub1_43.method199(Static76.anInt2317 + local14);
		}
		if (local34 == 15 || local34 == 1003) {
			Static157.method3023(local10, local14, local26, Static196.aClass60Array26[arg0]);
		}
		if (local34 == 37) {
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				Static145.method2926(2, 1, local202.anIntArray369[0], local202.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static7.anInt4637 = Static174.anInt4254;
				Static89.anInt2602 = Static74.anInt2294;
				Static10.anInt346 = 0;
				Static84.anInt2513 = 2;
				Static7.aClass2_Sub3_Sub1_43.method244(171);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
			}
		}
		@Pc(1036) boolean local1036;
		if (local34 == 48) {
			local1036 = Static145.method2926(2, 0, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
			if (!local1036) {
				Static145.method2926(2, 1, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
			}
			Static7.anInt4637 = Static174.anInt4254;
			Static10.anInt346 = 0;
			Static84.anInt2513 = 2;
			Static89.anInt2602 = Static74.anInt2294;
			Static7.aClass2_Sub3_Sub1_43.method244(7);
			Static7.aClass2_Sub3_Sub1_43.method231(Static76.anInt2317 + local14);
			Static7.aClass2_Sub3_Sub1_43.method236(local26);
			Static7.aClass2_Sub3_Sub1_43.method231(local10 + Static76.anInt2319);
		}
		if (local34 == 28) {
			Static7.aClass2_Sub3_Sub1_43.method244(139);
			Static7.aClass2_Sub3_Sub1_43.method213(local14);
			Static7.aClass2_Sub3_Sub1_43.method231(local10);
			Static7.aClass2_Sub3_Sub1_43.method231(local26);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 36) {
			local387 = Static181.method3381(local10, local14);
			if (local387 != null) {
				Static36.method830();
				Static6.method250(local14, Static53.method1255(Static26.method637(local387)), local10);
				Static29.anInt889 = 0;
				Static4.aClass60_35 = Static42.method918(local387);
				if (Static4.aClass60_35 == null) {
					Static4.aClass60_35 = Static148.aClass60_1043;
				}
				if (!local387.aBoolean151) {
					Static167.aClass60_1132 = Static193.method3536(new Class60[] { Static176.aClass60_1184, local387.aClass60_1058, Static54.aClass60_396 });
					return;
				}
				Static167.aClass60_1132 = Static193.method3536(new Class60[] { local387.aClass60_1059, Static54.aClass60_396 });
			}
			return;
		}
		if (local34 == 58) {
			Static7.aClass2_Sub3_Sub1_43.method244(199);
			Static7.aClass2_Sub3_Sub1_43.method231(local10);
			Static7.aClass2_Sub3_Sub1_43.method213(local14);
			Static7.aClass2_Sub3_Sub1_43.method236(local26);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 43) {
			Static179.method3355(Static62.anInt1923, local10, local14);
		}
		@Pc(1274) int local1274;
		if (local34 == 25) {
			Static7.aClass2_Sub3_Sub1_43.method244(218);
			Static7.aClass2_Sub3_Sub1_43.method197(local14);
			local387 = Static173.method3201(local14);
			if (local387.anIntArrayArray25 != null && local387.anIntArrayArray25[0][0] == 5) {
				local1274 = local387.anIntArrayArray25[0][1];
				if (Static163.anIntArray447[local1274] != local387.anIntArray437[0]) {
					Static163.anIntArray447[local1274] = local387.anIntArray437[0];
					Static65.method1489(local1274);
				}
			}
		}
		if (local34 == 38) {
			local1036 = Static145.method2926(2, 0, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
			if (!local1036) {
				Static145.method2926(2, 1, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
			}
			Static7.anInt4637 = Static174.anInt4254;
			Static84.anInt2513 = 2;
			Static89.anInt2602 = Static74.anInt2294;
			Static10.anInt346 = 0;
			Static7.aClass2_Sub3_Sub1_43.method244(8);
			Static7.aClass2_Sub3_Sub1_43.method199(local26);
			Static7.aClass2_Sub3_Sub1_43.method236(Static76.anInt2319 + local10);
			Static7.aClass2_Sub3_Sub1_43.method231(Static6.anInt275);
			Static7.aClass2_Sub3_Sub1_43.method191(Static16.anInt517);
			Static7.aClass2_Sub3_Sub1_43.method236(Static119.anInt3314);
			Static7.aClass2_Sub3_Sub1_43.method231(local14 + Static76.anInt2317);
		}
		if (local34 == 22) {
			Static7.aClass2_Sub3_Sub1_43.method244(234);
			Static7.aClass2_Sub3_Sub1_43.method191(Static141.anInt3690);
			Static7.aClass2_Sub3_Sub1_43.method213(local14);
			Static7.aClass2_Sub3_Sub1_43.method236(Static115.anInt3208);
			Static7.aClass2_Sub3_Sub1_43.method199(local10);
		}
		if (local34 == 21) {
			Static7.aClass2_Sub3_Sub1_43.method244(56);
			Static7.aClass2_Sub3_Sub1_43.method213(local14);
			Static7.aClass2_Sub3_Sub1_43.method199(Static6.anInt275);
			Static7.aClass2_Sub3_Sub1_43.method221(Static119.anInt3314);
			Static7.aClass2_Sub3_Sub1_43.method202(Static16.anInt517);
			Static7.aClass2_Sub3_Sub1_43.method231(local26);
			Static7.aClass2_Sub3_Sub1_43.method221(local10);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 12) {
			Static171.method3181();
		}
		if (local34 == 49) {
			Static7.aClass2_Sub3_Sub1_43.method244(36);
			Static7.aClass2_Sub3_Sub1_43.method231(local10);
			Static7.aClass2_Sub3_Sub1_43.method202(local14);
			Static7.aClass2_Sub3_Sub1_43.method199(local26);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 1) {
			Static7.aClass2_Sub3_Sub1_43.method244(143);
			Static7.aClass2_Sub3_Sub1_43.method221(local10);
			Static7.aClass2_Sub3_Sub1_43.method202(local14);
			Static7.aClass2_Sub3_Sub1_43.method199(local26);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 18) {
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				Static145.method2926(2, 1, local202.anIntArray369[0], local202.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static89.anInt2602 = Static74.anInt2294;
				Static84.anInt2513 = 2;
				Static7.anInt4637 = Static174.anInt4254;
				Static10.anInt346 = 0;
				Static7.aClass2_Sub3_Sub1_43.method244(86);
				Static7.aClass2_Sub3_Sub1_43.method231(local26);
			}
		}
		if (local34 == 2) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static7.anInt4637 = Static174.anInt4254;
				Static89.anInt2602 = Static74.anInt2294;
				Static10.anInt346 = 0;
				Static84.anInt2513 = 2;
				Static7.aClass2_Sub3_Sub1_43.method244(32);
				Static7.aClass2_Sub3_Sub1_43.method231(local26);
			}
		}
		if (local34 == 39) {
			local387 = Static173.method3201(local14);
			@Pc(1667) boolean local1667 = true;
			if (local387.anInt3884 > 0) {
				local1667 = Static107.method2408(local387);
			}
			if (local1667) {
				Static7.aClass2_Sub3_Sub1_43.method244(218);
				Static7.aClass2_Sub3_Sub1_43.method197(local14);
			}
		}
		if (local34 == 57) {
			local1036 = Static145.method2926(2, 0, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
			if (!local1036) {
				Static145.method2926(2, 1, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
			}
			Static89.anInt2602 = Static74.anInt2294;
			Static10.anInt346 = 0;
			Static7.anInt4637 = Static174.anInt4254;
			Static84.anInt2513 = 2;
			Static7.aClass2_Sub3_Sub1_43.method244(216);
			Static7.aClass2_Sub3_Sub1_43.method236(local26);
			Static7.aClass2_Sub3_Sub1_43.method199(Static76.anInt2317 + local14);
			Static7.aClass2_Sub3_Sub1_43.method221(Static76.anInt2319 + local10);
		}
		if (local34 == 1005) {
			Static84.anInt2513 = 2;
			Static10.anInt346 = 0;
			Static89.anInt2602 = Static74.anInt2294;
			Static7.anInt4637 = Static174.anInt4254;
			Static7.aClass2_Sub3_Sub1_43.method244(59);
			Static7.aClass2_Sub3_Sub1_43.method221(local26);
		}
		if (local34 == 16) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static10.anInt346 = 0;
				Static89.anInt2602 = Static74.anInt2294;
				Static84.anInt2513 = 2;
				Static7.anInt4637 = Static174.anInt4254;
				Static7.aClass2_Sub3_Sub1_43.method244(232);
				Static7.aClass2_Sub3_Sub1_43.method236(local26);
			}
		}
		if (local34 == 47 && Static111.method2464(local10, local30, local14)) {
			Static7.aClass2_Sub3_Sub1_43.method244(148);
			Static7.aClass2_Sub3_Sub1_43.method221(local14 + Static76.anInt2317);
			Static7.aClass2_Sub3_Sub1_43.method199((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static7.aClass2_Sub3_Sub1_43.method231(Static76.anInt2319 + local10);
			Static7.aClass2_Sub3_Sub1_43.method231(Static6.anInt275);
			Static7.aClass2_Sub3_Sub1_43.method202(Static16.anInt517);
			Static7.aClass2_Sub3_Sub1_43.method231(Static119.anInt3314);
		}
		if (local34 == 45) {
			local1036 = Static145.method2926(2, 0, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
			if (!local1036) {
				Static145.method2926(2, 1, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
			}
			Static89.anInt2602 = Static74.anInt2294;
			Static10.anInt346 = 0;
			Static7.anInt4637 = Static174.anInt4254;
			Static84.anInt2513 = 2;
			Static7.aClass2_Sub3_Sub1_43.method244(211);
			Static7.aClass2_Sub3_Sub1_43.method199(local14 + Static76.anInt2317);
			Static7.aClass2_Sub3_Sub1_43.method221(local10 + Static76.anInt2319);
			Static7.aClass2_Sub3_Sub1_43.method221(local26);
		}
		if (local34 == 32) {
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				Static145.method2926(2, 1, local202.anIntArray369[0], local202.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static84.anInt2513 = 2;
				Static10.anInt346 = 0;
				Static7.anInt4637 = Static174.anInt4254;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.aClass2_Sub3_Sub1_43.method244(189);
				Static7.aClass2_Sub3_Sub1_43.method213(Static141.anInt3690);
				Static7.aClass2_Sub3_Sub1_43.method221(Static115.anInt3208);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
			}
		}
		if (local34 == 35 && Static164.aClass72_10 == null) {
			Static55.method1329(local10, local14);
			Static164.aClass72_10 = Static181.method3381(local10, local14);
			Static39.method900(Static164.aClass72_10);
		}
		if (local34 == 40) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static89.anInt2602 = Static74.anInt2294;
				Static10.anInt346 = 0;
				Static7.anInt4637 = Static174.anInt4254;
				Static84.anInt2513 = 2;
				Static7.aClass2_Sub3_Sub1_43.method244(90);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
			}
		}
		if (local34 == 17) {
			Static111.method2464(local10, local30, local14);
			Static7.aClass2_Sub3_Sub1_43.method244(217);
			Static7.aClass2_Sub3_Sub1_43.method199((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static7.aClass2_Sub3_Sub1_43.method221(local14 + Static76.anInt2317);
			Static7.aClass2_Sub3_Sub1_43.method199(Static76.anInt2319 + local10);
		}
		if (local34 == 41) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static7.anInt4637 = Static174.anInt4254;
				Static84.anInt2513 = 2;
				Static10.anInt346 = 0;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.aClass2_Sub3_Sub1_43.method244(229);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
				Static7.aClass2_Sub3_Sub1_43.method199(Static119.anInt3314);
				Static7.aClass2_Sub3_Sub1_43.method213(Static16.anInt517);
				Static7.aClass2_Sub3_Sub1_43.method236(Static6.anInt275);
			}
		}
		if (local34 == 20) {
			Static7.aClass2_Sub3_Sub1_43.method244(98);
			Static7.aClass2_Sub3_Sub1_43.method191(local14);
			Static7.aClass2_Sub3_Sub1_43.method231(local10);
			Static7.aClass2_Sub3_Sub1_43.method202(Static141.anInt3690);
			Static7.aClass2_Sub3_Sub1_43.method221(Static115.anInt3208);
			Static7.aClass2_Sub3_Sub1_43.method231(local26);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 1007) {
			Static111.method2464(local10, local30, local14);
			Static7.aClass2_Sub3_Sub1_43.method244(119);
			Static7.aClass2_Sub3_Sub1_43.method199(local10 + Static76.anInt2319);
			Static7.aClass2_Sub3_Sub1_43.method221((int) (local30 >>> 32) & Integer.MAX_VALUE);
			Static7.aClass2_Sub3_Sub1_43.method236(local14 + Static76.anInt2317);
		}
		if (local34 == 29) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static89.anInt2602 = Static74.anInt2294;
				Static84.anInt2513 = 2;
				Static7.anInt4637 = Static174.anInt4254;
				Static10.anInt346 = 0;
				Static7.aClass2_Sub3_Sub1_43.method244(78);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
			}
		}
		if (local34 == 50) {
			Static7.aClass2_Sub3_Sub1_43.method244(218);
			Static7.aClass2_Sub3_Sub1_43.method197(local14);
			local387 = Static173.method3201(local14);
			if (local387.anIntArrayArray25 != null && local387.anIntArrayArray25[0][0] == 5) {
				local1274 = local387.anIntArrayArray25[0][1];
				Static163.anIntArray447[local1274] = 1 - Static163.anIntArray447[local1274];
				Static65.method1489(local1274);
			}
		}
		if (local34 == 26) {
			local1036 = Static145.method2926(2, 0, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
			if (!local1036) {
				Static145.method2926(2, 1, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
			}
			Static10.anInt346 = 0;
			Static7.anInt4637 = Static174.anInt4254;
			Static84.anInt2513 = 2;
			Static89.anInt2602 = Static74.anInt2294;
			Static7.aClass2_Sub3_Sub1_43.method244(42);
			Static7.aClass2_Sub3_Sub1_43.method197(Static141.anInt3690);
			Static7.aClass2_Sub3_Sub1_43.method221(local10 + Static76.anInt2319);
			Static7.aClass2_Sub3_Sub1_43.method231(local14 + Static76.anInt2317);
			Static7.aClass2_Sub3_Sub1_43.method199(Static115.anInt3208);
			Static7.aClass2_Sub3_Sub1_43.method221(local26);
		}
		if (local34 == 44) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static10.anInt346 = 0;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.anInt4637 = Static174.anInt4254;
				Static84.anInt2513 = 2;
				Static7.aClass2_Sub3_Sub1_43.method244(200);
				Static7.aClass2_Sub3_Sub1_43.method221(local26);
			}
		}
		if (local34 == 34) {
			local1036 = Static145.method2926(2, 0, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
			if (!local1036) {
				Static145.method2926(2, 1, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
			}
			Static89.anInt2602 = Static74.anInt2294;
			Static10.anInt346 = 0;
			Static84.anInt2513 = 2;
			Static7.anInt4637 = Static174.anInt4254;
			Static7.aClass2_Sub3_Sub1_43.method244(224);
			Static7.aClass2_Sub3_Sub1_43.method221(local26);
			Static7.aClass2_Sub3_Sub1_43.method231(local14 + Static76.anInt2317);
			Static7.aClass2_Sub3_Sub1_43.method231(local10 + Static76.anInt2319);
		}
		if (local34 == 9) {
			local202 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local26];
			if (local202 != null) {
				Static145.method2926(2, 1, local202.anIntArray369[0], local202.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static84.anInt2513 = 2;
				Static89.anInt2602 = Static74.anInt2294;
				Static7.anInt4637 = Static174.anInt4254;
				Static10.anInt346 = 0;
				Static7.aClass2_Sub3_Sub1_43.method244(188);
				Static7.aClass2_Sub3_Sub1_43.method236(local26);
			}
		}
		if (local34 == 19) {
			local109 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local26];
			if (local109 != null) {
				Static145.method2926(2, 1, local109.anIntArray369[0], local109.anIntArray371[0], false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
				Static84.anInt2513 = 2;
				Static7.anInt4637 = Static174.anInt4254;
				Static89.anInt2602 = Static74.anInt2294;
				Static10.anInt346 = 0;
				Static7.aClass2_Sub3_Sub1_43.method244(37);
				Static7.aClass2_Sub3_Sub1_43.method231(local26);
			}
		}
		if (local34 == 33) {
			Static7.aClass2_Sub3_Sub1_43.method244(174);
			Static7.aClass2_Sub3_Sub1_43.method213(local14);
			Static7.aClass2_Sub3_Sub1_43.method199(local26);
			Static7.aClass2_Sub3_Sub1_43.method231(local10);
			Static82.anInt2433 = 0;
			Static172.aClass72_12 = Static173.method3201(local14);
			Static17.anInt549 = local10;
		}
		if (local34 == 13) {
			local1036 = Static145.method2926(2, 0, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 0);
			if (!local1036) {
				Static145.method2926(2, 1, local10, local14, false, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], 0, 0, 0, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], 1);
			}
			Static7.anInt4637 = Static174.anInt4254;
			Static84.anInt2513 = 2;
			Static10.anInt346 = 0;
			Static89.anInt2602 = Static74.anInt2294;
			Static7.aClass2_Sub3_Sub1_43.method244(180);
			Static7.aClass2_Sub3_Sub1_43.method236(Static76.anInt2317 + local14);
			Static7.aClass2_Sub3_Sub1_43.method231(local26);
			Static7.aClass2_Sub3_Sub1_43.method221(Static76.anInt2319 + local10);
		}
		if (Static29.anInt889 != 0) {
			Static29.anInt889 = 0;
			Static39.method900(Static173.method3201(Static16.anInt517));
		}
		if (Static58.aBoolean74) {
			Static36.method830();
		}
		if (Static172.aClass72_12 != null && Static82.anInt2433 == 0) {
			Static39.method900(Static172.aClass72_12);
		}
	}
}
