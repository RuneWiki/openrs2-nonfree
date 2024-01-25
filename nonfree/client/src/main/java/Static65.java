import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public static int anInt4692;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
	public static int anInt4686 = 0;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	public static int anInt4695 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([[[Lclient!wr;IIIZI)Z")
	public static boolean method4155(@OriginalArg(0) Class251[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(22) byte local22 = arg3 ? 1 : (byte) (Static196.anInt4050 & 0xFF);
		if (local22 == Static68.aByteArrayArrayArray1[Static382.anInt6523][arg2][arg1]) {
			return false;
		} else if ((Static96.aByteArrayArrayArray8[Static382.anInt6523][arg2][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(54) byte local54 = 0;
			Static56.anIntArray227[0] = arg2;
			@Pc(60) int local60 = 0;
			@Pc(63) int local63 = local54 + 1;
			Static123.anIntArray530[0] = arg1;
			Static68.aByteArrayArrayArray1[Static382.anInt6523][arg2][arg1] = local22;
			while (local63 != local60) {
				@Pc(81) int local81 = Static56.anIntArray227[local60] & 0xFFFF;
				@Pc(89) int local89 = Static56.anIntArray227[local60] >> 16 & 0xFF;
				@Pc(97) int local97 = Static56.anIntArray227[local60] >> 24 & 0xFF;
				@Pc(103) int local103 = Static123.anIntArray530[local60] & 0xFFFF;
				@Pc(111) int local111 = Static123.anIntArray530[local60] >> 16 & 0xFF;
				local60 = local60 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static96.aByteArrayArrayArray8[Static382.anInt6523][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(136) boolean local136 = false;
				@Pc(178) int local178;
				@Pc(221) int local221;
				label231: for (@Pc(140) int local140 = Static382.anInt6523 + 1; local140 <= 3; local140++) {
					if ((Static96.aByteArrayArrayArray8[local140][local81][local103] & 0x8) == 0) {
						@Pc(316) Class1_Sub5 local316;
						@Pc(326) int local326;
						@Pc(305) Class251 local305;
						@Pc(311) Class46 local311;
						if (local119 && arg0[local140][local81][local103] != null) {
							if (arg0[local140][local81][local103].aClass1_Sub1_3 != null) {
								local178 = Static145.method4670(local89);
								if (arg0[local140][local81][local103].aClass1_Sub1_3.anInt6592 == local178 || arg0[local140][local81][local103].aClass1_Sub1_2 != null && arg0[local140][local81][local103].aClass1_Sub1_2.anInt6592 == local178) {
									continue;
								}
								if (local97 != 0) {
									local221 = Static145.method4670(local97);
									if (arg0[local140][local81][local103].aClass1_Sub1_3.anInt6592 == local221 || arg0[local140][local81][local103].aClass1_Sub1_2 != null && arg0[local140][local81][local103].aClass1_Sub1_2.anInt6592 == local221) {
										continue;
									}
								}
								if (local111 != 0) {
									local221 = Static145.method4670(local111);
									if (local221 == arg0[local140][local81][local103].aClass1_Sub1_3.anInt6592 || arg0[local140][local81][local103].aClass1_Sub1_2 != null && arg0[local140][local81][local103].aClass1_Sub1_2.anInt6592 == local221) {
										continue;
									}
								}
							}
							local305 = arg0[local140][local81][local103];
							if (local305.aClass46_3 != null) {
								for (local311 = local305.aClass46_3; local311 != null; local311 = local311.aClass46_1) {
									local316 = local311.aClass1_Sub5_1;
									if (local316 instanceof Interface2) {
										@Pc(322) Interface2 local322 = (Interface2) local316;
										local326 = local322.method5654();
										if (local326 == 21) {
											local326 = 19;
										}
										@Pc(337) int local337 = local322.method5650();
										@Pc(343) int local343 = local337 << 6 | local326;
										if (local89 == local343 || local97 != 0 && local97 == local343 || local111 != 0 && local111 == local343) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg0[local140][local81][local103];
						if (local305 != null && local305.aClass46_3 != null) {
							for (local311 = local305.aClass46_3; local311 != null; local311 = local311.aClass46_1) {
								local316 = local311.aClass1_Sub5_1;
								if (local316.aShort96 != local316.aShort94 || local316.aShort95 != local316.aShort97) {
									for (@Pc(408) int local408 = local316.aShort96; local408 <= local316.aShort94; local408++) {
										for (local326 = local316.aShort97; local326 <= local316.aShort95; local326++) {
											Static68.aByteArrayArrayArray1[local140][local408][local326] = local22;
										}
									}
								}
							}
						}
						Static68.aByteArrayArrayArray1[local140][local81][local103] = local22;
						local136 = true;
					}
				}
				if (local136) {
					local178 = Static350.aClass107Array4[Static382.anInt6523 + 1].method4685(local81, local103);
					if (local178 > Static9.anIntArray76[arg4]) {
						Static9.anIntArray76[arg4] = local178;
					}
					local221 = local81 << 7;
					if (Static356.anIntArray1261[arg4] > local221) {
						Static356.anIntArray1261[arg4] = local221;
					} else if (Static297.anIntArray1008[arg4] < local221) {
						Static297.anIntArray1008[arg4] = local221;
					}
					@Pc(512) int local512 = local103 << 7;
					if (local512 < Static86.anIntArray361[arg4]) {
						Static86.anIntArray361[arg4] = local512;
					} else if (Static167.anIntArray1056[arg4] < local512) {
						Static167.anIntArray1056[arg4] = local512;
					}
				}
				if (!local119) {
					if (local81 >= 1 && local22 != Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 - 1][local103]) {
						Static56.anIntArray227[local63] = local81 - 1 | 0x120000 | 0xD3000000;
						Static123.anIntArray530[local63] = local103 | 0x130000;
						local63 = local63 + 1 & 0xFFF;
						Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 - 1][local103] = local22;
					}
					local103++;
					if (local103 < Static185.anInt3485) {
						if (local81 - 1 >= 0 && local22 != Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 - 1][local103] && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81][local103] & 0x4) == 0 && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static56.anIntArray227[local63] = 0x52000000 | 0x120000 | local81 - 1;
							Static123.anIntArray530[local63] = local103 | 0x130000;
							local63 = local63 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 - 1][local103] = local22;
						}
						if (Static68.aByteArrayArrayArray1[Static382.anInt6523][local81][local103] != local22) {
							Static56.anIntArray227[local63] = local81 | 0x520000 | 0x13000000;
							Static123.anIntArray530[local63] = local103 | 0x530000;
							Static68.aByteArrayArrayArray1[Static382.anInt6523][local81][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (local81 + 1 < Static246.anInt4374 && Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 + 1][local103] != local22 && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81][local103] & 0x4) == 0 && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static56.anIntArray227[local63] = local81 + 1 | 0x520000 | 0x92000000;
							Static123.anIntArray530[local63] = local103 | 0x530000;
							Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 + 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
					}
					local103--;
					if (local81 + 1 < Static246.anInt4374 && local22 != Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 + 1][local103]) {
						Static56.anIntArray227[local63] = local81 + 1 | 0x920000 | 0x53000000;
						Static123.anIntArray530[local63] = local103 | 0x930000;
						Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 + 1][local103] = local22;
						local63 = local63 + 1 & 0xFFF;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 - 1][local103] != local22 && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81][local103] & 0x4) == 0 && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static56.anIntArray227[local63] = 0x12000000 | 0xD20000 | local81 - 1;
							Static123.anIntArray530[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 - 1][local103] = local22;
						}
						if (Static68.aByteArrayArrayArray1[Static382.anInt6523][local81][local103] != local22) {
							Static56.anIntArray227[local63] = local81 | 0xD20000 | 0x93000000;
							Static123.anIntArray530[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static68.aByteArrayArrayArray1[Static382.anInt6523][local81][local103] = local22;
						}
						if (local81 + 1 < Static246.anInt4374 && Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 + 1][local103] != local22 && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81][local103] & 0x4) == 0 && (Static96.aByteArrayArrayArray8[Static382.anInt6523][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static56.anIntArray227[local63] = local81 + 1 | 0xD2000000 | 0x920000;
							Static123.anIntArray530[local63] = local103 | 0x930000;
							Static68.aByteArrayArrayArray1[Static382.anInt6523][local81 + 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static9.anIntArray76[arg4] != -1000000) {
				Static9.anIntArray76[arg4] += 10;
				Static356.anIntArray1261[arg4] -= 50;
				Static297.anIntArray1008[arg4] += 50;
				Static167.anIntArray1056[arg4] += 50;
				Static86.anIntArray361[arg4] -= 50;
			}
			return true;
		}
	}
}
