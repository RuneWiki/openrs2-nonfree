import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array8;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	public static int anInt2136;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_724 = Static161.method2971("<col=00ff00>");

	@OriginalMember(owner = "client!id", name = "e", descriptor = "Lclient!dd;")
	public static Class13 aClass13_725 = Static161.method2971("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_726 = Static161.method2971("Clientscript error in: ");

	@OriginalMember(owner = "client!id", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_727 = Static161.method2971("Lade)3)3)3");

	@OriginalMember(owner = "client!id", name = "i", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public static int anInt2130 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ag;Lclient!ag;Lclient!ag;Lclient!ag;)V")
	public static void method1565(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) Class4 arg3) {
		Static83.aClass4_55 = arg0;
		Static62.aClass4_62 = arg2;
		Static109.aClass4_72 = arg1;
		Static134.aClass4_85 = arg3;
		Static145.aClass20ArrayArray1 = new Class20[Static62.aClass4_62.method2248()][];
		Static46.aBooleanArray25 = new boolean[Static62.aClass4_62.method2248()];
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	public static void method1566(@OriginalArg(1) int arg0) {
		Static14.anInt489 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method1567() {
		aClass13_726 = null;
		aClass13_725 = null;
		aClass13_727 = null;
		aClass1_Sub2_Sub1_Sub4Array8 = null;
		aClass13_724 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!fd;II)V")
	public static void method1568(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static131.method2376();
		Static128.method553(arg0, arg2, arg1.anInt1559 + arg0, arg2 - -arg1.anInt1603);
		if (Static29.anInt1044 == 2 || Static29.anInt1044 == 5) {
			Static128.method566(arg0, arg2, arg1.anIntArray173, arg1.anIntArray172);
		} else {
			@Pc(43) int local43 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32 + 48;
			@Pc(51) int local51 = 464 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
			@Pc(57) int local57 = Static2.anInt101 + Static79.anInt2241 & 0x7FF;
			Static155.aClass1_Sub2_Sub1_Sub3_9.method412(arg0, arg2, arg1.anInt1559, arg1.anInt1603, local43, local51, local57, Static60.anInt1871 + 256, arg1.anIntArray173, arg1.anIntArray172);
			@Pc(93) int local93;
			@Pc(107) int local107;
			for (@Pc(77) int local77 = 0; local77 < Static89.anInt2508; local77++) {
				local93 = Static12.anIntArray52[local77] * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
				local107 = Static20.anIntArray107[local77] * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
				Static126.method2304(arg1, arg0, Static27.aClass1_Sub2_Sub1_Sub3Array4[local77], local107, arg2, local93);
			}
			@Pc(155) int local155;
			for (local93 = 0; local93 < 104; local93++) {
				for (local107 = 0; local107 < 104; local107++) {
					@Pc(141) Class82 local141 = Static131.aClass82ArrayArrayArray1[Static156.anInt3696][local93][local107];
					if (local141 != null) {
						local155 = local107 * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
						@Pc(167) int local167 = local93 * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
						Static126.method2304(arg1, arg0, Static38.aClass1_Sub2_Sub1_Sub3Array6[0], local155, arg2, local167);
					}
				}
			}
			@Pc(244) int local244;
			for (local107 = 0; local107 < Static74.anInt2127; local107++) {
				@Pc(197) Class1_Sub2_Sub2_Sub2_Sub1 local197 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[Static66.anIntArray202[local107]];
				if (local197 != null && local197.method1882()) {
					@Pc(206) Class1_Sub2_Sub19 local206 = local197.aClass1_Sub2_Sub19_1;
					if (local206 != null && local206.anIntArray430 != null) {
						local206 = local206.method2798();
					}
					if (local206 != null && local206.aBoolean299 && local206.aBoolean297) {
						local155 = local197.anInt2596 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
						local244 = local197.anInt2606 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
						Static126.method2304(arg1, arg0, Static38.aClass1_Sub2_Sub1_Sub3Array6[1], local244, arg2, local155);
					}
				}
			}
			for (@Pc(264) int local264 = 0; local264 < Static65.anInt1929; local264++) {
				@Pc(272) Class1_Sub2_Sub2_Sub2_Sub2 local272 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[Static30.anIntArray116[local264]];
				if (local272 != null && local272.method1882()) {
					local244 = local272.anInt2606 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
					@Pc(290) boolean local290 = false;
					local155 = local272.anInt2596 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
					@Pc(306) long local306 = local272.aClass13_847.method878();
					for (@Pc(308) int local308 = 0; local308 < Static21.anInt784; local308++) {
						if (Static149.aLongArray8[local308] == local306 && Static162.anIntArray427[local308] != 0) {
							local290 = true;
							break;
						}
					}
					@Pc(337) boolean local337 = false;
					if (Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2629 != 0 && local272.anInt2629 != 0 && Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2629 == local272.anInt2629) {
						local337 = true;
					}
					if (local290) {
						Static126.method2304(arg1, arg0, Static38.aClass1_Sub2_Sub1_Sub3Array6[3], local244, arg2, local155);
					} else if (local337) {
						Static126.method2304(arg1, arg0, Static38.aClass1_Sub2_Sub1_Sub3Array6[4], local244, arg2, local155);
					} else {
						Static126.method2304(arg1, arg0, Static38.aClass1_Sub2_Sub1_Sub3Array6[2], local244, arg2, local155);
					}
				}
			}
			@Pc(404) Class41[] local404 = Static144.aClass41Array1;
			@Pc(504) int local504;
			for (local155 = 0; local155 < local404.length; local155++) {
				@Pc(412) Class41 local412 = local404[local155];
				if (local412 != null && local412.anInt2172 != 0 && Static78.anInt2168 % 20 < 10) {
					@Pc(474) int local474;
					@Pc(463) int local463;
					if (local412.anInt2172 == 1 && local412.anInt2165 >= 0 && local412.anInt2165 < Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1.length) {
						@Pc(450) Class1_Sub2_Sub2_Sub2_Sub1 local450 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[local412.anInt2165];
						if (local450 != null) {
							local463 = local450.anInt2596 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
							local474 = local450.anInt2606 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
							Static98.method2707(arg2, local474, local463, arg0, local412.anInt2163, arg1);
						}
					}
					if (local412.anInt2172 == 2) {
						local504 = (local412.anInt2170 - Static153.anInt3629) * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
						local463 = (local412.anInt2167 - Static60.anInt1864) * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
						Static98.method2707(arg2, local463, local504, arg0, local412.anInt2163, arg1);
					}
					if (local412.anInt2172 == 10 && local412.anInt2165 >= 0 && Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1.length > local412.anInt2165) {
						@Pc(546) Class1_Sub2_Sub2_Sub2_Sub2 local546 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local412.anInt2165];
						if (local546 != null) {
							local463 = local546.anInt2596 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
							local474 = local546.anInt2606 / 32 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
							Static98.method2707(arg2, local474, local463, arg0, local412.anInt2163, arg1);
						}
					}
				}
			}
			if (Static49.anInt1616 != 0) {
				local504 = Static70.anInt2008 * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 / 32;
				local244 = Static49.anInt1616 * 4 + 2 - Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 / 32;
				Static126.method2304(arg1, arg0, Static85.aClass1_Sub2_Sub1_Sub3_4, local504, arg2, local244);
			}
			Static128.method565(arg0 + arg1.anInt1559 / 2 - 1, arg1.anInt1603 / 2 + -1 + arg2, 3, 3, 16777215);
		}
		Static28.aBooleanArray19[arg3] = true;
	}
}
