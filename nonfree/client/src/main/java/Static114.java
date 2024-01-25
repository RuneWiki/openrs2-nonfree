import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Z")
	public static boolean aBoolean579;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt6585 = 0;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	public static int anInt6589 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5709(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + Static241.method4169(arg0.charAt(local17)) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	public static void method5710(@OriginalArg(1) boolean arg0) {
		Static108.aBoolean206 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(69) int local69;
		@Pc(203) int local203;
		@Pc(207) int local207;
		if (!Static108.aBoolean206) {
			local17 = Static269.aClass2_Sub10_Sub1_3.method4413();
			local21 = Static269.aClass2_Sub10_Sub1_3.method4432();
			local25 = (Static71.anInt1574 - Static269.aClass2_Sub10_Sub1_3.anInt4807) / 16;
			Static177.anIntArrayArray107 = new int[local25][4];
			for (local29 = 0; local29 < local25; local29++) {
				for (local33 = 0; local33 < 4; local33++) {
					Static177.anIntArrayArray107[local29][local33] = Static269.aClass2_Sub10_Sub1_3.method4444();
				}
			}
			local33 = Static269.aClass2_Sub10_Sub1_3.method4414();
			@Pc(437) int local437 = Static269.aClass2_Sub10_Sub1_3.method4422();
			@Pc(448) boolean local448 = Static269.aClass2_Sub10_Sub1_3.method4414() == 1;
			local54 = Static269.aClass2_Sub10_Sub1_3.method4432();
			local58 = Static269.aClass2_Sub10_Sub1_3.method4437();
			Static49.method1191(local437);
			Static251.anIntArray377 = new int[local25];
			Static304.anIntArray452 = new int[local25];
			Static201.anIntArray310 = new int[local25];
			Static121.aByteArrayArray8 = null;
			Static50.anIntArray96 = new int[local25];
			Static341.aByteArrayArray22 = new byte[local25][];
			Static279.anIntArray415 = new int[local25];
			Static266.anIntArray398 = null;
			Static226.aByteArrayArray12 = new byte[local25][];
			Static229.aByteArrayArray7 = new byte[local25][];
			Static10.aByteArrayArray2 = new byte[local25][];
			@Pc(494) boolean local494 = false;
			if ((local54 / 8 == 48 || local54 / 8 == 49) && local21 / 8 == 48) {
				local494 = true;
			}
			if (local54 / 8 == 48 && local21 / 8 == 148) {
				local494 = true;
			}
			local25 = 0;
			for (local69 = (local54 - (Static95.anInt6381 >> 4)) / 8; local69 <= ((Static95.anInt6381 >> 4) + local54) / 8; local69++) {
				for (local203 = (local21 - (Static237.anInt4532 >> 4)) / 8; local203 <= (local21 + (Static237.anInt4532 >> 4)) / 8; local203++) {
					local207 = local203 + (local69 << 8);
					if (local494 && (local203 == 49 || local203 == 149 || local203 == 147 || local69 == 50 || local69 == 49 && local203 == 47)) {
						Static201.anIntArray310[local25] = local207;
						Static50.anIntArray96[local25] = -1;
						Static304.anIntArray452[local25] = -1;
						Static251.anIntArray377[local25] = -1;
						Static279.anIntArray415[local25] = -1;
					} else {
						Static201.anIntArray310[local25] = local207;
						Static50.anIntArray96[local25] = Static122.aClass191_148.method5446("m" + local69 + "_" + local203);
						Static304.anIntArray452[local25] = Static122.aClass191_148.method5446("l" + local69 + "_" + local203);
						Static251.anIntArray377[local25] = Static122.aClass191_148.method5446("um" + local69 + "_" + local203);
						Static279.anIntArray415[local25] = Static122.aClass191_148.method5446("ul" + local69 + "_" + local203);
					}
					local25++;
				}
			}
			Static282.method5084(local17, local58, local54, false, local33, local21, local448);
			return;
		}
		local17 = Static269.aClass2_Sub10_Sub1_3.method4413();
		local21 = Static269.aClass2_Sub10_Sub1_3.method4437();
		local25 = Static269.aClass2_Sub10_Sub1_3.method4437();
		local29 = Static269.aClass2_Sub10_Sub1_3.method4413();
		local33 = Static269.aClass2_Sub10_Sub1_3.method4422();
		@Pc(42) boolean local42 = Static269.aClass2_Sub10_Sub1_3.method4421() == 1;
		@Pc(46) int local46 = Static269.aClass2_Sub10_Sub1_3.method4421();
		Static49.method1191(local46);
		Static269.aClass2_Sub10_Sub1_3.method2056();
		@Pc(62) int local62;
		for (local54 = 0; local54 < 4; local54++) {
			for (local58 = 0; local58 < Static95.anInt6381 >> 3; local58++) {
				for (local62 = 0; local62 < Static237.anInt4532 >> 3; local62++) {
					local69 = Static269.aClass2_Sub10_Sub1_3.method2052(1);
					if (local69 == 1) {
						Static136.anIntArrayArrayArray5[local54][local58][local62] = Static269.aClass2_Sub10_Sub1_3.method2052(26);
					} else {
						Static136.anIntArrayArrayArray5[local54][local58][local62] = -1;
					}
				}
			}
		}
		Static269.aClass2_Sub10_Sub1_3.method2051();
		local58 = (Static71.anInt1574 - Static269.aClass2_Sub10_Sub1_3.anInt4807) / 16;
		Static177.anIntArrayArray107 = new int[local58][4];
		for (local62 = 0; local62 < local58; local62++) {
			for (local69 = 0; local69 < 4; local69++) {
				Static177.anIntArrayArray107[local62][local69] = Static269.aClass2_Sub10_Sub1_3.method4444();
			}
		}
		Static251.anIntArray377 = new int[local58];
		Static50.anIntArray96 = new int[local58];
		Static304.anIntArray452 = new int[local58];
		Static10.aByteArrayArray2 = new byte[local58][];
		Static201.anIntArray310 = new int[local58];
		Static266.anIntArray398 = null;
		Static121.aByteArrayArray8 = null;
		Static226.aByteArrayArray12 = new byte[local58][];
		Static341.aByteArrayArray22 = new byte[local58][];
		Static279.anIntArray415 = new int[local58];
		Static229.aByteArrayArray7 = new byte[local58][];
		local58 = 0;
		for (local69 = 0; local69 < 4; local69++) {
			for (local203 = 0; local203 < Static95.anInt6381 >> 3; local203++) {
				for (local207 = 0; local207 < Static237.anInt4532 >> 3; local207++) {
					@Pc(217) int local217 = Static136.anIntArrayArrayArray5[local69][local203][local207];
					if (local217 != -1) {
						@Pc(226) int local226 = local217 >> 14 & 0x3FF;
						@Pc(232) int local232 = local217 >> 3 & 0x7FF;
						@Pc(243) int local243 = (local226 / 8 << 8) + (local232 / 8);
						for (@Pc(245) int local245 = 0; local245 < local58; local245++) {
							if (local243 == Static201.anIntArray310[local245]) {
								local243 = -1;
								break;
							}
						}
						if (local243 != -1) {
							Static201.anIntArray310[local58] = local243;
							@Pc(274) int local274 = local243 >> 8 & 0xFF;
							@Pc(278) int local278 = local243 & 0xFF;
							Static50.anIntArray96[local58] = Static122.aClass191_148.method5446("m" + local274 + "_" + local278);
							Static304.anIntArray452[local58] = Static122.aClass191_148.method5446("l" + local274 + "_" + local278);
							Static251.anIntArray377[local58] = Static122.aClass191_148.method5446("um" + local274 + "_" + local278);
							Static279.anIntArray415[local58] = Static122.aClass191_148.method5446("ul" + local274 + "_" + local278);
							local58++;
						}
					}
				}
			}
		}
		Static282.method5084(local17, local29, local21, false, local33, local25, local42);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I")
	public static int method5711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static222.anIntArray337[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method5712() {
		Static74.aClass2_Sub10_Sub1_2.anInt4807 = 0;
		Static269.aClass2_Sub10_Sub1_3.anInt4807 = 0;
		Static216.anInt4151 = 0;
		Static8.anInt165 = -1;
		Static236.anInt4527 = -1;
		Static48.anInt1097 = -1;
		Static351.anInt5290 = 0;
		Static196.anInt3834 = -1;
		Static71.anInt1574 = 0;
		Static248.method4499();
		Static225.method3968();
		for (@Pc(35) int local35 = 0; local35 < Static129.aClass62_Sub1_Sub2_Sub2Array1.length; local35++) {
			if (Static129.aClass62_Sub1_Sub2_Sub2Array1[local35] != null) {
				Static129.aClass62_Sub1_Sub2_Sub2Array1[local35].anInt5292 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static37.aClass62_Sub1_Sub2_Sub1Array1.length; local53++) {
			if (Static37.aClass62_Sub1_Sub2_Sub1Array1[local53] != null) {
				Static37.aClass62_Sub1_Sub2_Sub1Array1[local53].anInt5292 = -1;
			}
		}
		Static154.method5673();
		Static182.anInt3602 = 1;
		Static125.method2616(30);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static200.aBooleanArray29[local80] = true;
		}
		Static286.method5122();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!tq;ZIIZ)V")
	public static void method5713(@OriginalArg(0) int arg0, @OriginalArg(2) Class191 arg1, @OriginalArg(5) int arg2) {
		Static300.anInt5860 = arg0;
		Static237.anInt4541 = 1;
		Static144.aClass191_93 = arg1;
		Static122.anInt4369 = arg2;
		Static68.anInt1466 = 2;
		Static75.aBoolean146 = false;
		Static10.anInt231 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static24.method734(Static307.anInt6214, arg2, Static228.anInt920);
		@Pc(17) int local17 = Static24.method734(Static307.anInt6214, arg0, Static228.anInt920);
		@Pc(28) int local28 = Static24.method734(Static96.anInt2180, arg5, Static124.anInt4221);
		@Pc(34) int local34 = Static24.method734(Static96.anInt2180, arg6, Static124.anInt4221);
		@Pc(43) int local43 = Static24.method734(Static307.anInt6214, arg2 + arg4, Static228.anInt920);
		@Pc(52) int local52 = Static24.method734(Static307.anInt6214, arg0 - arg4, Static228.anInt920);
		for (@Pc(54) int local54 = local11; local54 < local43; local54++) {
			Static205.method3670(arg1, local34, Static146.anIntArrayArray91[local54], local28);
		}
		for (@Pc(70) int local70 = local17; local70 > local52; local70--) {
			Static205.method3670(arg1, local34, Static146.anIntArrayArray91[local70], local28);
		}
		@Pc(96) int local96 = Static24.method734(Static96.anInt2180, arg5 + arg4, Static124.anInt4221);
		@Pc(104) int local104 = Static24.method734(Static96.anInt2180, arg6 - arg4, Static124.anInt4221);
		for (@Pc(106) int local106 = local43; local106 <= local52; local106++) {
			@Pc(112) int[] local112 = Static146.anIntArrayArray91[local106];
			Static205.method3670(arg1, local96, local112, local28);
			Static205.method3670(arg3, local104, local112, local96);
			Static205.method3670(arg1, local34, local112, local104);
		}
	}
}
