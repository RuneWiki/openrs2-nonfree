import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_86 = new Class21("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "Lclient!rj;")
	public static final Class219 aClass219_2 = new Class219("LIVE", 0);

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_168 = new Class214(81, 8);

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[[[Lclient!mm;BZII)Z")
	public static boolean method4527(@OriginalArg(0) int arg0, @OriginalArg(1) Class162[][][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(22) byte local22 = arg2 ? 1 : (byte) (Static213.anInt4343 & 0xFF);
		if (Static180.aByteArrayArrayArray3[Static59.anInt1472][arg4][arg3] == local22) {
			return false;
		} else if ((Static398.aByteArrayArrayArray17[Static59.anInt1472][arg4][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(54) byte local54 = 0;
			Static238.anIntArray372[0] = arg4;
			@Pc(60) int local60 = 0;
			@Pc(63) int local63 = local54 + 1;
			Static431.anIntArray599[0] = arg3;
			Static180.aByteArrayArrayArray3[Static59.anInt1472][arg4][arg3] = local22;
			while (local60 != local63) {
				@Pc(81) int local81 = Static238.anIntArray372[local60] & 0xFFFF;
				@Pc(89) int local89 = Static238.anIntArray372[local60] >> 16 & 0xFF;
				@Pc(97) int local97 = Static238.anIntArray372[local60] >> 24 & 0xFF;
				@Pc(103) int local103 = Static431.anIntArray599[local60] & 0xFFFF;
				@Pc(111) int local111 = Static431.anIntArray599[local60] >> 16 & 0xFF;
				local60 = local60 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static398.aByteArrayArrayArray17[Static59.anInt1472][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(136) boolean local136 = false;
				@Pc(178) int local178;
				@Pc(224) int local224;
				label231: for (@Pc(140) int local140 = Static59.anInt1472 + 1; local140 <= 3; local140++) {
					if ((Static398.aByteArrayArrayArray17[local140][local81][local103] & 0x8) == 0) {
						@Pc(322) Class11_Sub5 local322;
						@Pc(332) int local332;
						@Pc(311) Class162 local311;
						@Pc(317) Class199 local317;
						if (local119 && arg1[local140][local81][local103] != null) {
							if (arg1[local140][local81][local103].aClass11_Sub2_2 != null) {
								local178 = Static447.method6113(local89);
								if (local178 == arg1[local140][local81][local103].aClass11_Sub2_2.anInt7828 || arg1[local140][local81][local103].aClass11_Sub2_1 != null && arg1[local140][local81][local103].aClass11_Sub2_1.anInt7828 == local178) {
									continue;
								}
								if (local97 != 0) {
									local224 = Static447.method6113(local97);
									if (arg1[local140][local81][local103].aClass11_Sub2_2.anInt7828 == local224 || arg1[local140][local81][local103].aClass11_Sub2_1 != null && local224 == arg1[local140][local81][local103].aClass11_Sub2_1.anInt7828) {
										continue;
									}
								}
								if (local111 != 0) {
									local224 = Static447.method6113(local111);
									if (local224 == arg1[local140][local81][local103].aClass11_Sub2_2.anInt7828 || arg1[local140][local81][local103].aClass11_Sub2_1 != null && arg1[local140][local81][local103].aClass11_Sub2_1.anInt7828 == local224) {
										continue;
									}
								}
							}
							local311 = arg1[local140][local81][local103];
							if (local311.aClass199_1 != null) {
								for (local317 = local311.aClass199_1; local317 != null; local317 = local317.aClass199_2) {
									local322 = local317.aClass11_Sub5_1;
									if (local322 instanceof Interface12) {
										@Pc(328) Interface12 local328 = (Interface12) local322;
										local332 = local328.method6318();
										@Pc(336) int local336 = local328.method6316();
										if (local332 == 21) {
											local332 = 19;
										}
										@Pc(349) int local349 = local336 << 6 | local332;
										if (local89 == local349 || local97 != 0 && local349 == local97 || local111 != 0 && local111 == local349) {
											continue label231;
										}
									}
								}
							}
						}
						local311 = arg1[local140][local81][local103];
						if (local311 != null && local311.aClass199_1 != null) {
							for (local317 = local311.aClass199_1; local317 != null; local317 = local317.aClass199_2) {
								local322 = local317.aClass11_Sub5_1;
								if (local322.aShort94 != local322.aShort95 || local322.aShort93 != local322.aShort92) {
									for (@Pc(422) int local422 = local322.aShort95; local422 <= local322.aShort94; local422++) {
										for (local332 = local322.aShort93; local332 <= local322.aShort92; local332++) {
											Static180.aByteArrayArrayArray3[local140][local422][local332] = local22;
										}
									}
								}
							}
						}
						local136 = true;
						Static180.aByteArrayArrayArray3[local140][local81][local103] = local22;
					}
				}
				if (local136) {
					local178 = Static389.aClass14Array3[Static59.anInt1472 + 1].oa(local81, local103);
					if (Static103.anIntArray192[arg0] < local178) {
						Static103.anIntArray192[arg0] = local178;
					}
					local224 = local81 << 7;
					@Pc(498) int local498 = local103 << 7;
					if (local224 < Static326.anIntArray474[arg0]) {
						Static326.anIntArray474[arg0] = local224;
					} else if (Static150.anIntArray256[arg0] < local224) {
						Static150.anIntArray256[arg0] = local224;
					}
					if (Static77.anIntArray130[arg0] > local498) {
						Static77.anIntArray130[arg0] = local498;
					} else if (Static171.anIntArray274[arg0] < local498) {
						Static171.anIntArray274[arg0] = local498;
					}
				}
				if (!local119) {
					if (local81 >= 1 && Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 - 1][local103] != local22) {
						Static238.anIntArray372[local63] = 0xD3000000 | 0x120000 | local81 - 1;
						Static431.anIntArray599[local63] = local103 | 0x130000;
						Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 - 1][local103] = local22;
						local63 = local63 + 1 & 0xFFF;
					}
					local103++;
					if (local103 < Static301.anInt5585) {
						if (local81 - 1 >= 0 && Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 - 1][local103] != local22 && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81][local103] & 0x4) == 0 && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static238.anIntArray372[local63] = local81 - 1 | 0x120000 | 0x52000000;
							Static431.anIntArray599[local63] = local103 | 0x130000;
							Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 - 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
						if (local22 != Static180.aByteArrayArrayArray3[Static59.anInt1472][local81][local103]) {
							Static238.anIntArray372[local63] = 0x13000000 | 0x520000 | local81;
							Static431.anIntArray599[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static180.aByteArrayArrayArray3[Static59.anInt1472][local81][local103] = local22;
						}
						if (local81 + 1 < Static193.anInt3853 && local22 != Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 + 1][local103] && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81][local103] & 0x4) == 0 && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static238.anIntArray372[local63] = local81 + 1 | 0x520000 | 0x92000000;
							Static431.anIntArray599[local63] = local103 | 0x530000;
							local63 = local63 + 1 & 0xFFF;
							Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 + 1][local103] = local22;
						}
					}
					local103--;
					if (Static193.anInt3853 > local81 + 1 && local22 != Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 + 1][local103]) {
						Static238.anIntArray372[local63] = local81 + 1 | 0x53000000 | 0x920000;
						Static431.anIntArray599[local63] = local103 | 0x930000;
						Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 + 1][local103] = local22;
						local63 = local63 + 1 & 0xFFF;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && local22 != Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 - 1][local103] && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81][local103] & 0x4) == 0 && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static238.anIntArray372[local63] = local81 - 1 | 0x12000000 | 0xD20000;
							Static431.anIntArray599[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 - 1][local103] = local22;
						}
						if (local22 != Static180.aByteArrayArrayArray3[Static59.anInt1472][local81][local103]) {
							Static238.anIntArray372[local63] = local81 | 0x93000000 | 0xD20000;
							Static431.anIntArray599[local63] = local103 | 0xD30000;
							local63 = local63 + 1 & 0xFFF;
							Static180.aByteArrayArrayArray3[Static59.anInt1472][local81][local103] = local22;
						}
						if (local81 + 1 < Static193.anInt3853 && local22 != Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 + 1][local103] && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81][local103] & 0x4) == 0 && (Static398.aByteArrayArrayArray17[Static59.anInt1472][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static238.anIntArray372[local63] = local81 + 1 | 0xD2000000 | 0x920000;
							Static431.anIntArray599[local63] = local103 | 0x930000;
							Static180.aByteArrayArrayArray3[Static59.anInt1472][local81 + 1][local103] = local22;
							local63 = local63 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static103.anIntArray192[arg0] != -1000000) {
				Static103.anIntArray192[arg0] += 10;
				Static326.anIntArray474[arg0] -= 50;
				Static150.anIntArray256[arg0] += 50;
				Static171.anIntArray274[arg0] += 50;
				Static77.anIntArray130[arg0] -= 50;
			}
			return true;
		}
	}
}
