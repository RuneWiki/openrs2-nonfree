import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "Lclient!kg;")
	public static Class200 aClass200_198;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILclient!bi;ZI)Lclient!baa;")
	public static Class10_Sub2_Sub1 method7370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (arg2.aBoolean93 || Static608.method8539(arg0) && Static608.method8539(arg3)) {
			return new Class10_Sub2_Sub1(arg2, 3553, arg1, arg0, arg3);
		} else if (arg2.aBoolean95) {
			return new Class10_Sub2_Sub1(arg2, 34037, arg1, arg0, arg3);
		} else {
			return new Class10_Sub2_Sub1(arg2, arg1, arg0, arg3, Static613.method8565(arg0), Static613.method8565(arg3));
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	public static void method7371() {
		if (!Static113.aBoolean192) {
			Static193.aBoolean754 = Static507.anInt10229 != -1 && Static633.anInt10265 >= Static507.anInt10229 || Static633.anInt10265 * 16 + (Static266.aBoolean372 ? 26 : 22) > Static71.anInt1925;
		}
		Static247.aClass114_25.method2768();
		Static402.aClass114_36.method2768();
		@Pc(49) int local49;
		for (@Pc(44) Class2_Sub7_Sub21 local44 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local44 != null; local44 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
			local49 = local44.anInt10014;
			if (local49 < 1000) {
				local44.method8920();
				if (local49 == 45 || local49 == 10 || local49 == 11 || local49 == 15 || local49 == 22 || local49 == 20 || local49 == 6) {
					Static402.aClass114_36.method2771(local44);
				} else {
					Static247.aClass114_25.method2771(local44);
				}
			}
		}
		Static247.aClass114_25.method2760(Static177.aClass114_19);
		Static402.aClass114_36.method2760(Static177.aClass114_19);
		if (Static633.anInt10265 > 1) {
			if (Static404.aBoolean492 && Static185.aClass221_1.method8050(81) && Static633.anInt10265 > 2) {
				Static10.aClass2_Sub7_Sub21_1 = (Class2_Sub7_Sub21) Static177.aClass114_19.aClass2_90.aClass2_299.aClass2_299;
			} else {
				Static10.aClass2_Sub7_Sub21_1 = (Class2_Sub7_Sub21) Static177.aClass114_19.aClass2_90.aClass2_299;
			}
			Static284.aClass2_Sub7_Sub21_3 = (Class2_Sub7_Sub21) Static177.aClass114_19.aClass2_90.aClass2_299;
		} else {
			Static10.aClass2_Sub7_Sub21_1 = null;
			Static284.aClass2_Sub7_Sub21_3 = null;
		}
		local49 = -1;
		@Pc(157) Class2_Sub1 local157 = (Class2_Sub1) Static574.aClass114_53.method2772();
		if (local157 != null) {
			local49 = local157.method7153();
		}
		if (!Static113.aBoolean192) {
			if (local49 == 0 && (Static193.anInt10392 == 1 && Static633.anInt10265 > 2 || Static622.method8631())) {
				local49 = 2;
			}
			if (local49 == 2 && Static633.anInt10265 > 0 && local157 != null) {
				if (Static351.aClass303_13 == null && Static272.anInt5078 == 0) {
					Static293.method4634(local157.method7157(), local157.method7155());
				} else {
					Static294.anInt5309 = 2;
				}
			}
			if (local49 == 0) {
				if (Static10.aClass2_Sub7_Sub21_1 != null) {
					Static637.method8027();
				} else if (Static557.aBoolean660) {
					Static210.method8326();
				}
			}
			if (Static351.aClass303_13 != null || Static272.anInt5078 != 0) {
				return;
			}
			Static376.aClass2_Sub7_Sub21_4 = null;
			Static294.anInt5309 = 0;
			return;
		}
		@Pc(173) int local173;
		@Pc(177) int local177;
		@Pc(267) int local267;
		@Pc(269) int local269;
		if (local49 == -1) {
			local173 = Static186.aClass358_1.method8722();
			local177 = Static186.aClass358_1.method8721();
			@Pc(179) boolean local179 = false;
			if (Static429.aClass2_Sub7_Sub20_3 != null) {
				if (Static540.anInt8699 - 10 <= local173 && Static220.anInt4137 + Static540.anInt8699 + 10 >= local173 && Static573.anInt9360 - 10 <= local177 && local177 <= Static122.anInt2592 + Static573.anInt9360 + 10) {
					local179 = true;
				} else {
					Static420.method6132();
				}
			}
			if (!local179) {
				if (local173 < Static441.anInt7238 - 10 || local173 > Static441.anInt7238 + Static131.anInt2708 + 10 || local177 < Static250.anInt4790 - 10 || Static250.anInt4790 + Static240.anInt9646 + 10 < local177) {
					Static395.method5851();
				} else if (Static193.aBoolean754) {
					local267 = -1;
					local269 = -1;
					@Pc(284) int local284;
					for (@Pc(271) int local271 = 0; local271 < Static471.anInt7593; local271++) {
						if (Static266.aBoolean372) {
							local284 = local271 * 16 + Static250.anInt4790 + 33;
							if (local284 - 13 < local177 && local177 < local284 + 4) {
								local269 = local284 - 13;
								local267 = local271;
								break;
							}
						} else {
							local284 = Static250.anInt4790 + local271 * 16 + 31;
							if (local284 - 13 < local177 && local177 < local284 + 3) {
								local267 = local271;
								local269 = local284 - 13;
								break;
							}
						}
					}
					if (local267 != -1) {
						local284 = 0;
						@Pc(354) Class120 local354 = new Class120(Static515.aClass290_7);
						for (@Pc(359) Class2_Sub7_Sub20 local359 = (Class2_Sub7_Sub20) local354.method2959(); local359 != null; local359 = (Class2_Sub7_Sub20) local354.method2960()) {
							if (local284 == local267) {
								if (local359.anInt9985 > 1) {
									Static519.method7226(local177, local269, local359);
								}
								break;
							}
							local284++;
						}
					}
				}
			}
		}
		if (local49 != 0) {
			return;
		}
		local173 = local157.method7155();
		local177 = local157.method7157();
		@Pc(422) int local422;
		@Pc(495) Class120 local495;
		@Pc(500) Class2_Sub7_Sub21 local500;
		if (Static429.aClass2_Sub7_Sub20_3 != null && local173 >= Static540.anInt8699 && Static540.anInt8699 + Static220.anInt4137 >= local173 && Static573.anInt9360 <= local177 && Static573.anInt9360 + Static122.anInt2592 >= local177) {
			local422 = -1;
			for (local267 = 0; local267 < Static429.aClass2_Sub7_Sub20_3.anInt9985; local267++) {
				if (Static266.aBoolean372) {
					local269 = local267 * 16 + Static573.anInt9360 + 33;
					if (local269 - 13 < local177 && local177 < local269 + 4) {
						local422 = local267;
					}
				} else {
					local269 = Static573.anInt9360 + local267 * 16 + 31;
					if (local177 > local269 - 13 && local177 < local269 + 3) {
						local422 = local267;
					}
				}
			}
			if (local422 != -1) {
				local269 = 0;
				local495 = new Class120(Static429.aClass2_Sub7_Sub20_3.aClass290_13);
				for (local500 = (Class2_Sub7_Sub21) local495.method2959(); local500 != null; local500 = (Class2_Sub7_Sub21) local495.method2960()) {
					if (local269 == local422) {
						Static151.method2661(local500, local177, local173);
						break;
					}
					local269++;
				}
			}
			Static395.method5851();
			return;
		}
		if (Static441.anInt7238 > local173 || Static441.anInt7238 + Static131.anInt2708 < local173 || local177 < Static250.anInt4790 || Static250.anInt4790 + Static240.anInt9646 < local177) {
			return;
		}
		if (!Static193.aBoolean754) {
			local422 = -1;
			for (local267 = 0; local267 < Static633.anInt10265; local267++) {
				if (Static266.aBoolean372) {
					local269 = (Static633.anInt10265 - local267 - 1) * 16 + Static250.anInt4790 + 33;
					if (local269 - 13 < local177 && local269 + 4 > local177) {
						local422 = local267;
					}
				} else {
					local269 = Static250.anInt4790 + (Static633.anInt10265 + -1 - local267) * 16 + 31;
					if (local177 > local269 - 13 && local177 < local269 + 3) {
						local422 = local267;
					}
				}
			}
			if (local422 != -1) {
				local269 = 0;
				@Pc(622) Class370 local622 = new Class370(Static177.aClass114_19);
				for (local500 = (Class2_Sub7_Sub21) local622.method8628(); local500 != null; local500 = (Class2_Sub7_Sub21) local622.method8625()) {
					if (local422 == local269) {
						Static151.method2661(local500, local177, local173);
						break;
					}
					local269++;
				}
			}
			Static395.method5851();
			return;
		}
		local422 = -1;
		for (local267 = 0; local267 < Static471.anInt7593; local267++) {
			if (Static266.aBoolean372) {
				local269 = local267 * 16 + Static250.anInt4790 + 33;
				if (local177 > local269 - 13 && local177 < local269 + 4) {
					local422 = local267;
					break;
				}
			} else {
				local269 = local267 * 16 + Static250.anInt4790 + 31;
				if (local177 > local269 - 13 && local177 < local269 + 3) {
					local422 = local267;
					break;
				}
			}
		}
		if (local422 == -1) {
			return;
		}
		local269 = 0;
		local495 = new Class120(Static515.aClass290_7);
		for (@Pc(746) Class2_Sub7_Sub20 local746 = (Class2_Sub7_Sub20) local495.method2959(); local746 != null; local746 = (Class2_Sub7_Sub20) local495.method2960()) {
			if (local422 == local269) {
				Static151.method2661((Class2_Sub7_Sub21) local746.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66, local177, local173);
				Static395.method5851();
				return;
			}
			local269++;
		}
		return;
	}
}
