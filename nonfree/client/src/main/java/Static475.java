import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_120 = new Class200(36, 2);

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
	public static int anInt8308 = -1;

	@OriginalMember(owner = "client!qt", name = "t", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_112 = new Class130(73, 3);

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "Z")
	public static boolean aBoolean582 = false;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLclient!cs;Z)V")
	public static void method7128(@OriginalArg(1) Class4_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class143 local9 = arg0.method5058();
		if (arg0.anInt5792 == 0) {
			arg0.anInt5794 = 0;
			Static585.anInt9592 = -1;
			Static374.anInt7015 = 0;
			return;
		}
		if (arg0.anInt5718 != -1 && arg0.anInt5710 == 0) {
			@Pc(33) Class361 local33 = Static115.aClass227_1.method5968(arg0.anInt5718);
			if (arg0.anInt5793 > 0 && local33.anInt9859 == 0) {
				Static585.anInt9592 = -1;
				arg0.anInt5794++;
				Static374.anInt7015 = 0;
				return;
			}
			if (arg0.anInt5793 <= 0 && local33.anInt9856 == 0) {
				Static374.anInt7015 = 0;
				arg0.anInt5794++;
				Static585.anInt9592 = -1;
				return;
			}
		}
		@Pc(101) Class361 local101;
		@Pc(88) Class145 local88;
		if (arg0.anInt5720 != -1 && Static101.anInt2262 >= arg0.anInt5755) {
			local88 = Static275.aClass68_2.method2087(arg0.anInt5720);
			if (local88.aBoolean288 && local88.anInt4224 != -1) {
				local101 = Static115.aClass227_1.method5968(local88.anInt4224);
				if (arg0.anInt5793 > 0 && local101.anInt9859 == 0) {
					arg0.anInt5794++;
					Static374.anInt7015 = 0;
					Static585.anInt9592 = -1;
					return;
				}
				if (arg0.anInt5793 <= 0 && local101.anInt9856 == 0) {
					Static585.anInt9592 = -1;
					arg0.anInt5794++;
					Static374.anInt7015 = 0;
					return;
				}
			}
		}
		if (arg0.anInt5720 != -1 && arg0.anInt5755 <= Static101.anInt2262) {
			local88 = Static275.aClass68_2.method2087(arg0.anInt5720);
			if (local88.aBoolean288 && local88.anInt4224 != -1) {
				local101 = Static115.aClass227_1.method5968(local88.anInt4224);
				if (arg0.anInt5793 > 0 && local101.anInt9859 == 0) {
					Static585.anInt9592 = -1;
					Static374.anInt7015 = 0;
					arg0.anInt5794++;
					return;
				}
				if (arg0.anInt5793 <= 0 && local101.anInt9856 == 0) {
					arg0.anInt5794++;
					Static374.anInt7015 = 0;
					Static585.anInt9592 = -1;
					return;
				}
			}
		}
		@Pc(222) int local222 = arg0.anInt8916;
		@Pc(225) int local225 = arg0.anInt8911;
		@Pc(242) int local242 = arg0.anIntArray310[arg0.anInt5792 - 1] * 512 + arg0.method5059() * 256;
		@Pc(258) int local258 = arg0.anIntArray309[arg0.anInt5792 - 1] * 512 + arg0.method5059() * 256;
		if (local242 <= local222) {
			if (local222 > local242) {
				if (local225 < local258) {
					arg0.method5065(6144);
				} else if (local225 <= local258) {
					arg0.method5065(4096);
				} else {
					arg0.method5065(2048);
				}
			} else if (local225 < local258) {
				arg0.method5065(8192);
			} else if (local258 < local225) {
				arg0.method5065(0);
			}
		} else if (local225 < local258) {
			arg0.method5065(10240);
		} else if (local225 <= local258) {
			arg0.method5065(12288);
		} else {
			arg0.method5065(14336);
		}
		@Pc(352) byte local352 = arg0.aByteArray61[arg0.anInt5792 - 1];
		if (!arg1 && (local242 - local222 > 1024 || local242 - local222 < -1024 || local258 - local225 > 1024 || local258 - local225 < -1024)) {
			arg0.anInt8911 = local258;
			arg0.anInt8916 = local242;
			arg0.method5067(arg0.anInt5712, false);
			arg0.anInt5792--;
			Static585.anInt9592 = -1;
			Static374.anInt7015 = 0;
			if (arg0.anInt5793 > 0) {
				arg0.anInt5793--;
			}
			return;
		}
		@Pc(421) int local421 = 16;
		@Pc(423) boolean local423 = true;
		if (arg0 instanceof Class4_Sub1_Sub2_Sub1_Sub1) {
			local423 = ((Class4_Sub1_Sub2_Sub1_Sub1) arg0).aClass109_1.aBoolean195;
		}
		@Pc(461) int local461;
		if (local423) {
			local461 = arg0.anInt5712 - arg0.aClass63_7.anInt2110;
			if (local461 != 0 && arg0.anInt5744 == -1 && arg0.anInt5739 != 0) {
				local421 = 8;
			}
			if (!arg1 && arg0.anInt5792 > 2) {
				local421 = 24;
			}
			if (!arg1 && arg0.anInt5792 > 3) {
				local421 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt5792 > 1) {
				local421 = 24;
			}
			if (!arg1 && arg0.anInt5792 > 2) {
				local421 = 32;
			}
		}
		if (arg0.anInt5794 > 0 && arg0.anInt5792 > 1) {
			arg0.anInt5794--;
			local421 = 32;
		}
		if (local352 == 2) {
			local421 <<= 0x1;
		} else if (local352 == 0) {
			local421 >>= 0x1;
		}
		if (local9.anInt4174 != -1) {
			local421 <<= 0x9;
			if (arg0.anInt5792 == 1) {
				local461 = arg0.anInt5795 * arg0.anInt5795;
				@Pc(566) int local566 = (local242 < arg0.anInt8916 ? arg0.anInt8916 - local242 : local242 + -arg0.anInt8916) << 9;
				@Pc(587) int local587 = (arg0.anInt8911 <= local258 ? local258 - arg0.anInt8911 : -local258 + arg0.anInt8911) << 9;
				@Pc(594) int local594 = local566 > local587 ? local566 : local587;
				@Pc(601) int local601 = local9.anInt4174 * 2 * local594;
				if (local601 < local461) {
					arg0.anInt5795 /= 2;
				} else if (local461 / 2 > local594) {
					arg0.anInt5795 -= local9.anInt4174;
					if (arg0.anInt5795 < 0) {
						arg0.anInt5795 = 0;
					}
				} else if (arg0.anInt5795 < local421) {
					arg0.anInt5795 += local9.anInt4174;
					if (arg0.anInt5795 > local421) {
						arg0.anInt5795 = local421;
					}
				}
			} else if (local421 > arg0.anInt5795) {
				arg0.anInt5795 += local9.anInt4174;
				if (local421 < arg0.anInt5795) {
					arg0.anInt5795 = local421;
				}
			} else if (arg0.anInt5795 > 0) {
				arg0.anInt5795 -= local9.anInt4174;
				if (arg0.anInt5795 < 0) {
					arg0.anInt5795 = 0;
				}
			}
			local421 = arg0.anInt5795 >> 9;
			if (local421 < 1) {
				local421 = 1;
			}
		}
		Static374.anInt7015 = 0;
		if (local222 == local242 && local258 == local225) {
			Static585.anInt9592 = -1;
		} else {
			if (local242 > local222) {
				Static374.anInt7015 |= 0x4;
				arg0.anInt8916 += local421;
				if (arg0.anInt8916 > local242) {
					arg0.anInt8916 = local242;
				}
			} else if (local242 < local222) {
				arg0.anInt8916 -= local421;
				Static374.anInt7015 |= 0x8;
				if (arg0.anInt8916 < local242) {
					arg0.anInt8916 = local242;
				}
			}
			if (local225 < local258) {
				Static374.anInt7015 |= 0x1;
				arg0.anInt8911 += local421;
				if (local258 < arg0.anInt8911) {
					arg0.anInt8911 = local258;
				}
			} else if (local258 < local225) {
				arg0.anInt8911 -= local421;
				Static374.anInt7015 |= 0x2;
				if (local258 > arg0.anInt8911) {
					arg0.anInt8911 = local258;
				}
			}
			if (local421 < 32) {
				Static585.anInt9592 = local352;
			} else {
				Static585.anInt9592 = 2;
			}
		}
		if (local242 == arg0.anInt8916 && arg0.anInt8911 == local258) {
			if (arg0.anInt5793 > 0) {
				arg0.anInt5793--;
			}
			arg0.anInt5792--;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ID)V")
	public static void method7130(@OriginalArg(1) double arg0) {
		if (Static244.aDouble13 == arg0) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(29) int local29 = (int) (Math.pow((double) local17 / 255.0D, arg0) * 255.0D);
			Static281.anIntArray554[local17] = local29 <= 255 ? local29 : 255;
		}
		Static244.aDouble13 = arg0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I[I[Ljava/lang/Object;)V")
	public static void method7132(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static353.method5833(arg1, arg0.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!jw;)V")
	public static void method7133(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(37) int local37;
			for (@Pc(7) int local7 = 0; local7 < Static93.anIntArray83[local4]; local7++) {
				if (Static276.aClass4_Sub1ArrayArray1[local4][local7] == arg0) {
					Static653.method6855(Static276.aClass4_Sub1ArrayArray1[local4], local7 + 1, Static276.aClass4_Sub1ArrayArray1[local4], local7, Static93.anIntArray83[local4] - local7 - 1);
					local37 = Static93.anIntArray83[local4]--;
					Static585.aBoolean690 = true;
					return;
				}
			}
			for (@Pc(51) int local51 = 0; local51 < Static62.anIntArray650[local4]; local51++) {
				if (Static368.aClass4_Sub1ArrayArray2[local4][local51] == arg0) {
					Static653.method6855(Static368.aClass4_Sub1ArrayArray2[local4], local51 + 1, Static368.aClass4_Sub1ArrayArray2[local4], local51, Static62.anIntArray650[local4] - local51 - 1);
					local37 = Static62.anIntArray650[local4]--;
					return;
				}
			}
			for (@Pc(93) int local93 = 0; local93 < Static582.anIntArray612[local4]; local93++) {
				if (Static491.aClass4_Sub1ArrayArray3[local4][local93] == arg0) {
					Static653.method6855(Static491.aClass4_Sub1ArrayArray3[local4], local93 + 1, Static491.aClass4_Sub1ArrayArray3[local4], local93, Static582.anIntArray612[local4] - local93 - 1);
					local37 = Static582.anIntArray612[local4]--;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "()V")
	public static void method7141() {
		for (@Pc(1) int local1 = Static611.anInt9885; local1 < Static442.anInt7929; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static569.anInt9425; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static293.anInt5181; local7++) {
					@Pc(16) Class77 local16 = Static330.aClass77ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class4_Sub1_Sub3 local21 = local16.aClass4_Sub1_Sub3_2;
						@Pc(24) Class4_Sub1_Sub3 local24 = local16.aClass4_Sub1_Sub3_1;
						if (local21 != null && local21.method7690()) {
							Static15.method838(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7690()) {
								Static15.method838(local24, local1, local4, local7, 1, 1);
								local24.method7696(0, local21, Static232.aClass5_8, 0, false, 0);
								local24.method7697();
							}
							local21.method7697();
						}
						for (@Pc(68) Class128 local68 = local16.aClass128_1; local68 != null; local68 = local68.aClass128_2) {
							@Pc(72) Class4_Sub1_Sub2 local72 = local68.aClass4_Sub1_Sub2_1;
							if (local72 != null && local72.method7690()) {
								Static15.method838(local72, local1, local4, local7, local72.aShort117 + 1 - local72.aShort118, local72.aShort119 - local72.aShort116 + 1);
								local72.method7697();
							}
						}
						@Pc(108) Class4_Sub1_Sub5 local108 = local16.aClass4_Sub1_Sub5_1;
						if (local108 != null && local108.method7690()) {
							Static46.method1405(local108, local1, local4, local7);
							local108.method7697();
						}
					}
				}
			}
		}
	}
}
