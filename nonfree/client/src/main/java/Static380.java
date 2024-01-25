import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!w", name = "X", descriptor = "Lclient!as;")
	public static Class17 aClass17_1;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_100 = new Class57("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!w", name = "S", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_101 = new Class57("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!w", name = "Y", descriptor = "Lclient!us;")
	public static final Class234 aClass234_130 = new Class234(39, 3);

	@OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
	public static int anInt6377 = -60;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)I")
	public static int method5621(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BLclient!cj;)Ljava/lang/String;")
	public static String method5624(@OriginalArg(1) Class3_Sub4 arg0) {
		return arg0.aString12 == null || arg0.aString12.length() <= 0 ? arg0.aString11 : arg0.aString11 + Static326.aClass57_81.method1122(Static66.anInt1307) + arg0.aString12;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	public static void method5626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg0) {
			Static3.method62(arg3, arg2, arg1, arg4);
		} else if (Static221.anInt3917 <= arg1 - arg2 && arg1 + arg2 <= Static365.anInt6140 && Static26.anInt345 <= arg3 - arg0 && arg0 + arg3 <= Static272.anInt4750) {
			Static4.method82(arg2, arg0, arg3, arg1, arg4);
		} else {
			Static58.method1064(arg1, arg3, arg2, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)Z")
	public static boolean method5627() throws IOException {
		if (Static12.aClass145_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static12.aClass145_2.method3139();
		if (local13 == 0) {
			return false;
		}
		@Pc(67) int local67;
		if (Static296.aClass234_104 == null) {
			if (Static311.aBoolean418) {
				local13--;
				Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 1);
				Static311.aBoolean418 = false;
				Static84.anInt1725++;
			}
			Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
			if (Static26.aClass3_Sub5_Sub1_2.method853()) {
				if (local13 == 0) {
					return false;
				}
				Static12.aClass145_2.method3141(1, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 1);
				local13--;
				Static84.anInt1725++;
			}
			Static311.aBoolean418 = true;
			@Pc(63) Class234[] local63 = Static230.method3808();
			local67 = Static26.aClass3_Sub5_Sub1_2.method855();
			if (local67 < 0 || local67 >= local63.length) {
				throw new IOException("invo:" + local67);
			}
			Static296.aClass234_104 = local63[local67];
			Static203.anInt3616 = Static296.aClass234_104.anInt6004;
		}
		if (Static203.anInt3616 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 1);
			Static203.anInt3616 = Static26.aClass3_Sub5_Sub1_2.aByteArray42[0] & 0xFF;
			Static84.anInt1725++;
			local13--;
		}
		if (Static203.anInt3616 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, 2);
			Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
			local13 -= 2;
			Static203.anInt3616 = Static26.aClass3_Sub5_Sub1_2.method2767();
			Static84.anInt1725 += 2;
		}
		if (Static203.anInt3616 > local13) {
			return false;
		}
		Static26.aClass3_Sub5_Sub1_2.anInt3121 = 0;
		Static12.aClass145_2.method3141(0, Static26.aClass3_Sub5_Sub1_2.aByteArray42, Static203.anInt3616);
		Static84.anInt1725 += Static203.anInt3616;
		Static12.aClass234_6 = Static222.aClass234_79;
		Static152.anInt2774 = 0;
		Static222.aClass234_79 = Static359.aClass234_123;
		Static359.aClass234_123 = Static296.aClass234_104;
		if (Static230.aClass234_84 == Static296.aClass234_104) {
			Static293.method4554(Static256.aClass68_11);
			Static296.aClass234_104 = null;
			return true;
		}
		@Pc(214) int local214;
		@Pc(218) int local218;
		@Pc(201) int local201;
		if (Static296.aClass234_104 == Static343.aClass234_117) {
			local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
			if (local201 == 65535) {
				local201 = -1;
			}
			local67 = Static26.aClass3_Sub5_Sub1_2.method2739();
			local214 = Static26.aClass3_Sub5_Sub1_2.method2767();
			local218 = Static26.aClass3_Sub5_Sub1_2.method2739();
			Static12.method161(local201, local67, local214, local218);
			Static296.aClass234_104 = null;
			return true;
		} else if (Static296.aClass234_104 == Static226.aClass234_80) {
			local201 = Static26.aClass3_Sub5_Sub1_2.method2784();
			local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
			local214 = Static26.aClass3_Sub5_Sub1_2.method2748();
			if (Static305.method4701(local67)) {
				Static69.method1183(local201, local214);
			}
			Static296.aClass234_104 = null;
			return true;
		} else if (Static55.aClass234_23 == Static296.aClass234_104) {
			local201 = Static26.aClass3_Sub5_Sub1_2.method2773();
			local67 = Static26.aClass3_Sub5_Sub1_2.method2739();
			if (local201 == 255) {
				local201 = -1;
				local67 = -1;
			}
			Static390.method5418(local201, local67);
			Static296.aClass234_104 = null;
			return true;
		} else {
			@Pc(296) String local296;
			@Pc(290) String local290;
			if (Static123.aClass234_50 == Static296.aClass234_104) {
				local290 = Static26.aClass3_Sub5_Sub1_2.method2788();
				local296 = Static256.method4150(Static91.method2651(Static26.aClass3_Sub5_Sub1_2));
				Static24.method309(local290, local296, local290, 0, 6);
				Static296.aClass234_104 = null;
				return true;
			} else if (Static65.aClass234_28 == Static296.aClass234_104) {
				Static293.method4554(Static350.aClass68_14);
				Static296.aClass234_104 = null;
				return true;
			} else if (Static56.aClass234_24 == Static296.aClass234_104) {
				if (Static225.aFrame2 != null) {
					Static175.method2696(Static164.aClass154_Sub1_1.anInt6068, -1, false, -1);
				}
				@Pc(332) byte[] local332 = new byte[Static203.anInt3616];
				Static26.aClass3_Sub5_Sub1_2.method857(Static203.anInt3616, local332);
				local296 = Static325.method5005(Static203.anInt3616, local332, 0);
				Static164.method2516(true, Static2.anInt68 == 1, Static61.aClass156_1, local296);
				Static296.aClass234_104 = null;
				return true;
			} else if (Static306.aClass234_107 == Static296.aClass234_104) {
				for (local201 = 0; local201 < Static308.aClass28_Sub1_Sub1_Sub2Array1.length; local201++) {
					if (Static308.aClass28_Sub1_Sub1_Sub2Array1[local201] != null) {
						Static308.aClass28_Sub1_Sub1_Sub2Array1[local201].anInt4314 = -1;
					}
				}
				for (local67 = 0; local67 < Static166.aClass28_Sub1_Sub1_Sub1Array41.length; local67++) {
					if (Static166.aClass28_Sub1_Sub1_Sub1Array41[local67] != null) {
						Static166.aClass28_Sub1_Sub1_Sub1Array41[local67].anInt4314 = -1;
					}
				}
				Static296.aClass234_104 = null;
				return true;
			} else if (Static296.aClass234_104 == Static252.aClass234_89) {
				local290 = Static26.aClass3_Sub5_Sub1_2.method2788();
				local67 = Static26.aClass3_Sub5_Sub1_2.method2735();
				local214 = Static26.aClass3_Sub5_Sub1_2.method2784();
				local218 = Static26.aClass3_Sub5_Sub1_2.method2747();
				if (local218 == 65535) {
					local218 = -1;
				}
				if (local67 >= 1 && local67 <= 8) {
					if (local290.equalsIgnoreCase("null")) {
						local290 = null;
					}
					Static289.aStringArray35[local67 - 1] = local290;
					Static200.anIntArray390[local67 - 1] = local218;
					Static383.aBooleanArray147[local67 - 1] = local214 == 0;
				}
				Static296.aClass234_104 = null;
				return true;
			} else {
				@Pc(513) long local513;
				@Pc(487) boolean local487;
				@Pc(493) String local493;
				@Pc(503) long local503;
				@Pc(508) long local508;
				@Pc(517) int local517;
				if (Static296.aClass234_104 == Static23.aClass234_10) {
					local487 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
					local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
					local493 = local296;
					if (local487) {
						local493 = Static26.aClass3_Sub5_Sub1_2.method2788();
					}
					local503 = Static26.aClass3_Sub5_Sub1_2.method2741();
					local508 = Static26.aClass3_Sub5_Sub1_2.method2767();
					local513 = Static26.aClass3_Sub5_Sub1_2.method2786();
					local517 = Static26.aClass3_Sub5_Sub1_2.method2739();
					@Pc(524) long local524 = (local508 << 32) + local513;
					@Pc(526) boolean local526 = false;
					@Pc(528) int local528 = 0;
					while (true) {
						if (local528 >= 100) {
							if (local517 <= 1) {
								if (Static246.aBoolean345 && !Static345.aBoolean446 || Static348.aBoolean347) {
									local526 = true;
								} else if (Static185.method2922(local493)) {
									local526 = true;
								}
							}
							break;
						}
						if (local524 == Static82.aLongArray2[local528]) {
							local526 = true;
							break;
						}
						local528++;
					}
					if (!local526 && Static246.anInt4422 == 0) {
						Static82.aLongArray2[Static139.anInt2640] = local524;
						Static139.anInt2640 = (Static139.anInt2640 + 1) % 100;
						@Pc(592) String local592 = Static256.method4150(Static91.method2651(Static26.aClass3_Sub5_Sub1_2));
						if (local517 == 2 || local517 == 3) {
							Static362.method5404("<img=1>" + local493, 9, Static298.method4598(local503), "<img=1>" + local296, 0, -1, local592);
						} else if (local517 == 1) {
							Static362.method5404("<img=0>" + local493, 9, Static298.method4598(local503), "<img=0>" + local296, 0, -1, local592);
						} else {
							Static362.method5404(local493, 9, Static298.method4598(local503), local296, 0, -1, local592);
						}
					}
					Static296.aClass234_104 = null;
					return true;
				} else if (Static296.aClass234_104 == Static385.aClass234_131) {
					local201 = Static26.aClass3_Sub5_Sub1_2.method2787();
					if (local201 == 65535) {
						local201 = -1;
					}
					local67 = Static26.aClass3_Sub5_Sub1_2.method2755();
					local214 = Static26.aClass3_Sub5_Sub1_2.method2778();
					if (Static305.method4701(local214)) {
						Static142.method2271(local67, -1, local201, 1);
					}
					Static296.aClass234_104 = null;
					return true;
				} else if (Static313.aClass234_118 == Static296.aClass234_104) {
					Static331.aClass115_1.method2405();
					Static296.aClass234_104 = null;
					Static136.anInt2615 += 32;
					return true;
				} else {
					@Pc(749) int local749;
					@Pc(755) int local755;
					if (Static296.aClass234_104 == Static365.aClass234_126) {
						local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
						local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
						local214 = Static26.aClass3_Sub5_Sub1_2.method2767();
						local218 = Static26.aClass3_Sub5_Sub1_2.method2767();
						if (Static305.method4701(local201) && Static375.aClass62ArrayArray2[local67] != null) {
							for (local749 = local214; local749 < local218; local749++) {
								local755 = Static26.aClass3_Sub5_Sub1_2.method2786();
								if (local749 < Static375.aClass62ArrayArray2[local67].length && Static375.aClass62ArrayArray2[local67][local749] != null) {
									Static375.aClass62ArrayArray2[local67][local749].anInt1568 = local755;
								}
							}
						}
						Static296.aClass234_104 = null;
						return true;
					}
					@Pc(977) Class236 local977;
					@Pc(949) int local949;
					@Pc(954) boolean local954;
					if (Static231.aClass234_85 == Static296.aClass234_104) {
						Static368.anInt6172 = Static28.anInt360;
						if (Static203.anInt3616 == 0) {
							Static372.aString64 = null;
							Static12.anInt159 = 0;
							Static316.aString55 = null;
							Static54.aClass236Array1 = null;
							Static296.aClass234_104 = null;
							return true;
						}
						Static372.aString64 = Static26.aClass3_Sub5_Sub1_2.method2788();
						local487 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
						if (local487) {
							Static26.aClass3_Sub5_Sub1_2.method2788();
						}
						@Pc(824) long local824 = Static26.aClass3_Sub5_Sub1_2.method2741();
						Static316.aString55 = Static338.method5143(local824);
						Static123.aByte35 = Static26.aClass3_Sub5_Sub1_2.method2753();
						local218 = Static26.aClass3_Sub5_Sub1_2.method2739();
						if (local218 == 255) {
							Static296.aClass234_104 = null;
							return true;
						}
						Static12.anInt159 = local218;
						@Pc(848) Class236[] local848 = new Class236[100];
						for (local755 = 0; local755 < Static12.anInt159; local755++) {
							local848[local755] = new Class236();
							local848[local755].aString59 = Static26.aClass3_Sub5_Sub1_2.method2788();
							local487 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
							if (local487) {
								local848[local755].aString58 = Static26.aClass3_Sub5_Sub1_2.method2788();
							} else {
								local848[local755].aString58 = local848[local755].aString59;
							}
							local848[local755].aString61 = Static231.method3842(local848[local755].aString58);
							local848[local755].anInt6178 = Static26.aClass3_Sub5_Sub1_2.method2767();
							local848[local755].aByte76 = Static26.aClass3_Sub5_Sub1_2.method2753();
							local848[local755].aString60 = Static26.aClass3_Sub5_Sub1_2.method2788();
							if (local848[local755].aString58.equals(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51)) {
								Static44.aByte9 = local848[local755].aByte76;
							}
						}
						local949 = Static12.anInt159;
						while (local949 > 0) {
							local949--;
							local954 = true;
							for (local517 = 0; local517 < local949; local517++) {
								if (local848[local517].aString61.compareTo(local848[local517 + 1].aString61) > 0) {
									local977 = local848[local517];
									local848[local517] = local848[local517 + 1];
									local848[local517 + 1] = local977;
									local954 = false;
								}
							}
							if (local954) {
								break;
							}
						}
						Static54.aClass236Array1 = local848;
						Static296.aClass234_104 = null;
						return true;
					}
					@Pc(1044) int local1044;
					@Pc(1048) int local1048;
					if (Static296.aClass234_105 == Static296.aClass234_104) {
						local201 = Static26.aClass3_Sub5_Sub1_2.method2726();
						local67 = local201 >> 28 & 0x3;
						local214 = local201 >> 14 & 0x3FFF;
						local218 = local201 & 0x3FFF;
						local749 = Static26.aClass3_Sub5_Sub1_2.method2739();
						local755 = local749 >> 2;
						local1044 = local749 & 0x3;
						local1048 = Static138.anIntArray275[local755];
						local949 = Static26.aClass3_Sub5_Sub1_2.method2767();
						local214 -= Static21.anInt265;
						if (local949 == 65535) {
							local949 = -1;
						}
						local218 -= Static103.anInt2044;
						Static363.method5518(local949, local67, local1044, local1048, local214, local755, local218);
						Static296.aClass234_104 = null;
						return true;
					} else if (Static296.aClass234_104 == Static289.aClass234_102) {
						local201 = Static26.aClass3_Sub5_Sub1_2.method2761();
						local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
						local214 = Static26.aClass3_Sub5_Sub1_2.method2787();
						if (Static305.method4701(local67)) {
							Static308.method4744(local214, local201);
						}
						Static296.aClass234_104 = null;
						return true;
					} else if (Static296.aClass234_104 == Static338.aClass234_114) {
						local201 = Static26.aClass3_Sub5_Sub1_2.method2726();
						local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
						local214 = Static26.aClass3_Sub5_Sub1_2.method2726();
						local218 = Static26.aClass3_Sub5_Sub1_2.method2787();
						if (Static305.method4701(local218)) {
							Static142.method2271(local214, local201, local67, 5);
						}
						Static296.aClass234_104 = null;
						return true;
					} else {
						@Pc(1160) boolean local1160;
						if (aClass234_130 == Static296.aClass234_104) {
							local201 = Static26.aClass3_Sub5_Sub1_2.method2739();
							local67 = Static26.aClass3_Sub5_Sub1_2.method2787();
							local1160 = (local201 & 0x1) == 1;
							Static190.method3019(local67, local1160);
							Static257.anIntArray511[Static45.anInt804++ & 0x1F] = local67;
							Static296.aClass234_104 = null;
							return true;
						} else if (Static188.aClass234_73 == Static296.aClass234_104) {
							Static293.method4554(Static50.aClass68_4);
							Static296.aClass234_104 = null;
							return true;
						} else if (Static296.aClass234_104 == Static342.aClass234_116) {
							local201 = Static26.aClass3_Sub5_Sub1_2.method2779();
							local67 = Static26.aClass3_Sub5_Sub1_2.method2726();
							local214 = Static26.aClass3_Sub5_Sub1_2.method2767();
							if (Static305.method4701(local214)) {
								Static66.method1125(local201, local67);
							}
							Static296.aClass234_104 = null;
							return true;
						} else if (Static273.aClass234_93 == Static296.aClass234_104) {
							Static293.method4554(Static391.aClass68_9);
							Static296.aClass234_104 = null;
							return true;
						} else if (Static235.aClass234_86 == Static296.aClass234_104) {
							local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
							local67 = Static26.aClass3_Sub5_Sub1_2.method2726();
							if (Static305.method4701(local201)) {
								@Pc(1247) Class3_Sub22 local1247 = (Class3_Sub22) Static29.aClass44_26.method942((long) local67);
								if (local1247 != null) {
									Static53.method985(local1247, false, true);
								}
								if (Static53.aClass62_2 != null) {
									Static158.method2441(Static53.aClass62_2);
									Static53.aClass62_2 = null;
								}
							}
							Static296.aClass234_104 = null;
							return true;
						} else if (Static296.aClass234_104 == Static339.aClass234_115) {
							local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
							if (Static305.method4701(local201)) {
								Static266.method4234();
							}
							Static296.aClass234_104 = null;
							return true;
						} else if (Static296.aClass234_104 == Static145.aClass234_59) {
							local201 = Static26.aClass3_Sub5_Sub1_2.method2748();
							local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
							if (local67 == 65535) {
								local67 = -1;
							}
							local214 = Static26.aClass3_Sub5_Sub1_2.method2747();
							local218 = Static26.aClass3_Sub5_Sub1_2.method2748();
							if (Static305.method4701(local214)) {
								Static219.method3674(local67, local218, local201);
								@Pc(1322) Class51 local1322 = Static176.aClass78_3.method1641(local67);
								Static317.method4117(local1322.anInt1161, local1322.anInt1174, local1322.anInt1166, local201);
								Static134.method2119(local1322.anInt1132, local1322.anInt1165, local201, local1322.anInt1142);
							}
							Static296.aClass234_104 = null;
							return true;
						} else if (Static366.aClass234_96 == Static296.aClass234_104) {
							Static196.anInt5194 = Static26.aClass3_Sub5_Sub1_2.method2739();
							for (local201 = 0; local201 < Static196.anInt5194; local201++) {
								Static152.aStringArray23[local201] = Static26.aClass3_Sub5_Sub1_2.method2788();
								Static78.aStringArray12[local201] = Static26.aClass3_Sub5_Sub1_2.method2788();
								if (Static78.aStringArray12[local201].equals("")) {
									Static78.aStringArray12[local201] = Static152.aStringArray23[local201];
								}
								Static295.aStringArray36[local201] = Static26.aClass3_Sub5_Sub1_2.method2788();
								Static247.aStringArray29[local201] = Static26.aClass3_Sub5_Sub1_2.method2788();
								if (Static247.aStringArray29[local201].equals("")) {
									Static247.aStringArray29[local201] = Static295.aStringArray36[local201];
								}
								Static122.aBooleanArray55[local201] = false;
							}
							Static296.aClass234_104 = null;
							Static142.anInt2705 = Static28.anInt360;
							return true;
						} else if (Static73.aClass234_33 == Static296.aClass234_104) {
							local201 = Static26.aClass3_Sub5_Sub1_2.method2787();
							local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
							local214 = Static26.aClass3_Sub5_Sub1_2.method2773();
							@Pc(1440) Class28_Sub1_Sub1_Sub1 local1440 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local201];
							if (local1440 != null) {
								Static57.method1030(local214, local67, local1440);
							}
							Static296.aClass234_104 = null;
							return true;
						} else if (Static296.aClass234_104 == Static317.aClass234_90) {
							Static26.aClass3_Sub5_Sub1_2.anInt3121 += 28;
							if (Static26.aClass3_Sub5_Sub1_2.method2743()) {
								Static228.method3744(Static26.aClass3_Sub5_Sub1_2.anInt3121 - 28, Static26.aClass3_Sub5_Sub1_2);
							}
							Static296.aClass234_104 = null;
							return true;
						} else if (Static23.aClass234_11 == Static296.aClass234_104) {
							Static289.anInt5033 = Static26.aClass3_Sub5_Sub1_2.method2735();
							Static98.anInt1965 = Static26.aClass3_Sub5_Sub1_2.method2784();
							Static48.anInt1065 = Static26.aClass3_Sub5_Sub1_2.method2773();
							while (Static26.aClass3_Sub5_Sub1_2.anInt3121 < Static203.anInt3616) {
								@Pc(1499) Class68 local1499 = Static61.method1098()[Static26.aClass3_Sub5_Sub1_2.method2739()];
								Static293.method4554(local1499);
							}
							Static296.aClass234_104 = null;
							return true;
						} else if (Static113.aClass234_46 == Static296.aClass234_104) {
							Static335.anInt5689 = Static26.aClass3_Sub5_Sub1_2.method2773();
							Static257.anInt4619 = Static26.aClass3_Sub5_Sub1_2.method2735();
							Static296.aClass234_104 = null;
							return true;
						} else if (Static296.aClass234_104 == Static379.aClass234_129) {
							local290 = Static26.aClass3_Sub5_Sub1_2.method2788();
							local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
							local493 = Static222.method3706(local67).method1631(Static26.aClass3_Sub5_Sub1_2);
							Static362.method5404(local290, 19, null, local290, 0, local67, local493);
							Static296.aClass234_104 = null;
							return true;
						} else if (Static96.aClass234_42 == Static296.aClass234_104) {
							Static293.method4554(Static365.aClass68_15);
							Static296.aClass234_104 = null;
							return true;
						} else if (Static204.aClass234_98 == Static296.aClass234_104) {
							Static236.method3899(false);
							Static296.aClass234_104 = null;
							return false;
						} else if (Static296.aClass234_104 == Static162.aClass234_63) {
							Static139.anInt2636 = Static26.aClass3_Sub5_Sub1_2.method2767() * 30;
							Static239.anInt5772 = Static28.anInt360;
							Static296.aClass234_104 = null;
							return true;
						} else if (Static296.aClass234_104 == Static315.aClass234_110) {
							local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
							local67 = Static26.aClass3_Sub5_Sub1_2.method2739();
							local1160 = (local67 & 0x1) == 1;
							while (Static26.aClass3_Sub5_Sub1_2.anInt3121 < Static203.anInt3616) {
								local218 = Static26.aClass3_Sub5_Sub1_2.method2750();
								local749 = Static26.aClass3_Sub5_Sub1_2.method2767();
								local755 = 0;
								if (local749 != 0) {
									local755 = Static26.aClass3_Sub5_Sub1_2.method2739();
									if (local755 == 255) {
										local755 = Static26.aClass3_Sub5_Sub1_2.method2726();
									}
								}
								Static355.method5331(local1160, local218, local755, local749 - 1, local201);
							}
							Static257.anIntArray511[Static45.anInt804++ & 0x1F] = local201;
							Static296.aClass234_104 = null;
							return true;
						} else if (Static163.aClass234_60 == Static296.aClass234_104) {
							Static293.method4554(Static273.aClass68_12);
							Static296.aClass234_104 = null;
							return true;
						} else {
							@Pc(1701) String local1701;
							@Pc(1699) String local1699;
							@Pc(1728) String local1728;
							if (Static138.aClass234_57 == Static296.aClass234_104) {
								local201 = Static26.aClass3_Sub5_Sub1_2.method2750();
								local67 = Static26.aClass3_Sub5_Sub1_2.method2726();
								local214 = Static26.aClass3_Sub5_Sub1_2.method2739();
								local1699 = "";
								local1701 = local1699;
								if ((local214 & 0x1) != 0) {
									local1699 = Static26.aClass3_Sub5_Sub1_2.method2788();
									if ((local214 & 0x2) == 0) {
										local1701 = local1699;
									} else {
										local1701 = Static26.aClass3_Sub5_Sub1_2.method2788();
									}
								}
								local1728 = Static26.aClass3_Sub5_Sub1_2.method2788();
								if (local201 == 99) {
									Static171.method2654(local1728);
								} else if (local1701.equals("") || !Static185.method2922(local1701)) {
									Static24.method309(local1699, local1728, local1701, local67, local201);
								} else {
									Static296.aClass234_104 = null;
									return true;
								}
								Static296.aClass234_104 = null;
								return true;
							} else if (Static198.aClass234_74 == Static296.aClass234_104) {
								local201 = Static26.aClass3_Sub5_Sub1_2.method2778();
								@Pc(1770) byte local1770 = Static26.aClass3_Sub5_Sub1_2.method2738();
								Static331.aClass115_1.method2407(local1770, local201);
								Static296.aClass234_104 = null;
								return true;
							} else if (Static228.aClass234_83 == Static296.aClass234_104) {
								local201 = Static26.aClass3_Sub5_Sub1_2.method2747();
								local67 = Static26.aClass3_Sub5_Sub1_2.method2766();
								local214 = Static26.aClass3_Sub5_Sub1_2.method2740();
								local218 = Static26.aClass3_Sub5_Sub1_2.method2748();
								if (Static305.method4701(local201)) {
									Static252.method4107(local67, local214, local218);
								}
								Static296.aClass234_104 = null;
								return true;
							} else if (Static296.aClass234_104 == Static96.aClass234_43) {
								local201 = Static26.aClass3_Sub5_Sub1_2.method2739();
								local67 = local201 >> 5;
								local214 = local201 & 0x1F;
								if (local214 == 0) {
									Static323.aClass229Array1[local67] = null;
									Static296.aClass234_104 = null;
									return true;
								}
								@Pc(1840) Class229 local1840 = new Class229();
								local1840.anInt5877 = local214;
								local1840.anInt5876 = Static26.aClass3_Sub5_Sub1_2.method2739();
								if (local1840.anInt5876 >= 0 && local1840.anInt5876 < Static161.aClass110Array7.length) {
									if (local1840.anInt5877 == 1 || local1840.anInt5877 == 10) {
										local1840.anInt5873 = Static26.aClass3_Sub5_Sub1_2.method2767();
										Static26.aClass3_Sub5_Sub1_2.anInt3121 += 6;
									} else if (local1840.anInt5877 >= 2 && local1840.anInt5877 <= 6) {
										if (local1840.anInt5877 == 2) {
											local1840.anInt5865 = 64;
											local1840.anInt5867 = 64;
										}
										if (local1840.anInt5877 == 3) {
											local1840.anInt5867 = 0;
											local1840.anInt5865 = 64;
										}
										if (local1840.anInt5877 == 4) {
											local1840.anInt5865 = 64;
											local1840.anInt5867 = 128;
										}
										if (local1840.anInt5877 == 5) {
											local1840.anInt5867 = 64;
											local1840.anInt5865 = 0;
										}
										if (local1840.anInt5877 == 6) {
											local1840.anInt5865 = 128;
											local1840.anInt5867 = 64;
										}
										local1840.anInt5877 = 2;
										local1840.anInt5866 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local1840.anInt5872 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local1840.anInt5868 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local1840.anInt5870 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local1840.anInt5874 = Static26.aClass3_Sub5_Sub1_2.method2767();
									}
									local1840.anInt5864 = Static26.aClass3_Sub5_Sub1_2.method2767();
									if (local1840.anInt5864 == 65535) {
										local1840.anInt5864 = -1;
									}
									Static323.aClass229Array1[local67] = local1840;
								}
								Static296.aClass234_104 = null;
								return true;
							} else if (Static55.aClass234_22 == Static296.aClass234_104) {
								local290 = Static26.aClass3_Sub5_Sub1_2.method2788();
								local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
								local214 = Static26.aClass3_Sub5_Sub1_2.method2778();
								if (Static305.method4701(local214)) {
									Static202.method3147(local67, local290);
								}
								Static296.aClass234_104 = null;
								return true;
							} else if (Static152.aClass234_61 == Static296.aClass234_104) {
								Static293.method4554(Static41.aClass68_2);
								Static296.aClass234_104 = null;
								return true;
							} else if (Static296.aClass234_104 == Static289.aClass234_101) {
								local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
								local67 = Static26.aClass3_Sub5_Sub1_2.method2748();
								local214 = Static26.aClass3_Sub5_Sub1_2.method2747();
								if (Static305.method4701(local201)) {
									Static233.method3863(local67, local214);
								}
								Static296.aClass234_104 = null;
								return true;
							} else if (Static118.aClass234_48 == Static296.aClass234_104) {
								Static293.method4554(Static109.aClass68_7);
								Static296.aClass234_104 = null;
								return true;
							} else {
								@Pc(2376) String local2376;
								if (Static296.aClass234_104 == Static226.aClass234_81) {
									while (Static26.aClass3_Sub5_Sub1_2.anInt3121 < Static203.anInt3616) {
										local487 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
										local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
										local493 = Static26.aClass3_Sub5_Sub1_2.method2788();
										local218 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local749 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local1728 = "";
										local954 = false;
										if (local218 > 0) {
											local1728 = Static26.aClass3_Sub5_Sub1_2.method2788();
											local954 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
										}
										for (local1048 = 0; local1048 < Static351.anInt3266; local1048++) {
											if (local487) {
												if (local493.equals(Static244.aStringArray28[local1048])) {
													Static244.aStringArray28[local1048] = local296;
													local296 = null;
													Static275.aStringArray33[local1048] = local493;
													break;
												}
											} else if (local296.equals(Static244.aStringArray28[local1048])) {
												if (local218 != Static110.anIntArray215[local1048]) {
													Static110.anIntArray215[local1048] = local218;
													if (local218 > 0) {
														Static24.method309("", local296 + Static47.aClass57_21.method1122(Static66.anInt1307), "", 0, 5);
													}
													if (local218 == 0) {
														Static24.method309("", local296 + Static336.aClass57_41.method1122(Static66.anInt1307), "", 0, 5);
													}
												}
												Static275.aStringArray33[local1048] = local493;
												Static346.aStringArray39[local1048] = local1728;
												Static351.anIntArray370[local1048] = local749;
												local296 = null;
												Static23.aBooleanArray7[local1048] = local954;
												break;
											}
										}
										if (local296 != null && Static351.anInt3266 < 200) {
											Static244.aStringArray28[Static351.anInt3266] = local296;
											Static275.aStringArray33[Static351.anInt3266] = local493;
											Static110.anIntArray215[Static351.anInt3266] = local218;
											Static346.aStringArray39[Static351.anInt3266] = local1728;
											Static351.anIntArray370[Static351.anInt3266] = local749;
											Static23.aBooleanArray7[Static351.anInt3266] = local954;
											Static351.anInt3266++;
										}
									}
									Static331.anInt5599 = 2;
									Static142.anInt2705 = Static28.anInt360;
									local67 = Static351.anInt3266;
									while (local67 > 0) {
										local487 = true;
										local67--;
										for (local214 = 0; local214 < local67; local214++) {
											if (Static110.anIntArray215[local214] != Static41.anInt765 && Static41.anInt765 == Static110.anIntArray215[local214 + 1] || Static110.anIntArray215[local214] == 0 && Static110.anIntArray215[local214 + 1] != 0) {
												local218 = Static110.anIntArray215[local214];
												Static110.anIntArray215[local214] = Static110.anIntArray215[local214 + 1];
												Static110.anIntArray215[local214 + 1] = local218;
												local1701 = Static346.aStringArray39[local214];
												Static346.aStringArray39[local214] = Static346.aStringArray39[local214 + 1];
												Static346.aStringArray39[local214 + 1] = local1701;
												local1728 = Static244.aStringArray28[local214];
												Static244.aStringArray28[local214] = Static244.aStringArray28[local214 + 1];
												Static244.aStringArray28[local214 + 1] = local1728;
												local2376 = Static275.aStringArray33[local214];
												Static275.aStringArray33[local214] = Static275.aStringArray33[local214 + 1];
												Static275.aStringArray33[local214 + 1] = local2376;
												local1048 = Static351.anIntArray370[local214];
												Static351.anIntArray370[local214] = Static351.anIntArray370[local214 + 1];
												Static351.anIntArray370[local214 + 1] = local1048;
												@Pc(2412) boolean local2412 = Static23.aBooleanArray7[local214];
												Static23.aBooleanArray7[local214] = Static23.aBooleanArray7[local214 + 1];
												local487 = false;
												Static23.aBooleanArray7[local214 + 1] = local2412;
											}
										}
										if (local487) {
											break;
										}
									}
									Static296.aClass234_104 = null;
									return true;
								} else if (Static296.aClass234_104 == Static216.aClass234_124) {
									local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
									local67 = Static26.aClass3_Sub5_Sub1_2.method2778();
									local214 = Static26.aClass3_Sub5_Sub1_2.method2767();
									if (Static305.method4701(local201)) {
										Static113.method1829(local67, local214);
									}
									Static296.aClass234_104 = null;
									return true;
								} else if (Static296.aClass234_104 == Static6.aClass234_2) {
									local201 = Static26.aClass3_Sub5_Sub1_2.method2778();
									local67 = Static26.aClass3_Sub5_Sub1_2.method2755();
									if (Static305.method4701(local201)) {
										Static142.method2271(local67, 0, Static376.anInt6265, 5);
									}
									Static296.aClass234_104 = null;
									return true;
								} else if (Static296.aClass234_104 == Static213.aClass234_75) {
									Static293.method4554(Static76.aClass68_5);
									Static296.aClass234_104 = null;
									return true;
								} else if (Static296.aClass234_104 == Static219.aClass234_78) {
									local201 = Static26.aClass3_Sub5_Sub1_2.method2755();
									local67 = Static26.aClass3_Sub5_Sub1_2.method2778();
									local214 = Static26.aClass3_Sub5_Sub1_2.method2787();
									if (Static305.method4701(local67)) {
										Static105.method1728(local201, local214);
									}
									Static296.aClass234_104 = null;
									return true;
								} else if (Static296.aClass234_104 == Static248.aClass234_88) {
									Static293.method4554(Static37.aClass68_1);
									Static296.aClass234_104 = null;
									return true;
								} else if (Static175.aClass234_67 == Static296.aClass234_104) {
									local201 = Static26.aClass3_Sub5_Sub1_2.method2739();
									@Pc(2567) boolean local2567 = (local201 & 0x1) == 1;
									local493 = Static26.aClass3_Sub5_Sub1_2.method2788();
									local1699 = Static26.aClass3_Sub5_Sub1_2.method2788();
									if (local1699.equals("")) {
										local1699 = local493;
									}
									local1701 = Static26.aClass3_Sub5_Sub1_2.method2788();
									local1728 = Static26.aClass3_Sub5_Sub1_2.method2788();
									if (local1728.equals("")) {
										local1728 = local1701;
									}
									if (local2567) {
										for (local1044 = 0; local1044 < Static196.anInt5194; local1044++) {
											if (Static78.aStringArray12[local1044].equals(local1728)) {
												Static152.aStringArray23[local1044] = local493;
												Static78.aStringArray12[local1044] = local1699;
												Static295.aStringArray36[local1044] = local1701;
												Static247.aStringArray29[local1044] = local1728;
												break;
											}
										}
									} else {
										Static152.aStringArray23[Static196.anInt5194] = local493;
										Static78.aStringArray12[Static196.anInt5194] = local1699;
										Static295.aStringArray36[Static196.anInt5194] = local1701;
										Static247.aStringArray29[Static196.anInt5194] = local1728;
										Static122.aBooleanArray55[Static196.anInt5194] = (local201 & 0x2) == 2;
										Static196.anInt5194++;
									}
									Static142.anInt2705 = Static28.anInt360;
									Static296.aClass234_104 = null;
									return true;
								} else {
									@Pc(2700) Class3_Sub22 local2700;
									if (Static296.aClass234_104 == Static91.aClass234_65) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2748();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2787();
										local218 = Static26.aClass3_Sub5_Sub1_2.method2739();
										if (Static305.method4701(local67)) {
											local2700 = (Class3_Sub22) Static29.aClass44_26.method942((long) local201);
											if (local2700 != null) {
												Static53.method985(local2700, false, local2700.anInt3029 != local214);
											}
											Static319.method4848(local214, false, local201, local218);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static350.aClass234_120) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2773();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
										if (Static305.method4701(local67)) {
											Static259.anInt3007 = local201;
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static72.aClass234_32) {
										Static257.aClass128_18 = Static219.method3670(Static26.aClass3_Sub5_Sub1_2.method2739());
										Static296.aClass234_104 = null;
										return true;
									} else if (Static62.aClass234_27 == Static296.aClass234_104) {
										@Pc(2769) byte local2769 = Static26.aClass3_Sub5_Sub1_2.method2753();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2778();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2778();
										if (Static305.method4701(local67)) {
											Static308.method4744(local214, local2769);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static37.aClass234_19) {
										Static293.method4554(Static387.aClass68_16);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static216.aClass234_125) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2739();
										if (Static26.aClass3_Sub5_Sub1_2.method2739() == 0) {
											Static8.aClass157Array119[local201] = new Class157();
										} else {
											Static26.aClass3_Sub5_Sub1_2.anInt3121--;
											Static8.aClass157Array119[local201] = new Class157(Static26.aClass3_Sub5_Sub1_2);
										}
										Static26.anInt347 = Static28.anInt360;
										Static296.aClass234_104 = null;
										return true;
									} else if (Static138.aClass234_58 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2747();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2755();
										local218 = Static26.aClass3_Sub5_Sub1_2.method2787();
										local749 = Static26.aClass3_Sub5_Sub1_2.method2747();
										if (Static305.method4701(local218)) {
											Static317.method4117(local67, local201, local749, local214);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static355.aClass234_122 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2787();
										local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2726();
										if (Static305.method4701(local201)) {
											Static315.method4826(local214, local296);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static90.aClass234_38 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2726();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local218 = Static26.aClass3_Sub5_Sub1_2.method2787();
										if (local201 >> 30 == 0) {
											@Pc(3059) Class125 local3059;
											@Pc(3114) Class177 local3114;
											@Pc(3065) Class125 local3065;
											@Pc(3087) Class177 local3087;
											@Pc(3081) Class177 local3081;
											if (local201 >> 29 != 0) {
												local749 = local201 & 0xFFFF;
												@Pc(3026) Class28_Sub1_Sub1_Sub1 local3026 = Static166.aClass28_Sub1_Sub1_Sub1Array41[local749];
												if (local3026 != null) {
													if (local214 == 65535) {
														local214 = -1;
													}
													local954 = true;
													if (local214 != -1 && local3026.anInt4367 != -1) {
														if (local3026.anInt4367 == local214) {
															local3059 = Static224.aClass203_2.method4559(local214);
															if (local3059.aBoolean236 && local3059.anInt3050 != -1) {
																local3114 = Static176.aClass43_2.method930(local3059.anInt3050);
																local517 = local3114.anInt4500;
																if (local517 == 0 || local517 == 2) {
																	local954 = false;
																} else if (local517 == 1) {
																	local954 = true;
																}
															}
														} else {
															local3059 = Static224.aClass203_2.method4559(local214);
															local3065 = Static224.aClass203_2.method4559(local3026.anInt4367);
															if (local3059.anInt3050 != -1 && local3065.anInt3050 != -1) {
																local3081 = Static176.aClass43_2.method930(local3059.anInt3050);
																local3087 = Static176.aClass43_2.method930(local3065.anInt3050);
																if (local3087.anInt4520 > local3081.anInt4520) {
																	local954 = false;
																}
															}
														}
													}
													if (local954) {
														local3026.anInt4331 = local67;
														local3026.anInt4361 = 0;
														local3026.anInt4367 = local214;
														local3026.anInt4351 = 0;
														local3026.anInt4341 = 1;
														local3026.anInt4329 = Static76.anInt1617 + local218;
														if (Static76.anInt1617 < local3026.anInt4329) {
															local3026.anInt4351 = -1;
														}
														if (local3026.anInt4367 != -1 && local3026.anInt4329 == Static76.anInt1617) {
															local1048 = Static224.aClass203_2.method4559(local3026.anInt4367).anInt3050;
															if (local1048 != -1) {
																local3114 = Static176.aClass43_2.method930(local1048);
																if (local3114 != null && local3114.anIntArray499 != null) {
																	Static351.method2911(local3026.aByte73, local3026.anInt5774, 0, local3114, local3026.anInt5766, false);
																}
															}
														}
													}
												}
											} else if (local201 >> 28 != 0) {
												local749 = local201 & 0xFFFF;
												@Pc(3227) Class28_Sub1_Sub1_Sub2 local3227;
												if (Static376.anInt6265 == local749) {
													local3227 = Static226.aClass28_Sub1_Sub1_Sub2_2;
												} else {
													local3227 = Static308.aClass28_Sub1_Sub1_Sub2Array1[local749];
												}
												if (local3227 != null) {
													if (local214 == 65535) {
														local214 = -1;
													}
													local954 = true;
													if (local214 != -1 && local3227.anInt4367 != -1) {
														if (local3227.anInt4367 == local214) {
															local3059 = Static224.aClass203_2.method4559(local214);
															if (local3059.aBoolean236 && local3059.anInt3050 != -1) {
																local3114 = Static176.aClass43_2.method930(local3059.anInt3050);
																local517 = local3114.anInt4500;
																if (local517 == 0 || local517 == 2) {
																	local954 = false;
																} else if (local517 == 1) {
																	local954 = true;
																}
															}
														} else {
															local3059 = Static224.aClass203_2.method4559(local214);
															local3065 = Static224.aClass203_2.method4559(local3227.anInt4367);
															if (local3059.anInt3050 != -1 && local3065.anInt3050 != -1) {
																local3081 = Static176.aClass43_2.method930(local3059.anInt3050);
																local3087 = Static176.aClass43_2.method930(local3065.anInt3050);
																if (local3087.anInt4520 > local3081.anInt4520) {
																	local954 = false;
																}
															}
														}
													}
													if (local954) {
														local3227.anInt4351 = 0;
														local3227.anInt4331 = local67;
														local3227.anInt4367 = local214;
														local3227.anInt4329 = local218 + Static76.anInt1617;
														local3227.anInt4341 = 1;
														local3227.anInt4361 = 0;
														if (local3227.anInt4367 == 65535) {
															local3227.anInt4367 = -1;
														}
														if (Static76.anInt1617 < local3227.anInt4329) {
															local3227.anInt4351 = -1;
														}
														if (local3227.anInt4367 != -1 && local3227.anInt4329 == Static76.anInt1617) {
															local1048 = Static224.aClass203_2.method4559(local3227.anInt4367).anInt3050;
															if (local1048 != -1) {
																local3114 = Static176.aClass43_2.method930(local1048);
																if (local3114 != null && local3114.anIntArray499 != null) {
																	Static351.method2911(local3227.aByte73, local3227.anInt5774, 0, local3114, local3227.anInt5766, local3227 == Static226.aClass28_Sub1_Sub1_Sub2_2);
																}
															}
														}
													}
												}
											}
										} else {
											local749 = local201 >> 28 & 0x3;
											local755 = (local201 >> 14 & 0x3FFF) - Static21.anInt265;
											local1044 = (local201 & 0x3FFF) - Static103.anInt2044;
											if (local755 >= 0 && local1044 >= 0 && local755 < Static12.anInt161 && local1044 < Static44.anInt787) {
												local1048 = local755 * 128 + 64;
												local949 = local1044 * 128 + 64;
												@Pc(3002) Class28_Sub1_Sub4 local3002 = new Class28_Sub1_Sub4(local214, 0, Static76.anInt1617, local749, local1048, Static55.method1005(local949, local749, local1048) - local67, local949, local755, local755, local1044, local1044);
												Static93.aClass138_10.method3053(new Class3_Sub7_Sub13(local3002));
											}
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static113.aClass234_47 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2755();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
										Static331.aClass115_1.method2407(local201, local67);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static135.aClass234_54 == Static296.aClass234_104) {
										Static174.anInt3042 = Static26.aClass3_Sub5_Sub1_2.method2739();
										Static239.anInt5772 = Static28.anInt360;
										Static296.aClass234_104 = null;
										return true;
									} else if (Static135.aClass234_53 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local218 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local749 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local755 = Static26.aClass3_Sub5_Sub1_2.method2767();
										if (Static305.method4701(local201)) {
											Static8.aBooleanArray148[local67] = true;
											Static77.anIntArray161[local67] = local214;
											Static345.anIntArray635[local67] = local218;
											Static66.anIntArray126[local67] = local749;
											Static160.anIntArray604[local67] = local755;
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static261.aClass234_91) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2787();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2726();
										Static331.aClass115_1.method2400(local201, local67);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static179.aClass234_68 == Static296.aClass234_104) {
										if (Static203.anInt3616 == 0) {
											Static32.aString10 = Static126.aClass57_42.method1122(Static66.anInt1307);
										} else {
											Static32.aString10 = Static26.aClass3_Sub5_Sub1_2.method2788();
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static293.aClass234_103 == Static296.aClass234_104) {
										Static48.anInt1065 = Static26.aClass3_Sub5_Sub1_2.method2735();
										Static98.anInt1965 = Static26.aClass3_Sub5_Sub1_2.method2784();
										Static289.anInt5033 = Static26.aClass3_Sub5_Sub1_2.method2784();
										for (@Pc(3570) Class3_Sub16 local3570 = (Class3_Sub16) Static384.aClass44_39.method950(); local3570 != null; local3570 = (Class3_Sub16) Static384.aClass44_39.method949()) {
											local67 = (int) (local3570.aLong240 & 0x3FFFL);
											local214 = (int) (local3570.aLong240 >> 14 & 0x3FFFL);
											local218 = (int) (local3570.aLong240 >> 28 & 0x3L);
											if (local218 == Static98.anInt1965 && Static48.anInt1065 <= local67 && Static48.anInt1065 + 8 > local67 && Static289.anInt5033 <= local214 && Static289.anInt5033 + 8 > local214) {
												local3570.method5700();
												Static192.method3056(local67, Static98.anInt1965, local214);
											}
										}
										for (@Pc(3645) Class3_Sub36 local3645 = (Class3_Sub36) Static230.aClass138_34.method3051(); local3645 != null; local3645 = (Class3_Sub36) Static230.aClass138_34.method3050()) {
											if (local3645.anInt5104 >= Static48.anInt1065 && Static48.anInt1065 + 8 > local3645.anInt5104 && Static289.anInt5033 <= local3645.anInt5110 && Static289.anInt5033 + 8 > local3645.anInt5110 && Static98.anInt1965 == local3645.anInt5112) {
												local3645.anInt5101 = 0;
											}
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static95.aClass234_127) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2726();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
										if (Static305.method4701(local67)) {
											Static142.method2271(local201, -1, -1, 3);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static182.aClass234_70 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2747();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2748();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2761();
										if (Static305.method4701(local201)) {
											@Pc(3744) Class3_Sub22 local3744 = (Class3_Sub22) Static29.aClass44_26.method942((long) local214);
											local2700 = (Class3_Sub22) Static29.aClass44_26.method942((long) local67);
											if (local2700 != null) {
												Static53.method985(local2700, false, local3744 == null || local3744.anInt3029 != local2700.anInt3029);
											}
											if (local3744 != null) {
												local3744.method5700();
												Static29.aClass44_26.method948((long) local67, local3744);
											}
											@Pc(3786) Class62 local3786 = Static115.method1862(local214);
											if (local3786 != null) {
												Static158.method2441(local3786);
											}
											local3786 = Static115.method1862(local67);
											if (local3786 != null) {
												Static158.method2441(local3786);
												Static54.method993(true, local3786);
											}
											if (Static68.anInt1346 != -1) {
												Static244.method3984(Static68.anInt1346, 1);
											}
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static38.aClass234_20 == Static296.aClass234_104) {
										Static296.aClass234_104 = null;
										Static142.anInt2705 = Static28.anInt360;
										Static331.anInt5599 = 1;
										return true;
									} else if (Static47.aClass234_21 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
										if (local201 == 65535) {
											local201 = -1;
										}
										local67 = Static26.aClass3_Sub5_Sub1_2.method2735();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2735();
										Static320.method4850(local201, local67, local214);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static352.aClass234_121 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2731();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2787();
										if (local214 == 65535) {
											local214 = -1;
										}
										Static164.method2513(local214, local201, local67);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static279.aClass234_119 == Static296.aClass234_104) {
										local487 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
										local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
										local493 = local296;
										if (local487) {
											local493 = Static26.aClass3_Sub5_Sub1_2.method2788();
										}
										local503 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local508 = Static26.aClass3_Sub5_Sub1_2.method2786();
										local1048 = Static26.aClass3_Sub5_Sub1_2.method2739();
										@Pc(3930) long local3930 = (local503 << 32) + local508;
										@Pc(3932) boolean local3932 = false;
										@Pc(3934) int local3934 = 0;
										while (true) {
											if (local3934 >= 100) {
												if (local1048 <= 1) {
													if (Static246.aBoolean345 && !Static345.aBoolean446 || Static348.aBoolean347) {
														local3932 = true;
													} else if (Static185.method2922(local493)) {
														local3932 = true;
													}
												}
												break;
											}
											if (Static82.aLongArray2[local3934] == local3930) {
												local3932 = true;
												break;
											}
											local3934++;
										}
										if (!local3932 && Static246.anInt4422 == 0) {
											Static82.aLongArray2[Static139.anInt2640] = local3930;
											Static139.anInt2640 = (Static139.anInt2640 + 1) % 100;
											@Pc(3994) String local3994 = Static256.method4150(Static91.method2651(Static26.aClass3_Sub5_Sub1_2));
											if (local1048 == 2) {
												Static362.method5404("<img=1>" + local493, 7, null, "<img=1>" + local296, 0, -1, local3994);
											} else if (local1048 == 1) {
												Static362.method5404("<img=0>" + local493, 7, null, "<img=0>" + local296, 0, -1, local3994);
											} else {
												Static362.method5404(local493, 3, null, local296, 0, -1, local3994);
											}
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static330.aClass234_113 == Static296.aClass234_104) {
										local290 = Static26.aClass3_Sub5_Sub1_2.method2788();
										local1160 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
										if (local1160) {
											local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
										} else {
											local296 = local290;
										}
										local218 = Static26.aClass3_Sub5_Sub1_2.method2767();
										@Pc(4095) byte local4095 = Static26.aClass3_Sub5_Sub1_2.method2753();
										@Pc(4097) boolean local4097 = false;
										if (local4095 == -128) {
											local4097 = true;
										}
										if (local4097) {
											if (Static12.anInt159 == 0) {
												Static296.aClass234_104 = null;
												return true;
											}
											for (local1044 = 0; local1044 < Static12.anInt159 && (!Static54.aClass236Array1[local1044].aString58.equals(local296) || local218 != Static54.aClass236Array1[local1044].anInt6178); local1044++) {
											}
											if (local1044 < Static12.anInt159) {
												while (local1044 < Static12.anInt159 - 1) {
													Static54.aClass236Array1[local1044] = Static54.aClass236Array1[local1044 + 1];
													local1044++;
												}
												Static12.anInt159--;
												Static54.aClass236Array1[Static12.anInt159] = null;
											}
										} else {
											local2376 = Static26.aClass3_Sub5_Sub1_2.method2788();
											local977 = new Class236();
											local977.aString59 = local290;
											local977.aString58 = local296;
											local977.aString61 = Static231.method3842(local977.aString58);
											local977.aString60 = local2376;
											local977.aByte76 = local4095;
											local977.anInt6178 = local218;
											for (local949 = Static12.anInt159 - 1; local949 >= 0; local949--) {
												local517 = Static54.aClass236Array1[local949].aString61.compareTo(local977.aString61);
												if (local517 == 0) {
													Static54.aClass236Array1[local949].anInt6178 = local218;
													Static54.aClass236Array1[local949].aByte76 = local4095;
													Static54.aClass236Array1[local949].aString60 = local2376;
													if (local296.equals(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51)) {
														Static44.aByte9 = local4095;
													}
													Static296.aClass234_104 = null;
													Static368.anInt6172 = Static28.anInt360;
													return true;
												}
												if (local517 < 0) {
													break;
												}
											}
											if (Static54.aClass236Array1.length <= Static12.anInt159) {
												Static296.aClass234_104 = null;
												return true;
											}
											for (local517 = Static12.anInt159 - 1; local517 > local949; local517--) {
												Static54.aClass236Array1[local517 + 1] = Static54.aClass236Array1[local517];
											}
											if (Static12.anInt159 == 0) {
												Static54.aClass236Array1 = new Class236[100];
											}
											Static54.aClass236Array1[local949 + 1] = local977;
											Static12.anInt159++;
											if (local296.equals(Static226.aClass28_Sub1_Sub1_Sub2_2.aString51)) {
												Static44.aByte9 = local4095;
											}
										}
										Static368.anInt6172 = Static28.anInt360;
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static83.aClass234_37) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2761();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2778();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2747();
										local218 = Static26.aClass3_Sub5_Sub1_2.method2778();
										local749 = Static26.aClass3_Sub5_Sub1_2.method2767();
										if (Static305.method4701(local749)) {
											Static142.method2271(local201, local218, local67 | local214 << 16, 7);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static300.aClass234_106) {
										Static39.method643(Static26.aClass3_Sub5_Sub1_2, Static203.anInt3616);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static150.aClass234_87 == Static296.aClass234_104) {
										local487 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
										local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
										local493 = local296;
										if (local487) {
											local493 = Static26.aClass3_Sub5_Sub1_2.method2788();
										}
										local503 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local508 = Static26.aClass3_Sub5_Sub1_2.method2786();
										local1048 = Static26.aClass3_Sub5_Sub1_2.method2739();
										local949 = Static26.aClass3_Sub5_Sub1_2.method2767();
										@Pc(4433) long local4433 = (local503 << 32) + local508;
										@Pc(4435) boolean local4435 = false;
										@Pc(4437) int local4437 = 0;
										while (true) {
											if (local4437 >= 100) {
												if (local1048 <= 1 && Static185.method2922(local493)) {
													local4435 = true;
												}
												break;
											}
											if (Static82.aLongArray2[local4437] == local4433) {
												local4435 = true;
												break;
											}
											local4437++;
										}
										if (!local4435 && Static246.anInt4422 == 0) {
											Static82.aLongArray2[Static139.anInt2640] = local4433;
											Static139.anInt2640 = (Static139.anInt2640 + 1) % 100;
											@Pc(4494) String local4494 = Static222.method3706(local949).method1631(Static26.aClass3_Sub5_Sub1_2);
											if (local1048 == 2) {
												Static362.method5404("<img=1>" + local493, 18, null, "<img=1>" + local296, 0, local949, local4494);
											} else if (local1048 == 1) {
												Static362.method5404("<img=0>" + local493, 18, null, "<img=0>" + local296, 0, local949, local4494);
											} else {
												Static362.method5404(local493, 18, null, local296, 0, local949, local4494);
											}
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static12.aClass234_7 == Static296.aClass234_104) {
										Static293.method4554(Static81.aClass68_6);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static175.aClass234_66 == Static296.aClass234_104) {
										local487 = Static26.aClass3_Sub5_Sub1_2.method2739() == 1;
										local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
										local493 = local296;
										if (local487) {
											local493 = Static26.aClass3_Sub5_Sub1_2.method2788();
										}
										local503 = Static26.aClass3_Sub5_Sub1_2.method2741();
										local508 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local513 = Static26.aClass3_Sub5_Sub1_2.method2786();
										local517 = Static26.aClass3_Sub5_Sub1_2.method2739();
										@Pc(4619) int local4619 = Static26.aClass3_Sub5_Sub1_2.method2767();
										@Pc(4625) long local4625 = (local508 << 32) + local513;
										@Pc(4627) boolean local4627 = false;
										@Pc(4629) int local4629 = 0;
										while (true) {
											if (local4629 >= 100) {
												if (local517 <= 1 && Static185.method2922(local493)) {
													local4627 = true;
												}
												break;
											}
											if (Static82.aLongArray2[local4629] == local4625) {
												local4627 = true;
												break;
											}
											local4629++;
										}
										if (!local4627 && Static246.anInt4422 == 0) {
											Static82.aLongArray2[Static139.anInt2640] = local4625;
											Static139.anInt2640 = (Static139.anInt2640 + 1) % 100;
											@Pc(4681) String local4681 = Static222.method3706(local4619).method1631(Static26.aClass3_Sub5_Sub1_2);
											if (local517 == 2) {
												Static362.method5404("<img=1>" + local493, 20, Static298.method4598(local503), "<img=1>" + local296, 0, local4619, local4681);
											} else if (local517 == 1) {
												Static362.method5404("<img=0>" + local493, 20, Static298.method4598(local503), "<img=0>" + local296, 0, local4619, local4681);
											} else {
												Static362.method5404(local493, 20, Static298.method4598(local503), local296, 0, local4619, local4681);
											}
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static118.aClass234_49) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2747();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local214 = Static26.aClass3_Sub5_Sub1_2.method2761();
										local218 = Static26.aClass3_Sub5_Sub1_2.method2747();
										if (Static305.method4701(local201)) {
											Static162.method2510(local214, (local218 << 16) + local67);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static296.aClass234_104 == Static372.aClass234_128) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2773();
										local67 = Static26.aClass3_Sub5_Sub1_2.method2787();
										Static331.aClass115_1.method2400(local67, local201);
										Static296.aClass234_104 = null;
										return true;
									} else if (Static135.aClass234_52 == Static296.aClass234_104) {
										local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
										local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
										@Pc(4826) Object[] local4826 = new Object[local296.length() + 1];
										for (local218 = local296.length() - 1; local218 >= 0; local218--) {
											if (local296.charAt(local218) == 's') {
												local4826[local218 + 1] = Static26.aClass3_Sub5_Sub1_2.method2788();
											} else {
												local4826[local218 + 1] = Integer.valueOf(Static26.aClass3_Sub5_Sub1_2.method2726());
											}
										}
										local4826[0] = Integer.valueOf(Static26.aClass3_Sub5_Sub1_2.method2726());
										if (Static305.method4701(local201)) {
											@Pc(4879) Class3_Sub23 local4879 = new Class3_Sub23();
											local4879.anObjectArray31 = local4826;
											Static124.method2006(local4879);
										}
										Static296.aClass234_104 = null;
										return true;
									} else if (Static261.aClass234_92 == Static296.aClass234_104) {
										Static98.anInt1965 = Static26.aClass3_Sub5_Sub1_2.method2735();
										Static289.anInt5033 = Static26.aClass3_Sub5_Sub1_2.method2773();
										Static48.anInt1065 = Static26.aClass3_Sub5_Sub1_2.method2773();
										Static296.aClass234_104 = null;
										return true;
									} else if (Static80.aClass234_36 == Static296.aClass234_104) {
										Static236.method3899(true);
										Static296.aClass234_104 = null;
										return false;
									} else {
										@Pc(4974) Class3_Sub42 local4974;
										if (Static280.aClass234_97 == Static296.aClass234_104) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2787();
											local67 = Static26.aClass3_Sub5_Sub1_2.method2787();
											if (local67 == 65535) {
												local67 = -1;
											}
											local214 = Static26.aClass3_Sub5_Sub1_2.method2778();
											local218 = Static26.aClass3_Sub5_Sub1_2.method2726();
											local749 = Static26.aClass3_Sub5_Sub1_2.method2787();
											if (local749 == 65535) {
												local749 = -1;
											}
											if (Static305.method4701(local201)) {
												for (local755 = local67; local755 <= local749; local755++) {
													@Pc(4968) long local4968 = (long) local755 + ((long) local218 << 32);
													local4974 = (Class3_Sub42) Static230.aClass44_25.method942(local4968);
													@Pc(4990) Class3_Sub42 local4990;
													if (local4974 != null) {
														local4990 = new Class3_Sub42(local4974.anInt6291, local214);
														local4974.method5700();
													} else if (local755 == -1) {
														local4990 = new Class3_Sub42(Static115.method1862(local218).aClass3_Sub42_1.anInt6291, local214);
													} else {
														local4990 = new Class3_Sub42(0, local214);
													}
													Static230.aClass44_25.method948(local4968, local4990);
												}
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static187.aClass234_72 == Static296.aClass234_104) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2773();
											local67 = Static26.aClass3_Sub5_Sub1_2.method2787();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2767();
											if (Static305.method4701(local67)) {
												if (local201 == 2) {
													Static25.method312();
												}
												Static68.anInt1346 = local214;
												Static236.method3901(local214);
												Static45.method706(false);
												Static124.method2008(Static68.anInt1346);
												for (local218 = 0; local218 < 100; local218++) {
													Static109.aBooleanArray45[local218] = true;
												}
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static329.aClass234_112) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
											local67 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local1160 = (local67 & 0x1) == 1;
											Static219.method3669(local1160, local201);
											local218 = Static26.aClass3_Sub5_Sub1_2.method2767();
											for (local749 = 0; local749 < local218; local749++) {
												local755 = Static26.aClass3_Sub5_Sub1_2.method2767();
												local1044 = Static26.aClass3_Sub5_Sub1_2.method2735();
												if (local1044 == 255) {
													local1044 = Static26.aClass3_Sub5_Sub1_2.method2748();
												}
												Static355.method5331(local1160, local749, local1044, local755 - 1, local201);
											}
											Static257.anIntArray511[Static45.anInt804++ & 0x1F] = local201;
											Static296.aClass234_104 = null;
											return true;
										} else if (Static14.aClass234_8 == Static296.aClass234_104) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2747();
											local296 = Static26.aClass3_Sub5_Sub1_2.method2788();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2767();
											if (Static305.method4701(local214)) {
												Static202.method3147(local201, local296);
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static308.aClass234_108 == Static296.aClass234_104) {
											Static196.method4644(true);
											Static296.aClass234_104 = null;
											return true;
										} else if (Static182.aClass234_69 == Static296.aClass234_104) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2747();
											if (local201 == 65535) {
												local201 = -1;
											}
											local67 = Static26.aClass3_Sub5_Sub1_2.method2761();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2787();
											if (Static305.method4701(local214)) {
												Static230.method3809(local67, local201);
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static77.aClass234_34 == Static296.aClass234_104) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2761();
											local67 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2784();
											Static33.anIntArray56[local214] = local201;
											Static363.anIntArray663[local214] = local67;
											Static152.anIntArray299[local214] = 1;
											local218 = Static231.anIntArray440[local214] - 1;
											for (local749 = 0; local749 < local218; local749++) {
												if (Class189.anIntArray535[local749] <= local201) {
													Static152.anIntArray299[local214] = local749 + 2;
												}
											}
											Static47.anIntArray90[Static110.anInt2156++ & 0x1F] = local214;
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static153.aClass234_62) {
											Static293.method4554(Static156.aClass68_10);
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static104.aClass234_45) {
											Static162.method2508(Static26.aClass3_Sub5_Sub1_2, Static203.anInt3616, Static61.aClass156_1);
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static227.aClass234_82) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2767();
											local67 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local218 = Static26.aClass3_Sub5_Sub1_2.method2767();
											local749 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local755 = Static26.aClass3_Sub5_Sub1_2.method2739();
											if (Static305.method4701(local201)) {
												Static255.method4138(local218, local755, local214, local749, local67);
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static102.aClass234_44 == Static296.aClass234_104) {
											Static212.anInt3743 = Static26.aClass3_Sub5_Sub1_2.method2740();
											Static239.anInt5772 = Static28.anInt360;
											Static296.aClass234_104 = null;
											return true;
										} else if (Static66.aClass234_29 == Static296.aClass234_104) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2747();
											if (local201 == 65535) {
												local201 = -1;
											}
											local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2726();
											if (Static305.method4701(local67)) {
												Static142.method2271(local214, -1, local201, 2);
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static21.aClass234_9 == Static296.aClass234_104) {
											Static293.method4554(Static291.aClass68_13);
											Static296.aClass234_104 = null;
											return true;
										} else if (Static4.aClass234_1 == Static296.aClass234_104) {
											local201 = Static26.aClass3_Sub5_Sub1_2.method2787();
											local67 = Static26.aClass3_Sub5_Sub1_2.method2747();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2755();
											if (Static305.method4701(local67)) {
												Static15.method198(local214, local201);
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static328.aClass234_111) {
											Static293.method4554(Static48.aClass68_3);
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static61.aClass234_25) {
											Static258.method4173(Static26.aClass3_Sub5_Sub1_2.method2788());
											Static296.aClass234_104 = null;
											return true;
										} else if (Static356.aClass234_13 == Static296.aClass234_104) {
											if (Static68.anInt1346 != -1) {
												Static244.method3984(Static68.anInt1346, 0);
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static289.aClass234_100 == Static296.aClass234_104) {
											Static154.anInt6085 = Static26.aClass3_Sub5_Sub1_2.method2739();
											Static296.aClass234_104 = null;
											return true;
										} else if (Static79.aClass234_35 == Static296.aClass234_104) {
											local67 = Static26.aClass3_Sub5_Sub1_2.method2726();
											Static77.aClass133_2 = Static61.aClass156_1.method3652(local67);
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static136.aClass234_56) {
											Static53.method988();
											Static296.aClass234_104 = null;
											return false;
										} else if (Static296.aClass234_104 == Static61.aClass234_26) {
											local67 = Static26.aClass3_Sub5_Sub1_2.method2726();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2755();
											local218 = Static26.aClass3_Sub5_Sub1_2.method2778();
											if (local218 == 65535) {
												local218 = -1;
											}
											local749 = Static26.aClass3_Sub5_Sub1_2.method2778();
											local755 = Static26.aClass3_Sub5_Sub1_2.method2747();
											if (local755 == 65535) {
												local755 = -1;
											}
											if (Static305.method4701(local749)) {
												for (local1044 = local755; local1044 <= local218; local1044++) {
													local513 = ((long) local214 << 32) + ((long) local1044);
													@Pc(5588) Class3_Sub42 local5588 = (Class3_Sub42) Static230.aClass44_25.method942(local513);
													if (local5588 != null) {
														local4974 = new Class3_Sub42(local67, local5588.anInt6288);
														local5588.method5700();
													} else if (local1044 == -1) {
														local4974 = new Class3_Sub42(local67, Static115.method1862(local214).aClass3_Sub42_1.anInt6288);
													} else {
														local4974 = new Class3_Sub42(local67, -1);
													}
													Static230.aClass44_25.method948(local513, local4974);
												}
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static282.aClass234_99 == Static296.aClass234_104) {
											local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
											if (Static305.method4701(local67)) {
												Static358.method5344();
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static30.aClass234_14 == Static296.aClass234_104) {
											local67 = Static26.aClass3_Sub5_Sub1_2.method2767();
											local214 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local218 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local749 = Static26.aClass3_Sub5_Sub1_2.method2767();
											local755 = Static26.aClass3_Sub5_Sub1_2.method2739();
											local1044 = Static26.aClass3_Sub5_Sub1_2.method2739();
											if (Static305.method4701(local67)) {
												Static135.method2132(local749, local755, local214, true, local218, local1044);
											}
											Static296.aClass234_104 = null;
											return true;
										} else if (Static296.aClass234_104 == Static131.aClass234_51) {
											Static196.method4644(false);
											Static296.aClass234_104 = null;
											return true;
										} else {
											Static355.method5328("T1 - " + (Static296.aClass234_104 == null ? -1 : Static296.aClass234_104.method5350()) + "," + (Static222.aClass234_79 == null ? -1 : Static222.aClass234_79.method5350()) + "," + (Static12.aClass234_6 == null ? -1 : Static12.aClass234_6.method5350()) + " - " + Static203.anInt3616, null);
											Static53.method988();
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

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method5630(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static109.aClass20_32.anInt223 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static176.aClass78_3.anInt1957; local18++) {
			@Pc(25) Class51 local25 = Static176.aClass78_3.method1641(local18);
			if ((!arg0 || local25.aBoolean66) && local25.anInt1187 == -1 && local25.anInt1152 == -1 && local25.anInt1150 == 0 && local25.aString13.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static127.aShortArray44 = null;
					Static189.anInt3424 = -1;
					return;
				}
				if (local14.length <= local16) {
					@Pc(71) short[] local71 = new short[local14.length * 2];
					for (@Pc(73) int local73 = 0; local73 < local16; local73++) {
						local71[local73] = local14[local73];
					}
					local14 = local71;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static127.aShortArray44 = local14;
		Static290.anInt5036 = 0;
		Static189.anInt3424 = local16;
		@Pc(111) String[] local111 = new String[Static189.anInt3424];
		for (@Pc(113) int local113 = 0; local113 < Static189.anInt3424; local113++) {
			local111[local113] = Static176.aClass78_3.method1641(local14[local113]).aString13;
		}
		Static275.method4305(local111, Static127.aShortArray44);
		Static109.aClass20_32.method227();
		Static109.aClass20_32.anInt223 = 2;
	}
}
