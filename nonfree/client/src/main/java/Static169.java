import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public static int anInt3023;

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!hu;")
	public static Class114 aClass114_4;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Z")
	public static boolean method2633() throws IOException {
		if (aClass114_4 == null) {
			return false;
		}
		@Pc(13) int local13 = aClass114_4.method2495();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static397.aClass12_345 == null) {
			if (Static323.aBoolean452) {
				aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 1);
				local13--;
				Static323.aBoolean452 = false;
				Static129.anInt2415++;
			}
			Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
			if (Static116.aClass1_Sub14_Sub2_1.method4560()) {
				if (local13 == 0) {
					return false;
				}
				aClass114_4.method2493(1, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 1);
				local13--;
				Static129.anInt2415++;
			}
			Static323.aBoolean452 = true;
			@Pc(66) Class12[] local66 = Static378.method5322();
			local70 = Static116.aClass1_Sub14_Sub2_1.method4556();
			if (local70 < 0 || local66.length <= local70) {
				throw new IOException("invo:" + local70 + " ip:" + Static116.aClass1_Sub14_Sub2_1.anInt5695);
			}
			Static397.aClass12_345 = local66[local70];
			Static282.anInt4732 = Static397.aClass12_345.anInt283;
		}
		if (Static282.anInt4732 == -1) {
			if (local13 <= 0) {
				return false;
			}
			aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 1);
			local13--;
			Static129.anInt2415++;
			Static282.anInt4732 = Static116.aClass1_Sub14_Sub2_1.aByteArray65[0] & 0xFF;
		}
		if (Static282.anInt4732 == -2) {
			if (local13 <= 1) {
				return false;
			}
			aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, 2);
			Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
			Static282.anInt4732 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local13 -= 2;
			Static129.anInt2415 += 2;
		}
		if (local13 < Static282.anInt4732) {
			return false;
		}
		Static116.aClass1_Sub14_Sub2_1.anInt5695 = 0;
		aClass114_4.method2493(0, Static116.aClass1_Sub14_Sub2_1.aByteArray65, Static282.anInt4732);
		Static133.aClass12_129 = Static84.aClass12_300;
		Static129.anInt2415 += Static282.anInt4732;
		Static108.anInt2094 = 0;
		Static84.aClass12_300 = Static369.aClass12_329;
		Static369.aClass12_329 = Static397.aClass12_345;
		@Pc(225) int local225;
		@Pc(233) int local233;
		if (Static260.aClass12_276 == Static397.aClass12_345) {
			Static221.anInt7650 = Static116.aClass1_Sub14_Sub2_1.method4514() << 3;
			Static316.anInt5491 = Static116.aClass1_Sub14_Sub2_1.method4491();
			Static90.anInt1739 = Static116.aClass1_Sub14_Sub2_1.method4529() << 3;
			for (@Pc(209) Class1_Sub34 local209 = (Class1_Sub34) Static346.aClass51_22.method928(); local209 != null; local209 = (Class1_Sub34) Static346.aClass51_22.method926()) {
				local70 = (int) (local209.aLong237 & 0x3FFFL);
				local225 = (int) (local209.aLong237 >> 14 & 0x3FFFL);
				local233 = (int) (local209.aLong237 >> 28 & 0x3L);
				if (local233 == Static316.anInt5491 && Static221.anInt7650 <= local70 && Static221.anInt7650 + 8 > local70 && local225 >= Static90.anInt1739 && local225 < Static90.anInt1739 + 8) {
					local209.method5965();
					Static111.method1739(local70, Static316.anInt5491, local225);
				}
			}
			for (@Pc(284) Class1_Sub21 local284 = (Class1_Sub21) Static280.aClass142_29.method3199(); local284 != null; local284 = (Class1_Sub21) Static280.aClass142_29.method3198()) {
				if (Static221.anInt7650 <= local284.anInt3367 && local284.anInt3367 < Static221.anInt7650 + 8 && Static90.anInt1739 <= local284.anInt3366 && local284.anInt3366 < Static90.anInt1739 + 8 && Static316.anInt5491 == local284.anInt3378) {
					local284.anInt3370 = 0;
				}
			}
			Static397.aClass12_345 = null;
			return true;
		}
		@Pc(339) int local339;
		if (Static7.aClass12_16 == Static397.aClass12_345) {
			local339 = Static116.aClass1_Sub14_Sub2_1.method4498();
			local70 = Static116.aClass1_Sub14_Sub2_1.method4494();
			local225 = Static116.aClass1_Sub14_Sub2_1.method4503();
			if (Static365.method5201(local339)) {
				Static336.method4845(local70, local225);
			}
			Static397.aClass12_345 = null;
			return true;
		} else if (Static397.aClass12_345 == Static83.aClass12_251) {
			local339 = Static116.aClass1_Sub14_Sub2_1.method4528();
			local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
			if (Static365.method5201(local70)) {
				Static279.method5853(3, local339, -1, -1);
			}
			Static397.aClass12_345 = null;
			return true;
		} else {
			@Pc(407) int local407;
			if (Static397.aClass12_345 == Static263.aClass12_223) {
				local339 = Static116.aClass1_Sub14_Sub2_1.method4518();
				local70 = Static116.aClass1_Sub14_Sub2_1.method4518();
				local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
				local233 = Static116.aClass1_Sub14_Sub2_1.method4518();
				local407 = Static116.aClass1_Sub14_Sub2_1.method4503();
				if (Static365.method5201(local339)) {
					Static389.method5448(local70, local233, local225, local407);
				}
				Static397.aClass12_345 = null;
				return true;
			} else if (Static153.aClass12_233 == Static397.aClass12_345) {
				Static18.method241(Static435.aClass60_15);
				Static397.aClass12_345 = null;
				return true;
			} else if (Static385.aClass12_339 == Static397.aClass12_345) {
				if (Static246.anInt4292 != -1) {
					Static143.method2301(Static246.anInt4292, 0);
				}
				Static397.aClass12_345 = null;
				return true;
			} else if (Static397.aClass12_345 == Static223.aClass12_205) {
				Static90.anInt1739 = Static116.aClass1_Sub14_Sub2_1.method4529() << 3;
				Static316.anInt5491 = Static116.aClass1_Sub14_Sub2_1.method4548();
				Static221.anInt7650 = Static116.aClass1_Sub14_Sub2_1.method4513() << 3;
				while (Static116.aClass1_Sub14_Sub2_1.anInt5695 < Static282.anInt4732) {
					@Pc(474) Class60 local474 = Static156.method2484()[Static116.aClass1_Sub14_Sub2_1.method4548()];
					Static18.method241(local474);
				}
				Static397.aClass12_345 = null;
				return true;
			} else if (Static310.aClass12_273 == Static397.aClass12_345) {
				Static18.method241(Static250.aClass60_12);
				Static397.aClass12_345 = null;
				return true;
			} else {
				@Pc(521) String local521;
				@Pc(552) int local552;
				@Pc(517) String local517;
				@Pc(533) boolean local533;
				@Pc(788) String local788;
				@Pc(752) String local752;
				@Pc(531) String local531;
				if (Static397.aClass12_345 == Static27.aClass12_30) {
					@Pc(513) boolean local513;
					while (Static282.anInt4732 > Static116.aClass1_Sub14_Sub2_1.anInt5695) {
						local513 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
						local517 = Static116.aClass1_Sub14_Sub2_1.method4509();
						local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
						local233 = Static116.aClass1_Sub14_Sub2_1.method4498();
						local407 = Static116.aClass1_Sub14_Sub2_1.method4548();
						local531 = "";
						local533 = false;
						if (local233 > 0) {
							local531 = Static116.aClass1_Sub14_Sub2_1.method4509();
							local533 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
						}
						for (local552 = 0; local552 < Static342.anInt6234; local552++) {
							if (local513) {
								if (local521.equals(Static396.aStringArray40[local552])) {
									Static396.aStringArray40[local552] = local517;
									Static16.aStringArray3[local552] = local521;
									local517 = null;
									break;
								}
							} else if (local517.equals(Static396.aStringArray40[local552])) {
								if (Static435.anIntArray445[local552] != local233) {
									Static435.anIntArray445[local552] = local233;
									if (local233 > 0) {
										Static179.method2890(5, local517 + Static272.aClass96_75.method1935(Static389.anInt7061), 0, "", "");
									}
									if (local233 == 0) {
										Static179.method2890(5, local517 + Static412.aClass96_105.method1935(Static389.anInt7061), 0, "", "");
									}
								}
								Static16.aStringArray3[local552] = local521;
								Static72.aStringArray13[local552] = local531;
								Static309.anIntArray397[local552] = local407;
								Static136.aBooleanArray10[local552] = local533;
								local517 = null;
								break;
							}
						}
						if (local517 != null && Static342.anInt6234 < 200) {
							Static396.aStringArray40[Static342.anInt6234] = local517;
							Static16.aStringArray3[Static342.anInt6234] = local521;
							Static435.anIntArray445[Static342.anInt6234] = local233;
							Static72.aStringArray13[Static342.anInt6234] = local531;
							Static309.anIntArray397[Static342.anInt6234] = local407;
							Static136.aBooleanArray10[Static342.anInt6234] = local533;
							Static342.anInt6234++;
						}
					}
					Static365.anInt6644 = 2;
					Static238.anInt4203 = Static270.anInt2350;
					local70 = Static342.anInt6234;
					while (local70 > 0) {
						local70--;
						local513 = true;
						for (local225 = 0; local225 < local70; local225++) {
							if (Static435.anIntArray445[local225] != Static20.anInt299 && Static20.anInt299 == Static435.anIntArray445[local225 + 1] || Static435.anIntArray445[local225] == 0 && Static435.anIntArray445[local225 + 1] != 0) {
								local233 = Static435.anIntArray445[local225];
								Static435.anIntArray445[local225] = Static435.anIntArray445[local225 + 1];
								Static435.anIntArray445[local225 + 1] = local233;
								local752 = Static72.aStringArray13[local225];
								Static72.aStringArray13[local225] = Static72.aStringArray13[local225 + 1];
								Static72.aStringArray13[local225 + 1] = local752;
								local531 = Static396.aStringArray40[local225];
								Static396.aStringArray40[local225] = Static396.aStringArray40[local225 + 1];
								Static396.aStringArray40[local225 + 1] = local531;
								local788 = Static16.aStringArray3[local225];
								Static16.aStringArray3[local225] = Static16.aStringArray3[local225 + 1];
								Static16.aStringArray3[local225 + 1] = local788;
								local552 = Static309.anIntArray397[local225];
								Static309.anIntArray397[local225] = Static309.anIntArray397[local225 + 1];
								Static309.anIntArray397[local225 + 1] = local552;
								@Pc(824) boolean local824 = Static136.aBooleanArray10[local225];
								Static136.aBooleanArray10[local225] = Static136.aBooleanArray10[local225 + 1];
								Static136.aBooleanArray10[local225 + 1] = local824;
								local513 = false;
							}
						}
						if (local513) {
							break;
						}
					}
					Static397.aClass12_345 = null;
					return true;
				} else if (Static397.aClass12_345 == Static40.aClass12_47) {
					@Pc(865) String local865 = Static116.aClass1_Sub14_Sub2_1.method4509();
					local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
					local521 = Static42.aClass228_5.method5369(local70).method775(Static116.aClass1_Sub14_Sub2_1);
					Static165.method3932(local865, local70, local865, 0, null, local521, 19);
					Static397.aClass12_345 = null;
					return true;
				} else {
					@Pc(917) int local917;
					if (Static397.aClass12_345 == Static215.aClass12_195) {
						local339 = Static116.aClass1_Sub14_Sub2_1.method4498();
						local70 = Static116.aClass1_Sub14_Sub2_1.method4548();
						local225 = Static116.aClass1_Sub14_Sub2_1.method4548();
						local233 = Static116.aClass1_Sub14_Sub2_1.method4548();
						local407 = Static116.aClass1_Sub14_Sub2_1.method4548();
						local917 = Static116.aClass1_Sub14_Sub2_1.method4498();
						if (Static365.method5201(local339)) {
							Static45.aBooleanArray3[local70] = true;
							Static404.anIntArray530[local70] = local225;
							Static343.anIntArray454[local70] = local233;
							Static235.anIntArray329[local70] = local407;
							Static253.anIntArray50[local70] = local917;
						}
						Static397.aClass12_345 = null;
						return true;
					}
					@Pc(956) byte local956;
					if (Static397.aClass12_345 == Static312.aClass12_277) {
						local339 = Static116.aClass1_Sub14_Sub2_1.method4518();
						local956 = Static116.aClass1_Sub14_Sub2_1.method4514();
						Static237.aClass80_1.method1616(local339, local956);
						Static397.aClass12_345 = null;
						return true;
					} else if (Static39.aClass12_44 == Static397.aClass12_345) {
						Static343.method4932(Static116.aClass1_Sub14_Sub2_1, Static282.anInt4732);
						Static397.aClass12_345 = null;
						return true;
					} else if (Static397.aClass12_345 == Static217.aClass12_201) {
						local339 = Static116.aClass1_Sub14_Sub2_1.method4498();
						if (local339 == 65535) {
							local339 = -1;
						}
						local70 = Static116.aClass1_Sub14_Sub2_1.method4548();
						local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
						local233 = Static116.aClass1_Sub14_Sub2_1.method4548();
						Static221.method5884(local225, local339, local70, local233);
						Static397.aClass12_345 = null;
						return true;
					} else if (Static385.aClass12_338 == Static397.aClass12_345) {
						Static313.aClass171_4 = Static242.method3805(Static116.aClass1_Sub14_Sub2_1.method4548());
						Static397.aClass12_345 = null;
						return true;
					} else if (Static397.aClass12_345 == Static56.aClass12_64) {
						Static18.method241(Static417.aClass60_19);
						Static397.aClass12_345 = null;
						return true;
					} else if (Static397.aClass12_345 == Static438.aClass12_380) {
						local339 = Static116.aClass1_Sub14_Sub2_1.method4498();
						local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
						local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
						local233 = Static116.aClass1_Sub14_Sub2_1.method4498();
						if (Static365.method5201(local339) && Static276.aClass229ArrayArray1[local70] != null) {
							for (local407 = local225; local407 < local233; local407++) {
								local917 = Static116.aClass1_Sub14_Sub2_1.method4496();
								if (Static276.aClass229ArrayArray1[local70].length > local407 && Static276.aClass229ArrayArray1[local70][local407] != null) {
									Static276.aClass229ArrayArray1[local70][local407].anInt6919 = local917;
								}
							}
						}
						Static397.aClass12_345 = null;
						return true;
					} else if (Static179.aClass12_173 == Static397.aClass12_345) {
						local339 = Static116.aClass1_Sub14_Sub2_1.method4533();
						if (local339 == 65535) {
							local339 = -1;
						}
						local70 = Static116.aClass1_Sub14_Sub2_1.method4528();
						local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
						if (Static365.method5201(local225)) {
							Static386.method5373(local339, local70);
						}
						Static397.aClass12_345 = null;
						return true;
					} else if (Static143.aClass12_137 == Static397.aClass12_345) {
						local339 = Static116.aClass1_Sub14_Sub2_1.method4524();
						local70 = Static116.aClass1_Sub14_Sub2_1.method4499();
						local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
						@Pc(1154) Class47_Sub1_Sub5_Sub1 local1154 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local70];
						if (local1154 != null) {
							Static62.method950(local339, local1154, local225);
						}
						Static397.aClass12_345 = null;
						return true;
					} else {
						@Pc(1189) String local1189;
						if (Static276.aClass12_238 == Static397.aClass12_345) {
							local339 = Static116.aClass1_Sub14_Sub2_1.method4524();
							local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
							if (local70 == 65535) {
								local70 = -1;
							}
							local225 = Static116.aClass1_Sub14_Sub2_1.method4494();
							local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
							if (local339 >= 1 && local339 <= 8) {
								if (local1189.equalsIgnoreCase("null")) {
									local1189 = null;
								}
								Static51.aStringArray8[local339 - 1] = local1189;
								Static129.anIntArray175[local339 - 1] = local70;
								Static308.aBooleanArray26[local339 - 1] = local225 == 0;
							}
							Static397.aClass12_345 = null;
							return true;
						} else if (Static397.aClass12_345 == Static432.aClass12_370) {
							Static365.anInt6644 = 1;
							Static238.anInt4203 = Static270.anInt2350;
							Static397.aClass12_345 = null;
							return true;
						} else if (Static397.aClass12_345 == Static407.aClass12_351) {
							local339 = Static116.aClass1_Sub14_Sub2_1.method4518();
							local70 = Static116.aClass1_Sub14_Sub2_1.method4518();
							local225 = Static116.aClass1_Sub14_Sub2_1.method4519();
							if (Static365.method5201(local70)) {
								Static57.method733(local339, local225);
							}
							Static397.aClass12_345 = null;
							return true;
						} else if (Static397.aClass12_345 == Static224.aClass12_206) {
							for (local70 = 0; local70 < Static362.aClass47_Sub1_Sub5_Sub2Array1.length; local70++) {
								if (Static362.aClass47_Sub1_Sub5_Sub2Array1[local70] != null) {
									Static362.aClass47_Sub1_Sub5_Sub2Array1[local70].anInt5348 = -1;
								}
							}
							for (local225 = 0; local225 < Static307.aClass47_Sub1_Sub5_Sub1Array1.length; local225++) {
								if (Static307.aClass47_Sub1_Sub5_Sub1Array1[local225] != null) {
									Static307.aClass47_Sub1_Sub5_Sub1Array1[local225].anInt5348 = -1;
								}
							}
							Static397.aClass12_345 = null;
							return true;
						} else if (Static397.aClass12_345 == Static328.aClass12_290) {
							Static18.method241(Static355.aClass60_16);
							Static397.aClass12_345 = null;
							return true;
						} else if (Static306.aClass12_269 == Static397.aClass12_345) {
							local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
							local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
							local233 = Static116.aClass1_Sub14_Sub2_1.method4503();
							if (Static365.method5201(local70)) {
								Static27.method386(local233, local225);
							}
							Static397.aClass12_345 = null;
							return true;
						} else {
							@Pc(1394) int local1394;
							if (Static397.aClass12_345 == Static282.aClass12_243) {
								local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
								local225 = Static116.aClass1_Sub14_Sub2_1.method4548();
								local233 = Static116.aClass1_Sub14_Sub2_1.method4548();
								local407 = Static116.aClass1_Sub14_Sub2_1.method4498() << 0;
								local917 = Static116.aClass1_Sub14_Sub2_1.method4548();
								local1394 = Static116.aClass1_Sub14_Sub2_1.method4548();
								if (Static365.method5201(local70)) {
									Static434.method5820(true, local233, local407, local225, local917, local1394);
								}
								Static397.aClass12_345 = null;
								return true;
							} else if (Static47.aClass12_60 == Static397.aClass12_345) {
								local70 = Static116.aClass1_Sub14_Sub2_1.method4521();
								local225 = Static116.aClass1_Sub14_Sub2_1.method4500();
								local233 = Static116.aClass1_Sub14_Sub2_1.method4548();
								local752 = "";
								local531 = local752;
								if ((local233 & 0x1) != 0) {
									local752 = Static116.aClass1_Sub14_Sub2_1.method4509();
									if ((local233 & 0x2) == 0) {
										local531 = local752;
									} else {
										local531 = Static116.aClass1_Sub14_Sub2_1.method4509();
									}
								}
								local788 = Static116.aClass1_Sub14_Sub2_1.method4509();
								if (local70 == 99) {
									Static161.method2529(local788);
								} else if (local531.equals("") || !Static206.method3152(local531)) {
									Static179.method2890(local70, local788, local225, local752, local531);
								} else {
									Static397.aClass12_345 = null;
									return true;
								}
								Static397.aClass12_345 = null;
								return true;
							} else if (Static397.aClass12_345 == Static436.aClass12_374) {
								Static225.method3278(true);
								Static397.aClass12_345 = null;
								return true;
							} else if (Static397.aClass12_345 == Static347.aClass12_307) {
								Static237.aClass80_1.method1619();
								Static271.anInt4570 += 32;
								Static397.aClass12_345 = null;
								return true;
							} else if (Static222.aClass12_204 == Static397.aClass12_345) {
								Static225.anInt3905 = Static116.aClass1_Sub14_Sub2_1.method4498() * 30;
								Static397.aClass12_345 = null;
								Static392.anInt7048 = Static270.anInt2350;
								return true;
							} else if (Static81.aClass12_89 == Static397.aClass12_345) {
								local70 = Static116.aClass1_Sub14_Sub2_1.method4500();
								local225 = Static116.aClass1_Sub14_Sub2_1.method4536();
								local233 = Static116.aClass1_Sub14_Sub2_1.method4518();
								if (Static365.method5201(local233)) {
									Static89.method1251(local225, local70);
								}
								Static397.aClass12_345 = null;
								return true;
							} else {
								@Pc(1610) long local1610;
								@Pc(1616) Class1_Sub7 local1616;
								@Pc(1627) Class1_Sub7 local1627;
								if (Static74.aClass12_87 == Static397.aClass12_345) {
									local70 = Static116.aClass1_Sub14_Sub2_1.method4533();
									if (local70 == 65535) {
										local70 = -1;
									}
									local225 = Static116.aClass1_Sub14_Sub2_1.method4528();
									local233 = Static116.aClass1_Sub14_Sub2_1.method4518();
									local407 = Static116.aClass1_Sub14_Sub2_1.method4518();
									if (local407 == 65535) {
										local407 = -1;
									}
									local917 = Static116.aClass1_Sub14_Sub2_1.method4519();
									if (Static365.method5201(local233)) {
										for (local1394 = local70; local1394 <= local407; local1394++) {
											local1610 = ((long) local225 << 32) + ((long) local1394);
											local1616 = (Class1_Sub7) Static402.aClass51_37.method930(local1610);
											if (local1616 != null) {
												local1627 = new Class1_Sub7(local917, local1616.anInt1150);
												local1616.method5965();
											} else if (local1394 == -1) {
												local1627 = new Class1_Sub7(local917, Static203.method1670(local225).aClass1_Sub7_4.anInt1150);
											} else {
												local1627 = new Class1_Sub7(local917, -1);
											}
											Static402.aClass51_37.method931(local1627, local1610);
										}
									}
									Static397.aClass12_345 = null;
									return true;
								}
								@Pc(1701) Class1_Sub38 local1701;
								if (Static263.aClass12_222 == Static397.aClass12_345) {
									local70 = Static116.aClass1_Sub14_Sub2_1.method4533();
									local225 = Static116.aClass1_Sub14_Sub2_1.method4503();
									local233 = Static116.aClass1_Sub14_Sub2_1.method4500();
									if (Static365.method5201(local70)) {
										@Pc(1694) Class1_Sub38 local1694 = (Class1_Sub38) Static81.aClass51_5.method930((long) local233);
										local1701 = (Class1_Sub38) Static81.aClass51_5.method930((long) local225);
										if (local1701 != null) {
											Static284.method3909(local1694 == null || local1694.anInt6527 != local1701.anInt6527, false, local1701);
										}
										if (local1694 != null) {
											local1694.method5965();
											Static81.aClass51_5.method931(local1694, (long) local225);
										}
										@Pc(1732) Class229 local1732 = Static203.method1670(local233);
										if (local1732 != null) {
											Static373.method5289(local1732);
										}
										local1732 = Static203.method1670(local225);
										if (local1732 != null) {
											Static373.method5289(local1732);
											Static319.method4586(local1732, true);
										}
										if (Static246.anInt4292 != -1) {
											Static143.method2301(Static246.anInt4292, 1);
										}
									}
									Static397.aClass12_345 = null;
									return true;
								} else if (Static397.aClass12_345 == Static437.aClass12_377) {
									local70 = Static116.aClass1_Sub14_Sub2_1.method4500();
									Static282.aClass159_8 = Static403.aClass42_6.method650(local70);
									Static397.aClass12_345 = null;
									return true;
								} else if (Static5.aClass12_332 == Static397.aClass12_345) {
									Static18.method241(Static397.aClass60_17);
									Static397.aClass12_345 = null;
									return true;
								} else {
									@Pc(1808) boolean local1808;
									if (Static397.aClass12_345 == Static396.aClass12_344) {
										local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
										local225 = Static116.aClass1_Sub14_Sub2_1.method4548();
										local1808 = (local225 & 0x1) == 1;
										Static282.method3881(local70, local1808);
										local407 = Static116.aClass1_Sub14_Sub2_1.method4498();
										for (local917 = 0; local917 < local407; local917++) {
											local1394 = Static116.aClass1_Sub14_Sub2_1.method4533();
											local552 = Static116.aClass1_Sub14_Sub2_1.method4524();
											if (local552 == 255) {
												local552 = Static116.aClass1_Sub14_Sub2_1.method4500();
											}
											Static165.method3940(local1394 - 1, local917, local552, local70, local1808);
										}
										Static118.anIntArray119[Static151.anInt2727++ & 0x1F] = local70;
										Static397.aClass12_345 = null;
										return true;
									} else if (Static397.aClass12_345 == Static217.aClass12_200) {
										local70 = Static116.aClass1_Sub14_Sub2_1.method4548();
										local225 = local70 >> 5;
										local233 = local70 & 0x1F;
										if (local233 == 0) {
											Static416.aClass262Array1[local225] = null;
											Static397.aClass12_345 = null;
											return true;
										}
										@Pc(1900) Class262 local1900 = new Class262();
										local1900.anInt7695 = local233;
										local1900.anInt7701 = Static116.aClass1_Sub14_Sub2_1.method4548();
										if (local1900.anInt7701 >= 0 && local1900.anInt7701 < Static343.aClass78Array10.length) {
											if (local1900.anInt7695 == 1 || local1900.anInt7695 == 10) {
												local1900.anInt7698 = Static116.aClass1_Sub14_Sub2_1.method4498();
												Static116.aClass1_Sub14_Sub2_1.anInt5695 += 6;
											} else if (local1900.anInt7695 >= 2 && local1900.anInt7695 <= 6) {
												if (local1900.anInt7695 == 2) {
													local1900.anInt7697 = 64;
													local1900.anInt7694 = 64;
												}
												if (local1900.anInt7695 == 3) {
													local1900.anInt7697 = 0;
													local1900.anInt7694 = 64;
												}
												if (local1900.anInt7695 == 4) {
													local1900.anInt7697 = 128;
													local1900.anInt7694 = 64;
												}
												if (local1900.anInt7695 == 5) {
													local1900.anInt7694 = 0;
													local1900.anInt7697 = 64;
												}
												if (local1900.anInt7695 == 6) {
													local1900.anInt7694 = 128;
													local1900.anInt7697 = 64;
												}
												local1900.anInt7695 = 2;
												local1900.anInt7696 = Static116.aClass1_Sub14_Sub2_1.method4548();
												local1900.anInt7697 += Static116.aClass1_Sub14_Sub2_1.method4498() - Static190.anInt3507 << 7;
												local1900.anInt7694 += Static116.aClass1_Sub14_Sub2_1.method4498() - Static331.anInt6034 << 7;
												local1900.anInt7693 = Static116.aClass1_Sub14_Sub2_1.method4548();
												local1900.anInt7700 = Static116.aClass1_Sub14_Sub2_1.method4498();
											}
											local1900.anInt7691 = Static116.aClass1_Sub14_Sub2_1.method4498();
											if (local1900.anInt7691 == 65535) {
												local1900.anInt7691 = -1;
											}
											Static416.aClass262Array1[local225] = local1900;
										}
										Static397.aClass12_345 = null;
										return true;
									} else if (Static252.aClass12_218 == Static397.aClass12_345) {
										local70 = Static116.aClass1_Sub14_Sub2_1.method4524();
										local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
										Static237.aClass80_1.method1617(local225, local70);
										Static397.aClass12_345 = null;
										return true;
									} else if (Static97.aClass12_105 == Static397.aClass12_345) {
										local70 = Static116.aClass1_Sub14_Sub2_1.method4533();
										local225 = Static116.aClass1_Sub14_Sub2_1.method4499();
										local233 = Static116.aClass1_Sub14_Sub2_1.method4494();
										if (Static365.method5201(local225)) {
											if (local233 == 2) {
												Static330.method4767();
											}
											Static246.anInt4292 = local70;
											Static252.method3609(local70);
											Static159.method2523(false);
											Static354.method5065(Static246.anInt4292);
											for (local407 = 0; local407 < 100; local407++) {
												Static204.aBooleanArray15[local407] = true;
											}
										}
										Static397.aClass12_345 = null;
										return true;
									} else if (Static397.aClass12_345 == Static175.aClass12_278) {
										local517 = Static116.aClass1_Sub14_Sub2_1.method4509();
										local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
										local233 = Static116.aClass1_Sub14_Sub2_1.method4528();
										if (Static365.method5201(local225)) {
											Static96.method1519(local233, local517);
										}
										Static397.aClass12_345 = null;
										return true;
									} else {
										@Pc(2218) int local2218;
										@Pc(2226) int local2226;
										if (Static397.aClass12_345 == Static84.aClass12_299) {
											local70 = Static116.aClass1_Sub14_Sub2_1.method4524();
											local225 = local70 >> 2;
											local233 = local70 & 0x3;
											local407 = Static449.anIntArray583[local225];
											local917 = Static116.aClass1_Sub14_Sub2_1.method4533();
											if (local917 == 65535) {
												local917 = -1;
											}
											local1394 = Static116.aClass1_Sub14_Sub2_1.method4500();
											local552 = local1394 >> 28 & 0x3;
											local2218 = local1394 >> 14 & 0x3FFF;
											local2218 -= Static190.anInt3507;
											local2226 = local1394 & 0x3FFF;
											local2226 -= Static331.anInt6034;
											Static312.method4268(local2226, local917, local407, local2218, local552, local233, local225);
											Static397.aClass12_345 = null;
											return true;
										} else if (Static40.aClass12_46 == Static397.aClass12_345) {
											local70 = Static116.aClass1_Sub14_Sub2_1.method4551();
											local225 = Static116.aClass1_Sub14_Sub2_1.method4500();
											local233 = Static116.aClass1_Sub14_Sub2_1.method4531();
											local407 = Static116.aClass1_Sub14_Sub2_1.method4499();
											if (Static365.method5201(local407)) {
												Static382.method4539(local225, local70, local233);
											}
											Static397.aClass12_345 = null;
											return true;
										} else if (Static276.aClass12_237 == Static397.aClass12_345) {
											Static234.method3394(Static116.aClass1_Sub14_Sub2_1, Static282.anInt4732, Static403.aClass42_6);
											Static397.aClass12_345 = null;
											return true;
										} else if (Static397.aClass12_345 == Static373.aClass12_335) {
											Static417.anInt7328 = Static116.aClass1_Sub14_Sub2_1.method4548();
											Static397.aClass12_345 = null;
											return true;
										} else {
											@Pc(2327) long local2327;
											@Pc(2332) long local2332;
											@Pc(2310) boolean local2310;
											@Pc(2347) int local2347;
											if (Static305.aClass12_266 == Static397.aClass12_345) {
												local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
												local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
												local1189 = local521;
												if (local2310) {
													local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
												}
												local2327 = Static116.aClass1_Sub14_Sub2_1.method4498();
												local2332 = Static116.aClass1_Sub14_Sub2_1.method4496();
												local2218 = Static116.aClass1_Sub14_Sub2_1.method4548();
												@Pc(2343) long local2343 = (local2327 << 32) + local2332;
												@Pc(2345) boolean local2345 = false;
												local2347 = 0;
												while (true) {
													if (local2347 >= 100) {
														if (local2218 <= 1) {
															if (Static406.aBoolean595 && !Static151.aBoolean219 || Static195.aBoolean276) {
																local2345 = true;
															} else if (Static206.method3152(local1189)) {
																local2345 = true;
															}
														}
														break;
													}
													if (Static183.aLongArray3[local2347] == local2343) {
														local2345 = true;
														break;
													}
													local2347++;
												}
												if (!local2345 && Static266.anInt7428 == 0) {
													Static183.aLongArray3[Static94.anInt1810] = local2343;
													Static94.anInt1810 = (Static94.anInt1810 + 1) % 100;
													@Pc(2407) String local2407 = Static418.method5658(Static161.method2527(Static116.aClass1_Sub14_Sub2_1));
													if (local2218 == 2) {
														Static165.method3932("<img=1>" + local521, -1, "<img=1>" + local1189, 0, null, local2407, 7);
													} else if (local2218 == 1) {
														Static165.method3932("<img=0>" + local521, -1, "<img=0>" + local1189, 0, null, local2407, 7);
													} else {
														Static165.method3932(local521, -1, local1189, 0, null, local2407, 3);
													}
												}
												Static397.aClass12_345 = null;
												return true;
											}
											@Pc(2529) String local2529;
											if (Static409.aClass12_352 == Static397.aClass12_345) {
												local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
												local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
												local1189 = local521;
												if (local2310) {
													local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
												}
												local407 = Static116.aClass1_Sub14_Sub2_1.method4548();
												local917 = Static116.aClass1_Sub14_Sub2_1.method4498();
												local533 = false;
												if (local407 <= 1 && Static206.method3152(local1189)) {
													local533 = true;
												}
												if (!local533 && Static266.anInt7428 == 0) {
													local2529 = Static42.aClass228_5.method5369(local917).method775(Static116.aClass1_Sub14_Sub2_1);
													if (local407 == 2) {
														Static165.method3932("<img=1>" + local521, local917, "<img=1>" + local1189, 0, null, local2529, 25);
													} else if (local407 == 1) {
														Static165.method3932("<img=0>" + local521, local917, "<img=0>" + local1189, 0, null, local2529, 25);
													} else {
														Static165.method3932(local521, local917, local1189, 0, null, local2529, 25);
													}
												}
												Static397.aClass12_345 = null;
												return true;
											} else if (Static397.aClass12_345 == Static305.aClass12_265) {
												local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
												local225 = Static116.aClass1_Sub14_Sub2_1.method4500();
												if (Static365.method5201(local70)) {
													Static279.method5853(5, local225, 0, Static179.anInt3373);
												}
												Static397.aClass12_345 = null;
												return true;
											} else {
												@Pc(2781) int local2781;
												@Pc(2746) Class152 local2746;
												if (Static397.aClass12_345 == Static422.aClass12_108) {
													local517 = Static116.aClass1_Sub14_Sub2_1.method4509();
													local1808 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
													if (local1808) {
														local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
													} else {
														local521 = local517;
													}
													local407 = Static116.aClass1_Sub14_Sub2_1.method4498();
													@Pc(2657) byte local2657 = Static116.aClass1_Sub14_Sub2_1.method4529();
													local533 = false;
													if (local2657 == -128) {
														local533 = true;
													}
													if (local533) {
														if (Static175.anInt5411 == 0) {
															Static397.aClass12_345 = null;
															return true;
														}
														for (local552 = 0; local552 < Static175.anInt5411 && (!Static345.aClass152Array1[local552].aString53.equals(local521) || local407 != Static345.aClass152Array1[local552].anInt3933); local552++) {
														}
														if (Static175.anInt5411 > local552) {
															while (Static175.anInt5411 - 1 > local552) {
																Static345.aClass152Array1[local552] = Static345.aClass152Array1[local552 + 1];
																local552++;
															}
															Static175.anInt5411--;
															Static345.aClass152Array1[Static175.anInt5411] = null;
														}
													} else {
														local2529 = Static116.aClass1_Sub14_Sub2_1.method4509();
														local2746 = new Class152();
														local2746.aString56 = local517;
														local2746.aString53 = local521;
														local2746.aString54 = Static305.method4200(local2746.aString53);
														local2746.anInt3933 = local407;
														local2746.aString55 = local2529;
														local2746.aByte57 = local2657;
														for (local2226 = Static175.anInt5411 - 1; local2226 >= 0; local2226--) {
															local2781 = Static345.aClass152Array1[local2226].aString54.compareTo(local2746.aString54);
															if (local2781 == 0) {
																Static345.aClass152Array1[local2226].anInt3933 = local407;
																Static345.aClass152Array1[local2226].aByte57 = local2657;
																Static345.aClass152Array1[local2226].aString55 = local2529;
																if (local521.equals(Static255.aClass47_Sub1_Sub5_Sub2_2.aString66)) {
																	Static315.aByte81 = local2657;
																}
																Static397.aClass12_345 = null;
																Static452.anInt7791 = Static270.anInt2350;
																return true;
															}
															if (local2781 < 0) {
																break;
															}
														}
														if (Static175.anInt5411 >= Static345.aClass152Array1.length) {
															Static397.aClass12_345 = null;
															return true;
														}
														for (local2781 = Static175.anInt5411 - 1; local2781 > local2226; local2781--) {
															Static345.aClass152Array1[local2781 + 1] = Static345.aClass152Array1[local2781];
														}
														if (Static175.anInt5411 == 0) {
															Static345.aClass152Array1 = new Class152[100];
														}
														Static345.aClass152Array1[local2226 + 1] = local2746;
														Static175.anInt5411++;
														if (local521.equals(Static255.aClass47_Sub1_Sub5_Sub2_2.aString66)) {
															Static315.aByte81 = local2657;
														}
													}
													Static397.aClass12_345 = null;
													Static452.anInt7791 = Static270.anInt2350;
													return true;
												} else if (Static406.aClass12_348 == Static397.aClass12_345) {
													Static18.method241(Static112.aClass60_5);
													Static397.aClass12_345 = null;
													return true;
												} else if (Static156.aClass12_150 == Static397.aClass12_345) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
													local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
													local233 = Static116.aClass1_Sub14_Sub2_1.method4500();
													local407 = Static116.aClass1_Sub14_Sub2_1.method4499();
													if (Static365.method5201(local70)) {
														Static399.method5473(local233, local407 + (local225 << 16));
													}
													Static397.aClass12_345 = null;
													return true;
												} else if (Static304.aClass12_264 == Static397.aClass12_345) {
													Static18.method241(Static238.aClass60_11);
													Static397.aClass12_345 = null;
													return true;
												} else if (Static250.aClass12_215 == Static397.aClass12_345) {
													Static18.method241(Static327.aClass60_14);
													Static397.aClass12_345 = null;
													return true;
												} else if (Static405.aClass12_347 == Static397.aClass12_345) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4499();
													local225 = Static116.aClass1_Sub14_Sub2_1.method4491();
													if (Static365.method5201(local70)) {
														Static256.anInt4402 = local225;
													}
													Static397.aClass12_345 = null;
													return true;
												} else if (Static397.aClass12_345 == Static275.aClass12_234) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
													if (local70 == 65535) {
														local70 = -1;
													}
													local225 = Static116.aClass1_Sub14_Sub2_1.method4548();
													local233 = Static116.aClass1_Sub14_Sub2_1.method4498();
													local407 = Static116.aClass1_Sub14_Sub2_1.method4548();
													Static110.method1735(local225, local233, local70, local407);
													Static397.aClass12_345 = null;
													return true;
												} else if (Static397.aClass12_345 == Static75.aClass12_88) {
													Static400.method5477();
													Static397.aClass12_345 = null;
													return false;
												} else if (Static397.aClass12_345 == Static359.aClass12_316) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4548();
													@Pc(3021) boolean local3021 = (local70 & 0x1) == 1;
													local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
													local752 = Static116.aClass1_Sub14_Sub2_1.method4509();
													if (local752.equals("")) {
														local752 = local1189;
													}
													local531 = Static116.aClass1_Sub14_Sub2_1.method4509();
													local788 = Static116.aClass1_Sub14_Sub2_1.method4509();
													if (local788.equals("")) {
														local788 = local531;
													}
													if (local3021) {
														for (local552 = 0; local552 < Static321.anInt5589; local552++) {
															if (Static50.aStringArray7[local552].equals(local788)) {
																Static104.aStringArray14[local552] = local1189;
																Static50.aStringArray7[local552] = local752;
																Static49.aStringArray5[local552] = local531;
																Static156.aStringArray18[local552] = local788;
																break;
															}
														}
													} else {
														Static104.aStringArray14[Static321.anInt5589] = local1189;
														Static50.aStringArray7[Static321.anInt5589] = local752;
														Static49.aStringArray5[Static321.anInt5589] = local531;
														Static156.aStringArray18[Static321.anInt5589] = local788;
														Static340.aBooleanArray22[Static321.anInt5589] = (local70 & 0x2) == 2;
														Static321.anInt5589++;
													}
													Static238.anInt4203 = Static270.anInt2350;
													Static397.aClass12_345 = null;
													return true;
												} else if (Static397.aClass12_345 == Static304.aClass12_263) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4548();
													if (Static116.aClass1_Sub14_Sub2_1.method4548() == 0) {
														Static383.aClass120Array3[local70] = new Class120();
													} else {
														Static116.aClass1_Sub14_Sub2_1.anInt5695--;
														Static383.aClass120Array3[local70] = new Class120(Static116.aClass1_Sub14_Sub2_1);
													}
													Static397.aClass12_345 = null;
													Static434.anInt7554 = Static270.anInt2350;
													return true;
												} else if (Static439.aClass12_383 == Static397.aClass12_345) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4528();
													local225 = Static116.aClass1_Sub14_Sub2_1.method4499();
													local233 = Static116.aClass1_Sub14_Sub2_1.method4533();
													if (local233 == 65535) {
														local233 = -1;
													}
													local407 = Static116.aClass1_Sub14_Sub2_1.method4518();
													local917 = Static116.aClass1_Sub14_Sub2_1.method4533();
													if (local917 == 65535) {
														local917 = -1;
													}
													if (Static365.method5201(local407)) {
														for (local1394 = local917; local1394 <= local233; local1394++) {
															local1610 = ((long) local70 << 32) + ((long) local1394);
															local1616 = (Class1_Sub7) Static402.aClass51_37.method930(local1610);
															if (local1616 != null) {
																local1627 = new Class1_Sub7(local1616.anInt1143, local225);
																local1616.method5965();
															} else if (local1394 == -1) {
																local1627 = new Class1_Sub7(Static203.method1670(local70).aClass1_Sub7_4.anInt1143, local225);
															} else {
																local1627 = new Class1_Sub7(0, local225);
															}
															Static402.aClass51_37.method931(local1627, local1610);
														}
													}
													Static397.aClass12_345 = null;
													return true;
												} else if (Static334.aClass12_292 == Static397.aClass12_345) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4499();
													local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
													local233 = Static116.aClass1_Sub14_Sub2_1.method4503();
													local407 = Static116.aClass1_Sub14_Sub2_1.method4519();
													if (Static365.method5201(local70)) {
														Static279.method5853(5, local407, local233, local225);
													}
													Static397.aClass12_345 = null;
													return true;
												} else if (Static397.aClass12_345 == Static428.aClass12_367) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4528();
													local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
													Static237.aClass80_1.method1616(local225, local70);
													Static397.aClass12_345 = null;
													return true;
												} else if (Static397.aClass12_345 == Static310.aClass12_274) {
													Static325.anInt5773 = Static116.aClass1_Sub14_Sub2_1.method4531();
													Static392.anInt7048 = Static270.anInt2350;
													Static397.aClass12_345 = null;
													return true;
												} else if (Static381.aClass12_29 == Static397.aClass12_345) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4499();
													if (local70 == 65535) {
														local70 = -1;
													}
													local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
													local233 = Static116.aClass1_Sub14_Sub2_1.method4519();
													if (Static365.method5201(local225)) {
														Static279.method5853(2, local233, -1, local70);
													}
													Static397.aClass12_345 = null;
													return true;
												} else if (Static397.aClass12_345 == Static268.aClass12_230) {
													Static261.method3691();
													Static397.aClass12_345 = null;
													return false;
												} else if (Static397.aClass12_345 == Static233.aClass12_209) {
													Static452.anInt7791 = Static270.anInt2350;
													if (Static282.anInt4732 == 0) {
														Static397.aClass12_345 = null;
														Static175.anInt5411 = 0;
														Static6.aString2 = null;
														Static96.aString37 = null;
														Static345.aClass152Array1 = null;
														return true;
													}
													Static6.aString2 = Static116.aClass1_Sub14_Sub2_1.method4509();
													local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
													if (local2310) {
														Static116.aClass1_Sub14_Sub2_1.method4509();
													}
													@Pc(3423) long local3423 = Static116.aClass1_Sub14_Sub2_1.method4547();
													Static96.aString37 = Static138.method5724(local3423);
													Static245.aByte63 = Static116.aClass1_Sub14_Sub2_1.method4529();
													local407 = Static116.aClass1_Sub14_Sub2_1.method4548();
													if (local407 == 255) {
														Static397.aClass12_345 = null;
														return true;
													}
													Static175.anInt5411 = local407;
													@Pc(3449) Class152[] local3449 = new Class152[100];
													for (local1394 = 0; local1394 < Static175.anInt5411; local1394++) {
														local3449[local1394] = new Class152();
														local3449[local1394].aString56 = Static116.aClass1_Sub14_Sub2_1.method4509();
														local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
														if (local2310) {
															local3449[local1394].aString53 = Static116.aClass1_Sub14_Sub2_1.method4509();
														} else {
															local3449[local1394].aString53 = local3449[local1394].aString56;
														}
														local3449[local1394].aString54 = Static305.method4200(local3449[local1394].aString53);
														local3449[local1394].anInt3933 = Static116.aClass1_Sub14_Sub2_1.method4498();
														local3449[local1394].aByte57 = Static116.aClass1_Sub14_Sub2_1.method4529();
														local3449[local1394].aString55 = Static116.aClass1_Sub14_Sub2_1.method4509();
														if (local3449[local1394].aString53.equals(Static255.aClass47_Sub1_Sub5_Sub2_2.aString66)) {
															Static315.aByte81 = local3449[local1394].aByte57;
														}
													}
													local2226 = Static175.anInt5411;
													while (local2226 > 0) {
														local2226--;
														@Pc(3551) boolean local3551 = true;
														for (local2781 = 0; local2781 < local2226; local2781++) {
															if (local3449[local2781].aString54.compareTo(local3449[local2781 + 1].aString54) > 0) {
																local2746 = local3449[local2781];
																local3449[local2781] = local3449[local2781 + 1];
																local3449[local2781 + 1] = local2746;
																local3551 = false;
															}
														}
														if (local3551) {
															break;
														}
													}
													Static345.aClass152Array1 = local3449;
													Static397.aClass12_345 = null;
													return true;
												} else if (Static27.aClass12_31 == Static397.aClass12_345) {
													local70 = Static116.aClass1_Sub14_Sub2_1.method4528();
													local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
													local233 = Static116.aClass1_Sub14_Sub2_1.method4499();
													if (Static365.method5201(local225)) {
														Static47.method638(local233, local70);
													}
													Static397.aClass12_345 = null;
													return true;
												} else {
													@Pc(3675) long local3675;
													if (Static397.aClass12_345 == Static367.aClass12_328) {
														local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
														local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
														local1189 = local521;
														if (local2310) {
															local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
														}
														local2327 = Static116.aClass1_Sub14_Sub2_1.method4547();
														local2332 = Static116.aClass1_Sub14_Sub2_1.method4498();
														local3675 = Static116.aClass1_Sub14_Sub2_1.method4496();
														local2781 = Static116.aClass1_Sub14_Sub2_1.method4548();
														@Pc(3685) long local3685 = (local2332 << 32) + local3675;
														@Pc(3687) boolean local3687 = false;
														@Pc(3689) int local3689 = 0;
														while (true) {
															if (local3689 >= 100) {
																if (local2781 <= 1) {
																	if (Static406.aBoolean595 && !Static151.aBoolean219 || Static195.aBoolean276) {
																		local3687 = true;
																	} else if (Static206.method3152(local1189)) {
																		local3687 = true;
																	}
																}
																break;
															}
															if (Static183.aLongArray3[local3689] == local3685) {
																local3687 = true;
																break;
															}
															local3689++;
														}
														if (!local3687 && Static266.anInt7428 == 0) {
															Static183.aLongArray3[Static94.anInt1810] = local3685;
															Static94.anInt1810 = (Static94.anInt1810 + 1) % 100;
															@Pc(3747) String local3747 = Static418.method5658(Static161.method2527(Static116.aClass1_Sub14_Sub2_1));
															if (local2781 == 2 || local2781 == 3) {
																Static165.method3932("<img=1>" + local521, -1, "<img=1>" + local1189, 0, Static185.method2957(local2327), local3747, 9);
															} else if (local2781 == 1) {
																Static165.method3932("<img=0>" + local521, -1, "<img=0>" + local1189, 0, Static185.method2957(local2327), local3747, 9);
															} else {
																Static165.method3932(local521, -1, local1189, 0, Static185.method2957(local2327), local3747, 9);
															}
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static433.aClass12_371 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4528();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
														Static237.aClass80_1.method1617(local225, local70);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static164.aClass12_156 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4548();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4494();
														local233 = Static116.aClass1_Sub14_Sub2_1.method4528();
														Static153.anIntArray363[local225] = local233;
														Static357.anIntArray477[local225] = local70;
														Static82.anIntArray73[local225] = 1;
														local407 = Static232.anIntArray315[local225] - 1;
														for (local917 = 0; local917 < local407; local917++) {
															if (Class3.anIntArray1[local917] <= local233) {
																Static82.anIntArray73[local225] = local917 + 2;
															}
														}
														Static401.anIntArray527[Static332.anInt6038++ & 0x1F] = local225;
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static230.aClass12_207) {
														Static18.method241(Static409.aClass60_18);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static265.aClass12_226 == Static397.aClass12_345) {
														Static407.anInt7191 = Static116.aClass1_Sub14_Sub2_1.method4491();
														Static52.anInt922 = Static116.aClass1_Sub14_Sub2_1.method4524();
														Static397.aClass12_345 = null;
														return true;
													} else if (Static39.aClass12_45 == Static397.aClass12_345) {
														local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
														local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
														local1189 = local521;
														if (local2310) {
															local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
														}
														local407 = Static116.aClass1_Sub14_Sub2_1.method4548();
														@Pc(3968) boolean local3968 = false;
														if (local407 <= 1) {
															if (Static406.aBoolean595 && !Static151.aBoolean219 || Static195.aBoolean276) {
																local3968 = true;
															} else if (local407 <= 1 && Static206.method3152(local1189)) {
																local3968 = true;
															}
														}
														if (!local3968 && Static266.anInt7428 == 0) {
															local788 = Static418.method5658(Static161.method2527(Static116.aClass1_Sub14_Sub2_1));
															if (local407 == 2) {
																Static165.method3932("<img=1>" + local521, -1, "<img=1>" + local1189, 0, null, local788, 24);
															} else if (local407 == 1) {
																Static165.method3932("<img=0>" + local521, -1, "<img=0>" + local1189, 0, null, local788, 24);
															} else {
																Static165.method3932(local521, -1, local1189, 0, null, local788, 24);
															}
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static326.aClass12_287 == Static397.aClass12_345) {
														local517 = Static116.aClass1_Sub14_Sub2_1.method4509();
														local521 = Static418.method5658(Static161.method2527(Static116.aClass1_Sub14_Sub2_1));
														Static179.method2890(6, local521, 0, local517, local517);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static265.aClass12_227) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4548();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4524();
														if (local225 == 255) {
															local225 = -1;
															local70 = -1;
														}
														Static365.method5202(local225, local70);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static150.aClass12_140 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4494();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
														local1808 = (local70 & 0x1) == 1;
														Static102.method1636(local1808, local225);
														Static118.anIntArray119[Static151.anInt2727++ & 0x1F] = local225;
														Static397.aClass12_345 = null;
														return true;
													} else if (Static216.aClass12_198 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4503();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
														local233 = Static116.aClass1_Sub14_Sub2_1.method4518();
														if (Static365.method5201(local233)) {
															Static83.method3989(local225, local70);
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static291.aClass12_388) {
														Static18.method241(Static158.aClass60_6);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static331.aClass12_291) {
														local517 = Static116.aClass1_Sub14_Sub2_1.method4509();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
														local233 = Static116.aClass1_Sub14_Sub2_1.method4498();
														if (Static365.method5201(local233)) {
															Static141.method2267(local225, local517);
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static51.aClass12_61 == Static397.aClass12_345) {
														Static18.method241(Static446.aClass60_20);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static364.aClass12_323) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4533();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
														local233 = Static116.aClass1_Sub14_Sub2_1.method4498();
														if (Static365.method5201(local225)) {
															Static113.method1794(local233, local70);
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static114.aClass12_115) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4500();
														if (Static365.method5201(local70)) {
															@Pc(4288) Class1_Sub38 local4288 = (Class1_Sub38) Static81.aClass51_5.method930((long) local225);
															if (local4288 != null) {
																Static284.method3909(true, false, local4288);
															}
															if (Static405.aClass229_12 != null) {
																Static373.method5289(Static405.aClass229_12);
																Static405.aClass229_12 = null;
															}
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static117.aClass12_116 == Static397.aClass12_345) {
														Static246.method3556();
														Static397.aClass12_345 = null;
														return false;
													} else if (Static397.aClass12_345 == Static404.aClass12_346) {
														local956 = Static116.aClass1_Sub14_Sub2_1.method4552();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
														local233 = Static116.aClass1_Sub14_Sub2_1.method4533();
														if (Static365.method5201(local225)) {
															Static83.method3989(local233, local956);
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static420.aClass12_359 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4533();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
														if (local225 == 65535) {
															local225 = -1;
														}
														local233 = Static116.aClass1_Sub14_Sub2_1.method4528();
														if (Static365.method5201(local70)) {
															Static279.method5853(1, local233, -1, local225);
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static266.aClass12_366) {
														Static225.method3278(false);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static362.aClass12_320 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
														if (Static365.method5201(local70)) {
															Static388.method5640();
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static183.aClass12_178) {
														Static18.method241(Static223.aClass60_9);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static251.aClass12_217) {
														Static378.method5323();
														Static397.aClass12_345 = null;
														return true;
													} else if (Static397.aClass12_345 == Static159.aClass12_153) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4524();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4499();
														if (local225 == 65535) {
															local225 = -1;
														}
														local233 = Static116.aClass1_Sub14_Sub2_1.method4548();
														Static371.method5268(local70, local233, local225);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static251.aClass12_216 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4491();
														local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
														if (local225 == 65535) {
															local225 = -1;
														}
														local233 = Static116.aClass1_Sub14_Sub2_1.method4532();
														Static401.method5478(local70, local225, local233);
														Static397.aClass12_345 = null;
														return true;
													} else if (Static230.aClass12_208 == Static397.aClass12_345) {
														local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
														if (Static365.method5201(local70)) {
															Static242.method3809();
														}
														Static397.aClass12_345 = null;
														return true;
													} else if (Static296.aClass12_256 == Static397.aClass12_345) {
														Static116.aClass1_Sub14_Sub2_1.anInt5695 += 28;
														if (Static116.aClass1_Sub14_Sub2_1.method4546()) {
															Static293.method3993(Static116.aClass1_Sub14_Sub2_1.anInt5695 - 28, Static116.aClass1_Sub14_Sub2_1);
														}
														Static397.aClass12_345 = null;
														return true;
													} else {
														@Pc(4731) int local4731;
														@Pc(4663) int local4663;
														if (Static397.aClass12_345 == Static362.aClass12_319) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4491();
															local225 = Static116.aClass1_Sub14_Sub2_1.method4498();
															local233 = Static116.aClass1_Sub14_Sub2_1.method4518();
															local407 = Static116.aClass1_Sub14_Sub2_1.method4518();
															local917 = Static116.aClass1_Sub14_Sub2_1.method4519();
															local533 = (local70 & 0x80) != 0;
															if (local917 >> 30 == 0) {
																@Pc(4582) boolean local4582;
																@Pc(4608) Class166 local4608;
																@Pc(4660) Class58 local4660;
																@Pc(4613) Class166 local4613;
																@Pc(4627) Class58 local4627;
																@Pc(4633) Class58 local4633;
																if (local917 >> 29 != 0) {
																	local552 = local917 & 0xFFFF;
																	@Pc(4573) Class47_Sub1_Sub5_Sub1 local4573 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local552];
																	if (local4573 != null) {
																		if (local233 == 65535) {
																			local233 = -1;
																		}
																		local4582 = true;
																		local2781 = local533 ? local4573.anInt5392 : local4573.anInt5381;
																		if (local233 != -1 && local2781 != -1) {
																			if (local2781 == local233) {
																				local4608 = Static294.aClass125_2.method2961(local233);
																				if (local4608.aBoolean344 && local4608.anInt4334 != -1) {
																					local4660 = Static322.aClass45_5.method690(local4608.anInt4334);
																					local4663 = local4660.anInt1436;
																					if (local4663 == 0 || local4663 == 2) {
																						local4582 = false;
																					} else if (local4663 == 1) {
																						local4582 = true;
																					}
																				}
																			} else {
																				local4608 = Static294.aClass125_2.method2961(local233);
																				local4613 = Static294.aClass125_2.method2961(local2781);
																				if (local4608.anInt4334 != -1 && local4613.anInt4334 != -1) {
																					local4627 = Static322.aClass45_5.method690(local4608.anInt4334);
																					local4633 = Static322.aClass45_5.method690(local4613.anInt4334);
																					if (local4633.anInt1426 > local4627.anInt1426) {
																						local4582 = false;
																					}
																				}
																			}
																		}
																		if (local4582) {
																			if (local533) {
																				local4573.anInt5349 = 1;
																				local4573.anInt5409 = local70 & 0x7;
																				local4573.anInt5351 = local225;
																				local4573.anInt5392 = local233;
																				local4573.anInt5400 = 0;
																				local4573.anInt5354 = 0;
																				local4573.anInt5360 = local407 + Static123.anInt2333;
																				if (Static123.anInt2333 < local4573.anInt5360) {
																					local4573.anInt5400 = -1;
																				}
																				if (local4573.anInt5392 != -1 && local4573.anInt5360 == Static123.anInt2333) {
																					local4731 = Static294.aClass125_2.method2961(local4573.anInt5392).anInt4334;
																					if (local4731 != -1) {
																						local4660 = Static322.aClass45_5.method690(local4731);
																						if (local4660 != null && local4660.anIntArray65 != null) {
																							Static385.method5367(local4573.aByte97, local4573.anInt7066, 0, local4660, false, local4573.anInt7060);
																						}
																					}
																				}
																			} else {
																				local4573.anInt5374 = 0;
																				local4573.anInt5345 = 1;
																				local4573.anInt5412 = Static123.anInt2333 + local407;
																				local4573.anInt5382 = 0;
																				local4573.anInt5381 = local233;
																				local4573.anInt5401 = local70 & 0x7;
																				local4573.lb = local225;
																				if (local4573.anInt5412 > Static123.anInt2333) {
																					local4573.anInt5382 = -1;
																				}
																				if (local4573.anInt5381 != -1 && local4573.anInt5412 == Static123.anInt2333) {
																					local4731 = Static294.aClass125_2.method2961(local4573.anInt5381).anInt4334;
																					if (local4731 != -1) {
																						local4660 = Static322.aClass45_5.method690(local4731);
																						if (local4660 != null && local4660.anIntArray65 != null) {
																							Static385.method5367(local4573.aByte97, local4573.anInt7066, 0, local4660, false, local4573.anInt7060);
																						}
																					}
																				}
																			}
																		}
																	}
																} else if (local917 >> 28 != 0) {
																	local552 = local917 & 0xFFFF;
																	@Pc(4861) Class47_Sub1_Sub5_Sub2 local4861;
																	if (local552 == Static179.anInt3373) {
																		local4861 = Static255.aClass47_Sub1_Sub5_Sub2_2;
																	} else {
																		local4861 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local552];
																	}
																	if (local4861 != null) {
																		if (local233 == 65535) {
																			local233 = -1;
																		}
																		local4582 = true;
																		local2781 = local533 ? local4861.anInt5392 : local4861.anInt5381;
																		if (local233 != -1 && local2781 != -1) {
																			if (local2781 == local233) {
																				local4608 = Static294.aClass125_2.method2961(local233);
																				if (local4608.aBoolean344 && local4608.anInt4334 != -1) {
																					local4660 = Static322.aClass45_5.method690(local4608.anInt4334);
																					local4663 = local4660.anInt1436;
																					if (local4663 == 0 || local4663 == 2) {
																						local4582 = false;
																					} else if (local4663 == 1) {
																						local4582 = true;
																					}
																				}
																			} else {
																				local4608 = Static294.aClass125_2.method2961(local233);
																				local4613 = Static294.aClass125_2.method2961(local2781);
																				if (local4608.anInt4334 != -1 && local4613.anInt4334 != -1) {
																					local4627 = Static322.aClass45_5.method690(local4608.anInt4334);
																					local4633 = Static322.aClass45_5.method690(local4613.anInt4334);
																					if (local4633.anInt1426 > local4627.anInt1426) {
																						local4582 = false;
																					}
																				}
																			}
																		}
																		if (local4582) {
																			if (local533) {
																				local4861.anInt5392 = local233;
																				local4861.anInt5351 = local225;
																				local4861.anInt5349 = 1;
																				local4861.anInt5354 = 0;
																				local4861.anInt5400 = 0;
																				local4861.anInt5409 = local70 & 0x7;
																				local4861.anInt5360 = Static123.anInt2333 + local407;
																				if (local4861.anInt5392 == 65535) {
																					local4861.anInt5392 = -1;
																				}
																				if (Static123.anInt2333 < local4861.anInt5360) {
																					local4861.anInt5400 = -1;
																				}
																				if (local4861.anInt5392 != -1 && Static123.anInt2333 == local4861.anInt5360) {
																					local4731 = Static294.aClass125_2.method2961(local4861.anInt5392).anInt4334;
																					if (local4731 != -1) {
																						local4660 = Static322.aClass45_5.method690(local4731);
																						if (local4660 != null && local4660.anIntArray65 != null) {
																							Static385.method5367(local4861.aByte97, local4861.anInt7066, 0, local4660, Static255.aClass47_Sub1_Sub5_Sub2_2 == local4861, local4861.anInt7060);
																						}
																					}
																				}
																			} else {
																				local4861.anInt5345 = 1;
																				local4861.anInt5382 = 0;
																				local4861.anInt5401 = local70 & 0x7;
																				local4861.anInt5381 = local233;
																				local4861.anInt5374 = 0;
																				local4861.anInt5412 = local407 + Static123.anInt2333;
																				local4861.lb = local225;
																				if (Static123.anInt2333 < local4861.anInt5412) {
																					local4861.anInt5382 = -1;
																				}
																				if (local4861.anInt5381 == 65535) {
																					local4861.anInt5381 = -1;
																				}
																				if (local4861.anInt5381 != -1 && Static123.anInt2333 == local4861.anInt5412) {
																					local4731 = Static294.aClass125_2.method2961(local4861.anInt5381).anInt4334;
																					if (local4731 != -1) {
																						local4660 = Static322.aClass45_5.method690(local4731);
																						if (local4660 != null && local4660.anIntArray65 != null) {
																							Static385.method5367(local4861.aByte97, local4861.anInt7066, 0, local4660, Static255.aClass47_Sub1_Sub5_Sub2_2 == local4861, local4861.anInt7060);
																						}
																					}
																				}
																			}
																		}
																	}
																}
															} else {
																local552 = local917 >> 28 & 0x3;
																local2218 = (local917 >> 14 & 0x3FFF) - Static190.anInt3507;
																local2226 = (local917 & 0x3FFF) - Static331.anInt6034;
																if (local2218 >= 0 && local2226 >= 0 && local2218 < Static80.anInt6558 && local2226 < Static104.anInt2048) {
																	local2781 = local2218 * 128 + 64;
																	local4731 = local2226 * 128 + 64;
																	local2347 = local552;
																	if (local552 < 3 && Static195.method3034(local2218, local2226)) {
																		local2347 = local552 + 1;
																	}
																	@Pc(5243) Class47_Sub1_Sub3 local5243 = new Class47_Sub1_Sub3(local233, 0, Static123.anInt2333, local552, local2347, local2781, Static405.method5510(local4731, local2781, local552) - local225, local4731, local2218, local2218, local2226, local2226, local70);
																	Static111.aClass142_14.method3212(new Class1_Sub1_Sub18(local5243));
																}
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static397.aClass12_345 == Static454.aClass12_390) {
															Static18.method241(Static235.aClass60_10);
															Static397.aClass12_345 = null;
															return true;
														} else if (Static310.aClass12_275 == Static397.aClass12_345) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4500();
															local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
															local233 = Static116.aClass1_Sub14_Sub2_1.method4494();
															local407 = Static116.aClass1_Sub14_Sub2_1.method4518();
															if (Static365.method5201(local225)) {
																local1701 = (Class1_Sub38) Static81.aClass51_5.method930((long) local70);
																if (local1701 != null) {
																	Static284.method3909(local407 != local1701.anInt6527, false, local1701);
																}
																Static345.method4974(false, local70, local233, local407);
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static33.aClass12_41 == Static397.aClass12_345) {
															Static321.anInt5589 = Static116.aClass1_Sub14_Sub2_1.method4548();
															for (local70 = 0; local70 < Static321.anInt5589; local70++) {
																Static104.aStringArray14[local70] = Static116.aClass1_Sub14_Sub2_1.method4509();
																Static50.aStringArray7[local70] = Static116.aClass1_Sub14_Sub2_1.method4509();
																if (Static50.aStringArray7[local70].equals("")) {
																	Static50.aStringArray7[local70] = Static104.aStringArray14[local70];
																}
																Static49.aStringArray5[local70] = Static116.aClass1_Sub14_Sub2_1.method4509();
																Static156.aStringArray18[local70] = Static116.aClass1_Sub14_Sub2_1.method4509();
																if (Static156.aStringArray18[local70].equals("")) {
																	Static156.aStringArray18[local70] = Static49.aStringArray5[local70];
																}
																Static340.aBooleanArray22[local70] = false;
															}
															Static397.aClass12_345 = null;
															Static238.anInt4203 = Static270.anInt2350;
															return true;
														} else if (Static397.aClass12_345 == Static41.aClass12_52) {
															if (Static432.aFrame2 != null) {
																Static230.method3353(-1, false, -1, Static327.aClass230_Sub1_1.anInt7301);
															}
															@Pc(5410) byte[] local5410 = new byte[Static282.anInt4732];
															Static116.aClass1_Sub14_Sub2_1.method4569(Static282.anInt4732, local5410);
															local521 = Static332.method4783(0, local5410, Static282.anInt4732);
															Static35.method478(local521, true, Static403.aClass42_6, Static146.anInt2664 == 1);
															Static397.aClass12_345 = null;
															return true;
														} else if (Static291.aClass12_389 == Static397.aClass12_345) {
															Static300.anInt5014 = Static116.aClass1_Sub14_Sub2_1.method4548();
															Static392.anInt7048 = Static270.anInt2350;
															Static397.aClass12_345 = null;
															return true;
														} else if (Static62.aClass12_69 == Static397.aClass12_345) {
															Static18.method241(Static73.aClass60_3);
															Static397.aClass12_345 = null;
															return true;
														} else if (Static397.aClass12_345 == Static337.aClass12_296) {
															Static18.method241(Static87.aClass60_13);
															Static397.aClass12_345 = null;
															return true;
														} else if (Static237.aClass12_212 == Static397.aClass12_345) {
															Static221.anInt7650 = Static116.aClass1_Sub14_Sub2_1.method4529() << 3;
															Static90.anInt1739 = Static116.aClass1_Sub14_Sub2_1.method4552() << 3;
															Static316.anInt5491 = Static116.aClass1_Sub14_Sub2_1.method4494();
															Static397.aClass12_345 = null;
															return true;
														} else if (Static397.aClass12_345 == Static140.aClass12_130) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
															local225 = Static116.aClass1_Sub14_Sub2_1.method4548();
															local1808 = (local225 & 0x1) == 1;
															while (Static282.anInt4732 > Static116.aClass1_Sub14_Sub2_1.anInt5695) {
																local407 = Static116.aClass1_Sub14_Sub2_1.method4521();
																local917 = Static116.aClass1_Sub14_Sub2_1.method4498();
																local1394 = 0;
																if (local917 != 0) {
																	local1394 = Static116.aClass1_Sub14_Sub2_1.method4548();
																	if (local1394 == 255) {
																		local1394 = Static116.aClass1_Sub14_Sub2_1.method4500();
																	}
																}
																Static165.method3940(local917 - 1, local407, local1394, local70, local1808);
															}
															Static118.anIntArray119[Static151.anInt2727++ & 0x1F] = local70;
															Static397.aClass12_345 = null;
															return true;
														} else if (Static307.aClass12_272 == Static397.aClass12_345) {
															local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
															local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
															local1189 = local521;
															if (local2310) {
																local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
															}
															local2327 = Static116.aClass1_Sub14_Sub2_1.method4547();
															local2332 = Static116.aClass1_Sub14_Sub2_1.method4498();
															local3675 = Static116.aClass1_Sub14_Sub2_1.method4496();
															local2781 = Static116.aClass1_Sub14_Sub2_1.method4548();
															local4731 = Static116.aClass1_Sub14_Sub2_1.method4498();
															@Pc(5630) long local5630 = (local2332 << 32) + local3675;
															@Pc(5632) boolean local5632 = false;
															@Pc(5634) int local5634 = 0;
															while (true) {
																if (local5634 >= 100) {
																	if (local2781 <= 1 && Static206.method3152(local1189)) {
																		local5632 = true;
																	}
																	break;
																}
																if (Static183.aLongArray3[local5634] == local5630) {
																	local5632 = true;
																	break;
																}
																local5634++;
															}
															if (!local5632 && Static266.anInt7428 == 0) {
																Static183.aLongArray3[Static94.anInt1810] = local5630;
																Static94.anInt1810 = (Static94.anInt1810 + 1) % 100;
																@Pc(5686) String local5686 = Static42.aClass228_5.method5369(local4731).method775(Static116.aClass1_Sub14_Sub2_1);
																if (local2781 == 2) {
																	Static165.method3932("<img=1>" + local521, local4731, "<img=1>" + local1189, 0, Static185.method2957(local2327), local5686, 20);
																} else if (local2781 == 1) {
																	Static165.method3932("<img=0>" + local521, local4731, "<img=0>" + local1189, 0, Static185.method2957(local2327), local5686, 20);
																} else {
																	Static165.method3932(local521, local4731, local1189, 0, Static185.method2957(local2327), local5686, 20);
																}
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static184.aClass12_179 == Static397.aClass12_345) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4500();
															local225 = Static116.aClass1_Sub14_Sub2_1.method4533();
															if (local225 == 65535) {
																local225 = -1;
															}
															local233 = Static116.aClass1_Sub14_Sub2_1.method4533();
															local407 = Static116.aClass1_Sub14_Sub2_1.method4519();
															if (Static365.method5201(local233)) {
																Static222.method3257(local70, local225, local407);
																@Pc(5801) Class206 local5801 = Static388.aClass193_3.method4249(local225);
																Static389.method5448(local5801.anInt6288, local5801.anInt6310, local5801.anInt6313, local70);
																Static373.method5286(local5801.anInt6290, local5801.anInt6331, local5801.anInt6302, local70);
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static25.aClass12_25 == Static397.aClass12_345) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4533();
															local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
															local233 = Static116.aClass1_Sub14_Sub2_1.method4499();
															if (Static365.method5201(local70)) {
																Static141.method2267(local233, local521);
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static397.aClass12_345 == Static381.aClass12_28) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
															local225 = Static116.aClass1_Sub14_Sub2_1.method4548();
															local233 = Static116.aClass1_Sub14_Sub2_1.method4548();
															local407 = Static116.aClass1_Sub14_Sub2_1.method4498() << 0;
															local917 = Static116.aClass1_Sub14_Sub2_1.method4548();
															local1394 = Static116.aClass1_Sub14_Sub2_1.method4548();
															if (Static365.method5201(local70)) {
																Static420.method5675(local1394, local407, local233, local225, local917);
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static31.aClass12_38 == Static397.aClass12_345) {
															Static53.method782(Static116.aClass1_Sub14_Sub2_1.method4509());
															Static397.aClass12_345 = null;
															return true;
														} else if (Static397.aClass12_345 == Static73.aClass12_86) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4519();
															local225 = Static116.aClass1_Sub14_Sub2_1.method4518();
															local233 = Static116.aClass1_Sub14_Sub2_1.method4518();
															local407 = Static116.aClass1_Sub14_Sub2_1.method4498();
															local917 = Static116.aClass1_Sub14_Sub2_1.method4533();
															if (Static365.method5201(local225)) {
																Static279.method5853(7, local70, local917, local233 << 16 | local407);
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static216.aClass12_199 == Static397.aClass12_345) {
															Static399.aString85 = Static282.anInt4732 > 2 ? Static116.aClass1_Sub14_Sub2_1.method4509() : Static3.aClass96_1.method1935(Static389.anInt7061);
															Static348.anInt6362 = Static282.anInt4732 > 0 ? Static116.aClass1_Sub14_Sub2_1.method4498() : -1;
															if (Static348.anInt6362 == 65535) {
																Static348.anInt6362 = -1;
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static165.aClass12_246 == Static397.aClass12_345) {
															local70 = Static116.aClass1_Sub14_Sub2_1.method4498();
															local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
															@Pc(5998) Object[] local5998 = new Object[local521.length() + 1];
															for (local407 = local521.length() - 1; local407 >= 0; local407--) {
																if (local521.charAt(local407) == 's') {
																	local5998[local407 + 1] = Static116.aClass1_Sub14_Sub2_1.method4509();
																} else {
																	local5998[local407 + 1] = Integer.valueOf(Static116.aClass1_Sub14_Sub2_1.method4500());
																}
															}
															local5998[0] = Integer.valueOf(Static116.aClass1_Sub14_Sub2_1.method4500());
															if (Static365.method5201(local70)) {
																@Pc(6056) Class1_Sub16 local6056 = new Class1_Sub16();
																local6056.anObjectArray1 = local5998;
																Static354.method5070(local6056);
															}
															Static397.aClass12_345 = null;
															return true;
														} else if (Static119.aClass12_122 == Static397.aClass12_345) {
															local2310 = Static116.aClass1_Sub14_Sub2_1.method4548() == 1;
															local521 = Static116.aClass1_Sub14_Sub2_1.method4509();
															local1189 = local521;
															if (local2310) {
																local1189 = Static116.aClass1_Sub14_Sub2_1.method4509();
															}
															local2327 = Static116.aClass1_Sub14_Sub2_1.method4498();
															local2332 = Static116.aClass1_Sub14_Sub2_1.method4496();
															local2218 = Static116.aClass1_Sub14_Sub2_1.method4548();
															local2226 = Static116.aClass1_Sub14_Sub2_1.method4498();
															@Pc(6114) long local6114 = (local2327 << 32) + local2332;
															@Pc(6116) boolean local6116 = false;
															local4663 = 0;
															while (true) {
																if (local4663 >= 100) {
																	if (local2218 <= 1 && Static206.method3152(local1189)) {
																		local6116 = true;
																	}
																	break;
																}
																if (Static183.aLongArray3[local4663] == local6114) {
																	local6116 = true;
																	break;
																}
																local4663++;
															}
															if (!local6116 && Static266.anInt7428 == 0) {
																Static183.aLongArray3[Static94.anInt1810] = local6114;
																Static94.anInt1810 = (Static94.anInt1810 + 1) % 100;
																@Pc(6170) String local6170 = Static42.aClass228_5.method5369(local2226).method775(Static116.aClass1_Sub14_Sub2_1);
																if (local2218 == 2) {
																	Static165.method3932("<img=1>" + local521, local2226, "<img=1>" + local1189, 0, null, local6170, 18);
																} else if (local2218 == 1) {
																	Static165.method3932("<img=0>" + local521, local2226, "<img=0>" + local1189, 0, null, local6170, 18);
																} else {
																	Static165.method3932(local521, local2226, local1189, 0, null, local6170, 18);
																}
															}
															Static397.aClass12_345 = null;
															return true;
														} else {
															Static101.method1630("T1 - " + (Static397.aClass12_345 == null ? -1 : Static397.aClass12_345.method235()) + "," + (Static84.aClass12_300 == null ? -1 : Static84.aClass12_300.method235()) + "," + (Static133.aClass12_129 == null ? -1 : Static133.aClass12_129.method235()) + " - " + Static282.anInt4732, null);
															Static261.method3691();
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

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	public static void method2637(@OriginalArg(0) int arg0) {
		if (Static40.anInt629 == arg0) {
			return;
		}
		if (Static40.anInt629 == 0) {
			Static435.method4777();
		}
		if (arg0 == 40) {
			Static168.method2629();
		}
		if (arg0 != 40 && Static261.aClass114_6 != null) {
			Static261.aClass114_6.method2496();
			Static261.aClass114_6 = null;
		}
		if (Static40.anInt629 == 25 || Static40.anInt629 == 28) {
			Static225.aClass109_57.anInt2631 = 2;
			Static221.aClass109_98.anInt2631 = 2;
			Static134.aClass109_35.anInt2631 = 2;
			Static131.aClass109_31.anInt2631 = 2;
			Static388.aClass109_94.anInt2631 = 2;
			Static200.aClass109_53.anInt2631 = 2;
			Static173.aClass109_42.anInt2631 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static374.anInt6752 = 1;
			Static43.anInt678 = 0;
			Static442.anInt7684 = 0;
			Static177.anInt3316 = 1;
			Static373.anInt6744 = 0;
			Static84.method4897(true);
			Static225.aClass109_57.anInt2631 = 1;
			Static221.aClass109_98.anInt2631 = 1;
			Static134.aClass109_35.anInt2631 = 1;
			Static131.aClass109_31.anInt2631 = 1;
			Static388.aClass109_94.anInt2631 = 1;
			Static200.aClass109_53.anInt2631 = 1;
			Static173.aClass109_42.anInt2631 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static443.method5920();
		}
		if (arg0 == 5) {
			Static234.method3398(Static447.aClass121_11, Static353.aClass109_79);
		} else {
			Static378.method5325();
		}
		@Pc(135) boolean local135 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(155) boolean local155 = Static40.anInt629 == 5 || Static40.anInt629 == 10 || Static40.anInt629 == 28;
		if (local135 != local155) {
			if (local135) {
				Static274.anInt4619 = Static87.anInt5504;
				if (Static327.aClass230_Sub1_1.anInt7311 == 0) {
					Static404.method5494();
				} else {
					Static349.method4993(Static297.aClass109_69, Static87.anInt5504, Static327.aClass230_Sub1_1.anInt7311);
				}
				Static125.aClass164_2.method3590(false);
			} else {
				Static404.method5494();
				Static125.aClass164_2.method3590(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static447.aClass121_11.method4631();
		}
		Static40.anInt629 = arg0;
	}
}
