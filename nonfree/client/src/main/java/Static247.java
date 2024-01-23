import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
	public static int anInt4897;

	@OriginalMember(owner = "client!ro", name = "i", descriptor = "Lclient!ph;")
	public static Class138 aClass138_67;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
	public static int anInt4899 = 0;

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "[I")
	public static int[] anIntArray445 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ro", name = "g", descriptor = "Lclient!s;")
	public static Class156 aClass156_23 = new Class156(32);

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
	public static int anInt4901 = 0;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
	public static void method3811() {
		Static270.aClass169_140.method4020(5);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZIII[[[Lclient!mc;Z)Z")
	public static boolean method3812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub17[][][] arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static168.anInt5864 & 0xFF);
		if (Static172.aByteArrayArrayArray2[Static295.anInt5586][arg1][arg0] == local14) {
			return false;
		} else if ((Static94.aByteArrayArrayArray9[Static295.anInt5586][arg1][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(44) byte local44 = 0;
			@Pc(46) int local46 = 0;
			Static229.anIntArray419[0] = arg1;
			@Pc(53) int local53 = local44 + 1;
			Static81.anIntArray123[0] = arg0;
			Static172.aByteArrayArrayArray2[Static295.anInt5586][arg1][arg0] = local14;
			while (local46 != local53) {
				@Pc(80) int local80 = Static229.anIntArray419[local46] & 0xFFFF;
				@Pc(88) int local88 = Static229.anIntArray419[local46] >> 16 & 0xFF;
				@Pc(96) int local96 = Static229.anIntArray419[local46] >> 24 & 0xFF;
				@Pc(102) int local102 = Static81.anIntArray123[local46] & 0xFFFF;
				@Pc(110) int local110 = Static81.anIntArray123[local46] >> 16 & 0xFF;
				@Pc(112) boolean local112 = false;
				if ((Static94.aByteArrayArrayArray9[Static295.anInt5586][local80][local102] & 0x4) == 0) {
					local112 = true;
				}
				local46 = local46 + 1 & 0xFFF;
				@Pc(133) boolean local133 = false;
				@Pc(137) int local137;
				@Pc(178) int local178;
				label240: for (local137 = Static295.anInt5586 + 1; local137 <= 3; local137++) {
					if ((Static94.aByteArrayArrayArray9[local137][local80][local102] & 0x8) == 0) {
						@Pc(216) int local216;
						@Pc(344) int local344;
						if (local112 && arg3[local137][local80][local102] != null) {
							if (arg3[local137][local80][local102].aClass61_1 != null) {
								local178 = Static260.method3915(local88);
								if (local178 == arg3[local137][local80][local102].aClass61_1.anInt1541 || local178 == arg3[local137][local80][local102].aClass61_1.anInt1538) {
									continue;
								}
								if (local96 != 0) {
									local216 = Static260.method3915(local96);
									if (arg3[local137][local80][local102].aClass61_1.anInt1541 == local216 || arg3[local137][local80][local102].aClass61_1.anInt1538 == local216) {
										continue;
									}
								}
								if (local110 != 0) {
									local216 = Static260.method3915(local110);
									if (arg3[local137][local80][local102].aClass61_1.anInt1541 == local216 || arg3[local137][local80][local102].aClass61_1.anInt1538 == local216) {
										continue;
									}
								}
							}
							if (arg3[local137][local80][local102].aClass60Array3 != null) {
								for (local178 = 0; local178 < arg3[local137][local80][local102].anInt3452; local178++) {
									local216 = (int) (arg3[local137][local80][local102].aClass60Array3[local178].aLong64 >> 14 & 0x3FL);
									if (local216 == 21) {
										local216 = 19;
									}
									@Pc(338) int local338 = (int) (arg3[local137][local80][local102].aClass60Array3[local178].aLong64 >> 20 & 0x3L);
									local344 = local338 << 6 | local216;
									if (local88 == local344 || local96 != 0 && local96 == local344 || local110 != 0 && local344 == local110) {
										continue label240;
									}
								}
							}
						}
						@Pc(380) Class1_Sub17 local380 = arg3[local137][local80][local102];
						local133 = true;
						if (local380 != null && local380.anInt3452 > 0) {
							for (local216 = 0; local216 < local380.anInt3452; local216++) {
								@Pc(402) Class60 local402 = local380.aClass60Array3[local216];
								if (local402.anInt1523 != local402.anInt1529 || local402.anInt1537 != local402.anInt1522) {
									for (local344 = local402.anInt1529; local344 <= local402.anInt1523; local344++) {
										for (@Pc(430) int local430 = local402.anInt1522; local430 <= local402.anInt1537; local430++) {
											Static172.aByteArrayArrayArray2[local137][local344][local430] = local14;
										}
									}
								}
							}
						}
						Static172.aByteArrayArrayArray2[local137][local80][local102] = local14;
					}
				}
				if (local133) {
					if (Static208.anIntArrayArrayArray11[Static295.anInt5586 + 1][local80][local102] > Static101.anIntArray168[arg2]) {
						Static101.anIntArray168[arg2] = Static208.anIntArrayArrayArray11[Static295.anInt5586 + 1][local80][local102];
					}
					local137 = local80 << 7;
					local178 = local102 << 7;
					if (local137 < Static214.anIntArray338[arg2]) {
						Static214.anIntArray338[arg2] = local137;
					} else if (local137 > Static137.anIntArray223[arg2]) {
						Static137.anIntArray223[arg2] = local137;
					}
					if (local178 < Static242.anIntArray438[arg2]) {
						Static242.anIntArray438[arg2] = local178;
					} else if (local178 > Static142.anIntArray232[arg2]) {
						Static142.anIntArray232[arg2] = local178;
					}
				}
				if (!local112) {
					if (local80 >= 1 && local14 != Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 - 1][local102]) {
						Static229.anIntArray419[local53] = 0xD3000000 | 0x120000 | local80 - 1;
						Static81.anIntArray123[local53] = local102 | 0x130000;
						local53 = local53 + 1 & 0xFFF;
						Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 - 1][local102] = local14;
					}
					local102++;
					if (local102 < 104) {
						if (local80 - 1 >= 0 && Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 - 1][local102] != local14 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80][local102] & 0x4) == 0 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80 - 1][local102 - 1] & 0x4) == 0) {
							Static229.anIntArray419[local53] = local80 - 1 | 0x120000 | 0x52000000;
							Static81.anIntArray123[local53] = local102 | 0x130000;
							Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 - 1][local102] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (Static172.aByteArrayArrayArray2[Static295.anInt5586][local80][local102] != local14) {
							Static229.anIntArray419[local53] = local80 | 0x13000000 | 0x520000;
							Static81.anIntArray123[local53] = local102 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static172.aByteArrayArrayArray2[Static295.anInt5586][local80][local102] = local14;
						}
						if (local80 + 1 < 104 && Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 + 1][local102] != local14 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80][local102] & 0x4) == 0 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80 + 1][local102 - 1] & 0x4) == 0) {
							Static229.anIntArray419[local53] = 0x92000000 | 0x520000 | local80 + 1;
							Static81.anIntArray123[local53] = local102 | 0x530000;
							local53 = local53 + 1 & 0xFFF;
							Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 + 1][local102] = local14;
						}
					}
					local102--;
					if (local80 + 1 < 104 && local14 != Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 + 1][local102]) {
						Static229.anIntArray419[local53] = local80 + 1 | 0x53000000 | 0x920000;
						Static81.anIntArray123[local53] = local102 | 0x930000;
						Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 + 1][local102] = local14;
						local53 = local53 + 1 & 0xFFF;
					}
					local102--;
					if (local102 >= 0) {
						if (local80 - 1 >= 0 && Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 - 1][local102] != local14 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80][local102] & 0x4) == 0 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80 - 1][local102 + 1] & 0x4) == 0) {
							Static229.anIntArray419[local53] = local80 - 1 | 0x12000000 | 0xD20000;
							Static81.anIntArray123[local53] = local102 | 0xD30000;
							Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 - 1][local102] = local14;
							local53 = local53 + 1 & 0xFFF;
						}
						if (local14 != Static172.aByteArrayArrayArray2[Static295.anInt5586][local80][local102]) {
							Static229.anIntArray419[local53] = local80 | 0x93000000 | 0xD20000;
							Static81.anIntArray123[local53] = local102 | 0xD30000;
							local53 = local53 + 1 & 0xFFF;
							Static172.aByteArrayArrayArray2[Static295.anInt5586][local80][local102] = local14;
						}
						if (local80 + 1 < 104 && local14 != Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 + 1][local102] && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80][local102] & 0x4) == 0 && (Static94.aByteArrayArrayArray9[Static295.anInt5586][local80 + 1][local102 + 1] & 0x4) == 0) {
							Static229.anIntArray419[local53] = local80 + 1 | 0x920000 | 0xD2000000;
							Static81.anIntArray123[local53] = local102 | 0x930000;
							local53 = local53 + 1 & 0xFFF;
							Static172.aByteArrayArrayArray2[Static295.anInt5586][local80 + 1][local102] = local14;
						}
					}
				}
			}
			if (Static101.anIntArray168[arg2] != -1000000) {
				Static101.anIntArray168[arg2] += 10;
				Static214.anIntArray338[arg2] -= 50;
				Static137.anIntArray223[arg2] += 50;
				Static142.anIntArray232[arg2] += 50;
				Static242.anIntArray438[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)V")
	public static void method3813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static156.anInt3310; local3++) {
			if (arg3 < Static219.anIntArray345[local3] + Static220.anIntArray527[local3] && Static220.anIntArray527[local3] < arg3 + arg0 && arg2 < Static191.anIntArray319[local3] + Static244.anIntArray440[local3] && arg1 + arg2 > Static244.anIntArray440[local3]) {
				Static307.aBooleanArray65[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method3814() {
		for (@Pc(12) int local12 = 0; local12 < Static258.anInt5018; local12++) {
			@Pc(19) int local19 = Static167.anIntArray282[local12]--;
			if (Static167.anIntArray282[local12] >= -10) {
				@Pc(101) Class184 local101 = Static288.aClass184Array1[local12];
				if (local101 == null) {
					local101 = Static325.method4369(Static273.aClass138_75, Static307.anIntArray526[local12], 0);
					if (local101 == null) {
						continue;
					}
					Static167.anIntArray282[local12] += local101.method4370();
					Static288.aClass184Array1[local12] = local101;
				}
				if (Static167.anIntArray282[local12] < 0) {
					@Pc(149) int local149;
					if (Static255.anIntArray449[local12] == 0) {
						local149 = Static223.anInt4334 * Static203.anIntArray329[local12] >> 8;
					} else {
						@Pc(159) int local159 = Static255.anIntArray449[local12] >> 16 & 0xFF;
						@Pc(169) int local169 = local159 * 128 + 64 - Static229.aClass22_Sub3_Sub2_2.anInt4601;
						@Pc(177) int local177 = Static255.anIntArray449[local12] >> 8 & 0xFF;
						if (local169 < 0) {
							local169 = -local169;
						}
						@Pc(190) int local190 = (Static255.anIntArray449[local12] & 0xFF) * 128;
						@Pc(200) int local200 = local177 * 128 + 64 - Static229.aClass22_Sub3_Sub2_2.anInt4623;
						if (local200 < 0) {
							local200 = -local200;
						}
						@Pc(212) int local212 = local200 + local169 - 128;
						if (local190 < local212) {
							Static167.anIntArray282[local12] = -100;
							continue;
						}
						if (local212 < 0) {
							local212 = 0;
						}
						local149 = (local190 - local212) * Static315.anInt5926 * Static203.anIntArray329[local12] / local190 >> 8;
					}
					if (local149 > 0) {
						@Pc(254) Class1_Sub7_Sub1 local254 = local101.method4368().method713(Static298.aClass163_1);
						@Pc(259) Class1_Sub4_Sub1 local259 = Static317.method252(local254, local149);
						local259.method241(Static265.anIntArray459[local12] - 1);
						Static303.aClass1_Sub4_Sub2_2.method775(local259);
					}
					Static167.anIntArray282[local12] = -100;
				}
			} else {
				Static258.anInt5018--;
				for (@Pc(36) int local36 = local12; local36 < Static258.anInt5018; local36++) {
					Static307.anIntArray526[local36] = Static307.anIntArray526[local36 + 1];
					Static288.aClass184Array1[local36] = Static288.aClass184Array1[local36 + 1];
					Static265.anIntArray459[local36] = Static265.anIntArray459[local36 + 1];
					Static167.anIntArray282[local36] = Static167.anIntArray282[local36 + 1];
					Static255.anIntArray449[local36] = Static255.anIntArray449[local36 + 1];
					Static203.anIntArray329[local36] = Static203.anIntArray329[local36 + 1];
				}
				local12--;
			}
		}
		if (Static113.aBoolean168 && !Static44.method780()) {
			if (Static311.anInt5846 != 0 && Static142.anInt2796 != -1) {
				Static251.method3840(Static142.anInt2796, Static311.anInt5846, Static132.aClass138_42);
			}
			Static113.aBoolean168 = false;
		} else if (Static311.anInt5846 != 0 && Static142.anInt2796 != -1 && !Static44.method780()) {
			Static137.aClass1_Sub14_Sub1_6.method2661(249);
			Static137.aClass1_Sub14_Sub1_6.method2630(Static142.anInt2796);
			Static142.anInt2796 = -1;
		}
	}
}
