import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!di", name = "jb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!di", name = "U", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!di", name = "db", descriptor = "Lclient!fc;")
	public static Class25 aClass25_5 = new Class25(5);

	@OriginalMember(owner = "client!di", name = "eb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_439 = Static49.method1293("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
	public static int anInt1374 = 0;

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_440 = Static49.method1293("Members only world");

	@OriginalMember(owner = "client!di", name = "hb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_441 = Static49.method1293("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!di", name = "kb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_442 = aClass70_440;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIB)V")
	public static void method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static44.anInt1474; local15++) {
			if (arg1 < Static19.anIntArray32[local15] + Static99.anIntArray437[local15] && arg3 + arg1 > Static99.anIntArray437[local15] && Static146.anIntArray363[local15] + Static92.anIntArray254[local15] > arg0 && Static92.anIntArray254[local15] < arg2 + arg0) {
				Static26.aBooleanArray3[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(B)V")
	public static void method1006() {
		Static98.aClass1_Sub9_Sub1_2.method1285();
		@Pc(15) int local15 = Static98.aClass1_Sub9_Sub1_2.method1288(8);
		@Pc(24) int local24;
		if (local15 < Static86.anInt2582) {
			for (local24 = local15; local24 < Static86.anInt2582; local24++) {
				Static151.anIntArray380[Static67.anInt2096++] = Static152.anIntArray208[local24];
			}
		}
		if (local15 > Static86.anInt2582) {
			throw new RuntimeException("gnpov1");
		}
		Static86.anInt2582 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(67) int local67 = Static152.anIntArray208[local24];
			@Pc(71) Class1_Sub1_Sub4_Sub2_Sub2 local71 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local67];
			@Pc(78) int local78 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
			if (local78 == 0) {
				Static152.anIntArray208[Static86.anInt2582++] = local67;
				local71.anInt2026 = Static47.anInt1654;
			} else {
				@Pc(98) int local98 = Static98.aClass1_Sub9_Sub1_2.method1288(2);
				if (local98 == 0) {
					Static152.anIntArray208[Static86.anInt2582++] = local67;
					local71.anInt2026 = Static47.anInt1654;
					Static48.anIntArray167[Static161.anInt4212++] = local67;
				} else {
					@Pc(145) int local145;
					@Pc(155) int local155;
					if (local98 == 1) {
						Static152.anIntArray208[Static86.anInt2582++] = local67;
						local71.anInt2026 = Static47.anInt1654;
						local145 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
						local71.method1512(local145, false);
						local155 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
						if (local155 == 1) {
							Static48.anIntArray167[Static161.anInt4212++] = local67;
						}
					} else if (local98 == 2) {
						Static152.anIntArray208[Static86.anInt2582++] = local67;
						local71.anInt2026 = Static47.anInt1654;
						local145 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
						local71.method1512(local145, true);
						local155 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
						local71.method1512(local155, true);
						@Pc(207) int local207 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
						if (local207 == 1) {
							Static48.anIntArray167[Static161.anInt4212++] = local67;
						}
					} else if (local98 == 3) {
						Static151.anIntArray380[Static67.anInt2096++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
	public static void method1007() {
		anIntArrayArrayArray3 = null;
		aClass25_5 = null;
		aClass70_440 = null;
		aClass70_441 = null;
		aClass70_442 = null;
		aClass70_439 = null;
		anObject1 = null;
	}
}
