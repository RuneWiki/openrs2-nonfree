import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLclient!rg;III)V")
	public static void method6606(@OriginalArg(1) Class12_Sub2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class61 local17 = arg0.method6767();
		@Pc(27) int local27 = arg0.anInt8350 - arg0.aClass352_7.anInt9275 & 0x3FFF;
		if (arg1 == -1) {
			if (local27 != 0 || arg0.anInt8368 > 25) {
				if (arg3 < 0 && local17.anInt1320 != -1) {
					arg0.aBoolean710 = false;
					arg0.anInt8351 = local17.anInt1320;
				} else if (arg3 <= 0 || local17.anInt1318 == -1) {
					arg0.anInt8351 = local17.anInt1326;
				} else {
					arg0.anInt8351 = local17.anInt1318;
				}
				arg0.aBoolean710 = false;
			} else if (!arg0.aBoolean710 || !local17.method1201(arg0.anInt8351)) {
				arg0.anInt8351 = local17.method1203();
				arg0.aBoolean710 = arg0.anInt8351 != -1;
			}
		} else if (arg0.anInt8424 != -1 && (local27 >= 10240 || local27 <= 2048)) {
			@Pc(286) int local286 = Static96.anIntArray151[arg2] - arg0.aClass352_7.anInt9275 & 0x3FFF;
			arg0.aBoolean710 = false;
			if (arg1 == 2 && local17.anInt1317 != -1) {
				if (local286 > 2048 && local286 <= 6144 && local17.anInt1331 != -1) {
					arg0.anInt8351 = local17.anInt1331;
				} else if (local286 >= 10240 && local286 < 14336 && local17.anInt1328 != -1) {
					arg0.anInt8351 = local17.anInt1328;
				} else if (local286 <= 6144 || local286 >= 10240 || local17.anInt1325 == -1) {
					arg0.anInt8351 = local17.anInt1317;
				} else {
					arg0.anInt8351 = local17.anInt1325;
				}
			} else if (arg1 == 0 && local17.anInt1301 != -1) {
				if (local286 > 2048 && local286 <= 6144 && local17.anInt1312 != -1) {
					arg0.anInt8351 = local17.anInt1312;
				} else if (local286 >= 10240 && local286 < 14336 && local17.anInt1298 != -1) {
					arg0.anInt8351 = local17.anInt1298;
				} else if (local286 <= 6144 || local286 >= 10240 || local17.anInt1309 == -1) {
					arg0.anInt8351 = local17.anInt1301;
				} else {
					arg0.anInt8351 = local17.anInt1309;
				}
			} else if (local286 > 2048 && local286 <= 6144 && local17.anInt1324 != -1) {
				arg0.anInt8351 = local17.anInt1324;
			} else if (local286 >= 10240 && local286 < 14336 && local17.anInt1300 != -1) {
				arg0.anInt8351 = local17.anInt1300;
			} else if (local286 <= 6144 || local286 >= 10240 || local17.anInt1322 == -1) {
				arg0.anInt8351 = local17.anInt1326;
			} else {
				arg0.anInt8351 = local17.anInt1322;
			}
		} else if (local27 == 0 && arg0.anInt8368 <= 25) {
			if (arg1 == 2 && local17.anInt1317 != -1) {
				arg0.anInt8351 = local17.anInt1317;
			} else if (arg1 == 0 && local17.anInt1301 != -1) {
				arg0.anInt8351 = local17.anInt1301;
			} else {
				arg0.anInt8351 = local17.anInt1326;
			}
			arg0.aBoolean710 = false;
		} else {
			arg0.aBoolean710 = false;
			if (arg1 == 2 && local17.anInt1317 != -1) {
				if (arg3 < 0 && local17.anInt1307 != -1) {
					arg0.anInt8351 = local17.anInt1307;
				} else if (arg3 <= 0 || local17.anInt1336 == -1) {
					arg0.anInt8351 = local17.anInt1317;
				} else {
					arg0.anInt8351 = local17.anInt1336;
				}
			} else if (arg1 == 0 && local17.anInt1301 != -1) {
				if (arg3 < 0 && local17.anInt1305 != -1) {
					arg0.anInt8351 = local17.anInt1305;
				} else if (arg3 <= 0 || local17.anInt1303 == -1) {
					arg0.anInt8351 = local17.anInt1301;
				} else {
					arg0.anInt8351 = local17.anInt1303;
				}
			} else if (arg3 < 0 && local17.anInt1292 != -1) {
				arg0.anInt8351 = local17.anInt1292;
			} else if (arg3 <= 0 || local17.anInt1333 == -1) {
				arg0.anInt8351 = local17.anInt1326;
			} else {
				arg0.anInt8351 = local17.anInt1333;
			}
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Lclient!sda;")
	public static Class2_Sub2_Sub18 method6607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class2_Sub2_Sub18 local15 = (Class2_Sub2_Sub18) Static30.aClass90_2.method1685((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class2_Sub2_Sub18(arg1, arg0);
			Static30.aClass90_2.method1684(local15, local15.aLong268);
		}
		return local15;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
	public static void method6608() {
		Static71.aClass70_37.method1265();
		Static168.aClass70_8.method1265();
		@Pc(29) int local29;
		for (@Pc(24) Class2_Sub27 local24 = (Class2_Sub27) Static411.aClass70_43.method1264(); local24 != null; local24 = (Class2_Sub27) Static411.aClass70_43.method1261()) {
			local29 = local24.anInt4323;
			if (local29 < 1000) {
				local24.method7657();
				if (local29 == 57 || local29 == 9 || local29 == 50 || local29 == 3 || local29 == 59 || local29 == 22 || local29 == 46) {
					Static168.aClass70_8.method1269(local24);
				} else {
					Static71.aClass70_37.method1269(local24);
				}
			}
		}
		Static71.aClass70_37.method1270(Static411.aClass70_43);
		Static168.aClass70_8.method1270(Static411.aClass70_43);
		if (Static484.anInt7715 <= 1) {
			Static506.aClass2_Sub27_3 = null;
		} else if (Static418.aBoolean542 && Static106.aClass150_3.method2632(81) && Static484.anInt7715 > 2) {
			Static506.aClass2_Sub27_3 = (Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285.aClass2_285;
		} else {
			Static506.aClass2_Sub27_3 = (Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285;
		}
		local29 = -1;
		@Pc(128) Class2_Sub29 local128 = (Class2_Sub29) Static359.aClass70_17.method1264();
		if (local128 != null) {
			local29 = local128.method6295();
		}
		if (!Static572.aBoolean774) {
			if (local29 == 0 && (Static304.anInt5055 == 1 && Static484.anInt7715 > 2 || Static327.method4752())) {
				local29 = 2;
			}
			if (local29 == 2 && Static484.anInt7715 > 0 && local128 != null) {
				if (Class12_Sub2_Sub1_Sub3.lb == null && Static294.anInt9620 == 0) {
					Static200.method2511(local128.method6294(), local128.method6293());
				} else {
					Static339.anInt5844 = 2;
				}
			}
			if (local29 == 0 && Static484.anInt7715 > 0) {
				Static81.method7203();
			}
			if (Class12_Sub2_Sub1_Sub3.lb != null || Static294.anInt9620 != 0) {
				return;
			}
			Static339.anInt5844 = 0;
			Static150.aClass2_Sub27_1 = null;
			return;
		}
		@Pc(144) int local144;
		@Pc(148) int local148;
		if (local29 == -1) {
			local144 = Static205.aClass131_1.method6544();
			local148 = Static205.aClass131_1.method6542();
			if (Static214.anInt3100 - 10 > local144 || Static428.anInt6943 + Static214.anInt3100 + 10 < local144 || local148 < Static312.anInt5139 - 10 || local148 > Static312.anInt5139 + Static524.anInt8323 + 10) {
				Static312.method4449();
			}
		}
		if (local29 != 0) {
			return;
		}
		local144 = Static214.anInt3100;
		local148 = Static312.anInt5139;
		@Pc(198) int local198 = Static428.anInt6943;
		@Pc(202) int local202 = local128.method6294();
		@Pc(206) int local206 = local128.method6293();
		@Pc(208) int local208 = -1;
		@Pc(227) int local227;
		for (@Pc(210) int local210 = 0; local210 < Static484.anInt7715; local210++) {
			if (Static321.aBoolean428) {
				local227 = local148 + (-local210 + -1 + Static484.anInt7715) * 16 + 33;
				if (local144 < local202 && local144 + local198 > local202 && local206 > local227 - 13 && local206 < local227 + 4) {
					local208 = local210;
				}
			} else {
				local227 = (Static484.anInt7715 - local210 - 1) * 16 + local148 + 31;
				if (local144 < local202 && local198 + local144 > local202 && local206 > local227 - 13 && local206 < local227 + 3) {
					local208 = local210;
				}
			}
		}
		if (local208 != -1) {
			local227 = 0;
			@Pc(312) Class314 local312 = new Class314(Static411.aClass70_43);
			for (@Pc(317) Class2_Sub27 local317 = (Class2_Sub27) local312.method6302(); local317 != null; local317 = (Class2_Sub27) local312.method6304()) {
				if (local208 == local227) {
					Static345.method5016(local317, local206, local202);
				}
				local227++;
			}
		}
		Static312.method4449();
		return;
	}
}
