import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public static int anInt7930 = 0;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public static int anInt7932 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([[[Lclient!cj;IZIBI)Z")
	public static boolean method6583(@OriginalArg(0) Class56[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) byte local22 = arg2 ? 1 : (byte) (Static609.anInt9845 & 0xFF);
		if (Static28.aByteArrayArrayArray7[Static128.anInt3428][arg4][arg3] == local22) {
			return false;
		} else if ((Static118.aByteArrayArrayArray20[Static128.anInt3428][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(54) byte local54 = 0;
			Static474.anIntArray461[0] = arg4;
			@Pc(60) int local60 = 0;
			@Pc(63) int local63 = local54 + 1;
			Static5.anIntArray4[0] = arg3;
			Static28.aByteArrayArrayArray7[Static128.anInt3428][arg4][arg3] = local22;
			while (local63 != local60) {
				@Pc(81) int local81 = Static474.anIntArray461[local60] & 0xFFFF;
				@Pc(89) int local89 = Static474.anIntArray461[local60] >> 16 & 0xFF;
				@Pc(97) int local97 = Static474.anIntArray461[local60] >> 24 & 0xFF;
				@Pc(103) int local103 = Static5.anIntArray4[local60] & 0xFFFF;
				@Pc(111) int local111 = Static5.anIntArray4[local60] >> 16 & 0xFF;
				local60 = local60 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static118.aByteArrayArrayArray20[Static128.anInt3428][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(133) boolean local133 = false;
				@Pc(172) int local172;
				@Pc(214) int local214;
				label231: for (@Pc(137) int local137 = Static128.anInt3428 + 1; local137 <= 3; local137++) {
					if ((Static118.aByteArrayArrayArray20[local137][local81][local103] & 0x8) == 0) {
						@Pc(312) Class15_Sub1_Sub2 local312;
						@Pc(322) int local322;
						@Pc(301) Class56 local301;
						@Pc(307) Class152 local307;
						if (local119 && arg0[local137][local81][local103] != null) {
							if (arg0[local137][local81][local103].aClass15_Sub1_Sub4_2 != null) {
								local172 = Static270.method8008(local89);
								if (local172 == arg0[local137][local81][local103].aClass15_Sub1_Sub4_2.aShort61 || arg0[local137][local81][local103].aClass15_Sub1_Sub4_1 != null && local172 == arg0[local137][local81][local103].aClass15_Sub1_Sub4_1.aShort61) {
									continue;
								}
								if (local97 != 0) {
									local214 = Static270.method8008(local97);
									if (arg0[local137][local81][local103].aClass15_Sub1_Sub4_2.aShort61 == local214 || arg0[local137][local81][local103].aClass15_Sub1_Sub4_1 != null && local214 == arg0[local137][local81][local103].aClass15_Sub1_Sub4_1.aShort61) {
										continue;
									}
								}
								if (local111 != 0) {
									local214 = Static270.method8008(local111);
									if (local214 == arg0[local137][local81][local103].aClass15_Sub1_Sub4_2.aShort61 || arg0[local137][local81][local103].aClass15_Sub1_Sub4_1 != null && local214 == arg0[local137][local81][local103].aClass15_Sub1_Sub4_1.aShort61) {
										continue;
									}
								}
							}
							local301 = arg0[local137][local81][local103];
							if (local301.aClass152_2 != null) {
								for (local307 = local301.aClass152_2; local307 != null; local307 = local307.aClass152_3) {
									local312 = local307.aClass15_Sub1_Sub2_1;
									if (local312 instanceof Interface27) {
										@Pc(318) Interface27 local318 = (Interface27) local312;
										local322 = local318.method8343();
										@Pc(326) int local326 = local318.method8337();
										if (local322 == 21) {
											local322 = 19;
										}
										@Pc(337) int local337 = local326 << 6 | local322;
										if (local89 == local337 || local97 != 0 && local97 == local337 || local111 != 0 && local337 == local111) {
											continue label231;
										}
									}
								}
							}
						}
						local301 = arg0[local137][local81][local103];
						if (local301 != null && local301.aClass152_2 != null) {
							for (local307 = local301.aClass152_2; local307 != null; local307 = local307.aClass152_3) {
								local312 = local307.aClass15_Sub1_Sub2_1;
								if (local312.aShort105 != local312.aShort104 || local312.aShort106 != local312.aShort103) {
									for (@Pc(405) int local405 = local312.aShort105; local405 <= local312.aShort104; local405++) {
										for (local322 = local312.aShort103; local322 <= local312.aShort106; local322++) {
											Static28.aByteArrayArrayArray7[local137][local405][local322] = local22;
										}
									}
								}
							}
						}
						Static28.aByteArrayArrayArray7[local137][local81][local103] = local22;
						local133 = true;
					}
				}
				if (local133) {
					local172 = Static34.aClass86Array5[Static128.anInt3428 + 1].method8086(local103, local81);
					if (Static86.anIntArray106[arg1] < local172) {
						Static86.anIntArray106[arg1] = local172;
					}
					local214 = local81 << 9;
					if (Static303.anIntArray353[arg1] > local214) {
						Static303.anIntArray353[arg1] = local214;
					} else if (local214 > Static37.anIntArray51[arg1]) {
						Static37.anIntArray51[arg1] = local214;
					}
					@Pc(516) int local516 = local103 << 9;
					if (Static389.anIntArray409[arg1] > local516) {
						Static389.anIntArray409[arg1] = local516;
					} else if (local516 > Static82.anIntArray101[arg1]) {
						Static82.anIntArray101[arg1] = local516;
					}
				}
				if (!local119) {
					if (local81 >= 1 && Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 - 1][local103] != local22) {
						Static474.anIntArray461[local63] = local81 - 1 | 0xD3000000 | 0x120000;
						Static5.anIntArray4[local63] = local103 | 0x130000;
						Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 - 1][local103] = local22;
						local63 = local63 + 1 & 0xFFF;
					}
					local103++;
					if (Static218.anInt5023 > local103) {
						if (local81 - 1 >= 0 && Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 - 1][local103] != local22 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81][local103] & 0x4) == 0 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static474.anIntArray461[local63] = local81 - 1 | 0x120000 | 0x52000000;
							Static5.anIntArray4[local63] = local103 | 0x130000;
							Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 - 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (local22 != Static28.aByteArrayArrayArray7[Static128.anInt3428][local81][local103]) {
							Static474.anIntArray461[local63] = local81 | 0x520000 | 0x13000000;
							Static5.anIntArray4[local63] = local103 | 0x530000;
							Static28.aByteArrayArrayArray7[Static128.anInt3428][local81][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (Static372.anInt7082 > local81 + 1 && Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 + 1][local103] != local22 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81][local103] & 0x4) == 0 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static474.anIntArray461[local63] = 0x92000000 | 0x520000 | local81 + 1;
							Static5.anIntArray4[local63] = local103 | 0x530000;
							Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 + 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
					}
					local103--;
					if (Static372.anInt7082 > local81 + 1 && Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 + 1][local103] != local22) {
						Static474.anIntArray461[local63] = 0x53000000 | 0x920000 | local81 + 1;
						Static5.anIntArray4[local63] = local103 | 0x930000;
						local63 = local63 + 1 & 0xFFF;
						Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 + 1][local103] = local22;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && local22 != Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 - 1][local103] && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81][local103] & 0x4) == 0 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static474.anIntArray461[local63] = local81 - 1 | 0xD20000 | 0x12000000;
							Static5.anIntArray4[local63] = local103 | 0xD30000;
							Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 - 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (Static28.aByteArrayArrayArray7[Static128.anInt3428][local81][local103] != local22) {
							Static474.anIntArray461[local63] = local81 | 0xD20000 | 0x93000000;
							Static5.anIntArray4[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static28.aByteArrayArrayArray7[Static128.anInt3428][local81][local103] = local22;
						}
						if (local81 + 1 < Static372.anInt7082 && Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 + 1][local103] != local22 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81][local103] & 0x4) == 0 && (Static118.aByteArrayArrayArray20[Static128.anInt3428][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static474.anIntArray461[local63] = 0xD2000000 | 0x920000 | local81 + 1;
							Static5.anIntArray4[local63] = local103 | 0x930000;
							Static28.aByteArrayArrayArray7[Static128.anInt3428][local81 + 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static86.anIntArray106[arg1] != -1000000) {
				Static86.anIntArray106[arg1] += 40;
				Static303.anIntArray353[arg1] -= 512;
				Static37.anIntArray51[arg1] += 512;
				Static82.anIntArray101[arg1] += 512;
				Static389.anIntArray409[arg1] -= 512;
			}
			return true;
		}
	}
}
