import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Lclient!ad;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V")
	public static void method1275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = 0;
		Static188.method2835(arg1);
		@Pc(12) int local12 = arg1;
		@Pc(16) int local16 = arg1 - arg5;
		@Pc(19) int local19 = -arg1;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(27) int local27 = -local16;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = local16;
		@Pc(40) int[] local40 = Static151.anIntArrayArray26[arg2];
		@Pc(42) int local42 = -1;
		@Pc(47) int local47 = arg3 - local16;
		@Pc(52) int local52 = arg3 + local16;
		Static288.method4405(arg0, local47, arg3 - arg1, local40);
		Static288.method4405(arg4, local52, local47, local40);
		Static288.method4405(arg0, arg1 + arg3, local52, local40);
		while (local12 > local7) {
			local29 += 2;
			local27 += local29;
			if (local27 >= 0 && local31 >= 1) {
				Static295.anIntArray690[local31] = local7;
				local31--;
				local27 -= local31 << 1;
			}
			local7++;
			local42 += 2;
			local19 += local42;
			@Pc(129) int[] local129;
			@Pc(141) int[] local141;
			@Pc(145) int local145;
			@Pc(134) int local134;
			@Pc(185) int local185;
			@Pc(180) int local180;
			@Pc(195) int local195;
			if (local19 >= 0) {
				local12--;
				if (local16 <= local12) {
					local129 = Static151.anIntArrayArray26[arg2 + local12];
					local134 = arg3 - local7;
					local141 = Static151.anIntArrayArray26[arg2 - local12];
					local145 = local7 + arg3;
					Static288.method4405(arg0, local145, local134, local129);
					Static288.method4405(arg0, local145, local134, local141);
				} else {
					local129 = Static151.anIntArrayArray26[local12 + arg2];
					local141 = Static151.anIntArrayArray26[arg2 - local12];
					local145 = Static295.anIntArray690[local12];
					local180 = local145 + arg3;
					local185 = arg3 - local7;
					local134 = arg3 + local7;
					local195 = arg3 - local145;
					Static288.method4405(arg0, local195, local185, local129);
					Static288.method4405(arg4, local180, local195, local129);
					Static288.method4405(arg0, local134, local180, local129);
					Static288.method4405(arg0, local195, local185, local141);
					Static288.method4405(arg4, local180, local195, local141);
					Static288.method4405(arg0, local134, local180, local141);
				}
				local19 -= local12 << 1;
			}
			local141 = Static151.anIntArrayArray26[arg2 - local7];
			local129 = Static151.anIntArrayArray26[local7 + arg2];
			local145 = local12 + arg3;
			local134 = arg3 - local12;
			if (local16 <= local7) {
				Static288.method4405(arg0, local145, local134, local129);
				Static288.method4405(arg0, local145, local134, local141);
			} else {
				local185 = local31 >= local7 ? local31 : Static295.anIntArray690[local7];
				local180 = arg3 + local185;
				local195 = arg3 - local185;
				Static288.method4405(arg0, local195, local134, local129);
				Static288.method4405(arg4, local180, local195, local129);
				Static288.method4405(arg0, local145, local180, local129);
				Static288.method4405(arg0, local195, local134, local141);
				Static288.method4405(arg4, local180, local195, local141);
				Static288.method4405(arg0, local145, local180, local141);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method1276() {
		for (@Pc(14) Class1_Sub2_Sub6 local14 = (Class1_Sub2_Sub6) Static70.aClass69_6.method1636(); local14 != null; local14 = (Class1_Sub2_Sub6) Static70.aClass69_6.method1631()) {
			@Pc(24) Class6_Sub1 local24 = local14.aClass6_Sub1_1;
			if (Static159.anInt2978 != local24.anInt319 || local24.anInt317 < Static261.anInt5259) {
				local14.method4534();
			} else if (local24.anInt297 <= Static261.anInt5259) {
				if (local24.anInt320 > 0) {
					@Pc(47) Class6_Sub6_Sub1 local47 = Static211.aClass6_Sub6_Sub1Array2[local24.anInt320 - 1];
					if (local47 != null && local47.anInt4562 >= 0 && local47.anInt4562 < 13312 && local47.anInt4569 >= 0 && local47.anInt4569 < 13312) {
						local24.method231(Static124.method1919(local24.anInt319, local47.anInt4562, local47.anInt4569) - local24.anInt312, Static261.anInt5259, local47.anInt4562, local47.anInt4569);
					}
				}
				if (local24.anInt320 < 0) {
					@Pc(99) int local99 = -local24.anInt320 - 1;
					@Pc(106) Class6_Sub6_Sub2 local106;
					if (local99 == Static216.anInt4446) {
						local106 = Static28.aClass6_Sub6_Sub2_1;
					} else {
						local106 = Static77.aClass6_Sub6_Sub2Array1[local99];
					}
					if (local106 != null && local106.anInt4562 >= 0 && local106.anInt4562 < 13312 && local106.anInt4569 >= 0 && local106.anInt4569 < 13312) {
						local24.method231(Static124.method1919(local24.anInt319, local106.anInt4562, local106.anInt4569) - local24.anInt312, Static261.anInt5259, local106.anInt4562, local106.anInt4569);
					}
				}
				local24.method233(Static47.anInt5866);
				Static279.method4292(Static159.anInt2978, (int) local24.aDouble8, (int) local24.aDouble2, (int) local24.aDouble7, 60, local24, local24.anInt300, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ak;I)V")
	public static void method1278(@OriginalArg(0) Class7 arg0) {
		Static122.aClass7_114 = arg0;
	}
}
