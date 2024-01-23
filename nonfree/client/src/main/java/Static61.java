import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ja;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
	public static boolean aBoolean69 = true;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	public static void method1007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1012) {
			Static172.method2723(10, arg0, arg2);
		} else if (arg1 == 1002) {
			Static172.method2723(11, arg0, arg2);
		} else if (arg1 == 1008) {
			Static172.method2723(12, arg0, arg2);
		} else if (arg1 == 1003) {
			Static172.method2723(13, arg0, arg2);
		} else if (arg1 == 1011) {
			Static172.method2723(14, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public static void method1008() {
		for (@Pc(1) int local1 = 0; local1 < Static224.anInt4310; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static300.anInt5636; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static299.anInt5591; local11++) {
					@Pc(22) Class4_Sub19 local22 = Static6.aClass4_Sub19ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class182 local27 = local22.aClass182_1;
						if (local27 != null && local27.aClass53_5.method3845()) {
							Static127.method1952(local27.aClass53_5, local1, local6, local11, 1, 1);
							if (local27.aClass53_4 != null && local27.aClass53_4.method3845()) {
								Static127.method1952(local27.aClass53_4, local1, local6, local11, 1, 1);
								local27.aClass53_5.method3844(local27.aClass53_4, 0, 0, 0, false);
								local27.aClass53_4 = local27.aClass53_4.method3846();
							}
							local27.aClass53_5 = local27.aClass53_5.method3846();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt3554; local83++) {
							@Pc(92) Class33 local92 = local22.aClass33Array3[local83];
							if (local92 != null && local92.aClass53_1.method3845()) {
								Static127.method1952(local92.aClass53_1, local1, local6, local11, local92.anInt825 + 1 - local92.anInt824, local92.anInt817 - local92.anInt826 + 1);
								local92.aClass53_1 = local92.aClass53_1.method3846();
							}
						}
						@Pc(131) Class42 local131 = local22.aClass42_1;
						if (local131 != null && local131.aClass53_2.method3845()) {
							Static187.method2994(local131.aClass53_2, local1, local6, local11);
							local131.aClass53_2 = local131.aClass53_2.method3846();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)Z")
	public static boolean method1009(@OriginalArg(1) int arg0) {
		@Pc(41) int local41;
		@Pc(43) int local43;
		@Pc(80) int local80;
		@Pc(84) int local84;
		if (Static122.aClass4_Sub3_Sub14_Sub1_3 == null) {
			if (Static94.aBoolean138 || Static212.aClass4_Sub3_Sub14_4 == null) {
				Static122.aClass4_Sub3_Sub14_Sub1_3 = new Class4_Sub3_Sub14_Sub1(512, 512);
			} else {
				Static122.aClass4_Sub3_Sub14_Sub1_3 = (Class4_Sub3_Sub14_Sub1) Static212.aClass4_Sub3_Sub14_4;
			}
			@Pc(38) int[] local38 = Static122.aClass4_Sub3_Sub14_Sub1_3.anIntArray241;
			local41 = local38.length;
			for (local43 = 0; local43 < local41; local43++) {
				local38[local43] = 1;
			}
			for (local43 = 1; local43 < 103; local43++) {
				local80 = (103 - local43) * 512 * 4 + 24628;
				for (local84 = 1; local84 < 103; local84++) {
					if ((Static174.aByteArrayArrayArray17[arg0][local84][local43] & 0x18) == 0) {
						Static56.method970(local38, local80, arg0, local84, local43);
					}
					if (arg0 < 3 && (Static174.aByteArrayArrayArray17[arg0 + 1][local84][local43] & 0x8) != 0) {
						Static56.method970(local38, local80, arg0 + 1, local84, local43);
					}
					local80 += 4;
				}
			}
			Static234.anInt4435 = 0;
			for (local43 = 0; local43 < 104; local43++) {
				for (local80 = 0; local80 < 104; local80++) {
					@Pc(168) long local168 = Static150.method2421(arg0, local43 + 0, local80);
					if (local168 == 0L) {
						local168 = Static128.method1961(arg0, local43 + 0, local80);
					}
					if (local168 == 0L) {
						local168 = Static174.method2739(arg0, local43 + 0, local80);
					}
					if (local168 == 0L) {
						local168 = Static308.method4776(arg0, local43 + 0, local80);
					}
					if (local168 != 0L) {
						@Pc(227) Class184 local227 = Static6.method99(Integer.MAX_VALUE & (int) (local168 >>> 32));
						if (!local227.aBoolean376 || Static293.aBoolean371) {
							@Pc(235) int local235 = local227.anInt5527;
							if (local227.anIntArray631 != null) {
								for (@Pc(241) int local241 = 0; local241 < local227.anIntArray631.length; local241++) {
									if (local227.anIntArray631[local241] != -1) {
										@Pc(264) Class184 local264 = Static6.method99(local227.anIntArray631[local241]);
										if (local264.anInt5527 >= 0) {
											local235 = local264.anInt5527;
										}
									}
								}
							}
							if (local235 >= 0) {
								@Pc(280) boolean local280 = false;
								@Pc(284) Class83 local284 = Static142.method2192(local235);
								@Pc(288) int local288 = local43;
								@Pc(293) int local293 = local80;
								if (local284 != null && local284.aBoolean156) {
									local280 = true;
								}
								if (local280) {
									@Pc(309) int[][] local309 = Static296.aClass30Array1[arg0].anIntArrayArray6;
									for (@Pc(311) int local311 = 0; local311 < 10; local311++) {
										@Pc(321) int local321 = (int) (Math.random() * 4.0D);
										if (local321 == 0 && local288 > 0 && local288 > local43 - 3 && (local309[local288 - 1][local293] & 0x2C0108) == 0) {
											local288--;
										}
										if (local321 == 1 && local288 < 103 && local288 < local43 + 3 && (local309[local288 + 1][local293] & 0x2C0180) == 0) {
											local288++;
										}
										if (local321 == 2 && local293 > 0 && local80 - 3 < local293 && (local309[local288][local293 - 1] & 0x2C0102) == 0) {
											local293--;
										}
										if (local321 == 3 && local293 < 103 && local80 + 3 > local293 && (local309[local288][local293 + 1] & 0x2C0120) == 0) {
											local293++;
										}
									}
								}
								Static7.anIntArray15[Static234.anInt4435] = local227.anInt5554;
								Static113.anIntArray189[Static234.anInt4435] = local288;
								Static52.anIntArray187[Static234.anInt4435] = local293;
								Static234.anInt4435++;
							}
						}
					}
				}
			}
		}
		Static122.aClass4_Sub3_Sub14_Sub1_3.method2179();
		@Pc(504) int local504 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + -10 + 238 << 16) + 238 - 10;
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local43 = 1; local43 < 103; local43++) {
			for (local80 = 1; local80 < 103; local80++) {
				if ((Static174.aByteArrayArrayArray17[arg0][local80][local43] & 0x18) == 0 && !Static311.method4817(local504, arg0, local41, local43, local80)) {
					if (Static94.aBoolean138) {
						Static270.anIntArray561 = null;
					} else {
						Static152.aClass59_1.method4281();
					}
					return false;
				}
				if (arg0 < 3 && (Static174.aByteArrayArrayArray17[arg0 + 1][local80][local43] & 0x8) != 0 && !Static311.method4817(local504, arg0 + 1, local41, local43, local80)) {
					if (Static94.aBoolean138) {
						Static270.anIntArray561 = null;
					} else {
						Static152.aClass59_1.method4281();
					}
					return false;
				}
			}
		}
		if (Static94.aBoolean138) {
			@Pc(624) int[] local624 = Static122.aClass4_Sub3_Sub14_Sub1_3.anIntArray241;
			local80 = local624.length;
			for (local84 = 0; local84 < local80; local84++) {
				if (local624[local84] == 0) {
					local624[local84] = 1;
				}
			}
			Static212.aClass4_Sub3_Sub14_4 = new Class4_Sub3_Sub14_Sub2(Static122.aClass4_Sub3_Sub14_Sub1_3);
		} else {
			Static212.aClass4_Sub3_Sub14_4 = Static122.aClass4_Sub3_Sub14_Sub1_3;
		}
		if (Static94.aBoolean138) {
			Static270.anIntArray561 = null;
		} else {
			Static152.aClass59_1.method4281();
		}
		Static122.aClass4_Sub3_Sub14_Sub1_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	public static void method1010() {
		Static195.aClass26_39.method511();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) Class4_Sub25 local5 = null;
		for (@Pc(10) Class4_Sub25 local10 = (Class4_Sub25) Static57.aClass114_7.method2623(); local10 != null; local10 = (Class4_Sub25) Static57.aClass114_7.method2629()) {
			if (arg1 == local10.anInt4439 && arg3 == local10.anInt4446 && local10.anInt4442 == arg5 && arg7 == local10.anInt4438) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class4_Sub25();
			local5.anInt4442 = arg5;
			local5.anInt4439 = arg1;
			local5.anInt4438 = arg7;
			local5.anInt4446 = arg3;
			Static87.method4691(local5);
			Static57.aClass114_7.method2625(local5);
		}
		local5.anInt4447 = arg8;
		local5.anInt4436 = arg0;
		local5.anInt4437 = arg4;
		local5.anInt4434 = arg2;
		local5.anInt4443 = arg6;
	}
}
