import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt2656 = 0;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
	public static int[] anIntArray240 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt2660 = 0;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public static int anInt2663 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIILclient!uc;I)Lclient!uc;")
	public static Class12_Sub2 method2056(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class12_Sub2 arg4, @OriginalArg(6) int arg5) {
		@Pc(4) long local4 = (long) arg5;
		@Pc(14) Class12_Sub2 local14 = (Class12_Sub2) Static263.aClass33_7.method841(local4);
		if (local14 == null) {
			@Pc(22) Class12_Sub7 local22 = Static208.method3332(Static34.aClass98_19, arg5);
			if (local22 == null) {
				return null;
			}
			local14 = local22.method3325(64, 768, -50, -10, -50);
			Static263.aClass33_7.method845(local14, local4);
		}
		@Pc(53) int local53 = arg4.method3148();
		@Pc(56) int local56 = arg4.method3146();
		@Pc(59) int local59 = arg4.method3147();
		@Pc(62) int local62 = arg4.method3153();
		local14 = local14.method3156(true, true, true);
		if (arg3 != 0) {
			local14.method3144(arg3);
		}
		@Pc(109) int local109;
		if (Static178.aBoolean216) {
			@Pc(79) Class12_Sub2_Sub2 local79 = (Class12_Sub2_Sub2) local14;
			if (arg1 != Static96.method1559(Static210.anInt4103, local59 + arg0, arg2 - -local53) || arg1 != Static96.method1559(Static210.anInt4103, local62 + arg0, arg2 + local56)) {
				for (local109 = 0; local109 < local79.anInt3964; local109++) {
					local79.anIntArray340[local109] += Static96.method1559(Static210.anInt4103, local79.anIntArray343[local109] + arg0, local79.anIntArray344[local109] - -arg2) - arg1;
				}
				local79.aClass165_1.aBoolean323 = false;
				local79.aClass174_1.aBoolean339 = false;
			}
		} else {
			@Pc(156) Class12_Sub2_Sub1 local156 = (Class12_Sub2_Sub1) local14;
			if (Static96.method1559(Static210.anInt4103, arg0 + local59, local53 + arg2) != arg1 || Static96.method1559(Static210.anInt4103, arg0 + local62, arg2 - -local56) != arg1) {
				for (local109 = 0; local109 < local156.anInt732; local109++) {
					local156.anIntArray81[local109] += Static96.method1559(Static210.anInt4103, local156.anIntArray77[local109] + arg0, arg2 + local156.anIntArray84[local109]) - arg1;
				}
				local156.aBoolean56 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	public static void method2057() {
		anIntArrayArray24 = null;
		anIntArray240 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)I")
	public static int method2058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg0 & 0xF;
		@Pc(31) int local31 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg2 : arg1) : arg3;
		@Pc(40) int local40 = local12 >= 8 ? arg3 : arg2;
		return ((local12 & 0x1) == 0 ? local40 : -local40) + ((local12 & 0x2) == 0 ? local31 : -local31);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!p;I)V")
	public static void method2059(@OriginalArg(0) Class4_Sub17 arg0) {
		@Pc(9) int local9 = arg0.method1856();
		Static49.aClass149Array1 = new Class149[local9];
		@Pc(14) int local14;
		for (local14 = 0; local14 < local9; local14++) {
			Static49.aClass149Array1[local14] = new Class149();
			Static49.aClass149Array1[local14].anInt4518 = arg0.method1856();
			Static49.aClass149Array1[local14].aString148 = arg0.method1866();
		}
		Static80.anInt1542 = arg0.method1856();
		Static200.anInt3912 = arg0.method1856();
		Static174.anInt3435 = arg0.method1856();
		Static148.aClass53_Sub1Array2 = new Class53_Sub1[Static200.anInt3912 + 1 - Static80.anInt1542];
		for (local14 = 0; local14 < Static174.anInt3435; local14++) {
			@Pc(82) int local82 = arg0.method1856();
			@Pc(90) Class53_Sub1 local90 = Static148.aClass53_Sub1Array2[local82] = new Class53_Sub1();
			local90.anInt1770 = arg0.method1874();
			local90.anInt1769 = arg0.method1889();
			local90.anInt1775 = local82 + Static80.anInt1542;
			local90.aString48 = arg0.method1866();
			local90.aString49 = arg0.method1866();
		}
		Static201.anInt3919 = arg0.method1889();
		Static162.aBoolean205 = true;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(Z)V")
	public static void method2060() {
		Static264.aClass33_38.method843();
		Static99.aClass33_15.method843();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
	public static void method2061(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static32.method475(arg0 - 1L);
			Static32.method475(1L);
		} else {
			Static32.method475(arg0);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2062(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class4_Sub2_Sub21 local8 = Static39.method4121(arg0, 2);
		local8.method4360();
		local8.aString192 = arg1;
	}
}
