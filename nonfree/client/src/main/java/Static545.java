import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_164 = new Class322(77, 6);

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static26.aBoolean26 = true;
		Static519.aBoolean663 = Static277.aClass75_7.method6689() > 0;
		Static681.aBoolean769 = true;
		Static506.anInt8446 = arg1 >> Static594.anInt9440;
		Static676.anInt10368 = arg3 >> Static594.anInt9440;
		Static67.anInt814 = arg1;
		Static139.anInt2877 = arg3;
		Static495.anInt8362 = arg2;
		Static599.anInt5622 = Static506.anInt8446 - Static382.anInt6636;
		if (Static599.anInt5622 < 0) {
			Static473.anInt8080 = -Static599.anInt5622;
			Static599.anInt5622 = 0;
		} else {
			Static473.anInt8080 = 0;
		}
		Static115.anInt2266 = Static676.anInt10368 - Static382.anInt6636;
		if (Static115.anInt2266 < 0) {
			Static147.anInt3099 = -Static115.anInt2266;
			Static115.anInt2266 = 0;
		} else {
			Static147.anInt3099 = 0;
		}
		Static199.anInt4052 = Static506.anInt8446 + Static382.anInt6636;
		if (Static199.anInt4052 > Static230.anInt4470) {
			Static199.anInt4052 = Static230.anInt4470;
		}
		Static636.anInt9920 = Static676.anInt10368 + Static382.anInt6636;
		if (Static636.anInt9920 > Static63.anInt777) {
			Static636.anInt9920 = Static63.anInt777;
		}
		@Pc(79) boolean[][] local79 = Static488.aBooleanArrayArray4;
		@Pc(81) boolean[][] local81 = Static544.aBooleanArrayArray6;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (Static681.aBoolean769) {
			for (local85 = 0; local85 < Static382.anInt6636 + Static382.anInt6636 + 2; local85++) {
				local88 = 0;
				local90 = 0;
				for (@Pc(92) int local92 = 0; local92 < Static382.anInt6636 + Static382.anInt6636 + 2; local92++) {
					if (local92 > 1) {
						Static427.anIntArray471[local92 - 2] = local88;
					}
					local88 = local90;
					@Pc(112) int local112 = Static506.anInt8446 + local85 - Static382.anInt6636;
					@Pc(118) int local118 = Static676.anInt10368 + local92 - Static382.anInt6636;
					@Pc(138) int local138;
					if (local112 >= 0 && local118 >= 0 && local112 < Static230.anInt4470 && local118 < Static63.anInt777) {
						local138 = local112 << Static594.anInt9440;
						@Pc(142) int local142 = local118 << Static594.anInt9440;
						@Pc(159) int local159 = Static524.aClass96Array2[Static524.aClass96Array2.length - 1].method8080(local112, local118) - (0x3E8 << Static594.anInt9440 - 7);
						@Pc(188) int local188 = (Static216.aClass96Array1 == null ? Static524.aClass96Array2[0].method8080(local112, local118) + Static234.anInt4537 : Static216.aClass96Array1[0].method8080(local112, local118) + Static234.anInt4537) + (0x3E8 << Static594.anInt9440 - 7);
						local90 = arg15 >= 0 ? Static277.aClass75_7.r(local138, local159, local142, local138, local188, local142, arg15) : Static277.aClass75_7.JA(local138, local159, local142, local138, local188, local142);
						Static544.aBooleanArrayArray6[local85][local92] = local90 == 0;
					} else {
						local90 = -1;
						Static544.aBooleanArrayArray6[local85][local92] = false;
					}
					if (local85 > 0 && local92 > 0) {
						local138 = Static427.anIntArray471[local92 - 1] & Static427.anIntArray471[local92] & local88 & local90;
						Static488.aBooleanArrayArray4[local85 - 1][local92 - 1] = local138 == 0;
					}
				}
				Static427.anIntArray471[Static382.anInt6636 + Static382.anInt6636] = local88;
				Static427.anIntArray471[Static382.anInt6636 + Static382.anInt6636 + 1] = local90;
			}
			if (arg15 >= 0) {
				Static26.aBoolean26 = false;
			} else {
				Static275.anIntArray278 = arg5;
				Static2.anIntArray2 = arg6;
				Static150.anIntArray170 = arg7;
				Static191.anIntArray207 = arg8;
				Static37.anIntArray36 = arg9;
				Static618.method8509(Static277.aClass75_7, arg10);
			}
		} else {
			if (Static230.aBooleanArrayArray1 == null) {
				Static230.aBooleanArrayArray1 = new boolean[Static230.anInt4470 + Static230.anInt4470 + 1][Static63.anInt777 + Static230.anInt4470 + 1];
			}
			for (local85 = 0; local85 < Static230.aBooleanArrayArray1.length; local85++) {
				for (local88 = 0; local88 < Static230.aBooleanArrayArray1[0].length; local88++) {
					Static230.aBooleanArrayArray1[local85][local88] = true;
				}
			}
			Static544.aBooleanArrayArray6 = Static230.aBooleanArrayArray1;
			Static488.aBooleanArrayArray4 = Static230.aBooleanArrayArray1;
			Static599.anInt5622 = 0;
			Static115.anInt2266 = 0;
			Static199.anInt4052 = Static230.anInt4470;
			Static636.anInt9920 = Static63.anInt777;
			Static26.aBoolean26 = false;
		}
		Static123.method2317(Static277.aClass75_7);
		if (!Static667.aClass284_3.aBoolean603) {
			@Pc(387) Class385 local387 = Static667.aClass284_3.aClass385_7;
			for (@Pc(392) Class60_Sub9 local392 = (Class60_Sub9) local387.method8778(); local392 != null; local392 = (Class60_Sub9) local387.method8773()) {
				local392.method8914();
				Static288.method4731(local392);
			}
		}
		if (Static519.aBoolean663) {
			for (local85 = 0; local85 < Static259.anInt4979; local85++) {
				Static483.aClass256Array1[local85].method6254(arg0, arg14);
			}
		}
		if (Static398.aBoolean515) {
			Static558.anIntArray591 = Static277.aClass75_7.Y();
			Static277.aClass75_7.K(Static295.anIntArray291);
			local85 = (Static295.anIntArray291[2] - Static295.anIntArray291[0]) / Static243.anInt4677;
			for (local88 = 0; local88 < Static243.anInt4677 - 1; local88++) {
				Static7.anIntArray6[local88] = local85 * (local88 + 1) + Static394.anIntArray409[local88];
			}
			for (local90 = 0; local90 < Static630.aClass106Array2.length; local90++) {
				Static630.aClass106Array2[local90].method2905();
			}
		}
		if (Static104.aClass243ArrayArrayArray1 != null) {
			if (Static398.aBoolean515) {
				Static343.method5260(0);
			}
			Static79.method1089(true);
			Static277.aClass75_7.ra(-1, 1583160, 40, 127);
			Static234.method4145(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static398.aBoolean515) {
				Static294.method4782();
			}
			Static277.aClass75_7.pa();
			Static79.method1089(false);
		}
		Static234.method4145(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static398.aBoolean515) {
			for (local85 = 0; local85 < Static66.anInt802; local85++) {
				Static225.aBooleanArrayArrayArray2[local85] = Static195.aBooleanArrayArrayArray1[local85];
			}
			Static343.method5260(0);
			for (local88 = 0; local88 < Static630.aClass106Array2.length; local88++) {
				Static630.aClass106Array2[local88].method2905();
			}
		}
		if (Static398.aBoolean515) {
			Static294.method4782();
			for (local85 = 0; local85 < Static66.anInt802; local85++) {
				Static195.aBooleanArrayArrayArray1[local85] = Static225.aBooleanArrayArrayArray2[local85];
			}
			if (Static261.anInt5003 == 2) {
				@Pc(601) int local601;
				if (Static606.aLongArray18[0] < Static606.aLongArray18[1]) {
					if (Static7.anIntArray6[0] + Static394.anIntArray409[0] > Static295.anIntArray291[0]) {
						local601 = Static394.anIntArray409[0]++;
					}
				} else if (Static606.aLongArray18[0] > Static606.aLongArray18[1] && Static7.anIntArray6[0] + Static394.anIntArray409[0] < Static295.anIntArray291[2]) {
					local601 = Static394.anIntArray409[0]--;
				}
			}
		}
		if (!Static681.aBoolean769) {
			Static488.aBooleanArrayArray4 = local79;
			Static544.aBooleanArrayArray6 = local81;
		}
		Static360.method5484();
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IZ)V")
	public static void method7723(@OriginalArg(0) int arg0) {
		Static651.aLong340 = 1000000000L / (long) arg0;
	}
}
