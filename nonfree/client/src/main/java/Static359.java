import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt6064;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Z")
	public static boolean aBoolean442 = false;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "F")
	public static float aFloat82 = 1.0F;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_85 = new Class134(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "[I")
	public static final int[] anIntArray523 = new int[4];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ws;B)Ljava/lang/String;")
	public static String method4734(@OriginalArg(0) Class2_Sub46 arg0) {
		return arg0.aString206 == null || arg0.aString206.length() <= 0 ? arg0.aString207 : arg0.aString207 + Static154.aClass134_52.method2720(Static331.anInt5597) + arg0.aString206;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZII)V")
	public static void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (!arg2 && Static283.anInt4621 == arg1 && Static429.anInt6931 == arg3 && (Static61.anInt1129 == Static280.anInt4592 || Static2.aClass148_Sub1_1.method3047(Static288.anInt4743))) {
			return;
		}
		Static429.anInt6931 = arg3;
		Static283.anInt4621 = arg1;
		Static280.anInt4592 = Static61.anInt1129;
		if (Static2.aClass148_Sub1_1.method3047(Static288.anInt4743)) {
			Static280.anInt4592 = 0;
		}
		Static37.method5022(arg0);
		Static3.method33(Static244.aClass134_61.method2720(Static331.anInt5597), Static43.aClass92_1, true);
		@Pc(56) int local56 = Static275.anInt4506;
		Static275.anInt4506 = (Static283.anInt4621 - (Static166.anInt2852 >> 4)) * 8;
		@Pc(67) int local67 = Static209.anInt3497;
		Static209.anInt3497 = (Static429.anInt6931 - (Static426.anInt6923 >> 4)) * 8;
		Static158.aClass2_Sub5_Sub15_4 = Static282.method2795(Static283.anInt4621 * 8, Static429.anInt6931 * 8);
		Static171.aClass67_1 = null;
		@Pc(90) int local90 = Static275.anInt4506 - local56;
		@Pc(95) int local95 = Static209.anInt3497 - local67;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(175) int local175;
		@Pc(272) int local272;
		if (arg0 == 10) {
			for (local272 = 0; local272 < Static384.anInt6329; local272++) {
				@Pc(278) Class2_Sub28 local278 = Static332.aClass2_Sub28Array1[local272];
				if (local278 != null) {
					@Pc(283) Class3_Sub4_Sub1_Sub1 local283 = local278.aClass3_Sub4_Sub1_Sub1_1;
					for (local116 = 0; local116 < 10; local116++) {
						local283.anIntArray425[local116] -= local90;
						local283.anIntArray424[local116] -= local95;
					}
					local283.anInt6833 -= local90 * 128;
					local283.anInt6835 -= local95 * 128;
				}
			}
		} else {
			Static351.anInt5969 = 0;
			@Pc(102) boolean local102 = false;
			@Pc(108) int local108 = Static166.anInt2852 * 128 - 128;
			local114 = (Static426.anInt6923 - 1) * 128;
			for (local116 = 0; local116 < Static384.anInt6329; local116++) {
				@Pc(122) Class2_Sub28 local122 = Static332.aClass2_Sub28Array1[local116];
				if (local122 != null) {
					@Pc(127) Class3_Sub4_Sub1_Sub1 local127 = local122.aClass3_Sub4_Sub1_Sub1_1;
					local127.anInt6833 -= local90 * 128;
					local127.anInt6835 -= local95 * 128;
					if (local127.anInt6833 >= 0 && local108 >= local127.anInt6833 && local127.anInt6835 >= 0 && local127.anInt6835 <= local114) {
						@Pc(173) boolean local173 = true;
						for (local175 = 0; local175 < 10; local175++) {
							local127.anIntArray425[local175] -= local90;
							local127.anIntArray424[local175] -= local95;
							if (local127.anIntArray425[local175] < 0 || Static166.anInt2852 <= local127.anIntArray425[local175] || local127.anIntArray424[local175] < 0 || local127.anIntArray424[local175] >= Static426.anInt6923) {
								local173 = false;
							}
						}
						if (local173) {
							Static40.anIntArray84[Static351.anInt5969++] = local127.anInt4915;
						} else {
							local127.method2629(null);
							local102 = true;
							local122.method5703();
						}
					} else {
						local127.method2629(null);
						local122.method5703();
						local102 = true;
					}
				}
			}
			if (local102) {
				Static384.anInt6329 = Static49.aClass72_11.method1652();
				Static49.aClass72_11.method1656(Static332.aClass2_Sub28Array1);
			}
		}
		for (local272 = 0; local272 < 2048; local272++) {
			@Pc(339) Class3_Sub4_Sub1_Sub2 local339 = Static152.aClass3_Sub4_Sub1_Sub2Array1[local272];
			if (local339 != null) {
				for (local114 = 0; local114 < 10; local114++) {
					local339.anIntArray425[local114] -= local90;
					local339.anIntArray424[local114] -= local95;
				}
				local339.anInt6835 -= local95 * 128;
				local339.anInt6833 -= local90 * 128;
			}
		}
		@Pc(391) Class185[] local391 = Static186.aClass185Array5;
		for (local114 = 0; local114 < local391.length; local114++) {
			@Pc(399) Class185 local399 = local391[local114];
			if (local399 != null) {
				local399.anInt4813 -= local90 * 128;
				local399.anInt4816 -= local95 * 128;
			}
		}
		for (@Pc(431) Class2_Sub8 local431 = (Class2_Sub8) Static225.aClass156_28.method3155(); local431 != null; local431 = (Class2_Sub8) Static225.aClass156_28.method3150()) {
			local431.anInt827 -= local90;
			local431.anInt826 -= local95;
			if (Static276.anInt4560 != 4 && (local431.anInt827 < 0 || local431.anInt826 < 0 || Static166.anInt2852 <= local431.anInt827 || local431.anInt826 >= Static426.anInt6923)) {
				local431.method5703();
			}
		}
		if (Static276.anInt4560 != 4) {
			for (@Pc(494) Class2_Sub12 local494 = (Class2_Sub12) Static201.aClass72_21.method1655(); local494 != null; local494 = (Class2_Sub12) Static201.aClass72_21.method1649()) {
				@Pc(502) int local502 = (int) (local494.aLong225 & 0x3FFFL);
				@Pc(507) int local507 = local502 - Static275.anInt4506;
				local175 = (int) (local494.aLong225 >> 14 & 0x3FFFL);
				@Pc(520) int local520 = local175 - Static209.anInt3497;
				if (local507 < 0 || local520 < 0 || local507 >= Static166.anInt2852 || local520 >= Static426.anInt6923) {
					local494.method5703();
				}
			}
		}
		if (Static233.anInt6980 != 0) {
			Static333.anInt5631 -= local95;
			Static233.anInt6980 -= local90;
		}
		Static336.method4488();
		if (arg0 != 10) {
			Static330.anInt5575 -= local95;
			Static247.anInt3992 -= local90;
			Static143.anInt2544 -= local95 * 128;
			Static434.anInt7014 -= local95;
			Static174.anInt3028 -= local90 * 128;
			Static338.anInt5763 -= local90;
			if (Math.abs(local90) > Static166.anInt2852 || Math.abs(local95) > Static426.anInt6923) {
				Static449.method5641();
			}
		} else if (Static414.anInt6776 == 4) {
			Static294.anInt1008 -= local90 * 128;
			Static153.anInt2665 -= local95 * 128;
			Static136.anInt2424 -= local95 * 128;
			Static133.anInt2393 -= local90 * 128;
		} else {
			Static414.anInt6776 = 1;
		}
		Static331.method4434();
		Static12.method161();
		Static186.aClass156_56.method3161();
		Static330.aClass156_48.method3161();
		Static286.aClass93_4.method2073();
		Static114.method1739();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!mb;IIIII)V")
	public static void method4737(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt607 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub29Array2[local4] != null) {
				arg0.anInt607++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt607; local22++) {
			@Pc(31) long local31 = Static174.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class250 local41;
			while (local31 != 0L) {
				local41 = Static210.aClass250Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub29_2 == arg0.aClass2_Sub29Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static174.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static210.aClass250Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass2_Sub29_2 == arg0.aClass2_Sub29Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt607 - 1; local93++) {
				arg0.aClass2_Sub29Array2[local93] = arg0.aClass2_Sub29Array2[local93 + 1];
			}
			arg0.anInt607--;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II[BIBI)V")
	public static void method4738(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		arg2 += arg0;
		@Pc(32) int local32 = arg3 - arg0 >> 2;
		while (true) {
			local32--;
			if (local32 < 0) {
				local32 = arg3 - arg0 & 0x3;
				while (true) {
					local32--;
					if (local32 < 0) {
						return;
					}
					arg1[arg2++] = 1;
				}
			}
			@Pc(37) int local37 = arg2 + 1;
			arg1[arg2] = 1;
			@Pc(42) int local42 = local37 + 1;
			arg1[local37] = 1;
			@Pc(47) int local47 = local42 + 1;
			arg1[local42] = 1;
			arg2 = local47 + 1;
			arg1[local47] = 1;
		}
	}
}
