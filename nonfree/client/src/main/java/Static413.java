import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public static int anInt7051;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "F")
	public static float aFloat141;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Z")
	public static boolean aBoolean529 = false;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "[I")
	public static final int[] anIntArray439 = new int[8];

	@OriginalMember(owner = "client!po", name = "k", descriptor = "[Lclient!we;")
	public static final Class359[] aClass359Array1 = new Class359[100];

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!r;ILclient!sf;B)V")
	public static void method5921(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class308 arg2) {
		@Pc(17) int local17;
		if (Static252.anIntArray241 != null && arg2.aByte106 >= arg1) {
			for (local17 = 0; local17 < Static252.anIntArray241.length; local17++) {
				if (Static252.anIntArray241[local17] != -1000000 && (arg2.anIntArray505[0] <= Static252.anIntArray241[local17] || Static252.anIntArray241[local17] >= arg2.anIntArray505[1] || arg2.anIntArray505[2] <= Static252.anIntArray241[local17] || Static252.anIntArray241[local17] >= arg2.anIntArray505[3]) && (Static13.anIntArray302[local17] >= arg2.anIntArray506[0] || Static13.anIntArray302[local17] >= arg2.anIntArray506[1] || Static13.anIntArray302[local17] >= arg2.anIntArray506[2] || Static13.anIntArray302[local17] >= arg2.anIntArray506[3]) && (arg2.anIntArray506[0] >= Static552.anIntArray575[local17] || arg2.anIntArray506[1] >= Static552.anIntArray575[local17] || Static552.anIntArray575[local17] <= arg2.anIntArray506[2] || Static552.anIntArray575[local17] <= arg2.anIntArray506[3]) && (arg2.anIntArray504[0] <= Static344.anIntArray331[local17] || arg2.anIntArray504[1] <= Static344.anIntArray331[local17] || arg2.anIntArray504[2] <= Static344.anIntArray331[local17] || arg2.anIntArray504[3] <= Static344.anIntArray331[local17]) && (Static547.anIntArray572[local17] <= arg2.anIntArray504[0] || Static547.anIntArray572[local17] <= arg2.anIntArray504[1] || Static547.anIntArray572[local17] <= arg2.anIntArray504[2] || arg2.anIntArray504[3] >= Static547.anIntArray572[local17])) {
					return;
				}
			}
		}
		@Pc(253) int local253;
		@Pc(277) int local277;
		@Pc(292) boolean local292;
		@Pc(319) float local319;
		if (arg2.aByte107 == 1) {
			local17 = Static453.anInt7589 + arg2.aShort131 - Static5.anInt120;
			if (local17 >= 0 && local17 <= Static453.anInt7589 + Static453.anInt7589) {
				local253 = Static453.anInt7589 + arg2.aShort132 - Static394.anInt6891;
				if (local253 < 0) {
					local253 = 0;
				} else if (Static453.anInt7589 + Static453.anInt7589 < local253) {
					return;
				}
				local277 = arg2.aShort133 + Static453.anInt7589 - Static394.anInt6891;
				if (local277 > Static453.anInt7589 + Static453.anInt7589) {
					local277 = Static453.anInt7589 + Static453.anInt7589;
				} else if (local277 < 0) {
					return;
				}
				local292 = false;
				while (local253 <= local277) {
					if (Static562.aBooleanArrayArray7[local17][local253++]) {
						local292 = true;
						break;
					}
				}
				if (local292) {
					local319 = Static565.anInt9225 - arg2.anIntArray506[0];
					if (local319 < 0.0F) {
						local319 *= -1.0F;
					}
					if (!(float) Static505.anInt8220 > local319 && (Static183.method3141(arg2, 0) && (Static183.method3141(arg2, 1) && (Static183.method3141(arg2, 2) && Static183.method3141(arg2, 3))))) {
						Static121.aClass308Array2[Static465.anInt7743++] = arg2;
					}
				}
			}
		} else if (arg2.aByte107 == 2) {
			local17 = Static453.anInt7589 + arg2.aShort132 - Static394.anInt6891;
			if (local17 >= 0 && local17 <= Static453.anInt7589 + Static453.anInt7589) {
				local253 = Static453.anInt7589 + arg2.aShort131 - Static5.anInt120;
				if (local253 < 0) {
					local253 = 0;
				} else if (local253 > Static453.anInt7589 + Static453.anInt7589) {
					return;
				}
				local277 = arg2.aShort134 + Static453.anInt7589 - Static5.anInt120;
				if (Static453.anInt7589 + Static453.anInt7589 < local277) {
					local277 = Static453.anInt7589 + Static453.anInt7589;
				} else if (local277 < 0) {
					return;
				}
				local292 = false;
				while (local253 <= local277) {
					if (Static562.aBooleanArrayArray7[local253++][local17]) {
						local292 = true;
						break;
					}
				}
				if (local292) {
					local319 = Static316.anInt5406 - arg2.anIntArray504[0];
					if (local319 < 0.0F) {
						local319 *= -1.0F;
					}
					if (!((float) Static505.anInt8220 > local319) && (Static183.method3141(arg2, 0) && (Static183.method3141(arg2, 1) && (Static183.method3141(arg2, 2) && Static183.method3141(arg2, 3))))) {
						Static121.aClass308Array2[Static465.anInt7743++] = arg2;
					}
				}
			}
		} else if (arg2.aByte107 == 16 || arg2.aByte107 == 8) {
			local17 = Static453.anInt7589 + arg2.aShort131 - Static5.anInt120;
			if (local17 >= 0 && Static453.anInt7589 + Static453.anInt7589 >= local17) {
				local253 = arg2.aShort132 + Static453.anInt7589 - Static394.anInt6891;
				if (local253 >= 0 && local253 <= Static453.anInt7589 + Static453.anInt7589 && Static562.aBooleanArrayArray7[local17][local253]) {
					@Pc(567) float local567 = (float) (Static565.anInt9225 - arg2.anIntArray506[0]);
					if (local567 < 0.0F) {
						local567 *= -1.0F;
					}
					@Pc(584) float local584 = (float) (Static316.anInt5406 - arg2.anIntArray504[0]);
					if (local584 < 0.0F) {
						local584 *= -1.0F;
					}
					if ((!((float) Static505.anInt8220 > local567) || !((float) Static505.anInt8220 > local584)) && (Static183.method3141(arg2, 0) && (Static183.method3141(arg2, 1) && (Static183.method3141(arg2, 2) && Static183.method3141(arg2, 3))))) {
						Static121.aClass308Array2[Static465.anInt7743++] = arg2;
					}
				}
			}
		} else if (arg2.aByte107 == 4) {
			@Pc(651) float local651 = (float) (arg2.anIntArray505[0] - Static535.anInt8571);
			if (!((float) Static506.anInt8250 >= local651)) {
				local253 = arg2.aShort132 + Static453.anInt7589 - Static394.anInt6891;
				if (local253 < 0) {
					local253 = 0;
				} else if (local253 > Static453.anInt7589 + Static453.anInt7589) {
					return;
				}
				local277 = Static453.anInt7589 + arg2.aShort133 - Static394.anInt6891;
				if (Static453.anInt7589 + Static453.anInt7589 < local277) {
					local277 = Static453.anInt7589 + Static453.anInt7589;
				} else if (local277 < 0) {
					return;
				}
				@Pc(707) int local707 = Static453.anInt7589 + arg2.aShort131 - Static5.anInt120;
				if (local707 < 0) {
					local707 = 0;
				} else if (Static453.anInt7589 + Static453.anInt7589 < local707) {
					return;
				}
				@Pc(731) int local731 = Static453.anInt7589 + arg2.aShort134 - Static5.anInt120;
				if (local731 > Static453.anInt7589 + Static453.anInt7589) {
					local731 = Static453.anInt7589 + Static453.anInt7589;
				} else if (local731 < 0) {
					return;
				}
				@Pc(750) boolean local750 = false;
				label283: for (@Pc(752) int local752 = local707; local752 <= local731; local752++) {
					for (@Pc(756) int local756 = local253; local756 <= local277; local756++) {
						if (Static562.aBooleanArrayArray7[local752][local756]) {
							local750 = true;
							break label283;
						}
					}
				}
				if (local750 && (Static183.method3141(arg2, 0) && (Static183.method3141(arg2, 1) && (Static183.method3141(arg2, 2) && Static183.method3141(arg2, 3))))) {
					Static121.aClass308Array2[Static465.anInt7743++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!wp;I)V")
	public static void method5922(@OriginalArg(0) Class361 arg0) {
		if (!Static369.aBoolean463) {
			return;
		}
		if (arg0.anObjectArray17 != null) {
			@Pc(20) Class361 local20 = Static556.method7352(Static377.anInt6474, Static196.anInt9125);
			if (local20 != null) {
				@Pc(26) Class3_Sub32 local26 = new Class3_Sub32();
				local26.aClass361_7 = local20;
				local26.aClass361_6 = arg0;
				local26.anObjectArray1 = arg0.anObjectArray17;
				Static312.method4566(local26);
			}
		}
		@Pc(47) Class3_Sub42 local47 = Static591.method7910(Static9.aClass199_3, Static571.aClass303_98);
		local47.aClass3_Sub11_Sub1_1.method5215(arg0.anInt9594);
		local47.aClass3_Sub11_Sub1_1.method5167(arg0.anInt9608);
		local47.aClass3_Sub11_Sub1_1.method5171(Static377.anInt6474);
		local47.aClass3_Sub11_Sub1_1.method5176(arg0.anInt9645);
		local47.aClass3_Sub11_Sub1_1.method5176(Static196.anInt9125);
		local47.aClass3_Sub11_Sub1_1.method5176(Static28.anInt515);
		Static511.method6885(local47);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI[Lclient!wp;)V")
	public static void method5923(@OriginalArg(1) int arg0, @OriginalArg(2) Class361[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(18) Class361 local18 = arg1[local7];
			if (local18 != null && local18.anInt9663 == arg0 && !Static71.method1519(local18)) {
				if (local18.anInt9665 == 0) {
					method5923(local18.anInt9594, arg1);
					if (local18.aClass361Array2 != null) {
						method5923(local18.anInt9594, local18.aClass361Array2);
					}
					@Pc(55) Class3_Sub49 local55 = (Class3_Sub49) Static216.aClass354_18.method7689((long) local18.anInt9594);
					if (local55 != null) {
						Static18.method248(local55.anInt8836);
					}
				}
				if (local18.anInt9665 == 6 && local18.lb != -1) {
					@Pc(77) Class185 local77 = Static545.aClass240_2.method5680(local18.lb);
					if (local77 != null) {
						local18.anInt9596 += Static541.anInt8161;
						@Pc(88) int local88 = local18.anInt9644;
						while (local77.anIntArray282[local18.anInt9644] < local18.anInt9596) {
							local18.anInt9596 -= local77.anIntArray282[local18.anInt9644];
							local18.anInt9644++;
							if (local77.anIntArray280.length <= local18.anInt9644) {
								local18.anInt9644 -= local77.anInt4971;
								if (local18.anInt9644 < 0 || local18.anInt9644 >= local77.anIntArray280.length) {
									local18.anInt9644 = 0;
								}
							}
							local18.anInt9664 = local18.anInt9644 + 1;
							if (local77.anIntArray280.length <= local18.anInt9664) {
								local18.anInt9664 -= local77.anInt4971;
								if (local18.anInt9664 < 0 || local77.anIntArray280.length <= local18.anInt9664) {
									local18.anInt9664 = -1;
								}
							}
							Static186.method3170(local18);
						}
						if (local88 != local18.anInt9644) {
							Static407.method5864(local77, local18.anInt9644);
						}
					}
				}
			}
		}
	}
}
