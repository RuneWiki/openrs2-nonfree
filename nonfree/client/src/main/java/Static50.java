import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!di", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString59 = "glow2:";

	@OriginalMember(owner = "client!di", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString60 = "";

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "I")
	public static int anInt1009 = 0;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "I")
	public static volatile int anInt1010 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Lclient!ra;")
	public static Class151 method948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class151 local14 = local7.aClass151_1;
			local7.aClass151_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIII)V")
	public static void method950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static155.anInt3037 < 100) {
			Static104.method1887();
		}
		if (Static156.aBoolean211) {
			Static119.method2138(arg3, arg1, arg3 + arg0, arg2 + arg1);
		} else {
			Static25.method401(arg3, arg1, arg3 + arg0, arg1 - -arg2);
		}
		@Pc(47) int local47;
		@Pc(59) int local59;
		if (Static155.anInt3037 < 100) {
			local47 = arg3 + arg0 / 2;
			local59 = arg2 / 2 + arg1 - 38;
			if (Static156.aBoolean211) {
				Static119.method2129(arg3, arg1, arg0, arg2, 0);
				Static119.method2135(local47 - 152, local59, 304, 34, 9179409);
				Static119.method2129(local47 - 150, local59 - -2, Static155.anInt3037 * 3, 30, 9179409);
			} else {
				Static25.method385(arg3, arg1, arg0, arg2, 0);
				Static25.method402(local47 - 152, local59, 304, 34, 9179409);
				Static25.method385(local47 - 150, local59 + 2, Static155.anInt3037 * 3, 30, 9179409);
			}
			Static307.aClass1_Sub2_Sub6_4.method4022(Static82.aString99, local47, local59 + 20, 16777215, -1);
			return;
		}
		Static36.anInt677 = (int) ((float) (arg0 * 2) / Static109.aFloat132);
		Static208.anInt3971 = (int) ((float) (arg2 * 2) / Static109.aFloat132);
		Static71.anInt1517 = Static293.anInt5263 - (int) ((float) arg2 / Static109.aFloat132);
		local47 = Static293.anInt5263 - (int) ((float) arg2 / Static109.aFloat132);
		Static170.anInt3348 = Static125.anInt2557 - (int) ((float) arg0 / Static109.aFloat132);
		@Pc(177) int local177 = Static125.anInt2557 - (int) ((float) arg0 / Static109.aFloat132);
		local59 = Static125.anInt2557 + (int) ((float) arg0 / Static109.aFloat132);
		@Pc(194) int local194 = (int) ((float) arg2 / Static109.aFloat132) + Static293.anInt5263;
		@Pc(239) Class59 local239;
		if (Static156.aBoolean211) {
			if (Static290.aClass1_Sub2_Sub1_Sub2_5 == null || arg0 != Static290.aClass1_Sub2_Sub1_Sub2_5.anInt4444 || Static290.aClass1_Sub2_Sub1_Sub2_5.anInt4454 != arg2) {
				Static290.aClass1_Sub2_Sub1_Sub2_5 = null;
				Static290.aClass1_Sub2_Sub1_Sub2_5 = new Class1_Sub2_Sub1_Sub2(arg0, arg2);
			}
			Static25.method388(Static290.aClass1_Sub2_Sub1_Sub2_5.anIntArray391, arg0, arg2);
			Static109.method3596(local177, local47, local59, local194, 0, 0, arg0, arg2 + 1);
			Static109.method3582();
			local239 = Static109.method3591();
			Static15.method194(local239, arg1, arg3);
			Static290.aClass1_Sub2_Sub1_Sub2_5.method3853();
			Static119.method2125(Static290.aClass1_Sub2_Sub1_Sub2_5.anIntArray391, arg3, arg1, arg0, arg2);
			Static25.anIntArray27 = null;
		} else {
			Static109.method3596(local177, local47, local59, local194, arg3, arg1, arg3 + arg0, arg1 + 1 + arg2);
			Static109.method3582();
			local239 = Static109.method3591();
			Static15.method194(local239, 0, 0);
		}
		if (Static124.anInt5509 > 0) {
			Static200.anInt3847--;
			if (Static200.anInt3847 == 0) {
				Static200.anInt3847 = 20;
				Static124.anInt5509--;
			}
		}
		if (!Static218.aBoolean73) {
			return;
		}
		@Pc(316) int local316 = arg3 + arg0 - 5;
		@Pc(322) int local322 = arg2 + arg1 - 8;
		Static140.aClass1_Sub2_Sub6_3.method4003("Fps:" + Static69.anInt4976, local316, local322, 16776960, -1);
		@Pc(337) int local337 = local322 - 15;
		@Pc(339) int local339 = 16776960;
		@Pc(341) Runtime local341 = Runtime.getRuntime();
		@Pc(350) int local350 = (int) ((local341.totalMemory() - local341.freeMemory()) / 1024L);
		if (local350 > 65536) {
			local339 = 16711680;
		}
		Static140.aClass1_Sub2_Sub6_3.method4003("Mem:" + local350 + "k", local316, local337, local339, -1);
		local322 = local337 - 15;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)Z")
	public static boolean method951() throws IOException {
		if (Static5.aClass97_1 == null) {
			return false;
		}
		@Pc(14) int local14 = Static5.aClass97_1.method2551();
		if (local14 == 0) {
			return false;
		}
		if (Static266.anInt4855 == -1) {
			Static5.aClass97_1.method2556(0, 1, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
			local14--;
			Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
			Static266.anInt4855 = Static13.aClass1_Sub14_Sub1_1.method1410();
			Static88.anInt1723 = Static229.anIntArray354[Static266.anInt4855];
		}
		if (Static88.anInt1723 == -1) {
			if (local14 <= 0) {
				return false;
			}
			Static5.aClass97_1.method2556(0, 1, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
			Static88.anInt1723 = Static13.aClass1_Sub14_Sub1_1.aByteArray17[0] & 0xFF;
			local14--;
		}
		if (Static88.anInt1723 == -2) {
			if (local14 <= 1) {
				return false;
			}
			Static5.aClass97_1.method2556(0, 2, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
			Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
			local14 -= 2;
			Static88.anInt1723 = Static13.aClass1_Sub14_Sub1_1.method1386();
		}
		if (local14 < Static88.anInt1723) {
			return false;
		}
		Static13.aClass1_Sub14_Sub1_1.anInt1480 = 0;
		Static5.aClass97_1.method2556(0, Static88.anInt1723, Static13.aClass1_Sub14_Sub1_1.aByteArray17);
		Static165.anInt3261 = Static85.anInt1690;
		Static92.anInt5532 = 0;
		Static85.anInt1690 = Static189.anInt3607;
		Static189.anInt3607 = Static266.anInt4855;
		@Pc(126) int local126;
		if (Static266.anInt4855 == 60) {
			local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
			if (Static7.method114(local126)) {
				Static255.method4047();
			}
			Static266.anInt4855 = -1;
			return true;
		}
		@Pc(146) long local146;
		@Pc(153) String local153;
		if (Static266.anInt4855 == 133) {
			local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
			local153 = Static78.method4019(Static166.method2836(Static160.method2755(Static13.aClass1_Sub14_Sub1_1)));
			Static243.method4744(local153, 6, Static113.method2021(local146));
			Static266.anInt4855 = -1;
			return true;
		}
		@Pc(178) int local178;
		@Pc(182) int local182;
		if (Static266.anInt4855 == 122) {
			local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
			local178 = Static13.aClass1_Sub14_Sub1_1.method1366();
			local182 = Static13.aClass1_Sub14_Sub1_1.method1367();
			if (Static7.method114(local126)) {
				Static295.method4499(local178, local182);
			}
			Static266.anInt4855 = -1;
			return true;
		}
		@Pc(216) int local216;
		if (Static266.anInt4855 == 96) {
			local126 = Static13.aClass1_Sub14_Sub1_1.method1392();
			local178 = Static13.aClass1_Sub14_Sub1_1.method1366();
			local182 = Static13.aClass1_Sub14_Sub1_1.method1383();
			local216 = Static13.aClass1_Sub14_Sub1_1.method1380();
			if (local178 == 65535) {
				local178 = -1;
			}
			if (Static7.method114(local182)) {
				@Pc(232) Class66 local232 = Static53.method968(local126);
				@Pc(244) Class102 local244;
				if (local232.aBoolean132) {
					Static95.method1732(local178, local216, local126);
					local244 = Static49.method909(local178);
					Static148.method2515(local244.anInt3191, local126, local244.anInt3229, local244.anInt3204);
					Static136.method2370(local244.anInt3176, local244.anInt3167, local126, local244.anInt3186);
				} else if (local178 == -1) {
					Static266.anInt4855 = -1;
					local232.anInt2198 = 0;
					return true;
				} else {
					local244 = Static49.method909(local178);
					local232.anInt2181 = local244.anInt3204 * 100 / local216;
					local232.anInt2198 = 4;
					local232.anInt2130 = local178;
					local232.anInt2156 = local244.anInt3191;
					local232.anInt2136 = local244.anInt3229;
					Static103.method1865(local232);
				}
			}
			Static266.anInt4855 = -1;
			return true;
		} else if (Static266.anInt4855 == 184) {
			Static206.method3291();
			Static266.anInt4855 = -1;
			return true;
		} else {
			@Pc(347) Class66 local347;
			@Pc(365) int local365;
			@Pc(361) int local361;
			if (Static266.anInt4855 == 87) {
				local126 = Static13.aClass1_Sub14_Sub1_1.method1392();
				local178 = Static13.aClass1_Sub14_Sub1_1.method1386();
				if (local126 < -70000) {
					local178 += 32768;
				}
				if (local126 >= 0) {
					local347 = Static53.method968(local126);
				} else {
					local347 = null;
				}
				while (Static13.aClass1_Sub14_Sub1_1.anInt1480 < Static88.anInt1723) {
					local216 = Static13.aClass1_Sub14_Sub1_1.method1362();
					local361 = 0;
					local365 = Static13.aClass1_Sub14_Sub1_1.method1386();
					if (local365 != 0) {
						local361 = Static13.aClass1_Sub14_Sub1_1.method1378();
						if (local361 == 255) {
							local361 = Static13.aClass1_Sub14_Sub1_1.method1392();
						}
					}
					if (local347 != null && local216 >= 0 && local347.anIntArray192.length > local216) {
						local347.anIntArray192[local216] = local365;
						local347.anIntArray195[local216] = local361;
					}
					Static187.method3060(local178, local365 - 1, local216, local361);
				}
				if (local347 != null) {
					Static103.method1865(local347);
				}
				Static130.method2235();
				Static219.anIntArray343[Static159.anInt3143++ & 0x1F] = local178 & 0x7FFF;
				Static266.anInt4855 = -1;
				return true;
			} else if (Static266.anInt4855 == 27) {
				for (local126 = 0; local126 < Static55.anIntArray64.length; local126++) {
					if (Static107.anIntArray191[local126] != Static55.anIntArray64[local126]) {
						Static55.anIntArray64[local126] = Static107.anIntArray191[local126];
						Static229.method3546(local126);
						Static106.anIntArray179[Static197.anInt3803++ & 0x1F] = local126;
					}
				}
				Static266.anInt4855 = -1;
				return true;
			} else if (Static266.anInt4855 == 119) {
				Static201.anInt3867 = Static13.aClass1_Sub14_Sub1_1.method1378();
				Static140.anInt5206 = Static13.aClass1_Sub14_Sub1_1.method1394();
				Static266.anInt4855 = -1;
				return true;
			} else if (Static266.anInt4855 == 28) {
				if (Static88.anInt1723 == 0) {
					Static33.aString36 = Static308.aString334;
				} else {
					Static33.aString36 = Static13.aClass1_Sub14_Sub1_1.method1375();
				}
				Static266.anInt4855 = -1;
				return true;
			} else if (Static266.anInt4855 == 193) {
				local126 = Static13.aClass1_Sub14_Sub1_1.method1367();
				local178 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local182 = Static13.aClass1_Sub14_Sub1_1.method1392();
				if (Static7.method114(local126)) {
					Static257.method4078(local182, local178);
				}
				Static266.anInt4855 = -1;
				return true;
			} else if (Static266.anInt4855 == 169) {
				Static43.method807();
				Static130.method2235();
				Static266.anInt4855 = -1;
				Static197.anInt3803 += 32;
				return true;
			} else if (Static266.anInt4855 == 12) {
				local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local178 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local182 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local216 = Static13.aClass1_Sub14_Sub1_1.method1386();
				local365 = Static13.aClass1_Sub14_Sub1_1.method1378();
				local361 = Static13.aClass1_Sub14_Sub1_1.method1378();
				if (Static7.method114(local126)) {
					Static235.method4491(true, local361, local178, local182, local365, local216);
				}
				Static266.anInt4855 = -1;
				return true;
			} else if (Static266.anInt4855 == 40) {
				local126 = Static13.aClass1_Sub14_Sub1_1.method1393();
				local178 = Static13.aClass1_Sub14_Sub1_1.method1367();
				local182 = Static13.aClass1_Sub14_Sub1_1.method1386();
				if (Static7.method114(local182)) {
					Static77.method1510(local126, local178);
				}
				Static266.anInt4855 = -1;
				return true;
			} else {
				@Pc(693) long local693;
				@Pc(717) Class1_Sub22 local717;
				@Pc(699) Class1_Sub22 local699;
				if (Static266.anInt4855 == 220) {
					local126 = Static13.aClass1_Sub14_Sub1_1.method1380();
					local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
					local182 = Static13.aClass1_Sub14_Sub1_1.method1386();
					if (local182 == 65535) {
						local182 = -1;
					}
					local216 = Static13.aClass1_Sub14_Sub1_1.method1393();
					local365 = Static13.aClass1_Sub14_Sub1_1.method1386();
					if (local365 == 65535) {
						local365 = -1;
					}
					if (Static7.method114(local178)) {
						for (local361 = local365; local361 <= local182; local361++) {
							local693 = (long) local361 + ((long) local126 << 32);
							local699 = (Class1_Sub22) Static154.aClass142_13.method3543(local693);
							if (local699 != null) {
								local717 = new Class1_Sub22(local216, local699.anInt3563);
								local699.method4779();
							} else if (local361 == -1) {
								local717 = new Class1_Sub22(local216, Static53.method968(local126).aClass1_Sub22_1.anInt3563);
							} else {
								local717 = new Class1_Sub22(local216, -1);
							}
							Static154.aClass142_13.method3537(local717, local693);
						}
					}
					Static266.anInt4855 = -1;
					return true;
				} else if (Static266.anInt4855 == 24) {
					Static262.method4142(Static13.aClass1_Sub14_Sub1_1.method1375());
					Static266.anInt4855 = -1;
					return true;
				} else if (Static266.anInt4855 == 159) {
					local126 = Static13.aClass1_Sub14_Sub1_1.method1366();
					local178 = Static13.aClass1_Sub14_Sub1_1.method1397();
					Static136.method2366(local126, local178);
					Static266.anInt4855 = -1;
					return true;
				} else if (Static266.anInt4855 == 33) {
					Static163.anInt3253 = Static13.aClass1_Sub14_Sub1_1.method1386() * 30;
					Static266.anInt4855 = -1;
					Static310.anInt5667 = Static86.anInt1698;
					return true;
				} else if (Static266.anInt4855 == 32) {
					local126 = Static13.aClass1_Sub14_Sub1_1.method1366();
					local178 = Static13.aClass1_Sub14_Sub1_1.method1386();
					if (local126 == 65535) {
						local126 = -1;
					}
					local182 = Static13.aClass1_Sub14_Sub1_1.method1380();
					local216 = Static13.aClass1_Sub14_Sub1_1.method1383();
					local365 = Static13.aClass1_Sub14_Sub1_1.method1366();
					if (local365 == 65535) {
						local365 = -1;
					}
					if (Static7.method114(local216)) {
						for (local361 = local126; local361 <= local365; local361++) {
							local693 = ((long) local182 << 32) + ((long) local361);
							local699 = (Class1_Sub22) Static154.aClass142_13.method3543(local693);
							if (local699 != null) {
								local717 = new Class1_Sub22(local699.anInt3570, local178);
								local699.method4779();
							} else if (local361 == -1) {
								local717 = new Class1_Sub22(Static53.method968(local182).aClass1_Sub22_1.anInt3570, local178);
							} else {
								local717 = new Class1_Sub22(0, local178);
							}
							Static154.aClass142_13.method3537(local717, local693);
						}
					}
					Static266.anInt4855 = -1;
					return true;
				} else {
					@Pc(953) int local953;
					@Pc(957) int local957;
					@Pc(969) int local969;
					if (Static266.anInt4855 == 63) {
						local126 = Static13.aClass1_Sub14_Sub1_1.method1383();
						if (local126 == 65535) {
							local126 = -1;
						}
						local178 = Static13.aClass1_Sub14_Sub1_1.method1392();
						local182 = local178 >> 28 & 0x3;
						local216 = local178 >> 14 & 0x3FFF;
						local365 = local178 & 0x3FFF;
						local361 = Static13.aClass1_Sub14_Sub1_1.method1381();
						local953 = local361 & 0x3;
						local957 = local361 >> 2;
						local216 -= Static199.anInt3817;
						local365 -= Static192.anInt3637;
						local969 = Static28.anIntArray28[local957];
						Static120.method2143(local182, local957, local969, local953, local216, local365, local126);
						Static266.anInt4855 = -1;
						return true;
					} else if (Static266.anInt4855 == 82) {
						local126 = Static13.aClass1_Sub14_Sub1_1.method1393();
						local178 = Static13.aClass1_Sub14_Sub1_1.method1366();
						local182 = Static13.aClass1_Sub14_Sub1_1.method1383();
						local216 = Static13.aClass1_Sub14_Sub1_1.method1383();
						if (Static7.method114(local178)) {
							Static56.method988(local126, local216 + (local182 << 16));
						}
						Static266.anInt4855 = -1;
						return true;
					} else if (Static266.anInt4855 == 98) {
						Static12.anInt176 = Static13.aClass1_Sub14_Sub1_1.method1378();
						Static266.anInt4855 = -1;
						return true;
					} else if (Static266.anInt4855 == 211) {
						Static72.anInt5402 = Static88.anInt1723 / 8;
						for (local126 = 0; local126 < Static72.anInt5402; local126++) {
							Static29.aLongArray3[local126] = Static13.aClass1_Sub14_Sub1_1.method1348();
							Static314.aStringArray2[local126] = Static307.method4640(Static29.aLongArray3[local126]);
							Static279.aBooleanArray22[local126] = false;
						}
						Static266.anInt4855 = -1;
						Static70.anInt1491 = Static86.anInt1698;
						return true;
					} else if (Static266.anInt4855 == 124) {
						Static140.anInt5206 = Static13.aClass1_Sub14_Sub1_1.method1394();
						Static201.anInt3867 = Static13.aClass1_Sub14_Sub1_1.method1394();
						for (local126 = Static140.anInt5206; local126 < Static140.anInt5206 + 8; local126++) {
							for (local178 = Static201.anInt3867; local178 < Static201.anInt3867 + 8; local178++) {
								if (Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local126][local178] != null) {
									Static270.aClass59ArrayArrayArray1[Static65.anInt1300][local126][local178] = null;
									Static143.method2465(local126, local178);
								}
							}
						}
						for (@Pc(1135) Class1_Sub18 local1135 = (Class1_Sub18) Static159.aClass59_26.method1704(); local1135 != null; local1135 = (Class1_Sub18) Static159.aClass59_26.method1701()) {
							if (Static140.anInt5206 <= local1135.anInt1791 && Static140.anInt5206 + 8 > local1135.anInt1791 && local1135.anInt1785 >= Static201.anInt3867 && local1135.anInt1785 < Static201.anInt3867 + 8 && Static65.anInt1300 == local1135.anInt1780) {
								local1135.anInt1783 = 0;
							}
						}
						Static266.anInt4855 = -1;
						return true;
					} else if (Static266.anInt4855 == 154) {
						Static74.method1467();
						Static266.anInt4855 = -1;
						return false;
					} else if (Static266.anInt4855 == 106) {
						Static5.method32(false);
						Static266.anInt4855 = -1;
						return true;
					} else if (Static266.anInt4855 == 170) {
						local126 = Static13.aClass1_Sub14_Sub1_1.method1339();
						local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
						Static27.method455(local126, local178);
						Static266.anInt4855 = -1;
						return true;
					} else if (Static266.anInt4855 == 250) {
						local126 = Static13.aClass1_Sub14_Sub1_1.method1339();
						local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
						local182 = Static13.aClass1_Sub14_Sub1_1.method1367();
						if (local182 == 65535) {
							local182 = -1;
						}
						if (Static7.method114(local178)) {
							Static250.method3938(local182, -1, local126, 2);
						}
						Static266.anInt4855 = -1;
						return true;
					} else {
						@Pc(1281) String local1281;
						if (Static266.anInt4855 == 13) {
							local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
							local182 = Static13.aClass1_Sub14_Sub1_1.method1386();
							local1281 = Static235.method4486(local182).method2216(Static13.aClass1_Sub14_Sub1_1);
							Static45.method885(local182, Static113.method2021(local146), null, 19, local1281);
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 222) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1366();
							Static146.method2487(local126);
							Static219.anIntArray343[Static159.anInt3143++ & 0x1F] = local126 & 0x7FFF;
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 88) {
							Static189.anInt3606 = Static13.aClass1_Sub14_Sub1_1.method1378();
							Static84.anInt1667 = Static13.aClass1_Sub14_Sub1_1.method1378();
							Static165.anInt3259 = Static13.aClass1_Sub14_Sub1_1.method1378();
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 244) {
							Static138.anInt2776 = Static13.aClass1_Sub14_Sub1_1.method1378();
							Static266.anInt4855 = -1;
							Static70.anInt1491 = Static86.anInt1698;
							return true;
						} else if (Static266.anInt4855 == 102) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1392();
							local178 = Static13.aClass1_Sub14_Sub1_1.method1386();
							if (local126 < -70000) {
								local178 += 32768;
							}
							if (local126 >= 0) {
								local347 = Static53.method968(local126);
							} else {
								local347 = null;
							}
							if (local347 != null) {
								for (local216 = 0; local216 < local347.anIntArray192.length; local216++) {
									local347.anIntArray192[local216] = 0;
									local347.anIntArray195[local216] = 0;
								}
							}
							Static46.method892(local178);
							local216 = Static13.aClass1_Sub14_Sub1_1.method1386();
							for (local365 = 0; local365 < local216; local365++) {
								local361 = Static13.aClass1_Sub14_Sub1_1.method1367();
								local957 = Static13.aClass1_Sub14_Sub1_1.method1397();
								if (local957 == 255) {
									local957 = Static13.aClass1_Sub14_Sub1_1.method1393();
								}
								if (local347 != null && local365 < local347.anIntArray192.length) {
									local347.anIntArray192[local365] = local361;
									local347.anIntArray195[local365] = local957;
								}
								Static187.method3060(local178, local361 - 1, local365, local957);
							}
							if (local347 != null) {
								Static103.method1865(local347);
							}
							Static130.method2235();
							Static219.anIntArray343[Static159.anInt3143++ & 0x1F] = local178 & 0x7FFF;
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 91) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1380();
							Static98.aClass185_1 = Static26.aClass154_1.method3901(local126);
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 185) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1366();
							local178 = Static13.aClass1_Sub14_Sub1_1.method1392();
							local182 = Static13.aClass1_Sub14_Sub1_1.method1400();
							local216 = Static13.aClass1_Sub14_Sub1_1.method1398();
							if (Static7.method114(local126)) {
								Static72.method4591(local216, local182, local178);
							}
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 19) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
							local178 = Static13.aClass1_Sub14_Sub1_1.method1367();
							if (local126 == 65535) {
								local126 = -1;
							}
							local182 = Static13.aClass1_Sub14_Sub1_1.method1392();
							if (Static7.method114(local178)) {
								Static250.method3938(local126, -1, local182, 1);
							}
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 120) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
							local178 = Static13.aClass1_Sub14_Sub1_1.method1392();
							if (Static7.method114(local126)) {
								@Pc(1613) Class1_Sub25 local1613 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local178);
								if (local1613 != null) {
									Static261.method4118(true, local1613);
								}
								if (Static310.aClass66_51 != null) {
									Static103.method1865(Static310.aClass66_51);
									Static310.aClass66_51 = null;
								}
							}
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 107) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
							if (local126 == 65535) {
								local126 = -1;
							}
							local178 = Static13.aClass1_Sub14_Sub1_1.method1381();
							method952(local178, local126);
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 61) {
							local126 = Static13.aClass1_Sub14_Sub1_1.method1352();
							local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
							if (local178 == 65535) {
								local178 = -1;
							}
							local182 = Static13.aClass1_Sub14_Sub1_1.method1397();
							Static116.method2099(local178, local126, local182);
							Static266.anInt4855 = -1;
							return true;
						} else if (Static266.anInt4855 == 171) {
							for (local126 = 0; local126 < Static17.aClass15_Sub5_Sub2Array1.length; local126++) {
								if (Static17.aClass15_Sub5_Sub2Array1[local126] != null) {
									Static17.aClass15_Sub5_Sub2Array1[local126].anInt5594 = -1;
								}
							}
							for (local126 = 0; local126 < Static83.aClass15_Sub5_Sub1Array1.length; local126++) {
								if (Static83.aClass15_Sub5_Sub1Array1[local126] != null) {
									Static83.aClass15_Sub5_Sub1Array1[local126].anInt5594 = -1;
								}
							}
							Static266.anInt4855 = -1;
							return true;
						} else {
							@Pc(1743) String local1743;
							if (Static266.anInt4855 == 42) {
								local1743 = Static13.aClass1_Sub14_Sub1_1.method1375();
								local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
								local182 = Static13.aClass1_Sub14_Sub1_1.method1383();
								if (Static7.method114(local178)) {
									Static314.method760(local1743, local182);
								}
								Static266.anInt4855 = -1;
								return true;
							} else if (Static266.anInt4855 == 93) {
								local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
								local178 = Static13.aClass1_Sub14_Sub1_1.method1378();
								if (local126 == 65535) {
									local126 = -1;
								}
								local182 = Static13.aClass1_Sub14_Sub1_1.method1386();
								local216 = Static13.aClass1_Sub14_Sub1_1.method1378();
								Static100.method1818(local178, local126, local182, local216);
								Static266.anInt4855 = -1;
								return true;
							} else {
								@Pc(1833) long local1833;
								@Pc(1943) int local1943;
								@Pc(1940) boolean local1940;
								if (Static266.anInt4855 == 176) {
									Static274.anInt4956 = Static86.anInt1698;
									local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
									if (local146 == 0L) {
										Static266.anInt4855 = -1;
										Static98.aString116 = null;
										Static37.aString42 = null;
										Static245.aClass1_Sub6Array1 = null;
										Static140.anInt5208 = 0;
										return true;
									}
									local1833 = Static13.aClass1_Sub14_Sub1_1.method1348();
									Static37.aString42 = Static8.method120(local1833);
									Static98.aString116 = Static8.method120(local146);
									Static60.aByte6 = Static13.aClass1_Sub14_Sub1_1.method1363();
									local365 = Static13.aClass1_Sub14_Sub1_1.method1378();
									if (local365 == 255) {
										Static266.anInt4855 = -1;
										return true;
									}
									Static140.anInt5208 = local365;
									@Pc(1863) Class1_Sub6[] local1863 = new Class1_Sub6[100];
									for (local957 = 0; local957 < Static140.anInt5208; local957++) {
										local1863[local957] = new Class1_Sub6();
										local1863[local957].aLong214 = Static13.aClass1_Sub14_Sub1_1.method1348();
										local1863[local957].aString27 = Static8.method120(local1863[local957].aLong214);
										local1863[local957].anInt394 = Static13.aClass1_Sub14_Sub1_1.method1386();
										local1863[local957].aByte1 = Static13.aClass1_Sub14_Sub1_1.method1363();
										local1863[local957].aString28 = Static13.aClass1_Sub14_Sub1_1.method1375();
										if (Static8.aLong11 == local1863[local957].aLong214) {
											Static204.aByte23 = local1863[local957].aByte1;
										}
									}
									local969 = Static140.anInt5208;
									while (local969 > 0) {
										local1940 = true;
										local969--;
										for (local1943 = 0; local1943 < local969; local1943++) {
											if (local1863[local1943].aString27.compareTo(local1863[local1943 + 1].aString27) > 0) {
												local1940 = false;
												@Pc(1969) Class1_Sub6 local1969 = local1863[local1943];
												local1863[local1943] = local1863[local1943 + 1];
												local1863[local1943 + 1] = local1969;
											}
										}
										if (local1940) {
											break;
										}
									}
									Static245.aClass1_Sub6Array1 = local1863;
									Static266.anInt4855 = -1;
									return true;
								}
								@Pc(2030) Class1_Sub25 local2030;
								if (Static266.anInt4855 == 0) {
									local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
									local178 = Static13.aClass1_Sub14_Sub1_1.method1380();
									local182 = Static13.aClass1_Sub14_Sub1_1.method1393();
									if (Static7.method114(local126)) {
										@Pc(2023) Class1_Sub25 local2023 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local182);
										local2030 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local178);
										if (local2030 != null) {
											Static261.method4118(local2023 == null || local2023.anInt4289 != local2030.anInt4289, local2030);
										}
										if (local2023 != null) {
											local2023.method4779();
											Static302.aClass142_26.method3537(local2023, (long) local178);
										}
										@Pc(2067) Class66 local2067 = Static53.method968(local182);
										if (local2067 != null) {
											Static103.method1865(local2067);
										}
										local2067 = Static53.method968(local178);
										if (local2067 != null) {
											Static103.method1865(local2067);
											Static6.method38(true, local2067);
										}
										if (Static270.anInt4897 != -1) {
											Static290.method4438(1, Static270.anInt4897);
										}
									}
									Static266.anInt4855 = -1;
									return true;
								} else if (Static266.anInt4855 == 21) {
									local126 = Static13.aClass1_Sub14_Sub1_1.method1339();
									local178 = Static13.aClass1_Sub14_Sub1_1.method1367();
									local182 = Static13.aClass1_Sub14_Sub1_1.method1386();
									if (Static7.method114(local182)) {
										Static100.method1810(local126, local178);
									}
									Static266.anInt4855 = -1;
									return true;
								} else if (Static266.anInt4855 == 130) {
									Static5.method32(true);
									Static266.anInt4855 = -1;
									return true;
								} else if (Static266.anInt4855 == 178) {
									Static130.method2235();
									Static118.anInt2474 = Static13.aClass1_Sub14_Sub1_1.method1378();
									Static266.anInt4855 = -1;
									Static310.anInt5667 = Static86.anInt1698;
									return true;
								} else if (Static266.anInt4855 == 223) {
									local126 = Static13.aClass1_Sub14_Sub1_1.method1393();
									@Pc(2167) Class66 local2167 = Static53.method968(local126);
									for (local182 = 0; local182 < local2167.anIntArray192.length; local182++) {
										local2167.anIntArray192[local182] = -1;
										local2167.anIntArray192[local182] = 0;
									}
									Static103.method1865(local2167);
									Static266.anInt4855 = -1;
									return true;
								} else if (Static266.anInt4855 == 182 || Static266.anInt4855 == 205 || Static266.anInt4855 == 3 || Static266.anInt4855 == 188 || Static266.anInt4855 == 149 || Static266.anInt4855 == 101 || Static266.anInt4855 == 36 || Static266.anInt4855 == 73 || Static266.anInt4855 == 127 || Static266.anInt4855 == 54 || Static266.anInt4855 == 121 || Static266.anInt4855 == 164 || Static266.anInt4855 == 153 || Static266.anInt4855 == 135) {
									Static85.method1595();
									Static266.anInt4855 = -1;
									return true;
								} else {
									@Pc(2378) String local2378;
									@Pc(2281) long local2281;
									if (Static266.anInt4855 == 152) {
										local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
										Static13.aClass1_Sub14_Sub1_1.method1363();
										local1833 = Static13.aClass1_Sub14_Sub1_1.method1348();
										local2281 = Static13.aClass1_Sub14_Sub1_1.method1386();
										local693 = Static13.aClass1_Sub14_Sub1_1.method1352();
										local969 = Static13.aClass1_Sub14_Sub1_1.method1378();
										@Pc(2292) boolean local2292 = false;
										@Pc(2298) long local2298 = (local2281 << 32) + local693;
										@Pc(2300) int local2300 = 0;
										label1378: while (true) {
											if (local2300 >= 100) {
												if (local969 <= 1) {
													if (Static232.aBoolean293 && !Static180.aBoolean233 || Static272.aBoolean387) {
														local2292 = true;
													} else {
														for (local2300 = 0; local2300 < Static72.anInt5402; local2300++) {
															if (local146 == Static29.aLongArray3[local2300]) {
																local2292 = true;
																break label1378;
															}
														}
													}
												}
												break;
											}
											if (local2298 == Static224.aLongArray12[local2300]) {
												local2292 = true;
												break;
											}
											local2300++;
										}
										if (!local2292 && Static255.anInt4630 == 0) {
											Static224.aLongArray12[Static72.anInt5404] = local2298;
											Static72.anInt5404 = (Static72.anInt5404 + 1) % 100;
											local2378 = Static78.method4019(Static166.method2836(Static160.method2755(Static13.aClass1_Sub14_Sub1_1)));
											if (local969 == 2 || local969 == 3) {
												Static253.method3988(local2378, Static113.method2021(local1833), "<img=1>" + Static113.method2021(local146));
											} else if (local969 == 1) {
												Static253.method3988(local2378, Static113.method2021(local1833), "<img=0>" + Static113.method2021(local146));
											} else {
												Static253.method3988(local2378, Static113.method2021(local1833), Static113.method2021(local146));
											}
										}
										Static266.anInt4855 = -1;
										return true;
									}
									@Pc(2461) boolean local2461;
									@Pc(2476) String local2476;
									if (Static266.anInt4855 == 72) {
										local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
										local182 = Static13.aClass1_Sub14_Sub1_1.method1386();
										@Pc(2459) byte local2459 = Static13.aClass1_Sub14_Sub1_1.method1363();
										local2461 = false;
										if ((Long.MIN_VALUE & local146) != 0L) {
											local2461 = true;
										}
										if (local2461) {
											if (Static140.anInt5208 == 0) {
												Static266.anInt4855 = -1;
												return true;
											}
											local146 &= Long.MAX_VALUE;
											for (local361 = 0; local361 < Static140.anInt5208 && (local146 != Static245.aClass1_Sub6Array1[local361].aLong214 || local182 != Static245.aClass1_Sub6Array1[local361].anInt394); local361++) {
											}
											if (Static140.anInt5208 > local361) {
												while (local361 < Static140.anInt5208 - 1) {
													Static245.aClass1_Sub6Array1[local361] = Static245.aClass1_Sub6Array1[local361 + 1];
													local361++;
												}
												Static140.anInt5208--;
												Static245.aClass1_Sub6Array1[Static140.anInt5208] = null;
											}
										} else {
											local2476 = Static13.aClass1_Sub14_Sub1_1.method1375();
											@Pc(2480) Class1_Sub6 local2480 = new Class1_Sub6();
											local2480.aLong214 = local146;
											local2480.aString27 = Static8.method120(local2480.aLong214);
											local2480.aString28 = local2476;
											local2480.anInt394 = local182;
											local2480.aByte1 = local2459;
											for (local953 = Static140.anInt5208 - 1; local953 >= 0; local953--) {
												local969 = Static245.aClass1_Sub6Array1[local953].aString27.compareTo(local2480.aString27);
												if (local969 == 0) {
													Static245.aClass1_Sub6Array1[local953].anInt394 = local182;
													Static245.aClass1_Sub6Array1[local953].aByte1 = local2459;
													Static245.aClass1_Sub6Array1[local953].aString28 = local2476;
													if (local146 == Static8.aLong11) {
														Static204.aByte23 = local2459;
													}
													Static266.anInt4855 = -1;
													Static274.anInt4956 = Static86.anInt1698;
													return true;
												}
												if (local969 < 0) {
													break;
												}
											}
											if (Static140.anInt5208 >= Static245.aClass1_Sub6Array1.length) {
												Static266.anInt4855 = -1;
												return true;
											}
											for (local969 = Static140.anInt5208 - 1; local969 > local953; local969--) {
												Static245.aClass1_Sub6Array1[local969 + 1] = Static245.aClass1_Sub6Array1[local969];
											}
											if (Static140.anInt5208 == 0) {
												Static245.aClass1_Sub6Array1 = new Class1_Sub6[100];
											}
											Static245.aClass1_Sub6Array1[local953 + 1] = local2480;
											Static140.anInt5208++;
											if (local146 == Static8.aLong11) {
												Static204.aByte23 = local2459;
											}
										}
										Static266.anInt4855 = -1;
										Static274.anInt4956 = Static86.anInt1698;
										return true;
									} else if (Static266.anInt4855 == 235) {
										local126 = Static13.aClass1_Sub14_Sub1_1.method1367();
										local178 = Static13.aClass1_Sub14_Sub1_1.method1339();
										local182 = Static13.aClass1_Sub14_Sub1_1.method1394();
										if (Static7.method114(local126)) {
											Static310.method4732(local178, local182);
										}
										Static266.anInt4855 = -1;
										return true;
									} else if (Static266.anInt4855 == 50) {
										local126 = Static13.aClass1_Sub14_Sub1_1.method1378();
										local182 = local126 & 0x1F;
										local178 = local126 >> 5;
										if (local182 == 0) {
											Static290.aClass134Array1[local178] = null;
											Static266.anInt4855 = -1;
											return true;
										}
										@Pc(2752) Class134 local2752 = new Class134();
										local2752.anInt4007 = local182;
										local2752.anInt4018 = Static13.aClass1_Sub14_Sub1_1.method1378();
										if (local2752.anInt4018 >= 0 && Static311.aClass1_Sub2_Sub1Array10.length > local2752.anInt4018) {
											if (local2752.anInt4007 == 1 || local2752.anInt4007 == 10) {
												local2752.anInt4011 = Static13.aClass1_Sub14_Sub1_1.method1386();
												Static13.aClass1_Sub14_Sub1_1.anInt1480 += 5;
											} else if (local2752.anInt4007 >= 2 && local2752.anInt4007 <= 6) {
												if (local2752.anInt4007 == 2) {
													local2752.anInt4005 = 64;
													local2752.anInt4008 = 64;
												}
												if (local2752.anInt4007 == 3) {
													local2752.anInt4005 = 0;
													local2752.anInt4008 = 64;
												}
												if (local2752.anInt4007 == 4) {
													local2752.anInt4005 = 128;
													local2752.anInt4008 = 64;
												}
												if (local2752.anInt4007 == 5) {
													local2752.anInt4005 = 64;
													local2752.anInt4008 = 0;
												}
												if (local2752.anInt4007 == 6) {
													local2752.anInt4005 = 64;
													local2752.anInt4008 = 128;
												}
												local2752.anInt4007 = 2;
												local2752.anInt4012 = Static13.aClass1_Sub14_Sub1_1.method1386();
												local2752.anInt4006 = Static13.aClass1_Sub14_Sub1_1.method1386();
												local2752.anInt4019 = Static13.aClass1_Sub14_Sub1_1.method1378();
												local2752.anInt4013 = Static13.aClass1_Sub14_Sub1_1.method1386();
											}
											local2752.anInt4014 = Static13.aClass1_Sub14_Sub1_1.method1386();
											if (local2752.anInt4014 == 65535) {
												local2752.anInt4014 = -1;
											}
											Static290.aClass134Array1[local178] = local2752;
										}
										Static266.anInt4855 = -1;
										return true;
									} else if (Static266.anInt4855 == 51) {
										local126 = Static13.aClass1_Sub14_Sub1_1.method1397();
										local178 = Static13.aClass1_Sub14_Sub1_1.method1381();
										local182 = Static13.aClass1_Sub14_Sub1_1.method1397();
										Static65.anInt1300 = local182 >> 1;
										Static90.aClass15_Sub5_Sub2_2.method4704(local126, local178, (local182 & 0x1) == 1);
										Static266.anInt4855 = -1;
										return true;
									} else if (Static266.anInt4855 == 138) {
										local126 = Static13.aClass1_Sub14_Sub1_1.method1383();
										local178 = Static13.aClass1_Sub14_Sub1_1.method1380();
										Static136.method2366(local126, local178);
										Static266.anInt4855 = -1;
										return true;
									} else if (Static266.anInt4855 == 162) {
										Static66.method3667(Static26.aClass154_1, Static13.aClass1_Sub14_Sub1_1, Static88.anInt1723);
										Static266.anInt4855 = -1;
										return true;
									} else if (Static266.anInt4855 == 9) {
										local126 = Static13.aClass1_Sub14_Sub1_1.method1367();
										local178 = Static13.aClass1_Sub14_Sub1_1.method1386();
										local182 = Static13.aClass1_Sub14_Sub1_1.method1367();
										local216 = Static13.aClass1_Sub14_Sub1_1.method1392();
										local365 = Static13.aClass1_Sub14_Sub1_1.method1386();
										if (Static7.method114(local126)) {
											Static148.method2515(local365, local216, local178, local182);
										}
										Static266.anInt4855 = -1;
										return true;
									} else {
										@Pc(3058) int local3058;
										if (Static266.anInt4855 == 144) {
											local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
											@Pc(3032) boolean local3032 = false;
											local1833 = Static13.aClass1_Sub14_Sub1_1.method1386();
											local2281 = Static13.aClass1_Sub14_Sub1_1.method1352();
											@Pc(3048) long local3048 = (local1833 << 32) + local2281;
											local957 = Static13.aClass1_Sub14_Sub1_1.method1378();
											local3058 = 0;
											label1409: while (true) {
												if (local3058 < 100) {
													if (local3048 != Static224.aLongArray12[local3058]) {
														local3058++;
														continue;
													}
													local3032 = true;
													break;
												}
												if (local957 <= 1) {
													if (Static232.aBoolean293 && !Static180.aBoolean233 || Static272.aBoolean387) {
														local3032 = true;
													} else {
														for (local3058 = 0; local3058 < Static72.anInt5402; local3058++) {
															if (Static29.aLongArray3[local3058] == local146) {
																local3032 = true;
																break label1409;
															}
														}
													}
												}
												break;
											}
											if (!local3032 && Static255.anInt4630 == 0) {
												Static224.aLongArray12[Static72.anInt5404] = local3048;
												Static72.anInt5404 = (Static72.anInt5404 + 1) % 100;
												@Pc(3131) String local3131 = Static78.method4019(Static166.method2836(Static160.method2755(Static13.aClass1_Sub14_Sub1_1)));
												if (local957 == 2 || local957 == 3) {
													Static243.method4744(local3131, 7, "<img=1>" + Static113.method2021(local146));
												} else if (local957 == 1) {
													Static243.method4744(local3131, 7, "<img=0>" + Static113.method2021(local146));
												} else {
													Static243.method4744(local3131, 3, Static113.method2021(local146));
												}
											}
											Static266.anInt4855 = -1;
											return true;
										} else if (Static266.anInt4855 == 31) {
											local1743 = Static13.aClass1_Sub14_Sub1_1.method1375();
											local178 = Static13.aClass1_Sub14_Sub1_1.method1366();
											local182 = Static13.aClass1_Sub14_Sub1_1.method1383();
											if (Static7.method114(local178)) {
												Static314.method760(local1743, local182);
											}
											Static266.anInt4855 = -1;
											return true;
										} else if (Static266.anInt4855 == 18) {
											local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
											if (Static7.method114(local126)) {
												Static212.method614();
											}
											Static266.anInt4855 = -1;
											return true;
										} else if (Static266.anInt4855 == 198) {
											@Pc(3243) byte local3243 = Static13.aClass1_Sub14_Sub1_1.method1370();
											local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
											Static27.method455(local3243, local178);
											Static266.anInt4855 = -1;
											return true;
										} else if (Static266.anInt4855 == 69) {
											Static151.method2549();
											Static266.anInt4855 = -1;
											return true;
										} else if (Static266.anInt4855 == 57) {
											Static130.method2235();
											local126 = Static13.aClass1_Sub14_Sub1_1.method1397();
											local178 = Static13.aClass1_Sub14_Sub1_1.method1380();
											local182 = Static13.aClass1_Sub14_Sub1_1.method1394();
											Static199.anIntArray312[local182] = local178;
											Static11.anIntArray12[local182] = local126;
											Static288.anIntArray459[local182] = 1;
											for (local216 = 0; local216 < 98; local216++) {
												if (local178 >= Class67_Sub1.anIntArray362[local216]) {
													Static288.anIntArray459[local182] = local216 + 2;
												}
											}
											Static157.anIntArray118[Static40.anInt5327++ & 0x1F] = local182;
											Static266.anInt4855 = -1;
											return true;
										} else if (Static266.anInt4855 == 168) {
											Static13.aClass1_Sub14_Sub1_1.anInt1480 += 28;
											if (Static13.aClass1_Sub14_Sub1_1.method1401()) {
												Static175.method2943(Static13.aClass1_Sub14_Sub1_1, Static13.aClass1_Sub14_Sub1_1.anInt1480 - 28);
											}
											Static266.anInt4855 = -1;
											return true;
										} else {
											@Pc(3384) String local3384;
											if (Static266.anInt4855 == 126) {
												local1743 = Static13.aClass1_Sub14_Sub1_1.method1375();
												if (local1743.endsWith(":tradereq:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":"));
													local2461 = false;
													local1833 = Static124.method4681(local3384);
													for (local361 = 0; local361 < Static72.anInt5402; local361++) {
														if (Static29.aLongArray3[local361] == local1833) {
															local2461 = true;
															break;
														}
													}
													if (!local2461 && Static255.anInt4630 == 0) {
														Static243.method4744(Static203.aString216, 4, local3384);
													}
												} else if (local1743.endsWith(":chalreq:")) {
													local2461 = false;
													local3384 = local1743.substring(0, local1743.indexOf(":"));
													local1833 = Static124.method4681(local3384);
													for (local361 = 0; local361 < Static72.anInt5402; local361++) {
														if (Static29.aLongArray3[local361] == local1833) {
															local2461 = true;
															break;
														}
													}
													if (!local2461 && Static255.anInt4630 == 0) {
														local2476 = local1743.substring(local1743.indexOf(":") + 1, local1743.length() + -9);
														Static243.method4744(local2476, 8, local3384);
													}
												} else if (local1743.endsWith(":assistreq:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":"));
													local1833 = Static124.method4681(local3384);
													local2461 = false;
													for (local361 = 0; local361 < Static72.anInt5402; local361++) {
														if (local1833 == Static29.aLongArray3[local361]) {
															local2461 = true;
															break;
														}
													}
													if (!local2461 && Static255.anInt4630 == 0) {
														Static243.method4744("", 10, local3384);
													}
												} else if (local1743.endsWith(":clan:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":clan:"));
													Static243.method4744(local3384, 11, "");
												} else if (local1743.endsWith(":trade:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":trade:"));
													if (Static255.anInt4630 == 0) {
														Static243.method4744(local3384, 12, "");
													}
												} else if (local1743.endsWith(":assist:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":assist:"));
													if (Static255.anInt4630 == 0) {
														Static243.method4744(local3384, 13, "");
													}
												} else if (local1743.endsWith(":duelstake:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":"));
													local1833 = Static124.method4681(local3384);
													local2461 = false;
													for (local361 = 0; local361 < Static72.anInt5402; local361++) {
														if (Static29.aLongArray3[local361] == local1833) {
															local2461 = true;
															break;
														}
													}
													if (!local2461 && Static255.anInt4630 == 0) {
														Static243.method4744("", 14, local3384);
													}
												} else if (local1743.endsWith(":duelfriend:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":"));
													local2461 = false;
													local1833 = Static124.method4681(local3384);
													for (local361 = 0; local361 < Static72.anInt5402; local361++) {
														if (Static29.aLongArray3[local361] == local1833) {
															local2461 = true;
															break;
														}
													}
													if (!local2461 && Static255.anInt4630 == 0) {
														Static243.method4744("", 15, local3384);
													}
												} else if (local1743.endsWith(":clanreq:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":"));
													local1833 = Static124.method4681(local3384);
													local2461 = false;
													for (local361 = 0; local361 < Static72.anInt5402; local361++) {
														if (Static29.aLongArray3[local361] == local1833) {
															local2461 = true;
															break;
														}
													}
													if (!local2461 && Static255.anInt4630 == 0) {
														Static243.method4744("", 16, local3384);
													}
												} else if (local1743.endsWith(":allyreq:")) {
													local3384 = local1743.substring(0, local1743.indexOf(":"));
													local1833 = Static124.method4681(local3384);
													local2461 = false;
													for (local361 = 0; local361 < Static72.anInt5402; local361++) {
														if (Static29.aLongArray3[local361] == local1833) {
															local2461 = true;
															break;
														}
													}
													if (!local2461 && Static255.anInt4630 == 0) {
														local2476 = local1743.substring(local1743.indexOf(":") + 1, local1743.length() + -9);
														Static243.method4744(local2476, 21, local3384);
													}
												} else if (local1743.endsWith(":spam:")) {
													local3384 = local1743.substring(0, local1743.length() - 6);
													if (Static255.anInt4630 == 0) {
														Static243.method4744(local3384, 22, "");
													}
												} else {
													Static243.method4744(local1743, 0, "");
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 203) {
												local126 = Static13.aClass1_Sub14_Sub1_1.method1367();
												local178 = Static13.aClass1_Sub14_Sub1_1.method1339();
												local182 = Static13.aClass1_Sub14_Sub1_1.method1383();
												local216 = Static13.aClass1_Sub14_Sub1_1.method1394();
												if (Static7.method114(local182)) {
													local2030 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local178);
													if (local2030 != null) {
														Static261.method4118(local126 != local2030.anInt4289, local2030);
													}
													Static243.method4745(local178, local126, local216);
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 110) {
												local126 = Static13.aClass1_Sub14_Sub1_1.method1392();
												local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
												local182 = Static13.aClass1_Sub14_Sub1_1.method1367();
												local216 = Static13.aClass1_Sub14_Sub1_1.method1367();
												if (local126 >> 30 == 0) {
													@Pc(4051) Class114 local4051;
													@Pc(4135) Class157 local4135;
													@Pc(4065) Class157 local4065;
													@Pc(4122) Class114 local4122;
													@Pc(4140) Class157 local4140;
													if (local126 >> 29 != 0) {
														local365 = local126 & 0xFFFF;
														@Pc(4018) Class15_Sub5_Sub1 local4018 = Static83.aClass15_Sub5_Sub1Array1[local365];
														if (local4018 != null) {
															if (local178 == 65535) {
																local178 = -1;
															}
															local1940 = true;
															if (local178 != -1 && local4018.anInt5510 != -1) {
																if (local4018.anInt5510 == local178) {
																	local4051 = Static55.method978(local178);
																	if (local4051.aBoolean235 && local4051.anInt3473 != -1) {
																		local4065 = Static80.method1561(local4051.anInt3473);
																		local1943 = local4065.anInt4524;
																		if (local1943 == 1) {
																			local4018.anInt5580 = 1;
																			local4018.anInt5535 = Static313.anInt2966 + local182;
																			local4018.anInt5547 = 0;
																			local1940 = false;
																			local4018.anInt5567 = 0;
																			local4018.anInt5590 = 0;
																			Static31.method503(local4065, local4018.anInt5590, local4018.anInt5557, false, local4018.anInt5559);
																		} else if (local1943 == 2) {
																			local1940 = false;
																			local4018.anInt5538 = 0;
																		}
																	}
																} else {
																	local4051 = Static55.method978(local178);
																	local4122 = Static55.method978(local4018.anInt5510);
																	if (local4051.anInt3473 != -1 && local4122.anInt3473 != -1) {
																		local4135 = Static80.method1561(local4051.anInt3473);
																		local4140 = Static80.method1561(local4122.anInt3473);
																		if (local4135.anInt4512 < local4140.anInt4512) {
																			local1940 = false;
																		}
																	}
																}
															}
															if (local1940) {
																local4018.anInt5535 = local182 + Static313.anInt2966;
																local4018.anInt5580 = 1;
																local4018.anInt5510 = local178;
																local4018.anInt5576 = local216;
																local4018.anInt5590 = 0;
																local4018.anInt5547 = 0;
																if (local4018.anInt5535 > Static313.anInt2966) {
																	local4018.anInt5590 = -1;
																}
																if (local4018.anInt5510 != -1 && local4018.anInt5535 == Static313.anInt2966) {
																	local953 = Static55.method978(local4018.anInt5510).anInt3473;
																	if (local953 != -1) {
																		local4065 = Static80.method1561(local953);
																		if (local4065 != null && local4065.anIntArray396 != null) {
																			Static31.method503(local4065, 0, local4018.anInt5557, false, local4018.anInt5559);
																		}
																	}
																}
															}
														}
													} else if (local126 >> 28 != 0) {
														local365 = local126 & 0xFFFF;
														@Pc(4242) Class15_Sub5_Sub2 local4242;
														if (local365 == Static35.anInt3966) {
															local4242 = Static90.aClass15_Sub5_Sub2_2;
														} else {
															local4242 = Static17.aClass15_Sub5_Sub2Array1[local365];
														}
														if (local4242 != null) {
															if (local178 == 65535) {
																local178 = -1;
															}
															local1940 = true;
															if (local178 != -1 && local4242.anInt5510 != -1) {
																if (local4242.anInt5510 == local178) {
																	local4051 = Static55.method978(local178);
																	if (local4051.aBoolean235 && local4051.anInt3473 != -1) {
																		local4065 = Static80.method1561(local4051.anInt3473);
																		local1943 = local4065.anInt4524;
																		if (local1943 == 1) {
																			local4242.anInt5567 = 0;
																			local4242.anInt5547 = 0;
																			local4242.anInt5590 = 0;
																			local4242.anInt5580 = 1;
																			local1940 = false;
																			local4242.anInt5535 = Static313.anInt2966 + local182;
																			Static31.method503(local4065, local4242.anInt5590, local4242.anInt5557, false, local4242.anInt5559);
																		} else if (local1943 == 2) {
																			local1940 = false;
																			local4242.anInt5538 = 0;
																		}
																	}
																} else {
																	local4051 = Static55.method978(local178);
																	local4122 = Static55.method978(local4242.anInt5510);
																	if (local4051.anInt3473 != -1 && local4122.anInt3473 != -1) {
																		local4135 = Static80.method1561(local4051.anInt3473);
																		local4140 = Static80.method1561(local4122.anInt3473);
																		if (local4135.anInt4512 < local4140.anInt4512) {
																			local1940 = false;
																		}
																	}
																}
															}
															if (local1940) {
																local4242.anInt5590 = 0;
																local4242.anInt5580 = 1;
																local4242.anInt5510 = local178;
																local4242.anInt5547 = 0;
																local4242.anInt5576 = local216;
																if (local4242.anInt5510 == 65535) {
																	local4242.anInt5510 = -1;
																}
																local4242.anInt5535 = local182 + Static313.anInt2966;
																if (Static313.anInt2966 < local4242.anInt5535) {
																	local4242.anInt5590 = -1;
																}
																if (local4242.anInt5510 != -1 && Static313.anInt2966 == local4242.anInt5535) {
																	local953 = Static55.method978(local4242.anInt5510).anInt3473;
																	if (local953 != -1) {
																		local4065 = Static80.method1561(local953);
																		if (local4065 != null && local4065.anIntArray396 != null) {
																			Static31.method503(local4065, 0, local4242.anInt5557, local4242 == Static90.aClass15_Sub5_Sub2_2, local4242.anInt5559);
																		}
																	}
																}
															}
														}
													}
												} else {
													local957 = (local126 & 0x3FFF) - Static192.anInt3637;
													local361 = (local126 >> 14 & 0x3FFF) - Static199.anInt3817;
													local365 = local126 >> 28 & 0x3;
													if (local361 >= 0 && local957 >= 0 && local361 < 104 && local957 < 104) {
														local957 = local957 * 128 + 64;
														local361 = local361 * 128 + 64;
														@Pc(3994) Class15_Sub4 local3994 = new Class15_Sub4(local178, local365, local361, local957, Static69.method4275(local957, local365, local361) - local216, local182, Static313.anInt2966);
														Static225.aClass59_32.method1706(new Class1_Sub2_Sub16(local3994));
													}
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 80) {
												local126 = Static13.aClass1_Sub14_Sub1_1.method1356();
												local178 = Static13.aClass1_Sub14_Sub1_1.method1393();
												local182 = Static13.aClass1_Sub14_Sub1_1.method1366();
												if (Static7.method114(local182)) {
													Static285.method4387(local126, local178);
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 44) {
												local126 = Static13.aClass1_Sub14_Sub1_1.method1366();
												local178 = Static13.aClass1_Sub14_Sub1_1.method1339();
												local153 = Static13.aClass1_Sub14_Sub1_1.method1375();
												if (Static7.method114(local126)) {
													Static182.method2994(local153, local178);
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 10) {
												local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
												local178 = Static13.aClass1_Sub14_Sub1_1.method1366();
												local182 = Static13.aClass1_Sub14_Sub1_1.method1394();
												@Pc(4549) Class15_Sub5_Sub1 local4549 = Static83.aClass15_Sub5_Sub1Array1[local126];
												if (local4549 != null) {
													Static244.method3824(local4549, local178, local182);
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 214) {
												local126 = Static13.aClass1_Sub14_Sub1_1.method1394();
												local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
												if (Static7.method114(local178)) {
													Static227.anInt4179 = local126;
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 117) {
												local126 = Static13.aClass1_Sub14_Sub1_1.method1366();
												@Pc(4596) byte local4596 = Static13.aClass1_Sub14_Sub1_1.method1370();
												local182 = Static13.aClass1_Sub14_Sub1_1.method1383();
												if (Static7.method114(local126)) {
													Static77.method1510(local4596, local182);
												}
												Static266.anInt4855 = -1;
												return true;
											} else if (Static266.anInt4855 == 213) {
												Static201.anInt3867 = Static13.aClass1_Sub14_Sub1_1.method1381();
												Static140.anInt5206 = Static13.aClass1_Sub14_Sub1_1.method1378();
												while (Static88.anInt1723 > Static13.aClass1_Sub14_Sub1_1.anInt1480) {
													Static266.anInt4855 = Static13.aClass1_Sub14_Sub1_1.method1378();
													Static85.method1595();
												}
												Static266.anInt4855 = -1;
												return true;
											} else {
												@Pc(4744) String local4744;
												if (Static266.anInt4855 == 183) {
													local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
													local1833 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local2281 = Static13.aClass1_Sub14_Sub1_1.method1352();
													local957 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local953 = Static13.aClass1_Sub14_Sub1_1.method1386();
													@Pc(4679) long local4679 = local2281 + (local1833 << 32);
													@Pc(4681) boolean local4681 = false;
													@Pc(4683) int local4683 = 0;
													label1435: while (true) {
														if (local4683 >= 100) {
															if (local957 <= 1) {
																for (local4683 = 0; local4683 < Static72.anInt5402; local4683++) {
																	if (Static29.aLongArray3[local4683] == local146) {
																		local4681 = true;
																		break label1435;
																	}
																}
															}
															break;
														}
														if (Static224.aLongArray12[local4683] == local4679) {
															local4681 = true;
															break;
														}
														local4683++;
													}
													if (!local4681 && Static255.anInt4630 == 0) {
														Static224.aLongArray12[Static72.anInt5404] = local4679;
														Static72.anInt5404 = (Static72.anInt5404 + 1) % 100;
														local4744 = Static235.method4486(local953).method2216(Static13.aClass1_Sub14_Sub1_1);
														if (local957 == 2) {
															Static45.method885(local953, "<img=1>" + Static113.method2021(local146), null, 18, local4744);
														} else if (local957 == 1) {
															Static45.method885(local953, "<img=0>" + Static113.method2021(local146), null, 18, local4744);
														} else {
															Static45.method885(local953, Static113.method2021(local146), null, 18, local4744);
														}
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 245) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1397();
													local178 = Static13.aClass1_Sub14_Sub1_1.method1397();
													local182 = Static13.aClass1_Sub14_Sub1_1.method1367();
													local1281 = Static13.aClass1_Sub14_Sub1_1.method1375();
													if (local182 == 65535) {
														local182 = -1;
													}
													if (local126 >= 1 && local126 <= 8) {
														if (local1281.equalsIgnoreCase("null")) {
															local1281 = null;
														}
														Static157.aStringArray4[local126 - 1] = local1281;
														Static202.anIntArray313[local126 - 1] = local182;
														Static139.aBooleanArray10[local126 - 1] = local178 == 0;
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 157) {
													local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
													Static13.aClass1_Sub14_Sub1_1.method1363();
													local1833 = Static13.aClass1_Sub14_Sub1_1.method1348();
													@Pc(4893) boolean local4893 = false;
													local2281 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local693 = Static13.aClass1_Sub14_Sub1_1.method1352();
													@Pc(4909) long local4909 = (local2281 << 32) + local693;
													local969 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local1943 = Static13.aClass1_Sub14_Sub1_1.method1386();
													@Pc(4919) int local4919 = 0;
													label1535: while (true) {
														if (local4919 >= 100) {
															if (local969 <= 1) {
																for (local4919 = 0; local4919 < Static72.anInt5402; local4919++) {
																	if (Static29.aLongArray3[local4919] == local146) {
																		local4893 = true;
																		break label1535;
																	}
																}
															}
															break;
														}
														if (local4909 == Static224.aLongArray12[local4919]) {
															local4893 = true;
															break;
														}
														local4919++;
													}
													if (!local4893 && Static255.anInt4630 == 0) {
														Static224.aLongArray12[Static72.anInt5404] = local4909;
														Static72.anInt5404 = (Static72.anInt5404 + 1) % 100;
														@Pc(4991) String local4991 = Static235.method4486(local1943).method2216(Static13.aClass1_Sub14_Sub1_1);
														if (local969 == 2 || local969 == 3) {
															Static45.method885(local1943, "<img=1>" + Static113.method2021(local146), Static113.method2021(local1833), 20, local4991);
														} else if (local969 == 1) {
															Static45.method885(local1943, "<img=0>" + Static113.method2021(local146), Static113.method2021(local1833), 20, local4991);
														} else {
															Static45.method885(local1943, Static113.method2021(local146), Static113.method2021(local1833), 20, local4991);
														}
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 52) {
													if (Static270.anInt4897 != -1) {
														Static290.method4438(0, Static270.anInt4897);
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 246) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1367();
													local178 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local182 = Static13.aClass1_Sub14_Sub1_1.method1397();
													if (Static7.method114(local178)) {
														if (local182 == 2) {
															Static15.method198();
														}
														Static270.anInt4897 = local126;
														Static295.method4495(local126);
														Static113.method2024(false);
														Static244.method3822(Static270.anInt4897);
														for (local216 = 0; local216 < 100; local216++) {
															Static304.aBooleanArray23[local216] = true;
														}
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 227) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local178 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local182 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local216 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local365 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local361 = Static13.aClass1_Sub14_Sub1_1.method1386();
													if (Static7.method114(local126)) {
														Static197.aBooleanArray15[local178] = true;
														Static194.anIntArray304[local178] = local182;
														Static100.anIntArray174[local178] = local216;
														Static233.anIntArray364[local178] = local365;
														Static244.anIntArray388[local178] = local361;
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 16) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local3384 = Static13.aClass1_Sub14_Sub1_1.method1375();
													@Pc(5209) Object[] local5209 = new Object[local3384.length() + 1];
													for (local216 = local3384.length() - 1; local216 >= 0; local216--) {
														if (local3384.charAt(local216) == 's') {
															local5209[local216 + 1] = Static13.aClass1_Sub14_Sub1_1.method1375();
														} else {
															local5209[local216 + 1] = Integer.valueOf(Static13.aClass1_Sub14_Sub1_1.method1392());
														}
													}
													local5209[0] = Integer.valueOf(Static13.aClass1_Sub14_Sub1_1.method1392());
													if (Static7.method114(local126)) {
														@Pc(5264) Class1_Sub10 local5264 = new Class1_Sub10();
														local5264.anObjectArray1 = local5209;
														Static194.method3152(local5264);
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 146) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1367();
													local178 = Static13.aClass1_Sub14_Sub1_1.method1393();
													if (Static7.method114(local126)) {
														local182 = 0;
														if (Static90.aClass15_Sub5_Sub2_2.aClass167_6 != null) {
															local182 = Static90.aClass15_Sub5_Sub2_2.aClass167_6.method4193();
														}
														Static250.method3938(local182, -1, local178, 3);
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 166) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local178 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local182 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local216 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local365 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local361 = Static13.aClass1_Sub14_Sub1_1.method1378();
													if (Static7.method114(local126)) {
														Static102.method1859(local182, local365, local216, local178, local361);
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 247) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local178 = Static13.aClass1_Sub14_Sub1_1.method1378();
													@Pc(5377) byte local5377 = Static13.aClass1_Sub14_Sub1_1.method1363();
													if (Static63.aByte18 != local5377) {
														Static266.anInt4855 = -1;
														return true;
													}
													if (local126 == 255) {
														Static162.anInt3171 = 0;
														Static196.anInt3703 = 0;
														Static52.aBoolean381 = false;
													} else {
														Static196.anInt3703 = local178;
														Static52.aBoolean381 = true;
														Static162.anInt3171 = local126;
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 208) {
													local146 = Static13.aClass1_Sub14_Sub1_1.method1348();
													local182 = Static13.aClass1_Sub14_Sub1_1.method1386();
													local216 = Static13.aClass1_Sub14_Sub1_1.method1378();
													local2461 = true;
													local2476 = "";
													if (local182 > 0) {
														local2476 = Static13.aClass1_Sub14_Sub1_1.method1375();
													}
													if (local146 < 0L) {
														local146 &= Long.MAX_VALUE;
														local2461 = false;
													}
													@Pc(5454) String local5454 = Static113.method2021(local146);
													for (local953 = 0; local953 < Static120.anInt2510; local953++) {
														if (Static204.aLongArray10[local953] == local146) {
															if (Static170.anIntArray283[local953] != local182) {
																Static170.anIntArray283[local953] = local182;
																if (local182 > 0) {
																	Static243.method4744(local5454 + Static282.aString302, 5, "");
																}
																if (local182 == 0) {
																	Static243.method4744(local5454 + Static293.aString315, 5, "");
																}
															}
															local5454 = null;
															Static239.aStringArray33[local953] = local2476;
															Static63.anIntArray276[local953] = local216;
															Static208.aBooleanArray17[local953] = local2461;
															break;
														}
													}
													if (local5454 != null && Static120.anInt2510 < 200) {
														Static204.aLongArray10[Static120.anInt2510] = local146;
														Static106.aStringArray16[Static120.anInt2510] = local5454;
														Static170.anIntArray283[Static120.anInt2510] = local182;
														Static239.aStringArray33[Static120.anInt2510] = local2476;
														Static63.anIntArray276[Static120.anInt2510] = local216;
														Static208.aBooleanArray17[Static120.anInt2510] = local2461;
														Static120.anInt2510++;
													}
													local969 = Static120.anInt2510;
													Static70.anInt1491 = Static86.anInt1698;
													while (local969 > 0) {
														local969--;
														@Pc(5585) boolean local5585 = true;
														for (local1943 = 0; local1943 < local969; local1943++) {
															if (Static170.anIntArray283[local1943] != Static312.anInt5731 && Static312.anInt5731 == Static170.anIntArray283[local1943 + 1] || Static170.anIntArray283[local1943] == 0 && Static170.anIntArray283[local1943 + 1] != 0) {
																local5585 = false;
																local3058 = Static170.anIntArray283[local1943];
																Static170.anIntArray283[local1943] = Static170.anIntArray283[local1943 + 1];
																Static170.anIntArray283[local1943 + 1] = local3058;
																local4744 = Static239.aStringArray33[local1943];
																Static239.aStringArray33[local1943] = Static239.aStringArray33[local1943 + 1];
																Static239.aStringArray33[local1943 + 1] = local4744;
																local2378 = Static106.aStringArray16[local1943];
																Static106.aStringArray16[local1943] = Static106.aStringArray16[local1943 + 1];
																Static106.aStringArray16[local1943 + 1] = local2378;
																@Pc(5676) long local5676 = Static204.aLongArray10[local1943];
																Static204.aLongArray10[local1943] = Static204.aLongArray10[local1943 + 1];
																Static204.aLongArray10[local1943 + 1] = local5676;
																@Pc(5694) int local5694 = Static63.anIntArray276[local1943];
																Static63.anIntArray276[local1943] = Static63.anIntArray276[local1943 + 1];
																Static63.anIntArray276[local1943 + 1] = local5694;
																@Pc(5712) boolean local5712 = Static208.aBooleanArray17[local1943];
																Static208.aBooleanArray17[local1943] = Static208.aBooleanArray17[local1943 + 1];
																Static208.aBooleanArray17[local1943 + 1] = local5712;
															}
														}
														if (local5585) {
															break;
														}
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 219) {
													if (Static275.aFrame2 != null) {
														Static259.method4091(false, Static41.anInt852, -1, -1);
													}
													@Pc(5751) byte[] local5751 = new byte[Static88.anInt1723];
													Static13.aClass1_Sub14_Sub1_1.method1406(Static88.anInt1723, local5751);
													local3384 = Static168.method2852(local5751, 0, Static88.anInt1723);
													if (Static197.aFrame1 == null && (Static246.anInt4462 == 3 || !Static246.aString266.startsWith("win") || Static154.aBoolean186)) {
														Static56.method983(local3384, true);
													} else {
														Static88.aString107 = local3384;
														Static200.aBoolean260 = true;
														Static107.aClass185_2 = Static26.aClass154_1.method3895(local3384);
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 243) {
													Static130.method2235();
													Static135.anInt2716 = Static13.aClass1_Sub14_Sub1_1.method1356();
													Static310.anInt5667 = Static86.anInt1698;
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 125) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1366();
													local178 = Static13.aClass1_Sub14_Sub1_1.method1383();
													local182 = Static13.aClass1_Sub14_Sub1_1.method1383();
													local216 = Static13.aClass1_Sub14_Sub1_1.method1380();
													local365 = Static13.aClass1_Sub14_Sub1_1.method1386();
													if (Static7.method114(local178)) {
														Static250.method3938(local126 << 16 | local365, local182, local216, 7);
													}
													Static266.anInt4855 = -1;
													return true;
												} else if (Static266.anInt4855 == 189) {
													local126 = Static13.aClass1_Sub14_Sub1_1.method1378();
													if (Static13.aClass1_Sub14_Sub1_1.method1378() == 0) {
														Static42.aClass50Array1[local126] = new Class50();
													} else {
														Static13.aClass1_Sub14_Sub1_1.anInt1480--;
														Static42.aClass50Array1[local126] = new Class50(Static13.aClass1_Sub14_Sub1_1);
													}
													Static266.anInt4855 = -1;
													Static49.anInt970 = Static86.anInt1698;
													return true;
												} else {
													Static159.method2733(null, "T1 - " + Static266.anInt4855 + "," + Static85.anInt1690 + "," + Static165.anInt3261 + " - " + Static88.anInt1723);
													Static74.method1467();
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

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZI)V")
	public static void method952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static182.anInt3491 * arg0 >> 8;
		if (arg1 == -1 && !Static152.aBoolean36) {
			Static84.method1578();
		} else if (arg1 != -1 && (Static273.anInt4944 != arg1 || !Static69.method4276()) && local5 != 0 && !Static152.aBoolean36) {
			Static288.method4408(Static308.aClass121_135, arg1, local5);
		}
		Static273.anInt4944 = arg1;
	}
}
