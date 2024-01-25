import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!ni;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
	public static final int[] anIntArray229 = new int[14];

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[S")
	public static final short[] aShortArray42 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_182 = new Class123(82, -1);

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public static void method3006() {
		if (Static291.aClass28_Sub1_1.method830(Static294.anInt5208) != 2) {
			return;
		}
		@Pc(28) byte local28 = (byte) (Static347.anInt6264 - 4 & 0xFF);
		@Pc(32) int local32 = Static347.anInt6264 % Static181.anInt3574;
		@Pc(38) int local38;
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			for (local38 = 0; local38 < Static117.anInt2450; local38++) {
				Static112.aByteArrayArrayArray4[local34][local32][local38] = local28;
			}
		}
		if (Static388.anInt6870 == 3) {
			return;
		}
		for (local38 = 0; local38 < 2; local38++) {
			Static332.anIntArray390[local38] = -1000000;
			Static263.anIntArray322[local38] = 1000000;
			Static368.anIntArray396[local38] = 0;
			Static222.anIntArray293[local38] = 1000000;
			Static280.anIntArray336[local38] = 0;
		}
		@Pc(128) int local128;
		if (Static429.anInt7656 != 1) {
			local128 = Static221.method3331(Static388.anInt6870, Static229.anInt4187, Static157.anInt3220);
			if (local128 - Static367.anInt6653 >= 800 || (Static203.aByteArrayArrayArray11[Static388.anInt6870][Static157.anInt3220 >> 7][Static229.anInt4187 >> 7] & 0x4) == 0) {
				return;
			}
			Static389.method5717(false, Static157.anInt3220 >> 7, 1, Static229.anInt4187 >> 7, Static409.aClass101ArrayArrayArray3);
			return;
		}
		if ((Static203.aByteArrayArrayArray11[Static388.anInt6870][Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7][Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7] & 0x4) != 0) {
			Static389.method5717(false, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7, 0, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7, Static409.aClass101ArrayArrayArray3);
		}
		if (Static328.anInt5668 >= 2560) {
			return;
		}
		local128 = Static157.anInt3220 >> 7;
		@Pc(132) int local132 = Static229.anInt4187 >> 7;
		@Pc(137) int local137 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7;
		@Pc(142) int local142 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7;
		@Pc(150) int local150;
		if (local128 >= local137) {
			local150 = local128 - local137;
		} else {
			local150 = local137 - local128;
		}
		@Pc(165) int local165;
		if (local142 <= local132) {
			local165 = local132 - local142;
		} else {
			local165 = local142 - local132;
		}
		if ((local150 != 0 || local165 != 0) && (-Static181.anInt3574) < local150 && Static181.anInt3574 > local150 && -Static117.anInt2450 < local165 && local165 < Static117.anInt2450) {
			@Pc(248) int local248;
			@Pc(250) int local250;
			if (local165 < local150) {
				local248 = local165 * 65536 / local150;
				local250 = 32768;
				while (local137 != local128) {
					if (local128 < local137) {
						local128++;
					} else if (local137 < local128) {
						local128--;
					}
					if ((Static203.aByteArrayArrayArray11[Static388.anInt6870][local128][local132] & 0x4) != 0) {
						Static389.method5717(false, local128, 1, local132, Static409.aClass101ArrayArrayArray3);
						return;
					}
					local250 += local248;
					if (local250 >= 65536) {
						if (local132 < local142) {
							local132++;
						} else if (local142 < local132) {
							local132--;
						}
						local250 -= 65536;
						if ((Static203.aByteArrayArrayArray11[Static388.anInt6870][local128][local132] & 0x4) != 0) {
							Static389.method5717(false, local128, 1, local132, Static409.aClass101ArrayArrayArray3);
							return;
						}
					}
				}
				return;
			}
			local248 = local150 * 65536 / local165;
			local250 = 32768;
			while (local132 != local142) {
				if (local142 > local132) {
					local132++;
				} else if (local132 > local142) {
					local132--;
				}
				if ((Static203.aByteArrayArrayArray11[Static388.anInt6870][local128][local132] & 0x4) != 0) {
					Static389.method5717(false, local128, 1, local132, Static409.aClass101ArrayArrayArray3);
					return;
				}
				local250 += local248;
				if (local250 >= 65536) {
					if (local137 > local128) {
						local128++;
					} else if (local128 > local137) {
						local128--;
					}
					local250 -= 65536;
					if ((Static203.aByteArrayArrayArray11[Static388.anInt6870][local128][local132] & 0x4) != 0) {
						Static389.method5717(false, local128, 1, local132, Static409.aClass101ArrayArrayArray3);
						return;
					}
				}
			}
			return;
		}
		Static390.method5741(null, "RC: " + local128 + "," + local132 + " " + local137 + "," + local142 + " " + Static2.anInt6396 + "," + Static348.anInt6273);
		return;
	}
}
