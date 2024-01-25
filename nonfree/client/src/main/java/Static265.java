import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBII)I")
	public static int method3917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BB)V")
	public static void method3918(@OriginalArg(1) byte arg0) {
		if (Static366.aByteArrayArrayArray14 == null) {
			Static366.aByteArrayArrayArray14 = new byte[4][Static98.anInt361][Static438.anInt7120];
		}
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			for (@Pc(22) int local22 = 0; local22 < Static98.anInt361; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static438.anInt7120; local26++) {
					Static366.aByteArrayArrayArray14[local18][local22][local26] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)Z")
	public static boolean method3919() {
		return Static634.anInt6735 != 0;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public static void method3920() {
		if (!Static532.aBoolean580) {
			Static599.aBoolean544 = Static167.anInt3059 != -1 && Static167.anInt3059 <= Static166.anInt3037 || Static13.anInt306 < (Static653.aBoolean735 ? 26 : 22) + Static166.anInt3037 * 16;
		}
		Static472.aClass302_49.method6614();
		Static677.aClass302_72.method6614();
		@Pc(47) int local47;
		for (@Pc(42) Class3_Sub5_Sub18 local42 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6603(); local42 != null; local42 = (Class3_Sub5_Sub18) Static582.aClass302_69.method6605()) {
			local47 = local42.anInt9217;
			if (local47 < 1000) {
				local42.method9034();
				if (local47 == 3 || local47 == 4 || local47 == 13 || local47 == 49 || local47 == 30 || local47 == 10 || local47 == 57) {
					Static677.aClass302_72.method6613(local42);
				} else {
					Static472.aClass302_49.method6613(local42);
				}
			}
		}
		Static472.aClass302_49.method6606(Static582.aClass302_69);
		Static677.aClass302_72.method6606(Static582.aClass302_69);
		if (Static166.anInt3037 > 1) {
			if (Static84.aBoolean109 && Static413.aClass154_1.method5014(81) && Static166.anInt3037 > 2) {
				Static562.aClass3_Sub5_Sub18_7 = (Class3_Sub5_Sub18) Static582.aClass302_69.aClass3_241.aClass3_338.aClass3_338;
			} else {
				Static562.aClass3_Sub5_Sub18_7 = (Class3_Sub5_Sub18) Static582.aClass302_69.aClass3_241.aClass3_338;
			}
			Static484.aClass3_Sub5_Sub18_4 = (Class3_Sub5_Sub18) Static582.aClass302_69.aClass3_241.aClass3_338;
		} else {
			Static484.aClass3_Sub5_Sub18_4 = null;
			Static562.aClass3_Sub5_Sub18_7 = null;
		}
		local47 = -1;
		@Pc(154) Class3_Sub6 local154 = (Class3_Sub6) Static388.aClass302_43.method6603();
		if (local154 != null) {
			local47 = local154.method5326();
		}
		if (!Static532.aBoolean580) {
			if (local47 == 0 && (Static218.anInt3740 == 1 && Static166.anInt3037 > 2 || Static619.method8378())) {
				local47 = 2;
			}
			if (local47 == 2 && Static166.anInt3037 > 0 && local154 != null) {
				if (Static264.aClass265_8 == null && Static263.anInt2105 == 0) {
					Static440.method6013(local154.method5324(), local154.method5323());
				} else {
					Static69.anInt9579 = 2;
				}
			}
			if (local47 == 0) {
				if (Static562.aClass3_Sub5_Sub18_7 != null) {
					Static598.method7964();
				} else if (Static47.aBoolean59) {
					Static252.method3806();
				}
			}
			if (Static264.aClass265_8 == null && Static263.anInt2105 == 0) {
				Static536.aClass3_Sub5_Sub18_8 = null;
				Static69.anInt9579 = 0;
			}
			return;
		}
		@Pc(242) int local242;
		@Pc(246) int local246;
		@Pc(328) int local328;
		@Pc(330) int local330;
		if (local47 == -1) {
			local242 = Static627.aClass48_1.method7512();
			local246 = Static627.aClass48_1.method7511();
			@Pc(248) boolean local248 = false;
			if (Static352.aClass3_Sub5_Sub13_1 != null) {
				if (Static453.anInt7304 - 10 <= local242 && Static473.anInt7547 + Static453.anInt7304 + 10 >= local242 && local246 >= Static3.anInt15 - 10 && Static3.anInt15 + Static515.anInt8106 + 10 >= local246) {
					local248 = true;
				} else {
					Static178.method2799();
				}
			}
			if (!local248) {
				if (local242 < Static517.anInt8133 - 10 || Static517.anInt8133 + Static532.anInt8336 + 10 < local242 || local246 < Static508.anInt8006 - 10 || Static204.anInt3590 + Static508.anInt8006 + 10 < local246) {
					Static505.method6597();
				} else if (Static599.aBoolean544) {
					local328 = -1;
					local330 = -1;
					@Pc(344) int local344;
					for (@Pc(332) int local332 = 0; local332 < Static610.anInt10153; local332++) {
						if (Static653.aBoolean735) {
							local344 = local332 * 16 + Static508.anInt8006 + 33;
							if (local344 - 13 < local246 && local344 + 4 > local246) {
								local328 = local332;
								local330 = local344 - 13;
								break;
							}
						} else {
							local344 = Static508.anInt8006 + local332 * 16 + 31;
							if (local344 - 13 < local246 && local344 + 3 > local246) {
								local328 = local332;
								local330 = local344 - 13;
								break;
							}
						}
					}
					if (local328 != -1) {
						local344 = 0;
						@Pc(416) Class85 local416 = new Class85(Static287.aClass243_9);
						for (@Pc(421) Class3_Sub5_Sub13 local421 = (Class3_Sub5_Sub13) local416.method1735(); local421 != null; local421 = (Class3_Sub5_Sub13) local416.method1736()) {
							if (local344 == local328) {
								if (local421.anInt6245 > 1) {
									Static444.method5567(local330, local246, local421);
								}
								break;
							}
							local344++;
						}
					}
				}
			}
		}
		if (local47 != 0) {
			return;
		}
		local242 = local154.method5324();
		local246 = local154.method5323();
		@Pc(492) int local492;
		@Pc(560) Class85 local560;
		@Pc(565) Class3_Sub5_Sub18 local565;
		if (Static352.aClass3_Sub5_Sub13_1 != null && local242 >= Static453.anInt7304 && Static473.anInt7547 + Static453.anInt7304 >= local242 && local246 >= Static3.anInt15 && local246 <= Static3.anInt15 + Static515.anInt8106) {
			local492 = -1;
			for (local328 = 0; local328 < Static352.aClass3_Sub5_Sub13_1.anInt6245; local328++) {
				if (Static653.aBoolean735) {
					local330 = local328 * 16 + Static3.anInt15 + 33;
					if (local246 > local330 - 13 && local246 < local330 + 4) {
						local492 = local328;
					}
				} else {
					local330 = local328 * 16 + Static3.anInt15 + 31;
					if (local330 - 13 < local246 && local246 < local330 + 3) {
						local492 = local328;
					}
				}
			}
			if (local492 != -1) {
				local330 = 0;
				local560 = new Class85(Static352.aClass3_Sub5_Sub13_1.aClass243_10);
				for (local565 = (Class3_Sub5_Sub18) local560.method1735(); local565 != null; local565 = (Class3_Sub5_Sub18) local560.method1736()) {
					if (local492 == local330) {
						Static351.method5103(local565, local242, local246);
						break;
					}
					local330++;
				}
			}
			Static505.method6597();
			return;
		}
		if (local242 < Static517.anInt8133 || local242 > Static532.anInt8336 + Static517.anInt8133 || local246 < Static508.anInt8006 || Static508.anInt8006 + Static204.anInt3590 < local246) {
			return;
		}
		if (!Static599.aBoolean544) {
			local492 = -1;
			for (local328 = 0; local328 < Static166.anInt3037; local328++) {
				if (Static653.aBoolean735) {
					local330 = (Static166.anInt3037 - local328 - 1) * 16 + Static508.anInt8006 + 33;
					if (local330 - 13 < local246 && local330 + 4 > local246) {
						local492 = local328;
					}
				} else {
					local330 = (Static166.anInt3037 - local328 - 1) * 16 + Static508.anInt8006 + 31;
					if (local246 > local330 - 13 && local246 < local330 + 3) {
						local492 = local328;
					}
				}
			}
			if (local492 != -1) {
				local330 = 0;
				@Pc(708) Class178 local708 = new Class178(Static582.aClass302_69);
				for (local565 = (Class3_Sub5_Sub18) local708.method4057(); local565 != null; local565 = (Class3_Sub5_Sub18) local708.method4058()) {
					if (local492 == local330) {
						Static351.method5103(local565, local242, local246);
						break;
					}
					local330++;
				}
			}
			Static505.method6597();
			return;
		}
		local492 = -1;
		for (local328 = 0; local328 < Static610.anInt10153; local328++) {
			if (Static653.aBoolean735) {
				local330 = Static508.anInt8006 + local328 * 16 + 33;
				if (local330 - 13 < local246 && local330 + 4 > local246) {
					local492 = local328;
					break;
				}
			} else {
				local330 = local328 * 16 + Static508.anInt8006 + 31;
				if (local330 - 13 < local246 && local330 + 3 > local246) {
					local492 = local328;
					break;
				}
			}
		}
		if (local492 == -1) {
			return;
		}
		local330 = 0;
		local560 = new Class85(Static287.aClass243_9);
		for (@Pc(823) Class3_Sub5_Sub13 local823 = (Class3_Sub5_Sub13) local560.method1735(); local823 != null; local823 = (Class3_Sub5_Sub13) local560.method1736()) {
			if (local492 == local330) {
				Static351.method5103((Class3_Sub5_Sub18) local823.aClass243_10.aClass3_Sub5_44.aClass3_Sub5_66, local242, local246);
				Static505.method6597();
				return;
			}
			local330++;
		}
		return;
	}
}
