import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Z")
	public static boolean aBoolean92;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public static int anInt2176;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	public static int anInt2177;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt2168 = 0;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!tg;")
	public static Class81 aClass81_767 = Static120.method2057("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!tg;")
	private static Class81 aClass81_769 = Static120.method2057("Could not complete login)3");

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "Lclient!tg;")
	public static Class81 aClass81_768 = aClass81_769;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method1646() {
		aClass81_767 = null;
		aClass81_768 = null;
		aClass81_769 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BLclient!pb;II)V")
	public static void method1647(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(3) Class1_Sub7 local3 = new Class1_Sub7();
		local3.anInt307 = 0;
		local3.aByteArray1 = arg0;
		local3.aClass66_1 = arg1;
		local3.aLong148 = arg2;
		@Pc(22) Class30 local22 = Static139.aClass30_14;
		synchronized (Static139.aClass30_14) {
			Static139.aClass30_14.method1113(local3);
		}
		Static41.method805();
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method1648() {
		if (!Static149.aBoolean145) {
			Static35.aClass81Array2[0] = Static16.aClass81_139;
			Static49.aShortArray11[0] = 1007;
			Static152.aClass81Array19[0] = Static149.aClass81_1213;
			Static118.anInt2616 = 1;
		}
		if (Static97.anInt2134 != -1) {
			Static147.method2504(Static97.anInt2134);
		}
		for (@Pc(33) int local33 = 0; local33 < Static11.anInt651; local33++) {
			if (Static87.aBooleanArray11[local33]) {
				Static119.aBooleanArray14[local33] = true;
			}
			Static153.aBooleanArray16[local33] = Static87.aBooleanArray11[local33];
			Static87.aBooleanArray11[local33] = false;
		}
		Static24.anInt615 = -1;
		Static184.anInt4118 = Static142.anInt3104;
		Static41.aClass77_6 = null;
		Static66.anInt1659 = -1;
		if (Static97.anInt2134 != -1) {
			Static11.anInt651 = 0;
			Static56.method1008(0, -1, 0, Static97.anInt2134, 0, 503, 765, 0);
		}
		Static4.method2577();
		Static165.method2892();
		if (Static149.aBoolean145) {
			Static62.method1107();
		} else if (Static66.anInt1659 != -1) {
			Static60.method1071(Static24.anInt615, Static66.anInt1659);
		}
		if (Static161.anInt3668 == 3) {
			for (@Pc(102) int local102 = 0; local102 < Static11.anInt651; local102++) {
				if (Static153.aBooleanArray16[local102]) {
					Static4.method2564(Static175.anIntArray307[local102], Static171.anIntArray418[local102], Static50.anIntArray98[local102], Static118.anIntArray280[local102], 16711935, 128);
				} else if (Static119.aBooleanArray14[local102]) {
					Static4.method2564(Static175.anIntArray307[local102], Static171.anIntArray418[local102], Static50.anIntArray98[local102], Static118.anIntArray280[local102], 16711680, 128);
				}
			}
		}
		Static27.method613(Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3026, Static43.aClass1_Sub2_Sub1_Sub3_Sub1_1.anInt3040, Static149.anInt3336, Static44.anInt1086);
		Static149.anInt3336 = 0;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
	public static void method1649() {
		@Pc(9) int local9 = Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1934(Static132.aClass81_1036);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static118.anInt2616; local11++) {
			local19 = Static110.aClass1_Sub2_Sub2_Sub2_Sub1_3.method1934(Static185.method2991(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		local9 += 8;
		Static149.aBoolean145 = true;
		Static61.anInt1539 = Static118.anInt2616 * 15 + 22;
		Static110.anInt2512 = local9;
		@Pc(50) int local50 = Static140.anInt3065 - local9 / 2;
		local19 = Static118.anInt2616 * 15 + 21;
		if (local9 + local50 > 765) {
			local50 = 765 - local9;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		Static48.anInt3638 = local50;
		@Pc(74) int local74 = Static119.anInt2628;
		if (local19 + local74 > 503) {
			local74 = 503 - local19;
		}
		if (local74 < 0) {
			local74 = 0;
		}
		anInt2176 = local74;
	}
}
