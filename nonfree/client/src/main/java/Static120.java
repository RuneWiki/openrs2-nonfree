import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "I")
	public static int anInt2321;

	@OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
	public static int anInt2325;

	@OriginalMember(owner = "client!ja", name = "gb", descriptor = "[I")
	public static int[] anIntArray285;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)I")
	public static int method1884(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) int local3 = arg1 & 0xF;
		@Pc(20) int local20 = local3 >= 8 ? arg3 : arg0;
		@Pc(45) int local45 = local3 >= 4 ? (local3 == 12 || local3 == 14 ? arg0 : arg2) : arg3;
		return ((local3 & 0x1) == 0 ? local20 : -local20) + ((local3 & 0x2) == 0 ? local45 : -local45);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!jj;Z)V")
	public static void method1887(@OriginalArg(0) Class1_Sub18 arg0) {
		@Pc(9) int local9 = Static202.anInt3981 >> 1;
		@Pc(15) int local15 = Static232.anInt4966 >> 2 << 10;
		@Pc(19) byte[][] local19 = new byte[Static93.anInt1769][Static77.anInt1559];
		@Pc(35) int local35;
		@Pc(117) int local117;
		@Pc(131) int local131;
		while (arg0.anInt3911 < arg0.aByteArray71.length) {
			@Pc(31) boolean local31 = false;
			@Pc(33) int local33 = 0;
			local35 = 0;
			if (arg0.method3122() == 1) {
				local31 = true;
				local35 = arg0.method3122();
				local33 = arg0.method3122();
			}
			@Pc(56) int local56 = arg0.method3122();
			@Pc(60) int local60 = arg0.method3122();
			@Pc(71) int local71 = Static77.anInt1559 + Static198.anInt3851 - local60 * 64 - 1;
			@Pc(78) int local78 = local56 * 64 - Static219.anInt4487;
			if (local78 >= 0 && local71 - 63 >= 0 && Static93.anInt1769 > local78 + 63 && Static77.anInt1559 > local71) {
				for (local117 = 0; local117 < 64; local117++) {
					@Pc(129) byte[] local129 = local19[local78 + local117];
					for (local131 = 0; local131 < 64; local131++) {
						if (!local31 || local117 >= local35 * 8 && local117 < local35 * 8 + 8 && local33 * 8 <= local131 && local131 < local33 * 8 + 8) {
							local129[local71 - local131] = arg0.method3082();
						}
					}
				}
			} else if (local31) {
				arg0.anInt3911 += 64;
			} else {
				arg0.anInt3911 += 4096;
			}
		}
		@Pc(189) int local189 = Static93.anInt1769;
		local35 = Static77.anInt1559;
		@Pc(194) int[] local194 = new int[local35];
		@Pc(197) int[] local197 = new int[local35];
		@Pc(200) int[] local200 = new int[local35];
		@Pc(203) int[] local203 = new int[local35];
		@Pc(206) int[] local206 = new int[local35];
		for (local117 = -5; local117 < local189; local117++) {
			@Pc(240) int local240;
			@Pc(303) int local303;
			for (@Pc(217) int local217 = 0; local217 < local35; local217++) {
				local131 = local117 + 5;
				@Pc(285) int local285;
				if (local189 > local131) {
					local240 = local19[local131][local217] & 0xFF;
					if (local240 > 0) {
						@Pc(249) Class130 local249 = Static33.method619(local240 - 1);
						local194[local217] += local249.anInt3769;
						local200[local217] += local249.anInt3774;
						local197[local217] += local249.anInt3783;
						local203[local217] += local249.anInt3772;
						local285 = local206[local217]++;
					}
				}
				local240 = local117 - 5;
				if (local240 >= 0) {
					local303 = local19[local240][local217] & 0xFF;
					if (local303 > 0) {
						@Pc(314) Class130 local314 = Static33.method619(local303 - 1);
						local194[local217] -= local314.anInt3769;
						local200[local217] -= local314.anInt3774;
						local197[local217] -= local314.anInt3783;
						local203[local217] -= local314.anInt3772;
						local285 = local206[local217]--;
					}
				}
			}
			if (local117 >= 0) {
				@Pc(368) int[][] local368 = Static18.anIntArrayArrayArray3[local117 >> 6];
				local240 = 0;
				local131 = 0;
				local303 = 0;
				@Pc(376) int local376 = 0;
				@Pc(378) int local378 = 0;
				for (@Pc(380) int local380 = -5; local380 < local35; local380++) {
					@Pc(391) int local391 = local380 - 5;
					@Pc(395) int local395 = local380 + 5;
					if (local395 < local35) {
						local131 += local194[local395];
						local378 += local206[local395];
						local240 += local200[local395];
						local376 += local203[local395];
						local303 += local197[local395];
					}
					if (local391 >= 0) {
						local376 -= local203[local391];
						local240 -= local200[local391];
						local131 -= local194[local391];
						local303 -= local197[local391];
						local378 -= local206[local391];
					}
					if (local380 >= 0 && local378 > 0) {
						@Pc(477) int[] local477 = local368[local380 >> 6];
						@Pc(498) int local498 = local376 == 0 ? 0 : Static73.method1189(local303 / local378, local240 / local378, local131 * 256 / local376);
						if (local19[local117][local380] != 0) {
							if (local477 == null) {
								local477 = local368[local380 >> 6] = new int[4096];
							}
							@Pc(542) int local542 = (local498 & 0x7F) + local9;
							if (local542 < 0) {
								local542 = 0;
							} else if (local542 > 127) {
								local542 = 127;
							}
							@Pc(571) int local571 = local542 + (local15 + local498 & 0xFC00) + (local498 & 0x380);
							local477[(local117 & 0x3F) + ((local380 & 0x3F) << 6)] = Static208.anIntArray476[Static102.method1650(local571, 96)];
						} else if (local477 != null) {
							local477[(local117 & 0x3F) + ((local380 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lclient!gg;")
	public static Class63 method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass63_1;
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	public static void method1889() {
		Static256.aClass1_Sub8_Sub4_3.method4223();
		Static262.aClass7_210 = null;
		Static137.anInt3867 = 1;
	}

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "(I)V")
	public static void method1890() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("maxMemory");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local16.invoke(local20, (Object[]) null);
					Static47.anInt5868 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZILclient!og;II)V")
	public static void method1891(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg2.anInt3567;
		@Pc(11) int local11 = arg2.anInt3595;
		if (arg2.aByte17 == 0) {
			arg2.anInt3595 = arg2.anInt3544;
		} else if (arg2.aByte17 == 1) {
			arg2.anInt3595 = arg1 - arg2.anInt3544;
		} else if (arg2.aByte17 == 2) {
			arg2.anInt3595 = arg2.anInt3544 * arg1 >> 14;
		} else if (arg2.aByte17 == 3) {
			if (arg2.anInt3570 == 2) {
				arg2.anInt3595 = arg2.anInt3544 * 32 + (arg2.anInt3544 - 1) * arg2.anInt3559;
			} else if (arg2.anInt3570 == 7) {
				arg2.anInt3595 = arg2.anInt3544 * 12 + arg2.anInt3559 * (arg2.anInt3544 - 1);
			}
		}
		if (arg2.aByte18 == 0) {
			arg2.anInt3567 = arg2.anInt3546;
		} else if (arg2.aByte18 == 1) {
			arg2.anInt3567 = arg3 - arg2.anInt3546;
		} else if (arg2.aByte18 == 2) {
			arg2.anInt3567 = arg3 * arg2.anInt3546 >> 14;
		} else if (arg2.aByte18 == 3) {
			if (arg2.anInt3570 == 2) {
				arg2.anInt3567 = arg2.anInt3546 * 32 + (arg2.anInt3546 - 1) * arg2.anInt3627;
			} else if (arg2.anInt3570 == 7) {
				arg2.anInt3567 = arg2.anInt3546 * 115 + (arg2.anInt3546 - 1) * arg2.anInt3627;
			}
		}
		if (arg2.aByte18 == 4) {
			arg2.anInt3567 = arg2.anInt3595 * arg2.anInt3617 / arg2.anInt3605;
		}
		if (arg2.aByte17 == 4) {
			arg2.anInt3595 = arg2.anInt3605 * arg2.anInt3567 / arg2.anInt3617;
		}
		if (Static26.aBoolean49 && (Static43.method794(arg2).anInt5647 != 0 || arg2.anInt3570 == 0)) {
			if (arg2.anInt3595 < 5 && arg2.anInt3567 < 5) {
				arg2.anInt3595 = 5;
				arg2.anInt3567 = 5;
			} else {
				if (arg2.anInt3567 <= 0) {
					arg2.anInt3567 = 5;
				}
				if (arg2.anInt3595 <= 0) {
					arg2.anInt3595 = 5;
				}
			}
		}
		if (arg2.anInt3566 == 1337) {
			Static298.aClass127_17 = arg2;
		}
		if (arg0 && arg2.anObjectArray22 != null && (local4 != arg2.anInt3567 || arg2.anInt3595 != local11)) {
			@Pc(297) Class1_Sub20 local297 = new Class1_Sub20();
			local297.anObjectArray2 = arg2.anObjectArray22;
			local297.aClass127_9 = arg2;
			Static27.aClass69_4.method1628(local297);
		}
	}
}
