import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar5 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Z")
	public static boolean method2083() throws IOException {
		if (Static375.aClass192_2 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static58.aClass151_23 == null) {
			if (Static117.aBoolean151) {
				if (!Static375.aClass192_2.method7787(1)) {
					return false;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
				Static117.aBoolean151 = false;
				Static163.anInt2980 = 0;
				Static658.anInt10395++;
			}
			Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
			if (Static159.aClass4_Sub11_Sub1_1.method990()) {
				if (!Static375.aClass192_2.method7787(1)) {
					return false;
				}
				Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 1, 1);
				Static163.anInt2980 = 0;
				Static658.anInt10395++;
			}
			Static117.aBoolean151 = true;
			@Pc(71) Class151[] local71 = Static277.method4050();
			local75 = Static159.aClass4_Sub11_Sub1_1.method993();
			if (local75 < 0 || local71.length <= local75) {
				throw new IOException("invo:" + local75 + " ip:" + Static159.aClass4_Sub11_Sub1_1.anInt10466);
			}
			Static58.aClass151_23 = local71[local75];
			Static583.anInt8992 = Static58.aClass151_23.anInt3555;
		}
		if (Static583.anInt8992 == -1) {
			if (!Static375.aClass192_2.method7787(1)) {
				return false;
			}
			Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 1);
			Static658.anInt10395++;
			Static583.anInt8992 = Static159.aClass4_Sub11_Sub1_1.aByteArray107[0] & 0xFF;
			Static163.anInt2980 = 0;
		}
		if (Static583.anInt8992 == -2) {
			if (!Static375.aClass192_2.method7787(2)) {
				return false;
			}
			Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, 2);
			Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
			Static583.anInt8992 = Static159.aClass4_Sub11_Sub1_1.method8859();
			Static658.anInt10395 += 2;
			Static163.anInt2980 = 0;
		}
		if (Static583.anInt8992 > 0) {
			if (!Static375.aClass192_2.method7787(Static583.anInt8992)) {
				return false;
			}
			Static159.aClass4_Sub11_Sub1_1.anInt10466 = 0;
			Static375.aClass192_2.method7792(Static159.aClass4_Sub11_Sub1_1.aByteArray107, 0, Static583.anInt8992);
			Static658.anInt10395 += Static583.anInt8992;
			Static163.anInt2980 = 0;
		}
		Static86.aClass151_42 = Static650.aClass151_220;
		Static650.aClass151_220 = Static568.aClass151_190;
		Static568.aClass151_190 = Static58.aClass151_23;
		if (Static58.aClass151_23 == Static491.aClass151_164) {
			Static558.aBoolean669 = Static159.aClass4_Sub11_Sub1_1.method8862() == 1;
			Static58.aClass151_23 = null;
			return true;
		}
		@Pc(263) int local263;
		@Pc(274) int local274;
		@Pc(237) boolean local237;
		@Pc(241) String local241;
		@Pc(254) long local254;
		@Pc(243) String local243;
		@Pc(259) long local259;
		@Pc(331) String local331;
		@Pc(272) boolean local272;
		@Pc(270) long local270;
		if (Static255.aClass151_94 == Static58.aClass151_23) {
			local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
			local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
			local243 = local241;
			if (local237) {
				local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
			}
			local254 = (long) Static159.aClass4_Sub11_Sub1_1.method8859();
			local259 = (long) Static159.aClass4_Sub11_Sub1_1.method8827();
			local263 = Static159.aClass4_Sub11_Sub1_1.method8865();
			local270 = (local254 << 32) + local259;
			local272 = false;
			local274 = 0;
			while (true) {
				if (local274 >= 100) {
					if (local263 <= 1) {
						if (Static197.aBoolean408 && !Static263.aBoolean317 || Static42.aBoolean75) {
							local272 = true;
						} else if (Static130.method2323(local243)) {
							local272 = true;
						}
					}
					break;
				}
				if (local270 == Static329.aLongArray7[local274]) {
					local272 = true;
					break;
				}
				local274++;
			}
			if (!local272 && Static417.anInt6044 == 0) {
				Static329.aLongArray7[Static411.anInt5919] = local270;
				Static411.anInt5919 = (Static411.anInt5919 + 1) % 100;
				local331 = Static30.method665(Static475.method6540(Static159.aClass4_Sub11_Sub1_1));
				if (local263 == 2) {
					Static169.method2827("<img=1>" + local241, 7, "<img=1>" + local243, (String) null, local241, local331, -1, 0);
				} else if (local263 == 1) {
					Static169.method2827("<img=0>" + local241, 7, "<img=0>" + local243, (String) null, local241, local331, -1, 0);
				} else {
					Static169.method2827(local241, 3, local243, (String) null, local241, local331, -1, 0);
				}
			}
			Static58.aClass151_23 = null;
			return true;
		} else if (Static282.aClass151_102 == Static58.aClass151_23) {
			Static98.method1983(Static239.aClass207_2, Static583.anInt8992, Static159.aClass4_Sub11_Sub1_1);
			Static58.aClass151_23 = null;
			return true;
		} else {
			@Pc(422) int local422;
			@Pc(441) int local441;
			@Pc(445) int local445;
			@Pc(447) int local447;
			@Pc(435) boolean local435;
			if (Static573.aClass151_193 == Static58.aClass151_23) {
				local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
				local75 = Static159.aClass4_Sub11_Sub1_1.method8865();
				local435 = (local75 & 0x1) == 1;
				while (Static159.aClass4_Sub11_Sub1_1.anInt10466 < Static583.anInt8992) {
					local441 = Static159.aClass4_Sub11_Sub1_1.method8823();
					local445 = Static159.aClass4_Sub11_Sub1_1.method8859();
					local447 = 0;
					if (local445 != 0) {
						local447 = Static159.aClass4_Sub11_Sub1_1.method8865();
						if (local447 == 255) {
							local447 = Static159.aClass4_Sub11_Sub1_1.method8850();
						}
					}
					Static34.method8331(local447, local422, local445 - 1, local435, local441);
				}
				Static356.anIntArray417[Static529.anInt2658++ & 0x1F] = local422;
				Static58.aClass151_23 = null;
				return true;
			}
			@Pc(824) String local824;
			@Pc(733) int local733;
			@Pc(788) String local788;
			@Pc(527) String local527;
			@Pc(529) boolean local529;
			if (Static261.aClass151_98 == Static58.aClass151_23) {
				@Pc(565) boolean local565;
				while (Static159.aClass4_Sub11_Sub1_1.anInt10466 < Static583.anInt8992) {
					local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
					local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
					local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
					local441 = Static159.aClass4_Sub11_Sub1_1.method8859();
					local445 = Static159.aClass4_Sub11_Sub1_1.method8865();
					local527 = "";
					local529 = false;
					if (local441 > 0) {
						local527 = Static159.aClass4_Sub11_Sub1_1.method8853();
						local529 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
					}
					for (local263 = 0; local263 < Static450.anInt7035; local263++) {
						if (local237) {
							if (local243.equals(Static289.aStringArray20[local263])) {
								Static289.aStringArray20[local263] = local241;
								local241 = null;
								Static496.aStringArray41[local263] = local243;
								break;
							}
						} else if (local241.equals(Static289.aStringArray20[local263])) {
							if (local441 != Static151.anIntArray198[local263]) {
								local565 = true;
								for (@Pc(572) Class3_Sub3_Sub2 local572 = (Class3_Sub3_Sub2) Static629.aClass236_9.method4958(); local572 != null; local572 = (Class3_Sub3_Sub2) Static629.aClass236_9.method4950()) {
									if (local572.aString71.equals(local241)) {
										if (local441 != 0 && local572.aShort85 == 0) {
											local572.method8898();
											local565 = false;
										} else if (local441 == 0 && local572.aShort85 != 0) {
											local572.method8898();
											local565 = false;
										}
									}
								}
								if (local565) {
									Static629.aClass236_9.method4955(new Class3_Sub3_Sub2(local241, local441));
								}
								Static151.anIntArray198[local263] = local441;
							}
							Static496.aStringArray41[local263] = local243;
							Static368.aStringArray27[local263] = local527;
							Static536.anIntArray566[local263] = local445;
							local241 = null;
							Static226.aBooleanArray9[local263] = local529;
							break;
						}
					}
					if (local241 != null && Static450.anInt7035 < 200) {
						Static289.aStringArray20[Static450.anInt7035] = local241;
						Static496.aStringArray41[Static450.anInt7035] = local243;
						Static151.anIntArray198[Static450.anInt7035] = local441;
						Static368.aStringArray27[Static450.anInt7035] = local527;
						Static536.anIntArray566[Static450.anInt7035] = local445;
						Static226.aBooleanArray9[Static450.anInt7035] = local529;
						Static450.anInt7035++;
					}
				}
				Static517.anInt8054 = 2;
				Static261.anInt4244 = Static317.anInt4914;
				local75 = Static450.anInt7035;
				while (local75 > 0) {
					local237 = true;
					local75--;
					for (local733 = 0; local733 < local75; local733++) {
						if (Static653.aClass382_5.anInt10282 != Static151.anIntArray198[local733] && Static151.anIntArray198[local733 + 1] == Static653.aClass382_5.anInt10282 || Static151.anIntArray198[local733] == 0 && Static151.anIntArray198[local733 + 1] != 0) {
							local441 = Static151.anIntArray198[local733];
							Static151.anIntArray198[local733] = Static151.anIntArray198[local733 + 1];
							Static151.anIntArray198[local733 + 1] = local441;
							local788 = Static368.aStringArray27[local733];
							Static368.aStringArray27[local733] = Static368.aStringArray27[local733 + 1];
							Static368.aStringArray27[local733 + 1] = local788;
							local527 = Static289.aStringArray20[local733];
							Static289.aStringArray20[local733] = Static289.aStringArray20[local733 + 1];
							Static289.aStringArray20[local733 + 1] = local527;
							local824 = Static496.aStringArray41[local733];
							Static496.aStringArray41[local733] = Static496.aStringArray41[local733 + 1];
							Static496.aStringArray41[local733 + 1] = local824;
							local263 = Static536.anIntArray566[local733];
							Static536.anIntArray566[local733] = Static536.anIntArray566[local733 + 1];
							Static536.anIntArray566[local733 + 1] = local263;
							local565 = Static226.aBooleanArray9[local733];
							Static226.aBooleanArray9[local733] = Static226.aBooleanArray9[local733 + 1];
							Static226.aBooleanArray9[local733 + 1] = local565;
							local237 = false;
						}
					}
					if (local237) {
						break;
					}
				}
				Static58.aClass151_23 = null;
				return true;
			} else if (Static424.aClass151_138 == Static58.aClass151_23) {
				Static102.anInt10343 = Static159.aClass4_Sub11_Sub1_1.method8865();
				Static58.aClass151_23 = null;
				return true;
			} else if (Static613.aClass151_207 == Static58.aClass151_23) {
				local422 = Static159.aClass4_Sub11_Sub1_1.method8846();
				local75 = Static159.aClass4_Sub11_Sub1_1.method8884();
				Static316.method4370();
				Static316.method4374(local75, local422);
				Static58.aClass151_23 = null;
				return true;
			} else if (Static272.aClass151_101 == Static58.aClass151_23) {
				local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
				if (local422 == 65535) {
					local422 = -1;
				}
				local75 = Static159.aClass4_Sub11_Sub1_1.method8865();
				local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
				local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
				Static412.method5195(256, local441, local75, local422, true, local733);
				Static58.aClass151_23 = null;
				return true;
			} else if (Static7.aClass151_9 == Static58.aClass151_23) {
				Static186.aClass356_4 = Static54.method1292(Static159.aClass4_Sub11_Sub1_1.method8865());
				Static58.aClass151_23 = null;
				return true;
			} else if (Static58.aClass151_23 == Static547.aClass151_185) {
				local422 = Static159.aClass4_Sub11_Sub1_1.method8850();
				local75 = Static159.aClass4_Sub11_Sub1_1.method8890();
				if (local75 == 65535) {
					local75 = -1;
				}
				Static316.method4370();
				Static57.method1304(local75, -1, 1, local422);
				Static58.aClass151_23 = null;
				return true;
			} else if (Static96.aClass151_46 == Static58.aClass151_23) {
				local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
				local75 = Static159.aClass4_Sub11_Sub1_1.method8837();
				local733 = Static159.aClass4_Sub11_Sub1_1.method8837();
				Static316.method4370();
				Static57.method1304(local422, local75, 5, local733);
				Static58.aClass151_23 = null;
				return true;
			} else if (Static130.aClass151_59 == Static58.aClass151_23) {
				Static183.anInt3143 = Static317.anInt4914;
				local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
				if (Static583.anInt8992 != 1) {
					if (local237) {
						Static64.aClass4_Sub55_1 = new Class4_Sub55(Static159.aClass4_Sub11_Sub1_1);
					} else {
						Static252.aClass4_Sub55_3 = new Class4_Sub55(Static159.aClass4_Sub11_Sub1_1);
					}
					Static58.aClass151_23 = null;
					return true;
				}
				Static58.aClass151_23 = null;
				if (local237) {
					Static64.aClass4_Sub55_1 = null;
				} else {
					Static252.aClass4_Sub55_3 = null;
				}
				return true;
			} else if (Static58.aClass151_23 == Static499.aClass151_168) {
				local422 = Static159.aClass4_Sub11_Sub1_1.method8883();
				local75 = Static159.aClass4_Sub11_Sub1_1.method8826();
				local733 = Static159.aClass4_Sub11_Sub1_1.method8855();
				local441 = Static159.aClass4_Sub11_Sub1_1.method8883();
				Static316.method4370();
				Static523.method7044(local75, local441, local422, local733);
				Static58.aClass151_23 = null;
				return true;
			} else if (Static79.aClass151_39 == Static58.aClass151_23) {
				Static395.method2778(Static614.aClass117_16);
				Static58.aClass151_23 = null;
				return true;
			} else {
				@Pc(1195) Class4_Sub10 local1195;
				@Pc(1186) Class4_Sub10 local1186;
				if (Static368.aClass151_122 == Static58.aClass151_23) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
					if (local422 == 65535) {
						local422 = -1;
					}
					local75 = Static159.aClass4_Sub11_Sub1_1.method8837();
					local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
					if (local733 == 65535) {
						local733 = -1;
					}
					local441 = Static159.aClass4_Sub11_Sub1_1.method8884();
					Static316.method4370();
					for (local445 = local733; local445 <= local422; local445++) {
						local259 = (long) local445 + ((long) local75 << 32);
						local1186 = (Class4_Sub10) Static598.aClass66_42.method1994(local259);
						if (local1186 != null) {
							local1195 = new Class4_Sub10(local441, local1186.anInt889);
							local1186.method9000();
						} else if (local445 == -1) {
							local1195 = new Class4_Sub10(local441, Static569.method7534(local75).aClass4_Sub10_1.anInt889);
						} else {
							local1195 = new Class4_Sub10(local441, -1);
						}
						Static598.aClass66_42.method1985(local1195, local259);
					}
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static13.aClass151_11) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8850();
					if (Static235.anInt5515 != local422) {
						Static235.anInt5515 = local422;
						Static237.method3386(Static578.aClass268_37, -1, -1);
					}
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static554.aClass151_179) {
					Static159.aClass4_Sub11_Sub1_1.anInt10466 += 28;
					if (Static159.aClass4_Sub11_Sub1_1.method8880()) {
						Static602.method7913(Static159.aClass4_Sub11_Sub1_1, Static159.aClass4_Sub11_Sub1_1.anInt10466 - 28);
					}
					Static58.aClass151_23 = null;
					return true;
				} else if (Static599.aClass151_202 == Static58.aClass151_23) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
					local75 = Static159.aClass4_Sub11_Sub1_1.method8884();
					local733 = Static159.aClass4_Sub11_Sub1_1.method8883();
					local441 = Static159.aClass4_Sub11_Sub1_1.method8859();
					Static316.method4370();
					Static57.method1304(local733 << 16 | local441, local422, 7, local75);
					Static58.aClass151_23 = null;
					return true;
				} else if (Static678.aClass151_226 == Static58.aClass151_23) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8837();
					local75 = Static159.aClass4_Sub11_Sub1_1.method8859();
					local733 = Static159.aClass4_Sub11_Sub1_1.method8862();
					local441 = Static159.aClass4_Sub11_Sub1_1.method8859();
					Static316.method4370();
					Static415.method5237(local733, local422, local75, local441);
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static108.aClass151_51) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8884();
					local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
					Static316.method4370();
					if (local75 == 65535) {
						local75 = -1;
					}
					Static57.method1304(local75, -1, 2, local422);
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static78.aClass151_34) {
					Static338.method4621(Static583.anInt8992, Static159.aClass4_Sub11_Sub1_1);
					Static58.aClass151_23 = null;
					return true;
				} else if (Static459.aClass151_153 == Static58.aClass151_23) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
					if (local422 == 65535) {
						local422 = -1;
					}
					local75 = Static159.aClass4_Sub11_Sub1_1.method8865();
					local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
					local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
					local445 = Static159.aClass4_Sub11_Sub1_1.method8859();
					Static430.method5939(local733, local422, local445, local75, local441);
					Static58.aClass151_23 = null;
					return true;
				} else if (Static656.aClass151_224 == Static58.aClass151_23) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
					local75 = Static159.aClass4_Sub11_Sub1_1.method8859();
					local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
					Static316.method4370();
					if (Static392.aClass199ArrayArray2[local422] != null) {
						for (local441 = local75; local441 < local733; local441++) {
							local445 = Static159.aClass4_Sub11_Sub1_1.method8827();
							if (local441 < Static392.aClass199ArrayArray2[local422].length && Static392.aClass199ArrayArray2[local422][local441] != null) {
								Static392.aClass199ArrayArray2[local422][local441].anInt5009 = local445;
							}
						}
					}
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static521.aClass151_174) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
					@Pc(1509) int[] local1509 = new int[4];
					for (local733 = 0; local733 < 4; local733++) {
						local1509[local733] = Static159.aClass4_Sub11_Sub1_1.method8883();
					}
					local441 = Static159.aClass4_Sub11_Sub1_1.method8855();
					@Pc(1538) Class4_Sub45 local1538 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local422);
					if (local1538 != null) {
						Static585.method7692(local441, local1509, local1538.aClass3_Sub1_Sub2_Sub2_Sub2_2);
					}
					Static58.aClass151_23 = null;
					return true;
				} else if (Static251.aClass151_45 == Static58.aClass151_23) {
					Static395.method2778(Static96.aClass117_2);
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static471.aClass151_158) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8855();
					Static316.method4370();
					Static458.anInt7334 = local422;
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static196.aClass151_77) {
					if (Static77.anInt1630 != -1) {
						Static135.method2426(Static77.anInt1630, 0);
					}
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static627.aClass151_215) {
					Static395.method2778(Static144.aClass117_5);
					Static58.aClass151_23 = null;
					return true;
				} else if (Static58.aClass151_23 == Static249.aClass151_92) {
					local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
					local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
					local733 = Static159.aClass4_Sub11_Sub1_1.method8826();
					Static316.method4370();
					Static46.method828(local733, local75 + (local422 << 16));
					Static58.aClass151_23 = null;
					return true;
				} else if (Static505.aClass151_128 == Static58.aClass151_23) {
					Static583.aByte135 = Static159.aClass4_Sub11_Sub1_1.method8831();
					Static58.aClass151_23 = null;
					if (Static583.aByte135 == 0 || Static583.aByte135 == 1) {
						Static56.aBoolean84 = true;
					}
					return true;
				} else {
					@Pc(1655) String local1655;
					if (Static241.aClass151_88 == Static58.aClass151_23) {
						local1655 = Static159.aClass4_Sub11_Sub1_1.method8853();
						local75 = Static159.aClass4_Sub11_Sub1_1.method8850();
						Static316.method4370();
						Static626.method8410(local1655, local75);
						Static58.aClass151_23 = null;
						return true;
					} else if (Static128.aClass151_58 == Static58.aClass151_23) {
						local422 = Static159.aClass4_Sub11_Sub1_1.method8826();
						Static316.method4370();
						if (local422 == -1) {
							Static77.anInt1632 = -1;
							Static286.anInt4563 = -1;
						} else {
							local75 = local422 >> 14 & 0x3FFF;
							local733 = local422 & 0x3FFF;
							local75 -= Static445.anInt6949;
							if (local75 < 0) {
								local75 = 0;
							} else if (Static224.anInt3557 <= local75) {
								local75 = Static224.anInt3557;
							}
							local733 -= Static321.anInt5000;
							if (local733 < 0) {
								local733 = 0;
							} else if (local733 >= Static267.anInt4309) {
								local733 = Static267.anInt4309;
							}
							Static77.anInt1632 = (local75 << 9) + 256;
							Static286.anInt4563 = (local733 << 9) + 256;
						}
						Static58.aClass151_23 = null;
						return true;
					} else if (Static58.aClass151_23 == Static226.aClass151_84) {
						local422 = Static159.aClass4_Sub11_Sub1_1.method8850();
						local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
						Static316.method4370();
						Static560.method7432(local75, local422);
						Static58.aClass151_23 = null;
						return true;
					} else if (Static58.aClass151_23 == Static157.aClass151_65) {
						Static395.method2778(Static451.aClass117_12);
						Static58.aClass151_23 = null;
						return true;
					} else if (Static489.aClass151_163 == Static58.aClass151_23) {
						local422 = Static159.aClass4_Sub11_Sub1_1.method8826();
						local75 = Static159.aClass4_Sub11_Sub1_1.method8859();
						Static316.method4370();
						Static669.method8922(local75, local422);
						Static58.aClass151_23 = null;
						return true;
					} else if (Static58.aClass151_23 == Static102.aClass151_223) {
						local422 = Static159.aClass4_Sub11_Sub1_1.method8883();
						if (local422 == 65535) {
							local422 = -1;
						}
						local75 = Static159.aClass4_Sub11_Sub1_1.method8837();
						local733 = Static159.aClass4_Sub11_Sub1_1.method8826();
						Static316.method4370();
						Static92.method1871(local75, local733, local422);
						@Pc(1851) Class110 local1851 = Static532.aClass255_2.method5210(local422);
						Static369.method4865(local1851.anInt2792, local1851.lb, local1851.anInt2778, local75);
						Static58.method1307(local1851.anInt2754, local1851.anInt2773, local1851.anInt2750, local75);
						Static58.aClass151_23 = null;
						return true;
					} else if (Static7.aClass151_8 == Static58.aClass151_23) {
						Static301.anInt4756 = Static159.aClass4_Sub11_Sub1_1.method8865();
						Static465.anInt7431 = Static317.anInt4914;
						Static58.aClass151_23 = null;
						return true;
					} else {
						@Pc(2067) int local2067;
						@Pc(2074) int local2074;
						@Pc(2095) Class275 local2095;
						if (Static58.aClass151_23 == Static163.aClass151_66) {
							Static470.anInt7475 = Static317.anInt4914;
							if (Static583.anInt8992 == 0) {
								Static324.aString56 = null;
								Static596.anInt9157 = 0;
								Static547.aClass275Array1 = null;
								Static348.aString69 = null;
								Static58.aClass151_23 = null;
								return true;
							}
							Static324.aString56 = Static159.aClass4_Sub11_Sub1_1.method8853();
							local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
							if (local237) {
								Static159.aClass4_Sub11_Sub1_1.method8853();
							}
							@Pc(1932) long local1932 = Static159.aClass4_Sub11_Sub1_1.method8830();
							Static348.aString69 = Static414.method5217(local1932);
							Static164.aByte32 = Static159.aClass4_Sub11_Sub1_1.method8861();
							local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
							if (local441 == 255) {
								Static58.aClass151_23 = null;
								return true;
							}
							Static596.anInt9157 = local441;
							@Pc(1960) Class275[] local1960 = new Class275[100];
							for (local447 = 0; local447 < Static596.anInt9157; local447++) {
								local1960[local447] = new Class275();
								local1960[local447].aString88 = Static159.aClass4_Sub11_Sub1_1.method8853();
								local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
								if (local237) {
									local1960[local447].aString90 = Static159.aClass4_Sub11_Sub1_1.method8853();
								} else {
									local1960[local447].aString90 = local1960[local447].aString88;
								}
								local1960[local447].aString89 = Static317.method4379(local1960[local447].aString90);
								local1960[local447].anInt7327 = Static159.aClass4_Sub11_Sub1_1.method8859();
								local1960[local447].aByte105 = Static159.aClass4_Sub11_Sub1_1.method8861();
								local1960[local447].aString87 = Static159.aClass4_Sub11_Sub1_1.method8853();
								if (local1960[local447].aString90.equals(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37)) {
									Static294.aByte73 = local1960[local447].aByte105;
								}
							}
							local2067 = Static596.anInt9157;
							while (local2067 > 0) {
								local2067--;
								local529 = true;
								for (local2074 = 0; local2074 < local2067; local2074++) {
									if (local1960[local2074].aString89.compareTo(local1960[local2074 + 1].aString89) > 0) {
										local2095 = local1960[local2074];
										local1960[local2074] = local1960[local2074 + 1];
										local1960[local2074 + 1] = local2095;
										local529 = false;
									}
								}
								if (local529) {
									break;
								}
							}
							Static58.aClass151_23 = null;
							Static547.aClass275Array1 = local1960;
							return true;
						} else if (Static167.aClass151_69 == Static58.aClass151_23) {
							local422 = Static159.aClass4_Sub11_Sub1_1.method8865();
							local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
							Static316.method4370();
							if (local422 == 2) {
								Static399.method5100();
							}
							Static77.anInt1630 = local75;
							Static242.method3572(local75);
							Static470.method6503(false);
							Static237.method3391(Static77.anInt1630);
							for (local733 = 0; local733 < 100; local733++) {
								aBooleanArray4[local733] = true;
							}
							Static58.aClass151_23 = null;
							return true;
						} else if (Static497.aClass151_167 == Static58.aClass151_23) {
							local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
							local75 = Static159.aClass4_Sub11_Sub1_1.method8850();
							Static526.aClass293_1.method6539(local422, local75);
							Static58.aClass151_23 = null;
							return true;
						} else if (Static472.aClass151_159 == Static58.aClass151_23) {
							Static69.method1475();
							Static58.aClass151_23 = null;
							return false;
						} else {
							@Pc(2254) boolean local2254;
							@Pc(2273) int local2273;
							if (Static177.aClass151_70 == Static58.aClass151_23) {
								local1655 = Static159.aClass4_Sub11_Sub1_1.method8853();
								local435 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
								if (local435) {
									local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
								} else {
									local241 = local1655;
								}
								local441 = Static159.aClass4_Sub11_Sub1_1.method8859();
								@Pc(2252) byte local2252 = Static159.aClass4_Sub11_Sub1_1.method8861();
								local2254 = false;
								if (local2252 == -128) {
									local2254 = true;
								}
								if (local2254) {
									if (Static596.anInt9157 == 0) {
										Static58.aClass151_23 = null;
										return true;
									}
									for (local2273 = 0; local2273 < Static596.anInt9157 && (!Static547.aClass275Array1[local2273].aString90.equals(local241) || Static547.aClass275Array1[local2273].anInt7327 != local441); local2273++) {
									}
									if (Static596.anInt9157 > local2273) {
										while (Static596.anInt9157 - 1 > local2273) {
											Static547.aClass275Array1[local2273] = Static547.aClass275Array1[local2273 + 1];
											local2273++;
										}
										Static596.anInt9157--;
										Static547.aClass275Array1[Static596.anInt9157] = null;
									}
								} else {
									local824 = Static159.aClass4_Sub11_Sub1_1.method8853();
									local2095 = new Class275();
									local2095.aString90 = local241;
									local2095.aString88 = local1655;
									local2095.aString89 = Static317.method4379(local2095.aString90);
									local2095.aByte105 = local2252;
									local2095.aString87 = local824;
									local2095.anInt7327 = local441;
									for (local2067 = Static596.anInt9157 - 1; local2067 >= 0; local2067--) {
										local2074 = Static547.aClass275Array1[local2067].aString89.compareTo(local2095.aString89);
										if (local2074 == 0) {
											Static547.aClass275Array1[local2067].anInt7327 = local441;
											Static547.aClass275Array1[local2067].aByte105 = local2252;
											Static547.aClass275Array1[local2067].aString87 = local824;
											if (local241.equals(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37)) {
												Static294.aByte73 = local2252;
											}
											Static470.anInt7475 = Static317.anInt4914;
											Static58.aClass151_23 = null;
											return true;
										}
										if (local2074 < 0) {
											break;
										}
									}
									if (Static596.anInt9157 >= Static547.aClass275Array1.length) {
										Static58.aClass151_23 = null;
										return true;
									}
									for (local2074 = Static596.anInt9157 - 1; local2074 > local2067; local2074--) {
										Static547.aClass275Array1[local2074 + 1] = Static547.aClass275Array1[local2074];
									}
									if (Static596.anInt9157 == 0) {
										Static547.aClass275Array1 = new Class275[100];
									}
									Static547.aClass275Array1[local2067 + 1] = local2095;
									Static596.anInt9157++;
									if (local241.equals(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37)) {
										Static294.aByte73 = local2252;
									}
								}
								Static470.anInt7475 = Static317.anInt4914;
								Static58.aClass151_23 = null;
								return true;
							} else if (Static330.aClass151_113 == Static58.aClass151_23) {
								local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
								@Pc(2495) byte[] local2495 = new byte[Static583.anInt8992 - 1];
								Static159.aClass4_Sub11_Sub1_1.method8870(local2495, 0, Static583.anInt8992 - 1);
								Static192.method2988(local237, local2495);
								Static58.aClass151_23 = null;
								return true;
							} else if (Static402.aClass151_129 == Static58.aClass151_23) {
								Static316.method4370();
								Static310.method4320();
								Static58.aClass151_23 = null;
								return true;
							} else if (Static79.aClass151_38 == Static58.aClass151_23) {
								Static395.method2778(Static140.aClass117_14);
								Static58.aClass151_23 = null;
								return true;
							} else if (Static58.aClass151_23 == Static250.aClass151_93) {
								Static316.method4370();
								Static257.method3718();
								Static58.aClass151_23 = null;
								return true;
							} else if (Static590.aClass151_197 == Static58.aClass151_23) {
								Static261.anInt4244 = Static317.anInt4914;
								Static517.anInt8054 = 1;
								Static58.aClass151_23 = null;
								return true;
							} else {
								@Pc(2620) int local2620;
								@Pc(2682) int local2682;
								@Pc(2583) long local2583;
								@Pc(2588) long local2588;
								@Pc(2676) String local2676;
								if (Static58.aClass151_23 == Static206.aClass151_79) {
									local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
									local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
									local2583 = (long) Static159.aClass4_Sub11_Sub1_1.method8859();
									local2588 = (long) Static159.aClass4_Sub11_Sub1_1.method8827();
									local2273 = Static159.aClass4_Sub11_Sub1_1.method8865();
									local263 = Static159.aClass4_Sub11_Sub1_1.method8859();
									local270 = local2588 + (local2583 << 32);
									local272 = false;
									@Pc(2612) Class4_Sub55 local2612 = local237 ? Static64.aClass4_Sub55_1 : Static252.aClass4_Sub55_3;
									if (local2612 == null) {
										local272 = true;
									} else {
										label2144: {
											for (local2620 = 0; local2620 < 100; local2620++) {
												if (Static329.aLongArray7[local2620] == local270) {
													local272 = true;
													break label2144;
												}
											}
											if (local2273 <= 1 && Static130.method2323(local241)) {
												local272 = true;
											}
										}
									}
									if (!local272 && Static417.anInt6044 == 0) {
										Static329.aLongArray7[Static411.anInt5919] = local270;
										Static411.anInt5919 = (Static411.anInt5919 + 1) % 100;
										local2676 = Static410.aClass298_1.method6589(local263).method6418(Static159.aClass4_Sub11_Sub1_1);
										local2682 = local237 ? 42 : 45;
										if (local2273 == 2 || local2273 == 3) {
											Static169.method2827("<img=1>" + local241, local2682, "<img=1>" + local241, local2612.aString124, local241, local2676, local263, 0);
										} else if (local2273 == 1) {
											Static169.method2827("<img=0>" + local241, local2682, "<img=0>" + local241, local2612.aString124, local241, local2676, local263, 0);
										} else {
											Static169.method2827(local241, local2682, local241, local2612.aString124, local241, local2676, local263, 0);
										}
									}
									Static58.aClass151_23 = null;
									return true;
								}
								@Pc(2775) byte[] local2775;
								if (Static258.aClass151_96 == Static58.aClass151_23) {
									if (Static407.aFrame5 != null) {
										Static532.method7162(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, false);
									}
									local2775 = new byte[Static583.anInt8992];
									Static159.aClass4_Sub11_Sub1_1.method994(Static583.anInt8992, local2775);
									local241 = Static407.method2208(local2775, 0, Static583.anInt8992);
									local243 = "opensn";
									if (!Static278.aBoolean340 || Static195.method3023(Static239.aClass207_2, local243, 1, local241).anInt7338 == 2) {
										Static306.method4297(true, Static239.aClass207_2, local243, local241, Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 1);
									}
									Static58.aClass151_23 = null;
									return true;
								} else if (Static58.aClass151_23 == Static661.aClass151_208) {
									local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
									local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
									local243 = local241;
									if (local237) {
										local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
									}
									local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
									local445 = Static159.aClass4_Sub11_Sub1_1.method8859();
									local2254 = false;
									if (local441 <= 1 && Static130.method2323(local243)) {
										local2254 = true;
									}
									if (!local2254 && Static417.anInt6044 == 0) {
										local824 = Static410.aClass298_1.method6589(local445).method6418(Static159.aClass4_Sub11_Sub1_1);
										if (local441 == 2) {
											Static169.method2827("<img=1>" + local241, 25, "<img=1>" + local243, (String) null, local241, local824, local445, 0);
										} else if (local441 == 1) {
											Static169.method2827("<img=0>" + local241, 25, "<img=0>" + local243, (String) null, local241, local824, local445, 0);
										} else {
											Static169.method2827(local241, 25, local243, (String) null, local241, local824, local445, 0);
										}
									}
									Static58.aClass151_23 = null;
									return true;
								} else if (Static58.aClass151_23 == Static259.aClass151_97) {
									Static395.method2778(Static355.aClass117_10);
									Static58.aClass151_23 = null;
									return true;
								} else {
									@Pc(2978) byte local2978;
									if (Static58.aClass151_23 == Static108.aClass151_52) {
										local2978 = Static159.aClass4_Sub11_Sub1_1.method8882();
										local75 = Static159.aClass4_Sub11_Sub1_1.method8855();
										Static316.method4370();
										Static433.method5968(local75, local2978);
										Static58.aClass151_23 = null;
										return true;
									} else if (Static53.aClass151_22 == Static58.aClass151_23) {
										local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
										local75 = Static159.aClass4_Sub11_Sub1_1.method8865();
										Static316.method4370();
										Static470.method6501(local422, true, local75);
										Static58.aClass151_23 = null;
										return true;
									} else if (Static58.aClass151_23 == Static405.aClass151_131) {
										Static569.anInt8772 = Static317.anInt4914;
										local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
										@Pc(3035) Class6 local3035 = new Class6(Static159.aClass4_Sub11_Sub1_1);
										@Pc(3039) Class267 local3039;
										if (local237) {
											local3039 = Static140.aClass267_5;
										} else {
											local3039 = Static345.aClass267_4;
										}
										local3035.method111(local3039);
										Static58.aClass151_23 = null;
										return true;
									} else if (Static58.aClass151_23 == Static339.aClass151_114) {
										Static58.aClass151_23 = null;
										return false;
									} else if (Static58.aClass151_23 == Static3.aClass151_85) {
										local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
										local75 = Static159.aClass4_Sub11_Sub1_1.method8826();
										Static316.method4370();
										Static197.method4788(local422, local75);
										Static58.aClass151_23 = null;
										return true;
									} else if (Static58.aClass151_23 == Static256.aClass151_95) {
										local422 = Static159.aClass4_Sub11_Sub1_1.method8883();
										local75 = Static159.aClass4_Sub11_Sub1_1.method8883();
										Static316.method4370();
										Static224.method3272(local422, local75);
										Static58.aClass151_23 = null;
										return true;
									} else if (Static58.aClass151_23 == Static351.aClass151_117) {
										Static306.method4298(Static106.aBoolean137);
										Static58.aClass151_23 = null;
										return false;
									} else if (Static558.aClass151_187 == Static58.aClass151_23) {
										Static395.method2778(Static486.aClass117_13);
										Static58.aClass151_23 = null;
										return true;
									} else if (Static541.aClass151_183 == Static58.aClass151_23) {
										local1655 = Static159.aClass4_Sub11_Sub1_1.method8853();
										local75 = Static159.aClass4_Sub11_Sub1_1.method8855();
										local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
										if (local733 == 65535) {
											local733 = -1;
										}
										local441 = Static159.aClass4_Sub11_Sub1_1.method8843();
										if (local75 >= 1 && local75 <= 8) {
											if (local1655.equalsIgnoreCase("null")) {
												local1655 = null;
											}
											Static481.aStringArray39[local75 - 1] = local1655;
											Static430.anIntArray466[local75 - 1] = local733;
											Static466.aBooleanArray15[local75 - 1] = local441 == 0;
										}
										Static58.aClass151_23 = null;
										return true;
									} else if (Static58.aClass151_23 == Static451.aClass151_150) {
										local422 = Static159.aClass4_Sub11_Sub1_1.method8826();
										local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
										if (local75 == 65535) {
											local75 = -1;
										}
										Static316.method4370();
										Static598.method7847(local422, local75);
										Static58.aClass151_23 = null;
										return true;
									} else if (Static58.aClass151_23 == Static311.aClass151_110) {
										Static331.aString59 = Static583.anInt8992 > 2 ? Static159.aClass4_Sub11_Sub1_1.method8853() : Static279.aClass179_26.method4066(Static164.anInt2984);
										Static520.anInt8066 = Static583.anInt8992 > 0 ? Static159.aClass4_Sub11_Sub1_1.method8859() : -1;
										Static58.aClass151_23 = null;
										if (Static520.anInt8066 == 65535) {
											Static520.anInt8066 = -1;
										}
										return true;
									} else if (Static58.aClass151_23 == Static512.aClass151_171) {
										Static569.anInt8772 = Static317.anInt4914;
										local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
										if (Static583.anInt8992 != 1) {
											if (local237) {
												Static140.aClass267_5 = new Class267(Static159.aClass4_Sub11_Sub1_1);
											} else {
												Static345.aClass267_4 = new Class267(Static159.aClass4_Sub11_Sub1_1);
											}
											Static58.aClass151_23 = null;
											return true;
										}
										Static58.aClass151_23 = null;
										if (local237) {
											Static140.aClass267_5 = null;
										} else {
											Static345.aClass267_4 = null;
										}
										return true;
									} else if (Static58.aClass151_23 == Static140.aClass151_177) {
										local422 = Static159.aClass4_Sub11_Sub1_1.method8865();
										local75 = local422 >> 5;
										local733 = local422 & 0x1F;
										if (local733 == 0) {
											Static9.aClass82Array41[local75] = null;
											Static58.aClass151_23 = null;
											return true;
										}
										@Pc(3329) Class82 local3329 = new Class82();
										local3329.anInt2225 = local733;
										local3329.anInt2230 = Static159.aClass4_Sub11_Sub1_1.method8865();
										if (local3329.anInt2230 >= 0 && Static384.aClass17Array12.length > local3329.anInt2230) {
											if (local3329.anInt2225 == 1 || local3329.anInt2225 == 10) {
												local3329.anInt2224 = Static159.aClass4_Sub11_Sub1_1.method8859();
												Static159.aClass4_Sub11_Sub1_1.anInt10466 += 6;
											} else if (local3329.anInt2225 >= 2 && local3329.anInt2225 <= 6) {
												if (local3329.anInt2225 == 2) {
													local3329.anInt2233 = 256;
													local3329.anInt2227 = 256;
												}
												if (local3329.anInt2225 == 3) {
													local3329.anInt2227 = 0;
													local3329.anInt2233 = 256;
												}
												if (local3329.anInt2225 == 4) {
													local3329.anInt2233 = 256;
													local3329.anInt2227 = 512;
												}
												if (local3329.anInt2225 == 5) {
													local3329.anInt2233 = 0;
													local3329.anInt2227 = 256;
												}
												if (local3329.anInt2225 == 6) {
													local3329.anInt2233 = 512;
													local3329.anInt2227 = 256;
												}
												local3329.anInt2225 = 2;
												local3329.anInt2231 = Static159.aClass4_Sub11_Sub1_1.method8865();
												local3329.anInt2227 += Static159.aClass4_Sub11_Sub1_1.method8859() - Static445.anInt6949 << 9;
												local3329.anInt2233 += Static159.aClass4_Sub11_Sub1_1.method8859() - Static321.anInt5000 << 9;
												local3329.anInt2226 = Static159.aClass4_Sub11_Sub1_1.method8865() << 2;
												local3329.anInt2232 = Static159.aClass4_Sub11_Sub1_1.method8859();
											}
											local3329.anInt2229 = Static159.aClass4_Sub11_Sub1_1.method8859();
											if (local3329.anInt2229 == 65535) {
												local3329.anInt2229 = -1;
											}
											Static9.aClass82Array41[local75] = local3329;
										}
										Static58.aClass151_23 = null;
										return true;
									} else if (Static27.aClass151_15 == Static58.aClass151_23) {
										local1655 = Static159.aClass4_Sub11_Sub1_1.method8853();
										@Pc(3519) Object[] local3519 = new Object[local1655.length() + 1];
										for (local733 = local1655.length() - 1; local733 >= 0; local733--) {
											if (local1655.charAt(local733) == 's') {
												local3519[local733 + 1] = Static159.aClass4_Sub11_Sub1_1.method8853();
											} else {
												local3519[local733 + 1] = Integer.valueOf(Static159.aClass4_Sub11_Sub1_1.method8850());
											}
										}
										local3519[0] = Integer.valueOf(Static159.aClass4_Sub11_Sub1_1.method8850());
										Static316.method4370();
										@Pc(3574) Class4_Sub25 local3574 = new Class4_Sub25();
										local3574.anObjectArray2 = local3519;
										Static237.method3393(local3574);
										Static58.aClass151_23 = null;
										return true;
									} else {
										@Pc(3636) boolean local3636;
										if (Static115.aClass151_55 == Static58.aClass151_23) {
											local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
											local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
											local243 = local241;
											if (local237) {
												local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
											}
											local254 = (long) Static159.aClass4_Sub11_Sub1_1.method8859();
											local259 = (long) Static159.aClass4_Sub11_Sub1_1.method8827();
											local263 = Static159.aClass4_Sub11_Sub1_1.method8865();
											local2067 = Static159.aClass4_Sub11_Sub1_1.method8859();
											@Pc(3634) long local3634 = (local254 << 32) + local259;
											local3636 = false;
											local2620 = 0;
											while (true) {
												if (local2620 >= 100) {
													if (local263 <= 1 && Static130.method2323(local243)) {
														local3636 = true;
													}
													break;
												}
												if (Static329.aLongArray7[local2620] == local3634) {
													local3636 = true;
													break;
												}
												local2620++;
											}
											if (!local3636 && Static417.anInt6044 == 0) {
												Static329.aLongArray7[Static411.anInt5919] = local3634;
												Static411.anInt5919 = (Static411.anInt5919 + 1) % 100;
												local2676 = Static410.aClass298_1.method6589(local2067).method6418(Static159.aClass4_Sub11_Sub1_1);
												if (local263 == 2) {
													Static169.method2827("<img=1>" + local241, 18, "<img=1>" + local243, (String) null, local241, local2676, local2067, 0);
												} else if (local263 == 1) {
													Static169.method2827("<img=0>" + local241, 18, "<img=0>" + local243, (String) null, local241, local2676, local2067, 0);
												} else {
													Static169.method2827(local241, 18, local243, (String) null, local241, local2676, local2067, 0);
												}
											}
											Static58.aClass151_23 = null;
											return true;
										} else if (Static91.aClass151_44 == Static58.aClass151_23) {
											local422 = Static159.aClass4_Sub11_Sub1_1.method8855();
											local75 = Static159.aClass4_Sub11_Sub1_1.method8865();
											local733 = Static159.aClass4_Sub11_Sub1_1.method8883();
											if (local733 == 65535) {
												local733 = -1;
											}
											Static583.method7684(local733, local422, local75);
											Static58.aClass151_23 = null;
											return true;
										} else if (Static223.aClass151_80 == Static58.aClass151_23) {
											local422 = Static159.aClass4_Sub11_Sub1_1.method8890();
											if (local422 == 65535) {
												local422 = -1;
											}
											local75 = Static159.aClass4_Sub11_Sub1_1.method8843();
											local733 = Static159.aClass4_Sub11_Sub1_1.method8851();
											Static319.method4409(local733, local422, local75);
											Static58.aClass151_23 = null;
											return true;
										} else if (Static622.aClass151_213 == Static58.aClass151_23) {
											local422 = Static159.aClass4_Sub11_Sub1_1.method8884();
											Static316.method4370();
											@Pc(3851) Class4_Sub28 local3851 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local422);
											if (local3851 != null) {
												Static601.method7899(true, false, local3851);
											}
											if (Static451.aClass199_11 != null) {
												Static331.method4565(Static451.aClass199_11);
												Static451.aClass199_11 = null;
											}
											Static58.aClass151_23 = null;
											return true;
										} else {
											@Pc(3901) boolean local3901;
											if (Static6.aClass151_7 == Static58.aClass151_23) {
												local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
												local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
												local243 = local241;
												if (local237) {
													local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
												}
												local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
												local3901 = false;
												if (local441 <= 1) {
													if (Static197.aBoolean408 && !Static263.aBoolean317 || Static42.aBoolean75) {
														local3901 = true;
													} else if (local441 <= 1 && Static130.method2323(local243)) {
														local3901 = true;
													}
												}
												if (!local3901 && Static417.anInt6044 == 0) {
													local527 = Static30.method665(Static475.method6540(Static159.aClass4_Sub11_Sub1_1));
													if (local441 == 2) {
														Static169.method2827("<img=1>" + local241, 24, "<img=1>" + local243, (String) null, local241, local527, -1, 0);
													} else if (local441 == 1) {
														Static169.method2827("<img=0>" + local241, 24, "<img=0>" + local243, (String) null, local241, local527, -1, 0);
													} else {
														Static169.method2827(local241, 24, local243, (String) null, local241, local527, -1, 0);
													}
												}
												Static58.aClass151_23 = null;
												return true;
											}
											@Pc(4046) long local4046;
											@Pc(4054) int local4054;
											@Pc(4065) int local4065;
											if (Static650.aClass151_221 == Static58.aClass151_23) {
												local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
												local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
												local243 = local241;
												if (local237) {
													local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
												}
												local254 = Static159.aClass4_Sub11_Sub1_1.method8830();
												local259 = (long) Static159.aClass4_Sub11_Sub1_1.method8859();
												local4046 = (long) Static159.aClass4_Sub11_Sub1_1.method8827();
												local2074 = Static159.aClass4_Sub11_Sub1_1.method8865();
												local4054 = Static159.aClass4_Sub11_Sub1_1.method8859();
												@Pc(4061) long local4061 = (local259 << 32) + local4046;
												@Pc(4063) boolean local4063 = false;
												local4065 = 0;
												while (true) {
													if (local4065 >= 100) {
														if (local2074 <= 1 && Static130.method2323(local243)) {
															local4063 = true;
														}
														break;
													}
													if (Static329.aLongArray7[local4065] == local4061) {
														local4063 = true;
														break;
													}
													local4065++;
												}
												if (!local4063 && Static417.anInt6044 == 0) {
													Static329.aLongArray7[Static411.anInt5919] = local4061;
													Static411.anInt5919 = (Static411.anInt5919 + 1) % 100;
													@Pc(4121) String local4121 = Static410.aClass298_1.method6589(local4054).method6418(Static159.aClass4_Sub11_Sub1_1);
													if (local2074 == 2) {
														Static169.method2827("<img=1>" + local241, 20, "<img=1>" + local243, Static111.method2113(local254), local241, local4121, local4054, 0);
													} else if (local2074 == 1) {
														Static169.method2827("<img=0>" + local241, 20, "<img=0>" + local243, Static111.method2113(local254), local241, local4121, local4054, 0);
													} else {
														Static169.method2827(local241, 20, local243, Static111.method2113(local254), local241, local4121, local4054, 0);
													}
												}
												Static58.aClass151_23 = null;
												return true;
											} else if (Static195.aClass151_76 == Static58.aClass151_23) {
												Static433.anInt6809 = Static159.aClass4_Sub11_Sub1_1.method8862();
												Static464.anInt7426 = Static159.aClass4_Sub11_Sub1_1.method8875() << 3;
												Static342.anInt8647 = Static159.aClass4_Sub11_Sub1_1.method8875() << 3;
												Static58.aClass151_23 = null;
												return true;
											} else if (Static58.aClass151_23 == Static163.aClass151_67) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8850();
												Static431.aClass281_4 = Static239.aClass207_2.method4586(local422);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static389.aClass151_126 == Static58.aClass151_23) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8850();
												local75 = Static159.aClass4_Sub11_Sub1_1.method8843();
												local733 = Static159.aClass4_Sub11_Sub1_1.method8855();
												Static523.anIntArray556[local733] = local422;
												Static521.anIntArray554[local733] = local75;
												Static668.anIntArray722[local733] = 1;
												local441 = Static26.anIntArray90[local733] - 1;
												for (local445 = 0; local445 < local441; local445++) {
													if (local422 >= Class192.anIntArray641[local445]) {
														Static668.anIntArray722[local733] = local445 + 2;
													}
												}
												Static257.anIntArray303[Static617.anInt9687++ & 0x1F] = local733;
												Static58.aClass151_23 = null;
												return true;
											} else if (Static84.aClass151_41 == Static58.aClass151_23) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8890();
												local75 = Static159.aClass4_Sub11_Sub1_1.method8884();
												Static316.method4370();
												Static202.method3065(local422, local75);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static352.aClass151_118 == Static58.aClass151_23) {
												local237 = Static159.aClass4_Sub11_Sub1_1.method8855() == 1;
												Static316.method4370();
												Static58.aClass151_23 = null;
												Static258.aBoolean313 = local237;
												return true;
											} else if (Static58.aClass151_23 == Static266.aClass151_99) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8862();
												local75 = Static159.aClass4_Sub11_Sub1_1.method8862();
												if (local422 == 255) {
													local75 = -1;
													local422 = -1;
												}
												Static119.method2165(local75, local422);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static58.aClass151_23 == Static106.aClass151_50) {
												Static205.method3086();
												Static58.aClass151_23 = null;
												return false;
											} else if (Static58.aClass151_23 == Static76.aClass151_32) {
												if (Static477.method6557(Static656.anInt10356)) {
													Static179.anInt3120 = (int) ((float) Static159.aClass4_Sub11_Sub1_1.method8859() * 2.5F);
												} else {
													Static179.anInt3120 = Static159.aClass4_Sub11_Sub1_1.method8859() * 30;
												}
												Static58.aClass151_23 = null;
												Static465.anInt7431 = Static317.anInt4914;
												return true;
											} else if (Static348.aClass151_115 == Static58.aClass151_23) {
												local1655 = Static159.aClass4_Sub11_Sub1_1.method8853();
												local75 = Static159.aClass4_Sub11_Sub1_1.method8883();
												Static316.method4370();
												Static45.method822(local1655, local75);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static58.aClass151_23 == Static320.aClass151_195) {
												Static299.method4204();
												Static58.aClass151_23 = null;
												return true;
											} else if (Static58.aClass151_23 == Static522.aClass151_176) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8843();
												local75 = Static159.aClass4_Sub11_Sub1_1.method8883() << 2;
												local733 = Static159.aClass4_Sub11_Sub1_1.method8855();
												local441 = Static159.aClass4_Sub11_Sub1_1.method8855();
												local445 = Static159.aClass4_Sub11_Sub1_1.method8855();
												Static316.method4370();
												Static333.method4592(local422, local733, local441, local445, local75);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static89.aClass151_43 == Static58.aClass151_23) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8843();
												local75 = Static159.aClass4_Sub11_Sub1_1.method8837();
												Static316.method4370();
												Static656.method8747(local75, local422);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static242.aClass151_89 == Static58.aClass151_23) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
												Static316.method4370();
												Static343.method4655(local422);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static425.aClass151_139 == Static58.aClass151_23) {
												Static433.anInt6809 = Static159.aClass4_Sub11_Sub1_1.method8855();
												Static342.anInt8647 = Static159.aClass4_Sub11_Sub1_1.method8882() << 3;
												Static464.anInt7426 = Static159.aClass4_Sub11_Sub1_1.method8882() << 3;
												for (@Pc(4558) Class4_Sub7 local4558 = (Class4_Sub7) Static406.aClass66_28.method1992(); local4558 != null; local4558 = (Class4_Sub7) Static406.aClass66_28.method1984()) {
													local75 = (int) (local4558.aLong307 >> 28 & 0x3L);
													local733 = (int) (local4558.aLong307 & 0x3FFFL);
													local441 = local733 - Static445.anInt6949;
													local445 = (int) (local4558.aLong307 >> 14 & 0x3FFFL);
													local447 = local445 - Static321.anInt5000;
													if (Static433.anInt6809 == local75 && local441 >= Static464.anInt7426 && Static464.anInt7426 + 8 > local441 && local447 >= Static342.anInt8647 && Static342.anInt8647 + 8 > local447) {
														local4558.method9000();
														if (local441 >= 0 && local447 >= 0 && local441 < Static224.anInt3557 && local447 < Static267.anInt4309) {
															Static552.method7370(local441, Static433.anInt6809, local447);
														}
													}
												}
												@Pc(4663) Class4_Sub27 local4663;
												for (local4663 = (Class4_Sub27) Static26.aClass163_13.method3639(); local4663 != null; local4663 = (Class4_Sub27) Static26.aClass163_13.method3640()) {
													if (Static464.anInt7426 <= local4663.anInt4663 && Static464.anInt7426 + 8 > local4663.anInt4663 && Static342.anInt8647 <= local4663.anInt4666 && Static342.anInt8647 + 8 > local4663.anInt4666 && local4663.anInt4668 == Static433.anInt6809) {
														local4663.aBoolean348 = true;
													}
												}
												for (local4663 = (Class4_Sub27) Static450.aClass163_49.method3639(); local4663 != null; local4663 = (Class4_Sub27) Static450.aClass163_49.method3640()) {
													if (Static464.anInt7426 <= local4663.anInt4663 && Static464.anInt7426 + 8 > local4663.anInt4663 && Static342.anInt8647 <= local4663.anInt4666 && Static342.anInt8647 + 8 > local4663.anInt4666 && local4663.anInt4668 == Static433.anInt6809) {
														local4663.aBoolean348 = true;
													}
												}
												Static58.aClass151_23 = null;
												return true;
											} else if (Static540.aClass151_182 == Static58.aClass151_23) {
												Static183.anInt3143 = Static317.anInt4914;
												local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
												@Pc(4787) Class205 local4787 = new Class205(Static159.aClass4_Sub11_Sub1_1);
												@Pc(4791) Class4_Sub55 local4791;
												if (local237) {
													local4791 = Static64.aClass4_Sub55_1;
												} else {
													local4791 = Static252.aClass4_Sub55_3;
												}
												local4787.method4563(local4791);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static108.aClass151_53 == Static58.aClass151_23) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
												local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
												Static316.method4370();
												Static45.method822(local241, local422);
												Static58.aClass151_23 = null;
												return true;
											} else if (Static458.aClass151_152 == Static58.aClass151_23) {
												Static633.anInt9792 = Static159.aClass4_Sub11_Sub1_1.method8865();
												for (local422 = 0; local422 < Static633.anInt9792; local422++) {
													Static16.aStringArray4[local422] = Static159.aClass4_Sub11_Sub1_1.method8853();
													Static280.aStringArray49[local422] = Static159.aClass4_Sub11_Sub1_1.method8853();
													if (Static280.aStringArray49[local422].equals("")) {
														Static280.aStringArray49[local422] = Static16.aStringArray4[local422];
													}
													Static301.aStringArray21[local422] = Static159.aClass4_Sub11_Sub1_1.method8853();
													Static571.aStringArray44[local422] = Static159.aClass4_Sub11_Sub1_1.method8853();
													if (Static571.aStringArray44[local422].equals("")) {
														Static571.aStringArray44[local422] = Static301.aStringArray21[local422];
													}
													Static506.aBooleanArray16[local422] = false;
												}
												Static58.aClass151_23 = null;
												Static261.anInt4244 = Static317.anInt4914;
												return true;
											} else if (Static58.aClass151_23 == Static521.aClass151_173) {
												local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
												Static316.method4370();
												Static426.method5914(local422);
												Static58.aClass151_23 = null;
												return true;
											} else {
												@Pc(4947) String local4947;
												if (Static637.aClass151_216 == Static58.aClass151_23) {
													local422 = Static159.aClass4_Sub11_Sub1_1.method8865();
													@Pc(4939) boolean local4939 = (local422 & 0x1) == 1;
													local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
													local4947 = Static159.aClass4_Sub11_Sub1_1.method8853();
													if (local4947.equals("")) {
														local4947 = local243;
													}
													local788 = Static159.aClass4_Sub11_Sub1_1.method8853();
													local527 = Static159.aClass4_Sub11_Sub1_1.method8853();
													if (local527.equals("")) {
														local527 = local788;
													}
													if (local4939) {
														for (local2273 = 0; local2273 < Static633.anInt9792; local2273++) {
															if (Static280.aStringArray49[local2273].equals(local527)) {
																Static16.aStringArray4[local2273] = local243;
																Static280.aStringArray49[local2273] = local4947;
																Static301.aStringArray21[local2273] = local788;
																Static571.aStringArray44[local2273] = local527;
																break;
															}
														}
													} else {
														Static16.aStringArray4[Static633.anInt9792] = local243;
														Static280.aStringArray49[Static633.anInt9792] = local4947;
														Static301.aStringArray21[Static633.anInt9792] = local788;
														Static571.aStringArray44[Static633.anInt9792] = local527;
														Static506.aBooleanArray16[Static633.anInt9792] = (local422 & 0x2) == 2;
														Static633.anInt9792++;
													}
													Static58.aClass151_23 = null;
													Static261.anInt4244 = Static317.anInt4914;
													return true;
												} else if (Static58.aClass151_23 == Static59.aClass151_26) {
													if (Static407.aFrame5 != null) {
														Static532.method7162(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, false);
													}
													local2775 = new byte[Static583.anInt8992];
													Static159.aClass4_Sub11_Sub1_1.method994(Static583.anInt8992, local2775);
													local241 = Static407.method2208(local2775, 0, Static583.anInt8992);
													Static355.method4755(Static239.aClass207_2, local241, true, Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 1);
													Static58.aClass151_23 = null;
													return true;
												} else if (Static58.aClass151_23 == Static34.aClass151_212) {
													Static342.anInt8647 = Static159.aClass4_Sub11_Sub1_1.method8861() << 3;
													Static433.anInt6809 = Static159.aClass4_Sub11_Sub1_1.method8862();
													Static464.anInt7426 = Static159.aClass4_Sub11_Sub1_1.method8831() << 3;
													while (Static159.aClass4_Sub11_Sub1_1.anInt10466 < Static583.anInt8992) {
														@Pc(5125) Class117 local5125 = Static664.method8795()[Static159.aClass4_Sub11_Sub1_1.method8865()];
														Static395.method2778(local5125);
													}
													Static58.aClass151_23 = null;
													return true;
												} else if (Static58.aClass151_23 == Static443.aClass151_143) {
													local422 = Static159.aClass4_Sub11_Sub1_1.method8887();
													local75 = Static159.aClass4_Sub11_Sub1_1.method8837();
													local733 = Static159.aClass4_Sub11_Sub1_1.method8834();
													Static316.method4370();
													Static61.method1342(local75, local422, local733);
													Static58.aClass151_23 = null;
													return true;
												} else if (Static77.aClass151_33 == Static58.aClass151_23) {
													local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
													if (local422 == 65535) {
														local422 = -1;
													}
													local75 = Static159.aClass4_Sub11_Sub1_1.method8865();
													local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
													local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
													local445 = Static159.aClass4_Sub11_Sub1_1.method8859();
													Static412.method5195(local445, local441, local75, local422, false, local733);
													Static58.aClass151_23 = null;
													return true;
												} else if (Static553.aClass151_186 == Static58.aClass151_23) {
													local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
													if (local422 == 65535) {
														local422 = -1;
													}
													local75 = Static159.aClass4_Sub11_Sub1_1.method8859();
													local733 = Static159.aClass4_Sub11_Sub1_1.method8850();
													local441 = Static159.aClass4_Sub11_Sub1_1.method8859();
													if (local441 == 65535) {
														local441 = -1;
													}
													Static316.method4370();
													for (local445 = local441; local445 <= local422; local445++) {
														local259 = ((long) local733 << 32) + (long) local445;
														local1186 = (Class4_Sub10) Static598.aClass66_42.method1994(local259);
														if (local1186 != null) {
															local1195 = new Class4_Sub10(local1186.anInt890, local75);
															local1186.method9000();
														} else if (local445 == -1) {
															local1195 = new Class4_Sub10(Static569.method7534(local733).aClass4_Sub10_1.anInt890, local75);
														} else {
															local1195 = new Class4_Sub10(0, local75);
														}
														Static598.aClass66_42.method1985(local1195, local259);
													}
													Static58.aClass151_23 = null;
													return true;
												} else if (Static365.aClass151_124 == Static58.aClass151_23) {
													Static395.method2778(Static258.aClass117_9);
													Static58.aClass151_23 = null;
													return true;
												} else if (Static104.aClass151_49 == Static58.aClass151_23) {
													local422 = Static159.aClass4_Sub11_Sub1_1.method8884();
													Static316.method4370();
													Static57.method1304(-1, -1, 3, local422);
													Static58.aClass151_23 = null;
													return true;
												} else if (Static58.aClass151_23 == Static143.aClass151_63) {
													Static306.method4298(false);
													Static58.aClass151_23 = null;
													return false;
												} else if (Static58.aClass151_23 == Static540.aClass151_181) {
													local422 = Static159.aClass4_Sub11_Sub1_1.method8865();
													local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
													local435 = (local422 & 0x1) == 1;
													Static157.method2711(local435, local75);
													Static356.anIntArray417[Static529.anInt2658++ & 0x1F] = local75;
													Static58.aClass151_23 = null;
													return true;
												} else if (Static43.aClass151_21 == Static58.aClass151_23) {
													Static395.method2778(Static189.aClass117_6);
													Static58.aClass151_23 = null;
													return true;
												} else {
													@Pc(5490) boolean local5490;
													if (Static165.aClass151_68 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8855();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
														local733 = Static159.aClass4_Sub11_Sub1_1.method8850();
														local441 = Static159.aClass4_Sub11_Sub1_1.method8859();
														local445 = Static159.aClass4_Sub11_Sub1_1.method8890();
														local447 = Static159.aClass4_Sub11_Sub1_1.method8862();
														local2273 = local447 & 0x7;
														local263 = local447 >> 3 & 0xF;
														if (local263 == 15) {
															local263 = -1;
														}
														if (local733 >> 30 == 0) {
															@Pc(5508) Class323 local5508;
															@Pc(5570) Class124 local5570;
															@Pc(5522) Class124 local5522;
															if (local733 >> 29 != 0) {
																local2067 = local733 & 0xFFFF;
																@Pc(5473) Class4_Sub45 local5473 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local2067);
																if (local5473 != null) {
																	@Pc(5478) Class3_Sub1_Sub2_Sub2_Sub2 local5478 = local5473.aClass3_Sub1_Sub2_Sub2_Sub2_2;
																	@Pc(5483) Class78 local5483 = local5478.aClass78Array3[local422];
																	if (local75 == 65535) {
																		local75 = -1;
																	}
																	local5490 = true;
																	local2682 = local5483.anInt2180;
																	if (local75 != -1 && local2682 != -1) {
																		if (local2682 == local75) {
																			local5508 = Static341.aClass349_1.method7597(local75);
																			if (local5508.aBoolean644 && local5508.anInt8322 != -1) {
																				local5522 = Static99.aClass2_1.method22(local5508.anInt8322);
																				@Pc(5525) int local5525 = local5522.anInt3024;
																				if (local5525 == 0 || local5525 == 2) {
																					local5490 = false;
																				} else if (local5525 == 1) {
																					local5490 = true;
																				}
																			}
																		} else {
																			local5508 = Static341.aClass349_1.method7597(local75);
																			@Pc(5555) Class323 local5555 = Static341.aClass349_1.method7597(local2682);
																			if (local5508.anInt8322 != -1 && local5555.anInt8322 != -1) {
																				local5570 = Static99.aClass2_1.method22(local5508.anInt8322);
																				@Pc(5576) Class124 local5576 = Static99.aClass2_1.method22(local5555.anInt8322);
																				if (local5576.anInt3029 > local5570.anInt3029) {
																					local5490 = false;
																				}
																			}
																		}
																	}
																	if (local5490) {
																		local5483.anInt2180 = local75;
																		local5483.anInt2181 = local445;
																		local5483.anInt2176 = local2273;
																		local5483.anInt2174 = 1;
																		local5483.anInt2175 = 0;
																		local5483.anInt2178 = 0;
																		local5483.anInt2184 = local263;
																		local5483.anInt2177 = Static177.anInt3088 + local441;
																		if (local5483.anInt2180 == 65535) {
																			local5483.anInt2180 = -1;
																		}
																		if (Static177.anInt3088 < local5483.anInt2177) {
																			local5483.anInt2175 = -1;
																		}
																		if (local5483.anInt2180 != -1 && Static177.anInt3088 == local5483.anInt2177) {
																			local4065 = Static341.aClass349_1.method7597(local5483.anInt2180).anInt8322;
																			if (local4065 != -1) {
																				local5522 = Static99.aClass2_1.method22(local4065);
																				if (local5522 != null && local5522.anIntArray224 != null && !local5478.aBoolean773) {
																					Static633.method8389(0, local5478, local5522);
																				}
																			}
																		}
																	}
																}
															} else if (local733 >> 28 != 0) {
																local2067 = local733 & 0xFFFF;
																@Pc(5687) Class3_Sub1_Sub2_Sub2_Sub1 local5687;
																if (Static184.anInt3149 == local2067) {
																	local5687 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4;
																} else {
																	local5687 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local2067];
																}
																if (local5687 != null) {
																	if (local75 == 65535) {
																		local75 = -1;
																	}
																	@Pc(5705) Class78 local5705 = local5687.aClass78Array3[local422];
																	local3636 = true;
																	local2620 = local5705.anInt2180;
																	@Pc(5789) Class124 local5789;
																	if (local75 != -1 && local2620 != -1) {
																		@Pc(5726) Class323 local5726;
																		if (local2620 == local75) {
																			local5726 = Static341.aClass349_1.method7597(local75);
																			if (local5726.aBoolean644 && local5726.anInt8322 != -1) {
																				local5789 = Static99.aClass2_1.method22(local5726.anInt8322);
																				@Pc(5792) int local5792 = local5789.anInt3024;
																				if (local5792 == 0 || local5792 == 2) {
																					local3636 = false;
																				} else if (local5792 == 1) {
																					local3636 = true;
																				}
																			}
																		} else {
																			local5726 = Static341.aClass349_1.method7597(local75);
																			local5508 = Static341.aClass349_1.method7597(local2620);
																			if (local5726.anInt8322 != -1 && local5508.anInt8322 != -1) {
																				local5522 = Static99.aClass2_1.method22(local5726.anInt8322);
																				local5570 = Static99.aClass2_1.method22(local5508.anInt8322);
																				if (local5570.anInt3029 > local5522.anInt3029) {
																					local3636 = false;
																				}
																			}
																		}
																	}
																	if (local3636) {
																		local5705.anInt2181 = local445;
																		local5705.anInt2176 = local2273;
																		local5705.anInt2184 = local263;
																		local5705.anInt2177 = local441 + Static177.anInt3088;
																		local5705.anInt2174 = 1;
																		local5705.anInt2175 = 0;
																		local5705.anInt2180 = local75;
																		local5705.anInt2178 = 0;
																		if (local5705.anInt2177 > Static177.anInt3088) {
																			local5705.anInt2175 = -1;
																		}
																		if (local5705.anInt2180 == 65535) {
																			local5705.anInt2180 = -1;
																		}
																		if (local5705.anInt2180 != -1 && Static177.anInt3088 == local5705.anInt2177) {
																			local2682 = Static341.aClass349_1.method7597(local5705.anInt2180).anInt8322;
																			if (local2682 != -1) {
																				local5789 = Static99.aClass2_1.method22(local2682);
																				if (local5789 != null && local5789.anIntArray224 != null && !local5687.aBoolean773) {
																					Static633.method8389(0, local5687, local5789);
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local2067 = local733 >> 28 & 0x3;
															local2074 = (local733 >> 14 & 0x3FFF) - Static445.anInt6949;
															local4054 = (local733 & 0x3FFF) - Static321.anInt5000;
															if (local2074 >= 0 && local4054 >= 0 && Static224.anInt3557 > local2074 && local4054 < Static267.anInt4309) {
																local274 = local2074 * 512 + 256;
																local2620 = local4054 * 512 + 256;
																local2682 = local2067;
																if (local2067 < 3 && Static547.method7286(local2074, local4054)) {
																	local2682 = local2067 + 1;
																}
																@Pc(5992) Class3_Sub1_Sub2_Sub5 local5992 = new Class3_Sub1_Sub2_Sub5(local75, local441, Static177.anInt3088, local2067, local2682, local274, Static674.method8951(local2067, local2620, local274) - local445, local2620, local2074, local2074, local4054, local4054, local2273);
																Static153.aClass163_19.method3646(new Class4_Sub5_Sub10(local5992));
															}
														}
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static575.aClass151_194) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8826();
														Static526.aClass293_1.method6535(local75, local422);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static225.aClass151_81 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8865();
														local435 = (local75 & 0x1) == 1;
														Static182.method2912(local422, local435);
														local441 = Static159.aClass4_Sub11_Sub1_1.method8859();
														for (local445 = 0; local445 < local441; local445++) {
															local447 = Static159.aClass4_Sub11_Sub1_1.method8883();
															local2273 = Static159.aClass4_Sub11_Sub1_1.method8865();
															if (local2273 == 255) {
																local2273 = Static159.aClass4_Sub11_Sub1_1.method8884();
															}
															Static34.method8331(local2273, local422, local447 - 1, local435, local445);
														}
														Static356.anIntArray417[Static529.anInt2658++ & 0x1F] = local422;
														Static58.aClass151_23 = null;
														return true;
													} else if (Static561.aClass151_188 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8837();
														Static316.method4370();
														Static57.method1304(Static184.anInt3149, 0, 5, local422);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static240.aClass151_86) {
														Static395.method2778(Static228.aClass117_7);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static111.aClass151_54) {
														Static395.method2778(Static666.aClass117_17);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static466.aClass151_156 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8823();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8850();
														local733 = Static159.aClass4_Sub11_Sub1_1.method8865();
														local4947 = "";
														local788 = local4947;
														if ((local733 & 0x1) != 0) {
															local4947 = Static159.aClass4_Sub11_Sub1_1.method8853();
															if ((local733 & 0x2) == 0) {
																local788 = local4947;
															} else {
																local788 = Static159.aClass4_Sub11_Sub1_1.method8853();
															}
														}
														local527 = Static159.aClass4_Sub11_Sub1_1.method8853();
														if (local422 == 99) {
															Static383.method8457(local527);
														} else if (local788.equals("") || !Static130.method2323(local788)) {
															Static388.method5002(local4947, local527, local4947, local788, local422, local75);
														} else {
															Static58.aClass151_23 = null;
															return true;
														}
														Static58.aClass151_23 = null;
														return true;
													} else if (Static521.aClass151_175 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8865();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8859();
														local733 = Static159.aClass4_Sub11_Sub1_1.method8855();
														local441 = Static159.aClass4_Sub11_Sub1_1.method8843();
														local445 = Static159.aClass4_Sub11_Sub1_1.method8843();
														Static316.method4370();
														Static527.aBooleanArray18[local733] = true;
														Static199.anIntArray242[local733] = local422;
														Static131.anIntArray160[local733] = local445;
														Static231.anIntArray576[local733] = local441;
														Static395.anIntArray212[local733] = local75;
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static404.aClass151_130) {
														local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
														local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
														local243 = local241;
														if (local237) {
															local243 = Static159.aClass4_Sub11_Sub1_1.method8853();
														}
														local254 = Static159.aClass4_Sub11_Sub1_1.method8830();
														local259 = (long) Static159.aClass4_Sub11_Sub1_1.method8859();
														local4046 = (long) Static159.aClass4_Sub11_Sub1_1.method8827();
														local2074 = Static159.aClass4_Sub11_Sub1_1.method8865();
														@Pc(6331) long local6331 = (local259 << 32) + local4046;
														local5490 = false;
														local2682 = 0;
														while (true) {
															if (local2682 >= 100) {
																if (local2074 <= 1) {
																	if (Static197.aBoolean408 && !Static263.aBoolean317 || Static42.aBoolean75) {
																		local5490 = true;
																	} else if (Static130.method2323(local243)) {
																		local5490 = true;
																	}
																}
																break;
															}
															if (Static329.aLongArray7[local2682] == local6331) {
																local5490 = true;
																break;
															}
															local2682++;
														}
														if (!local5490 && Static417.anInt6044 == 0) {
															Static329.aLongArray7[Static411.anInt5919] = local6331;
															Static411.anInt5919 = (Static411.anInt5919 + 1) % 100;
															@Pc(6395) String local6395 = Static30.method665(Static475.method6540(Static159.aClass4_Sub11_Sub1_1));
															if (local2074 == 2 || local2074 == 3) {
																Static169.method2827("<img=1>" + local241, 9, "<img=1>" + local243, Static111.method2113(local254), local241, local6395, -1, 0);
															} else if (local2074 == 1) {
																Static169.method2827("<img=0>" + local241, 9, "<img=0>" + local243, Static111.method2113(local254), local241, local6395, -1, 0);
															} else {
																Static169.method2827(local241, 9, local243, Static111.method2113(local254), local241, local6395, -1, 0);
															}
														}
														Static58.aClass151_23 = null;
														return true;
													} else if (Static493.aClass151_166 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8883();
														@Pc(6485) byte local6485 = Static159.aClass4_Sub11_Sub1_1.method8875();
														Static526.aClass293_1.method6539(local422, local6485);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static377.aClass151_125) {
														local1655 = Static159.aClass4_Sub11_Sub1_1.method8853();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8859();
														local243 = Static410.aClass298_1.method6589(local75).method6418(Static159.aClass4_Sub11_Sub1_1);
														Static169.method2827(local1655, 19, local1655, (String) null, local1655, local243, local75, 0);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static285.aClass151_104) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8871();
														local733 = Static159.aClass4_Sub11_Sub1_1.method8826();
														local441 = Static159.aClass4_Sub11_Sub1_1.method8871();
														Static316.method4370();
														Static369.method4865(local422, local441, local75, local733);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static484.aClass151_162) {
														Static77.anInt1633 = Static159.aClass4_Sub11_Sub1_1.method8865();
														Static586.anInt9032 = Static159.aClass4_Sub11_Sub1_1.method8862();
														Static58.aClass151_23 = null;
														return true;
													} else if (Static591.aClass151_198 == Static58.aClass151_23) {
														Static526.aClass293_1.method6532();
														Static538.anInt8331 += 32;
														Static58.aClass151_23 = null;
														return true;
													} else if (Static648.aClass151_218 == Static58.aClass151_23) {
														local1655 = Static159.aClass4_Sub11_Sub1_1.method8853();
														local241 = Static30.method665(Static475.method6540(Static159.aClass4_Sub11_Sub1_1));
														Static388.method5002(local1655, local241, local1655, local1655, 6, 0);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static205.aClass151_78) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8826();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8890();
														Static316.method4370();
														Static3.method3320(local75, local422);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static226.aClass151_83 == Static58.aClass151_23) {
														Static436.method6560(Static159.aClass4_Sub11_Sub1_1.method8853());
														Static58.aClass151_23 = null;
														return true;
													} else if (Static1.aClass151_142 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8855();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8890() << 2;
														local733 = Static159.aClass4_Sub11_Sub1_1.method8843();
														local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
														local445 = Static159.aClass4_Sub11_Sub1_1.method8855();
														Static316.method4370();
														Static536.method7199(local422, local441, local75, local733, true, local445);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static294.aClass151_106 == Static58.aClass151_23) {
														Static395.method2778(Static587.aClass117_15);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static97.aClass151_47) {
														Static395.method2778(Static254.aClass117_8);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static9.aClass151_225 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
														local75 = Static159.aClass4_Sub11_Sub1_1.method8862();
														Static526.aClass293_1.method6535(local75, local422);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static27.aClass151_16) {
														Static640.method8548();
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static491.aClass151_165) {
														Static395.method2778(Static23.aClass117_1);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static307.aClass151_199) {
														Static395.method2778(Static446.aClass117_11);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static191.aClass151_74) {
														for (local422 = 0; local422 < Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20.length; local422++) {
															if (Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local422] != null) {
																Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local422].anIntArray690 = null;
																Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local422].anInt9981 = -1;
															}
														}
														for (local75 = 0; local75 < Static15.anInt1571; local75++) {
															Static238.aClass4_Sub45Array1[local75].aClass3_Sub1_Sub2_Sub2_Sub2_2.anIntArray690 = null;
															Static238.aClass4_Sub45Array1[local75].aClass3_Sub1_Sub2_Sub2_Sub2_2.anInt9981 = -1;
														}
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static34.aClass151_211) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8871();
														if (local422 == 65535) {
															local422 = -1;
														}
														local75 = Static159.aClass4_Sub11_Sub1_1.method8855();
														local733 = local75 >> 2;
														local441 = local75 & 0x3;
														local445 = Static9.anIntArray715[local733];
														local447 = Static159.aClass4_Sub11_Sub1_1.method8850();
														local2273 = local447 >> 28 & 0x3;
														local263 = local447 >> 14 & 0x3FFF;
														local2067 = local447 & 0x3FFF;
														local263 -= Static445.anInt6949;
														local2067 -= Static321.anInt5000;
														Static210.method3127(local263, local733, local2067, local445, local422, local441, local2273);
														Static58.aClass151_23 = null;
														return true;
													} else if (Static445.aClass151_147 == Static58.aClass151_23) {
														Static34.anInt9717 = Static159.aClass4_Sub11_Sub1_1.method8856();
														Static197.aBoolean408 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
														Static58.aClass151_23 = null;
														return true;
													} else if (Static58.aClass151_23 == Static193.aClass151_75) {
														local237 = Static159.aClass4_Sub11_Sub1_1.method8865() == 1;
														local241 = Static159.aClass4_Sub11_Sub1_1.method8853();
														local2583 = (long) Static159.aClass4_Sub11_Sub1_1.method8859();
														local2588 = (long) Static159.aClass4_Sub11_Sub1_1.method8827();
														local2273 = Static159.aClass4_Sub11_Sub1_1.method8865();
														local4046 = (local2583 << 32) + local2588;
														@Pc(6951) boolean local6951 = false;
														@Pc(6959) Class4_Sub55 local6959 = local237 ? Static64.aClass4_Sub55_1 : Static252.aClass4_Sub55_3;
														if (local6959 == null) {
															local6951 = true;
														} else {
															label2193: {
																for (local274 = 0; local274 < 100; local274++) {
																	if (Static329.aLongArray7[local274] == local4046) {
																		local6951 = true;
																		break label2193;
																	}
																}
																if (local2273 <= 1) {
																	if (Static197.aBoolean408 && !Static263.aBoolean317 || Static42.aBoolean75) {
																		local6951 = true;
																	} else if (Static130.method2323(local241)) {
																		local6951 = true;
																	}
																}
															}
														}
														if (!local6951 && Static417.anInt6044 == 0) {
															Static329.aLongArray7[Static411.anInt5919] = local4046;
															Static411.anInt5919 = (Static411.anInt5919 + 1) % 100;
															local331 = Static30.method665(Static475.method6540(Static159.aClass4_Sub11_Sub1_1));
															local2620 = local237 ? 41 : 44;
															if (local2273 == 2 || local2273 == 3) {
																Static169.method2827("<img=1>" + local241, local2620, "<img=1>" + local241, local6959.aString124, local241, local331, -1, 0);
															} else if (local2273 == 1) {
																Static169.method2827("<img=0>" + local241, local2620, "<img=0>" + local241, local6959.aString124, local241, local331, -1, 0);
															} else {
																Static169.method2827(local241, local2620, local241, local6959.aString124, local241, local331, -1, 0);
															}
														}
														Static58.aClass151_23 = null;
														return true;
													} else if (Static537.aClass151_180 == Static58.aClass151_23) {
														Static646.anInt10162 = Static159.aClass4_Sub11_Sub1_1.method8834();
														Static465.anInt7431 = Static317.anInt4914;
														Static58.aClass151_23 = null;
														return true;
													} else if (Static138.aClass151_62 == Static58.aClass151_23) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8865();
														if (Static159.aClass4_Sub11_Sub1_1.method8865() == 0) {
															Static493.aClass203Array1[local422] = new Class203();
														} else {
															Static159.aClass4_Sub11_Sub1_1.anInt10466--;
															Static493.aClass203Array1[local422] = new Class203(Static159.aClass4_Sub11_Sub1_1);
														}
														Static58.aClass151_23 = null;
														Static217.anInt3520 = Static317.anInt4914;
														return true;
													} else if (Static58.aClass151_23 == Static420.aClass151_137) {
														local422 = Static159.aClass4_Sub11_Sub1_1.method8859();
														@Pc(7172) Class3_Sub1_Sub2_Sub2_Sub1 local7172;
														if (Static184.anInt3149 == local422) {
															local7172 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4;
														} else {
															local7172 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local422];
														}
														if (local7172 == null) {
															Static58.aClass151_23 = null;
															return true;
														}
														local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
														local441 = Static159.aClass4_Sub11_Sub1_1.method8865();
														local3901 = (local733 & 0x8000) != 0;
														if (local7172.aString37 != null && local7172.aClass245_1 != null) {
															local2254 = false;
															if (local441 <= 1) {
																if (!local3901 && (Static197.aBoolean408 && !Static263.aBoolean317 || Static42.aBoolean75)) {
																	local2254 = true;
																} else if (Static130.method2323(local7172.aString37)) {
																	local2254 = true;
																}
															}
															if (!local2254 && Static417.anInt6044 == 0) {
																local263 = -1;
																if (local3901) {
																	local733 &= 0x7FFF;
																	@Pc(7257) Class81 local7257 = Static231.method7281(Static159.aClass4_Sub11_Sub1_1);
																	local263 = local7257.anInt2221;
																	local824 = local7257.aClass4_Sub5_Sub16_1.method6418(Static159.aClass4_Sub11_Sub1_1);
																} else {
																	local824 = Static30.method665(Static475.method6540(Static159.aClass4_Sub11_Sub1_1));
																}
																local7172.aString119 = local824.trim();
																local7172.anInt9993 = 150;
																local7172.anInt9990 = local733 & 0xFF;
																local7172.anInt9953 = local733 >> 8;
																if (local441 == 1 || local441 == 2) {
																	local2067 = local3901 ? 17 : 1;
																} else {
																	local2067 = local3901 ? 17 : 2;
																}
																if (local441 == 2) {
																	Static169.method2827("<img=1>" + local7172.method3532(), local2067, "<img=1>" + local7172.method3531(), (String) null, local7172.aString36, local824, local263, 0);
																} else if (local441 == 1) {
																	Static169.method2827("<img=0>" + local7172.method3532(), local2067, "<img=0>" + local7172.method3531(), (String) null, local7172.aString36, local824, local263, 0);
																} else {
																	Static169.method2827(local7172.method3532(), local2067, local7172.method3531(), (String) null, local7172.aString36, local824, local263, 0);
																}
															}
														}
														Static58.aClass151_23 = null;
														return true;
													} else {
														@Pc(7419) Class4_Sub28 local7419;
														if (Static352.aClass151_119 == Static58.aClass151_23) {
															local422 = Static159.aClass4_Sub11_Sub1_1.method8855();
															local75 = Static159.aClass4_Sub11_Sub1_1.method8837();
															local733 = Static159.aClass4_Sub11_Sub1_1.method8859();
															Static316.method4370();
															local7419 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local75);
															if (local7419 != null) {
																Static601.method7899(local7419.anInt4697 != local733, false, local7419);
															}
															Static275.method3975(local75, false, local422, local733);
															Static58.aClass151_23 = null;
															return true;
														} else if (Static312.aClass151_111 == Static58.aClass151_23) {
															local2978 = Static159.aClass4_Sub11_Sub1_1.method8882();
															local75 = Static159.aClass4_Sub11_Sub1_1.method8883();
															Static316.method4370();
															Static197.method4788(local75, local2978);
															Static58.aClass151_23 = null;
															return true;
														} else if (Static454.aClass151_151 == Static58.aClass151_23) {
															local422 = Static159.aClass4_Sub11_Sub1_1.method8884();
															local75 = Static159.aClass4_Sub11_Sub1_1.method8837();
															Static316.method4370();
															@Pc(7490) Class4_Sub28 local7490 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local422);
															local7419 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local75);
															if (local7419 != null) {
																Static601.method7899(local7490 == null || local7490.anInt4697 != local7419.anInt4697, false, local7419);
															}
															if (local7490 != null) {
																local7490.method9000();
																Static242.aClass66_17.method1985(local7490, (long) local75);
															}
															@Pc(7528) Class199 local7528 = Static569.method7534(local422);
															if (local7528 != null) {
																Static331.method4565(local7528);
															}
															local7528 = Static569.method7534(local75);
															if (local7528 != null) {
																Static331.method4565(local7528);
																Static284.method4095(true, local7528);
															}
															if (Static77.anInt1630 != -1) {
																Static135.method2426(Static77.anInt1630, 1);
															}
															Static58.aClass151_23 = null;
															return true;
														} else {
															Static357.method4765((Throwable) null, "T1 - " + (Static58.aClass151_23 == null ? -1 : Static58.aClass151_23.method3270()) + "," + (Static650.aClass151_220 == null ? -1 : Static650.aClass151_220.method3270()) + "," + (Static86.aClass151_42 == null ? -1 : Static86.aClass151_42.method3270()) + " - " + Static583.anInt8992);
															Static306.method4298(false);
															return true;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BIIII)Z")
	public static boolean method2084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static671.aBoolean798 || !Static142.aBoolean362) {
			return false;
		} else if (Static267.anInt4311 < 100) {
			return false;
		} else if (Static592.method7783(arg1, arg3, arg2)) {
			@Pc(34) int local34 = arg2 << Static273.anInt4424;
			@Pc(38) int local38 = arg3 << Static273.anInt4424;
			if (Static164.method2786(Static63.anInt1356, Static63.anInt1356, Static140.aClass42Array4[arg1].method7450(arg3, arg2), arg0, local34, local38)) {
				Static679.anInt10636++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public static void method2086(@OriginalArg(0) int arg0) {
		Static476.anInt7524 = arg0;
	}
}
