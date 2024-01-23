import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
	public static int anInt4252;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
	public static int[] anIntArray363 = new int[14];

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "[I")
	public static int[] anIntArray364 = new int[5];

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "[I")
	public static int[] anIntArray365 = new int[100];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public static void method3603() {
		Static127.aClass1_Sub14_Sub1_3.method1408(126);
		Static127.aClass1_Sub14_Sub1_3.method1374(0L);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)V")
	public static void method3604(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static304.anInt5394;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(15) int local15;
		@Pc(34) Class15_Sub5_Sub2 local34;
		@Pc(93) int local93;
		@Pc(183) int local183;
		@Pc(189) int local189;
		@Pc(213) int local213;
		@Pc(222) int local222;
		@Pc(115) int local115;
		for (local15 = 0; local15 < local7; local15++) {
			if (arg0 == 0) {
				local34 = Static90.aClass15_Sub5_Sub2_2;
			} else {
				local34 = Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local15]];
			}
			if (local34 != null && local34.method4685()) {
				@Pc(50) int local50 = local34.method4702();
				if (arg0 == 0 || arg0 == local50) {
					@Pc(88) int local88;
					if (local50 == 1) {
						if ((local34.anInt5559 & 0x7F) == 64 && (local34.anInt5557 & 0x7F) == 64) {
							local88 = local34.anInt5559 >> 7;
							local93 = local34.anInt5557 >> 7;
							if (local88 >= 0 && local88 < 104 && local93 >= 0 && local93 < 104) {
								local115 = Static281.anIntArrayArray41[local88][local93]++;
							}
						}
					} else if (((local50 & 0x1) != 0 || (local34.anInt5559 & 0x7F) == 0 && (local34.anInt5557 & 0x7F) == 0) && ((local50 & 0x1) != 1 || (local34.anInt5559 & 0x7F) == 64 && (local34.anInt5557 & 0x7F) == 64)) {
						local88 = local34.anInt5559 - local50 * 64 >> 7;
						local93 = local34.anInt5557 - local50 * 64 >> 7;
						local183 = local88 + local34.method4702();
						local189 = local34.method4702() + local93;
						if (local189 > 104) {
							local189 = 104;
						}
						if (local183 > 104) {
							local183 = 104;
						}
						if (local93 < 0) {
							local93 = 0;
						}
						if (local88 < 0) {
							local88 = 0;
						}
						for (local213 = local88; local213 < local183; local213++) {
							for (local222 = local93; local222 < local189; local222++) {
								local115 = Static281.anIntArrayArray41[local213][local222]++;
							}
						}
					}
				}
			}
		}
		label226: for (local15 = 0; local15 < local7; local15++) {
			@Pc(263) long local263;
			if (arg0 == 0) {
				local34 = Static90.aClass15_Sub5_Sub2_2;
				local263 = 8791798054912L;
			} else {
				local34 = Static17.aClass15_Sub5_Sub2Array1[Static275.anIntArray440[local15]];
				local263 = (long) Static275.anIntArray440[local15] << 32;
			}
			if (local34 != null && local34.method4685()) {
				local93 = local34.method4702();
				if (arg0 == 0 || local93 == arg0) {
					local34.aBoolean378 = false;
					local34.aBoolean370 = true;
					if ((Static152.aBoolean35 && Static304.anInt5394 > 200 || Static304.anInt5394 > 50) && arg0 != 0 && local34.anInt5569 == local34.method4698().anInt206) {
						local34.aBoolean378 = true;
					}
					if (local93 == 1) {
						if ((local34.anInt5559 & 0x7F) == 64 && (local34.anInt5557 & 0x7F) == 64) {
							local189 = local34.anInt5557 >> 7;
							local183 = local34.anInt5559 >> 7;
							if (local183 < 0 || local183 >= 104 || local189 < 0 || local189 >= 104) {
								continue;
							}
							if (Static281.anIntArrayArray41[local183][local189] > 1) {
								local115 = Static281.anIntArrayArray41[local183][local189]--;
								continue;
							}
						}
					} else if ((local93 & 0x1) == 0 && (local34.anInt5559 & 0x7F) == 0 && (local34.anInt5557 & 0x7F) == 0 || (local93 & 0x1) == 1 && (local34.anInt5559 & 0x7F) == 64 && (local34.anInt5557 & 0x7F) == 0) {
						local183 = local34.anInt5559 - local93 * 64 >> 7;
						local189 = local34.anInt5557 - local93 * 64 >> 7;
						local213 = local93 + local183;
						local222 = local189 + local93;
						if (local213 > 104) {
							local213 = 104;
						}
						if (local222 > 104) {
							local222 = 104;
						}
						if (local189 < 0) {
							local189 = 0;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						@Pc(498) boolean local498 = true;
						@Pc(500) int local500;
						@Pc(509) int local509;
						for (local500 = local183; local500 < local213; local500++) {
							for (local509 = local189; local509 < local222; local509++) {
								if (Static281.anIntArrayArray41[local500][local509] <= 1) {
									local498 = false;
									break;
								}
							}
						}
						if (local498) {
							local500 = local183;
							while (true) {
								if (local213 <= local500) {
									continue label226;
								}
								for (local509 = local189; local509 < local222; local509++) {
									local115 = Static281.anIntArrayArray41[local500][local509]--;
								}
								local500++;
							}
						}
					}
					if (local34.anObject7 == null || local34.anInt5588 > Static313.anInt2966 || Static313.anInt2966 >= local34.anInt5582) {
						local34.aBoolean370 = false;
						local34.anInt5587 = Static69.method4275(local34.anInt5557, Static65.anInt1300, local34.anInt5559);
						Static95.method1737(Static65.anInt1300, local34.anInt5559, local34.anInt5557, local34.anInt5587, local93 * 64 + 60 - 64, local34, local34.anInt5554, local263, local34.aBoolean372);
					} else {
						local34.aBoolean378 = false;
						local34.aBoolean370 = false;
						local34.anInt5587 = Static69.method4275(local34.anInt5557, Static65.anInt1300, local34.anInt5559);
						Static70.method1403(Static65.anInt1300, local34.anInt5559, local34.anInt5557, local34.anInt5587, local34, local34.anInt5554, local263, local34.anInt5545, local34.anInt5551, local34.anInt5570, local34.anInt5595);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIZI)V")
	public static void method3607(@OriginalArg(2) boolean arg0) {
		Static202.anInt3871 = 2;
		Static257.aBoolean319 = arg0;
		Static303.anInt5383 = 22050;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)I")
	public static int method3608(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 + arg0 * 57;
		@Pc(24) int local24 = local10 << 13 ^ local10;
		@Pc(38) int local38 = (local24 * 15731 * local24 + 789221) * local24 + 1376312589 & Integer.MAX_VALUE;
		return local38 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method3610(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg1.length();
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local10 - local17 || local15 - local19 < local13) {
			if (local8 <= local10 - local17) {
				return -1;
			}
			if (local13 <= local15 - local19) {
				return 1;
			}
			@Pc(63) char local63;
			if (local17 == '\u0000') {
				local63 = arg2.charAt(local10++);
			} else {
				local63 = local17;
			}
			@Pc(76) char local76;
			if (local19 == '\u0000') {
				local76 = arg1.charAt(local15++);
			} else {
				local76 = local19;
			}
			local17 = Static42.method800(local63);
			local19 = Static42.method800(local76);
			local63 = Static111.method1983(arg0, local63);
			local76 = Static111.method1983(arg0, local76);
			if (local76 != local63 && Character.toUpperCase(local63) != Character.toUpperCase(local76)) {
				local63 = Character.toLowerCase(local63);
				local76 = Character.toLowerCase(local76);
				if (local76 != local63) {
					return Static53.method969(arg0, local63) - Static53.method969(arg0, local76);
				}
			}
		}
		@Pc(148) int local148 = Math.min(local8, local13);
		@Pc(188) char local188;
		@Pc(150) int local150;
		for (local150 = 0; local150 < local148; local150++) {
			if (arg0 == 2) {
				local15 = local13 - local150 - 1;
				local10 = local8 - local150 - 1;
			} else {
				local15 = local150;
				local10 = local150;
			}
			@Pc(184) char local184 = arg2.charAt(local10);
			local188 = arg1.charAt(local15);
			if (local184 != local188 && Character.toUpperCase(local184) != Character.toUpperCase(local188)) {
				local184 = Character.toLowerCase(local184);
				local188 = Character.toLowerCase(local188);
				if (local188 != local184) {
					return Static53.method969(arg0, local184) - Static53.method969(arg0, local188);
				}
			}
		}
		local150 = local8 - local13;
		if (local150 != 0) {
			return local150;
		}
		for (@Pc(247) int local247 = 0; local247 < local148; local247++) {
			local188 = arg2.charAt(local247);
			@Pc(262) char local262 = arg1.charAt(local247);
			if (local262 != local188) {
				return Static53.method969(arg0, local188) - Static53.method969(arg0, local262);
			}
		}
		return 0;
	}
}
