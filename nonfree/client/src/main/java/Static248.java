import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!s", name = "M", descriptor = "Lclient!en;")
	public static Class47 aClass47_6;

	@OriginalMember(owner = "client!s", name = "O", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!s", name = "L", descriptor = "I")
	public static int anInt5062 = 0;

	@OriginalMember(owner = "client!s", name = "P", descriptor = "I")
	public static int anInt5064 = 5063219;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
	public static int anInt5065 = -1;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V")
	public static void method3834() {
		if (Static157.aClass15_2 != null) {
			Static157.aClass15_2.method1248();
		}
		if (Static114.aClass15_1 != null) {
			Static114.aClass15_1.method1248();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!qm;I)Lclient!jc;")
	public static Class84 method3835(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(14) Class84 local14 = new Class84();
		local14.anInt2714 = arg0.method2244();
		local14.aClass1_Sub3_Sub17_1 = Static240.method3781(local14.anInt2714);
		return local14;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(II)I")
	public static int method3836(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = arg0 >> 6 & 0x3;
		@Pc(20) int local20 = arg0 & 0x3F;
		if (local20 == 18) {
			if (local16 == 0) {
				return 1;
			}
			if (local16 == 1) {
				return 2;
			}
			if (local16 == 2) {
				return 4;
			}
			if (local16 == 3) {
				return 8;
			}
		} else if (local20 == 19 || local20 == 21) {
			if (local16 == 0) {
				return 16;
			}
			if (local16 == 1) {
				return 32;
			}
			if (local16 == 2) {
				return 64;
			}
			if (local16 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(II)V")
	public static void method3837(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub3_Sub22 local4 = Static271.method4108(7, arg0);
		local4.method4464();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!qm;Z)V")
	public static void method3839(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(9) int local9 = Static268.anInt2658 >> 1;
		@Pc(13) byte[][] local13 = new byte[Static268.anInt2657][Static268.anInt2659];
		@Pc(19) int local19 = Static268.anInt2660 >> 2 << 10;
		@Pc(31) int local31;
		@Pc(101) int local101;
		@Pc(114) int local114;
		while (arg0.aByteArray55.length > arg0.anInt3000) {
			local31 = 0;
			@Pc(33) boolean local33 = false;
			@Pc(35) int local35 = 0;
			if (arg0.method2199() == 1) {
				local31 = arg0.method2199();
				local35 = arg0.method2199();
				local33 = true;
			}
			@Pc(57) int local57 = arg0.method2199();
			@Pc(61) int local61 = arg0.method2199();
			@Pc(68) int local68 = local57 * 64 - Static268.anInt2655;
			@Pc(79) int local79 = Static268.anInt2659 + Static268.anInt2656 - local61 * 64 - 1;
			if (local68 >= 0 && local79 - 63 >= 0 && local68 + 63 < Static268.anInt2657 && local79 < Static268.anInt2659) {
				for (local101 = 0; local101 < 64; local101++) {
					@Pc(112) byte[] local112 = local13[local68 + local101];
					for (local114 = 0; local114 < 64; local114++) {
						if (!local33 || local31 * 8 <= local101 && local101 < local31 * 8 + 8 && local35 * 8 <= local114 && local114 < local35 * 8 + 8) {
							local112[local79 - local114] = arg0.method2212();
						}
					}
				}
			} else if (local33) {
				arg0.anInt3000 += 64;
			} else {
				arg0.anInt3000 += 4096;
			}
		}
		local31 = Static268.anInt2659;
		@Pc(192) int[] local192 = new int[local31];
		@Pc(194) int local194 = Static268.anInt2657;
		@Pc(197) int[] local197 = new int[local31];
		@Pc(200) int[] local200 = new int[local31];
		@Pc(203) int[] local203 = new int[local31];
		@Pc(210) int[] local210 = new int[local31];
		for (local101 = -5; local101 < local194; local101++) {
			if ((local101 & 0x1FF) == 0) {
				Static215.method3449(true);
			}
			@Pc(250) int local250;
			@Pc(318) int local318;
			for (@Pc(232) int local232 = 0; local232 < local31; local232++) {
				local114 = local101 + 5;
				@Pc(298) int local298;
				if (local194 > local114) {
					local250 = local13[local114][local232] & 0xFF;
					if (local250 > 0) {
						@Pc(262) Class30 local262 = Static90.method1547(local250 - 1);
						local197[local232] += local262.anInt926;
						local192[local232] += local262.anInt927;
						local200[local232] += local262.anInt924;
						local203[local232] += local262.anInt920;
						local298 = local210[local232]++;
					}
				}
				local250 = local101 - 5;
				if (local250 >= 0) {
					local318 = local13[local250][local232] & 0xFF;
					if (local318 > 0) {
						@Pc(327) Class30 local327 = Static90.method1547(local318 - 1);
						local197[local232] -= local327.anInt926;
						local192[local232] -= local327.anInt927;
						local200[local232] -= local327.anInt924;
						local203[local232] -= local327.anInt920;
						local298 = local210[local232]--;
					}
				}
			}
			if (local101 >= 0) {
				@Pc(380) int[][] local380 = Static268.anIntArrayArrayArray5[local101 >> 6];
				local318 = 0;
				local250 = 0;
				@Pc(386) int local386 = 0;
				@Pc(388) int local388 = 0;
				local114 = 0;
				for (@Pc(392) int local392 = -5; local392 < local31; local392++) {
					@Pc(403) int local403 = local392 + 5;
					if (local403 < local31) {
						local386 += local203[local403];
						local318 += local200[local403];
						local388 += local210[local403];
						local250 += local192[local403];
						local114 += local197[local403];
					}
					@Pc(441) int local441 = local392 - 5;
					if (local441 >= 0) {
						local388 -= local210[local441];
						local114 -= local197[local441];
						local250 -= local192[local441];
						local318 -= local200[local441];
						local386 -= local203[local441];
					}
					if (local392 >= 0 && local388 > 0) {
						@Pc(488) int[] local488 = local380[local392 >> 6];
						@Pc(506) int local506 = local386 == 0 ? 0 : Static21.method457(local318 / local388, local250 / local388, local114 * 256 / local386);
						if (local13[local101][local392] != 0) {
							if (local488 == null) {
								local488 = local380[local392 >> 6] = new int[4096];
							}
							@Pc(547) int local547 = local9 + (local506 & 0x7F);
							if (local547 < 0) {
								local547 = 0;
							} else if (local547 > 127) {
								local547 = 127;
							}
							@Pc(574) int local574 = (local19 + local506 & 0xFC00) + ((local506 & 0x380) + local547);
							local488[(local101 & 0x3F) + ((local392 & 0x3F) << 6)] = Static237.anIntArray462[Static213.method3404(96, local574)];
						} else if (local488 != null) {
							local488[(local101 & 0x3F) + ((local392 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}
}
