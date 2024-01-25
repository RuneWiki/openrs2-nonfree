import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
	public static int anInt6388;

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "[[[Lclient!gk;")
	public static Class83[][][] aClass83ArrayArrayArray2;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString249 = "cyan:";

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "I")
	public static int anInt6389 = 0;

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "[I")
	public static final int[] anIntArray644 = new int[5];

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
	public static int anInt6391 = 0;

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
	public static int anInt6393 = 1;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIZZ)V")
	public static void method5488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static97.anInt1852 = arg0;
		Static3.anInt38 = arg1;
		Static131.anInt2605 = arg2;
		aClass83ArrayArrayArray2 = new Class83[4][Static97.anInt1852][Static3.anInt38];
		Static278.aClass12Array3 = new Class12[4];
		if (arg3) {
			Static298.aClass83ArrayArrayArray1 = new Class83[1][Static97.anInt1852][Static3.anInt38];
			Static345.anIntArrayArray60 = new int[Static97.anInt1852][Static3.anInt38];
			Static81.aClass12Array1 = new Class12[1];
		} else {
			Static298.aClass83ArrayArrayArray1 = null;
			Static345.anIntArrayArray60 = null;
			Static81.aClass12Array1 = null;
		}
		if (arg4) {
			Static87.anIntArrayArrayArray4 = new int[4][arg0][arg1];
			Static174.aClass1_Sub19_Sub1Array4 = new Class1_Sub19_Sub1[255];
			Static331.aBooleanArray18 = new boolean[255];
			Static168.anInt3459 = 0;
		} else {
			Static87.anIntArrayArrayArray4 = null;
			Static174.aClass1_Sub19_Sub1Array4 = null;
			Static331.aBooleanArray18 = null;
			Static168.anInt3459 = 0;
		}
		Static187.method3326(false);
		Static82.aClass46Array2 = new Class46[500];
		Static274.anInt5613 = 0;
		Static42.aClass46Array1 = new Class46[500];
		Static327.anInt6424 = 0;
		Static200.anIntArrayArrayArray10 = new int[4][Static97.anInt1852 + 1][Static3.anInt38 + 1];
		Static51.aClass10_Sub1Array1 = new Class10_Sub1[5000];
		Static44.anInt1171 = 0;
		Static50.aBooleanArrayArray1 = new boolean[Static131.anInt2605 + Static131.anInt2605 + 1][Static131.anInt2605 + Static131.anInt2605 + 1];
		Static296.aBooleanArrayArray8 = new boolean[Static131.anInt2605 + Static131.anInt2605 + 2][Static131.anInt2605 + Static131.anInt2605 + 2];
		Static71.aClass135_1 = null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([SI)[S")
	public static short[] method5489(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static361.method1849(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([[[Lclient!gk;IIIIZ)Z")
	public static boolean method5490(@OriginalArg(0) Class83[][][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static2.anInt30 & 0xFF);
		if (Static263.aByteArrayArrayArray9[Static127.anInt2487][arg1][arg3] == local14) {
			return false;
		} else if ((Static291.aByteArrayArrayArray11[Static127.anInt2487][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(54) byte local54 = 0;
			Static64.anIntArray100[0] = arg1;
			@Pc(60) int local60 = 0;
			@Pc(63) int local63 = local54 + 1;
			Static89.anIntArray145[0] = arg3;
			Static263.aByteArrayArrayArray9[Static127.anInt2487][arg1][arg3] = local14;
			while (local60 != local63) {
				@Pc(81) int local81 = Static64.anIntArray100[local60] & 0xFFFF;
				@Pc(89) int local89 = Static64.anIntArray100[local60] >> 16 & 0xFF;
				@Pc(97) int local97 = Static64.anIntArray100[local60] >> 24 & 0xFF;
				@Pc(103) int local103 = Static89.anIntArray145[local60] & 0xFFFF;
				@Pc(111) int local111 = Static89.anIntArray145[local60] >> 16 & 0xFF;
				local60 = local60 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static291.aByteArrayArrayArray11[Static127.anInt2487][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(133) boolean local133 = false;
				@Pc(175) int local175;
				@Pc(225) int local225;
				label231: for (@Pc(137) int local137 = Static127.anInt2487 + 1; local137 <= 3; local137++) {
					if ((Static291.aByteArrayArrayArray11[local137][local81][local103] & 0x8) == 0) {
						@Pc(316) Class10_Sub1 local316;
						@Pc(326) int local326;
						@Pc(305) Class83 local305;
						@Pc(311) Class59 local311;
						if (local119 && arg0[local137][local81][local103] != null) {
							if (arg0[local137][local81][local103].aClass10_Sub2_1 != null) {
								local175 = Static285.method4999(local89);
								if (local175 == arg0[local137][local81][local103].aClass10_Sub2_1.anInt2659 || arg0[local137][local81][local103].aClass10_Sub2_2 != null && arg0[local137][local81][local103].aClass10_Sub2_2.anInt2659 == local175) {
									continue;
								}
								if (local97 != 0) {
									local225 = Static285.method4999(local97);
									if (local225 == arg0[local137][local81][local103].aClass10_Sub2_1.anInt2659 || arg0[local137][local81][local103].aClass10_Sub2_2 != null && arg0[local137][local81][local103].aClass10_Sub2_2.anInt2659 == local225) {
										continue;
									}
								}
								if (local111 != 0) {
									local225 = Static285.method4999(local111);
									if (arg0[local137][local81][local103].aClass10_Sub2_1.anInt2659 == local225 || arg0[local137][local81][local103].aClass10_Sub2_2 != null && local225 == arg0[local137][local81][local103].aClass10_Sub2_2.anInt2659) {
										continue;
									}
								}
							}
							local305 = arg0[local137][local81][local103];
							if (local305.aClass59_2 != null) {
								for (local311 = local305.aClass59_2; local311 != null; local311 = local311.aClass59_1) {
									local316 = local311.aClass10_Sub1_1;
									if (local316 instanceof Interface4) {
										@Pc(322) Interface4 local322 = (Interface4) local316;
										local326 = local322.method5452();
										@Pc(330) int local330 = local322.method5449();
										if (local326 == 21) {
											local326 = 19;
										}
										@Pc(341) int local341 = local326 | local330 << 6;
										if (local341 == local89 || local97 != 0 && local341 == local97 || local111 != 0 && local111 == local341) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg0[local137][local81][local103];
						if (local305 != null && local305.aClass59_2 != null) {
							for (local311 = local305.aClass59_2; local311 != null; local311 = local311.aClass59_1) {
								local316 = local311.aClass10_Sub1_1;
								if (local316.aShort93 != local316.aShort94 || local316.aShort92 != local316.aShort91) {
									for (@Pc(402) int local402 = local316.aShort94; local402 <= local316.aShort93; local402++) {
										for (local326 = local316.aShort91; local326 <= local316.aShort92; local326++) {
											Static263.aByteArrayArrayArray9[local137][local402][local326] = local14;
										}
									}
								}
							}
						}
						Static263.aByteArrayArrayArray9[local137][local81][local103] = local14;
						local133 = true;
					}
				}
				if (local133) {
					local175 = Static263.aClass12Array2[Static127.anInt2487 + 1].method2704(local81, local103);
					if (Static25.anIntArray25[arg2] < local175) {
						Static25.anIntArray25[arg2] = local175;
					}
					local225 = local81 << 7;
					if (local225 < Static207.anIntArray398[arg2]) {
						Static207.anIntArray398[arg2] = local225;
					} else if (local225 > Static67.anIntArray105[arg2]) {
						Static67.anIntArray105[arg2] = local225;
					}
					@Pc(500) int local500 = local103 << 7;
					if (local500 < Static142.anIntArray277[arg2]) {
						Static142.anIntArray277[arg2] = local500;
					} else if (local500 > Static111.anIntArray187[arg2]) {
						Static111.anIntArray187[arg2] = local500;
					}
				}
				if (!local119) {
					if (local81 >= 1 && local14 != Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 - 1][local103]) {
						Static64.anIntArray100[local63] = local81 - 1 | 0xD3000000 | 0x120000;
						Static89.anIntArray145[local63] = local103 | 0x130000;
						Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 - 1][local103] = local14;
						local63 = local63 + 1 & 0xFFF;
					}
					local103++;
					if (local103 < Static260.anInt5348) {
						if (local81 - 1 >= 0 && Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 - 1][local103] != local14 && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81][local103] & 0x4) == 0 && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static64.anIntArray100[local63] = local81 - 1 | 0x120000 | 0x52000000;
							Static89.anIntArray145[local63] = local103 | 0x130000;
							Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 - 1][local103] = local14;
							local63 = local63 + 1 & 0xFFF;
						}
						if (local14 != Static263.aByteArrayArrayArray9[Static127.anInt2487][local81][local103]) {
							Static64.anIntArray100[local63] = local81 | 0x13000000 | 0x520000;
							Static89.anIntArray145[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static263.aByteArrayArrayArray9[Static127.anInt2487][local81][local103] = local14;
						}
						if (Static43.anInt1151 > local81 + 1 && local14 != Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 + 1][local103] && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81][local103] & 0x4) == 0 && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static64.anIntArray100[local63] = local81 + 1 | 0x520000 | 0x92000000;
							Static89.anIntArray145[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 + 1][local103] = local14;
						}
					}
					local103--;
					if (local81 + 1 < Static43.anInt1151 && local14 != Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 + 1][local103]) {
						Static64.anIntArray100[local63] = local81 + 1 | 0x920000 | 0x53000000;
						Static89.anIntArray145[local63] = local103 | 0x930000;
						Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 + 1][local103] = local14;
						local63 = local63 + 1 & 0xFFF;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && local14 != Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 - 1][local103] && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81][local103] & 0x4) == 0 && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static64.anIntArray100[local63] = 0x12000000 | 0xD20000 | local81 - 1;
							Static89.anIntArray145[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 - 1][local103] = local14;
						}
						if (local14 != Static263.aByteArrayArrayArray9[Static127.anInt2487][local81][local103]) {
							Static64.anIntArray100[local63] = local81 | 0xD20000 | 0x93000000;
							Static89.anIntArray145[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static263.aByteArrayArrayArray9[Static127.anInt2487][local81][local103] = local14;
						}
						if (Static43.anInt1151 > local81 + 1 && local14 != Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 + 1][local103] && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81][local103] & 0x4) == 0 && (Static291.aByteArrayArrayArray11[Static127.anInt2487][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static64.anIntArray100[local63] = local81 + 1 | 0x920000 | 0xD2000000;
							Static89.anIntArray145[local63] = local103 | 0x930000;
							Static263.aByteArrayArrayArray9[Static127.anInt2487][local81 + 1][local103] = local14;
							local63 = local63 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static25.anIntArray25[arg2] != -1000000) {
				Static25.anIntArray25[arg2] += 10;
				Static207.anIntArray398[arg2] -= 50;
				Static67.anIntArray105[arg2] += 50;
				Static111.anIntArray187[arg2] += 50;
				Static142.anIntArray277[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
	public static void method5491(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(1, arg0);
		local8.method4782();
	}
}
