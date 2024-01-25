import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public static int anInt1561;

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "Lclient!ro;")
	public static Class6_Sub33 aClass6_Sub33_1;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
	public static int anInt1571 = 0;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "I")
	public static int anInt1573 = 0;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IILclient!ta;II)V")
	public static void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub6 arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class208 local9 = arg2.method5511();
		@Pc(19) int local19 = arg2.anInt6688 - arg2.aClass191_7.anInt4886 & 0x3FFF;
		if (arg1 == -1) {
			if (local19 != 0 || arg2.anInt6704 > 25) {
				if (arg0 < 0 && local9.anInt5558 != -1) {
					arg2.anInt6735 = local9.anInt5558;
				} else if (arg0 <= 0 || local9.anInt5560 == -1) {
					arg2.anInt6735 = local9.anInt5586;
				} else {
					arg2.anInt6735 = local9.anInt5560;
				}
				arg2.aBoolean453 = false;
			} else if (!arg2.aBoolean453 || !local9.method4709(arg2.anInt6735)) {
				arg2.anInt6735 = local9.method4712();
				arg2.aBoolean453 = arg2.anInt6735 != -1;
			}
		} else if (arg2.anInt6690 != -1 && (local19 >= 10240 || local19 <= 2048)) {
			@Pc(116) int local116 = Static376.anIntArray463[arg3] - arg2.aClass191_7.anInt4886 & 0x3FFF;
			if (arg1 == 2 && local9.anInt5574 != -1) {
				if (local116 > 2048 && local116 <= 6144 && local9.anInt5570 != -1) {
					arg2.anInt6735 = local9.anInt5570;
				} else if (local116 >= 10240 && local116 < 14336 && local9.anInt5555 != -1) {
					arg2.anInt6735 = local9.anInt5555;
				} else if (local116 <= 6144 || local116 >= 10240 || local9.anInt5595 == -1) {
					arg2.anInt6735 = local9.anInt5574;
				} else {
					arg2.anInt6735 = local9.anInt5595;
				}
			} else if (arg1 == 0 && local9.anInt5588 != -1) {
				if (local116 > 2048 && local116 <= 6144 && local9.anInt5585 != -1) {
					arg2.anInt6735 = local9.anInt5585;
				} else if (local116 >= 10240 && local116 < 14336 && local9.anInt5573 != -1) {
					arg2.anInt6735 = local9.anInt5573;
				} else if (local116 <= 6144 || local116 >= 10240 || local9.anInt5571 == -1) {
					arg2.anInt6735 = local9.anInt5588;
				} else {
					arg2.anInt6735 = local9.anInt5571;
				}
			} else if (local116 > 2048 && local116 <= 6144 && local9.anInt5596 != -1) {
				arg2.anInt6735 = local9.anInt5596;
			} else if (local116 >= 10240 && local116 < 14336 && local9.anInt5590 != -1) {
				arg2.anInt6735 = local9.anInt5590;
			} else if (local116 <= 6144 || local116 >= 10240 || local9.anInt5566 == -1) {
				arg2.anInt6735 = local9.anInt5586;
			} else {
				arg2.anInt6735 = local9.anInt5566;
			}
			arg2.aBoolean453 = false;
		} else if (local19 == 0 && arg2.anInt6704 <= 25) {
			arg2.aBoolean453 = false;
			if (arg1 == 2 && local9.anInt5574 != -1) {
				arg2.anInt6735 = local9.anInt5574;
			} else if (arg1 == 0 && local9.anInt5588 != -1) {
				arg2.anInt6735 = local9.anInt5588;
			} else {
				arg2.anInt6735 = local9.anInt5586;
			}
		} else {
			arg2.aBoolean453 = false;
			if (arg1 == 2 && local9.anInt5574 != -1) {
				if (arg0 < 0 && local9.anInt5583 != -1) {
					arg2.anInt6735 = local9.anInt5583;
				} else if (arg0 <= 0 || local9.anInt5581 == -1) {
					arg2.anInt6735 = local9.anInt5574;
				} else {
					arg2.anInt6735 = local9.anInt5581;
				}
			} else if (arg1 == 0 && local9.anInt5588 != -1) {
				if (arg0 < 0 && local9.anInt5582 != -1) {
					arg2.anInt6735 = local9.anInt5582;
				} else if (arg0 <= 0 || local9.anInt5562 == -1) {
					arg2.anInt6735 = local9.anInt5588;
				} else {
					arg2.anInt6735 = local9.anInt5562;
				}
			} else if (arg0 < 0 && local9.anInt5593 != -1) {
				arg2.anInt6735 = local9.anInt5593;
			} else if (arg0 <= 0 || local9.anInt5575 == -1) {
				arg2.anInt6735 = local9.anInt5586;
			} else {
				arg2.anInt6735 = local9.anInt5575;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I[BB)I")
	public static int method1469(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static317.method5229(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
	public static void method1470() {
		@Pc(9) int local9 = Static55.aClass6_Sub15_Sub1_1.method3086();
		@Pc(13) int local13 = Static55.aClass6_Sub15_Sub1_1.method3101();
		Static261.anInt4478 = Static55.aClass6_Sub15_Sub1_1.method3086();
		@Pc(28) boolean local28 = Static55.aClass6_Sub15_Sub1_1.method3086() == 1;
		@Pc(32) int local32 = Static55.aClass6_Sub15_Sub1_1.method3108();
		Static145.method2423(local9);
		Static55.aClass6_Sub15_Sub1_1.method2607();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static84.anInt1632 >> 3; local44++) {
				for (local48 = 0; local48 < Static261.anInt4480 >> 3; local48++) {
					local55 = Static55.aClass6_Sub15_Sub1_1.method2604(1);
					if (local55 == 1) {
						Static1.anIntArrayArrayArray1[local40][local44][local48] = Static55.aClass6_Sub15_Sub1_1.method2604(26);
					} else {
						Static1.anIntArrayArrayArray1[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static55.aClass6_Sub15_Sub1_1.method2613();
		local44 = (Static337.anInt5664 - Static55.aClass6_Sub15_Sub1_1.anInt3487) / 16;
		Static58.anIntArrayArray8 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static58.anIntArrayArray8[local48][local55] = Static55.aClass6_Sub15_Sub1_1.method3109();
			}
		}
		Static325.aByteArrayArray30 = new byte[local44][];
		Static100.anIntArray40 = new int[local44];
		Static183.anIntArray518 = new int[local44];
		Static369.anIntArray540 = new int[local44];
		Static247.anIntArray381 = new int[local44];
		Static53.anIntArray94 = null;
		Static37.aByteArrayArray48 = new byte[local44][];
		Static27.aByteArrayArray5 = null;
		Static439.aByteArrayArray47 = new byte[local44][];
		Static121.aByteArrayArray17 = new byte[local44][];
		Static175.anIntArray282 = new int[local44];
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(181) int local181 = 0; local181 < Static84.anInt1632 >> 3; local181++) {
				for (@Pc(185) int local185 = 0; local185 < Static261.anInt4480 >> 3; local185++) {
					@Pc(195) int local195 = Static1.anIntArrayArrayArray1[local55][local181][local185];
					if (local195 != -1) {
						@Pc(204) int local204 = local195 >> 14 & 0x3FF;
						@Pc(210) int local210 = local195 >> 3 & 0x7FF;
						@Pc(221) int local221 = (local204 / 8 << 8) + (local210 / 8);
						for (@Pc(223) int local223 = 0; local223 < local44; local223++) {
							if (Static175.anIntArray282[local223] == local221) {
								local221 = -1;
								break;
							}
						}
						if (local221 != -1) {
							Static175.anIntArray282[local44] = local221;
							@Pc(251) int local251 = local221 >> 8 & 0xFF;
							@Pc(255) int local255 = local221 & 0xFF;
							Static100.anIntArray40[local44] = Static118.aClass158_26.method3677("m" + local251 + "_" + local255);
							Static183.anIntArray518[local44] = Static118.aClass158_26.method3677("l" + local251 + "_" + local255);
							Static369.anIntArray540[local44] = Static118.aClass158_26.method3677("um" + local251 + "_" + local255);
							Static247.anIntArray381[local44] = Static118.aClass158_26.method3677("ul" + local251 + "_" + local255);
							local44++;
						}
					}
				}
			}
		}
		Static358.method5049(local28, local32, false, local13);
	}
}
