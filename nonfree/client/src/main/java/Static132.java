import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "Lclient!gn;")
	public static final Class110 aClass110_3 = new Class110();

	@OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
	public static int anInt2629 = 0;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)I")
	public static int method2205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZZLclient!dg;)V")
	public static void method2206(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class49_Sub2_Sub2_Sub1 arg1) {
		if (Static16.anInt415 >= 400) {
			return;
		}
		if (arg1 != Static63.aClass49_Sub2_Sub2_Sub1_1) {
			@Pc(83) String local83;
			@Pc(137) int local137;
			if (arg1.anInt1756 == 0) {
				@Pc(87) boolean local87 = true;
				if (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1757 != -1 && arg1.anInt1757 != -1) {
					@Pc(112) int local112 = arg1.anInt1754 >= Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754 ? arg1.anInt1754 : Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754;
					@Pc(127) int local127 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1757 < arg1.anInt1757 ? Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1757 : arg1.anInt1757;
					local137 = local112 * 10 / 100 + local127 + 5;
					@Pc(144) int local144 = Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754 - arg1.anInt1754;
					if (local144 < 0) {
						local144 = -local144;
					}
					if (local144 > local137) {
						local87 = false;
					}
				}
				@Pc(167) String local167 = Static542.aClass101_4 == Static304.aClass101_1 ? Static243.aClass306_57.method7165(Static179.anInt3168) : Static374.aClass306_90.method7165(Static179.anInt3168);
				if (arg1.anInt1759 > arg1.anInt1754) {
					local83 = arg1.method1535() + (local87 ? Static458.method6482(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754, arg1.anInt1754) : "<col=ffffff>") + " (" + local167 + arg1.anInt1754 + "+" + (arg1.anInt1759 - arg1.anInt1754) + ")";
				} else {
					local83 = arg1.method1535() + (local87 ? Static458.method6482(Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754, arg1.anInt1754) : "<col=ffffff>") + " (" + local167 + arg1.anInt1754 + ")";
				}
			} else {
				local83 = arg1.method1535() + " (" + Static430.aClass306_84.method7165(Static179.anInt3168) + arg1.anInt1756 + ")";
			}
			if (Static431.aBoolean542 && !arg0 && (Static276.anInt9030 & 0x8) != 0) {
				Static13.method390((long) arg1.anInt4295, 0, Static170.aString32 + " -> <col=ffffff>" + local83, 0, 5, Static238.aString58, -1, true, false, Static222.anInt4414);
			}
			if (arg0) {
				Static13.method390(0L, 0, "", 0, -1, "<col=cccccc>" + local83, 0, false, true, -1);
			} else {
				for (@Pc(285) int local285 = 7; local285 >= 0; local285--) {
					if (Static457.aStringArray41[local285] != null) {
						@Pc(293) short local293 = 0;
						if (Static442.aClass101_3 == Static304.aClass101_1 && Static457.aStringArray41[local285].equalsIgnoreCase(Static230.aClass306_17.method7165(Static179.anInt3168))) {
							if (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1754 < arg1.anInt1754) {
								local293 = 2000;
							}
							if (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1752 != 0 && arg1.anInt1752 != 0) {
								if (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt1752 == arg1.anInt1752) {
									local293 = 2000;
								} else {
									local293 = 0;
								}
							}
						} else if (Static284.aBooleanArray35[local285]) {
							local293 = 2000;
						}
						@Pc(351) short local351 = (short) (Static480.aShortArray129[local285] + local293);
						local137 = Static108.anIntArray216[local285] == -1 ? Class145_Sub2.lb : Static108.anIntArray216[local285];
						Static13.method390((long) arg1.anInt4295, 0, "<col=ffffff>" + local83, 0, local351, Static457.aStringArray41[local285], -1, true, false, local137);
					}
				}
			}
			if (!arg0) {
				for (@Pc(418) Class1_Sub24 local418 = (Class1_Sub24) Static248.aClass37_30.method977(); local418 != null; local418 = (Class1_Sub24) Static248.aClass37_30.method971()) {
					if (local418.anInt3161 == 50) {
						local418.aString35 = "<col=ffffff>" + local83;
						return;
					}
				}
			}
		} else if (Static431.aBoolean542 && (Static276.anInt9030 & 0x10) != 0) {
			Static13.method390(0L, 0, Static170.aString32 + " -> <col=ffffff>" + Static326.aClass306_71.method7165(Static179.anInt3168), 0, 60, Static238.aString58, -1, true, false, Static222.anInt4414);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2208(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				@Pc(70) char local70 = Static23.aCharArray49[(int) (local56 - arg0 * 37L)];
				if (local70 == '_') {
					@Pc(80) int local80 = local52.length() - 1;
					local70 = ' ';
					local52.setCharAt(local80, Character.toUpperCase(local52.charAt(local80)));
				}
				local52.append(local70);
			}
			local52.reverse();
			local52.setCharAt(0, Character.toUpperCase(local52.charAt(0)));
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!raa;ILclient!qa;Lclient!bl;I)Z")
	public static boolean method2209(@OriginalArg(1) Class1_Sub39 arg0, @OriginalArg(3) Class122 arg1, @OriginalArg(4) Class30 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray120 != null) {
			local13 = Static118.anInt821 - (Static118.anInt821 - Static118.anInt819) * (arg2.anInt893 + arg0.anInt7250 - Static118.anInt820) / (Static118.anInt811 - Static118.anInt820);
			local11 = Static118.anInt821 - (arg0.anInt7250 + arg2.anInt894 - Static118.anInt820) * (Static118.anInt821 - Static118.anInt819) / (Static118.anInt811 - Static118.anInt820);
			local7 = Static118.anInt817 + (arg2.anInt869 + arg0.anInt7249 - Static118.anInt814) * (Static118.anInt812 - Static118.anInt817) / (Static118.anInt822 - Static118.anInt814);
			local9 = Static118.anInt817 + (arg2.anInt879 + arg0.anInt7249 - Static118.anInt814) * (-Static118.anInt817 + Static118.anInt812) / (Static118.anInt822 - Static118.anInt814);
		}
		@Pc(103) Class2 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg2.anInt873 != -1) {
			if (arg0.aBoolean521 && arg2.anInt895 != -1) {
				local103 = arg2.method913(arg1, true);
			} else {
				local103 = arg2.method913(arg1, false);
			}
			if (local103 != null) {
				local105 = arg0.anInt7252 - (local103.EA() + 1 >> 1);
				local107 = arg0.anInt7252 + (local103.EA() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				local109 = arg0.anInt7251 - (local103.ma() + 1 >> 1);
				if (local9 < local107) {
					local9 = local107;
				}
				if (local109 < local11) {
					local11 = local109;
				}
				local111 = arg0.anInt7251 + (local103.ma() + 1 >> 1);
				if (local111 > local13) {
					local13 = local111;
				}
			}
		}
		@Pc(214) Class226 local214 = null;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(284) int local284;
		@Pc(311) int local311;
		if (arg2.aString5 != null) {
			local214 = Static13.method386(arg2.anInt870);
			if (local214 != null) {
				local223 = Static454.aClass232_8.method5435(arg2.aString5, null, null, Static101.aStringArray40);
				local225 = arg0.anInt7251;
				if (local103 == null) {
					local225 -= local214.method5326() * local223 / 2;
				} else {
					local225 -= (local103.ma() >> 1) + local214.method5327() * local223;
				}
				for (local284 = 0; local284 < local223; local284++) {
					@Pc(290) String local290 = Static101.aStringArray40[local284];
					if (local223 - 1 > local284) {
						local290 = local290.substring(0, local290.length() - 4);
					}
					local311 = local214.method5328(local290);
					if (local227 < local311) {
						local227 = local311;
					}
				}
				local229 = arg0.anInt7252 - local227 / 2;
				local231 = arg0.anInt7252 + local227 / 2;
				if (local7 > local229) {
					local7 = local229;
				}
				if (local231 > local9) {
					local9 = local231;
				}
				local233 = local225;
				if (local11 > local233) {
					local11 = local233;
				}
				local235 = local223 * local214.method5327() + local225;
				if (local235 > local13) {
					local13 = local235;
				}
			}
		}
		if (local9 < Static118.anInt817 || local7 > Static118.anInt812 || Static118.anInt819 > local13 || local11 > Static118.anInt821) {
			return true;
		}
		@Pc(418) int local418;
		if (arg2.anIntArray120 != null) {
			@Pc(416) int[] local416 = new int[arg2.anIntArray120.length];
			for (local418 = 0; local418 < local416.length / 2; local418++) {
				local311 = arg0.anInt7249 + arg2.anIntArray120[local418 * 2];
				@Pc(442) int local442 = arg0.anInt7250 + arg2.anIntArray120[local418 * 2 + 1];
				local416[local418 * 2] = (local311 - Static118.anInt814) * (-Static118.anInt817 + Static118.anInt812) / (Static118.anInt822 - Static118.anInt814) + Static118.anInt817;
				local416[local418 * 2 + 1] = Static118.anInt821 - (Static118.anInt821 - Static118.anInt819) * (local442 - Static118.anInt820) / (Static118.anInt811 - Static118.anInt820);
			}
			Static12.method383(arg1, local416, arg2.anInt898);
			for (local311 = 0; local311 < local416.length / 2 - 1; local311++) {
				arg1.method7209(local416[local311 * 2 + 2], local416[local311 * 2], local416[local311 * 2 + 3], arg2.anInt889, local416[local311 * 2 + 1]);
			}
			arg1.method7209(local416[0], local416[local416.length - 2], local416[1], arg2.anInt889, local416[local416.length - 1]);
		}
		if (local103 != null) {
			if (Static546.anInt2811 > 0 && (Static361.anInt6368 != -1 && arg0.anInt7253 == Static361.anInt6368 || Static299.anInt5548 != -1 && Static299.anInt5548 == arg2.anInt871)) {
				if (Static99.anInt1989 > 50) {
					local284 = (100 - Static99.anInt1989) * 2;
				} else {
					local284 = Static99.anInt1989 * 2;
				}
				local418 = local284 << 24 | 0xFFFF00;
				arg1.method7213(local103.c() / 2 + 7, local418, arg0.anInt7252, arg0.anInt7251);
				arg1.method7213(local103.c() / 2 + 5, local418, arg0.anInt7252, arg0.anInt7251);
				arg1.method7213(local103.c() / 2 + 3, local418, arg0.anInt7252, arg0.anInt7251);
				arg1.method7213(local103.c() / 2 + 1, local418, arg0.anInt7252, arg0.anInt7251);
				arg1.method7213(local103.c() / 2, local418, arg0.anInt7252, arg0.anInt7251);
			}
			local103.method7364(arg0.anInt7252 - (local103.EA() >> 1), arg0.anInt7251 - (local103.ma() >> 1));
		}
		if (arg2.aString5 != null && local214 != null) {
			Static167.method3556(local227, local223, arg0, local214, local225, arg1, arg2);
		}
		if (arg2.anInt873 != -1 || arg2.aString5 != null) {
			@Pc(723) Class1_Sub43 local723 = new Class1_Sub43(arg0);
			local723.anInt7896 = local109;
			local723.anInt7891 = local105;
			local723.anInt7894 = local107;
			local723.anInt7890 = local229;
			local723.anInt7900 = local231;
			local723.anInt7898 = local233;
			local723.anInt7893 = local111;
			local723.anInt7892 = local235;
			Static442.aClass37_83.method970(local723);
		}
		return false;
	}
}
