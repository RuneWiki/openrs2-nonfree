import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "Lclient!ok;")
	public static Class178 aClass178_92;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "Lclient!jv;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "[S")
	public static final short[] aShortArray93 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_109 = new Class55("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public static void method4077() {
		if (Static130.aClass153_Sub1_1.method4230(Static377.anInt6113) != 2) {
			return;
		}
		@Pc(26) byte local26 = (byte) (Static143.anInt2745 - 4 & 0xFF);
		@Pc(30) int local30 = Static143.anInt2745 % Static333.anInt3375;
		@Pc(36) int local36;
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			for (local36 = 0; local36 < Static102.anInt2086; local36++) {
				Static351.aByteArrayArrayArray17[local32][local30][local36] = local26;
			}
		}
		if (Static268.anInt4539 == 3) {
			return;
		}
		for (local36 = 0; local36 < 2; local36++) {
			Static315.anIntArray465[local36] = -1000000;
			Static313.anIntArray464[local36] = 1000000;
			Static382.anIntArray554[local36] = 0;
			Static4.anIntArray626[local36] = 1000000;
			Static203.anIntArray321[local36] = 0;
		}
		@Pc(138) int local138;
		if (Static9.anInt60 != 1) {
			local138 = Static333.method2748(Static268.anInt4539, Static181.anInt3254, Static46.anInt737);
			if (local138 - Static212.anInt3801 >= 800 || (Static347.aByteArrayArrayArray16[Static268.anInt4539][Static46.anInt737 >> 7][Static181.anInt3254 >> 7] & 0x4) == 0) {
				return;
			}
			Static9.method48(Static181.anInt3254 >> 7, 1, false, Static19.aClass223ArrayArrayArray1, Static46.anInt737 >> 7);
			return;
		}
		if ((Static347.aByteArrayArrayArray16[Static268.anInt4539][Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7][Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7] & 0x4) != 0) {
			Static9.method48(Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7, 0, false, Static19.aClass223ArrayArrayArray1, Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7);
		}
		if (Static9.anInt55 >= 2560) {
			return;
		}
		local138 = Static46.anInt737 >> 7;
		@Pc(142) int local142 = Static181.anInt3254 >> 7;
		@Pc(147) int local147 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388 >> 7;
		@Pc(152) int local152 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383 >> 7;
		@Pc(160) int local160;
		if (local147 > local138) {
			local160 = local147 - local138;
		} else {
			local160 = local138 - local147;
		}
		@Pc(175) int local175;
		if (local152 > local142) {
			local175 = local152 - local142;
		} else {
			local175 = local142 - local152;
		}
		if ((local160 != 0 || local175 != 0) && -Static333.anInt3375 < local160 && local160 < Static333.anInt3375 && local175 > -Static102.anInt2086 && Static102.anInt2086 > local175) {
			@Pc(246) int local246;
			@Pc(248) int local248;
			if (local160 <= local175) {
				local246 = local160 * 65536 / local175;
				local248 = 32768;
				while (local152 != local142) {
					if (local152 > local142) {
						local142++;
					} else if (local142 > local152) {
						local142--;
					}
					if ((Static347.aByteArrayArrayArray16[Static268.anInt4539][local138][local142] & 0x4) != 0) {
						Static9.method48(local142, 1, false, Static19.aClass223ArrayArrayArray1, local138);
						return;
					}
					local248 += local246;
					if (local248 >= 65536) {
						if (local138 < local147) {
							local138++;
						} else if (local147 < local138) {
							local138--;
						}
						local248 -= 65536;
						if ((Static347.aByteArrayArrayArray16[Static268.anInt4539][local138][local142] & 0x4) != 0) {
							Static9.method48(local142, 1, false, Static19.aClass223ArrayArrayArray1, local138);
							return;
						}
					}
				}
				return;
			}
			local246 = local175 * 65536 / local160;
			local248 = 32768;
			while (local147 != local138) {
				if (local147 > local138) {
					local138++;
				} else if (local147 < local138) {
					local138--;
				}
				if ((Static347.aByteArrayArrayArray16[Static268.anInt4539][local138][local142] & 0x4) != 0) {
					Static9.method48(local142, 1, false, Static19.aClass223ArrayArrayArray1, local138);
					return;
				}
				local248 += local246;
				if (local248 >= 65536) {
					if (local152 > local142) {
						local142++;
					} else if (local152 < local142) {
						local142--;
					}
					local248 -= 65536;
					if ((Static347.aByteArrayArrayArray16[Static268.anInt4539][local138][local142] & 0x4) != 0) {
						Static9.method48(local142, 1, false, Static19.aClass223ArrayArrayArray1, local138);
						return;
					}
				}
			}
			return;
		}
		Static419.method5247(null, "RC: " + local138 + "," + local142 + " " + local147 + "," + local152 + " " + Static359.anInt5713 + "," + Static314.anInt5181);
		return;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4079(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static249.aClass55_95.method1205(Static5.anInt20) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static402.aClass55_132.method1205(Static5.anInt20) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(II)I")
	public static int method4080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static46.aByteArrayArray3 == null ? 0 : Static46.aByteArrayArray3[arg0][arg1] & 0xFF;
	}
}
