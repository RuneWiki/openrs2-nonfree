import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_14 = new Class222(6, 0, 4, 2);

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "[[S")
	private static final short[][] aShortArrayArray27 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "[[S")
	private static final short[][] aShortArrayArray28 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[[S")
	private static final short[][] aShortArrayArray29 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray8 = new short[][][] { aShortArrayArray27, aShortArrayArray29, aShortArrayArray28 };

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
	public static final int[] anIntArray576 = new int[8];

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	public static int method7187() {
		if (Static17.anInt243 == 0) {
			Static266.aClass170_2.method3740(new Class307("jaclib"));
			if (Static266.aClass170_2.method3738().method7205() != 100) {
				return 1;
			}
			if (!((Class307) Static266.aClass170_2.method3738()).method6905()) {
				Static78.aClient1.method1046();
			}
			Static17.anInt243 = 1;
		}
		@Pc(228) int local228;
		@Pc(247) int local247;
		@Pc(267) int local267;
		if (Static17.anInt243 == 1) {
			Static40.aClass170Array1 = Static266.method3737();
			Static266.aClass170_1.method3740(new Class274(Static92.aClass380_30));
			Static266.aClass170_3.method3740(new Class307("jaggl"));
			Static266.aClass170_4.method3740(new Class307("jagdx"));
			Static266.aClass170_5.method3740(new Class307("jagmisc"));
			Static266.aClass170_6.method3740(new Class307("sw3d"));
			Static266.aClass170_7.method3740(new Class307("hw3d"));
			Static266.aClass170_8.method3740(new Class307("jagtheora"));
			Static266.aClass170_9.method3740(new Class274(Static525.aClass380_94));
			Static266.aClass170_10.method3740(new Class274(Static535.aClass380_120));
			Static266.aClass170_11.method3740(new Class274(Static576.aClass380_128));
			Static266.aClass170_12.method3740(new Class274(Static247.aClass380_64));
			Static266.aClass170_13.method3740(new Class274(Static39.aClass380_14));
			Static266.aClass170_14.method3740(new Class274(Static531.aClass380_119));
			Static266.aClass170_15.method3740(new Class274(Static194.aClass380_126));
			Static266.aClass170_16.method3740(new Class274(Static3.aClass380_135));
			Static266.aClass170_17.method3740(new Class274(Static438.aClass380_102));
			Static266.aClass170_18.method3740(new Class274(Static488.aClass380_110));
			Static266.aClass170_19.method3740(new Class274(Static607.aClass380_131));
			Static266.aClass170_20.method3740(new Class274(Static57.aClass380_15));
			Static266.aClass170_21.method3740(new Class274(Static125.aClass380_37));
			Static266.aClass170_22.method3740(new Class274(Static469.aClass380_10));
			Static266.aClass170_23.method3740(new Class316(Static262.aClass380_85, "huffman"));
			Static266.aClass170_24.method3740(new Class274(Static82.aClass380_25));
			Static266.aClass170_25.method3740(new Class274(Static210.aClass380_53));
			Static266.aClass170_26.method3740(new Class274(Static141.aClass380_39));
			Static266.aClass170_27.method3740(new Class78(Static416.aClass380_99, "details"));
			for (local228 = 0; local228 < Static40.aClass170Array1.length; local228++) {
				if (Static40.aClass170Array1[local228].method3738() == null) {
					throw new RuntimeException();
				}
			}
			local247 = 0;
			@Pc(249) Class170[] local249 = Static40.aClass170Array1;
			for (@Pc(251) int local251 = 0; local251 < local249.length; local251++) {
				@Pc(257) Class170 local257 = local249[local251];
				@Pc(261) int local261 = local257.method3739();
				local267 = local257.method3738().method7205();
				local247 += local267 * local261 / 100;
			}
			Static636.anInt10264 = local247;
			Static17.anInt243 = 2;
		}
		if (Static40.aClass170Array1 == null) {
			return 100;
		}
		local228 = 0;
		local247 = 0;
		@Pc(298) boolean local298 = true;
		@Pc(308) Class170[] local308 = Static40.aClass170Array1;
		for (@Pc(310) int local310 = 0; local310 < local308.length; local310++) {
			@Pc(316) Class170 local316 = local308[local310];
			@Pc(320) int local320 = local316.method3739();
			@Pc(326) int local326 = local316.method3738().method7205();
			local247 += local320 * local326 / 100;
			local228 += local320;
			if (local326 < 100) {
				local298 = false;
			}
		}
		if (local298) {
			if (!((Class307) Static266.aClass170_5.method3738()).method6905()) {
				Static78.aClient1.method1061();
			}
			if (!((Class307) Static266.aClass170_8.method3738()).method6905()) {
				Static629.aBoolean741 = Static78.aClient1.method1048();
			}
			Static40.aClass170Array1 = null;
		}
		local228 -= Static636.anInt10264;
		local247 -= Static636.anInt10264;
		local267 = local228 > 0 ? local247 * 100 / local228 : 100;
		if (!local298 && local267 > 99) {
			local267 = 99;
		}
		return local267;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!am;[IBI)V")
	public static void method7188(@OriginalArg(0) Class13_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg0.anIntArray300 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg0.anIntArray300.length; local8++) {
				if (arg1[local8] != arg0.anIntArray300[local8]) {
					local6 = false;
					break;
				}
			}
			if (local6 && arg0.anInt4559 != -1) {
				@Pc(45) Class81 local45 = Static540.aClass173_2.method3791(arg0.anInt4559);
				@Pc(48) int local48 = local45.anInt2141;
				if (local48 == 1) {
					arg0.anInt4564 = 0;
					arg0.anInt4634 = 1;
					arg0.anInt4591 = 0;
					arg0.anInt4622 = arg2;
					arg0.anInt4567 = 0;
					if (!arg0.aBoolean317) {
						Static589.method8022(arg0.anInt4591, local45, arg0);
					}
				}
				if (local48 == 2) {
					arg0.anInt4567 = 0;
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg1.length; local8++) {
			if (arg1[local8] != -1) {
				local6 = false;
			}
			if (arg0.anIntArray300 == null || arg0.anIntArray300[local8] == -1 || Static540.aClass173_2.method3791(arg1[local8]).anInt2151 >= Static540.aClass173_2.method3791(arg0.anIntArray300[local8]).anInt2151) {
				arg0.anInt4637 = arg0.anInt4639;
				arg0.anIntArray300 = arg1;
				arg0.anInt4622 = arg2;
			}
		}
		if (local6) {
			arg0.anInt4637 = arg0.anInt4639;
			arg0.anIntArray300 = arg1;
			arg0.anInt4622 = arg2;
		}
	}
}
