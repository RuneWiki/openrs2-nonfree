import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!jja", name = "k", descriptor = "I")
	public static int anInt9804;

	@OriginalMember(owner = "client!jja", name = "f", descriptor = "I")
	public static int anInt9800 = -1;

	@OriginalMember(owner = "client!jja", name = "j", descriptor = "Lclient!af;")
	public static final Class10 aClass10_58 = new Class10(32);

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "([[[Lclient!ug;IIIIZ)Z")
	public static boolean method8279(@OriginalArg(0) Class351[][][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(19) byte local19 = arg4 ? 1 : (byte) (Static61.anInt1167 & 0xFF);
		if (Static75.aByteArrayArrayArray1[Static253.anInt4353][arg3][arg2] == local19) {
			return false;
		} else if ((Static90.aByteArrayArrayArray2[Static253.anInt4353][arg3][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			@Pc(50) int local50 = 0;
			Static48.anIntArray59[0] = arg3;
			@Pc(57) int local57 = local48 + 1;
			Static601.anIntArray654[0] = arg2;
			Static75.aByteArrayArrayArray1[Static253.anInt4353][arg3][arg2] = local19;
			while (local50 != local57) {
				@Pc(75) int local75 = Static48.anIntArray59[local50] & 0xFFFF;
				@Pc(83) int local83 = Static48.anIntArray59[local50] >> 16 & 0xFF;
				@Pc(91) int local91 = Static48.anIntArray59[local50] >> 24 & 0xFF;
				@Pc(97) int local97 = Static601.anIntArray654[local50] & 0xFFFF;
				@Pc(105) int local105 = Static601.anIntArray654[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static90.aByteArrayArrayArray2[Static253.anInt4353][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(136) int local136;
				@Pc(175) int local175;
				@Pc(221) int local221;
				if (arg0 != null) {
					label237: for (local136 = Static253.anInt4353 + 1; local136 <= 3; local136++) {
						if (arg0[local136] != null && (Static90.aByteArrayArrayArray2[local136][local75][local97] & 0x8) == 0) {
							@Pc(324) Class2_Sub1_Sub1 local324;
							@Pc(334) int local334;
							@Pc(313) Class351 local313;
							@Pc(319) Class67 local319;
							if (local113 && arg0[local136][local75][local97] != null) {
								if (arg0[local136][local75][local97].aClass2_Sub1_Sub2_2 != null) {
									local175 = Static118.method1839(local83);
									if (local175 == arg0[local136][local75][local97].aClass2_Sub1_Sub2_2.aShort27 || arg0[local136][local75][local97].aClass2_Sub1_Sub2_1 != null && local175 == arg0[local136][local75][local97].aClass2_Sub1_Sub2_1.aShort27) {
										continue;
									}
									if (local91 != 0) {
										local221 = Static118.method1839(local91);
										if (arg0[local136][local75][local97].aClass2_Sub1_Sub2_2.aShort27 == local221 || arg0[local136][local75][local97].aClass2_Sub1_Sub2_1 != null && local221 == arg0[local136][local75][local97].aClass2_Sub1_Sub2_1.aShort27) {
											continue;
										}
									}
									if (local105 != 0) {
										local221 = Static118.method1839(local105);
										if (local221 == arg0[local136][local75][local97].aClass2_Sub1_Sub2_2.aShort27 || arg0[local136][local75][local97].aClass2_Sub1_Sub2_1 != null && arg0[local136][local75][local97].aClass2_Sub1_Sub2_1.aShort27 == local221) {
											continue;
										}
									}
								}
								local313 = arg0[local136][local75][local97];
								if (local313.aClass67_3 != null) {
									for (local319 = local313.aClass67_3; local319 != null; local319 = local319.aClass67_1) {
										local324 = local319.aClass2_Sub1_Sub1_1;
										if (local324 instanceof Interface18) {
											@Pc(330) Interface18 local330 = (Interface18) local324;
											local334 = local330.method8473();
											@Pc(338) int local338 = local330.method8472();
											if (local334 == 21) {
												local334 = 19;
											}
											@Pc(351) int local351 = local334 | local338 << 6;
											if (local351 == local83 || local91 != 0 && local351 == local91 || local105 != 0 && local105 == local351) {
												continue label237;
											}
										}
									}
								}
							}
							local313 = arg0[local136][local75][local97];
							if (local313 != null && local313.aClass67_3 != null) {
								for (local319 = local313.aClass67_3; local319 != null; local319 = local319.aClass67_1) {
									local324 = local319.aClass2_Sub1_Sub1_1;
									if (local324.aShort118 != local324.aShort119 || local324.aShort120 != local324.aShort121) {
										for (@Pc(421) int local421 = local324.aShort118; local421 <= local324.aShort119; local421++) {
											for (local334 = local324.aShort121; local334 <= local324.aShort120; local334++) {
												Static75.aByteArrayArrayArray1[local136][local421][local334] = local19;
											}
										}
									}
								}
							}
							Static75.aByteArrayArrayArray1[local136][local75][local97] = local19;
							local130 = true;
						}
					}
				}
				if (local130) {
					local136 = Static289.aClass12Array3[Static253.anInt4353 + 1].method7846(local75, local97);
					if (Static357.anIntArray361[arg1] < local136) {
						Static357.anIntArray361[arg1] = local136;
					}
					local175 = local75 << 9;
					local221 = local97 << 9;
					if (local175 < Static53.anIntArray62[arg1]) {
						Static53.anIntArray62[arg1] = local175;
					} else if (local175 > Static201.anIntArray601[arg1]) {
						Static201.anIntArray601[arg1] = local175;
					}
					if (Static666.anIntArray708[arg1] > local221) {
						Static666.anIntArray708[arg1] = local221;
					} else if (Static163.anIntArray155[arg1] < local221) {
						Static163.anIntArray155[arg1] = local221;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local19 != Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 - 1][local97]) {
						Static48.anIntArray59[local57] = 0xD3000000 | 0x120000 | local75 - 1;
						Static601.anIntArray654[local57] = local97 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 - 1][local97] = local19;
					}
					local97++;
					if (Static393.anInt6574 > local97) {
						if (local75 - 1 >= 0 && local19 != Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 - 1][local97] && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75][local97] & 0x4) == 0 && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static48.anIntArray59[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static601.anIntArray654[local57] = local97 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 - 1][local97] = local19;
						}
						if (local19 != Static75.aByteArrayArrayArray1[Static253.anInt4353][local75][local97]) {
							Static48.anIntArray59[local57] = local75 | 0x520000 | 0x13000000;
							Static601.anIntArray654[local57] = local97 | 0x530000;
							Static75.aByteArrayArrayArray1[Static253.anInt4353][local75][local97] = local19;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static491.anInt9856 > local75 + 1 && Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 + 1][local97] != local19 && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75][local97] & 0x4) == 0 && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static48.anIntArray59[local57] = local75 + 1 | 0x92000000 | 0x520000;
							Static601.anIntArray654[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 + 1][local97] = local19;
						}
					}
					local97--;
					if (Static491.anInt9856 > local75 + 1 && local19 != Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 + 1][local97]) {
						Static48.anIntArray59[local57] = local75 + 1 | 0x53000000 | 0x920000;
						Static601.anIntArray654[local57] = local97 | 0x930000;
						Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 + 1][local97] = local19;
						local57 = local57 + 1 & 0xFFF;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 - 1][local97] != local19 && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75][local97] & 0x4) == 0 && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static48.anIntArray59[local57] = local75 - 1 | 0xD20000 | 0x12000000;
							Static601.anIntArray654[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 - 1][local97] = local19;
						}
						if (Static75.aByteArrayArrayArray1[Static253.anInt4353][local75][local97] != local19) {
							Static48.anIntArray59[local57] = local75 | 0x93000000 | 0xD20000;
							Static601.anIntArray654[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static75.aByteArrayArrayArray1[Static253.anInt4353][local75][local97] = local19;
						}
						if (Static491.anInt9856 > local75 + 1 && local19 != Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 + 1][local97] && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75][local97] & 0x4) == 0 && (Static90.aByteArrayArrayArray2[Static253.anInt4353][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static48.anIntArray59[local57] = 0xD2000000 | 0x920000 | local75 + 1;
							Static601.anIntArray654[local57] = local97 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static75.aByteArrayArrayArray1[Static253.anInt4353][local75 + 1][local97] = local19;
						}
					}
				}
			}
			if (Static357.anIntArray361[arg1] != -1000000) {
				Static357.anIntArray361[arg1] += 40;
				Static53.anIntArray62[arg1] -= 512;
				Static201.anIntArray601[arg1] += 512;
				Static163.anIntArray155[arg1] += 512;
				Static666.anIntArray708[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)V")
	public static void method8280() {
		Static566.anInt9416 = 0;
		@Pc(11) int local11 = Static204.aClass6_Sub23_Sub1_1.method8374();
		@Pc(15) int local15 = Static204.aClass6_Sub23_Sub1_1.method8363();
		@Pc(24) boolean local24 = Static204.aClass6_Sub23_Sub1_1.method8374() == 1;
		@Pc(28) int local28 = Static204.aClass6_Sub23_Sub1_1.method8367();
		Static336.method4910();
		Static56.method1077(local11);
		@Pc(40) int local40 = (Static655.anInt10505 - Static204.aClass6_Sub23_Sub1_1.anInt9901) / 16;
		Static66.anIntArrayArray6 = new int[local40][4];
		@Pc(50) int local50;
		for (@Pc(46) int local46 = 0; local46 < local40; local46++) {
			for (local50 = 0; local50 < 4; local50++) {
				Static66.anIntArrayArray6[local46][local50] = Static204.aClass6_Sub23_Sub1_1.method8369();
			}
		}
		Static137.aByteArrayArray8 = null;
		Static588.aByteArrayArray27 = new byte[local40][];
		Static205.anIntArray198 = new int[local40];
		Static310.anIntArray310 = new int[local40];
		Static402.aByteArrayArray18 = new byte[local40][];
		Static381.anIntArray516 = new int[local40];
		Static43.aByteArrayArray6 = new byte[local40][];
		Static339.aByteArrayArray15 = new byte[local40][];
		Static280.anIntArray274 = new int[local40];
		Static300.anIntArray289 = new int[local40];
		Static200.anIntArray192 = null;
		local40 = 0;
		for (local50 = (local28 - (Static491.anInt9856 >> 4)) / 8; local50 <= (local28 + (Static491.anInt9856 >> 4)) / 8; local50++) {
			for (@Pc(128) int local128 = (local15 - (Static393.anInt6574 >> 4)) / 8; local128 <= ((Static393.anInt6574 >> 4) + local15) / 8; local128++) {
				Static300.anIntArray289[local40] = (local50 << 8) + local128;
				Static381.anIntArray516[local40] = Static187.aClass8_56.method252("m" + local50 + "_" + local128);
				Static280.anIntArray274[local40] = Static187.aClass8_56.method252("l" + local50 + "_" + local128);
				Static310.anIntArray310[local40] = Static187.aClass8_56.method252("um" + local50 + "_" + local128);
				Static205.anIntArray198[local40] = Static187.aClass8_56.method252("ul" + local50 + "_" + local128);
				local40++;
			}
		}
		Static122.method1895(local28, local24, 11, local15);
	}

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(BII)V")
	public static void method8282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub4_Sub18 local14 = Static565.method7924((long) arg1, 6);
		local14.method7976();
		local14.anInt9466 = arg0;
	}
}
