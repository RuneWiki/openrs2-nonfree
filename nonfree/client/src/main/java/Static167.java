import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mi", name = "X", descriptor = "I")
	public static int anInt3094;

	@OriginalMember(owner = "client!mi", name = "Z", descriptor = "Lclient!ak;")
	public static Class7 aClass7_137;

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString104 = "Choose Option";

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString105 = " is already on your ignore list.";

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "Z")
	public static boolean aBoolean234 = false;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "(I)V")
	public static void method2549() {
		@Pc(9) int local9 = Static10.aClass1_Sub2_Sub12_1.method4390(aString104);
		@Pc(11) int local11;
		@Pc(22) int local22;
		for (local11 = 0; local11 < Static29.anInt626; local11++) {
			local22 = Static10.aClass1_Sub2_Sub12_1.method4390(Static242.method3843(local11));
			if (local9 < local22) {
				local9 = local22;
			}
		}
		local11 = Static29.anInt626 * 15 + 21;
		local9 += 8;
		local22 = Static54.anInt1146 - local9 / 2;
		@Pc(51) int local51 = Static223.anInt4678;
		if (Static166.anInt3046 < local51 + local11) {
			local51 = Static166.anInt3046 - local11;
		}
		if (Static145.anInt2690 < local22 + local9) {
			local22 = Static145.anInt2690 - local9;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		if (local22 < 0) {
			local22 = 0;
		}
		if (Static270.anInt5407 == 1) {
			if (Static279.anInt5594 == Static54.anInt1146 && Static119.anInt4988 == Static223.anInt4678) {
				Static112.anInt2084 = local51;
				Static229.anInt4793 = (Static91.aBoolean128 ? 26 : 22) + Static29.anInt626 * 15;
				Static275.anInt5486 = local22;
				Static192.aBoolean414 = true;
				Static270.anInt5407 = 0;
				Static210.anInt4223 = local9;
			}
		} else if (Static54.anInt1146 == Static207.anInt4122 && Static223.anInt4678 == Static72.anInt1427) {
			Static270.anInt5407 = 0;
			Static192.aBoolean414 = true;
			Static112.anInt2084 = local51;
			Static275.anInt5486 = local22;
			Static210.anInt4223 = local9;
			Static229.anInt4793 = Static29.anInt626 * 15 + (Static91.aBoolean128 ? 26 : 22);
		} else {
			Static119.anInt4988 = Static72.anInt1427;
			Static270.anInt5407 = 1;
			Static279.anInt5594 = Static207.anInt4122;
		}
	}

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "(I)V")
	public static void method2550() {
		while (true) {
			@Pc(14) Class1_Sub26 local14 = (Class1_Sub26) Static2.aClass69_1.method1630();
			if (local14 == null) {
				return;
			}
			@Pc(32) Class6_Sub6 local32;
			@Pc(28) int local28;
			if (local14.anInt4736 >= 0) {
				local28 = local14.anInt4736 - 1;
				local32 = Static211.aClass6_Sub6_Sub1Array2[local28];
			} else {
				local28 = -local14.anInt4736 - 1;
				if (local28 == Static216.anInt4446) {
					local32 = Static28.aClass6_Sub6_Sub2_1;
				} else {
					local32 = Static77.aClass6_Sub6_Sub2Array1[local28];
				}
			}
			if (local32 != null) {
				@Pc(63) Class104 local63 = Static35.method636(local14.anInt4735);
				if (Static159.anInt2978 < 3) {
				}
				@Pc(83) int local83;
				@Pc(86) int local86;
				if (local14.anInt4741 == 1 || local14.anInt4741 == 3) {
					local83 = local63.anInt2817;
					local86 = local63.anInt2814;
				} else {
					local86 = local63.anInt2817;
					local83 = local63.anInt2814;
				}
				@Pc(101) int local101 = local14.anInt4737 + (local83 >> 1);
				@Pc(110) int local110 = local14.anInt4737 + (local83 + 1 >> 1);
				@Pc(117) int local117 = local14.anInt4738 + (local86 >> 1);
				@Pc(121) int[][] local121 = Static163.anIntArrayArrayArray16[Static159.anInt2978];
				@Pc(130) int local130 = (local86 + 1 >> 1) + local14.anInt4738;
				@Pc(159) int local159 = local121[local101][local117] + local121[local110][local117] + local121[local101][local130] + local121[local110][local130] >> 2;
				@Pc(161) Class6 local161 = null;
				@Pc(166) int local166 = Static271.anIntArray631[local14.anInt4734];
				if (local166 == 0) {
					@Pc(231) Class125 local231 = Static84.method1403(Static159.anInt2978, local14.anInt4737, local14.anInt4738);
					if (local231 != null) {
						local161 = local231.aClass6_8;
					}
				} else if (local166 == 1) {
					@Pc(218) Class63 local218 = Static120.method1888(Static159.anInt2978, local14.anInt4737, local14.anInt4738);
					if (local218 != null) {
						local161 = local218.aClass6_4;
					}
				} else if (local166 == 2) {
					@Pc(204) Class124 local204 = Static147.method2286(Static159.anInt2978, local14.anInt4737, local14.anInt4738);
					if (local204 != null) {
						local161 = local204.aClass6_6;
					}
				} else if (local166 == 3) {
					@Pc(189) Class167 local189 = Static146.method2285(Static159.anInt2978, local14.anInt4737, local14.anInt4738);
					if (local189 != null) {
						local161 = local189.aClass6_9;
					}
				}
				if (local161 != null) {
					Static39.method721(local166, local14.anInt4740 + 1, Static159.anInt2978, local14.anInt4738, 0, local14.anInt4737, 0, local14.anInt4739 + 1, -1);
					@Pc(263) int local263 = local14.anInt4731;
					local32.anInt4531 = local86 * 64 + local14.anInt4738 * 128;
					local32.anObject6 = local161;
					local32.anInt4534 = Static261.anInt5259 + local14.anInt4739;
					local32.anInt4532 = local159;
					local32.anInt4518 = local14.anInt4740 + Static261.anInt5259;
					@Pc(295) int local295 = local14.anInt4742;
					@Pc(298) int local298 = local14.anInt4729;
					local32.anInt4530 = local83 * 64 + local14.anInt4737 * 128;
					@Pc(314) int local314;
					if (local263 < local298) {
						local314 = local298;
						local298 = local263;
						local263 = local314;
					}
					@Pc(321) int local321 = local14.anInt4733;
					local32.anInt4547 = local263 + local14.anInt4737;
					local32.anInt4556 = local298 + local14.anInt4737;
					if (local321 < local295) {
						local314 = local295;
						local295 = local321;
						local321 = local314;
					}
					local32.anInt4504 = local14.anInt4738 + local295;
					local32.anInt4540 = local321 + local14.anInt4738;
				}
			}
		}
	}
}
