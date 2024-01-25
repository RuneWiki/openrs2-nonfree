import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ju", name = "E", descriptor = "Lclient!on;")
	public static Class262 aClass262_3;

	@OriginalMember(owner = "client!ju", name = "I", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!ju", name = "B", descriptor = "[I")
	public static final int[] anIntArray370 = new int[4];

	@OriginalMember(owner = "client!ju", name = "F", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_17 = new Class306();

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "([SIB)[S")
	public static short[] method4131(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static655.method4111(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method4134(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static229.anInt3963 = 0;
		Static113.anInt1784 = 0;
		Static650.anInt10507++;
		@Pc(21) Class14_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static250.aClass14_Sub1Array2[local5]; local21 != null; local21 = local21.aClass14_Sub1_22) {
				if (!Static598.method8372(local21, arg0, arg1, arg2, arg3)) {
					Static568.method8026(local21);
					if (local21.anInt9320 != -1) {
						Static444.aClass14_Sub1Array4[Static229.anInt3963++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static151.aClass14_Sub1Array1[local5]; local21 != null; local21 = local21.aClass14_Sub1_22) {
				if (!Static598.method8372(local21, arg0, arg1, arg2, arg3)) {
					Static568.method8026(local21);
					if (local21.anInt9320 != -1) {
						Static294.aClass14_Sub1Array3[Static113.anInt1784++] = local21;
					}
				}
			}
			for (@Pc(87) Class14_Sub1 local87 = Static469.aClass14_Sub1Array5[local5]; local87 != null; local87 = local87.aClass14_Sub1_22) {
				if (!Static598.method8372(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method7987()) {
						Static568.method8026(local87);
						if (local87.anInt9320 != -1) {
							Static294.aClass14_Sub1Array3[Static113.anInt1784++] = local87;
						}
					} else {
						Static568.method8026(local87);
						if (local87.anInt9320 != -1) {
							Static444.aClass14_Sub1Array4[Static229.anInt3963++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static594.anInt9723; local137++) {
					if (!Static598.method8372(Static53.aClass14_Sub1_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static568.method8026(Static53.aClass14_Sub1_Sub1Array1[local137]);
						if (Static53.aClass14_Sub1_Sub1Array1[local137].anInt9320 != -1) {
							if (Static53.aClass14_Sub1_Sub1Array1[local137].method7987()) {
								Static294.aClass14_Sub1Array3[Static113.anInt1784++] = Static53.aClass14_Sub1_Sub1Array1[local137];
							} else {
								Static444.aClass14_Sub1Array4[Static229.anInt3963++] = Static53.aClass14_Sub1_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static229.anInt3963 > 0) {
			Static38.method712(Static444.aClass14_Sub1Array4, 0, Static229.anInt3963 - 1);
			for (local198 = 0; local198 < Static229.anInt3963; local198++) {
				Static186.method2987(Static444.aClass14_Sub1Array4[local198], arg6);
			}
		}
		if (Static237.aBoolean328) {
			Static480.aClass126_12.method7026(0, (Class5_Sub27[]) null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static205.anInt3601; local198 < Static36.anInt662; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static601.aBooleanArrayArray17.length;
					if (Static188.anInt10382 + Static601.aBooleanArrayArray17.length > Static129.anInt6336) {
						local230 -= Static188.anInt10382 + Static601.aBooleanArrayArray17.length - Static129.anInt6336;
					}
					local137 = Static601.aBooleanArrayArray17[0].length;
					if (Static143.anInt4618 + Static601.aBooleanArrayArray17[0].length > Static150.anInt2400) {
						local137 -= Static143.anInt4618 + Static601.aBooleanArrayArray17[0].length - Static150.anInt2400;
					}
					local271 = Static192.aBooleanArrayArray15;
					if (Static631.aBoolean829) {
						if (Static425.aBoolean601) {
							local271 = Static563.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static621.anInt10076; local281 < local230; local281++) {
							local288 = local281 + Static188.anInt10382 - Static621.anInt10076;
							for (local290 = Static624.anInt10110; local290 < local137; local290++) {
								if (Static601.aBooleanArrayArray17[local281][local290] && !Static422.method6374(local198, local288, local290 + Static143.anInt4618 - Static624.anInt10110)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static425.aBoolean601) {
						if (arg4 >= 0) {
							Static299.aClass40Array1[local198].method8441(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static299.aClass40Array1[local198].method8446(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static40.anInt704; local281++) {
							Static589.aClass350Array3[local281].method8250(new Class14_Sub6(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static299.aClass40Array1[local198].method8441(Static484.anInt8046, Static263.anInt4379, Static597.anInt9765, Static192.aBooleanArrayArray15, true, arg4, arg5);
					} else {
						Static299.aClass40Array1[local198].method8446(Static484.anInt8046, Static263.anInt4379, Static597.anInt9765, Static192.aBooleanArrayArray15, true, arg5);
					}
				} else {
					local230 = Static601.aBooleanArrayArray17.length;
					if (Static188.anInt10382 + Static601.aBooleanArrayArray17.length > Static129.anInt6336) {
						local230 -= Static188.anInt10382 + Static601.aBooleanArrayArray17.length - Static129.anInt6336;
					}
					local137 = Static601.aBooleanArrayArray17[0].length;
					if (Static143.anInt4618 + Static601.aBooleanArrayArray17[0].length > Static150.anInt2400) {
						local137 -= Static143.anInt4618 + Static601.aBooleanArrayArray17[0].length - Static150.anInt2400;
					}
					local271 = Static192.aBooleanArrayArray15;
					if (Static631.aBoolean829) {
						if (Static425.aBoolean601) {
							local271 = Static563.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static621.anInt10076; local281 < local230; local281++) {
							local288 = local281 + Static188.anInt10382 - Static621.anInt10076;
							for (local290 = Static624.anInt10110; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static601.aBooleanArrayArray17[local281][local290]) {
									@Pc(309) int local309 = local290 + Static143.anInt4618 - Static624.anInt10110;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static535.aClass156ArrayArrayArray2[local311][local288][local309] != null && Static535.aClass156ArrayArrayArray2[local311][local288][local309].aByte78 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static422.method6374(local198, local288, local309)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static425.aBoolean601) {
						if (arg4 >= 0) {
							Static299.aClass40Array1[local198].method8441(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
						} else {
							Static299.aClass40Array1[local198].method8446(0, 0, 0, (boolean[][]) null, false, arg5);
						}
						for (local281 = 0; local281 < Static40.anInt704; local281++) {
							Static589.aClass350Array3[local281].method8250(new Class14_Sub6(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static299.aClass40Array1[local198].method8441(Static484.anInt8046, Static263.anInt4379, Static597.anInt9765, Static192.aBooleanArrayArray15, false, arg4, arg5);
					} else {
						Static299.aClass40Array1[local198].method8446(Static484.anInt8046, Static263.anInt4379, Static597.anInt9765, Static192.aBooleanArrayArray15, false, arg5);
					}
				}
			}
		}
		if (Static113.anInt1784 > 0) {
			Static551.method7787(Static294.aClass14_Sub1Array3, 0, Static113.anInt1784 - 1);
			for (local198 = 0; local198 < Static113.anInt1784; local198++) {
				Static186.method2987(Static294.aClass14_Sub1Array3[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
	public static void method4136() {
		if (Static295.aString77.toLowerCase().indexOf("microsoft") != -1) {
			Static559.anIntArray709[190] = 72;
			Static559.anIntArray709[187] = 27;
			Static559.anIntArray709[223] = 28;
			Static559.anIntArray709[221] = 43;
			Static559.anIntArray709[186] = 57;
			Static559.anIntArray709[191] = 73;
			Static559.anIntArray709[192] = 58;
			Static559.anIntArray709[189] = 26;
			Static559.anIntArray709[220] = 74;
			Static559.anIntArray709[188] = 71;
			Static559.anIntArray709[222] = 59;
			Static559.anIntArray709[219] = 42;
			return;
		}
		Static559.anIntArray709[59] = 57;
		if (Static295.aMethod1 == null) {
			Static559.anIntArray709[222] = 59;
			Static559.anIntArray709[192] = 58;
		} else {
			Static559.anIntArray709[192] = 28;
			Static559.anIntArray709[520] = 59;
			Static559.anIntArray709[222] = 58;
		}
		Static559.anIntArray709[92] = 74;
		Static559.anIntArray709[61] = 27;
		Static559.anIntArray709[45] = 26;
		Static559.anIntArray709[91] = 42;
		Static559.anIntArray709[47] = 73;
		Static559.anIntArray709[93] = 43;
		Static559.anIntArray709[44] = 71;
		Static559.anIntArray709[46] = 72;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)Z")
	public static boolean method4137(@OriginalArg(0) int arg0) {
		return arg0 == 48 || arg0 == 25 || arg0 == 1003 || arg0 == 17 || arg0 == 30;
	}
}
