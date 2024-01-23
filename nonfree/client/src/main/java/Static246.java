import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!t", name = "pc", descriptor = "I")
	public static int anInt5145;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	public static int anInt5064 = 0;

	@OriginalMember(owner = "client!t", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString247 = "Connection lost.";

	@OriginalMember(owner = "client!t", name = "S", descriptor = "Z")
	public static boolean aBoolean422 = true;

	@OriginalMember(owner = "client!t", name = "rb", descriptor = "Lclient!ec;")
	public static Class46 aClass46_33 = new Class46(64);

	@OriginalMember(owner = "client!t", name = "Tb", descriptor = "I")
	public static int anInt5126 = 0;

	@OriginalMember(owner = "client!t", name = "oc", descriptor = "[J")
	public static long[] aLongArray21 = new long[32];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!jd;II)Lclient!h;")
	public static Class2_Sub14 method4090(@OriginalArg(0) Class84 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2146(arg1);
		return local13 == null ? null : new Class2_Sub14(local13);
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(B)V")
	private static void method4091() {
		@Pc(13) int local13;
		@Pc(27) int local27;
		@Pc(19) int local19;
		@Pc(31) int local31;
		@Pc(35) int local35;
		if (Static21.anInt508 == 64) {
			local13 = Static250.aClass2_Sub26_Sub1_2.method4274();
			local19 = Static180.anInt3871 + (local13 & 0x7);
			local27 = (local13 >> 4 & 0x7) + Static29.anInt711;
			local31 = Static250.aClass2_Sub26_Sub1_2.method4242();
			local35 = Static250.aClass2_Sub26_Sub1_2.method4215();
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				@Pc(56) Class36_Sub7 local56 = new Class36_Sub7();
				local56.anInt6145 = local35;
				local56.anInt6153 = local31;
				if (Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local27][local19] == null) {
					Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local27][local19] = new Class1();
				}
				Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local27][local19].method11(new Class2_Sub3_Sub11(local56));
				Static40.method770(local19, local27);
			}
			return;
		}
		@Pc(136) int local136;
		if (Static21.anInt508 == 117) {
			local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
			local27 = Static29.anInt711 + (local13 >> 4 & 0x7);
			local19 = (local13 & 0x7) + Static180.anInt3871;
			local31 = Static250.aClass2_Sub26_Sub1_2.method4242();
			local35 = Static250.aClass2_Sub26_Sub1_2.method4242();
			local136 = Static250.aClass2_Sub26_Sub1_2.method4242();
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				@Pc(162) Class1 local162 = Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local27][local19];
				if (local162 != null) {
					for (@Pc(169) Class2_Sub3_Sub11 local169 = (Class2_Sub3_Sub11) local162.method13(); local169 != null; local169 = (Class2_Sub3_Sub11) local162.method9()) {
						@Pc(175) Class36_Sub7 local175 = local169.aClass36_Sub7_1;
						if (local175.anInt6145 == (local31 & 0x7FFF) && local35 == local175.anInt6153) {
							local175.anInt6153 = local136;
							break;
						}
					}
					Static40.method770(local19, local27);
				}
			}
			return;
		}
		@Pc(253) int local253;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(285) int local285;
		if (Static21.anInt508 == 194) {
			local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
			local19 = Static180.anInt3871 + (local13 & 0x7);
			local27 = (local13 >> 4 & 0x7) + Static29.anInt711;
			local31 = Static250.aClass2_Sub26_Sub1_2.method4242();
			local35 = Static250.aClass2_Sub26_Sub1_2.method4261();
			if (local31 == 65535) {
				local31 = -1;
			}
			local136 = local35 >> 4 & 0xF;
			local253 = local35 & 0x7;
			local257 = Static250.aClass2_Sub26_Sub1_2.method4261();
			local261 = Static250.aClass2_Sub26_Sub1_2.method4261();
			if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
				local285 = local136 + 1;
				if (Static111.aClass36_Sub3_Sub2_1.anIntArray465[0] >= local27 - local285 && local27 + local285 >= Static111.aClass36_Sub3_Sub2_1.anIntArray465[0] && local19 - local285 <= Static111.aClass36_Sub3_Sub2_1.anIntArray468[0] && local19 + local285 >= Static111.aClass36_Sub3_Sub2_1.anIntArray468[0] && Static144.anInt3122 != 0 && local253 > 0 && Static151.anInt3191 < 50 && local31 != -1) {
					Static23.anIntArray36[Static151.anInt3191] = local31;
					Static184.anIntArray311[Static151.anInt3191] = local253;
					Static219.anIntArray378[Static151.anInt3191] = local257;
					Static73.aClass30Array1[Static151.anInt3191] = null;
					Static63.anIntArray106[Static151.anInt3191] = (local27 << 16) + (local19 << 8) + local136;
					Static156.anIntArray488[Static151.anInt3191] = local261;
					Static151.anInt3191++;
				}
			}
		} else if (Static21.anInt508 == 147) {
			local13 = Static250.aClass2_Sub26_Sub1_2.method4236();
			local27 = Static250.aClass2_Sub26_Sub1_2.method4274();
			local19 = Static29.anInt711 + (local27 >> 4 & 0x7);
			local31 = Static180.anInt3871 + (local27 & 0x7);
			if (local19 >= 0 && local31 >= 0 && local19 < 104 && local31 < 104) {
				@Pc(440) Class1 local440 = Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local19][local31];
				if (local440 != null) {
					for (@Pc(449) Class2_Sub3_Sub11 local449 = (Class2_Sub3_Sub11) local440.method13(); local449 != null; local449 = (Class2_Sub3_Sub11) local440.method9()) {
						if (local449.aClass36_Sub7_1.anInt6145 == (local13 & 0x7FFF)) {
							local449.method4926();
							break;
						}
					}
					if (local440.method13() == null) {
						Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local19][local31] = null;
					}
					Static40.method770(local31, local19);
				}
			}
		} else {
			@Pc(552) int local552;
			@Pc(556) int local556;
			@Pc(565) int local565;
			@Pc(647) Class36_Sub5 local647;
			if (Static21.anInt508 == 142) {
				local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
				local19 = (local13 & 0xF) + Static180.anInt3871 * 2;
				local27 = Static29.anInt711 * 2 + (local13 >> 4 & 0xF);
				local31 = Static250.aClass2_Sub26_Sub1_2.method4220() + local27;
				local35 = Static250.aClass2_Sub26_Sub1_2.method4220() + local19;
				local136 = Static250.aClass2_Sub26_Sub1_2.method4255();
				local253 = Static250.aClass2_Sub26_Sub1_2.method4242();
				local257 = Static250.aClass2_Sub26_Sub1_2.method4261() * 4;
				local261 = Static250.aClass2_Sub26_Sub1_2.method4261() * 4;
				local285 = Static250.aClass2_Sub26_Sub1_2.method4242();
				local552 = Static250.aClass2_Sub26_Sub1_2.method4242();
				local556 = Static250.aClass2_Sub26_Sub1_2.method4261();
				if (local556 == 255) {
					local556 = -1;
				}
				local565 = Static250.aClass2_Sub26_Sub1_2.method4261();
				if (local27 >= 0 && local19 >= 0 && local27 < 208 && local19 < 208 && local31 >= 0 && local35 >= 0 && local31 < 208 && local35 < 208 && local253 != 65535) {
					local19 = local19 * 64;
					local35 = local35 * 64;
					local31 *= 64;
					local27 *= 64;
					local647 = new Class36_Sub5(local253, Static208.anInt4335, local27, local19, Static99.method1894(Static208.anInt4335, local19, local27) - local257, Static148.anInt3168 + local285, local552 + Static148.anInt3168, local556, local565, local136, local261);
					local647.method3611(Static99.method1894(Static208.anInt4335, local35, local31) - local261, local31, local35, Static148.anInt3168 + local285);
					Static279.aClass1_33.method11(new Class2_Sub3_Sub21(local647));
				}
			} else {
				if (Static21.anInt508 == 36) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4238();
					local27 = Static250.aClass2_Sub26_Sub1_2.method4242();
					@Pc(691) byte local691 = Static250.aClass2_Sub26_Sub1_2.method4277();
					local31 = Static250.aClass2_Sub26_Sub1_2.method4274();
					local35 = Static29.anInt711 + (local31 >> 4 & 0x7);
					local136 = Static180.anInt3871 + (local31 & 0x7);
					local253 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local257 = Static250.aClass2_Sub26_Sub1_2.method4274();
					local261 = local257 >> 2;
					local285 = local257 & 0x3;
					local552 = Static250.aClass2_Sub26_Sub1_2.method4236();
					@Pc(736) byte local736 = Static250.aClass2_Sub26_Sub1_2.method4220();
					@Pc(740) byte local740 = Static250.aClass2_Sub26_Sub1_2.method4277();
					@Pc(744) byte local744 = Static250.aClass2_Sub26_Sub1_2.method4241();
					if (!Static60.aBoolean106) {
						Static250.method3999(local736, local136, local27, local35, local261, local744, local253, local13, local691, local285, local740, local552);
					}
				}
				if (Static21.anInt508 == 250) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local27 = (local13 >> 4 & 0x7) + Static29.anInt711;
					local19 = (local13 & 0x7) + Static180.anInt3871;
					local31 = Static250.aClass2_Sub26_Sub1_2.method4233();
					local35 = local31 >> 2;
					local253 = Static158.anIntArray235[local35];
					local136 = local31 & 0x3;
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						Static212.method3618(local35, Static208.anInt4335, 0, local136, local19, -1, -1, local27, local253);
					}
				} else if (Static21.anInt508 == 218) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local27 = Static29.anInt711 + (local13 >> 4 & 0x7);
					local19 = (local13 & 0x7) + Static180.anInt3871;
					local31 = Static250.aClass2_Sub26_Sub1_2.method4236();
					if (local31 == 65535) {
						local31 = -1;
					}
					local35 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local253 = local35 & 0x3;
					local136 = local35 >> 2;
					local257 = Static158.anIntArray235[local136];
					Static36.method716(local31, local27, local136, local257, local253, Static208.anInt4335, local19);
				} else if (Static21.anInt508 == 78) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4247();
					local27 = local13 >> 2;
					local31 = Static158.anIntArray235[local27];
					local19 = local13 & 0x3;
					local35 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local136 = Static29.anInt711 + (local35 >> 4 & 0x7);
					local253 = Static180.anInt3871 + (local35 & 0x7);
					local257 = Static250.aClass2_Sub26_Sub1_2.method4236();
					if (local136 >= 0 && local253 >= 0 && local136 < 104 && local253 < 104) {
						Static212.method3618(local27, Static208.anInt4335, 0, local19, local253, -1, local257, local136, local31);
					}
				} else if (Static21.anInt508 == 233) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local27 = Static29.anInt711 + (local13 >> 4 & 0x7);
					local19 = (local13 & 0x7) + Static180.anInt3871;
					local31 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local35 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local136 = Static250.aClass2_Sub26_Sub1_2.method4242();
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104) {
						local19 = local19 * 128 + 64;
						local27 = local27 * 128 + 64;
						@Pc(1040) Class36_Sub1 local1040 = new Class36_Sub1(local31, Static208.anInt4335, local27, local19, Static99.method1894(Static208.anInt4335, local19, local27) - local35, local136, Static148.anInt3168);
						Static197.aClass1_14.method11(new Class2_Sub3_Sub7(local1040));
					}
				} else if (Static21.anInt508 == 153) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local27 = Static250.aClass2_Sub26_Sub1_2.method4261();
					Static218.method3692(local13).method3655(local27);
				} else if (Static21.anInt508 == 46) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local19 = Static180.anInt3871 * 2 + (local13 & 0xF);
					local27 = Static29.anInt711 * 2 + (local13 >> 4 & 0xF);
					local31 = local27 + Static250.aClass2_Sub26_Sub1_2.method4220();
					local35 = local19 + Static250.aClass2_Sub26_Sub1_2.method4220();
					local136 = Static250.aClass2_Sub26_Sub1_2.method4255();
					local253 = Static250.aClass2_Sub26_Sub1_2.method4255();
					local257 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local261 = Static250.aClass2_Sub26_Sub1_2.method4220();
					local285 = Static250.aClass2_Sub26_Sub1_2.method4261() * 4;
					local552 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local556 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local565 = Static250.aClass2_Sub26_Sub1_2.method4261();
					@Pc(1150) int local1150 = Static250.aClass2_Sub26_Sub1_2.method4261();
					if (local565 == 255) {
						local565 = -1;
					}
					if (local27 >= 0 && local19 >= 0 && local27 < 208 && local19 < 208 && local31 >= 0 && local35 >= 0 && local31 < 208 && local35 < 208 && local257 != 65535) {
						local31 *= 64;
						local27 = local27 * 64;
						local19 *= 64;
						local35 = local35 * 64;
						if (local136 != 0) {
							@Pc(1229) int local1229;
							@Pc(1240) Class36_Sub3 local1240;
							@Pc(1223) int local1223;
							@Pc(1233) int local1233;
							if (local136 < 0) {
								local1223 = -local136 - 1;
								local1229 = local1223 >> 11 & 0xF;
								local1233 = local1223 & 0x7FF;
								if (Static11.anInt298 == local1233) {
									local1240 = Static111.aClass36_Sub3_Sub2_1;
								} else {
									local1240 = Static212.aClass36_Sub3_Sub2Array1[local1233];
								}
							} else {
								local1223 = local136 - 1;
								local1233 = local1223 & 0x7FF;
								local1229 = local1223 >> 11 & 0xF;
								local1240 = Static201.aClass36_Sub3_Sub1Array1[local1233];
							}
							if (local1240 != null) {
								@Pc(1273) Class70 local1273 = local1240.method4104();
								if (local1273.anIntArrayArray20 != null && local1273.anIntArrayArray20[local1229] != null) {
									local261 -= local1273.anIntArrayArray20[local1229][1];
									local1233 = local1273.anIntArrayArray20[local1229][0];
									@Pc(1307) int local1307 = local1273.anIntArrayArray20[local1229][2];
									@Pc(1312) int local1312 = Class66.anIntArray148[local1240.anInt5069];
									@Pc(1317) int local1317 = Class66.anIntArray153[local1240.anInt5069];
									@Pc(1328) int local1328 = local1307 * local1312 + local1317 * local1233 >> 16;
									@Pc(1339) int local1339 = local1317 * local1307 - local1233 * local1312 >> 16;
									local19 += local1339;
									local27 += local1328;
								}
							}
						}
						@Pc(1377) Class36_Sub5 local1377 = new Class36_Sub5(local257, Static208.anInt4335, local27, local19, Static99.method1894(Static208.anInt4335, local19, local27) - local261, local552 + Static148.anInt3168, Static148.anInt3168 + local556, local565, local1150, local253, local285);
						local1377.method3611(Static99.method1894(Static208.anInt4335, local35, local31) - local285, local31, local35, Static148.anInt3168 + local552);
						Static279.aClass1_33.method11(new Class2_Sub3_Sub21(local1377));
					}
				} else if (Static21.anInt508 == 47) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local27 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local19 = Static250.aClass2_Sub26_Sub1_2.method4247();
					local31 = (local19 >> 4 & 0x7) + Static29.anInt711;
					local35 = Static180.anInt3871 + (local19 & 0x7);
					local136 = Static250.aClass2_Sub26_Sub1_2.method4242();
					if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local136 != Static11.anInt298) {
						@Pc(1464) Class36_Sub7 local1464 = new Class36_Sub7();
						local1464.anInt6153 = local27;
						local1464.anInt6145 = local13;
						if (Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local31][local35] == null) {
							Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local31][local35] = new Class1();
						}
						Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local31][local35].method11(new Class2_Sub3_Sub11(local1464));
						Static40.method770(local35, local31);
					}
				} else if (Static21.anInt508 == 207) {
					local13 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local19 = (local13 & 0x7) + Static180.anInt3871;
					local27 = (local13 >> 4 & 0x7) + Static29.anInt711;
					local31 = Static250.aClass2_Sub26_Sub1_2.method4220() + local27;
					local35 = local19 + Static250.aClass2_Sub26_Sub1_2.method4220();
					local136 = Static250.aClass2_Sub26_Sub1_2.method4255();
					local253 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local257 = Static250.aClass2_Sub26_Sub1_2.method4261() * 4;
					local261 = Static250.aClass2_Sub26_Sub1_2.method4261() * 4;
					local285 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local552 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local556 = Static250.aClass2_Sub26_Sub1_2.method4261();
					local565 = Static250.aClass2_Sub26_Sub1_2.method4261();
					if (local556 == 255) {
						local556 = -1;
					}
					if (local27 >= 0 && local19 >= 0 && local27 < 104 && local19 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local253 != 65535) {
						local35 = local35 * 128 + 64;
						local19 = local19 * 128 + 64;
						local27 = local27 * 128 + 64;
						local647 = new Class36_Sub5(local253, Static208.anInt4335, local27, local19, Static99.method1894(Static208.anInt4335, local19, local27) - local257, Static148.anInt3168 + local285, local552 + Static148.anInt3168, local556, local565, local136, local261);
						local31 = local31 * 128 + 64;
						local647.method3611(Static99.method1894(Static208.anInt4335, local35, local31) - local261, local31, local35, Static148.anInt3168 + local285);
						Static279.aClass1_33.method11(new Class2_Sub3_Sub21(local647));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZI)V")
	public static void method4095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg1) {
			Static133.method2321(arg1, arg0, Static274.anIntArrayArray50[arg2], arg3);
		} else {
			Static133.method2321(arg0, arg1, Static274.anIntArrayArray50[arg2], arg3);
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)Z")
	public static boolean method4100() throws IOException {
		if (Static42.aClass45_1 == null) {
			return false;
		}
		@Pc(15) int local15 = Static42.aClass45_1.method1040();
		if (local15 == 0) {
			return false;
		}
		if (Static21.anInt508 == -1) {
			Static42.aClass45_1.method1048(1, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
			Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
			Static21.anInt508 = Static250.aClass2_Sub26_Sub1_2.method4285();
			local15--;
			Static4.anInt151 = Static216.anIntArray373[Static21.anInt508];
		}
		if (Static4.anInt151 == -1) {
			if (local15 <= 0) {
				return false;
			}
			local15--;
			Static42.aClass45_1.method1048(1, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
			Static4.anInt151 = Static250.aClass2_Sub26_Sub1_2.aByteArray72[0] & 0xFF;
		}
		if (Static4.anInt151 == -2) {
			if (local15 <= 1) {
				return false;
			}
			local15 -= 2;
			Static42.aClass45_1.method1048(2, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
			Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
			Static4.anInt151 = Static250.aClass2_Sub26_Sub1_2.method4242();
		}
		if (Static4.anInt151 > local15) {
			return false;
		}
		Static250.aClass2_Sub26_Sub1_2.anInt5328 = 0;
		Static42.aClass45_1.method1048(Static4.anInt151, 0, Static250.aClass2_Sub26_Sub1_2.aByteArray72);
		Static294.anInt6108 = 0;
		Static47.anInt1117 = Static126.anInt2647;
		Static126.anInt2647 = Static257.anInt5358;
		Static257.anInt5358 = Static21.anInt508;
		@Pc(129) long local129;
		@Pc(134) long local134;
		@Pc(139) long local139;
		@Pc(143) int local143;
		@Pc(147) int local147;
		@Pc(228) String local228;
		if (Static21.anInt508 == 14) {
			local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
			local134 = Static250.aClass2_Sub26_Sub1_2.method4242();
			local139 = Static250.aClass2_Sub26_Sub1_2.method4245();
			local143 = Static250.aClass2_Sub26_Sub1_2.method4261();
			local147 = Static250.aClass2_Sub26_Sub1_2.method4242();
			@Pc(154) long local154 = (local134 << 32) + local139;
			@Pc(156) boolean local156 = false;
			@Pc(158) int local158 = 0;
			label1790: while (true) {
				if (local158 >= 100) {
					if (local143 <= 1) {
						for (local158 = 0; local158 < Static11.anInt296; local158++) {
							if (local129 == Static281.aLongArray23[local158]) {
								local156 = true;
								break label1790;
							}
						}
					}
					break;
				}
				if (Static292.aLongArray24[local158] == local154) {
					local156 = true;
					break;
				}
				local158++;
			}
			if (!local156 && Static293.anInt6087 == 0) {
				Static292.aLongArray24[Static155.anInt6184] = local154;
				Static155.anInt6184 = (Static155.anInt6184 + 1) % 100;
				local228 = Static190.method3493(local147).method4626(Static250.aClass2_Sub26_Sub1_2);
				if (local143 == 2) {
					Static27.method518(local228, local147, 18, null, "<img=1>" + Static77.method1383(local129));
				} else if (local143 == 1) {
					Static27.method518(local228, local147, 18, null, "<img=0>" + Static77.method1383(local129));
				} else {
					Static27.method518(local228, local147, 18, null, Static77.method1383(local129));
				}
			}
			Static21.anInt508 = -1;
			return true;
		}
		@Pc(305) int local305;
		@Pc(293) int local293;
		@Pc(297) int local297;
		@Pc(301) int local301;
		if (Static21.anInt508 == 40) {
			local293 = Static250.aClass2_Sub26_Sub1_2.method4228();
			local297 = Static250.aClass2_Sub26_Sub1_2.method4255();
			local301 = Static250.aClass2_Sub26_Sub1_2.method4236();
			local305 = Static250.aClass2_Sub26_Sub1_2.method4238();
			if (Static20.method1065(local301)) {
				Static164.method2842(local293, local297, local305);
			}
			Static21.anInt508 = -1;
			return true;
		} else if (Static21.anInt508 == 172) {
			local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
			local297 = Static250.aClass2_Sub26_Sub1_2.method4227();
			local301 = Static250.aClass2_Sub26_Sub1_2.method4215();
			if (Static20.method1065(local293)) {
				Static290.method4814(local301, local297);
			}
			Static21.anInt508 = -1;
			return true;
		} else {
			@Pc(375) int local375;
			@Pc(371) int local371;
			if (Static21.anInt508 == 154) {
				local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
				local297 = Static250.aClass2_Sub26_Sub1_2.method4261();
				local301 = Static250.aClass2_Sub26_Sub1_2.method4261();
				local305 = Static250.aClass2_Sub26_Sub1_2.method4261();
				local371 = Static250.aClass2_Sub26_Sub1_2.method4261();
				local375 = Static250.aClass2_Sub26_Sub1_2.method4242();
				if (Static20.method1065(local293)) {
					Static198.aBooleanArray19[local297] = true;
					Static264.anIntArray481[local297] = local301;
					Static250.anIntArray447[local297] = local305;
					Static214.anIntArray363[local297] = local371;
					Static57.anIntArray146[local297] = local375;
				}
				Static21.anInt508 = -1;
				return true;
			} else if (Static21.anInt508 == 49) {
				Static295.method4895();
				local293 = Static250.aClass2_Sub26_Sub1_2.method4227();
				local297 = Static250.aClass2_Sub26_Sub1_2.method4233();
				local301 = Static250.aClass2_Sub26_Sub1_2.method4233();
				Static176.anIntArray304[local297] = local293;
				Static152.anIntArray230[local297] = local301;
				Static203.anIntArray350[local297] = 1;
				for (local305 = 0; local305 < 98; local305++) {
					if (Class78.anIntArray161[local305] <= local293) {
						Static203.anIntArray350[local297] = local305 + 2;
					}
				}
				Static108.anIntArray162[Static134.anInt2732++ & 0x1F] = local297;
				Static21.anInt508 = -1;
				return true;
			} else if (Static21.anInt508 == 173) {
				Static180.anInt3871 = Static250.aClass2_Sub26_Sub1_2.method4261();
				Static29.anInt711 = Static250.aClass2_Sub26_Sub1_2.method4247();
				for (local293 = Static29.anInt711; local293 < Static29.anInt711 + 8; local293++) {
					for (local297 = Static180.anInt3871; local297 < Static180.anInt3871 + 8; local297++) {
						if (Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local293][local297] != null) {
							Static208.aClass1ArrayArrayArray1[Static208.anInt4335][local293][local297] = null;
							Static40.method770(local297, local293);
						}
					}
				}
				for (@Pc(532) Class2_Sub4 local532 = (Class2_Sub4) Static104.aClass1_10.method13(); local532 != null; local532 = (Class2_Sub4) Static104.aClass1_10.method9()) {
					if (Static29.anInt711 <= local532.anInt405 && local532.anInt405 < Static29.anInt711 + 8 && Static180.anInt3871 <= local532.anInt389 && local532.anInt389 < Static180.anInt3871 + 8 && Static208.anInt4335 == local532.anInt390) {
						local532.anInt396 = 0;
					}
				}
				Static21.anInt508 = -1;
				return true;
			} else {
				@Pc(730) int local730;
				@Pc(655) boolean local655;
				if (Static21.anInt508 == 209) {
					local293 = Static250.aClass2_Sub26_Sub1_2.method4215();
					local297 = Static250.aClass2_Sub26_Sub1_2.method4242();
					local301 = Static250.aClass2_Sub26_Sub1_2.method4214();
					local305 = Static250.aClass2_Sub26_Sub1_2.method4242();
					if (local301 >> 30 == 0) {
						@Pc(676) Class167 local676;
						@Pc(695) Class15 local695;
						@Pc(700) Class15 local700;
						@Pc(681) Class167 local681;
						@Pc(727) Class15 local727;
						if (local301 >> 29 != 0) {
							local371 = local301 & 0xFFFF;
							@Pc(873) Class36_Sub3_Sub1 local873 = Static201.aClass36_Sub3_Sub1Array1[local371];
							if (local873 != null) {
								if (local305 == 65535) {
									local305 = -1;
								}
								local655 = true;
								if (local305 != -1 && local873.anInt5125 != -1) {
									if (local873.anInt5125 == local305) {
										local676 = Static208.method3532(local305);
										if (local676.aBoolean436 && local676.anInt5405 != -1) {
											local727 = Static35.method706(local676.anInt5405);
											local730 = local727.anInt428;
											if (local730 == 1) {
												local873.anInt5142 = 1;
												local873.anInt5118 = 0;
												local873.anInt5112 = Static148.anInt3168 + local297;
												local873.anInt5129 = 0;
												local655 = false;
												local873.anInt5076 = 0;
												Static225.method3777(local873.anInt5129, false, local873.anInt5109, local727, local873.anInt5093);
											} else if (local730 == 2) {
												local873.anInt5103 = 0;
												local655 = false;
											}
										}
									} else {
										local676 = Static208.method3532(local305);
										local681 = Static208.method3532(local873.anInt5125);
										if (local676.anInt5405 != -1 && local681.anInt5405 != -1) {
											local695 = Static35.method706(local676.anInt5405);
											local700 = Static35.method706(local681.anInt5405);
											if (local700.anInt413 > local695.anInt413) {
												local655 = false;
											}
										}
									}
								}
								if (local655) {
									local873.anInt5125 = local305;
									local873.anInt5133 = local293;
									local873.anInt5129 = 0;
									local873.anInt5142 = 1;
									local873.anInt5076 = 0;
									local873.anInt5112 = Static148.anInt3168 + local297;
									if (local873.anInt5112 > Static148.anInt3168) {
										local873.anInt5129 = -1;
									}
									if (local873.anInt5125 != -1 && Static148.anInt3168 == local873.anInt5112) {
										local147 = Static208.method3532(local873.anInt5125).anInt5405;
										if (local147 != -1) {
											local727 = Static35.method706(local147);
											if (local727 != null && local727.anIntArray26 != null) {
												Static225.method3777(0, false, local873.anInt5109, local727, local873.anInt5093);
											}
										}
									}
								}
							}
						} else if (local301 >> 28 != 0) {
							local371 = local301 & 0xFFFF;
							@Pc(639) Class36_Sub3_Sub2 local639;
							if (Static11.anInt298 == local371) {
								local639 = Static111.aClass36_Sub3_Sub2_1;
							} else {
								local639 = Static212.aClass36_Sub3_Sub2Array1[local371];
							}
							if (local639 != null) {
								if (local305 == 65535) {
									local305 = -1;
								}
								local655 = true;
								if (local305 != -1 && local639.anInt5125 != -1) {
									if (local305 == local639.anInt5125) {
										local676 = Static208.method3532(local305);
										if (local676.aBoolean436 && local676.anInt5405 != -1) {
											local727 = Static35.method706(local676.anInt5405);
											local730 = local727.anInt428;
											if (local730 == 1) {
												local639.anInt5076 = 0;
												local639.anInt5112 = local297 + Static148.anInt3168;
												local655 = false;
												local639.anInt5129 = 0;
												local639.anInt5118 = 0;
												local639.anInt5142 = 1;
												Static225.method3777(local639.anInt5129, false, local639.anInt5109, local727, local639.anInt5093);
											} else if (local730 == 2) {
												local639.anInt5103 = 0;
												local655 = false;
											}
										}
									} else {
										local676 = Static208.method3532(local305);
										local681 = Static208.method3532(local639.anInt5125);
										if (local676.anInt5405 != -1 && local681.anInt5405 != -1) {
											local695 = Static35.method706(local676.anInt5405);
											local700 = Static35.method706(local681.anInt5405);
											if (local695.anInt413 < local700.anInt413) {
												local655 = false;
											}
										}
									}
								}
								if (local655) {
									local639.anInt5112 = local297 + Static148.anInt3168;
									local639.anInt5142 = 1;
									local639.anInt5125 = local305;
									local639.anInt5133 = local293;
									if (local639.anInt5125 == 65535) {
										local639.anInt5125 = -1;
									}
									local639.anInt5076 = 0;
									local639.anInt5129 = 0;
									if (Static148.anInt3168 < local639.anInt5112) {
										local639.anInt5129 = -1;
									}
									if (local639.anInt5125 != -1 && Static148.anInt3168 == local639.anInt5112) {
										local147 = Static208.method3532(local639.anInt5125).anInt5405;
										if (local147 != -1) {
											local727 = Static35.method706(local147);
											if (local727 != null && local727.anIntArray26 != null) {
												Static225.method3777(0, Static111.aClass36_Sub3_Sub2_1 == local639, local639.anInt5109, local727, local639.anInt5093);
											}
										}
									}
								}
							}
						}
					} else {
						local371 = local301 >> 28 & 0x3;
						local143 = (local301 & 0x3FFF) - Static203.anInt4236;
						local375 = (local301 >> 14 & 0x3FFF) - Static125.anInt5772;
						if (local375 >= 0 && local143 >= 0 && local375 < 104 && local143 < 104) {
							local143 = local143 * 128 + 64;
							local375 = local375 * 128 + 64;
							@Pc(1153) Class36_Sub1 local1153 = new Class36_Sub1(local305, local371, local375, local143, Static99.method1894(local371, local143, local375) - local293, local297, Static148.anInt3168);
							Static197.aClass1_14.method11(new Class2_Sub3_Sub7(local1153));
						}
					}
					Static21.anInt508 = -1;
					return true;
				} else if (Static21.anInt508 == 86) {
					Static180.method3132();
					Static295.method4895();
					Static261.anInt5432 += 32;
					Static21.anInt508 = -1;
					return true;
				} else if (Static21.anInt508 == 58) {
					local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
					local297 = Static250.aClass2_Sub26_Sub1_2.method4257();
					local301 = Static250.aClass2_Sub26_Sub1_2.method4274();
					@Pc(1203) Class36_Sub3_Sub1 local1203 = Static201.aClass36_Sub3_Sub1Array1[local297];
					if (local1203 != null) {
						Static83.method1597(local1203, local301, local293);
					}
					Static21.anInt508 = -1;
					return true;
				} else {
					@Pc(1334) String local1334;
					@Pc(1242) long local1242;
					@Pc(1246) int local1246;
					if (Static21.anInt508 == 167) {
						local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
						Static250.aClass2_Sub26_Sub1_2.method4220();
						local134 = Static250.aClass2_Sub26_Sub1_2.method4264();
						local139 = Static250.aClass2_Sub26_Sub1_2.method4242();
						local1242 = Static250.aClass2_Sub26_Sub1_2.method4245();
						local1246 = Static250.aClass2_Sub26_Sub1_2.method4261();
						@Pc(1248) boolean local1248 = false;
						@Pc(1255) long local1255 = (local139 << 32) + local1242;
						@Pc(1257) int local1257 = 0;
						label1326: while (true) {
							if (local1257 < 100) {
								if (Static292.aLongArray24[local1257] != local1255) {
									local1257++;
									continue;
								}
								local1248 = true;
								break;
							}
							if (local1246 <= 1) {
								if (Static104.aBoolean180 && !Static166.aBoolean281 || Static196.aBoolean342) {
									local1248 = true;
								} else {
									for (local1257 = 0; local1257 < Static11.anInt296; local1257++) {
										if (local129 == Static281.aLongArray23[local1257]) {
											local1248 = true;
											break label1326;
										}
									}
								}
							}
							break;
						}
						if (!local1248 && Static293.anInt6087 == 0) {
							Static292.aLongArray24[Static155.anInt6184] = local1255;
							Static155.anInt6184 = (Static155.anInt6184 + 1) % 100;
							local1334 = Static178.method3305(Static32.method641(Static158.method2715(Static250.aClass2_Sub26_Sub1_2)));
							if (local1246 == 2 || local1246 == 3) {
								Static180.method3129("<img=1>" + Static77.method1383(local129), Static77.method1383(local134), local1334);
							} else if (local1246 == 1) {
								Static180.method3129("<img=0>" + Static77.method1383(local129), Static77.method1383(local134), local1334);
							} else {
								Static180.method3129(Static77.method1383(local129), Static77.method1383(local134), local1334);
							}
						}
						Static21.anInt508 = -1;
						return true;
					} else if (Static21.anInt508 == 66) {
						local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
						Static164.method2844(local293);
						Static245.anIntArray480[Static56.anInt1272++ & 0x1F] = local293 & 0x7FFF;
						Static21.anInt508 = -1;
						return true;
					} else if (Static21.anInt508 == 158) {
						local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
						if (local293 == 65535) {
							local293 = -1;
						}
						local297 = Static250.aClass2_Sub26_Sub1_2.method4261();
						local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
						local305 = Static250.aClass2_Sub26_Sub1_2.method4261();
						Static111.method2069(local293, local305, local297, local301);
						Static21.anInt508 = -1;
						return true;
					} else if (Static21.anInt508 == 128) {
						Static277.anInt5762 = Static250.aClass2_Sub26_Sub1_2.method4257() * 30;
						Static21.anInt508 = -1;
						Static250.anInt4981 = Static13.anInt334;
						return true;
					} else if (Static21.anInt508 == 187) {
						local293 = Static250.aClass2_Sub26_Sub1_2.method4269();
						@Pc(1494) Class115 local1494 = Static90.method1692(local293);
						for (local301 = 0; local301 < local1494.anIntArray271.length; local301++) {
							local1494.anIntArray271[local301] = -1;
							local1494.anIntArray271[local301] = 0;
						}
						Static298.method4263(local1494);
						Static21.anInt508 = -1;
						return true;
					} else if (Static21.anInt508 == 54) {
						local293 = Static250.aClass2_Sub26_Sub1_2.method4257();
						local297 = Static250.aClass2_Sub26_Sub1_2.method4215();
						local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
						local305 = Static250.aClass2_Sub26_Sub1_2.method4228();
						if (Static20.method1065(local293)) {
							Static137.method2431(local305, local301 + (local297 << 16));
						}
						Static21.anInt508 = -1;
						return true;
					} else if (Static21.anInt508 == 120) {
						local293 = Static250.aClass2_Sub26_Sub1_2.method4247();
						local297 = Static250.aClass2_Sub26_Sub1_2.method4257();
						Static298.method4223(local297, local293);
						Static21.anInt508 = -1;
						return true;
					} else if (Static21.anInt508 == 138) {
						local293 = Static250.aClass2_Sub26_Sub1_2.method4215();
						local297 = Static250.aClass2_Sub26_Sub1_2.method4215();
						local301 = Static250.aClass2_Sub26_Sub1_2.method4269();
						local305 = Static250.aClass2_Sub26_Sub1_2.method4236();
						local371 = Static250.aClass2_Sub26_Sub1_2.method4236();
						if (Static20.method1065(local305)) {
							Static111.method2065(local297, local293, local301, local371);
						}
						Static21.anInt508 = -1;
						return true;
					} else {
						@Pc(1648) Class115 local1648;
						if (Static21.anInt508 == 243) {
							local293 = Static250.aClass2_Sub26_Sub1_2.method4228();
							local297 = Static250.aClass2_Sub26_Sub1_2.method4242();
							if (local293 >= 0) {
								local1648 = Static90.method1692(local293);
							} else {
								local1648 = null;
							}
							if (local293 < -70000) {
								local297 += 32768;
							}
							while (Static250.aClass2_Sub26_Sub1_2.anInt5328 < Static4.anInt151) {
								local305 = Static250.aClass2_Sub26_Sub1_2.method4217();
								local371 = Static250.aClass2_Sub26_Sub1_2.method4242();
								local375 = 0;
								if (local371 != 0) {
									local375 = Static250.aClass2_Sub26_Sub1_2.method4261();
									if (local375 == 255) {
										local375 = Static250.aClass2_Sub26_Sub1_2.method4228();
									}
								}
								if (local1648 != null && local305 >= 0 && local305 < local1648.anIntArray271.length) {
									local1648.anIntArray271[local305] = local371;
									local1648.anIntArray270[local305] = local375;
								}
								Static30.method634(local375, local305, local297, local371 - 1);
							}
							if (local1648 != null) {
								Static298.method4263(local1648);
							}
							Static295.method4895();
							Static245.anIntArray480[Static56.anInt1272++ & 0x1F] = local297 & 0x7FFF;
							Static21.anInt508 = -1;
							return true;
						} else if (Static21.anInt508 == 12) {
							local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
							local297 = Static250.aClass2_Sub26_Sub1_2.method4242();
							if (local297 == 65535) {
								local297 = -1;
							}
							local301 = Static250.aClass2_Sub26_Sub1_2.method4269();
							if (Static20.method1065(local293)) {
								Static82.method4611(2, -1, local301, local297);
							}
							Static21.anInt508 = -1;
							return true;
						} else if (Static21.anInt508 == 150) {
							local293 = Static250.aClass2_Sub26_Sub1_2.method4215();
							local297 = Static250.aClass2_Sub26_Sub1_2.method4269();
							local301 = Static250.aClass2_Sub26_Sub1_2.method4216();
							if (Static20.method1065(local293)) {
								Static27.method519(local301, local297);
							}
							Static21.anInt508 = -1;
							return true;
						} else {
							@Pc(1882) Class2_Sub11 local1882;
							@Pc(1893) Class2_Sub11 local1893;
							if (Static21.anInt508 == 166) {
								local293 = Static250.aClass2_Sub26_Sub1_2.method4227();
								local297 = Static250.aClass2_Sub26_Sub1_2.method4242();
								local301 = Static250.aClass2_Sub26_Sub1_2.method4215();
								local305 = Static250.aClass2_Sub26_Sub1_2.method4215();
								if (local305 == 65535) {
									local305 = -1;
								}
								local371 = Static250.aClass2_Sub26_Sub1_2.method4242();
								if (local301 == 65535) {
									local301 = -1;
								}
								if (Static20.method1065(local297)) {
									for (local375 = local301; local375 <= local305; local375++) {
										local1242 = (long) local375 + ((long) local293 << 32);
										local1882 = (Class2_Sub11) Static293.aClass79_23.method2002(local1242);
										if (local1882 != null) {
											local1893 = new Class2_Sub11(local1882.anInt1534, local371);
											local1882.method4926();
										} else if (local375 == -1) {
											local1893 = new Class2_Sub11(Static90.method1692(local293).aClass2_Sub11_1.anInt1534, local371);
										} else {
											local1893 = new Class2_Sub11(0, local371);
										}
										Static293.aClass79_23.method1994(local1242, local1893);
									}
								}
								Static21.anInt508 = -1;
								return true;
							} else if (Static21.anInt508 == 92) {
								local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
								local297 = Static250.aClass2_Sub26_Sub1_2.method4242();
								local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
								if (Static20.method1065(local293)) {
									Static191.method630(local301, local297);
								}
								Static21.anInt508 = -1;
								return true;
							} else if (Static21.anInt508 == 82) {
								local293 = Static250.aClass2_Sub26_Sub1_2.method4227();
								local297 = Static250.aClass2_Sub26_Sub1_2.method4261();
								local301 = Static250.aClass2_Sub26_Sub1_2.method4257();
								if (Static20.method1065(local301)) {
									Static166.method2859(local293, local297);
								}
								Static21.anInt508 = -1;
								return true;
							} else if (Static21.anInt508 == 84) {
								@Pc(1998) byte local1998 = Static250.aClass2_Sub26_Sub1_2.method4277();
								local297 = Static250.aClass2_Sub26_Sub1_2.method4236();
								Static289.method4809(local1998, local297);
								Static21.anInt508 = -1;
								return true;
							} else {
								@Pc(2021) String local2021;
								if (Static21.anInt508 == 57) {
									local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
									local2021 = Static250.aClass2_Sub26_Sub1_2.method4265();
									@Pc(2027) Object[] local2027 = new Object[local2021.length() + 1];
									for (local305 = local2021.length() - 1; local305 >= 0; local305--) {
										if (local2021.charAt(local305) == 's') {
											local2027[local305 + 1] = Static250.aClass2_Sub26_Sub1_2.method4265();
										} else {
											local2027[local305 + 1] = Integer.valueOf(Static250.aClass2_Sub26_Sub1_2.method4228());
										}
									}
									local2027[0] = Integer.valueOf(Static250.aClass2_Sub26_Sub1_2.method4228());
									if (Static20.method1065(local293)) {
										@Pc(2083) Class2_Sub6 local2083 = new Class2_Sub6();
										local2083.anObjectArray1 = local2027;
										Static73.method1363(local2083);
									}
									Static21.anInt508 = -1;
									return true;
								} else if (Static21.anInt508 == 114) {
									local293 = Static250.aClass2_Sub26_Sub1_2.method4269();
									Static58.aClass28_5 = Static299.aClass177_5.method4672(local293);
									Static21.anInt508 = -1;
									return true;
								} else if (Static21.anInt508 == 102) {
									local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
									local297 = Static250.aClass2_Sub26_Sub1_2.method4233();
									if (local293 == 65535) {
										local293 = -1;
									}
									Static127.method2263(local293, local297);
									Static21.anInt508 = -1;
									return true;
								} else if (Static21.anInt508 == 106) {
									local293 = Static250.aClass2_Sub26_Sub1_2.method4221();
									local297 = Static250.aClass2_Sub26_Sub1_2.method4247();
									local301 = Static250.aClass2_Sub26_Sub1_2.method4215();
									if (local301 == 65535) {
										local301 = -1;
									}
									Static253.method4070(local297, local293, local301);
									Static21.anInt508 = -1;
									return true;
								} else {
									@Pc(2185) String local2185;
									if (Static21.anInt508 == 245) {
										local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
										local2185 = Static178.method3305(Static32.method641(Static158.method2715(Static250.aClass2_Sub26_Sub1_2)));
										Static173.method2979(Static77.method1383(local129), local2185, 6);
										Static21.anInt508 = -1;
										return true;
									} else if (Static21.anInt508 == 248) {
										Static295.method4895();
										Static202.anInt4211 = Static250.aClass2_Sub26_Sub1_2.method4255();
										Static21.anInt508 = -1;
										Static250.anInt4981 = Static13.anInt334;
										return true;
									} else {
										@Pc(2230) String local2230;
										if (Static21.anInt508 == 221) {
											local293 = Static250.aClass2_Sub26_Sub1_2.method4215();
											local297 = Static250.aClass2_Sub26_Sub1_2.method4261();
											local301 = Static250.aClass2_Sub26_Sub1_2.method4261();
											local2230 = Static250.aClass2_Sub26_Sub1_2.method4265();
											if (local293 == 65535) {
												local293 = -1;
											}
											if (local297 >= 1 && local297 <= 8) {
												if (local2230.equalsIgnoreCase("null")) {
													local2230 = null;
												}
												Static27.aStringArray2[local297 - 1] = local2230;
												Static288.anIntArray514[local297 - 1] = local293;
												Static241.aBooleanArray25[local297 - 1] = local301 == 0;
											}
											Static21.anInt508 = -1;
											return true;
										} else if (Static21.anInt508 == 38) {
											local293 = Static250.aClass2_Sub26_Sub1_2.method4233();
											local297 = Static250.aClass2_Sub26_Sub1_2.method4274();
											local301 = Static250.aClass2_Sub26_Sub1_2.method4261();
											Static208.anInt4335 = local293 >> 1;
											Static111.aClass36_Sub3_Sub2_1.method4112((local293 & 0x1) == 1, local297, local301);
											Static21.anInt508 = -1;
											return true;
										} else if (Static21.anInt508 == 96) {
											local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
											local297 = Static250.aClass2_Sub26_Sub1_2.method4233();
											local301 = Static250.aClass2_Sub26_Sub1_2.method4236();
											if (Static20.method1065(local293)) {
												if (local297 == 2) {
													Static296.method4923();
												}
												Static17.anInt427 = local301;
												Static174.method3012(local301);
												Static208.method3526(false);
												Static95.method1829(Static17.anInt427);
												for (local305 = 0; local305 < 100; local305++) {
													Static165.aBooleanArray16[local305] = true;
												}
											}
											Static21.anInt508 = -1;
											return true;
										} else {
											@Pc(2380) boolean local2380;
											@Pc(2487) String local2487;
											if (Static21.anInt508 == 182) {
												local2380 = false;
												local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
												if ((local129 & Long.MIN_VALUE) != 0L) {
													local2380 = true;
												}
												local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
												@Pc(2401) byte local2401 = Static250.aClass2_Sub26_Sub1_2.method4220();
												if (local2380) {
													if (Static25.anInt5780 == 0) {
														Static21.anInt508 = -1;
														return true;
													}
													local129 &= Long.MAX_VALUE;
													for (local375 = 0; local375 < Static25.anInt5780 && (local129 != Static137.aClass2_Sub30Array1[local375].aLong315 || Static137.aClass2_Sub30Array1[local375].anInt5687 != local301); local375++) {
													}
													if (Static25.anInt5780 > local375) {
														while (Static25.anInt5780 - 1 > local375) {
															Static137.aClass2_Sub30Array1[local375] = Static137.aClass2_Sub30Array1[local375 + 1];
															local375++;
														}
														Static25.anInt5780--;
														Static137.aClass2_Sub30Array1[Static25.anInt5780] = null;
													}
												} else {
													local2487 = Static250.aClass2_Sub26_Sub1_2.method4265();
													@Pc(2491) Class2_Sub30 local2491 = new Class2_Sub30();
													local2491.aLong315 = local129;
													local2491.aString267 = Static21.method454(local2491.aLong315);
													local2491.aByte24 = local2401;
													local2491.aString269 = local2487;
													local2491.anInt5687 = local301;
													for (local147 = Static25.anInt5780 - 1; local147 >= 0; local147--) {
														local1246 = Static137.aClass2_Sub30Array1[local147].aString267.compareTo(local2491.aString267);
														if (local1246 == 0) {
															Static137.aClass2_Sub30Array1[local147].anInt5687 = local301;
															Static137.aClass2_Sub30Array1[local147].aByte24 = local2401;
															Static137.aClass2_Sub30Array1[local147].aString269 = local2487;
															Static67.anInt6127 = Static13.anInt334;
															if (local129 == Static88.aLong249) {
																Static19.aByte2 = local2401;
															}
															Static21.anInt508 = -1;
															return true;
														}
														if (local1246 < 0) {
															break;
														}
													}
													if (Static137.aClass2_Sub30Array1.length <= Static25.anInt5780) {
														Static21.anInt508 = -1;
														return true;
													}
													for (local1246 = Static25.anInt5780 - 1; local1246 > local147; local1246--) {
														Static137.aClass2_Sub30Array1[local1246 + 1] = Static137.aClass2_Sub30Array1[local1246];
													}
													if (Static25.anInt5780 == 0) {
														Static137.aClass2_Sub30Array1 = new Class2_Sub30[100];
													}
													Static137.aClass2_Sub30Array1[local147 + 1] = local2491;
													if (local129 == Static88.aLong249) {
														Static19.aByte2 = local2401;
													}
													Static25.anInt5780++;
												}
												Static67.anInt6127 = Static13.anInt334;
												Static21.anInt508 = -1;
												return true;
											} else if (Static21.anInt508 == 44) {
												if (Static4.anInt151 == 0) {
													Static69.aString79 = Static109.aString121;
												} else {
													Static69.aString79 = Static250.aClass2_Sub26_Sub1_2.method4265();
												}
												Static21.anInt508 = -1;
												return true;
											} else if (Static21.anInt508 == 83) {
												Static67.anInt6127 = Static13.anInt334;
												local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
												if (local129 == 0L) {
													Static25.anInt5780 = 0;
													Static21.anInt508 = -1;
													Static277.aString274 = null;
													Static137.aClass2_Sub30Array1 = null;
													Static275.aString271 = null;
													return true;
												}
												local134 = Static250.aClass2_Sub26_Sub1_2.method4264();
												Static277.aString274 = Static21.method454(local134);
												Static275.aString271 = Static21.method454(local129);
												Static4.aByte1 = Static250.aClass2_Sub26_Sub1_2.method4220();
												local371 = Static250.aClass2_Sub26_Sub1_2.method4261();
												if (local371 == 255) {
													Static21.anInt508 = -1;
													return true;
												}
												Static25.anInt5780 = local371;
												@Pc(2714) Class2_Sub30[] local2714 = new Class2_Sub30[100];
												for (local143 = 0; local143 < Static25.anInt5780; local143++) {
													local2714[local143] = new Class2_Sub30();
													local2714[local143].aLong315 = Static250.aClass2_Sub26_Sub1_2.method4264();
													local2714[local143].aString267 = Static21.method454(local2714[local143].aLong315);
													local2714[local143].anInt5687 = Static250.aClass2_Sub26_Sub1_2.method4242();
													local2714[local143].aByte24 = Static250.aClass2_Sub26_Sub1_2.method4220();
													local2714[local143].aString269 = Static250.aClass2_Sub26_Sub1_2.method4265();
													if (Static88.aLong249 == local2714[local143].aLong315) {
														Static19.aByte2 = local2714[local143].aByte24;
													}
												}
												local1246 = Static25.anInt5780;
												while (local1246 > 0) {
													local655 = true;
													local1246--;
													for (local730 = 0; local730 < local1246; local730++) {
														if (local2714[local730].aString267.compareTo(local2714[local730 + 1].aString267) > 0) {
															@Pc(2813) Class2_Sub30 local2813 = local2714[local730];
															local2714[local730] = local2714[local730 + 1];
															local655 = false;
															local2714[local730 + 1] = local2813;
														}
													}
													if (local655) {
														break;
													}
												}
												Static21.anInt508 = -1;
												Static137.aClass2_Sub30Array1 = local2714;
												return true;
											} else {
												@Pc(2851) String local2851;
												if (Static21.anInt508 == 108) {
													local2851 = Static250.aClass2_Sub26_Sub1_2.method4265();
													if (local2851.endsWith(":tradereq:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":"));
														local134 = Static61.method2447(local2021);
														local2380 = false;
														for (local375 = 0; local375 < Static11.anInt296; local375++) {
															if (local134 == Static281.aLongArray23[local375]) {
																local2380 = true;
																break;
															}
														}
														if (!local2380 && Static293.anInt6087 == 0) {
															Static173.method2979(local2021, Static52.aString59, 4);
														}
													} else if (local2851.endsWith(":chalreq:")) {
														local2380 = false;
														local2021 = local2851.substring(0, local2851.indexOf(":"));
														local134 = Static61.method2447(local2021);
														for (local375 = 0; local375 < Static11.anInt296; local375++) {
															if (Static281.aLongArray23[local375] == local134) {
																local2380 = true;
																break;
															}
														}
														if (!local2380 && Static293.anInt6087 == 0) {
															local2487 = local2851.substring(local2851.indexOf(":") + 1, local2851.length() + -9);
															Static173.method2979(local2021, local2487, 8);
														}
													} else if (local2851.endsWith(":assistreq:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":"));
														local134 = Static61.method2447(local2021);
														local2380 = false;
														for (local375 = 0; local375 < Static11.anInt296; local375++) {
															if (Static281.aLongArray23[local375] == local134) {
																local2380 = true;
																break;
															}
														}
														if (!local2380 && Static293.anInt6087 == 0) {
															Static173.method2979(local2021, "", 10);
														}
													} else if (local2851.endsWith(":clan:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":clan:"));
														Static173.method2979("", local2021, 11);
													} else if (local2851.endsWith(":trade:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":trade:"));
														if (Static293.anInt6087 == 0) {
															Static173.method2979("", local2021, 12);
														}
													} else if (local2851.endsWith(":assist:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":assist:"));
														if (Static293.anInt6087 == 0) {
															Static173.method2979("", local2021, 13);
														}
													} else if (local2851.endsWith(":duelstake:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":"));
														local134 = Static61.method2447(local2021);
														local2380 = false;
														for (local375 = 0; local375 < Static11.anInt296; local375++) {
															if (Static281.aLongArray23[local375] == local134) {
																local2380 = true;
																break;
															}
														}
														if (!local2380 && Static293.anInt6087 == 0) {
															Static173.method2979(local2021, "", 14);
														}
													} else if (local2851.endsWith(":duelfriend:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":"));
														local134 = Static61.method2447(local2021);
														local2380 = false;
														for (local375 = 0; local375 < Static11.anInt296; local375++) {
															if (Static281.aLongArray23[local375] == local134) {
																local2380 = true;
																break;
															}
														}
														if (!local2380 && Static293.anInt6087 == 0) {
															Static173.method2979(local2021, "", 15);
														}
													} else if (local2851.endsWith(":clanreq:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":"));
														local134 = Static61.method2447(local2021);
														local2380 = false;
														for (local375 = 0; local375 < Static11.anInt296; local375++) {
															if (Static281.aLongArray23[local375] == local134) {
																local2380 = true;
																break;
															}
														}
														if (!local2380 && Static293.anInt6087 == 0) {
															Static173.method2979(local2021, "", 16);
														}
													} else if (local2851.endsWith(":allyreq:")) {
														local2021 = local2851.substring(0, local2851.indexOf(":"));
														local134 = Static61.method2447(local2021);
														local2380 = false;
														for (local375 = 0; local375 < Static11.anInt296; local375++) {
															if (Static281.aLongArray23[local375] == local134) {
																local2380 = true;
																break;
															}
														}
														if (!local2380 && Static293.anInt6087 == 0) {
															local2487 = local2851.substring(local2851.indexOf(":") + 1, local2851.length() + -9);
															Static173.method2979(local2021, local2487, 21);
														}
													} else {
														Static173.method2979("", local2851, 0);
													}
													Static21.anInt508 = -1;
													return true;
												}
												@Pc(3355) Class2_Sub15 local3355;
												if (Static21.anInt508 == 31) {
													local293 = Static250.aClass2_Sub26_Sub1_2.method4269();
													local297 = Static250.aClass2_Sub26_Sub1_2.method4261();
													local301 = Static250.aClass2_Sub26_Sub1_2.method4215();
													local305 = Static250.aClass2_Sub26_Sub1_2.method4242();
													if (Static20.method1065(local305)) {
														local3355 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local293);
														if (local3355 != null) {
															Static119.method2202(local3355, local301 != local3355.anInt2424);
														}
														Static199.method3363(local297, local301, local293);
													}
													Static21.anInt508 = -1;
													return true;
												} else if (Static21.anInt508 == 171) {
													Static105.anInt2264 = Static250.aClass2_Sub26_Sub1_2.method4261();
													Static184.anInt3910 = Static13.anInt334;
													Static21.anInt508 = -1;
													return true;
												} else if (Static21.anInt508 == 155) {
													if (Static8.aFrame1 != null) {
														Static190.method3495(-1, Static2.anInt5946, false, -1);
													}
													@Pc(3412) byte[] local3412 = new byte[Static4.anInt151];
													Static250.aClass2_Sub26_Sub1_2.method4280(Static4.anInt151, local3412);
													local2021 = Static236.method3911(local3412, Static4.anInt151, 0);
													if (Static298.aFrame3 == null && (Static282.anInt5835 == 3 || !Static282.aString285.startsWith("win") || Static53.aBoolean90)) {
														Static247.method3966(true, local2021);
													} else {
														Static53.aBoolean91 = true;
														Static192.aString200 = local2021;
														Static77.aClass28_6 = Static299.aClass177_5.method4679(local2021);
													}
													Static21.anInt508 = -1;
													return true;
												} else {
													@Pc(3673) int local3673;
													if (Static21.anInt508 == 71) {
														local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local2380 = true;
														local305 = Static250.aClass2_Sub26_Sub1_2.method4261();
														if (local129 < 0L) {
															local2380 = false;
															local129 &= Long.MAX_VALUE;
														}
														local2487 = "";
														if (local301 > 0) {
															local2487 = Static250.aClass2_Sub26_Sub1_2.method4265();
														}
														@Pc(3502) String local3502 = Static77.method1383(local129);
														for (local147 = 0; local147 < Static151.anInt3192; local147++) {
															if (local129 == Static67.aLongArray25[local147]) {
																if (local301 != Static18.anIntArray29[local147]) {
																	Static18.anIntArray29[local147] = local301;
																	if (local301 > 0) {
																		Static173.method2979("", local3502 + Static299.aString131, 5);
																	}
																	if (local301 == 0) {
																		Static173.method2979("", local3502 + Static139.aString140, 5);
																	}
																}
																local3502 = null;
																Static124.aStringArray10[local147] = local2487;
																Static264.anIntArray482[local147] = local305;
																Static299.aBooleanArray13[local147] = local2380;
																break;
															}
														}
														if (local3502 != null && Static151.anInt3192 < 200) {
															Static67.aLongArray25[Static151.anInt3192] = local129;
															Static56.aStringArray5[Static151.anInt3192] = local3502;
															Static18.anIntArray29[Static151.anInt3192] = local301;
															Static124.aStringArray10[Static151.anInt3192] = local2487;
															Static264.anIntArray482[Static151.anInt3192] = local305;
															Static299.aBooleanArray13[Static151.anInt3192] = local2380;
															Static151.anInt3192++;
														}
														Static184.anInt3910 = Static13.anInt334;
														local1246 = Static151.anInt3192;
														while (local1246 > 0) {
															local1246--;
															@Pc(3629) boolean local3629 = true;
															for (local730 = 0; local730 < local1246; local730++) {
																if (Static186.anInt3934 != Static18.anIntArray29[local730] && Static18.anIntArray29[local730 + 1] == Static186.anInt3934 || Static18.anIntArray29[local730] == 0 && Static18.anIntArray29[local730 + 1] != 0) {
																	local3629 = false;
																	local3673 = Static18.anIntArray29[local730];
																	Static18.anIntArray29[local730] = Static18.anIntArray29[local730 + 1];
																	Static18.anIntArray29[local730 + 1] = local3673;
																	local228 = Static124.aStringArray10[local730];
																	Static124.aStringArray10[local730] = Static124.aStringArray10[local730 + 1];
																	Static124.aStringArray10[local730 + 1] = local228;
																	local1334 = Static56.aStringArray5[local730];
																	Static56.aStringArray5[local730] = Static56.aStringArray5[local730 + 1];
																	Static56.aStringArray5[local730 + 1] = local1334;
																	@Pc(3727) long local3727 = Static67.aLongArray25[local730];
																	Static67.aLongArray25[local730] = Static67.aLongArray25[local730 + 1];
																	Static67.aLongArray25[local730 + 1] = local3727;
																	@Pc(3745) int local3745 = Static264.anIntArray482[local730];
																	Static264.anIntArray482[local730] = Static264.anIntArray482[local730 + 1];
																	Static264.anIntArray482[local730 + 1] = local3745;
																	@Pc(3763) boolean local3763 = Static299.aBooleanArray13[local730];
																	Static299.aBooleanArray13[local730] = Static299.aBooleanArray13[local730 + 1];
																	Static299.aBooleanArray13[local730 + 1] = local3763;
																}
															}
															if (local3629) {
																break;
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 119) {
														local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
														local134 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local139 = Static250.aClass2_Sub26_Sub1_2.method4245();
														@Pc(3812) long local3812 = (local134 << 32) + local139;
														@Pc(3814) boolean local3814 = false;
														local143 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local3673 = 0;
														label1396: while (true) {
															if (local3673 < 100) {
																if (Static292.aLongArray24[local3673] != local3812) {
																	local3673++;
																	continue;
																}
																local3814 = true;
																break;
															}
															if (local143 <= 1) {
																if (Static104.aBoolean180 && !Static166.aBoolean281 || Static196.aBoolean342) {
																	local3814 = true;
																} else {
																	for (local3673 = 0; local3673 < Static11.anInt296; local3673++) {
																		if (Static281.aLongArray23[local3673] == local129) {
																			local3814 = true;
																			break label1396;
																		}
																	}
																}
															}
															break;
														}
														if (!local3814 && Static293.anInt6087 == 0) {
															Static292.aLongArray24[Static155.anInt6184] = local3812;
															Static155.anInt6184 = (Static155.anInt6184 + 1) % 100;
															@Pc(3903) String local3903 = Static178.method3305(Static32.method641(Static158.method2715(Static250.aClass2_Sub26_Sub1_2)));
															if (local143 == 2 || local143 == 3) {
																Static173.method2979("<img=1>" + Static77.method1383(local129), local3903, 7);
															} else if (local143 == 1) {
																Static173.method2979("<img=0>" + Static77.method1383(local129), local3903, 7);
															} else {
																Static173.method2979(Static77.method1383(local129), local3903, 3);
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 45) {
														Static250.aClass2_Sub26_Sub1_2.anInt5328 += 28;
														if (Static250.aClass2_Sub26_Sub1_2.method4235()) {
															Static119.method2201(Static250.aClass2_Sub26_Sub1_2, Static250.aClass2_Sub26_Sub1_2.anInt5328 - 28);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 198) {
														Static73.method1367(Static250.aClass2_Sub26_Sub1_2.method4265());
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 153 || Static21.anInt508 == 46 || Static21.anInt508 == 142 || Static21.anInt508 == 194 || Static21.anInt508 == 117 || Static21.anInt508 == 36 || Static21.anInt508 == 47 || Static21.anInt508 == 233 || Static21.anInt508 == 207 || Static21.anInt508 == 147 || Static21.anInt508 == 64 || Static21.anInt508 == 218 || Static21.anInt508 == 250 || Static21.anInt508 == 78) {
														method4091();
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 56) {
														Static90.method1696(true);
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 210) {
														Static166.method2867();
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 228) {
														local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local2230 = Static190.method3493(local301).method4626(Static250.aClass2_Sub26_Sub1_2);
														Static27.method518(local2230, local301, 19, null, Static77.method1383(local129));
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 4) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
														if (Static20.method1065(local293)) {
															Static229.method4372();
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 37) {
														Static11.anInt296 = Static4.anInt151 / 8;
														for (local293 = 0; local293 < Static11.anInt296; local293++) {
															Static281.aLongArray23[local293] = Static250.aClass2_Sub26_Sub1_2.method4264();
															Static105.aStringArray8[local293] = Static219.method3699(Static281.aLongArray23[local293]);
															Static76.aBooleanArray6[local293] = false;
														}
														Static184.anInt3910 = Static13.anInt334;
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 77) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4233();
														if (Static20.method1065(local293)) {
															Static233.anInt4789 = local297;
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 70) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4228();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4242();
														if (local293 < -70000) {
															local297 += 32768;
														}
														if (local293 < 0) {
															local1648 = null;
														} else {
															local1648 = Static90.method1692(local293);
														}
														if (local1648 != null) {
															for (local305 = 0; local305 < local1648.anIntArray271.length; local305++) {
																local1648.anIntArray271[local305] = 0;
																local1648.anIntArray270[local305] = 0;
															}
														}
														Static100.method1916(local297);
														local305 = Static250.aClass2_Sub26_Sub1_2.method4242();
														for (local371 = 0; local371 < local305; local371++) {
															local375 = Static250.aClass2_Sub26_Sub1_2.method4233();
															if (local375 == 255) {
																local375 = Static250.aClass2_Sub26_Sub1_2.method4269();
															}
															local143 = Static250.aClass2_Sub26_Sub1_2.method4215();
															if (local1648 != null && local371 < local1648.anIntArray271.length) {
																local1648.anIntArray271[local371] = local143;
																local1648.anIntArray270[local371] = local375;
															}
															Static30.method634(local375, local371, local297, local143 - 1);
														}
														if (local1648 != null) {
															Static298.method4263(local1648);
														}
														Static295.method4895();
														Static245.anIntArray480[Static56.anInt1272++ & 0x1F] = local297 & 0x7FFF;
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 241) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4257();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4228();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4236();
														local305 = Static250.aClass2_Sub26_Sub1_2.method4215();
														local371 = Static250.aClass2_Sub26_Sub1_2.method4215();
														if (Static20.method1065(local305)) {
															Static82.method4611(7, local371, local297, local293 | local301 << 16);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 121) {
														Static90.method1696(false);
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 87) {
														local129 = Static250.aClass2_Sub26_Sub1_2.method4264();
														Static250.aClass2_Sub26_Sub1_2.method4220();
														@Pc(4416) boolean local4416 = false;
														local134 = Static250.aClass2_Sub26_Sub1_2.method4264();
														local139 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local1242 = Static250.aClass2_Sub26_Sub1_2.method4245();
														local1246 = Static250.aClass2_Sub26_Sub1_2.method4261();
														@Pc(4440) long local4440 = local1242 + (local139 << 32);
														local730 = Static250.aClass2_Sub26_Sub1_2.method4242();
														@Pc(4446) int local4446 = 0;
														label1438: while (true) {
															if (local4446 >= 100) {
																if (local1246 <= 1) {
																	for (local4446 = 0; local4446 < Static11.anInt296; local4446++) {
																		if (local129 == Static281.aLongArray23[local4446]) {
																			local4416 = true;
																			break label1438;
																		}
																	}
																}
																break;
															}
															if (Static292.aLongArray24[local4446] == local4440) {
																local4416 = true;
																break;
															}
															local4446++;
														}
														if (!local4416 && Static293.anInt6087 == 0) {
															Static292.aLongArray24[Static155.anInt6184] = local4440;
															Static155.anInt6184 = (Static155.anInt6184 + 1) % 100;
															@Pc(4517) String local4517 = Static190.method3493(local730).method4626(Static250.aClass2_Sub26_Sub1_2);
															if (local1246 == 2 || local1246 == 3) {
																Static27.method518(local4517, local730, 20, Static77.method1383(local134), "<img=1>" + Static77.method1383(local129));
															} else if (local1246 == 1) {
																Static27.method518(local4517, local730, 20, Static77.method1383(local134), "<img=0>" + Static77.method1383(local129));
															} else {
																Static27.method518(local4517, local730, 20, Static77.method1383(local134), Static77.method1383(local129));
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 189) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4215();
														local2021 = Static250.aClass2_Sub26_Sub1_2.method4265();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4228();
														if (Static20.method1065(local293)) {
															Static87.method1630(local2021, local301);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 196) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4269();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4236();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4227();
														if (Static20.method1065(local297)) {
															@Pc(4638) Class2_Sub15 local4638 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local301);
															local3355 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local293);
															if (local3355 != null) {
																Static119.method2202(local3355, local4638 == null || local3355.anInt2424 != local4638.anInt2424);
															}
															if (local4638 != null) {
																local4638.method4926();
																Static152.aClass79_14.method1994((long) local293, local4638);
															}
															@Pc(4680) Class115 local4680 = Static90.method1692(local301);
															if (local4680 != null) {
																Static298.method4263(local4680);
															}
															local4680 = Static90.method1692(local293);
															if (local4680 != null) {
																Static298.method4263(local4680);
																Static126.method2252(local4680, true);
															}
															if (Static17.anInt427 != -1) {
																Static11.method254(1, Static17.anInt427);
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 185) {
														Static295.method4895();
														Static42.anInt1046 = Static250.aClass2_Sub26_Sub1_2.method4261();
														Static21.anInt508 = -1;
														Static250.anInt4981 = Static13.anInt334;
														return true;
													} else if (Static21.anInt508 == 91) {
														if (Static17.anInt427 != -1) {
															Static11.method254(0, Static17.anInt427);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 206) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local305 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local371 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local375 = Static250.aClass2_Sub26_Sub1_2.method4261();
														if (Static20.method1065(local293)) {
															Static30.method635(local371, local375, local301, local305, local297);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 80) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4215();
														@Pc(4806) byte local4806 = Static250.aClass2_Sub26_Sub1_2.method4220();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4215();
														if (Static20.method1065(local301)) {
															Static4.method118(local293, local4806);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 160) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
														if (local293 == 65535) {
															local293 = -1;
														}
														local297 = Static250.aClass2_Sub26_Sub1_2.method4214();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4236();
														if (Static20.method1065(local301)) {
															Static82.method4611(1, -1, local297, local293);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 63) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4227();
														local297 = local293 >> 28 & 0x3;
														local305 = local293 & 0x3FFF;
														local301 = local293 >> 14 & 0x3FFF;
														local371 = Static250.aClass2_Sub26_Sub1_2.method4215();
														local375 = Static250.aClass2_Sub26_Sub1_2.method4247();
														local301 -= Static125.anInt5772;
														if (local371 == 65535) {
															local371 = -1;
														}
														local143 = local375 >> 2;
														local147 = local375 & 0x3;
														local1246 = Static158.anIntArray235[local143];
														local305 -= Static203.anInt4236;
														Static36.method716(local371, local301, local143, local1246, local147, local297, local305);
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 41) {
														Static109.method2019(Static299.aClass177_5, Static250.aClass2_Sub26_Sub1_2, Static4.anInt151);
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 143) {
														Static197.anInt4129 = 0;
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 61) {
														Static169.anInt3576 = Static250.aClass2_Sub26_Sub1_2.method4261();
														Static84.anInt805 = Static250.aClass2_Sub26_Sub1_2.method4261();
														Static221.anInt4608 = Static250.aClass2_Sub26_Sub1_2.method4261();
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 2) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4227();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4242();
														Static289.method4809(local293, local297);
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 179) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
														if (Static20.method1065(local293)) {
															Static181.method3135();
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 99) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4257();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4215();
														local2185 = Static250.aClass2_Sub26_Sub1_2.method4265();
														if (Static20.method1065(local297)) {
															Static104.method1944(local293, local2185);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 27) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4261();
														if (Static250.aClass2_Sub26_Sub1_2.method4261() == 0) {
															Static35.aClass174Array1[local293] = new Class174();
														} else {
															Static250.aClass2_Sub26_Sub1_2.anInt5328--;
															Static35.aClass174Array1[local293] = new Class174(Static250.aClass2_Sub26_Sub1_2);
														}
														Static21.anInt508 = -1;
														Static62.anInt1374 = Static13.anInt334;
														return true;
													} else if (Static21.anInt508 == 229) {
														local2851 = Static250.aClass2_Sub26_Sub1_2.method4265();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4257();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4257();
														if (Static20.method1065(local297)) {
															Static104.method1944(local301, local2851);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 205) {
														Static110.anInt2374 = Static250.aClass2_Sub26_Sub1_2.method4261();
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 98) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4257();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4227();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4236();
														if (Static20.method1065(local293)) {
															Static202.method3403(local297, local301);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 127) {
														Static29.anInt711 = Static250.aClass2_Sub26_Sub1_2.method4274();
														Static180.anInt3871 = Static250.aClass2_Sub26_Sub1_2.method4247();
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 215) {
														Static226.method1673();
														Static21.anInt508 = -1;
														return false;
													} else if (Static21.anInt508 == 139) {
														Static180.anInt3871 = Static250.aClass2_Sub26_Sub1_2.method4247();
														Static29.anInt711 = Static250.aClass2_Sub26_Sub1_2.method4247();
														while (Static250.aClass2_Sub26_Sub1_2.anInt5328 < Static4.anInt151) {
															Static21.anInt508 = Static250.aClass2_Sub26_Sub1_2.method4261();
															method4091();
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 105) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4269();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4214();
														if (local293 == 65535) {
															local293 = -1;
														}
														local305 = Static250.aClass2_Sub26_Sub1_2.method4257();
														if (Static20.method1065(local305)) {
															@Pc(5244) Class115 local5244 = Static90.method1692(local297);
															@Pc(5256) Class155 local5256;
															if (local5244.aBoolean291) {
																Static209.method1566(local297, local293, local301);
																local5256 = Static152.method2616(local293);
																Static111.method2065(local5256.anInt4813, local5256.anInt4851, local297, local5256.anInt4811);
																Static268.method4457(local297, local5256.anInt4815, local5256.anInt4853, local5256.anInt4859);
															} else if (local293 == -1) {
																Static21.anInt508 = -1;
																local5244.anInt3483 = 0;
																return true;
															} else {
																local5256 = Static152.method2616(local293);
																local5244.anInt3524 = local5256.anInt4813 * 100 / local301;
																local5244.anInt3483 = 4;
																local5244.anInt3557 = local5256.anInt4851;
																local5244.anInt3480 = local5256.anInt4811;
																local5244.anInt3465 = local293;
																Static298.method4263(local5244);
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 178) {
														for (local293 = 0; local293 < Static249.anIntArray446.length; local293++) {
															if (Static249.anIntArray446[local293] != Static171.anIntArray297[local293]) {
																Static249.anIntArray446[local293] = Static171.anIntArray297[local293];
																Static153.method2649(local293);
																Static243.anIntArray302[Static261.anInt5432++ & 0x1F] = local293;
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 35) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4215();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4228();
														if (Static20.method1065(local293)) {
															local301 = 0;
															if (Static111.aClass36_Sub3_Sub2_1.aClass126_2 != null) {
																local301 = Static111.aClass36_Sub3_Sub2_1.aClass126_2.method3197();
															}
															Static82.method4611(3, -1, local297, local301);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 53) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4214();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4227();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
														if (local301 == 65535) {
															local301 = -1;
														}
														local305 = Static250.aClass2_Sub26_Sub1_2.method4257();
														if (local305 == 65535) {
															local305 = -1;
														}
														local371 = Static250.aClass2_Sub26_Sub1_2.method4257();
														if (Static20.method1065(local371)) {
															for (local375 = local301; local375 <= local305; local375++) {
																local1242 = (long) local375 + ((long) local297 << 32);
																local1882 = (Class2_Sub11) Static293.aClass79_23.method2002(local1242);
																if (local1882 != null) {
																	local1893 = new Class2_Sub11(local293, local1882.anInt1528);
																	local1882.method4926();
																} else if (local375 == -1) {
																	local1893 = new Class2_Sub11(local293, Static90.method1692(local297).aClass2_Sub11_1.anInt1528);
																} else {
																	local1893 = new Class2_Sub11(local293, -1);
																}
																Static293.aClass79_23.method1994(local1242, local1893);
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 197) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4257();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4214();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4242();
														if (Static20.method1065(local301)) {
															Static4.method118(local293, local297);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 23) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4236();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4269();
														Static298.method4223(local293, local297);
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 62) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local301 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local305 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local371 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local375 = Static250.aClass2_Sub26_Sub1_2.method4261();
														if (Static20.method1065(local293)) {
															Static216.method3647(local305, local297, local301, true, local375, local371);
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 48) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4242();
														local297 = Static250.aClass2_Sub26_Sub1_2.method4228();
														if (Static20.method1065(local293)) {
															@Pc(5645) Class2_Sub15 local5645 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local297);
															if (local5645 != null) {
																Static119.method2202(local5645, true);
															}
															if (Static50.aClass115_6 != null) {
																Static298.method4263(Static50.aClass115_6);
																Static50.aClass115_6 = null;
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 208) {
														for (local293 = 0; local293 < Static212.aClass36_Sub3_Sub2Array1.length; local293++) {
															if (Static212.aClass36_Sub3_Sub2Array1[local293] != null) {
																Static212.aClass36_Sub3_Sub2Array1[local293].anInt5087 = -1;
															}
														}
														for (local293 = 0; local293 < Static201.aClass36_Sub3_Sub1Array1.length; local293++) {
															if (Static201.aClass36_Sub3_Sub1Array1[local293] != null) {
																Static201.aClass36_Sub3_Sub1Array1[local293].anInt5087 = -1;
															}
														}
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 159) {
														Static58.method1121();
														Static21.anInt508 = -1;
														return true;
													} else if (Static21.anInt508 == 24) {
														local293 = Static250.aClass2_Sub26_Sub1_2.method4261();
														local297 = local293 >> 5;
														local301 = local293 & 0x1F;
														if (local301 == 0) {
															Static289.aClass180Array1[local297] = null;
															Static21.anInt508 = -1;
															return true;
														}
														@Pc(5751) Class180 local5751 = new Class180();
														local5751.anInt5905 = local301;
														local5751.anInt5905 = local293 & 0x3F;
														local5751.anInt5904 = Static250.aClass2_Sub26_Sub1_2.method4261();
														if (local5751.anInt5904 >= 0 && local5751.anInt5904 < Static106.aClass2_Sub3_Sub1Array6.length) {
															if (local5751.anInt5905 == 1 || local5751.anInt5905 == 10) {
																local5751.anInt5897 = Static250.aClass2_Sub26_Sub1_2.method4242();
																Static250.aClass2_Sub26_Sub1_2.anInt5328 += 5;
															} else if (local5751.anInt5905 >= 2 && local5751.anInt5905 <= 6) {
																if (local5751.anInt5905 == 2) {
																	local5751.anInt5906 = 64;
																	local5751.anInt5900 = 64;
																}
																if (local5751.anInt5905 == 3) {
																	local5751.anInt5900 = 64;
																	local5751.anInt5906 = 0;
																}
																if (local5751.anInt5905 == 4) {
																	local5751.anInt5906 = 128;
																	local5751.anInt5900 = 64;
																}
																if (local5751.anInt5905 == 5) {
																	local5751.anInt5906 = 64;
																	local5751.anInt5900 = 0;
																}
																if (local5751.anInt5905 == 6) {
																	local5751.anInt5906 = 64;
																	local5751.anInt5900 = 128;
																}
																local5751.anInt5905 = 2;
																local5751.anInt5899 = Static250.aClass2_Sub26_Sub1_2.method4242();
																local5751.anInt5902 = Static250.aClass2_Sub26_Sub1_2.method4242();
																local5751.anInt5895 = Static250.aClass2_Sub26_Sub1_2.method4261();
																local5751.anInt5903 = Static250.aClass2_Sub26_Sub1_2.method4242();
															}
															local5751.anInt5901 = Static250.aClass2_Sub26_Sub1_2.method4242();
															if (local5751.anInt5901 == 65535) {
																local5751.anInt5901 = -1;
															}
															Static289.aClass180Array1[local297] = local5751;
														}
														Static21.anInt508 = -1;
														return true;
													} else {
														Static108.method2009(null, "T1 - " + Static21.anInt508 + "," + Static126.anInt2647 + "," + Static47.anInt1117 + " - " + Static4.anInt151);
														Static226.method1673();
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
