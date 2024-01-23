import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bm", name = "R", descriptor = "Lclient!rj;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
	public static int anInt443 = -1;

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
	public static int anInt449 = 0;

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString31 = "Loading defaults - ";

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
	public static int anInt452 = 0;

	@OriginalMember(owner = "client!bm", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString32 = "flash3:";

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method434(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static113.method2021(Static124.method4681(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V")
	public static void method436(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub2_Sub11 local14 = Static5.method35(arg0, 3);
		local14.method2873();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBZI)I")
	public static int method437(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class1_Sub7 local14 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local14 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < local14.anIntArray23.length; local28++) {
			if (local14.anIntArray23[local28] >= 0 && local14.anIntArray23[local28] < Static131.anInt2608) {
				@Pc(54) Class102 local54 = Static49.method909(local14.anIntArray23[local28]);
				if (local54.aClass142_17 != null) {
					@Pc(66) Class1_Sub1 local66 = (Class1_Sub1) local54.aClass142_17.method3543((long) arg2);
					if (local66 != null) {
						if (arg1) {
							local21 += local66.anInt12 * local14.anIntArray22[local28];
						} else {
							local21 += local66.anInt12;
						}
					}
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!sg;)V")
	public static void method438(@OriginalArg(0) Class161 arg0) {
		for (@Pc(2) int local2 = arg0.anInt4641; local2 <= arg0.anInt4639; local2++) {
			for (@Pc(9) int local9 = arg0.anInt4636; local9 <= arg0.anInt4637; local9++) {
				@Pc(22) Class1_Sub33 local22 = Static105.aClass1_Sub33ArrayArrayArray2[arg0.anInt4646][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt5733; local26++) {
						if (local22.aClass161Array3[local26] == arg0) {
							local22.anInt5733--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt5733; local44++) {
								local22.aClass161Array3[local44] = local22.aClass161Array3[local44 + 1];
								local22.anIntArray508[local44] = local22.anIntArray508[local44 + 1];
							}
							local22.aClass161Array3[local22.anInt5733] = null;
							break;
						}
					}
					local22.anInt5735 = 0;
					for (local26 = 0; local26 < local22.anInt5733; local26++) {
						local22.anInt5735 |= local22.anIntArray508[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIII)V")
	public static void method439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg4 - arg2;
		@Pc(18) int local18 = arg1 - arg0;
		if (local18 == 0) {
			if (local13 != 0) {
				Static309.method4709(arg0, arg3, arg4, arg2);
			}
		} else if (local13 == 0) {
			Static100.method1813(arg1, arg3, arg0, arg2);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local18 < 0) {
				local18 = -local18;
			}
			@Pc(65) boolean local65 = local13 > local18;
			@Pc(70) int local70;
			@Pc(76) int local76;
			if (local65) {
				local70 = arg0;
				arg0 = arg2;
				arg2 = local70;
				local76 = arg1;
				arg1 = arg4;
				arg4 = local76;
			}
			if (arg0 > arg1) {
				local76 = arg2;
				local70 = arg0;
				arg0 = arg1;
				arg1 = local70;
				arg2 = arg4;
				arg4 = local76;
			}
			local70 = arg2;
			@Pc(101) int local101 = arg4 - arg2;
			if (local101 < 0) {
				local101 = -local101;
			}
			local76 = arg1 - arg0;
			@Pc(116) int local116 = -(local76 >> 1);
			@Pc(123) int local123 = arg4 > arg2 ? 1 : -1;
			@Pc(127) int local127;
			if (local65) {
				for (local127 = arg0; local127 <= arg1; local127++) {
					local116 += local101;
					Static183.anIntArrayArray26[local127][local70] = arg3;
					if (local116 > 0) {
						local70 += local123;
						local116 -= local76;
					}
				}
			} else {
				for (local127 = arg0; local127 <= arg1; local127++) {
					Static183.anIntArrayArray26[local70][local127] = arg3;
					local116 += local101;
					if (local116 > 0) {
						local70 += local123;
						local116 -= local76;
					}
				}
			}
		}
	}
}
