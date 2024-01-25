import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "Ljava/lang/Object;")
	public static Object anObject59;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public static void method7724() {
		Static367.anIntArray497 = null;
		Static132.aBoolean242 = false;
		Static15.anIntArray27 = null;
		Static83.anIntArray134 = null;
		Static442.anIntArray641 = null;
		Static233.anIntArray359 = null;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIBJI)Ljava/lang/String;")
	public static String method7725(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local7 = '.';
			local9 = ',';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg2 < 0L) {
			local32 = true;
			arg2 = -arg2;
		}
		@Pc(46) StringBuffer local46 = new StringBuffer(26);
		@Pc(50) int local50;
		@Pc(55) int local55;
		if (arg1 > 0) {
			for (local50 = 0; local50 < arg1; local50++) {
				local55 = (int) arg2;
				arg2 /= 10L;
				local46.append((char) (local55 + 48 - (int) arg2 * 10));
			}
			local46.append(local7);
		}
		local50 = 0;
		while (true) {
			local55 = (int) arg2;
			arg2 /= 10L;
			local46.append((char) (local55 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local32) {
					local46.append('-');
				}
				return local46.reverse().toString();
			}
			if (arg0) {
				local50++;
				if (local50 % 3 == 0) {
					local46.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZLclient!an;)V")
	public static void method7727(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class9_Sub1_Sub1_Sub2_Sub1 arg1) {
		if (Static151.anInt3123 >= 400) {
			return;
		}
		@Pc(14) Class294 local14 = arg1.aClass294_1;
		if (local14.anIntArray588 != null) {
			local14 = local14.method6429(Static427.aClass56_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean599) {
			return;
		}
		@Pc(32) String local32 = local14.aString104;
		if (local14.anInt7596 != 0) {
			@Pc(51) String local51 = Static560.aClass211_4 == Static227.aClass211_1 ? Static48.aClass33_32.method797(Static131.anInt2839) : Static48.aClass33_30.method797(Static131.anInt2839);
			local32 = local32 + Static518.method6899(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503, local14.anInt7596) + " (" + local51 + local14.anInt7596 + ")";
		}
		if (Static380.aBoolean537 && !arg0) {
			@Pc(88) Class14 local88 = Static472.anInt7697 == -1 ? null : Static69.aClass118_1.method3019(Static472.anInt7697);
			if ((Static301.anInt5410 & 0x2) != 0 && (local88 == null || local14.method6434(Static472.anInt7697, local88.anInt534) != local88.anInt534)) {
				Static577.method3272(20, 0, -1, (long) arg1.anInt6429, Static484.aString107, 0, true, Static466.aString125 + " -> <col=ffff00>" + local32, Static456.anInt8051, false);
			}
		}
		if (!arg0) {
			@Pc(138) String[] local138 = local14.aStringArray40;
			if (Static405.aBoolean554) {
				local138 = Static39.method726(local138);
			}
			@Pc(148) int local148;
			if (local138 != null) {
				for (local148 = 4; local148 >= 0; local148--) {
					if (local138[local148] != null && (local14.aByte108 == 0 || !local138[local148].equalsIgnoreCase(Static48.aClass33_25.method797(Static131.anInt2839)))) {
						@Pc(170) byte local170 = 0;
						@Pc(172) int local172 = Static245.anInt4537;
						if (local148 == 0) {
							local170 = 22;
						}
						if (local148 == 1) {
							local170 = 60;
						}
						if (local148 == 2) {
							local170 = 48;
						}
						if (local148 == 3) {
							local170 = 59;
						}
						if (local14.anInt7609 == local148) {
							local172 = local14.anInt7629;
						}
						if (local148 == 4) {
							local170 = 25;
						}
						if (local148 == local14.anInt7594) {
							local172 = local14.anInt7610;
						}
						Static577.method3272(local170, 0, -1, (long) arg1.anInt6429, local138[local148], 0, true, "<col=ffff00>" + local32, local138[local148].equalsIgnoreCase(Static48.aClass33_25.method797(Static131.anInt2839)) ? local14.anInt7630 : local172, false);
					}
				}
			}
			if (local14.aByte108 == 1 && local138 != null) {
				for (local148 = 4; local148 >= 0; local148--) {
					if (local138[local148] != null && local138[local148].equalsIgnoreCase(Static48.aClass33_25.method797(Static131.anInt2839))) {
						@Pc(296) short local296 = 0;
						if (local14.anInt7596 > Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503) {
							local296 = 2000;
						}
						@Pc(309) short local309 = 0;
						if (local148 == 0) {
							local309 = 22;
						}
						if (local148 == 1) {
							local309 = 60;
						}
						if (local148 == 2) {
							local309 = 48;
						}
						if (local148 == 3) {
							local309 = 59;
						}
						if (local148 == 4) {
							local309 = 25;
						}
						if (local309 != 0) {
							local309 += local296;
						}
						Static577.method3272(local309, 0, -1, (long) arg1.anInt6429, local138[local148], 0, true, "<col=ffff00>" + local32, local14.anInt7630, false);
					}
				}
			}
		}
		Static577.method3272(1011, 0, -1, (long) arg1.anInt6429, Static48.aClass33_24.method797(Static131.anInt2839), 0, true, "<col=ffff00>" + local32, Static347.anInt6096, arg0);
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)V")
	public static void method7728() {
		Static142.aClass310_10.method6605();
		Static293.aClass38_4.method1067();
		Static529.aClass38_6.method1067();
	}
}
