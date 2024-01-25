import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!so", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!so", name = "u", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method5069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(13) int local13 = arg3 + arg6;
		@Pc(17) int local17 = arg5 - arg3;
		for (@Pc(19) int local19 = arg6; local19 < local13; local19++) {
			Static59.method1261(Static163.anIntArrayArray35[local19], arg0, arg4, arg2);
		}
		for (@Pc(39) int local39 = arg5; local39 > local17; local39--) {
			Static59.method1261(Static163.anIntArrayArray35[local39], arg0, arg4, arg2);
		}
		@Pc(57) int local57 = arg3 + arg4;
		@Pc(62) int local62 = arg0 - arg3;
		for (@Pc(64) int local64 = local13; local64 <= local17; local64++) {
			@Pc(70) int[] local70 = Static163.anIntArrayArray35[local64];
			Static59.method1261(local70, local57, arg4, arg2);
			Static59.method1261(local70, local62, local57, arg1);
			Static59.method1261(local70, arg0, local62, arg2);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)V")
	public static void method5070(@OriginalArg(1) int arg0) {
		Static75.anInt1692 = arg0;
		Static64.aClass134_11.method3272();
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(Z)V")
	public static void method5071() {
		Static206.aClass1_Sub5_Sub1_2.method312();
		@Pc(13) int local13 = Static206.aClass1_Sub5_Sub1_2.method316(8);
		@Pc(22) int local22;
		if (local13 < Static5.anInt163) {
			for (local22 = local13; local22 < Static5.anInt163; local22++) {
				Static255.anIntArray391[Static178.anInt3270++] = Static331.anIntArray648[local22];
			}
		}
		if (local13 > Static5.anInt163) {
			throw new RuntimeException("gnpov1");
		}
		Static5.anInt163 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(60) int local60 = Static331.anIntArray648[local22];
			@Pc(64) Class31_Sub2_Sub1_Sub2 local64 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static206.aClass1_Sub5_Sub1_2.method316(1);
			if (local69 == 0) {
				Static331.anIntArray648[Static5.anInt163++] = local60;
				local64.anInt7302 = Static378.anInt4244;
			} else {
				@Pc(89) int local89 = Static206.aClass1_Sub5_Sub1_2.method316(2);
				if (local89 == 0) {
					Static331.anIntArray648[Static5.anInt163++] = local60;
					local64.anInt7302 = Static378.anInt4244;
					Static237.anIntArray546[Static372.anInt6091++] = local60;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local89 == 1) {
						Static331.anIntArray648[Static5.anInt163++] = local60;
						local64.anInt7302 = Static378.anInt4244;
						local138 = Static206.aClass1_Sub5_Sub1_2.method316(3);
						local64.method6003(local138, 1);
						local148 = Static206.aClass1_Sub5_Sub1_2.method316(1);
						if (local148 == 1) {
							Static237.anIntArray546[Static372.anInt6091++] = local60;
						}
					} else if (local89 == 2) {
						Static331.anIntArray648[Static5.anInt163++] = local60;
						local64.anInt7302 = Static378.anInt4244;
						if (Static206.aClass1_Sub5_Sub1_2.method316(1) == 1) {
							local138 = Static206.aClass1_Sub5_Sub1_2.method316(3);
							local64.method6003(local138, 2);
							local148 = Static206.aClass1_Sub5_Sub1_2.method316(3);
							local64.method6003(local148, 2);
						} else {
							local138 = Static206.aClass1_Sub5_Sub1_2.method316(3);
							local64.method6003(local138, 0);
						}
						local138 = Static206.aClass1_Sub5_Sub1_2.method316(1);
						if (local138 == 1) {
							Static237.anIntArray546[Static372.anInt6091++] = local60;
						}
					} else if (local89 == 3) {
						Static255.anIntArray391[Static178.anInt3270++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(I)V")
	public static void method5072() {
		Static80.aClass134_14.method3267();
	}
}
