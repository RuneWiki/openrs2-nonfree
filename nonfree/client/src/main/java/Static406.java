import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
	public static int anInt6995;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZI[[[Lclient!rr;I)Z")
	public static boolean method5941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class313[][][] arg3, @OriginalArg(5) int arg4) {
		@Pc(12) byte local12 = arg2 ? 1 : (byte) (Static219.anInt3472 & 0xFF);
		if (Static664.aByteArrayArrayArray18[Static458.anInt7955][arg4][arg1] == local12) {
			return false;
		} else if ((Static317.aByteArrayArrayArray13[Static458.anInt7955][arg4][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(41) byte local41 = 0;
			Static227.anIntArray204[0] = arg4;
			@Pc(47) int local47 = 0;
			@Pc(50) int local50 = local41 + 1;
			Static72.anIntArray499[0] = arg1;
			Static664.aByteArrayArrayArray18[Static458.anInt7955][arg4][arg1] = local12;
			while (local50 != local47) {
				@Pc(67) int local67 = Static227.anIntArray204[local47] & 0xFFFF;
				@Pc(75) int local75 = Static227.anIntArray204[local47] >> 16 & 0xFF;
				@Pc(83) int local83 = Static227.anIntArray204[local47] >> 24 & 0xFF;
				@Pc(89) int local89 = Static72.anIntArray499[local47] & 0xFFFF;
				@Pc(97) int local97 = Static72.anIntArray499[local47] >> 16 & 0xFF;
				local47 = local47 + 1 & 0xFFF;
				@Pc(105) boolean local105 = false;
				if ((Static317.aByteArrayArrayArray13[Static458.anInt7955][local67][local89] & 0x4) == 0) {
					local105 = true;
				}
				@Pc(119) boolean local119 = false;
				@Pc(125) int local125;
				@Pc(163) int local163;
				@Pc(210) int local210;
				if (arg3 != null) {
					label237: for (local125 = Static458.anInt7955 + 1; local125 <= 3; local125++) {
						if (arg3[local125] != null && (Static317.aByteArrayArrayArray13[local125][local67][local89] & 0x8) == 0) {
							@Pc(306) Class41_Sub1_Sub1 local306;
							@Pc(316) int local316;
							@Pc(296) Class313 local296;
							@Pc(302) Class40 local302;
							if (local105 && arg3[local125][local67][local89] != null) {
								if (arg3[local125][local67][local89].aClass41_Sub1_Sub3_2 != null) {
									local163 = Static604.method3498(local75);
									if (arg3[local125][local67][local89].aClass41_Sub1_Sub3_2.aShort116 == local163 || arg3[local125][local67][local89].aClass41_Sub1_Sub3_1 != null && local163 == arg3[local125][local67][local89].aClass41_Sub1_Sub3_1.aShort116) {
										continue;
									}
									if (local83 != 0) {
										local210 = Static604.method3498(local83);
										if (arg3[local125][local67][local89].aClass41_Sub1_Sub3_2.aShort116 == local210 || arg3[local125][local67][local89].aClass41_Sub1_Sub3_1 != null && local210 == arg3[local125][local67][local89].aClass41_Sub1_Sub3_1.aShort116) {
											continue;
										}
									}
									if (local97 != 0) {
										local210 = Static604.method3498(local97);
										if (arg3[local125][local67][local89].aClass41_Sub1_Sub3_2.aShort116 == local210 || arg3[local125][local67][local89].aClass41_Sub1_Sub3_1 != null && local210 == arg3[local125][local67][local89].aClass41_Sub1_Sub3_1.aShort116) {
											continue;
										}
									}
								}
								local296 = arg3[local125][local67][local89];
								if (local296.aClass40_3 != null) {
									for (local302 = local296.aClass40_3; local302 != null; local302 = local302.aClass40_1) {
										local306 = local302.aClass41_Sub1_Sub1_1;
										if (local306 instanceof Interface10) {
											@Pc(312) Interface10 local312 = (Interface10) local306;
											local316 = local312.method8670();
											if (local316 == 21) {
												local316 = 19;
											}
											@Pc(327) int local327 = local312.method8671();
											@Pc(333) int local333 = local316 | local327 << 6;
											if (local333 == local75 || local83 != 0 && local333 == local83 || local97 != 0 && local97 == local333) {
												continue label237;
											}
										}
									}
								}
							}
							local296 = arg3[local125][local67][local89];
							if (local296 != null && local296.aClass40_3 != null) {
								for (local302 = local296.aClass40_3; local302 != null; local302 = local302.aClass40_1) {
									local306 = local302.aClass41_Sub1_Sub1_1;
									if (local306.aShort107 != local306.aShort109 || local306.aShort110 != local306.aShort108) {
										for (@Pc(396) int local396 = local306.aShort109; local396 <= local306.aShort107; local396++) {
											for (local316 = local306.aShort108; local316 <= local306.aShort110; local316++) {
												Static664.aByteArrayArrayArray18[local125][local396][local316] = local12;
											}
										}
									}
								}
							}
							local119 = true;
							Static664.aByteArrayArrayArray18[local125][local67][local89] = local12;
						}
					}
				}
				if (local119) {
					local125 = Static298.aClass88Array3[Static458.anInt7955 + 1].method8749(local67, local89);
					if (Static48.anIntArray53[arg0] < local125) {
						Static48.anIntArray53[arg0] = local125;
					}
					local163 = local67 << 9;
					local210 = local89 << 9;
					if (Static553.anIntArray494[arg0] > local163) {
						Static553.anIntArray494[arg0] = local163;
					} else if (Static571.anIntArray514[arg0] < local163) {
						Static571.anIntArray514[arg0] = local163;
					}
					if (Static655.anIntArray597[arg0] > local210) {
						Static655.anIntArray597[arg0] = local210;
					} else if (Static196.anIntArray177[arg0] < local210) {
						Static196.anIntArray177[arg0] = local210;
					}
				}
				if (!local105) {
					if (local67 >= 1 && Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 - 1][local89] != local12) {
						Static227.anIntArray204[local50] = local67 - 1 | 0xD3000000 | 0x120000;
						Static72.anIntArray499[local50] = local89 | 0x130000;
						local50 = local50 + 1 & 0xFFF;
						Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 - 1][local89] = local12;
					}
					@Pc(566) int local566 = ~Static64.anInt1015;
					local89++;
					if (local566 < ~local89) {
						if (local67 - 1 >= 0 && Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 - 1][local89] != local12 && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67][local89] & 0x4) == 0 && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67 - 1][local89 - 1] & 0x4) == 0) {
							Static227.anIntArray204[local50] = local67 - 1 | 0x120000 | 0x52000000;
							Static72.anIntArray499[local50] = local89 | 0x130000;
							local50 = local50 + 1 & 0xFFF;
							Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 - 1][local89] = local12;
						}
						if (Static664.aByteArrayArrayArray18[Static458.anInt7955][local67][local89] != local12) {
							Static227.anIntArray204[local50] = local67 | 0x520000 | 0x13000000;
							Static72.anIntArray499[local50] = local89 | 0x530000;
							Static664.aByteArrayArrayArray18[Static458.anInt7955][local67][local89] = local12;
							local50 = local50 + 1 & 0xFFF;
						}
						if (Static124.anInt2150 > local67 + 1 && local12 != Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 + 1][local89] && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67][local89] & 0x4) == 0 && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67 + 1][local89 - 1] & 0x4) == 0) {
							Static227.anIntArray204[local50] = local67 + 1 | 0x92000000 | 0x520000;
							Static72.anIntArray499[local50] = local89 | 0x530000;
							Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 + 1][local89] = local12;
							local50 = local50 + 1 & 0xFFF;
						}
					}
					local89--;
					if (Static124.anInt2150 > local67 + 1 && local12 != Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 + 1][local89]) {
						Static227.anIntArray204[local50] = local67 + 1 | 0x920000 | 0x53000000;
						Static72.anIntArray499[local50] = local89 | 0x930000;
						local50 = local50 + 1 & 0xFFF;
						Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 + 1][local89] = local12;
					}
					local89--;
					if (local89 >= 0) {
						if (local67 - 1 >= 0 && local12 != Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 - 1][local89] && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67][local89] & 0x4) == 0 && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67 - 1][local89 + 1] & 0x4) == 0) {
							Static227.anIntArray204[local50] = local67 - 1 | 0x12000000 | 0xD20000;
							Static72.anIntArray499[local50] = local89 | 0xD30000;
							local50 = local50 + 1 & 0xFFF;
							Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 - 1][local89] = local12;
						}
						if (Static664.aByteArrayArrayArray18[Static458.anInt7955][local67][local89] != local12) {
							Static227.anIntArray204[local50] = 0x93000000 | 0xD20000 | local67;
							Static72.anIntArray499[local50] = local89 | 0xD30000;
							Static664.aByteArrayArrayArray18[Static458.anInt7955][local67][local89] = local12;
							local50 = local50 + 1 & 0xFFF;
						}
						if (local67 + 1 < Static124.anInt2150 && Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 + 1][local89] != local12 && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67][local89] & 0x4) == 0 && (Static317.aByteArrayArrayArray13[Static458.anInt7955][local67 + 1][local89 + 1] & 0x4) == 0) {
							Static227.anIntArray204[local50] = local67 + 1 | 0xD2000000 | 0x920000;
							Static72.anIntArray499[local50] = local89 | 0x930000;
							Static664.aByteArrayArrayArray18[Static458.anInt7955][local67 + 1][local89] = local12;
							local50 = local50 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static48.anIntArray53[arg0] != -1000000) {
				Static48.anIntArray53[arg0] += 40;
				Static553.anIntArray494[arg0] -= 512;
				Static571.anIntArray514[arg0] += 512;
				Static196.anIntArray177[arg0] += 512;
				Static655.anIntArray597[arg0] -= 512;
			}
			return true;
		}
	}
}
