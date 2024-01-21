import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!rb", name = "w", descriptor = "Lclient!lf;")
	public static Class7 aClass7_16;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public static int anInt2391;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1134 = Static78.method1313("slide:");

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1135 = Static78.method1313("Error connecting to server)3");

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public static int anInt2381 = 0;

	@OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
	public static int anInt2386 = 0;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1136 = Static78.method1313(": ");

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1137 = aClass25_1134;

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1138 = Static78.method1313("jolt");

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1139 = Static78.method1313("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!rb", name = "r", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1140 = aClass25_1135;

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1141 = aClass25_1134;

	@OriginalMember(owner = "client!rb", name = "u", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1142 = Static78.method1313("Loaded interfaces");

	@OriginalMember(owner = "client!rb", name = "A", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1143 = Static78.method1313("backbase1");

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1144 = Static78.method1313("hel");

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1145 = aClass25_1142;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "[I")
	public static int[] anIntArray414 = new int[1000];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	public static void method1687() {
		for (@Pc(15) Class1_Sub16 local15 = (Class1_Sub16) Static38.aClass2_5.method22(); local15 != null; local15 = (Class1_Sub16) Static38.aClass2_5.method23()) {
			if (local15.anInt2585 > 0) {
				local15.anInt2585--;
			}
			if (local15.anInt2585 != 0) {
				if (local15.anInt2591 > 0) {
					local15.anInt2591--;
				}
				if (local15.anInt2591 == 0 && local15.anInt2584 >= 1 && local15.anInt2579 >= 1 && local15.anInt2584 <= 102 && local15.anInt2579 <= 102 && (local15.anInt2594 < 0 || Static6.method105(local15.anInt2594, local15.anInt2593))) {
					Static15.method363(local15.anInt2589, local15.anInt2581, local15.anInt2594, local15.anInt2580, local15.anInt2593, local15.anInt2584, local15.anInt2579);
					local15.anInt2591 = -1;
					if (local15.anInt2594 == local15.anInt2590 && local15.anInt2590 == -1) {
						local15.method2024();
					} else if (local15.anInt2594 == local15.anInt2590 && local15.anInt2583 == local15.anInt2580 && local15.anInt2593 == local15.anInt2595) {
						local15.method2024();
					}
				}
			} else if (local15.anInt2590 < 0 || Static6.method105(local15.anInt2590, local15.anInt2595)) {
				Static15.method363(local15.anInt2589, local15.anInt2581, local15.anInt2590, local15.anInt2583, local15.anInt2595, local15.anInt2584, local15.anInt2579);
				local15.method2024();
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!tc;IIILjava/awt/Component;)Lclient!ve;")
	public static Class57 method1688(@OriginalArg(0) Class74 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static81.anInt1802 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class57 local33 = (Class57) Class.forName("Class57_Sub2").getDeclaredConstructor().newInstance();
			local33.anIntArray493 = new int[(Static10.aBoolean6 ? 2 : 1) * 256];
			local33.anInt2915 = arg2;
			local33.method2016(arg3);
			local33.anInt2912 = (arg2 & 0xFFFFFC00) + 1024;
			if (local33.anInt2912 > 16384) {
				local33.anInt2912 = 16384;
			}
			local33.method2011(local33.anInt2912);
			if (Static127.anInt2944 > 0 && Static38.aClass21_1 == null) {
				Static38.aClass21_1 = new Class21();
				arg0.method1821(Static127.anInt2944, Static38.aClass21_1);
			}
			if (Static38.aClass21_1 != null) {
				if (Static38.aClass21_1.aClass57Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static38.aClass21_1.aClass57Array1[arg1] = local33;
			}
			return local33;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class57_Sub1 local111 = new Class57_Sub1(arg0, arg1);
				local111.anIntArray493 = new int[(Static10.aBoolean6 ? 2 : 1) * 256];
				local111.anInt2915 = arg2;
				local111.method2016(arg3);
				local111.anInt2912 = 16384;
				local111.method2011(local111.anInt2912);
				if (Static127.anInt2944 > 0 && Static38.aClass21_1 == null) {
					Static38.aClass21_1 = new Class21();
					arg0.method1821(Static127.anInt2944, Static38.aClass21_1);
				}
				if (Static38.aClass21_1 != null) {
					if (Static38.aClass21_1.aClass57Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static38.aClass21_1.aClass57Array1[arg1] = local111;
				}
				return local111;
			} catch (@Pc(175) Throwable local175) {
				return new Class57();
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	public static void method1689() {
		aClass25_1143 = null;
		aClass25_1145 = null;
		aClass25_1142 = null;
		aClass25_1136 = null;
		aClass25_1140 = null;
		aClass25_1137 = null;
		aByteArrayArray8 = null;
		aClass7_16 = null;
		anIntArray414 = null;
		aClass25_1144 = null;
		aClass25_1139 = null;
		aClass25_1134 = null;
		aClass25_1141 = null;
		aClass25_1135 = null;
		aClass25_1138 = null;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
	public static void method1690() {
		Static124.anInt2899++;
		Static77.method1295(true);
		Static38.method871(true);
		Static77.method1295(false);
		Static38.method871(false);
		Static5.method96();
		Static3.method38();
		@Pc(31) int local31;
		@Pc(67) int local67;
		if (!Static84.aBoolean82) {
			local31 = Static99.anInt2311;
			if (local31 < Static100.anInt2321 / 256) {
				local31 = Static100.anInt2321 / 256;
			}
			if (Static78.aBooleanArray7[4] && Static13.anIntArray65[4] + 128 > local31) {
				local31 = Static13.anIntArray65[4] + 128;
			}
			local67 = Static101.anInt2360 + Static54.anInt1298 & 0x7FF;
			Static3.method43(local31, Static129.method2048(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2827, Static21.anInt596, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anInt2832) - 50, Static118.anInt2719, local31 * 3 + 600, local67, Static107.anInt2488);
		}
		if (Static84.aBoolean82) {
			local31 = Static34.method752();
		} else {
			local31 = Static31.method713();
		}
		local67 = Static75.anInt1566;
		@Pc(101) int local101 = Static90.anInt2026;
		@Pc(103) int local103 = Static67.anInt1471;
		@Pc(105) int local105 = Static35.anInt1003;
		@Pc(107) int local107 = Static106.anInt2477;
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (Static78.aBooleanArray7[local109]) {
				@Pc(150) int local150 = (int) (Math.random() * (double) (Static76.anIntArray297[local109] * 2 + 1) - (double) Static76.anIntArray297[local109] + Math.sin((double) Static11.anIntArray46[local109] * ((double) Static61.anIntArray265[local109] / 100.0D)) * (double) Static13.anIntArray65[local109]);
				if (local109 == 2) {
					Static67.anInt1471 += local150;
				}
				if (local109 == 4) {
					Static35.anInt1003 += local150;
					if (Static35.anInt1003 < 128) {
						Static35.anInt1003 = 128;
					}
					if (Static35.anInt1003 > 383) {
						Static35.anInt1003 = 383;
					}
				}
				if (local109 == 3) {
					Static106.anInt2477 = Static106.anInt2477 + local150 & 0x7FF;
				}
				if (local109 == 1) {
					Static90.anInt2026 += local150;
				}
				if (local109 == 0) {
					Static75.anInt1566 += local150;
				}
			}
		}
		Static31.method708();
		Static20.anInt574 = Static111.anInt2597 - 4;
		Static20.anInt575 = 0;
		Static20.aBoolean20 = true;
		Static20.anInt573 = Static10.anInt264 - 4;
		Static106.method1722();
		Static128.method1943();
		Static106.method1722();
		Static118.aClass4_1.method80(Static75.anInt1566, Static90.anInt2026, Static67.anInt1471, Static35.anInt1003, Static106.anInt2477, local31);
		Static106.method1722();
		Static118.aClass4_1.method83();
		Static32.method734();
		Static120.method1983();
		((Class54) Static36.anInterface3_1).method1224(Static18.anInt522);
		Static102.method1685();
		if (Static92.aBoolean101 && Static69.method1145() == 0) {
			Static92.aBoolean101 = false;
		}
		if (Static92.aBoolean101) {
			Static31.method708();
			Static128.method1943();
			Static111.method1790(null, Static2.aClass25_30, false);
		}
		Static106.method1722();
		Static9.method236();
		Static90.anInt2026 = local101;
		Static75.anInt1566 = local67;
		Static106.anInt2477 = local107;
		Static35.anInt1003 = local105;
		Static67.anInt1471 = local103;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 method1693() {
		@Pc(7) Class1_Sub2_Sub2_Sub4 local7 = new Class1_Sub2_Sub2_Sub4();
		local7.anInt2757 = Static62.anIntArray267[0];
		local7.anInt2756 = Static88.anIntArray349[0];
		local7.aByteArray39 = Static13.aByteArrayArray1[0];
		local7.anInt2755 = Static1.anInt20;
		local7.anInt2760 = Static39.anInt1092;
		local7.anInt2758 = Static100.anIntArray402[0];
		local7.anInt2759 = Static111.anIntArray434[0];
		local7.anIntArray477 = Static1.anIntArray10;
		Static99.method1649();
		return local7;
	}
}
