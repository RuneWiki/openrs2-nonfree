import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!lf;")
	private static Class49 aClass49_275 = Static32.method683("white:");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_273 = aClass49_275;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!eh;")
	public static Class25 aClass25_3 = new Class25(4096);

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_274 = aClass49_275;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!rc;")
	public static Class74 aClass74_19 = new Class74(64);

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!tf;")
	public static Class81 aClass81_2 = new Class81();

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method394() {
		aClass49_275 = null;
		aClass81_2 = null;
		aClass49_274 = null;
		aClass49_273 = null;
		aClass74_19 = null;
		aClass25_3 = null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method395() {
		if (Static154.aClass85_13 != null || Static160.aClass85_14 != null) {
			return;
		}
		@Pc(17) int local17 = Static63.anInt1351;
		@Pc(85) int local85;
		@Pc(91) int local91;
		if (Static47.aBoolean40) {
			@Pc(191) int local191;
			if (local17 != 1) {
				local85 = Static96.anInt2022;
				local191 = Static20.anInt449;
				if (local191 < Static92.anInt1938 - 10 || Static92.anInt1938 + Static98.anInt2077 + 10 < local191 || local85 < Static93.anInt1968 - 10 || local85 > Static113.anInt2340 + Static93.anInt1968 + 10) {
					Static47.aBoolean40 = false;
					Static170.method2828(Static113.anInt2340, Static93.anInt1968, Static92.anInt1938, Static98.anInt2077);
				}
			}
			if (local17 != 1) {
				return;
			}
			local191 = Static92.anInt1938;
			local91 = Static98.anInt2077;
			local85 = Static93.anInt1968;
			@Pc(243) int local243 = Static114.anInt2394;
			@Pc(245) int local245 = -1;
			@Pc(247) int local247 = Static61.anInt1320;
			for (@Pc(249) int local249 = 0; local249 < Static133.anInt3713; local249++) {
				@Pc(265) int local265 = local85 + (-local249 + Static133.anInt3713 + -1) * 15 + 31;
				if (local243 > local191 && local191 + local91 > local243 && local247 > local265 - 13 && local247 < local265 + 3) {
					local245 = local249;
				}
			}
			if (local245 != -1) {
				Static6.method105(local245);
			}
			Static47.aBoolean40 = false;
			Static170.method2828(Static113.anInt2340, Static93.anInt1968, Static92.anInt1938, Static98.anInt2077);
			return;
		}
		if (local17 == 1 && Static133.anInt3713 > 0) {
			@Pc(33) short local33 = Static30.aShortArray1[Static133.anInt3713 - 1];
			if (local33 == 39 || local33 == 45 || local33 == 24 || local33 == 41 || local33 == 42 || local33 == 15 || local33 == 29 || local33 == 7 || local33 == 20 || local33 == 3 || local33 == 17 || local33 == 1005) {
				local85 = Static130.anIntArray347[Static133.anInt3713 - 1];
				local91 = Static177.anIntArray362[Static133.anInt3713 - 1];
				@Pc(95) Class85 local95 = Static140.method2337(local91);
				if (Static77.method1249(Static111.method1895(local95)) || Static140.method2336(Static111.method1895(local95))) {
					Static146.anInt3093 = 0;
					Static111.aBoolean100 = false;
					if (Static154.aClass85_13 != null) {
						Static102.method1756(Static154.aClass85_13);
					}
					Static154.aClass85_13 = Static140.method2337(local91);
					Static37.anInt941 = Static61.anInt1320;
					Static9.anInt165 = local85;
					Static57.anInt1208 = Static114.anInt2394;
					Static102.method1756(Static154.aClass85_13);
					return;
				}
			}
		}
		if (local17 == 1 && (Static111.anInt2307 == 1 && Static133.anInt3713 > 2 || Static26.method476(Static133.anInt3713 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static133.anInt3713 > 0) {
			Static6.method105(Static133.anInt3713 - 1);
		}
		if (local17 == 2 && Static133.anInt3713 > 0) {
			Static112.method1902();
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!bg;BLclient!bg;)V")
	public static void method396(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static29.aClass11_33 = arg1;
		Static121.aClass11_97 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method397() {
		@Pc(17) int local17;
		for (@Pc(7) int local7 = -1; local7 < Static139.anInt2969; local7++) {
			if (local7 == -1) {
				local17 = 2047;
			} else {
				local17 = Static110.anIntArray221[local7];
			}
			@Pc(25) Class2_Sub2_Sub3_Sub7_Sub2 local25 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local17];
			if (local25 != null && local25.anInt3570 > 0) {
				local25.anInt3570--;
				if (local25.anInt3570 == 0) {
					local25.aClass49_1602 = null;
				}
			}
		}
		for (local17 = 0; local17 < Static1.anInt2; local17++) {
			@Pc(65) int local65 = Static1.anIntArray1[local17];
			@Pc(69) Class2_Sub2_Sub3_Sub7_Sub1 local69 = Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local65];
			if (local69 != null && local69.anInt3570 > 0) {
				local69.anInt3570--;
				if (local69.anInt3570 == 0) {
					local69.aClass49_1602 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)Lclient!va;")
	public static Class2_Sub2_Sub18 method398(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub18 local8 = (Class2_Sub2_Sub18) Static26.aClass74_22.method2345((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static46.aClass11_Sub1_9.method2049(0, arg0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class2_Sub2_Sub18();
		@Pc(32) int local32 = 0;
		@Pc(37) Class2_Sub13 local37 = new Class2_Sub13(local22);
		local37.anInt3940 = local37.aByteArray49.length - 12;
		@Pc(48) int local48 = local37.method2946();
		local8.anInt3744 = local37.method2933();
		local8.anInt3743 = local37.method2933();
		local8.anInt3741 = local37.method2933();
		local8.anInt3737 = local37.method2933();
		local37.anInt3940 = 0;
		local8.aClass49_1678 = local37.method2960();
		local8.anIntArray332 = new int[local48];
		local8.anIntArray331 = new int[local48];
		local8.aClass49Array20 = new Class49[local48];
		while (local37.anInt3940 < local37.aByteArray49.length - 12) {
			@Pc(94) int local94 = local37.method2933();
			if (local94 == 3) {
				local8.aClass49Array20[local32] = local37.method2926();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local8.anIntArray332[local32] = local37.method2962();
			} else {
				local8.anIntArray332[local32] = local37.method2946();
			}
			local8.anIntArray331[local32++] = local94;
		}
		Static26.aClass74_22.method2341((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!lf;I)Z")
	public static boolean method399(@OriginalArg(0) Class49 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static175.anInt3799; local11++) {
			if (arg0.method1645(Static101.aClass49Array14[local11])) {
				return true;
			}
		}
		return arg0.method1645(Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.aClass49_1606);
	}
}
