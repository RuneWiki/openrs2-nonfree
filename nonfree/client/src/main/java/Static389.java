import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIBII[[[Lclient!hg;)Z")
	public static boolean method5717(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class101[][][] arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static347.anInt6264 & 0xFF);
		if (Static112.aByteArrayArrayArray4[Static388.anInt6870][arg1][arg3] == local14) {
			return false;
		} else if ((Static203.aByteArrayArrayArray11[Static388.anInt6870][arg1][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			Static245.anIntArray316[0] = arg1;
			@Pc(60) int local60 = 0;
			@Pc(63) int local63 = local43 + 1;
			Static104.anIntArray133[0] = arg3;
			Static112.aByteArrayArrayArray4[Static388.anInt6870][arg1][arg3] = local14;
			while (local63 != local60) {
				@Pc(81) int local81 = Static245.anIntArray316[local60] & 0xFFFF;
				@Pc(89) int local89 = Static245.anIntArray316[local60] >> 16 & 0xFF;
				@Pc(97) int local97 = Static245.anIntArray316[local60] >> 24 & 0xFF;
				@Pc(103) int local103 = Static104.anIntArray133[local60] & 0xFFFF;
				@Pc(111) int local111 = Static104.anIntArray133[local60] >> 16 & 0xFF;
				local60 = local60 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static203.aByteArrayArrayArray11[Static388.anInt6870][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(136) boolean local136 = false;
				@Pc(178) int local178;
				@Pc(224) int local224;
				label231: for (@Pc(140) int local140 = Static388.anInt6870 + 1; local140 <= 3; local140++) {
					if ((Static203.aByteArrayArrayArray11[local140][local81][local103] & 0x8) == 0) {
						@Pc(323) Class3_Sub2 local323;
						@Pc(333) int local333;
						@Pc(312) Class101 local312;
						@Pc(318) Class145 local318;
						if (local119 && arg4[local140][local81][local103] != null) {
							if (arg4[local140][local81][local103].aClass3_Sub3_2 != null) {
								local178 = Static392.method4249(local89);
								if (arg4[local140][local81][local103].aClass3_Sub3_2.anInt5869 == local178 || arg4[local140][local81][local103].aClass3_Sub3_1 != null && arg4[local140][local81][local103].aClass3_Sub3_1.anInt5869 == local178) {
									continue;
								}
								if (local97 != 0) {
									local224 = Static392.method4249(local97);
									if (local224 == arg4[local140][local81][local103].aClass3_Sub3_2.anInt5869 || arg4[local140][local81][local103].aClass3_Sub3_1 != null && local224 == arg4[local140][local81][local103].aClass3_Sub3_1.anInt5869) {
										continue;
									}
								}
								if (local111 != 0) {
									local224 = Static392.method4249(local111);
									if (local224 == arg4[local140][local81][local103].aClass3_Sub3_2.anInt5869 || arg4[local140][local81][local103].aClass3_Sub3_1 != null && local224 == arg4[local140][local81][local103].aClass3_Sub3_1.anInt5869) {
										continue;
									}
								}
							}
							local312 = arg4[local140][local81][local103];
							if (local312.aClass145_1 != null) {
								for (local318 = local312.aClass145_1; local318 != null; local318 = local318.aClass145_2) {
									local323 = local318.aClass3_Sub2_2;
									if (local323 instanceof Interface10) {
										@Pc(329) Interface10 local329 = (Interface10) local323;
										local333 = local329.method5327();
										if (local333 == 21) {
											local333 = 19;
										}
										@Pc(342) int local342 = local329.method5321();
										@Pc(348) int local348 = local342 << 6 | local333;
										if (local348 == local89 || local97 != 0 && local348 == local97 || local111 != 0 && local348 == local111) {
											continue label231;
										}
									}
								}
							}
						}
						local312 = arg4[local140][local81][local103];
						if (local312 != null && local312.aClass145_1 != null) {
							for (local318 = local312.aClass145_1; local318 != null; local318 = local318.aClass145_2) {
								local323 = local318.aClass3_Sub2_2;
								if (local323.aShort100 != local323.aShort101 || local323.aShort99 != local323.aShort102) {
									for (@Pc(413) int local413 = local323.aShort101; local413 <= local323.aShort100; local413++) {
										for (local333 = local323.aShort102; local333 <= local323.aShort99; local333++) {
											Static112.aByteArrayArrayArray4[local140][local413][local333] = local14;
										}
									}
								}
							}
						}
						Static112.aByteArrayArrayArray4[local140][local81][local103] = local14;
						local136 = true;
					}
				}
				if (local136) {
					local178 = Static55.aClass86Array1[Static388.anInt6870 + 1].method6594(local81, local103);
					if (Static332.anIntArray390[arg2] < local178) {
						Static332.anIntArray390[arg2] = local178;
					}
					local224 = local81 << 7;
					if (local224 < Static263.anIntArray322[arg2]) {
						Static263.anIntArray322[arg2] = local224;
					} else if (Static368.anIntArray396[arg2] < local224) {
						Static368.anIntArray396[arg2] = local224;
					}
					@Pc(519) int local519 = local103 << 7;
					if (local519 < Static222.anIntArray293[arg2]) {
						Static222.anIntArray293[arg2] = local519;
					} else if (local519 > Static280.anIntArray336[arg2]) {
						Static280.anIntArray336[arg2] = local519;
					}
				}
				if (!local119) {
					if (local81 >= 1 && local14 != Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 - 1][local103]) {
						Static245.anIntArray316[local63] = local81 - 1 | 0xD3000000 | 0x120000;
						Static104.anIntArray133[local63] = local103 | 0x130000;
						Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 - 1][local103] = local14;
						local63 = local63 + 1 & 0xFFF;
					}
					local103++;
					if (local103 < Static117.anInt2450) {
						if (local81 - 1 >= 0 && Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 - 1][local103] != local14 && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81][local103] & 0x4) == 0 && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static245.anIntArray316[local63] = 0x52000000 | 0x120000 | local81 - 1;
							Static104.anIntArray133[local63] = local103 | 0x130000;
							local63 = local63 + 1 & 0xFFF;
							Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 - 1][local103] = local14;
						}
						if (local14 != Static112.aByteArrayArrayArray4[Static388.anInt6870][local81][local103]) {
							Static245.anIntArray316[local63] = local81 | 0x520000 | 0x13000000;
							Static104.anIntArray133[local63] = local103 | 0x530000;
							Static112.aByteArrayArrayArray4[Static388.anInt6870][local81][local103] = local14;
							local63 = local63 + 1 & 0xFFF;
						}
						if (Static181.anInt3574 > local81 + 1 && local14 != Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 + 1][local103] && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81][local103] & 0x4) == 0 && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static245.anIntArray316[local63] = local81 + 1 | 0x520000 | 0x92000000;
							Static104.anIntArray133[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 + 1][local103] = local14;
						}
					}
					local103--;
					if (local81 + 1 < Static181.anInt3574 && local14 != Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 + 1][local103]) {
						Static245.anIntArray316[local63] = local81 + 1 | 0x920000 | 0x53000000;
						Static104.anIntArray133[local63] = local103 | 0x930000;
						Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 + 1][local103] = local14;
						local63 = local63 + 1 & 0xFFF;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 - 1][local103] != local14 && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81][local103] & 0x4) == 0 && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static245.anIntArray316[local63] = local81 - 1 | 0xD20000 | 0x12000000;
							Static104.anIntArray133[local63] = local103 | 0xD30000;
							Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 - 1][local103] = local14;
							local63 = local63 + 1 & 0xFFF;
						}
						if (Static112.aByteArrayArrayArray4[Static388.anInt6870][local81][local103] != local14) {
							Static245.anIntArray316[local63] = local81 | 0xD20000 | 0x93000000;
							Static104.anIntArray133[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static112.aByteArrayArrayArray4[Static388.anInt6870][local81][local103] = local14;
						}
						if (local81 + 1 < Static181.anInt3574 && Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 + 1][local103] != local14 && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81][local103] & 0x4) == 0 && (Static203.aByteArrayArrayArray11[Static388.anInt6870][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static245.anIntArray316[local63] = 0xD2000000 | 0x920000 | local81 + 1;
							Static104.anIntArray133[local63] = local103 | 0x930000;
							local63 = local63 + 1 & 0xFFF;
							Static112.aByteArrayArrayArray4[Static388.anInt6870][local81 + 1][local103] = local14;
						}
					}
				}
			}
			if (Static332.anIntArray390[arg2] != -1000000) {
				Static332.anIntArray390[arg2] += 10;
				Static263.anIntArray322[arg2] -= 50;
				Static368.anIntArray396[arg2] += 50;
				Static280.anIntArray336[arg2] += 50;
				Static222.anIntArray293[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method5718() {
		@Pc(7) String local7 = "www";
		if (Static427.aClass193_7 == Static170.aClass193_5) {
			local7 = "www-wtrc";
		} else if (Static107.aClass193_2 == Static170.aClass193_5) {
			local7 = "www-wtqa";
		} else if (Static168.aClass193_4 == Static170.aClass193_5) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static65.aString14 != null) {
			local33 = "/p=" + Static65.aString14;
		}
		return "http://" + local7 + "." + Static4.aClass36_5.aString5 + ".com/l=" + Static161.anInt3239 + "/a=" + Static128.anInt2737 + local33 + "/";
	}
}
