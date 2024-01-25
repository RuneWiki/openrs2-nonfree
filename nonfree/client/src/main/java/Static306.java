import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!tl", name = "gb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tl", name = "db", descriptor = "[Lclient!jf;")
	public static final Class95[] aClass95Array1 = new Class95[6];

	@OriginalMember(owner = "client!tl", name = "eb", descriptor = "[J")
	public static final long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!tl", name = "ib", descriptor = "[S")
	public static short[] aShortArray86 = new short[256];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ae;IILclient!nc;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5409(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static50.aClass4_5 = arg0;
		Static46.anInt996 = arg1;
		Static293.aClass133_5 = arg3;
		Static299.aBoolean459 = Static50.aClass4_5.method4263() > 0;
		Static250.anInt4943 = arg4 >> 7;
		Static230.anInt4394 = arg6 >> 7;
		Static120.anInt2593 = arg4;
		Static79.anInt1748 = arg6;
		Static75.anInt1604 = arg5;
		Static30.anInt551 = Static250.anInt4943 - Static206.anInt4000;
		if (Static30.anInt551 < 0) {
			Static320.anInt6197 = -Static30.anInt551;
			Static30.anInt551 = 0;
		} else {
			Static320.anInt6197 = 0;
		}
		Static156.anInt3176 = Static230.anInt4394 - Static206.anInt4000;
		if (Static156.anInt3176 < 0) {
			Static25.anInt1347 = -Static156.anInt3176;
			Static156.anInt3176 = 0;
		} else {
			Static25.anInt1347 = 0;
		}
		Static282.anInt5713 = Static250.anInt4943 + Static206.anInt4000;
		if (Static282.anInt5713 > Static223.anInt4280) {
			Static282.anInt5713 = Static223.anInt4280;
		}
		Static301.anInt5009 = Static230.anInt4394 + Static206.anInt4000;
		if (Static301.anInt5009 > Static160.anInt3244) {
			Static301.anInt5009 = Static160.anInt3244;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static206.anInt4000 + Static206.anInt4000 + 2; local74++) {
			for (local77 = 0; local77 < Static206.anInt4000 + Static206.anInt4000 + 2; local77++) {
				local84 = Static250.anInt4943 + local74 - Static206.anInt4000;
				local90 = Static230.anInt4394 + local77 - Static206.anInt4000;
				if (local84 >= 0 && local90 >= 0 && local84 < Static223.anInt4280 && local90 < Static160.anInt3244) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static265.aClass73Array44[3].method4931(local84, local90) - 1000;
					@Pc(137) int local137 = Static313.aClass73Array39 == null ? Static265.aClass73Array44[0].method4931(local84, local90) + 128 : Static313.aClass73Array39[0].method4931(local84, local90) + 128;
					Static162.aBooleanArrayArray13[local74][local77] = Static50.aClass4_5.method4226(local104, local117, local108, local104, local137, local108);
				} else {
					Static162.aBooleanArrayArray13[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static206.anInt4000 + Static206.anInt4000 + 1; local77++) {
			for (local84 = 0; local84 < Static206.anInt4000 + Static206.anInt4000 + 1; local84++) {
				Static207.aBooleanArrayArray25[local77][local84] = Static162.aBooleanArrayArray13[local77][local84] || Static162.aBooleanArrayArray13[local77 + 1][local84] || Static162.aBooleanArrayArray13[local77][local84 + 1] || Static162.aBooleanArrayArray13[local77 + 1][local84 + 1];
			}
		}
		Static20.anIntArray28 = arg8;
		Static247.anIntArray376 = arg9;
		Static296.anIntArray436 = arg10;
		Static203.anIntArray285 = arg11;
		Static320.anIntArray455 = arg12;
		Static295.method5202();
		Static57.method1345();
		for (@Pc(253) Class55_Sub3 local253 = (Class55_Sub3) Static5.aClass67_7.method2098(); local253 != null; local253 = (Class55_Sub3) Static5.aClass67_7.method2104()) {
			local253.method4599();
			Static56.method1311(local253);
		}
		if (Static299.aBoolean459) {
			for (local90 = 0; local90 < Static350.anInt6740; local90++) {
				Static288.aClass2_Sub36_Sub1Array7[local90].method4676(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static50.aClass4_5.method4219(0);
			if (Static42.aClass101_1 == null || Static42.aClass101_1 instanceof Class101_Sub1) {
				Static42.aClass101_1 = new Class101_Sub2();
			}
		} else if (Static42.aClass101_1 == null || Static42.aClass101_1 instanceof Class101_Sub2) {
			Static42.aClass101_1 = new Class101_Sub1();
		}
		Static42.aClass101_1.method3253(arg2);
		Static42.aClass101_1.method3248();
		if (Static227.aClass8ArrayArrayArray3 != null) {
			Static187.method3377(true);
			Static42.aClass101_1.method3255(22);
			Static97.method5919(arg2, null, 0, (byte) 0, arg15, arg16);
			Static42.aClass101_1.method3248();
			Static42.aClass101_1.method3255(23);
			Static187.method3377(false);
		}
		Static97.method5919(arg2, arg7, arg13, arg14, arg15, arg16);
		Static42.aClass101_1.method3248();
		Static42.aClass101_1.method3254();
		Static42.aClass101_1.method3248();
		if (arg2 > 1) {
			Static50.aClass4_5.method4217(0);
		}
		Static50.aClass4_5.method4284(0, null);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V")
	public static void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class8 local7 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class62_Sub5 local13 = local7.aClass62_Sub5_2;
		@Pc(16) Class62_Sub5 local16 = local7.aClass62_Sub5_1;
		if (local13 != null) {
			local13.anInt5047 = local13.anInt5047 * arg3 / 16;
			local13.anInt5057 = local13.anInt5057 * arg3 / 16;
		}
		if (local16 != null) {
			local16.anInt5047 = local16.anInt5047 * arg3 / 16;
			local16.anInt5057 = local16.anInt5057 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BII)Lclient!uc;")
	public static Class2_Sub11_Sub19 method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class2_Sub11_Sub19 local21 = (Class2_Sub11_Sub19) Static17.aClass199_1.method5751((long) arg0 << 32 | (long) arg1);
		if (local21 == null) {
			local21 = new Class2_Sub11_Sub19(arg0, arg1);
			Static17.aClass199_1.method5749(local21, local21.aLong213);
		}
		return local21;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILclient!dg;)V")
	public static void method5412(@OriginalArg(1) Class2_Sub10 arg0) {
		if (arg0.aByteArray57.length - arg0.anInt4807 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4421();
		if (local21 < 0 || local21 > 15) {
			return;
		}
		@Pc(39) byte local39;
		if (local21 == 15) {
			local39 = 37;
		} else if (local21 == 14) {
			local39 = 36;
		} else if (local21 == 13) {
			local39 = 35;
		} else if (local21 == 12) {
			local39 = 34;
		} else if (local21 == 11) {
			local39 = 33;
		} else if (local21 == 10) {
			local39 = 32;
		} else if (local21 == 9) {
			local39 = 31;
		} else if (local21 == 8) {
			local39 = 30;
		} else if (local21 == 7) {
			local39 = 29;
		} else if (local21 == 6) {
			local39 = 28;
		} else if (local21 == 5) {
			local39 = 28;
		} else if (local21 == 4) {
			local39 = 24;
		} else if (local21 == 3) {
			local39 = 23;
		} else if (local21 == 2) {
			local39 = 22;
		} else if (local21 == 1) {
			local39 = 23;
		} else {
			local39 = 19;
		}
		if (arg0.aByteArray57.length - arg0.anInt4807 < local39) {
			return;
		}
		Static316.anInt6385 = arg0.method4421();
		if (Static316.anInt6385 < 1) {
			Static316.anInt6385 = 1;
		} else if (Static316.anInt6385 > 4) {
			Static316.anInt6385 = 4;
		}
		Static89.method2054(arg0.method4421() == 1);
		Static148.aBoolean262 = arg0.method4421() == 1;
		Static89.aBoolean169 = arg0.method4421() == 1;
		Static21.aBoolean59 = arg0.method4421() == 1;
		Static326.anInt6624 = arg0.method4421() == 1 ? 1 : 0;
		Static40.aBoolean79 = arg0.method4421() == 1;
		Static315.aBoolean563 = arg0.method4421() == 1;
		Static201.aBoolean337 = arg0.method4421() == 1;
		Static322.anInt6490 = arg0.method4421();
		if (Static322.anInt6490 > 2) {
			Static322.anInt6490 = 2;
		}
		if (local21 < 2) {
			Static348.aBoolean606 = arg0.method4421() == 1;
			arg0.method4421();
		} else {
			Static348.aBoolean606 = arg0.method4421() == 1;
		}
		Static304.aBoolean545 = arg0.method4421() == 1;
		Static209.aBoolean435 = arg0.method4421() == 1;
		Static343.anInt6875 = arg0.method4421();
		if (Static343.anInt6875 > 2) {
			Static343.anInt6875 = 2;
		}
		Static7.anInt152 = Static343.anInt6875;
		Static103.aBoolean202 = arg0.method4421() == 1;
		Static2.anInt65 = arg0.method4421();
		if (Static2.anInt65 > 127) {
			Static2.anInt65 = 127;
		}
		Static287.anInt5818 = arg0.method4421();
		Static303.anInt6082 = arg0.method4421();
		if (Static303.anInt6082 > 127) {
			Static303.anInt6082 = 127;
		}
		if (local21 >= 1) {
			Static234.anInt4499 = arg0.method4464();
			Static228.anInt934 = arg0.method4464();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4421();
		}
		@Pc(418) int local418;
		if (local21 >= 4) {
			local418 = arg0.method4421();
			if (local418 < 0 || local418 > 2) {
				local418 = 0;
			}
			if (Static339.anInt6736 < 96) {
				local418 = 0;
			}
			Static341.method5888(local418);
		}
		if (local21 >= 5) {
			Static84.anInt1828 = arg0.method4444();
		}
		local418 = 0;
		if (local21 >= 6) {
			Static6.anInt150 = local418 = arg0.method4421();
		}
		if (Static6.anInt150 != 1 && Static6.anInt150 != 2) {
			Static6.anInt150 = 2;
		}
		if (local21 >= 7) {
			Static259.aBoolean475 = arg0.method4421() == 1;
		}
		if (local21 >= 8) {
			Static234.aBoolean412 = arg0.method4421() == 1;
		}
		if (local21 >= 9) {
			Static114.anInt6585 = arg0.method4421();
		}
		if (Static114.anInt6585 < 0 || Static114.anInt6585 > Static86.method1930(Static339.anInt6736)) {
			Static114.anInt6585 = 0;
		}
		if (local21 >= 10) {
			Static229.aBoolean222 = arg0.method4421() != 0;
		}
		if (local21 >= 11) {
			Static231.aBoolean537 = arg0.method4421() != 0;
		}
		if (local21 >= 12) {
			Static326.anInt6624 = arg0.method4421();
		}
		if (Static326.anInt6624 < 0 || Static326.anInt6624 > 2) {
			Static326.anInt6624 = 1;
		}
		if (local21 >= 13) {
			Static32.aBoolean70 = arg0.method4421() == 1;
		}
		if (local21 >= 14) {
			Static84.anInt1829 = arg0.method4421();
		} else if (local418 == 0) {
			Static84.anInt1829 = 2;
		} else {
			Static84.anInt1829 = 1;
		}
		if (Static84.anInt1829 < 0 || Static84.anInt1829 > 3) {
			Static84.anInt1829 = 2;
		}
		if (local21 >= 15) {
			Static349.anInt6923 = arg0.method4421();
			if (Static349.anInt6923 < 0 || Static349.anInt6923 > 4) {
				Static349.anInt6923 = Static161.anInt3262 == 1 ? 2 : 4;
			}
		}
	}
}
