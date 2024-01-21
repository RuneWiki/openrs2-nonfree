import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
	public static int anInt1871;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	public static int anInt1884;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!wd;")
	private static Class80 aClass80_723 = Static2.method59("flash1:");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!wd;")
	public static Class80 aClass80_718 = aClass80_723;

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "Lclient!wd;")
	public static Class80 aClass80_719 = Static2.method59("::fpson");

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "Lclient!wd;")
	public static Class80 aClass80_720 = aClass80_723;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_721 = null;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!va;")
	public static Class2_Sub1_Sub17 aClass2_Sub1_Sub17_5 = null;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!wd;")
	public static Class80 aClass80_722 = Static2.method59("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method1115() {
		@Pc(10) int local10 = Static100.aClass2_Sub17_Sub1_1.method1801(8);
		@Pc(24) int local24;
		if (local10 < Static92.anInt2273) {
			for (local24 = local10; local24 < Static92.anInt2273; local24++) {
				Static44.anIntArray173[Static61.anInt1795++] = Static53.anIntArray208[local24];
			}
		}
		if (Static92.anInt2273 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static92.anInt2273 = 0;
		for (local24 = 0; local24 < local10; local24++) {
			@Pc(58) int local58 = Static53.anIntArray208[local24];
			@Pc(62) Class2_Sub1_Sub1_Sub4_Sub2 local62 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local58];
			@Pc(67) int local67 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
			if (local67 == 0) {
				Static53.anIntArray208[Static92.anInt2273++] = local58;
				local62.anInt2342 = Static10.anInt300;
			} else {
				@Pc(87) int local87 = Static100.aClass2_Sub17_Sub1_1.method1801(2);
				if (local87 == 0) {
					Static53.anIntArray208[Static92.anInt2273++] = local58;
					local62.anInt2342 = Static10.anInt300;
					Static16.anIntArray68[Static93.anInt2410++] = local58;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local87 == 1) {
						Static53.anIntArray208[Static92.anInt2273++] = local58;
						local62.anInt2342 = Static10.anInt300;
						local136 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
						local62.method1436(local136, false);
						local146 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
						if (local146 == 1) {
							Static16.anIntArray68[Static93.anInt2410++] = local58;
						}
					} else if (local87 == 2) {
						Static53.anIntArray208[Static92.anInt2273++] = local58;
						local62.anInt2342 = Static10.anInt300;
						local136 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
						local62.method1436(local136, true);
						local146 = Static100.aClass2_Sub17_Sub1_1.method1801(3);
						local62.method1436(local146, true);
						@Pc(204) int local204 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
						if (local204 == 1) {
							Static16.anIntArray68[Static93.anInt2410++] = local58;
						}
					} else if (local87 == 3) {
						Static44.anIntArray173[Static61.anInt1795++] = local58;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!va;)Z")
	public static boolean method1116(@OriginalArg(1) Class2_Sub1_Sub17 arg0) {
		if (Static97.aBoolean188) {
			if (Static102.method1660(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3038 == 0) {
				return false;
			}
		}
		return arg0.aBoolean229;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1117() {
		Static59.anInt1768 = 0;
		@Pc(12) int local12 = Static57.anInt1736 + (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 >> 7);
		@Pc(19) int local19 = Static66.anInt1860 + (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static59.anInt1768 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static59.anInt1768 = 1;
		}
		if (Static59.anInt1768 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static59.anInt1768 = 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1118() {
		while (true) {
			@Pc(9) Class58 local9 = Static63.aClass58_8;
			@Pc(18) Class2_Sub12 local18;
			synchronized (Static63.aClass58_8) {
				local18 = (Class2_Sub12) Static30.aClass58_2.method1291();
			}
			if (local18 == null) {
				return;
			}
			local18.aClass11_Sub1_12.method401(local18.aClass60_4, false, (int) local18.aLong91, local18.aByteArray28);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1119() {
		aClass2_Sub1_Sub17_5 = null;
		anIntArray235 = null;
		aClass80_719 = null;
		aClass80_718 = null;
		aClass80_723 = null;
		aClass80_722 = null;
		aClass80_720 = null;
		aClass80_721 = null;
	}
}
