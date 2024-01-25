import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "Lclient!wk;")
	public static Class268 aClass268_2;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	public static int anInt951;

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt944 = -1;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_12 = new Class194(39, 15);

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "Lclient!fi;")
	public static Class76 aClass76_3 = null;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_20 = new Class129(66, -2);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZILclient!uu;)V")
	public static void method840(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15_Sub2 arg1) {
		Static86.aBoolean106 = false;
		Static246.anInt3974 = 0;
		Static373.method4885(arg1);
		Static450.method5935(arg1);
		if (Static86.aBoolean106) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt7013) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt7013 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public static void method841() {
		if (Static216.aClass1_Sub1_1.method3589(Static146.anInt2644) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static409.anInt6832 - 4 & 0xFF);
		@Pc(25) int local25 = Static409.anInt6832 % Static433.anInt7210;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static418.anInt6969; local31++) {
				Static264.aByteArrayArrayArray15[local27][local25][local31] = local21;
			}
		}
		if (Static6.anInt131 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static264.anIntArray332[local31] = -1000000;
			Static275.anIntArray342[local31] = 1000000;
			Static238.anIntArray250[local31] = 0;
			Static439.anIntArray491[local31] = 1000000;
			Static432.anIntArray485[local31] = 0;
		}
		@Pc(139) int local139;
		if (Static449.anInt7379 != 1) {
			local139 = Static192.method2572(Static393.anInt4184, Static116.anInt1977, Static6.anInt131);
			if (local139 - Static444.anInt7360 >= 800 || (Static452.aByteArrayArrayArray16[Static6.anInt131][Static116.anInt1977 >> 7][Static393.anInt4184 >> 7] & 0x4) == 0) {
				return;
			}
			Static53.method831(Static393.anInt4184 >> 7, false, Static319.aClass258ArrayArrayArray3, Static116.anInt1977 >> 7, 1);
			return;
		}
		if ((Static452.aByteArrayArrayArray16[Static6.anInt131][Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7][Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7] & 0x4) != 0) {
			Static53.method831(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7, false, Static319.aClass258ArrayArrayArray3, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7, 0);
		}
		if (Static248.anInt3998 >= 2560) {
			return;
		}
		local139 = Static116.anInt1977 >> 7;
		@Pc(143) int local143 = Static393.anInt4184 >> 7;
		@Pc(148) int local148 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7;
		@Pc(153) int local153 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7;
		@Pc(165) int local165;
		if (local139 < local148) {
			local165 = local148 - local139;
		} else {
			local165 = local139 - local148;
		}
		@Pc(179) int local179;
		if (local153 <= local143) {
			local179 = local143 - local153;
		} else {
			local179 = local153 - local143;
		}
		if ((local165 != 0 || local179 != 0) && (-Static433.anInt7210) < local165 && local165 < Static433.anInt7210 && -Static418.anInt6969 < local179 && Static418.anInt6969 > local179) {
			@Pc(256) int local256;
			@Pc(258) int local258;
			if (local165 <= local179) {
				local256 = local165 * 65536 / local179;
				local258 = 32768;
				while (local143 != local153) {
					if (local143 < local153) {
						local143++;
					} else if (local153 < local143) {
						local143--;
					}
					if ((Static452.aByteArrayArrayArray16[Static6.anInt131][local139][local143] & 0x4) != 0) {
						Static53.method831(local143, false, Static319.aClass258ArrayArrayArray3, local139, 1);
						return;
					}
					local258 += local256;
					if (local258 >= 65536) {
						local258 -= 65536;
						if (local139 < local148) {
							local139++;
						} else if (local139 > local148) {
							local139--;
						}
						if ((Static452.aByteArrayArrayArray16[Static6.anInt131][local139][local143] & 0x4) != 0) {
							Static53.method831(local143, false, Static319.aClass258ArrayArrayArray3, local139, 1);
							return;
						}
					}
				}
				return;
			}
			local256 = local179 * 65536 / local165;
			local258 = 32768;
			while (local139 != local148) {
				if (local148 > local139) {
					local139++;
				} else if (local139 > local148) {
					local139--;
				}
				if ((Static452.aByteArrayArrayArray16[Static6.anInt131][local139][local143] & 0x4) != 0) {
					Static53.method831(local143, false, Static319.aClass258ArrayArrayArray3, local139, 1);
					return;
				}
				local258 += local256;
				if (local258 >= 65536) {
					local258 -= 65536;
					if (local153 > local143) {
						local143++;
					} else if (local143 > local153) {
						local143--;
					}
					if ((Static452.aByteArrayArrayArray16[Static6.anInt131][local139][local143] & 0x4) != 0) {
						Static53.method831(local143, false, Static319.aClass258ArrayArrayArray3, local139, 1);
						return;
					}
				}
			}
			return;
		}
		Static206.method2769("RC: " + local139 + "," + local143 + " " + local148 + "," + local153 + " " + Static31.anInt618 + "," + Static226.anInt3768, null);
		return;
	}
}
