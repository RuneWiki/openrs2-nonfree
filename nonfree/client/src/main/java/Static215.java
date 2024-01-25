import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public static int anInt3675 = 10;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[I")
	public static final int[] anIntArray339 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "Z")
	public static boolean aBoolean245 = false;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public static void method3030(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub1_Sub5 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class22 local8 = Static114.aClass22Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static104.anInt1675; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static212.anInt3636; local15++) {
						local1 = local8.OA(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static146.anInt2674;
							@Pc(32) int local32 = local12 << Static146.anInt2674;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class22 local41 = Static114.aClass22Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ua(local15, local12) - local41.ua(local15, local12);
									@Pc(67) int local67 = local8.ua(local15 + 1, local12) - local41.ua(local15 + 1, local12);
									@Pc(85) int local85 = local8.ua(local15 + 1, local12 + 1) - local41.ua(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ua(local15, local12 + 1) - local41.ua(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBII)V")
	public static void method3032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static369.anInt6467 == 1) {
			Static420.aClass41Array14[Static118.anInt2007 / 100].method6090(Static211.anInt3613 - 8, Static161.anInt2908 + -8);
		}
		if (Static369.anInt6467 == 2) {
			Static420.aClass41Array14[Static118.anInt2007 / 100 + 4].method6090(Static211.anInt3613 - 8, Static161.anInt2908 + -8);
		}
		Static163.method2392();
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	public static void method3034() {
		try {
			if (Static452.anInt951 == 1) {
				@Pc(12) int local12 = Static386.aClass2_Sub8_Sub2_6.method3321();
				if (local12 > 0 && Static386.aClass2_Sub8_Sub2_6.method3324()) {
					local12 -= Static332.anInt5976;
					if (local12 < 0) {
						local12 = 0;
					}
					Static386.aClass2_Sub8_Sub2_6.method3308(local12);
					return;
				}
				Static386.aClass2_Sub8_Sub2_6.method3327();
				Static386.aClass2_Sub8_Sub2_6.method3314();
				if (Static378.aClass171_98 == null) {
					Static452.anInt951 = 0;
				} else {
					Static452.anInt951 = 2;
				}
				Static175.aClass69_1 = null;
				Static408.aClass2_Sub15_2 = null;
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static386.aClass2_Sub8_Sub2_6.method3327();
			Static378.aClass171_98 = null;
			Static452.anInt951 = 0;
			Static408.aClass2_Sub15_2 = null;
			Static175.aClass69_1 = null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB[II)V")
	public static void method3035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0--;
		@Pc(10) int local10 = arg1 - 1;
		@Pc(13) int local13 = local10 - 7;
		while (local13 > arg0) {
			@Pc(16) int local16 = arg0 + 1;
			arg2[local16] = arg3;
			@Pc(21) int local21 = local16 + 1;
			arg2[local21] = arg3;
			@Pc(26) int local26 = local21 + 1;
			arg2[local26] = arg3;
			@Pc(31) int local31 = local26 + 1;
			arg2[local31] = arg3;
			@Pc(36) int local36 = local31 + 1;
			arg2[local36] = arg3;
			@Pc(41) int local41 = local36 + 1;
			arg2[local41] = arg3;
			@Pc(46) int local46 = local41 + 1;
			arg2[local46] = arg3;
			arg0 = local46 + 1;
			arg2[arg0] = arg3;
		}
		while (arg0 < local10) {
			arg0++;
			arg2[arg0] = arg3;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public static void method3036() {
		@Pc(1) Class188 local1 = Static270.aClass188_40;
		synchronized (Static270.aClass188_40) {
			Static270.aClass188_40.method4154();
		}
		local1 = Static194.aClass188_32;
		synchronized (Static194.aClass188_32) {
			Static194.aClass188_32.method4154();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZ)Z")
	public static boolean method3037(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
