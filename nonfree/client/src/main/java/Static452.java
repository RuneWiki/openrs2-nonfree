import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public static int anInt4834;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "Lclient!os;")
	public static final Class182 aClass182_164 = new Class182("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "[[B")
	public static final byte[][] aByteArrayArray35 = new byte[50][];

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Lclient!os;")
	public static final Class182 aClass182_165 = new Class182("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)Z")
	public static boolean method3894() throws IOException {
		if (Static160.aClass253_3 == null) {
			return false;
		}
		@Pc(15) int local15 = Static160.aClass253_3.method5486();
		if (local15 == 0) {
			return false;
		}
		@Pc(69) int local69;
		if (Static116.aClass217_52 == null) {
			if (Static359.aBoolean393) {
				local15--;
				Static160.aClass253_3.method5487(0, 1, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
				Static359.aBoolean393 = false;
				Static120.anInt2449++;
			}
			Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
			if (Static203.aClass10_Sub8_Sub2_1.method2524()) {
				if (local15 == 0) {
					return false;
				}
				local15--;
				Static160.aClass253_3.method5487(1, 1, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
				Static120.anInt2449++;
			}
			Static359.aBoolean393 = true;
			@Pc(65) Class217[] local65 = Static353.method4778();
			local69 = Static203.aClass10_Sub8_Sub2_1.method2533();
			if (local69 < 0 || local65.length <= local69) {
				throw new IOException("invo:" + local69 + " ip:" + Static203.aClass10_Sub8_Sub2_1.anInt2989);
			}
			Static116.aClass217_52 = local65[local69];
			Static10.anInt154 = Static116.aClass217_52.anInt6152;
		}
		if (Static10.anInt154 == -1) {
			if (local15 <= 0) {
				return false;
			}
			Static160.aClass253_3.method5487(0, 1, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
			local15--;
			Static120.anInt2449++;
			Static10.anInt154 = Static203.aClass10_Sub8_Sub2_1.aByteArray44[0] & 0xFF;
		}
		if (Static10.anInt154 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static160.aClass253_3.method5487(0, 2, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
			Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
			local15 -= 2;
			Static10.anInt154 = Static203.aClass10_Sub8_Sub2_1.method2485();
			Static120.anInt2449 += 2;
		}
		if (Static10.anInt154 > local15) {
			return false;
		}
		Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
		Static160.aClass253_3.method5487(0, Static10.anInt154, Static203.aClass10_Sub8_Sub2_1.aByteArray44);
		Static320.aClass217_120 = Static163.aClass217_73;
		Static120.anInt2449 += Static10.anInt154;
		Static262.anInt4660 = 0;
		Static163.aClass217_73 = Static440.aClass217_161;
		Static440.aClass217_161 = Static116.aClass217_52;
		@Pc(239) int local239;
		@Pc(243) int local243;
		@Pc(211) boolean local211;
		@Pc(215) String local215;
		@Pc(217) String local217;
		@Pc(228) long local228;
		@Pc(233) long local233;
		@Pc(253) int local253;
		if (Static116.aClass217_52 == Static288.aClass217_113) {
			local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
			local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
			local217 = local215;
			if (local211) {
				local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
			}
			local228 = Static203.aClass10_Sub8_Sub2_1.method2485();
			local233 = Static203.aClass10_Sub8_Sub2_1.method2507();
			local239 = Static203.aClass10_Sub8_Sub2_1.method2502();
			local243 = Static203.aClass10_Sub8_Sub2_1.method2485();
			@Pc(249) long local249 = (local228 << 32) + local233;
			@Pc(251) boolean local251 = false;
			local253 = 0;
			while (true) {
				if (local253 >= 100) {
					if (local239 <= 1 && Static47.method837(local217)) {
						local251 = true;
					}
					break;
				}
				if (local249 == Static378.aLongArray8[local253]) {
					local251 = true;
					break;
				}
				local253++;
			}
			if (!local251 && Static197.anInt3947 == 0) {
				Static378.aLongArray8[Static205.anInt4031] = local249;
				Static205.anInt4031 = (Static205.anInt4031 + 1) % 100;
				@Pc(307) String local307 = Static42.aClass248_1.method5371(local243).method3860(Static203.aClass10_Sub8_Sub2_1);
				if (local239 == 2) {
					Static178.method2949(local243, null, local307, "<img=1>" + local217, 0, "<img=1>" + local215, 18);
				} else if (local239 == 1) {
					Static178.method2949(local243, null, local307, "<img=0>" + local217, 0, "<img=0>" + local215, 18);
				} else {
					Static178.method2949(local243, null, local307, local217, 0, local215, 18);
				}
			}
			Static116.aClass217_52 = null;
			return true;
		} else if (Static116.aClass217_52 == Static205.aClass217_89) {
			Static70.anInt1479 = Static203.aClass10_Sub8_Sub2_1.method2502();
			Static116.aClass217_52 = null;
			Static80.anInt1678 = Static193.anInt3856;
			return true;
		} else {
			@Pc(398) int local398;
			if (Static60.aClass217_155 == Static116.aClass217_52) {
				local398 = Static203.aClass10_Sub8_Sub2_1.method2471();
				local69 = Static203.aClass10_Sub8_Sub2_1.method2486();
				if (Static42.method653(local398)) {
					Static227.anInt3925 = local69;
				}
				Static116.aClass217_52 = null;
				return true;
			} else if (Static5.aClass217_3 == Static116.aClass217_52) {
				Static172.method2923(false);
				Static116.aClass217_52 = null;
				return false;
			} else {
				@Pc(663) int local663;
				@Pc(454) int local454;
				@Pc(458) int local458;
				@Pc(460) String local460;
				@Pc(747) String local747;
				@Pc(503) boolean local503;
				@Pc(462) boolean local462;
				@Pc(711) String local711;
				if (Static255.aClass217_102 == Static116.aClass217_52) {
					while (Static10.anInt154 > Static203.aClass10_Sub8_Sub2_1.anInt2989) {
						local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
						local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
						local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
						local454 = Static203.aClass10_Sub8_Sub2_1.method2485();
						local458 = Static203.aClass10_Sub8_Sub2_1.method2502();
						local460 = "";
						local462 = false;
						if (local454 > 0) {
							local460 = Static203.aClass10_Sub8_Sub2_1.method2478();
							local462 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
						}
						for (local239 = 0; local239 < Static60.anInt7169; local239++) {
							if (local211) {
								if (local217.equals(Static325.aStringArray36[local239])) {
									Static325.aStringArray36[local239] = local215;
									Static347.aStringArray40[local239] = local217;
									local215 = null;
									break;
								}
							} else if (local215.equals(Static325.aStringArray36[local239])) {
								if (Static9.anIntArray8[local239] != local454) {
									local503 = true;
									for (@Pc(508) Class40_Sub2_Sub2 local508 = (Class40_Sub2_Sub2) Static392.aClass240_6.method5227(); local508 != null; local508 = (Class40_Sub2_Sub2) Static392.aClass240_6.method5230()) {
										if (local508.aString36.equals(local215)) {
											if (local454 != 0 && local508.aShort68 == 0) {
												local503 = false;
												local508.method4364();
											} else if (local454 == 0 && local508.aShort68 != 0) {
												local503 = false;
												local508.method4364();
											}
										}
									}
									if (local503) {
										Static392.aClass240_6.method5225(new Class40_Sub2_Sub2(local215, local454));
									}
									Static9.anIntArray8[local239] = local454;
								}
								Static347.aStringArray40[local239] = local217;
								Static447.aStringArray48[local239] = local460;
								Static137.anIntArray286[local239] = local458;
								Static417.aBooleanArray23[local239] = local462;
								local215 = null;
								break;
							}
						}
						if (local215 != null && Static60.anInt7169 < 200) {
							Static325.aStringArray36[Static60.anInt7169] = local215;
							Static347.aStringArray40[Static60.anInt7169] = local217;
							Static9.anIntArray8[Static60.anInt7169] = local454;
							Static447.aStringArray48[Static60.anInt7169] = local460;
							Static137.anIntArray286[Static60.anInt7169] = local458;
							Static417.aBooleanArray23[Static60.anInt7169] = local462;
							Static60.anInt7169++;
						}
					}
					Static320.anInt5509 = Static193.anInt3856;
					Static265.anInt4693 = 2;
					local69 = Static60.anInt7169;
					while (local69 > 0) {
						local211 = true;
						local69--;
						for (local663 = 0; local663 < local69; local663++) {
							if (Static9.anIntArray8[local663] != Static87.aClass21_2.anInt407 && Static87.aClass21_2.anInt407 == Static9.anIntArray8[local663 + 1] || Static9.anIntArray8[local663] == 0 && Static9.anIntArray8[local663 + 1] != 0) {
								local454 = Static9.anIntArray8[local663];
								Static9.anIntArray8[local663] = Static9.anIntArray8[local663 + 1];
								Static9.anIntArray8[local663 + 1] = local454;
								local711 = Static447.aStringArray48[local663];
								Static447.aStringArray48[local663] = Static447.aStringArray48[local663 + 1];
								Static447.aStringArray48[local663 + 1] = local711;
								local460 = Static325.aStringArray36[local663];
								Static325.aStringArray36[local663] = Static325.aStringArray36[local663 + 1];
								Static325.aStringArray36[local663 + 1] = local460;
								local747 = Static347.aStringArray40[local663];
								Static347.aStringArray40[local663] = Static347.aStringArray40[local663 + 1];
								Static347.aStringArray40[local663 + 1] = local747;
								local239 = Static137.anIntArray286[local663];
								Static137.anIntArray286[local663] = Static137.anIntArray286[local663 + 1];
								Static137.anIntArray286[local663 + 1] = local239;
								local503 = Static417.aBooleanArray23[local663];
								Static417.aBooleanArray23[local663] = Static417.aBooleanArray23[local663 + 1];
								local211 = false;
								Static417.aBooleanArray23[local663 + 1] = local503;
							}
						}
						if (local211) {
							break;
						}
					}
					Static116.aClass217_52 = null;
					return true;
				} else if (Static39.aClass217_22 == Static116.aClass217_52) {
					Static150.method2588(Static191.aClass168_17);
					Static116.aClass217_52 = null;
					return true;
				} else {
					@Pc(859) Class10_Sub21 local859;
					if (Static116.aClass217_52 == Static12.aClass217_9) {
						local398 = Static203.aClass10_Sub8_Sub2_1.method2498();
						local69 = Static203.aClass10_Sub8_Sub2_1.method2459();
						local663 = Static203.aClass10_Sub8_Sub2_1.method2503();
						local454 = Static203.aClass10_Sub8_Sub2_1.method2471();
						if (Static42.method653(local398)) {
							local859 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local69);
							if (local859 != null) {
								Static153.method2607(false, local859, local454 != local859.anInt3646);
							}
							Static28.method369(local663, local69, local454, false);
						}
						Static116.aClass217_52 = null;
						return true;
					}
					@Pc(946) int local946;
					if (Static331.aClass217_124 == Static116.aClass217_52) {
						Static242.anInt5737 = Static203.aClass10_Sub8_Sub2_1.method2476() << 3;
						Static296.anInt5132 = Static203.aClass10_Sub8_Sub2_1.method2483();
						Static343.anInt5854 = Static203.aClass10_Sub8_Sub2_1.method2460() << 3;
						for (@Pc(913) Class10_Sub14 local913 = (Class10_Sub14) Static293.aClass167_21.method3702(); local913 != null; local913 = (Class10_Sub14) Static293.aClass167_21.method3708()) {
							local69 = (int) (local913.aLong264 >> 28 & 0x3L);
							local663 = (int) (local913.aLong264 & 0x3FFFL);
							local454 = local663 - Static168.anInt3353;
							local458 = (int) (local913.aLong264 >> 14 & 0x3FFFL);
							local946 = local458 - Static72.anInt1488;
							if (Static296.anInt5132 == local69 && Static242.anInt5737 <= local454 && Static242.anInt5737 + 8 > local454 && Static343.anInt5854 <= local946 && local946 < Static343.anInt5854 + 8) {
								local913.method6033();
								if (local454 >= 0 && local946 >= 0 && local454 < Static2.anInt7 && Static17.anInt315 > local946) {
									Static179.method2955(Static296.anInt5132, local946, local454);
								}
							}
						}
						for (@Pc(1013) Class10_Sub33 local1013 = (Class10_Sub33) Static418.aClass163_44.method3620(); local1013 != null; local1013 = (Class10_Sub33) Static418.aClass163_44.method3621()) {
							if (Static242.anInt5737 <= local1013.anInt5100 && local1013.anInt5100 < Static242.anInt5737 + 8 && Static343.anInt5854 <= local1013.anInt5108 && local1013.anInt5108 < Static343.anInt5854 + 8 && local1013.anInt5109 == Static296.anInt5132) {
								local1013.anInt5095 = 0;
							}
						}
						Static116.aClass217_52 = null;
						return true;
					}
					@Pc(1072) String local1072;
					if (Static116.aClass217_52 == Static362.aClass217_135) {
						local1072 = Static203.aClass10_Sub8_Sub2_1.method2478();
						local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
						local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
						if (Static42.method653(local663)) {
							Static323.method4424(local69, local1072);
						}
						Static116.aClass217_52 = null;
						return true;
					} else if (Static116.aClass217_52 == Static6.aClass217_4) {
						local398 = Static203.aClass10_Sub8_Sub2_1.method2468();
						local69 = Static203.aClass10_Sub8_Sub2_1.method2520();
						local663 = Static203.aClass10_Sub8_Sub2_1.method2468();
						local454 = Static203.aClass10_Sub8_Sub2_1.method2498();
						if (Static42.method653(local454)) {
							Static12.method169(local69, 5, local663, local398);
						}
						Static116.aClass217_52 = null;
						return true;
					} else if (Static260.aClass217_103 == Static116.aClass217_52) {
						local398 = Static203.aClass10_Sub8_Sub2_1.method2471();
						local69 = Static203.aClass10_Sub8_Sub2_1.method2471();
						local663 = Static203.aClass10_Sub8_Sub2_1.method2459();
						if (Static42.method653(local69)) {
							Static127.method2216(local663, local398);
						}
						Static116.aClass217_52 = null;
						return true;
					} else {
						@Pc(1211) long local1211;
						@Pc(1228) Class10_Sub38 local1228;
						@Pc(1217) Class10_Sub38 local1217;
						if (Static223.aClass217_94 == Static116.aClass217_52) {
							local398 = Static203.aClass10_Sub8_Sub2_1.method2498();
							if (local398 == 65535) {
								local398 = -1;
							}
							local69 = Static203.aClass10_Sub8_Sub2_1.method2459();
							local663 = Static203.aClass10_Sub8_Sub2_1.method2498();
							local454 = Static203.aClass10_Sub8_Sub2_1.method2498();
							local458 = Static203.aClass10_Sub8_Sub2_1.method2520();
							if (local458 == 65535) {
								local458 = -1;
							}
							if (Static42.method653(local454)) {
								for (local946 = local458; local946 <= local398; local946++) {
									local1211 = (long) local946 + ((long) local69 << 32);
									local1217 = (Class10_Sub38) Static25.aClass167_7.method3709(local1211);
									if (local1217 != null) {
										local1228 = new Class10_Sub38(local1217.anInt5644, local663);
										local1217.method6033();
									} else if (local946 == -1) {
										local1228 = new Class10_Sub38(Static40.method557(local69).aClass10_Sub38_1.anInt5644, local663);
									} else {
										local1228 = new Class10_Sub38(0, local663);
									}
									Static25.aClass167_7.method3705(local1228, local1211);
								}
							}
							Static116.aClass217_52 = null;
							return true;
						} else if (Static209.aClass217_91 == Static116.aClass217_52) {
							local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
							local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
							local663 = Static203.aClass10_Sub8_Sub2_1.method2502();
							local454 = Static203.aClass10_Sub8_Sub2_1.method2485() << 0;
							local458 = Static203.aClass10_Sub8_Sub2_1.method2502();
							local946 = Static203.aClass10_Sub8_Sub2_1.method2502();
							if (Static42.method653(local398)) {
								Static6.method51(local946, local69, local458, true, local454, local663);
							}
							Static116.aClass217_52 = null;
							return true;
						} else if (Static116.aClass217_52 == Static147.aClass217_66) {
							Static255.method3706(Static171.aClass159_1, Static203.aClass10_Sub8_Sub2_1, Static10.anInt154);
							Static116.aClass217_52 = null;
							return true;
						} else {
							@Pc(1341) byte local1341;
							if (Static116.aClass217_52 == Static180.aClass217_81) {
								local398 = Static203.aClass10_Sub8_Sub2_1.method2498();
								local1341 = Static203.aClass10_Sub8_Sub2_1.method2481();
								local663 = Static203.aClass10_Sub8_Sub2_1.method2520();
								if (Static42.method653(local663)) {
									Static11.method165(local1341, local398);
								}
								Static116.aClass217_52 = null;
								return true;
							}
							@Pc(1379) boolean local1379;
							if (Static116.aClass217_52 == Static200.aClass217_88) {
								local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
								local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
								local1379 = (local69 & 0x1) == 1;
								while (Static203.aClass10_Sub8_Sub2_1.anInt2989 < Static10.anInt154) {
									local454 = Static203.aClass10_Sub8_Sub2_1.method2469();
									local458 = Static203.aClass10_Sub8_Sub2_1.method2485();
									local946 = 0;
									if (local458 != 0) {
										local946 = Static203.aClass10_Sub8_Sub2_1.method2502();
										if (local946 == 255) {
											local946 = Static203.aClass10_Sub8_Sub2_1.method2459();
										}
									}
									Static26.method341(local398, local454, local458 - 1, local1379, local946);
								}
								Static48.anIntArray71[Static253.anInt4566++ & 0x1F] = local398;
								Static116.aClass217_52 = null;
								return true;
							} else if (Static116.aClass217_52 == Static268.aClass217_110) {
								Static150.method2588(Static233.aClass168_20);
								Static116.aClass217_52 = null;
								return true;
							} else if (Static116.aClass217_52 == Static250.aClass217_101) {
								local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
								if (local398 == 65535) {
									local398 = -1;
								}
								local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
								local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
								local454 = Static203.aClass10_Sub8_Sub2_1.method2502();
								Static458.method6073(local454, local398, local69, local663);
								Static116.aClass217_52 = null;
								return true;
							} else if (Static116.aClass217_52 == Static284.aClass217_112) {
								local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
								local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
								@Pc(1498) Object[] local1498 = new Object[local215.length() + 1];
								for (local454 = local215.length() - 1; local454 >= 0; local454--) {
									if (local215.charAt(local454) == 's') {
										local1498[local454 + 1] = Static203.aClass10_Sub8_Sub2_1.method2478();
									} else {
										local1498[local454 + 1] = Integer.valueOf(Static203.aClass10_Sub8_Sub2_1.method2459());
									}
								}
								local1498[0] = Integer.valueOf(Static203.aClass10_Sub8_Sub2_1.method2459());
								if (Static42.method653(local398)) {
									@Pc(1551) Class10_Sub40 local1551 = new Class10_Sub40();
									local1551.anObjectArray36 = local1498;
									Static79.method1501(local1551);
								}
								Static116.aClass217_52 = null;
								return true;
							} else if (Static116.aClass217_52 == Static189.aClass217_84) {
								Static150.method2588(Static366.aClass168_32);
								Static116.aClass217_52 = null;
								return true;
							} else {
								@Pc(1610) int local1610;
								if (Static116.aClass217_52 == Static279.aClass217_111) {
									local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
									local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
									local1379 = (local69 & 0x1) == 1;
									Static239.method3392(local1379, local398);
									local454 = Static203.aClass10_Sub8_Sub2_1.method2485();
									for (local458 = 0; local458 < local454; local458++) {
										local946 = Static203.aClass10_Sub8_Sub2_1.method2520();
										local1610 = Static203.aClass10_Sub8_Sub2_1.method2502();
										if (local1610 == 255) {
											local1610 = Static203.aClass10_Sub8_Sub2_1.method2487();
										}
										Static26.method341(local398, local458, local946 - 1, local1379, local1610);
									}
									Static48.anIntArray71[Static253.anInt4566++ & 0x1F] = local398;
									Static116.aClass217_52 = null;
									return true;
								} else if (Static116.aClass217_52 == Static244.aClass217_106) {
									if (Static189.anInt3826 != -1) {
										Static209.method3246(Static189.anInt3826, 0);
									}
									Static116.aClass217_52 = null;
									return true;
								} else if (Static388.aClass217_56 == Static116.aClass217_52) {
									Static98.method1773(true);
									Static116.aClass217_52 = null;
									return true;
								} else if (Static264.aClass217_104 == Static116.aClass217_52) {
									local398 = Static203.aClass10_Sub8_Sub2_1.method2498();
									local69 = Static203.aClass10_Sub8_Sub2_1.method2512();
									local663 = Static203.aClass10_Sub8_Sub2_1.method2515();
									local454 = Static203.aClass10_Sub8_Sub2_1.method2477();
									if (Static42.method653(local398)) {
										Static410.method5396(local663, local454, local69);
									}
									Static116.aClass217_52 = null;
									return true;
								} else if (Static116.aClass217_52 == Static432.aClass217_159) {
									local398 = Static203.aClass10_Sub8_Sub2_1.method2468();
									local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
									if (local69 == 65535) {
										local69 = -1;
									}
									local663 = Static203.aClass10_Sub8_Sub2_1.method2459();
									local454 = Static203.aClass10_Sub8_Sub2_1.method2498();
									if (Static42.method653(local454)) {
										Static294.method5895(local663, local69, local398);
										@Pc(1751) Class60 local1751 = Static313.aClass272_2.method6068(local69);
										Static25.method335(local1751.anInt1696, local1751.anInt1693, local1751.anInt1681, local663);
										Static241.method3527(local1751.anInt1721, local1751.anInt1733, local1751.anInt1706, local663);
									}
									Static116.aClass217_52 = null;
									return true;
								} else if (Static380.aClass217_139 == Static116.aClass217_52) {
									local398 = Static203.aClass10_Sub8_Sub2_1.method2520();
									local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
									local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
									if (Static42.method653(local663)) {
										Static439.method5805(local69, local398);
									}
									Static116.aClass217_52 = null;
									return true;
								} else if (Static116.aClass217_52 == Static121.aClass217_54) {
									if (Static207.method3218(Static358.anInt6086)) {
										Static326.anInt5600 = (int) ((float) Static203.aClass10_Sub8_Sub2_1.method2485() * 2.5F);
									} else {
										Static326.anInt5600 = Static203.aClass10_Sub8_Sub2_1.method2485() * 30;
									}
									Static80.anInt1678 = Static193.anInt3856;
									Static116.aClass217_52 = null;
									return true;
								} else {
									@Pc(1868) boolean local1868;
									if (Static306.aClass217_118 == Static116.aClass217_52) {
										local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
										local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
										local217 = local215;
										if (local211) {
											local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
										}
										local454 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local458 = Static203.aClass10_Sub8_Sub2_1.method2485();
										local1868 = false;
										if (local454 <= 1 && Static47.method837(local217)) {
											local1868 = true;
										}
										if (!local1868 && Static197.anInt3947 == 0) {
											local747 = Static42.aClass248_1.method5371(local458).method3860(Static203.aClass10_Sub8_Sub2_1);
											if (local454 == 2) {
												Static178.method2949(local458, null, local747, "<img=1>" + local217, 0, "<img=1>" + local215, 25);
											} else if (local454 == 1) {
												Static178.method2949(local458, null, local747, "<img=0>" + local217, 0, "<img=0>" + local215, 25);
											} else {
												Static178.method2949(local458, null, local747, local217, 0, local215, 25);
											}
										}
										Static116.aClass217_52 = null;
										return true;
									} else if (Static24.aClass217_12 == Static116.aClass217_52) {
										local398 = Static203.aClass10_Sub8_Sub2_1.method2502();
										if (Static203.aClass10_Sub8_Sub2_1.method2502() == 0) {
											Static154.aClass233Array1[local398] = new Class233();
										} else {
											Static203.aClass10_Sub8_Sub2_1.anInt2989--;
											Static154.aClass233Array1[local398] = new Class233(Static203.aClass10_Sub8_Sub2_1);
										}
										Static281.anInt6556 = Static193.anInt3856;
										Static116.aClass217_52 = null;
										return true;
									} else if (Static192.aClass217_86 == Static116.aClass217_52) {
										local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
										local69 = Static203.aClass10_Sub8_Sub2_1.method2520();
										local663 = Static203.aClass10_Sub8_Sub2_1.method2487();
										if (Static42.method653(local69)) {
											Static11.method165(local663, local398);
										}
										Static116.aClass217_52 = null;
										return true;
									} else if (Static116.aClass217_52 == Static159.aClass217_71) {
										Static286.anInt5019 = Static203.aClass10_Sub8_Sub2_1.method2492();
										Static80.anInt1678 = Static193.anInt3856;
										Static116.aClass217_52 = null;
										return true;
									} else if (Static330.aClass217_48 == Static116.aClass217_52) {
										Static432.method5718();
										Static116.aClass217_52 = null;
										return false;
									} else if (Static406.aClass217_144 == Static116.aClass217_52) {
										Static197.method3132();
										Static116.aClass217_52 = null;
										return true;
									} else if (Static116.aClass217_52 == Static49.aClass217_32) {
										local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
										local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local663 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local454 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local458 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local946 = Static203.aClass10_Sub8_Sub2_1.method2485();
										if (Static42.method653(local398)) {
											Static65.aBooleanArray1[local69] = true;
											Static335.anIntArray554[local69] = local663;
											Static443.anIntArray727[local69] = local454;
											Static448.anIntArray680[local69] = local458;
											Static397.anIntArray657[local69] = local946;
										}
										Static116.aClass217_52 = null;
										return true;
									} else if (Static116.aClass217_52 == Static328.aClass217_158) {
										Static150.method2588(Static124.aClass168_9);
										Static116.aClass217_52 = null;
										return true;
									} else if (Static409.aClass217_145 == Static116.aClass217_52) {
										local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
										if (local398 == 65535) {
											local398 = -1;
										}
										local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
										local454 = Static203.aClass10_Sub8_Sub2_1.method2502();
										Static349.method4740(local69, local454, local398, local663);
										Static116.aClass217_52 = null;
										return true;
									} else if (Static116.aClass217_52 == Static437.aClass217_157) {
										local398 = Static203.aClass10_Sub8_Sub2_1.method2520();
										if (local398 == 65535) {
											local398 = -1;
										}
										local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
										local663 = Static203.aClass10_Sub8_Sub2_1.method2468();
										if (Static42.method653(local69)) {
											Static66.method1098(local663, local398);
										}
										Static116.aClass217_52 = null;
										return true;
									} else if (Static35.aClass217_20 == Static116.aClass217_52) {
										Static150.method2588(Static326.aClass168_27);
										Static116.aClass217_52 = null;
										return true;
									} else if (Static116.aClass217_52 == Static5.aClass217_2) {
										Static203.aClass10_Sub8_Sub2_1.anInt2989 += 28;
										if (Static203.aClass10_Sub8_Sub2_1.method2511()) {
											Static414.method5440(Static203.aClass10_Sub8_Sub2_1.anInt2989 - 28, Static203.aClass10_Sub8_Sub2_1);
										}
										Static116.aClass217_52 = null;
										return true;
									} else if (Static456.aClass217_163 == Static116.aClass217_52) {
										Static107.anInt2161 = Static203.aClass10_Sub8_Sub2_1.method2502();
										for (local398 = 0; local398 < Static107.anInt2161; local398++) {
											Static369.aStringArray44[local398] = Static203.aClass10_Sub8_Sub2_1.method2478();
											Static321.aStringArray35[local398] = Static203.aClass10_Sub8_Sub2_1.method2478();
											if (Static321.aStringArray35[local398].equals("")) {
												Static321.aStringArray35[local398] = Static369.aStringArray44[local398];
											}
											Static99.aStringArray17[local398] = Static203.aClass10_Sub8_Sub2_1.method2478();
											Static225.aStringArray57[local398] = Static203.aClass10_Sub8_Sub2_1.method2478();
											if (Static225.aStringArray57[local398].equals("")) {
												Static225.aStringArray57[local398] = Static99.aStringArray17[local398];
											}
											Static414.aBooleanArray21[local398] = false;
										}
										Static320.anInt5509 = Static193.anInt3856;
										Static116.aClass217_52 = null;
										return true;
									} else if (Static116.aClass217_52 == Static98.aClass217_45) {
										local398 = Static203.aClass10_Sub8_Sub2_1.method2471();
										if (local398 == 65535) {
											local398 = -1;
										}
										local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local663 = Static203.aClass10_Sub8_Sub2_1.method2502();
										Static365.method2560(local663, local69, local398);
										Static116.aClass217_52 = null;
										return true;
									} else if (Static116.aClass217_52 == Static163.aClass217_74) {
										local398 = Static203.aClass10_Sub8_Sub2_1.method2502();
										local69 = Static203.aClass10_Sub8_Sub2_1.method2495();
										local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
										if (local663 == 65535) {
											local663 = -1;
										}
										Static411.method5408(local69, local398, local663);
										Static116.aClass217_52 = null;
										return true;
									} else {
										@Pc(2423) int local2423;
										@Pc(2419) long local2419;
										@Pc(2434) int local2434;
										if (Static116.aClass217_52 == Static132.aClass217_59) {
											local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
											local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
											local217 = local215;
											if (local211) {
												local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
											}
											local228 = Static203.aClass10_Sub8_Sub2_1.method2521();
											local233 = Static203.aClass10_Sub8_Sub2_1.method2485();
											local2419 = Static203.aClass10_Sub8_Sub2_1.method2507();
											local2423 = Static203.aClass10_Sub8_Sub2_1.method2502();
											@Pc(2430) long local2430 = (local233 << 32) + local2419;
											@Pc(2432) boolean local2432 = false;
											local2434 = 0;
											while (true) {
												if (local2434 >= 100) {
													if (local2423 <= 1) {
														if (Static376.aBoolean422 && !Static111.aBoolean380 || Static269.aBoolean320) {
															local2432 = true;
														} else if (Static47.method837(local217)) {
															local2432 = true;
														}
													}
													break;
												}
												if (local2430 == Static378.aLongArray8[local2434]) {
													local2432 = true;
													break;
												}
												local2434++;
											}
											if (!local2432 && Static197.anInt3947 == 0) {
												Static378.aLongArray8[Static205.anInt4031] = local2430;
												Static205.anInt4031 = (Static205.anInt4031 + 1) % 100;
												@Pc(2496) String local2496 = Static391.method5206(Static415.method5451(Static203.aClass10_Sub8_Sub2_1));
												if (local2423 == 2 || local2423 == 3) {
													Static178.method2949(-1, Static178.method2950(local228), local2496, "<img=1>" + local217, 0, "<img=1>" + local215, 9);
												} else if (local2423 == 1) {
													Static178.method2949(-1, Static178.method2950(local228), local2496, "<img=0>" + local217, 0, "<img=0>" + local215, 9);
												} else {
													Static178.method2949(-1, Static178.method2950(local228), local2496, local217, 0, local215, 9);
												}
											}
											Static116.aClass217_52 = null;
											return true;
										}
										@Pc(2591) String local2591;
										if (Static116.aClass217_52 == Static300.aClass217_115) {
											local398 = Static203.aClass10_Sub8_Sub2_1.method2469();
											local69 = Static203.aClass10_Sub8_Sub2_1.method2459();
											local663 = Static203.aClass10_Sub8_Sub2_1.method2502();
											local2591 = "";
											local711 = local2591;
											if ((local663 & 0x1) != 0) {
												local2591 = Static203.aClass10_Sub8_Sub2_1.method2478();
												if ((local663 & 0x2) == 0) {
													local711 = local2591;
												} else {
													local711 = Static203.aClass10_Sub8_Sub2_1.method2478();
												}
											}
											local460 = Static203.aClass10_Sub8_Sub2_1.method2478();
											if (local398 == 99) {
												Static16.method251(local460);
											} else if (local711.equals("") || !Static47.method837(local711)) {
												Static104.method1823(local2591, local69, local460, local711, local398);
											} else {
												Static116.aClass217_52 = null;
												return true;
											}
											Static116.aClass217_52 = null;
											return true;
										} else if (Static154.aClass217_69 == Static116.aClass217_52) {
											local398 = Static203.aClass10_Sub8_Sub2_1.method2471();
											local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
											local663 = Static203.aClass10_Sub8_Sub2_1.method2498();
											local454 = Static203.aClass10_Sub8_Sub2_1.method2487();
											if (Static42.method653(local398)) {
												Static258.method3721((local663 << 16) + local69, local454);
											}
											Static116.aClass217_52 = null;
											return true;
										} else if (Static21.aClass217_11 == Static116.aClass217_52) {
											local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
											if (local398 == 65535) {
												local398 = -1;
											}
											local69 = Static203.aClass10_Sub8_Sub2_1.method2486();
											local663 = Static203.aClass10_Sub8_Sub2_1.method2486();
											local2591 = Static203.aClass10_Sub8_Sub2_1.method2478();
											if (local69 >= 1 && local69 <= 8) {
												if (local2591.equalsIgnoreCase("null")) {
													local2591 = null;
												}
												Static456.aStringArray58[local69 - 1] = local2591;
												Static268.anIntArray479[local69 - 1] = local398;
												Static215.aBooleanArray12[local69 - 1] = local663 == 0;
											}
											Static116.aClass217_52 = null;
											return true;
										} else if (Static116.aClass217_52 == Static383.aClass217_140) {
											local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
											local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
											local663 = Static203.aClass10_Sub8_Sub2_1.method2515();
											if (Static42.method653(local69)) {
												Static251.method4760(local663, local398);
											}
											Static116.aClass217_52 = null;
											return true;
										} else if (Static116.aClass217_52 == Static114.aClass217_51) {
											local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
											local1341 = Static203.aClass10_Sub8_Sub2_1.method2476();
											Static329.aClass201_9.method4479(local1341, local398);
											Static116.aClass217_52 = null;
											return true;
										} else {
											@Pc(2856) int local2856;
											if (Static324.aClass217_121 == Static116.aClass217_52) {
												local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
												local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
												local217 = local215;
												if (local211) {
													local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
												}
												local228 = Static203.aClass10_Sub8_Sub2_1.method2485();
												local233 = Static203.aClass10_Sub8_Sub2_1.method2507();
												local239 = Static203.aClass10_Sub8_Sub2_1.method2502();
												@Pc(2852) long local2852 = (local228 << 32) + local233;
												@Pc(2854) boolean local2854 = false;
												local2856 = 0;
												while (true) {
													if (local2856 >= 100) {
														if (local239 <= 1) {
															if (Static376.aBoolean422 && !Static111.aBoolean380 || Static269.aBoolean320) {
																local2854 = true;
															} else if (Static47.method837(local217)) {
																local2854 = true;
															}
														}
														break;
													}
													if (local2852 == Static378.aLongArray8[local2856]) {
														local2854 = true;
														break;
													}
													local2856++;
												}
												if (!local2854 && Static197.anInt3947 == 0) {
													Static378.aLongArray8[Static205.anInt4031] = local2852;
													Static205.anInt4031 = (Static205.anInt4031 + 1) % 100;
													@Pc(2920) String local2920 = Static391.method5206(Static415.method5451(Static203.aClass10_Sub8_Sub2_1));
													if (local239 == 2) {
														Static178.method2949(-1, null, local2920, "<img=1>" + local217, 0, "<img=1>" + local215, 7);
													} else if (local239 == 1) {
														Static178.method2949(-1, null, local2920, "<img=0>" + local217, 0, "<img=0>" + local215, 7);
													} else {
														Static178.method2949(-1, null, local2920, local217, 0, local215, 3);
													}
												}
												Static116.aClass217_52 = null;
												return true;
											} else if (Static106.aClass217_46 == Static116.aClass217_52) {
												for (local398 = 0; local398 < Static360.aClass24_Sub3_Sub2_Sub2Array1.length; local398++) {
													if (Static360.aClass24_Sub3_Sub2_Sub2Array1[local398] != null) {
														Static360.aClass24_Sub3_Sub2_Sub2Array1[local398].anInt6211 = -1;
													}
												}
												for (local69 = 0; local69 < Static134.anInt2764; local69++) {
													Static149.aClass10_Sub26Array1[local69].aClass24_Sub3_Sub2_Sub1_2.anInt6211 = -1;
												}
												Static116.aClass217_52 = null;
												return true;
											} else if (Static182.aClass217_83 == Static116.aClass217_52) {
												local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
												local69 = Static203.aClass10_Sub8_Sub2_1.method2486();
												Static329.aClass201_9.method4486(local398, local69);
												Static116.aClass217_52 = null;
												return true;
											} else if (Static116.aClass217_52 == Static51.aClass217_33) {
												Static166.anInt3290 = Static203.aClass10_Sub8_Sub2_1.method2502();
												Static116.aClass217_52 = null;
												return true;
											} else if (Static116.aClass217_52 == Static156.aClass217_70) {
												local398 = Static203.aClass10_Sub8_Sub2_1.method2471();
												local69 = Static203.aClass10_Sub8_Sub2_1.method2503();
												local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
												if (Static42.method653(local398)) {
													if (local69 == 2) {
														Static100.method1780();
													}
													Static189.anInt3826 = local663;
													Static228.method3399(local663);
													Static241.method3528(false);
													Static79.method1503(Static189.anInt3826);
													for (local454 = 0; local454 < 100; local454++) {
														Static432.aBooleanArray24[local454] = true;
													}
												}
												Static116.aClass217_52 = null;
												return true;
											} else {
												@Pc(3317) Class113 local3317;
												if (Static40.aClass217_25 == Static116.aClass217_52) {
													Static20.anInt356 = Static193.anInt3856;
													if (Static10.anInt154 == 0) {
														Static247.aClass113Array1 = null;
														Static222.aString35 = null;
														Static249.aString47 = null;
														Static207.anInt4058 = 0;
														Static116.aClass217_52 = null;
														return true;
													}
													Static249.aString47 = Static203.aClass10_Sub8_Sub2_1.method2478();
													local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
													if (local211) {
														Static203.aClass10_Sub8_Sub2_1.method2478();
													}
													@Pc(3160) long local3160 = Static203.aClass10_Sub8_Sub2_1.method2521();
													Static222.aString35 = Static330.method1927(local3160);
													Static155.aByte28 = Static203.aClass10_Sub8_Sub2_1.method2460();
													local454 = Static203.aClass10_Sub8_Sub2_1.method2502();
													if (local454 == 255) {
														Static116.aClass217_52 = null;
														return true;
													}
													Static207.anInt4058 = local454;
													@Pc(3186) Class113[] local3186 = new Class113[100];
													for (local946 = 0; local946 < Static207.anInt4058; local946++) {
														local3186[local946] = new Class113();
														local3186[local946].aString22 = Static203.aClass10_Sub8_Sub2_1.method2478();
														local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
														if (local211) {
															local3186[local946].aString23 = Static203.aClass10_Sub8_Sub2_1.method2478();
														} else {
															local3186[local946].aString23 = local3186[local946].aString22;
														}
														local3186[local946].aString25 = Static179.method2957(local3186[local946].aString23);
														local3186[local946].anInt3223 = Static203.aClass10_Sub8_Sub2_1.method2485();
														local3186[local946].aByte29 = Static203.aClass10_Sub8_Sub2_1.method2460();
														local3186[local946].aString24 = Static203.aClass10_Sub8_Sub2_1.method2478();
														if (local3186[local946].aString23.equals(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58)) {
															Static302.aByte63 = local3186[local946].aByte29;
														}
													}
													local243 = Static207.anInt4058;
													while (local243 > 0) {
														local462 = true;
														local243--;
														for (local2423 = 0; local2423 < local243; local2423++) {
															if (local3186[local2423].aString25.compareTo(local3186[local2423 + 1].aString25) > 0) {
																local3317 = local3186[local2423];
																local3186[local2423] = local3186[local2423 + 1];
																local462 = false;
																local3186[local2423 + 1] = local3317;
															}
														}
														if (local462) {
															break;
														}
													}
													Static247.aClass113Array1 = local3186;
													Static116.aClass217_52 = null;
													return true;
												} else if (Static375.aClass217_138 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2515();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2492();
													if (Static42.method653(local69)) {
														Static222.method3354(local398, local663);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static84.aClass217_40) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2498();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2459();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2520();
													local454 = Static203.aClass10_Sub8_Sub2_1.method2471();
													local458 = Static203.aClass10_Sub8_Sub2_1.method2520();
													if (Static42.method653(local458)) {
														Static25.method335(local398, local454, local663, local69);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static342.aClass217_129 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2502();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2502();
													local454 = Static203.aClass10_Sub8_Sub2_1.method2485() << 0;
													local458 = Static203.aClass10_Sub8_Sub2_1.method2502();
													local946 = Static203.aClass10_Sub8_Sub2_1.method2502();
													if (Static42.method653(local398)) {
														Static443.method5909(local454, local458, local663, local946, local69);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static425.aClass217_156 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2487();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
													if (Static42.method653(local69)) {
														Static12.method169(-1, 3, -1, local398);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static243.aClass217_99) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
													if (Static42.method653(local398)) {
														Static83.method1602();
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static72.aClass217_38) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2459();
													if (Static42.method653(local398)) {
														@Pc(3534) Class10_Sub21 local3534 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local69);
														if (local3534 != null) {
															Static153.method2607(false, local3534, true);
														}
														if (Static378.aClass89_13 != null) {
															Static135.method5400(Static378.aClass89_13);
															Static378.aClass89_13 = null;
														}
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static273.aClass217_107) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2498();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2483();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2498();
													@Pc(3576) Class10_Sub26 local3576 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local398);
													if (local3576 != null) {
														Static200.method3159(local663, local3576.aClass24_Sub3_Sub2_Sub1_2, local69);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static277.aClass217_108 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local454 = Static203.aClass10_Sub8_Sub2_1.method2485();
													if (Static42.method653(local398) && Static166.aClass89ArrayArray2[local69] != null) {
														for (local458 = local663; local458 < local454; local458++) {
															local946 = Static203.aClass10_Sub8_Sub2_1.method2507();
															if (local458 < Static166.aClass89ArrayArray2[local69].length && Static166.aClass89ArrayArray2[local69][local458] != null) {
																Static166.aClass89ArrayArray2[local69][local458].anInt2740 = local946;
															}
														}
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static113.aClass217_50) {
													Static150.method2588(Static437.aClass168_39);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static92.aClass217_44 == Static116.aClass217_52) {
													Static242.anInt5737 = Static203.aClass10_Sub8_Sub2_1.method2476() << 3;
													Static296.anInt5132 = Static203.aClass10_Sub8_Sub2_1.method2502();
													Static343.anInt5854 = Static203.aClass10_Sub8_Sub2_1.method2476() << 3;
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static4.aClass217_128) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2502();
													@Pc(3707) boolean local3707 = (local398 & 0x1) == 1;
													local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
													local2591 = Static203.aClass10_Sub8_Sub2_1.method2478();
													if (local2591.equals("")) {
														local2591 = local217;
													}
													local711 = Static203.aClass10_Sub8_Sub2_1.method2478();
													local460 = Static203.aClass10_Sub8_Sub2_1.method2478();
													if (local460.equals("")) {
														local460 = local711;
													}
													if (local3707) {
														for (local1610 = 0; local1610 < Static107.anInt2161; local1610++) {
															if (Static321.aStringArray35[local1610].equals(local460)) {
																Static369.aStringArray44[local1610] = local217;
																Static321.aStringArray35[local1610] = local2591;
																Static99.aStringArray17[local1610] = local711;
																Static225.aStringArray57[local1610] = local460;
																break;
															}
														}
													} else {
														Static369.aStringArray44[Static107.anInt2161] = local217;
														Static321.aStringArray35[Static107.anInt2161] = local2591;
														Static99.aStringArray17[Static107.anInt2161] = local711;
														Static225.aStringArray57[Static107.anInt2161] = local460;
														Static414.aBooleanArray21[Static107.anInt2161] = (local398 & 0x2) == 2;
														Static107.anInt2161++;
													}
													Static320.anInt5509 = Static193.anInt3856;
													Static116.aClass217_52 = null;
													return true;
												} else if (Static373.aClass217_137 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2487();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
													Static329.aClass201_9.method4479(local398, local69);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static335.aClass217_126) {
													Static369.anInt6375 = Static203.aClass10_Sub8_Sub2_1.method2502();
													Static35.anInt576 = Static203.aClass10_Sub8_Sub2_1.method2483();
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static226.aClass217_96) {
													Static456.anInt7588 = Static203.aClass10_Sub8_Sub2_1.method2508();
													Static376.aBoolean422 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static168.aClass217_77) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2520();
													if (local398 == 65535) {
														local398 = -1;
													}
													local69 = Static203.aClass10_Sub8_Sub2_1.method2520();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2459();
													if (Static42.method653(local69)) {
														Static12.method169(local398, 1, -1, local663);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static47.aClass217_31 == Static116.aClass217_52) {
													Static343.anInt5854 = Static203.aClass10_Sub8_Sub2_1.method2481() << 3;
													Static242.anInt5737 = Static203.aClass10_Sub8_Sub2_1.method2475() << 3;
													Static296.anInt5132 = Static203.aClass10_Sub8_Sub2_1.method2483();
													while (Static10.anInt154 > Static203.aClass10_Sub8_Sub2_1.anInt2989) {
														@Pc(3931) Class168 local3931 = Static276.method2516()[Static203.aClass10_Sub8_Sub2_1.method2502()];
														Static150.method2588(local3931);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static40.aClass217_26) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2515();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2487();
													if (Static42.method653(local69)) {
														@Pc(3972) Class10_Sub21 local3972 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local663);
														local859 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local398);
														if (local859 != null) {
															Static153.method2607(false, local859, local3972 == null || local3972.anInt3646 != local859.anInt3646);
														}
														if (local3972 != null) {
															local3972.method6033();
															Static114.aClass167_12.method3705(local3972, (long) local398);
														}
														@Pc(4014) Class89 local4014 = Static40.method557(local663);
														if (local4014 != null) {
															Static135.method5400(local4014);
														}
														local4014 = Static40.method557(local398);
														if (local4014 != null) {
															Static135.method5400(local4014);
															Static344.method4658(true, local4014);
														}
														if (Static189.anInt3826 != -1) {
															Static209.method3246(Static189.anInt3826, 1);
														}
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static382.aClass217_153) {
													local1072 = Static203.aClass10_Sub8_Sub2_1.method2478();
													local215 = Static391.method5206(Static415.method5451(Static203.aClass10_Sub8_Sub2_1));
													Static104.method1823(local1072, 0, local215, local1072, 6);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static125.aClass217_57 == Static116.aClass217_52) {
													Static150.method2588(Static90.aClass168_8);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static235.aClass217_97) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2498();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2515();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2520();
													if (local663 == 65535) {
														local663 = -1;
													}
													if (Static42.method653(local398)) {
														Static12.method169(local663, 2, -1, local69);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static89.aClass217_41 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
													if (Static42.method653(local398)) {
														Static96.method1754();
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static300.aClass217_116 == Static116.aClass217_52) {
													Static150.method2588(Static410.aClass168_35);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static226.aClass217_95 == Static116.aClass217_52) {
													Static150.method2588(Static230.aClass168_19);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static137.aClass217_62) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2486();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2487();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2503();
													Static117.anIntArray215[local663] = local69;
													Static277.anIntArray474[local663] = local398;
													Static29.anIntArray46[local663] = 1;
													local454 = Static350.anIntArray573[local663] - 1;
													for (local458 = 0; local458 < local454; local458++) {
														if (local69 >= Class255.anIntArray684[local458]) {
															Static29.anIntArray46[local663] = local458 + 2;
														}
													}
													Static50.anIntArray73[Static180.anInt3686++ & 0x1F] = local663;
													Static116.aClass217_52 = null;
													return true;
												} else if (Static456.aClass217_164 == Static116.aClass217_52) {
													Static172.method2923(Static258.aBoolean308);
													Static116.aClass217_52 = null;
													return false;
												} else if (Static419.aClass217_149 == Static116.aClass217_52) {
													local1072 = Static203.aClass10_Sub8_Sub2_1.method2478();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2520();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2520();
													if (Static42.method653(local69)) {
														Static323.method4424(local663, local1072);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static418.aClass217_147) {
													Static437.method5693(Static10.anInt154, Static203.aClass10_Sub8_Sub2_1);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static90.aClass217_42 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2459();
													Static297.aClass270_5 = Static171.aClass159_1.method3512(local398);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static134.aClass217_60 == Static116.aClass217_52) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2486();
													local69 = local398 >> 2;
													local663 = local398 & 0x3;
													local454 = Static164.anIntArray417[local69];
													local458 = Static203.aClass10_Sub8_Sub2_1.method2487();
													local946 = local458 >> 28 & 0x3;
													local1610 = local458 >> 14 & 0x3FFF;
													local239 = local458 & 0x3FFF;
													local243 = Static203.aClass10_Sub8_Sub2_1.method2471();
													if (local243 == 65535) {
														local243 = -1;
													}
													local1610 -= Static168.anInt3353;
													local239 -= Static72.anInt1488;
													Static104.method1824(local69, local454, local1610, local946, local239, local243, local663);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static276.aClass217_63) {
													Static330.method1926();
													Static116.aClass217_52 = null;
													return false;
												} else if (Static116.aClass217_52 == Static27.aClass217_13) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2498();
													local663 = Static203.aClass10_Sub8_Sub2_1.method2520();
													local454 = Static203.aClass10_Sub8_Sub2_1.method2468();
													local458 = Static203.aClass10_Sub8_Sub2_1.method2498();
													if (Static42.method653(local458)) {
														Static12.method169(local398 | local663 << 16, 7, local69, local454);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static116.aClass217_52 == Static148.aClass217_67) {
													local398 = Static203.aClass10_Sub8_Sub2_1.method2515();
													local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
													if (Static42.method653(local69)) {
														Static12.method169(Static245.anInt4435, 5, 0, local398);
													}
													Static116.aClass217_52 = null;
													return true;
												} else if (Static29.aClass217_19 == Static116.aClass217_52) {
													Static150.method2588(Static379.aClass168_6);
													Static116.aClass217_52 = null;
													return true;
												} else if (Static190.aClass217_85 == Static116.aClass217_52) {
													if (Static95.aFrame1 != null) {
														Static215.method3290(-1, Static361.aClass85_Sub1_1.anInt2483, -1, false);
													}
													@Pc(4458) byte[] local4458 = new byte[Static10.anInt154];
													Static203.aClass10_Sub8_Sub2_1.method2529(local4458, Static10.anInt154);
													local215 = Static254.method3689(0, local4458, Static10.anInt154);
													Static373.method4984(Static423.anInt7114 == 1, true, Static171.aClass159_1, local215);
													Static116.aClass217_52 = null;
													return true;
												} else {
													@Pc(4535) int local4535;
													if (Static311.aClass217_119 == Static116.aClass217_52) {
														local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
														local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
														local217 = local215;
														if (local211) {
															local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
														}
														local228 = Static203.aClass10_Sub8_Sub2_1.method2521();
														local233 = Static203.aClass10_Sub8_Sub2_1.method2485();
														local2419 = Static203.aClass10_Sub8_Sub2_1.method2507();
														local2423 = Static203.aClass10_Sub8_Sub2_1.method2502();
														local4535 = Static203.aClass10_Sub8_Sub2_1.method2485();
														@Pc(4541) long local4541 = local2419 + (local233 << 32);
														@Pc(4543) boolean local4543 = false;
														@Pc(4545) int local4545 = 0;
														while (true) {
															if (local4545 >= 100) {
																if (local2423 <= 1 && Static47.method837(local217)) {
																	local4543 = true;
																}
																break;
															}
															if (Static378.aLongArray8[local4545] == local4541) {
																local4543 = true;
																break;
															}
															local4545++;
														}
														if (!local4543 && Static197.anInt3947 == 0) {
															Static378.aLongArray8[Static205.anInt4031] = local4541;
															Static205.anInt4031 = (Static205.anInt4031 + 1) % 100;
															@Pc(4594) String local4594 = Static42.aClass248_1.method5371(local4535).method3860(Static203.aClass10_Sub8_Sub2_1);
															if (local2423 == 2) {
																Static178.method2949(local4535, Static178.method2950(local228), local4594, "<img=1>" + local217, 0, "<img=1>" + local215, 20);
															} else if (local2423 == 1) {
																Static178.method2949(local4535, Static178.method2950(local228), local4594, "<img=0>" + local217, 0, "<img=0>" + local215, 20);
															} else {
																Static178.method2949(local4535, Static178.method2950(local228), local4594, local217, 0, local215, 20);
															}
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static199.aClass217_90) {
														local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
														local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
														local217 = local215;
														if (local211) {
															local217 = Static203.aClass10_Sub8_Sub2_1.method2478();
														}
														local454 = Static203.aClass10_Sub8_Sub2_1.method2502();
														@Pc(4697) boolean local4697 = false;
														if (local454 <= 1) {
															if (Static376.aBoolean422 && !Static111.aBoolean380 || Static269.aBoolean320) {
																local4697 = true;
															} else if (local454 <= 1 && Static47.method837(local217)) {
																local4697 = true;
															}
														}
														if (!local4697 && Static197.anInt3947 == 0) {
															local460 = Static391.method5206(Static415.method5451(Static203.aClass10_Sub8_Sub2_1));
															if (local454 == 2) {
																Static178.method2949(-1, null, local460, "<img=1>" + local217, 0, "<img=1>" + local215, 24);
															} else if (local454 == 1) {
																Static178.method2949(-1, null, local460, "<img=0>" + local217, 0, "<img=0>" + local215, 24);
															} else {
																Static178.method2949(-1, null, local460, local217, 0, local215, 24);
															}
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static39.aClass217_21 == Static116.aClass217_52) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2515();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2471();
														local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
														if (local663 == 65535) {
															local663 = -1;
														}
														local454 = Static203.aClass10_Sub8_Sub2_1.method2468();
														local458 = Static203.aClass10_Sub8_Sub2_1.method2471();
														if (local458 == 65535) {
															local458 = -1;
														}
														if (Static42.method653(local69)) {
															for (local946 = local458; local946 <= local663; local946++) {
																local1211 = (long) local946 + ((long) local398 << 32);
																local1217 = (Class10_Sub38) Static25.aClass167_7.method3709(local1211);
																if (local1217 != null) {
																	local1228 = new Class10_Sub38(local454, local1217.anInt5651);
																	local1217.method6033();
																} else if (local946 == -1) {
																	local1228 = new Class10_Sub38(local454, Static40.method557(local398).aClass10_Sub38_1.anInt5651);
																} else {
																	local1228 = new Class10_Sub38(local454, -1);
																}
																Static25.aClass167_7.method3705(local1228, local1211);
															}
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static456.aClass217_162 == Static116.aClass217_52) {
														Static150.method2588(Static367.aClass168_33);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static377.aClass217_8 == Static116.aClass217_52) {
														Static150.method2588(Static247.aClass168_23);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static422.aClass217_152) {
														Static175.aString13 = Static10.anInt154 > 2 ? Static203.aClass10_Sub8_Sub2_1.method2478() : Static239.aClass182_145.method4155(Static191.anInt3842);
														Static286.anInt5020 = Static10.anInt154 <= 0 ? -1 : Static203.aClass10_Sub8_Sub2_1.method2485();
														Static116.aClass217_52 = null;
														if (Static286.anInt5020 == 65535) {
															Static286.anInt5020 = -1;
														}
														return true;
													} else if (Static116.aClass217_52 == Static91.aClass217_43) {
														Static258.method3719(Static203.aClass10_Sub8_Sub2_1.method2478());
														Static116.aClass217_52 = null;
														return true;
													} else if (Static135.aClass217_146 == Static116.aClass217_52) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2486();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2471();
														local1379 = (local398 & 0x1) == 1;
														Static190.method3038(local69, local1379);
														Static48.anIntArray71[Static253.anInt4566++ & 0x1F] = local69;
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static162.aClass217_72) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2502();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2503();
														if (local398 == 255) {
															local398 = -1;
															local69 = -1;
														}
														Static169.method2820(local398, local69);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static438.aClass217_160) {
														Static150.method2588(Static168.aClass168_14);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static17.aClass217_10 == Static116.aClass217_52) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2515();
														local663 = Static203.aClass10_Sub8_Sub2_1.method2520();
														if (Static42.method653(local398)) {
															Static450.method5995(local663, local69);
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static354.aClass217_133 == Static116.aClass217_52) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2485();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2515();
														local663 = Static203.aClass10_Sub8_Sub2_1.method2503();
														if (Static42.method653(local398)) {
															Static80.method1515(local663, local69);
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static110.aClass217_49) {
														Static150.method2588(Static61.aClass168_7);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static180.aClass217_82) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2502();
														local69 = local398 >> 5;
														local663 = local398 & 0x1F;
														if (local663 == 0) {
															Static362.aClass65Array1[local69] = null;
															Static116.aClass217_52 = null;
															return true;
														}
														@Pc(5156) Class65 local5156 = new Class65();
														local5156.anInt1850 = local663;
														local5156.anInt1854 = Static203.aClass10_Sub8_Sub2_1.method2502();
														if (local5156.anInt1854 >= 0 && Static320.aClass80Array18.length > local5156.anInt1854) {
															if (local5156.anInt1850 == 1 || local5156.anInt1850 == 10) {
																local5156.anInt1856 = Static203.aClass10_Sub8_Sub2_1.method2485();
																Static203.aClass10_Sub8_Sub2_1.anInt2989 += 6;
															} else if (local5156.anInt1850 >= 2 && local5156.anInt1850 <= 6) {
																if (local5156.anInt1850 == 2) {
																	local5156.anInt1855 = 64;
																	local5156.anInt1860 = 64;
																}
																if (local5156.anInt1850 == 3) {
																	local5156.anInt1860 = 64;
																	local5156.anInt1855 = 0;
																}
																if (local5156.anInt1850 == 4) {
																	local5156.anInt1860 = 64;
																	local5156.anInt1855 = 128;
																}
																if (local5156.anInt1850 == 5) {
																	local5156.anInt1855 = 64;
																	local5156.anInt1860 = 0;
																}
																if (local5156.anInt1850 == 6) {
																	local5156.anInt1855 = 64;
																	local5156.anInt1860 = 128;
																}
																local5156.anInt1850 = 2;
																local5156.anInt1851 = Static203.aClass10_Sub8_Sub2_1.method2502();
																local5156.anInt1855 += Static203.aClass10_Sub8_Sub2_1.method2485() - Static168.anInt3353 << 7;
																local5156.anInt1860 += Static203.aClass10_Sub8_Sub2_1.method2485() - Static72.anInt1488 << 7;
																local5156.anInt1859 = Static203.aClass10_Sub8_Sub2_1.method2502() << 0;
																local5156.anInt1852 = Static203.aClass10_Sub8_Sub2_1.method2485();
															}
															local5156.anInt1857 = Static203.aClass10_Sub8_Sub2_1.method2485();
															if (local5156.anInt1857 == 65535) {
																local5156.anInt1857 = -1;
															}
															Static362.aClass65Array1[local69] = local5156;
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static392.aClass217_142 == Static116.aClass217_52) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2515();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2498();
														Static329.aClass201_9.method4486(local69, local398);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static211.aClass217_92 == Static116.aClass217_52) {
														Static98.method1773(false);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static334.aClass217_125 == Static116.aClass217_52) {
														local1072 = Static203.aClass10_Sub8_Sub2_1.method2478();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
														local217 = Static42.aClass248_1.method5371(local69).method3860(Static203.aClass10_Sub8_Sub2_1);
														Static178.method2949(local69, null, local217, local1072, 0, local1072, 19);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static390.aClass217_141) {
														local1072 = Static203.aClass10_Sub8_Sub2_1.method2478();
														local1379 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
														if (local1379) {
															local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
														} else {
															local215 = local1072;
														}
														local454 = Static203.aClass10_Sub8_Sub2_1.method2485();
														@Pc(5422) byte local5422 = Static203.aClass10_Sub8_Sub2_1.method2460();
														local1868 = false;
														if (local5422 == -128) {
															local1868 = true;
														}
														if (local1868) {
															if (Static207.anInt4058 == 0) {
																Static116.aClass217_52 = null;
																return true;
															}
															for (local1610 = 0; Static207.anInt4058 > local1610 && (!Static247.aClass113Array1[local1610].aString23.equals(local215) || Static247.aClass113Array1[local1610].anInt3223 != local454); local1610++) {
															}
															if (local1610 < Static207.anInt4058) {
																while (Static207.anInt4058 - 1 > local1610) {
																	Static247.aClass113Array1[local1610] = Static247.aClass113Array1[local1610 + 1];
																	local1610++;
																}
																Static207.anInt4058--;
																Static247.aClass113Array1[Static207.anInt4058] = null;
															}
														} else {
															local747 = Static203.aClass10_Sub8_Sub2_1.method2478();
															local3317 = new Class113();
															local3317.aString22 = local1072;
															local3317.aString23 = local215;
															local3317.aString25 = Static179.method2957(local3317.aString23);
															local3317.aString24 = local747;
															local3317.anInt3223 = local454;
															local3317.aByte29 = local5422;
															for (local243 = Static207.anInt4058 - 1; local243 >= 0; local243--) {
																local2423 = Static247.aClass113Array1[local243].aString25.compareTo(local3317.aString25);
																if (local2423 == 0) {
																	Static247.aClass113Array1[local243].anInt3223 = local454;
																	Static247.aClass113Array1[local243].aByte29 = local5422;
																	Static247.aClass113Array1[local243].aString24 = local747;
																	if (local215.equals(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58)) {
																		Static302.aByte63 = local5422;
																	}
																	Static116.aClass217_52 = null;
																	Static20.anInt356 = Static193.anInt3856;
																	return true;
																}
																if (local2423 < 0) {
																	break;
																}
															}
															if (Static247.aClass113Array1.length <= Static207.anInt4058) {
																Static116.aClass217_52 = null;
																return true;
															}
															for (local2423 = Static207.anInt4058 - 1; local2423 > local243; local2423--) {
																Static247.aClass113Array1[local2423 + 1] = Static247.aClass113Array1[local2423];
															}
															if (Static207.anInt4058 == 0) {
																Static247.aClass113Array1 = new Class113[100];
															}
															Static247.aClass113Array1[local243 + 1] = local3317;
															Static207.anInt4058++;
															if (local215.equals(Static263.aClass24_Sub3_Sub2_Sub2_4.aString58)) {
																Static302.aByte63 = local5422;
															}
														}
														Static116.aClass217_52 = null;
														Static20.anInt356 = Static193.anInt3856;
														return true;
													} else if (Static116.aClass217_52 == Static346.aClass217_132) {
														Static150.method2588(Static277.aClass168_25);
														Static116.aClass217_52 = null;
														return true;
													} else if (Static126.aClass217_58 == Static116.aClass217_52) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2459();
														local69 = Static203.aClass10_Sub8_Sub2_1.method2485();
														local663 = Static203.aClass10_Sub8_Sub2_1.method2485();
														local454 = Static203.aClass10_Sub8_Sub2_1.method2483();
														local458 = Static203.aClass10_Sub8_Sub2_1.method2498();
														local1868 = (local454 & 0x80) != 0;
														if (local398 >> 30 == 0) {
															@Pc(5914) Class137 local5914;
															@Pc(5893) Class156 local5893;
															@Pc(5908) Class137 local5908;
															if (local398 >> 29 != 0) {
																local1610 = local398 & 0xFFFF;
																@Pc(6118) Class10_Sub26 local6118 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local1610);
																if (local6118 != null) {
																	@Pc(6123) Class24_Sub3_Sub2_Sub1 local6123 = local6118.aClass24_Sub3_Sub2_Sub1_2;
																	if (local458 == 65535) {
																		local458 = -1;
																	}
																	@Pc(6130) boolean local6130 = true;
																	local4535 = local1868 ? local6123.anInt6270 : local6123.anInt6274;
																	if (local458 != -1 && local4535 != -1) {
																		if (local458 == local4535) {
																			local5893 = Static147.aClass107_1.method2639(local458);
																			if (local5893.aBoolean289 && local5893.anInt4316 != -1) {
																				local5908 = Static281.aClass98_3.method2405(local5893.anInt4316);
																				local2434 = local5908.anInt4039;
																				if (local2434 == 0 || local2434 == 2) {
																					local6130 = false;
																				} else if (local2434 == 1) {
																					local6130 = true;
																				}
																			}
																		} else {
																			local5893 = Static147.aClass107_1.method2639(local458);
																			@Pc(6162) Class156 local6162 = Static147.aClass107_1.method2639(local4535);
																			if (local5893.anInt4316 != -1 && local6162.anInt4316 != -1) {
																				local5914 = Static281.aClass98_3.method2405(local5893.anInt4316);
																				@Pc(6182) Class137 local6182 = Static281.aClass98_3.method2405(local6162.anInt4316);
																				if (local5914.anInt4040 < local6182.anInt4040) {
																					local6130 = false;
																				}
																			}
																		}
																	}
																	if (local6130) {
																		if (local1868) {
																			local6123.anInt6237 = 0;
																			local6123.anInt6221 = Static400.anInt6752 + local69;
																			local6123.anInt6273 = 1;
																			local6123.anInt6245 = local663;
																			local6123.anInt6279 = local454 & 0x7;
																			local6123.anInt6216 = 0;
																			local6123.anInt6270 = local458;
																			if (local6123.anInt6221 > Static400.anInt6752) {
																				local6123.anInt6237 = -1;
																			}
																			if (local6123.anInt6270 != -1 && local6123.anInt6221 == Static400.anInt6752) {
																				local2856 = Static147.aClass107_1.method2639(local6123.anInt6270).anInt4316;
																				if (local2856 != -1) {
																					local5908 = Static281.aClass98_3.method2405(local2856);
																					if (local5908 != null && local5908.anIntArray403 != null) {
																						Static302.method4200(local5908, local6123.anInt7092, local6123.anInt7094, local6123.aByte98, 0, false);
																					}
																				}
																			}
																		} else {
																			local6123.anInt6240 = local69 + Static400.anInt6752;
																			local6123.anInt6223 = 1;
																			local6123.anInt6233 = 0;
																			local6123.anInt6235 = local454 & 0x7;
																			local6123.anInt6274 = local458;
																			local6123.anInt6229 = local663;
																			local6123.anInt6210 = 0;
																			if (local6123.anInt6240 > Static400.anInt6752) {
																				local6123.anInt6210 = -1;
																			}
																			if (local6123.anInt6274 != -1 && local6123.anInt6240 == Static400.anInt6752) {
																				local2856 = Static147.aClass107_1.method2639(local6123.anInt6274).anInt4316;
																				if (local2856 != -1) {
																					local5908 = Static281.aClass98_3.method2405(local2856);
																					if (local5908 != null && local5908.anIntArray403 != null) {
																						Static302.method4200(local5908, local6123.anInt7092, local6123.anInt7094, local6123.aByte98, 0, false);
																					}
																				}
																			}
																		}
																	}
																}
															} else if (local398 >> 28 != 0) {
																local1610 = local398 & 0xFFFF;
																@Pc(5805) Class24_Sub3_Sub2_Sub2 local5805;
																if (local1610 == Static245.anInt4435) {
																	local5805 = Static263.aClass24_Sub3_Sub2_Sub2_4;
																} else {
																	local5805 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local1610];
																}
																if (local5805 != null) {
																	if (local458 == 65535) {
																		local458 = -1;
																	}
																	local503 = true;
																	local2423 = local1868 ? local5805.anInt6270 : local5805.anInt6274;
																	@Pc(5860) Class137 local5860;
																	if (local458 != -1 && local2423 != -1) {
																		@Pc(5847) Class156 local5847;
																		if (local2423 == local458) {
																			local5847 = Static147.aClass107_1.method2639(local458);
																			if (local5847.aBoolean289 && local5847.anInt4316 != -1) {
																				local5860 = Static281.aClass98_3.method2405(local5847.anInt4316);
																				local253 = local5860.anInt4039;
																				if (local253 == 0 || local253 == 2) {
																					local503 = false;
																				} else if (local253 == 1) {
																					local503 = true;
																				}
																			}
																		} else {
																			local5847 = Static147.aClass107_1.method2639(local458);
																			local5893 = Static147.aClass107_1.method2639(local2423);
																			if (local5847.anInt4316 != -1 && local5893.anInt4316 != -1) {
																				local5908 = Static281.aClass98_3.method2405(local5847.anInt4316);
																				local5914 = Static281.aClass98_3.method2405(local5893.anInt4316);
																				if (local5908.anInt4040 < local5914.anInt4040) {
																					local503 = false;
																				}
																			}
																		}
																	}
																	if (local503) {
																		if (local1868) {
																			local5805.anInt6270 = local458;
																			local5805.anInt6221 = Static400.anInt6752 + local69;
																			local5805.anInt6279 = local454 & 0x7;
																			local5805.anInt6237 = 0;
																			local5805.anInt6273 = 1;
																			local5805.anInt6245 = local663;
																			local5805.anInt6216 = 0;
																			if (local5805.anInt6270 == 65535) {
																				local5805.anInt6270 = -1;
																			}
																			if (Static400.anInt6752 < local5805.anInt6221) {
																				local5805.anInt6237 = -1;
																			}
																			if (local5805.anInt6270 != -1 && Static400.anInt6752 == local5805.anInt6221) {
																				local4535 = Static147.aClass107_1.method2639(local5805.anInt6270).anInt4316;
																				if (local4535 != -1) {
																					local5860 = Static281.aClass98_3.method2405(local4535);
																					if (local5860 != null && local5860.anIntArray403 != null) {
																						Static302.method4200(local5860, local5805.anInt7092, local5805.anInt7094, local5805.aByte98, 0, Static263.aClass24_Sub3_Sub2_Sub2_4 == local5805);
																					}
																				}
																			}
																		} else {
																			local5805.anInt6229 = local663;
																			local5805.anInt6274 = local458;
																			local5805.anInt6235 = local454 & 0x7;
																			local5805.anInt6210 = 0;
																			local5805.anInt6240 = Static400.anInt6752 + local69;
																			local5805.anInt6223 = 1;
																			local5805.anInt6233 = 0;
																			if (Static400.anInt6752 < local5805.anInt6240) {
																				local5805.anInt6210 = -1;
																			}
																			if (local5805.anInt6274 == 65535) {
																				local5805.anInt6274 = -1;
																			}
																			if (local5805.anInt6274 != -1 && local5805.anInt6240 == Static400.anInt6752) {
																				local4535 = Static147.aClass107_1.method2639(local5805.anInt6274).anInt4316;
																				if (local4535 != -1) {
																					local5860 = Static281.aClass98_3.method2405(local4535);
																					if (local5860 != null && local5860.anIntArray403 != null) {
																						Static302.method4200(local5860, local5805.anInt7092, local5805.anInt7094, local5805.aByte98, 0, Static263.aClass24_Sub3_Sub2_Sub2_4 == local5805);
																					}
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local1610 = local398 >> 28 & 0x3;
															local239 = (local398 >> 14 & 0x3FFF) - Static168.anInt3353;
															local243 = (local398 & 0x3FFF) - Static72.anInt1488;
															if (local239 >= 0 && local243 >= 0 && local239 < Static2.anInt7 && Static17.anInt315 > local243) {
																local2423 = local239 * 128 + 64;
																local4535 = local243 * 128 + 64;
																local2856 = local1610;
																if (local1610 < 3 && Static178.method2948(local243, local239)) {
																	local2856 = local1610 + 1;
																}
																@Pc(5774) Class24_Sub3_Sub1 local5774 = new Class24_Sub3_Sub1(local458, 0, Static400.anInt6752, local1610, local2856, local2423, Static326.method4459(local1610, local2423, local4535) - local663, local4535, local239, local239, local243, local243, local454);
																Static91.aClass163_16.method3613(new Class10_Sub1_Sub6(local5774));
															}
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static362.aClass217_134) {
														Static329.aClass201_9.method4481();
														Static116.aClass217_52 = null;
														Static76.anInt1552 += 32;
														return true;
													} else if (Static70.aClass217_37 == Static116.aClass217_52) {
														Static320.anInt5509 = Static193.anInt3856;
														Static116.aClass217_52 = null;
														Static265.anInt4693 = 1;
														return true;
													} else if (Static116.aClass217_52 == Static118.aClass217_53) {
														Static78.aClass153_2 = Static258.method3718(Static203.aClass10_Sub8_Sub2_1.method2502());
														Static116.aClass217_52 = null;
														return true;
													} else if (Static150.aClass217_68 == Static116.aClass217_52) {
														local398 = Static203.aClass10_Sub8_Sub2_1.method2487();
														local215 = Static203.aClass10_Sub8_Sub2_1.method2478();
														local663 = Static203.aClass10_Sub8_Sub2_1.method2471();
														if (Static42.method653(local663)) {
															Static268.method3931(local215, local398);
														}
														Static116.aClass217_52 = null;
														return true;
													} else if (Static116.aClass217_52 == Static290.aClass217_114) {
														local211 = Static203.aClass10_Sub8_Sub2_1.method2502() == 1;
														@Pc(6478) byte[] local6478 = new byte[Static10.anInt154 - 1];
														Static203.aClass10_Sub8_Sub2_1.method2493(Static10.anInt154 - 1, local6478);
														Static397.method5272(local211, local6478);
														Static116.aClass217_52 = null;
														return true;
													} else {
														Static432.method5720("T1 - " + (Static116.aClass217_52 == null ? -1 : Static116.aClass217_52.method4861()) + "," + (Static163.aClass217_73 == null ? -1 : Static163.aClass217_73.method4861()) + "," + (Static320.aClass217_120 == null ? -1 : Static320.aClass217_120.method4861()) + " - " + Static10.anInt154, null);
														Static172.method2923(false);
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
