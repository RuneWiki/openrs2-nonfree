import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!li", name = "m", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_43 = new Class211();

	@OriginalMember(owner = "client!li", name = "n", descriptor = "[I")
	public static final int[] anIntArray422 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	public static int anInt5681 = -2;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
	public static void method4859() {
		Static98.aClass305_13.method7440();
		Static279.aClass143_3.method3837();
		Static227.aClass143_2.method3837();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method4860() {
		if (Static104.aClass6_Sub6_Sub1_4.method1070(Static5.anInt145) != 2) {
			return;
		}
		@Pc(23) byte local23 = (byte) (Static555.anInt9478 - 4 & 0xFF);
		@Pc(27) int local27 = Static555.anInt9478 % Static228.anInt4746;
		@Pc(33) int local33;
		for (@Pc(29) int local29 = 0; local29 < 4; local29++) {
			for (local33 = 0; local33 < Static44.anInt1275; local33++) {
				Static68.aByteArrayArrayArray4[local29][local27][local33] = local23;
			}
		}
		if (Static493.anInt8836 == 3) {
			return;
		}
		for (local33 = 0; local33 < 2; local33++) {
			Static484.anIntArray773[local33] = -1000000;
			Static564.anIntArray823[local33] = 1000000;
			Static429.anIntArray567[local33] = 0;
			Static9.anIntArray43[local33] = 1000000;
			Static493.anIntArray777[local33] = 0;
		}
		@Pc(129) int local129;
		if (Static84.anInt1994 != 1) {
			local129 = Static482.method7333(Static493.anInt8836, Static390.anInt7318, Static86.anInt2132);
			if (local129 - Static5.anInt142 >= 3200 || (Static356.aByteArrayArrayArray17[Static493.anInt8836][Static86.anInt2132 >> 9][Static390.anInt7318 >> 9] & 0x4) == 0) {
				return;
			}
			Static91.method2008(Static86.anInt2132 >> 9, Static390.anInt7318 >> 9, 1, false, Static256.aClass224ArrayArrayArray1);
			return;
		}
		if ((Static356.aByteArrayArrayArray17[Static493.anInt8836][Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9][Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9] & 0x4) != 0) {
			Static91.method2008(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9, Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9, 0, false, Static256.aClass224ArrayArrayArray1);
		}
		if (Static348.anInt6726 >= 2560) {
			return;
		}
		local129 = Static86.anInt2132 >> 9;
		@Pc(133) int local133 = Static390.anInt7318 >> 9;
		@Pc(138) int local138 = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347 >> 9;
		@Pc(143) int local143 = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351 >> 9;
		@Pc(151) int local151;
		if (local138 > local129) {
			local151 = local138 - local129;
		} else {
			local151 = local129 - local138;
		}
		@Pc(166) int local166;
		if (local133 >= local143) {
			local166 = local133 - local143;
		} else {
			local166 = local143 - local133;
		}
		if ((local151 != 0 || local166 != 0) && (-Static228.anInt4746) < local151 && local151 < Static228.anInt4746 && local166 > -Static44.anInt1275 && local166 < Static44.anInt1275) {
			@Pc(245) int local245;
			@Pc(247) int local247;
			if (local151 <= local166) {
				local245 = local151 * 65536 / local166;
				local247 = 32768;
				while (local133 != local143) {
					if (local133 < local143) {
						local133++;
					} else if (local133 > local143) {
						local133--;
					}
					if ((Static356.aByteArrayArrayArray17[Static493.anInt8836][local129][local133] & 0x4) != 0) {
						Static91.method2008(local129, local133, 1, false, Static256.aClass224ArrayArrayArray1);
						return;
					}
					local247 += local245;
					if (local247 >= 65536) {
						if (local129 < local138) {
							local129++;
						} else if (local129 > local138) {
							local129--;
						}
						local247 -= 65536;
						if ((Static356.aByteArrayArrayArray17[Static493.anInt8836][local129][local133] & 0x4) != 0) {
							Static91.method2008(local129, local133, 1, false, Static256.aClass224ArrayArrayArray1);
							return;
						}
					}
				}
				return;
			}
			local245 = local166 * 65536 / local151;
			local247 = 32768;
			while (local129 != local138) {
				if (local129 < local138) {
					local129++;
				} else if (local138 < local129) {
					local129--;
				}
				if ((Static356.aByteArrayArrayArray17[Static493.anInt8836][local129][local133] & 0x4) != 0) {
					Static91.method2008(local129, local133, 1, false, Static256.aClass224ArrayArrayArray1);
					return;
				}
				local247 += local245;
				if (local247 >= 65536) {
					local247 -= 65536;
					if (local143 > local133) {
						local133++;
					} else if (local133 > local143) {
						local133--;
					}
					if ((Static356.aByteArrayArrayArray17[Static493.anInt8836][local129][local133] & 0x4) != 0) {
						Static91.method2008(local129, local133, 1, false, Static256.aClass224ArrayArrayArray1);
						return;
					}
				}
			}
			return;
		}
		Static5.method211(null, "RC: " + local129 + "," + local133 + " " + local138 + "," + local143 + " " + Static191.anInt4147 + "," + Static247.anInt5049);
		return;
	}
}
