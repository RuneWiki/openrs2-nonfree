import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
	public static int anInt4185;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "[Z")
	public static boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	public static int anInt4184 = 0;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1195 = Static181.method2795("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1196 = Static181.method2795("flash2:");

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1197 = aClass83_1196;

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
	public static int anInt4186 = 0;

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1198 = aClass83_1196;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method3191(@OriginalArg(0) Class83 arg0) {
		Static69.aClass83_514 = arg0;
		Static114.method2021();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILclient!eh;)[Lclient!fc;")
	public static Class29[] method3192(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1) {
		return Static161.method222(arg1, arg0) ? Static82.method1478() : null;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	public static void method3193() {
		Static107.method2365(false);
		Static41.anInt1038 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static209.aByteArrayArray20.length; local14++) {
			if (Static72.anIntArray35[local14] != -1 && Static209.aByteArrayArray20[local14] == null) {
				Static209.aByteArrayArray20[local14] = Static32.aClass28_Sub1_3.method852(0, Static72.anIntArray35[local14]);
				if (Static209.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static41.anInt1038++;
				}
			}
			if (Static52.anIntArray104[local14] != -1 && Static152.aByteArrayArray15[local14] == null) {
				Static152.aByteArrayArray15[local14] = Static32.aClass28_Sub1_3.method867(Static152.anIntArrayArray22[local14], Static52.anIntArray104[local14], 0);
				if (Static152.aByteArrayArray15[local14] == null) {
					local12 = false;
					Static41.anInt1038++;
				}
			}
		}
		if (!local12) {
			Static53.anInt1353 = 1;
			return;
		}
		Static82.anInt1838 = 0;
		local12 = true;
		@Pc(113) int local113;
		@Pc(124) int local124;
		for (@Pc(94) int local94 = 0; local94 < Static209.aByteArrayArray20.length; local94++) {
			@Pc(100) byte[] local100 = Static152.aByteArrayArray15[local94];
			if (local100 != null) {
				local113 = (Static108.anIntArray243[local94] >> 8) * 64 - Static2.anInt57;
				local124 = (Static108.anIntArray243[local94] & 0xFF) * 64 - Static123.anInt2755;
				if (Static26.aBoolean39) {
					local113 = 10;
					local124 = 10;
				}
				local12 &= Static158.method2443(local124, local113, local100);
			}
		}
		if (!local12) {
			Static53.anInt1353 = 2;
			return;
		}
		if (Static53.anInt1353 != 0) {
			Static142.method2281(true, Static67.method1268(new Class83[] { Static29.aClass83_217, Static73.aClass83_531 }));
		}
		Static192.method2892();
		Static129.method2178();
		Static192.method2892();
		Static154.method2372();
		Static192.method2892();
		System.gc();
		for (@Pc(188) int local188 = 0; local188 < 4; local188++) {
			Static117.aClass22Array1[local188].method738();
		}
		@Pc(209) int local209;
		for (local113 = 0; local113 < 4; local113++) {
			for (local124 = 0; local124 < 104; local124++) {
				for (local209 = 0; local209 < 104; local209++) {
					Static9.aByteArrayArrayArray7[local113][local124][local209] = 0;
				}
			}
		}
		Static192.method2892();
		Static181.method2793();
		local124 = Static209.aByteArrayArray20.length;
		Static160.method2457();
		Static107.method2365(true);
		@Pc(263) int local263;
		@Pc(273) int local273;
		@Pc(340) int local340;
		@Pc(331) int local331;
		@Pc(383) int local383;
		if (!Static26.aBoolean39) {
			@Pc(277) byte[] local277;
			for (local209 = 0; local209 < local124; local209++) {
				local263 = (Static108.anIntArray243[local209] >> 8) * 64 - Static2.anInt57;
				local273 = (Static108.anIntArray243[local209] & 0xFF) * 64 - Static123.anInt2755;
				local277 = Static209.aByteArrayArray20[local209];
				if (local277 != null) {
					Static192.method2892();
					Static59.method1138(local277, local273, Static117.aClass22Array1, local263, Static101.anInt2323 * 8 - 48, (Static2.anInt63 + -6) * 8);
				}
			}
			for (local263 = 0; local263 < local124; local263++) {
				local273 = (Static108.anIntArray243[local263] >> 8) * 64 - Static2.anInt57;
				@Pc(320) byte[] local320 = Static209.aByteArrayArray20[local263];
				local331 = (Static108.anIntArray243[local263] & 0xFF) * 64 - Static123.anInt2755;
				if (local320 == null && Static101.anInt2323 < 800) {
					Static192.method2892();
					for (local340 = 0; local340 < 4; local340++) {
						Static170.method2646(local340, local273, 64, 64, local331);
					}
				}
			}
			Static107.method2365(true);
			for (local273 = 0; local273 < local124; local273++) {
				local277 = Static152.aByteArrayArray15[local273];
				if (local277 != null) {
					local383 = (Static108.anIntArray243[local273] >> 8) * 64 - Static2.anInt57;
					local340 = (Static108.anIntArray243[local273] & 0xFF) * 64 - Static123.anInt2755;
					Static192.method2892();
					Static206.method3109(local383, Static117.aClass22Array1, local340, local277);
				}
			}
		}
		@Pc(448) int local448;
		@Pc(460) int local460;
		if (Static26.aBoolean39) {
			@Pc(454) int local454;
			@Pc(471) int local471;
			@Pc(473) int local473;
			for (local209 = 0; local209 < 4; local209++) {
				Static192.method2892();
				for (local263 = 0; local263 < 13; local263++) {
					for (local273 = 0; local273 < 13; local273++) {
						@Pc(424) boolean local424 = false;
						local383 = Static155.anIntArrayArrayArray9[local209][local263][local273];
						if (local383 != -1) {
							local340 = local383 >> 24 & 0x3;
							local448 = local383 >> 1 & 0x3;
							local454 = local383 >> 3 & 0x7FF;
							local460 = local383 >> 14 & 0x3FF;
							local471 = (local460 / 8 << 8) + (local454 / 8);
							for (local473 = 0; local473 < Static108.anIntArray243.length; local473++) {
								if (local471 == Static108.anIntArray243[local473] && Static209.aByteArrayArray20[local473] != null) {
									local424 = true;
									Static57.method1115(Static209.aByteArrayArray20[local473], Static117.aClass22Array1, local209, (local454 & 0x7) * 8, local340, local448, local273 * 8, (local460 & 0x7) * 8, local263 * 8);
									break;
								}
							}
						}
						if (!local424) {
							Static170.method2646(local209, local263 * 8, 8, 8, local273 * 8);
						}
					}
				}
			}
			Static107.method2365(true);
			for (local263 = 0; local263 < 4; local263++) {
				Static192.method2892();
				for (local273 = 0; local273 < 13; local273++) {
					for (local331 = 0; local331 < 13; local331++) {
						local383 = Static155.anIntArrayArrayArray9[local263][local273][local331];
						if (local383 != -1) {
							local340 = local383 >> 24 & 0x3;
							local448 = local383 >> 1 & 0x3;
							local454 = local383 >> 3 & 0x7FF;
							local460 = local383 >> 14 & 0x3FF;
							local471 = local454 / 8 + (local460 / 8 << 8);
							for (local473 = 0; local473 < Static108.anIntArray243.length; local473++) {
								if (local471 == Static108.anIntArray243[local473] && Static152.aByteArrayArray15[local473] != null) {
									Static53.method1036(local340, Static117.aClass22Array1, (local460 & 0x7) * 8, local263, local273 * 8, Static152.aByteArrayArray15[local473], local448, (local454 & 0x7) * 8, local331 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static107.method2365(true);
		Static129.method2178();
		Static192.method2892();
		Static77.method1429(Static117.aClass22Array1);
		Static107.method2365(true);
		local209 = Static40.anInt1032;
		if (local209 > Static43.anInt1126) {
			local209 = Static43.anInt1126;
		}
		if (local209 < Static43.anInt1126 - 1) {
		}
		if (Static158.aBoolean148) {
			Static190.method2866(Static40.anInt1032);
		} else {
			Static190.method2866(0);
		}
		for (local263 = 0; local263 < 104; local263++) {
			for (local273 = 0; local273 < 104; local273++) {
				Static51.method1187(local273, local263);
			}
		}
		Static192.method2892();
		Static66.method1263();
		Static129.method2178();
		if (Static67.aFrame1 != null) {
			Static69.aClass2_Sub3_Sub1_2.method284(235);
			Static69.aClass2_Sub3_Sub1_2.method246(1057001181);
		}
		if (!Static26.aBoolean39) {
			local273 = (Static2.anInt63 - 6) / 8;
			local331 = (Static2.anInt63 + 6) / 8;
			local383 = (Static101.anInt2323 - 6) / 8;
			local340 = (Static101.anInt2323 + 6) / 8;
			for (local448 = local273 - 1; local448 <= local331 + 1; local448++) {
				for (local460 = local383 - 1; local460 <= local340 + 1; local460++) {
					if (local448 < local273 || local331 < local448 || local383 > local460 || local340 < local460) {
						Static32.aClass28_Sub1_3.method864(Static67.method1268(new Class83[] { Static199.aClass83_1139, Static129.method2179(local448), Static74.aClass83_536, Static129.method2179(local460) }));
						Static32.aClass28_Sub1_3.method864(Static67.method1268(new Class83[] { Static60.aClass83_644, Static129.method2179(local448), Static74.aClass83_536, Static129.method2179(local460) }));
					}
				}
			}
		}
		Static197.method2972(30);
		Static192.method2892();
		Static207.method3118();
		Static69.aClass2_Sub3_Sub1_2.method284(158);
		Static114.method2017();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Z")
	public static boolean method3194(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[Lclient!ae;IB)V")
	public static void method3195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) Class5 local13 = arg2[local7];
			if (local13 != null && arg1 == local13.anInt132) {
				if (local13.aByte3 == 0) {
					local13.anInt157 = local13.anInt111;
				} else if (local13.aByte3 == 1) {
					local13.anInt157 = arg3 - local13.anInt111;
				} else if (local13.aByte3 == 2) {
					local13.anInt157 = local13.anInt111 * arg3 >> 14;
				} else if (local13.aByte3 == 3) {
					if (local13.anInt130 == 2) {
						local13.anInt157 = local13.anInt104 * (local13.anInt111 - 1) + local13.anInt111 * 32;
					} else if (local13.anInt130 == 7) {
						local13.anInt157 = (local13.anInt111 - 1) * local13.anInt104 + local13.anInt111 * 115;
					}
				}
				if (local13.anInt99 > local13.anInt147 - local13.anInt157) {
					local13.anInt99 = local13.anInt147 - local13.anInt157;
				}
				if (local13.aByte1 == 0) {
					local13.anInt154 = local13.anInt101;
				} else if (local13.aByte1 == 1) {
					local13.anInt154 = (arg3 - local13.anInt157) / 2 + local13.anInt101;
				} else if (local13.aByte1 == 2) {
					local13.anInt154 = arg3 - local13.anInt157 - local13.anInt101;
				} else if (local13.aByte1 == 3) {
					local13.anInt154 = local13.anInt101 * arg3 >> 14;
				} else if (local13.aByte1 == 4) {
					local13.anInt154 = (local13.anInt101 * arg3 >> 14) + (arg3 - local13.anInt157) / 2;
				} else {
					local13.anInt154 = arg3 - local13.anInt157 - (local13.anInt101 * arg3 >> 14);
				}
				if (local13.aByte2 == 0) {
					local13.anInt100 = local13.anInt108;
				} else if (local13.aByte2 == 1) {
					local13.anInt100 = arg0 - local13.anInt108;
				} else if (local13.aByte2 == 2) {
					local13.anInt100 = arg0 * local13.anInt108 >> 14;
				} else if (local13.aByte2 == 3) {
					if (local13.anInt130 == 2) {
						local13.anInt100 = local13.anInt108 * 32 + local13.anInt118 * (local13.anInt108 - 1);
					} else if (local13.anInt130 == 7) {
						local13.anInt100 = local13.anInt118 * (local13.anInt108 - 1) + local13.anInt108 * 12;
					}
				}
				if (local13.anInt99 < 0) {
					local13.anInt99 = 0;
				}
				if (local13.aByte4 == 0) {
					local13.anInt105 = local13.anInt121;
				} else if (local13.aByte4 == 1) {
					local13.anInt105 = local13.anInt121 + (arg0 - local13.anInt100) / 2;
				} else if (local13.aByte4 == 2) {
					local13.anInt105 = arg0 - local13.anInt100 - local13.anInt121;
				} else if (local13.aByte4 == 3) {
					local13.anInt105 = local13.anInt121 * arg0 >> 14;
				} else if (local13.aByte4 == 4) {
					local13.anInt105 = (arg0 - local13.anInt100) / 2 + (local13.anInt121 * arg0 >> 14);
				} else {
					local13.anInt105 = arg0 - local13.anInt100 - (local13.anInt121 * arg0 >> 14);
				}
				if (local13.anInt125 > local13.anInt114 - local13.anInt100) {
					local13.anInt125 = local13.anInt114 - local13.anInt100;
				}
				if (local13.anInt125 < 0) {
					local13.anInt125 = 0;
				}
				if (local13.anInt130 == 0) {
					Static48.method960(local13);
				}
			}
		}
	}
}
