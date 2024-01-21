import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!gb", name = "R", descriptor = "Lclient!n;")
	public static Class4_Sub15 aClass4_Sub15_1;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "Lclient!qc;")
	private static Class60 aClass60_431 = Static121.method2047("Connection timed out)3");

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "Lclient!qc;")
	public static Class60 aClass60_430 = aClass60_431;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[100];

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!gb", name = "cb", descriptor = "Lclient!qc;")
	private static Class60 aClass60_437 = Static121.method2047("Select");

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_432 = aClass60_437;

	@OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
	public static final int anInt1035 = 5063219;

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "Lclient!qc;")
	private static Class60 aClass60_433 = Static121.method2047("Please try again)3");

	@OriginalMember(owner = "client!gb", name = "X", descriptor = "Lclient!qc;")
	private static Class60 aClass60_434 = Static121.method2047("Please contact customer support)3");

	@OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
	public static int anInt1039 = 0;

	@OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_435 = aClass60_433;

	@OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lclient!qc;")
	public static Class60 aClass60_436 = aClass60_434;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)V")
	public static void method694() {
		aClass60_434 = null;
		aClass4_Sub15_1 = null;
		aClass60_437 = null;
		aBooleanArray6 = null;
		aClass60_433 = null;
		aClass60_435 = null;
		aClass60_432 = null;
		aClass60_430 = null;
		aClass60_431 = null;
		aClass60_436 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V")
	public static void method695(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = Static131.aClass4_Sub4_Sub3_Sub2_5.anIntArray121;
		@Pc(11) int local11 = local8.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			local8[local13] = 0;
		}
		@Pc(42) int local42;
		@Pc(44) int local44;
		for (@Pc(29) int local29 = 1; local29 < 103; local29++) {
			local42 = (52736 - local29 * 512) * 4 + 24628;
			for (local44 = 1; local44 < 103; local44++) {
				if ((Static95.aByteArrayArrayArray5[arg0][local44][local29] & 0x18) == 0) {
					Static7.aClass28_3.method770(local8, local42, arg0, local44, local29);
				}
				if (arg0 < 3 && (Static95.aByteArrayArrayArray5[arg0 + 1][local44][local29] & 0x8) != 0) {
					Static7.aClass28_3.method770(local8, local42, arg0 + 1, local44, local29);
				}
				local42 += 4;
			}
		}
		Static131.aClass4_Sub4_Sub3_Sub2_5.method899();
		local44 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		local42 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D))) + 228;
		@Pc(163) int local163;
		for (@Pc(159) int local159 = 1; local159 < 103; local159++) {
			for (local163 = 1; local163 < 103; local163++) {
				if ((Static95.aByteArrayArrayArray5[arg0][local163][local159] & 0x18) == 0) {
					Static47.method852(local163, local159, arg0, local42, local44);
				}
				if (arg0 < 3 && (Static95.aByteArrayArrayArray5[arg0 + 1][local163][local159] & 0x8) != 0) {
					Static47.method852(local163, local159, arg0 + 1, local42, local44);
				}
			}
		}
		Static47.anInt1234 = 0;
		for (local163 = 0; local163 < 104; local163++) {
			for (@Pc(231) int local231 = 0; local231 < 104; local231++) {
				@Pc(239) int local239 = Static7.aClass28_3.method759(Static129.anInt3003, local163, local231);
				if (local239 != 0) {
					local239 = local239 >> 14 & 0x7FFF;
					@Pc(252) int local252 = Static24.method477(local239).anInt1101;
					if (local252 >= 0) {
						@Pc(256) int local256 = local163;
						@Pc(258) int local258 = local231;
						if (local252 != 22 && local252 != 29 && local252 != 34 && local252 != 36 && local252 != 46 && local252 != 47 && local252 != 48) {
							@Pc(288) int[][] local288 = Static119.aClass45Array1[Static129.anInt3003].anIntArrayArray15;
							for (@Pc(290) int local290 = 0; local290 < 10; local290++) {
								@Pc(297) int local297 = (int) (Math.random() * 4.0D);
								if (local297 == 0 && local256 > 0 && local163 - 3 < local256 && (local288[local256 - 1][local258] & 0x12C0108) == 0) {
									local256--;
								}
								if (local297 == 1 && local256 < 103 && local256 < local163 + 3 && (local288[local256 + 1][local258] & 0x12C0180) == 0) {
									local256++;
								}
								if (local297 == 2 && local258 > 0 && local231 - 3 < local258 && (local288[local256][local258 - 1] & 0x12C0102) == 0) {
									local258--;
								}
								if (local297 == 3 && local258 < 103 && local231 + 3 > local258 && (local288[local256][local258 + 1] & 0x12C0120) == 0) {
									local258++;
								}
							}
						}
						Static89.aClass4_Sub4_Sub3_Sub2Array8[Static47.anInt1234] = Static130.aClass4_Sub4_Sub3_Sub2Array9[local252];
						Static122.anIntArray321[Static47.anInt1234] = local256;
						Static2.anIntArray144[Static47.anInt1234] = local258;
						Static47.anInt1234++;
					}
				}
			}
		}
		Static20.aClass2_1.method993();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!qc;IIILclient!qc;)V")
	public static void method698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class60 arg5) {
		if (Static93.aBoolean105 || Static25.anInt693 >= 500) {
			return;
		}
		Static112.aClass60Array24[Static25.anInt693] = arg5;
		Static9.aClass60Array2[Static25.anInt693] = arg2;
		Static36.anIntArray71[Static25.anInt693] = arg3;
		Static76.anIntArray194[Static25.anInt693] = arg4;
		Static47.anIntArray116[Static25.anInt693] = arg0;
		Static20.anIntArray32[Static25.anInt693] = arg1;
		Static25.anInt693++;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!q;I)I")
	public static int method699(@OriginalArg(1) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray20 == null || arg1 >= arg0.anIntArrayArray20.length) {
			return -2;
		}
		try {
			@Pc(21) int local21 = 0;
			@Pc(26) int[] local26 = arg0.anIntArrayArray20[arg1];
			@Pc(33) int local33 = 0;
			@Pc(35) byte local35 = 0;
			while (true) {
				@Pc(40) int local40 = local26[local33++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local21;
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 1) {
					local42 = Static7.anIntArray334[local26[local33++]];
				}
				if (local40 == 2) {
					local42 = Static88.anIntArray208[local26[local33++]];
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 3) {
					local42 = Static28.anIntArray48[local26[local33++]];
				}
				@Pc(107) int local107;
				@Pc(118) Class4_Sub17 local118;
				@Pc(123) int local123;
				@Pc(136) int local136;
				if (local40 == 4) {
					local107 = local26[local33++] << 16;
					@Pc(114) int local114 = local107 + local26[local33++];
					local118 = Static16.method283(local114);
					local123 = local26[local33++];
					if (local123 != -1 && (!Static24.method475(local123).aBoolean87 || Static76.aBoolean76)) {
						for (local136 = 0; local136 < local118.anIntArray224.length; local136++) {
							if (local118.anIntArray224[local136] == local123 + 1) {
								local42 += local118.anIntArray225[local136];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static62.anIntArray168[local26[local33++]];
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 6) {
					local42 = Class4_Sub10.anIntArray66[Static88.anIntArray208[local26[local33++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static62.anIntArray168[local26[local33++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2658;
				}
				if (local40 == 9) {
					for (local107 = 0; local107 < 25; local107++) {
						if (Static37.aBooleanArray5[local107]) {
							local42 += Static88.anIntArray208[local107];
						}
					}
				}
				if (local40 == 10) {
					local107 = local26[local33++] << 16;
					local107 += local26[local33++];
					local118 = Static16.method283(local107);
					local123 = local26[local33++];
					if (local123 != -1 && (!Static24.method475(local123).aBoolean87 || Static76.aBoolean76)) {
						for (local136 = 0; local136 < local118.anIntArray224.length; local136++) {
							if (local118.anIntArray224[local136] == local123 + 1) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static52.anInt1346;
				}
				if (local40 == 12) {
					local42 = Static62.anInt1693;
				}
				if (local40 == 13) {
					local107 = Static62.anIntArray168[local26[local33++]];
					@Pc(335) int local335 = local26[local33++];
					local42 = (local107 & 0x1 << local335) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local107 = local26[local33++];
					local42 = Static121.method2046(local107);
				}
				if (local40 == 18) {
					local42 = Static106.anInt2518 + (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 >> 7);
				}
				if (local40 == 19) {
					local42 = (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 >> 7) + Static99.anInt2424;
				}
				if (local40 == 20) {
					local42 = local26[local33++];
				}
				if (local44 == 0) {
					if (local35 == 0) {
						local21 += local42;
					}
					if (local35 == 1) {
						local21 -= local42;
					}
					if (local35 == 2 && local42 != 0) {
						local21 /= local42;
					}
					if (local35 == 3) {
						local21 *= local42;
					}
					local35 = 0;
				} else {
					local35 = local44;
				}
			}
		} catch (@Pc(438) Exception local438) {
			return -1;
		}
	}
}
