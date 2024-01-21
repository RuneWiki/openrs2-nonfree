import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!wa", name = "Eb", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_75;

	@OriginalMember(owner = "client!wa", name = "U", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1508 = Static108.method1915("(U3");

	@OriginalMember(owner = "client!wa", name = "gc", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1517 = Static108.method1915("glow2:");

	@OriginalMember(owner = "client!wa", name = "V", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1509 = aClass39_1517;

	@OriginalMember(owner = "client!wa", name = "W", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1510 = Static108.method1915("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "[I")
	public static int[] anIntArray473 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!wa", name = "ac", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1516 = Static108.method1915("Loaded sprites");

	@OriginalMember(owner = "client!wa", name = "tb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1511 = aClass39_1516;

	@OriginalMember(owner = "client!wa", name = "ub", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1512 = aClass39_1517;

	@OriginalMember(owner = "client!wa", name = "xb", descriptor = "Z")
	public static boolean aBoolean247 = false;

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1513 = Static108.method1915("::errortest");

	@OriginalMember(owner = "client!wa", name = "Qb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1514 = Static108.method1915("rot:");

	@OriginalMember(owner = "client!wa", name = "Tb", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!a;I)I")
	public static int method2117(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub1 arg1) {
		if (arg1.anIntArrayArray1 == null || arg0 >= arg1.anIntArrayArray1.length) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(22) int[] local22 = arg1.anIntArrayArray1[arg0];
			@Pc(24) int local24 = 0;
			@Pc(26) byte local26 = 0;
			while (true) {
				@Pc(31) int local31 = local22[local17++];
				@Pc(33) int local33 = 0;
				@Pc(35) byte local35 = 0;
				if (local31 == 0) {
					return local24;
				}
				if (local31 == 1) {
					local33 = Static1.anIntArray10[local22[local17++]];
				}
				if (local31 == 2) {
					local33 = Static36.anIntArray156[local22[local17++]];
				}
				if (local31 == 15) {
					local35 = 1;
				}
				if (local31 == 16) {
					local35 = 2;
				}
				if (local31 == 17) {
					local35 = 3;
				}
				if (local31 == 3) {
					local33 = Static94.anIntArray339[local22[local17++]];
				}
				@Pc(98) int local98;
				@Pc(111) Class1_Sub1_Sub1 local111;
				@Pc(116) int local116;
				@Pc(129) int local129;
				if (local31 == 4) {
					local98 = local22[local17++] << 16;
					@Pc(105) int local105 = local98 + local22[local17++];
					local111 = Static41.method2106(local105);
					local116 = local22[local17++];
					if (local116 != -1 && (!Static8.method224(local116).aBoolean220 || Static46.aBoolean224)) {
						for (local129 = 0; local129 < local111.anIntArray9.length; local129++) {
							if (local116 + 1 == local111.anIntArray9[local129]) {
								local33 += local111.anIntArray14[local129];
							}
						}
					}
				}
				if (local31 == 5) {
					local33 = Static44.anIntArray175[local22[local17++]];
				}
				if (local31 == 6) {
					local33 = Class1_Sub13.anIntArray265[Static36.anIntArray156[local22[local17++]] - 1];
				}
				if (local31 == 7) {
					local33 = Static44.anIntArray175[local22[local17++]] * 100 / 46875;
				}
				if (local31 == 8) {
					local33 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2546;
				}
				if (local31 == 9) {
					for (local98 = 0; local98 < 25; local98++) {
						if (Static11.aBooleanArray3[local98]) {
							local33 += Static36.anIntArray156[local98];
						}
					}
				}
				if (local31 == 10) {
					local98 = local22[local17++] << 16;
					local98 += local22[local17++];
					local111 = Static41.method2106(local98);
					local116 = local22[local17++];
					if (local116 != -1 && (!Static8.method224(local116).aBoolean220 || Static46.aBoolean224)) {
						for (local129 = 0; local129 < local111.anIntArray9.length; local129++) {
							if (local116 + 1 == local111.anIntArray9[local129]) {
								local33 = 999999999;
								break;
							}
						}
					}
				}
				if (local31 == 11) {
					local33 = Static82.anInt1995;
				}
				if (local31 == 12) {
					local33 = Static4.anInt162;
				}
				if (local31 == 13) {
					local98 = Static44.anIntArray175[local22[local17++]];
					@Pc(321) int local321 = local22[local17++];
					local33 = (0x1 << local321 & local98) == 0 ? 0 : 1;
				}
				if (local31 == 14) {
					local98 = local22[local17++];
					local33 = Static18.method360(local98);
				}
				if (local31 == 18) {
					local33 = Static71.anInt1795 + (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521 >> 7);
				}
				if (local31 == 19) {
					local33 = (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508 >> 7) + Static103.anInt2610;
				}
				if (local31 == 20) {
					local33 = local22[local17++];
				}
				if (local35 == 0) {
					if (local26 == 0) {
						local24 += local33;
					}
					if (local26 == 1) {
						local24 -= local33;
					}
					if (local26 == 2 && local33 != 0) {
						local24 /= local33;
					}
					if (local26 == 3) {
						local24 *= local33;
					}
					local26 = 0;
				} else {
					local26 = local35;
				}
			}
		} catch (@Pc(418) Exception local418) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
	public static void method2118() {
		aClass39_1512 = null;
		aClass39_1510 = null;
		aClass39_1517 = null;
		aClass39_1516 = null;
		aClass39_1511 = null;
		anIntArray473 = null;
		aClass39_1509 = null;
		aClass39_1513 = null;
		aClass62_Sub1_75 = null;
		aClass39_1514 = null;
		aClass39_1508 = null;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	public static void method2122() {
		Static25.aClass33_10.method1034();
		Static47.aClass33_17.method1034();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBIIII)V")
	public static void method2124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = Static32.aClass5_2.method141(arg1, arg3, arg0);
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(70) int local70;
		@Pc(26) int local26;
		@Pc(56) int local56;
		@Pc(62) int local62;
		if (local15 != 0) {
			local24 = Static32.aClass5_2.method122(arg1, arg3, arg0, local15);
			local26 = arg2;
			if (local15 > 0) {
				local26 = arg4;
			}
			local39 = local24 >> 6 & 0x3;
			@Pc(42) int[] local42 = Static34.aClass1_Sub1_Sub4_Sub4_3.anIntArray327;
			local56 = (103 - arg0) * 2048 + arg3 * 4 + 24624;
			local62 = local15 >> 14 & 0x7FFF;
			@Pc(66) Class1_Sub1_Sub18 local66 = Static104.method1862(local62);
			local70 = local24 & 0x1F;
			if (local66.anInt3055 == -1) {
				if (local70 == 0 || local70 == 2) {
					if (local39 == 0) {
						local42[local56] = local26;
						local42[local56 + 512] = local26;
						local42[local56 + 1024] = local26;
						local42[local56 + 1536] = local26;
					} else if (local39 == 1) {
						local42[local56] = local26;
						local42[local56 + 1] = local26;
						local42[local56 + 2] = local26;
						local42[local56 + 3] = local26;
					} else if (local39 == 2) {
						local42[local56 + 3] = local26;
						local42[local56 + 515] = local26;
						local42[local56 + 1024 + 3] = local26;
						local42[local56 + 1536 + 3] = local26;
					} else if (local39 == 3) {
						local42[local56 + 1536] = local26;
						local42[local56 + 1 + 1536] = local26;
						local42[local56 + 1536 + 2] = local26;
						local42[local56 + 3 + 1536] = local26;
					}
				}
				if (local70 == 3) {
					if (local39 == 0) {
						local42[local56] = local26;
					} else if (local39 == 1) {
						local42[local56 + 3] = local26;
					} else if (local39 == 2) {
						local42[local56 + 1539] = local26;
					} else if (local39 == 3) {
						local42[local56 + 1536] = local26;
					}
				}
				if (local70 == 2) {
					if (local39 == 3) {
						local42[local56] = local26;
						local42[local56 + 512] = local26;
						local42[local56 + 1024] = local26;
						local42[local56 + 1536] = local26;
					} else if (local39 == 0) {
						local42[local56] = local26;
						local42[local56 + 1] = local26;
						local42[local56 + 2] = local26;
						local42[local56 + 3] = local26;
					} else if (local39 == 1) {
						local42[local56 + 3] = local26;
						local42[local56 + 3 + 512] = local26;
						local42[local56 + 1027] = local26;
						local42[local56 + 1536 + 3] = local26;
					} else if (local39 == 2) {
						local42[local56 + 1536] = local26;
						local42[local56 + 1536 + 1] = local26;
						local42[local56 + 2 + 1536] = local26;
						local42[local56 + 1536 + 3] = local26;
					}
				}
			} else {
				@Pc(390) Class1_Sub1_Sub4_Sub1 local390 = Static122.aClass1_Sub1_Sub4_Sub1Array11[local66.anInt3055];
				if (local390 != null) {
					@Pc(402) int local402 = (local66.anInt3039 * 4 - local390.anInt869) / 2;
					@Pc(413) int local413 = (local66.anInt3029 * 4 - local390.anInt870) / 2;
					local390.method492(local402 + arg3 * 4 + 48, local413 + (-arg0 + 104 + -local66.anInt3029) * 4 + 48);
				}
			}
		}
		local15 = Static32.aClass5_2.method123(arg1, arg3, arg0);
		if (local15 != 0) {
			local24 = Static32.aClass5_2.method122(arg1, arg3, arg0, local15);
			local70 = local24 & 0x1F;
			local39 = local24 >> 6 & 0x3;
			local26 = local15 >> 14 & 0x7FFF;
			@Pc(478) Class1_Sub1_Sub18 local478 = Static104.method1862(local26);
			@Pc(508) int local508;
			if (local478.anInt3055 != -1) {
				@Pc(585) Class1_Sub1_Sub4_Sub1 local585 = Static122.aClass1_Sub1_Sub4_Sub1Array11[local478.anInt3055];
				if (local585 != null) {
					local62 = (local478.anInt3039 * 4 - local585.anInt869) / 2;
					local508 = (local478.anInt3029 * 4 - local585.anInt870) / 2;
					local585.method492(arg3 * 4 + local62 + 48, local508 + (-local478.anInt3029 + -arg0 + 104) * 4 + 48);
				}
			} else if (local70 == 9) {
				@Pc(491) int[] local491 = Static34.aClass1_Sub1_Sub4_Sub4_3.anIntArray327;
				local56 = 15658734;
				local508 = (52736 - arg0 * 512) * 4 + arg3 * 4 + 24624;
				if (local15 > 0) {
					local56 = 15597568;
				}
				if (local39 == 0 || local39 == 2) {
					local491[local508 + 1536] = local56;
					local491[local508 + 1024 + 1] = local56;
					local491[local508 + 2 + 512] = local56;
					local491[local508 + 3] = local56;
				} else {
					local491[local508] = local56;
					local491[local508 + 1 + 512] = local56;
					local491[local508 + 1026] = local56;
					local491[local508 + 1536 + 3] = local56;
				}
			}
		}
		local15 = Static32.aClass5_2.method102(arg1, arg3, arg0);
		if (local15 == 0) {
			return;
		}
		local24 = local15 >> 14 & 0x7FFF;
		@Pc(650) Class1_Sub1_Sub18 local650 = Static104.method1862(local24);
		if (local650.anInt3055 == -1) {
			return;
		}
		@Pc(659) Class1_Sub1_Sub4_Sub1 local659 = Static122.aClass1_Sub1_Sub4_Sub1Array11[local650.anInt3055];
		if (local659 != null) {
			local26 = (local650.anInt3039 * 4 - local659.anInt869) / 2;
			@Pc(683) int local683 = (local650.anInt3029 * 4 - local659.anInt870) / 2;
			local659.method492(local26 + arg3 * 4 + 48, local683 + 48 - -((-local650.anInt3029 + -arg0 + 104) * 4));
			return;
		}
	}
}
