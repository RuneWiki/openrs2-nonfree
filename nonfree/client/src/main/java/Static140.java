import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	public static int anInt2619;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[[[Lclient!sk;ZII)Z")
	public static boolean method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class262[][][] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static313.anInt6819 & 0xFF);
		if (local14 == Static139.aByteArrayArrayArray8[Static208.anInt3742][arg0][arg4]) {
			return false;
		} else if ((Static267.aByteArrayArrayArray19[Static208.anInt3742][arg0][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(42) byte local42 = 0;
			Static9.anIntArray20[0] = arg0;
			@Pc(48) int local48 = 0;
			@Pc(59) int local59 = local42 + 1;
			Static189.anIntArray376[0] = arg4;
			Static139.aByteArrayArrayArray8[Static208.anInt3742][arg0][arg4] = local14;
			while (local59 != local48) {
				@Pc(77) int local77 = Static9.anIntArray20[local48] & 0xFFFF;
				@Pc(85) int local85 = Static9.anIntArray20[local48] >> 16 & 0xFF;
				@Pc(93) int local93 = Static9.anIntArray20[local48] >> 24 & 0xFF;
				@Pc(99) int local99 = Static189.anIntArray376[local48] & 0xFFFF;
				@Pc(107) int local107 = Static189.anIntArray376[local48] >> 16 & 0xFF;
				local48 = local48 + 1 & 0xFFF;
				@Pc(115) boolean local115 = false;
				if ((Static267.aByteArrayArrayArray19[Static208.anInt3742][local77][local99] & 0x4) == 0) {
					local115 = true;
				}
				@Pc(129) boolean local129 = false;
				@Pc(168) int local168;
				@Pc(210) int local210;
				label231: for (@Pc(133) int local133 = Static208.anInt3742 + 1; local133 <= 3; local133++) {
					if ((Static267.aByteArrayArrayArray19[local133][local77][local99] & 0x8) == 0) {
						@Pc(316) Class1_Sub1 local316;
						@Pc(326) int local326;
						@Pc(305) Class262 local305;
						@Pc(311) Class187 local311;
						if (local115 && arg2[local133][local77][local99] != null) {
							if (arg2[local133][local77][local99].aClass1_Sub2_3 != null) {
								local168 = Static465.method7010(local85);
								if (arg2[local133][local77][local99].aClass1_Sub2_3.anInt6984 == local168 || arg2[local133][local77][local99].aClass1_Sub2_2 != null && arg2[local133][local77][local99].aClass1_Sub2_2.anInt6984 == local168) {
									continue;
								}
								if (local93 != 0) {
									local210 = Static465.method7010(local93);
									if (arg2[local133][local77][local99].aClass1_Sub2_3.anInt6984 == local210 || arg2[local133][local77][local99].aClass1_Sub2_2 != null && local210 == arg2[local133][local77][local99].aClass1_Sub2_2.anInt6984) {
										continue;
									}
								}
								if (local107 != 0) {
									local210 = Static465.method7010(local107);
									if (arg2[local133][local77][local99].aClass1_Sub2_3.anInt6984 == local210 || arg2[local133][local77][local99].aClass1_Sub2_2 != null && local210 == arg2[local133][local77][local99].aClass1_Sub2_2.anInt6984) {
										continue;
									}
								}
							}
							local305 = arg2[local133][local77][local99];
							if (local305.aClass187_3 != null) {
								for (local311 = local305.aClass187_3; local311 != null; local311 = local311.aClass187_1) {
									local316 = local311.aClass1_Sub1_1;
									if (local316 instanceof Interface6) {
										@Pc(322) Interface6 local322 = (Interface6) local316;
										local326 = local322.method7685();
										@Pc(330) int local330 = local322.method7687();
										if (local326 == 21) {
											local326 = 19;
										}
										@Pc(341) int local341 = local326 | local330 << 6;
										if (local341 == local85 || local93 != 0 && local93 == local341 || local107 != 0 && local107 == local341) {
											continue label231;
										}
									}
								}
							}
						}
						local305 = arg2[local133][local77][local99];
						if (local305 != null && local305.aClass187_3 != null) {
							for (local311 = local305.aClass187_3; local311 != null; local311 = local311.aClass187_1) {
								local316 = local311.aClass1_Sub1_1;
								if (local316.aShort125 != local316.aShort127 || local316.aShort128 != local316.aShort126) {
									for (@Pc(413) int local413 = local316.aShort127; local413 <= local316.aShort125; local413++) {
										for (local326 = local316.aShort128; local326 <= local316.aShort126; local326++) {
											Static139.aByteArrayArrayArray8[local133][local413][local326] = local14;
										}
									}
								}
							}
						}
						Static139.aByteArrayArrayArray8[local133][local77][local99] = local14;
						local129 = true;
					}
				}
				if (local129) {
					local168 = Static532.aClass75Array3[Static208.anInt3742 + 1].ba(local77, local99);
					if (Static415.anIntArray592[arg1] < local168) {
						Static415.anIntArray592[arg1] = local168;
					}
					local210 = local77 << 7;
					if (local210 < Static358.anIntArray519[arg1]) {
						Static358.anIntArray519[arg1] = local210;
					} else if (Static261.anIntArray438[arg1] < local210) {
						Static261.anIntArray438[arg1] = local210;
					}
					@Pc(519) int local519 = local99 << 7;
					if (local519 < Static211.anIntArray607[arg1]) {
						Static211.anIntArray607[arg1] = local519;
					} else if (local519 > Static92.anIntArray139[arg1]) {
						Static92.anIntArray139[arg1] = local519;
					}
				}
				if (!local115) {
					if (local77 >= 1 && local14 != Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 - 1][local99]) {
						Static9.anIntArray20[local59] = 0xD3000000 | 0x120000 | local77 - 1;
						Static189.anIntArray376[local59] = local99 | 0x130000;
						Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 - 1][local99] = local14;
						local59 = local59 + 1 & 0xFFF;
					}
					local99++;
					if (local99 < Static511.anInt8889) {
						if (local77 - 1 >= 0 && local14 != Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 - 1][local99] && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77][local99] & 0x4) == 0 && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77 - 1][local99 - 1] & 0x4) == 0) {
							Static9.anIntArray20[local59] = 0x52000000 | 0x120000 | local77 - 1;
							Static189.anIntArray376[local59] = local99 | 0x130000;
							local59 = local59 + 1 & 0xFFF;
							Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 - 1][local99] = local14;
						}
						if (local14 != Static139.aByteArrayArrayArray8[Static208.anInt3742][local77][local99]) {
							Static9.anIntArray20[local59] = local77 | 0x13000000 | 0x520000;
							Static189.anIntArray376[local59] = local99 | 0x530000;
							local59 = local59 + 1 & 0xFFF;
							Static139.aByteArrayArrayArray8[Static208.anInt3742][local77][local99] = local14;
						}
						if (local77 + 1 < Static363.anInt1158 && local14 != Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 + 1][local99] && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77][local99] & 0x4) == 0 && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77 + 1][local99 - 1] & 0x4) == 0) {
							Static9.anIntArray20[local59] = local77 + 1 | 0x520000 | 0x92000000;
							Static189.anIntArray376[local59] = local99 | 0x530000;
							Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 + 1][local99] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
					}
					local99--;
					if (Static363.anInt1158 > local77 + 1 && local14 != Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 + 1][local99]) {
						Static9.anIntArray20[local59] = local77 + 1 | 0x920000 | 0x53000000;
						Static189.anIntArray376[local59] = local99 | 0x930000;
						local59 = local59 + 1 & 0xFFF;
						Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 + 1][local99] = local14;
					}
					local99--;
					if (local99 >= 0) {
						if (local77 - 1 >= 0 && Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 - 1][local99] != local14 && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77][local99] & 0x4) == 0 && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77 - 1][local99 + 1] & 0x4) == 0) {
							Static9.anIntArray20[local59] = local77 - 1 | 0x12000000 | 0xD20000;
							Static189.anIntArray376[local59] = local99 | 0xD30000;
							Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 - 1][local99] = local14;
							local59 = local59 + 1 & 0xFFF;
						}
						if (local14 != Static139.aByteArrayArrayArray8[Static208.anInt3742][local77][local99]) {
							Static9.anIntArray20[local59] = 0x93000000 | 0xD20000 | local77;
							Static189.anIntArray376[local59] = local99 | 0xD30000;
							local59 = local59 + 1 & 0xFFF;
							Static139.aByteArrayArrayArray8[Static208.anInt3742][local77][local99] = local14;
						}
						if (Static363.anInt1158 > local77 + 1 && local14 != Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 + 1][local99] && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77][local99] & 0x4) == 0 && (Static267.aByteArrayArrayArray19[Static208.anInt3742][local77 + 1][local99 + 1] & 0x4) == 0) {
							Static9.anIntArray20[local59] = local77 + 1 | 0xD2000000 | 0x920000;
							Static189.anIntArray376[local59] = local99 | 0x930000;
							local59 = local59 + 1 & 0xFFF;
							Static139.aByteArrayArrayArray8[Static208.anInt3742][local77 + 1][local99] = local14;
						}
					}
				}
			}
			if (Static415.anIntArray592[arg1] != -1000000) {
				Static415.anIntArray592[arg1] += 10;
				Static358.anIntArray519[arg1] -= 50;
				Static261.anIntArray438[arg1] += 50;
				Static92.anIntArray139[arg1] += 50;
				Static211.anIntArray607[arg1] -= 50;
			}
			return true;
		}
	}
}
