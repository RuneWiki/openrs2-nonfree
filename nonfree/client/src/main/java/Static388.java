import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
	public static int anInt6739;

	@OriginalMember(owner = "client!tp", name = "w", descriptor = "Lclient!ru;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_123 = new Class36(1, 1);

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_97 = new Class242("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_124 = new Class36(52, 4);

	@OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
	public static int anInt6740 = 0;

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
	public static void method5239() {
		if (Static126.aClass67_Sub1_1.method4535(Static286.anInt5207) != 2) {
			return;
		}
		@Pc(29) byte local29 = (byte) (Static203.anInt3898 - 4 & 0xFF);
		@Pc(33) int local33 = Static203.anInt3898 % Static126.anInt2569;
		@Pc(39) int local39;
		for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
			for (local39 = 0; local39 < Static190.anInt3697; local39++) {
				Static275.aByteArrayArrayArray8[local35][local33][local39] = local29;
			}
		}
		if (Static221.anInt4855 == 3) {
			return;
		}
		for (local39 = 0; local39 < 2; local39++) {
			Static68.anIntArray382[local39] = -1000000;
			Static385.anIntArray500[local39] = 1000000;
			Static322.anIntArray502[local39] = 0;
			Static254.anIntArray385[local39] = 1000000;
			Static90.anIntArray123[local39] = 0;
		}
		@Pc(137) int local137;
		if (Static134.anInt2621 != 1) {
			local137 = Static222.method3109(Static254.anInt4614, Static221.anInt4855, Static30.anInt696);
			if (local137 - Static292.anInt5287 >= 800 || (Static327.aByteArrayArrayArray11[Static221.anInt4855][Static254.anInt4614 >> 7][Static30.anInt696 >> 7] & 0x4) == 0) {
				return;
			}
			Static124.method1882(false, 1, Static254.anInt4614 >> 7, Static40.aClass53ArrayArrayArray2, Static30.anInt696 >> 7);
			return;
		}
		if ((Static327.aByteArrayArrayArray11[Static221.anInt4855][Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7][Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7] & 0x4) != 0) {
			Static124.method1882(false, 0, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7, Static40.aClass53ArrayArrayArray2, Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7);
		}
		if (Static183.anInt3503 >= 2560) {
			return;
		}
		local137 = Static254.anInt4614 >> 7;
		@Pc(141) int local141 = Static30.anInt696 >> 7;
		@Pc(146) int local146 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 >> 7;
		@Pc(151) int local151 = Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 >> 7;
		@Pc(159) int local159;
		if (local146 <= local137) {
			local159 = local137 - local146;
		} else {
			local159 = local146 - local137;
		}
		@Pc(178) int local178;
		if (local141 < local151) {
			local178 = local151 - local141;
		} else {
			local178 = local141 - local151;
		}
		if ((local159 != 0 || local178 != 0) && local159 > -Static126.anInt2569 && local159 < Static126.anInt2569 && local178 > -Static190.anInt3697 && local178 < Static190.anInt3697) {
			@Pc(251) int local251;
			@Pc(253) int local253;
			if (local159 > local178) {
				local251 = local178 * 65536 / local159;
				local253 = 32768;
				while (local137 != local146) {
					if (local137 < local146) {
						local137++;
					} else if (local146 < local137) {
						local137--;
					}
					if ((Static327.aByteArrayArrayArray11[Static221.anInt4855][local137][local141] & 0x4) != 0) {
						Static124.method1882(false, 1, local137, Static40.aClass53ArrayArrayArray2, local141);
						return;
					}
					local253 += local251;
					if (local253 >= 65536) {
						if (local141 < local151) {
							local141++;
						} else if (local151 < local141) {
							local141--;
						}
						local253 -= 65536;
						if ((Static327.aByteArrayArrayArray11[Static221.anInt4855][local137][local141] & 0x4) != 0) {
							Static124.method1882(false, 1, local137, Static40.aClass53ArrayArrayArray2, local141);
							return;
						}
					}
				}
				return;
			}
			local251 = local159 * 65536 / local178;
			local253 = 32768;
			while (local151 != local141) {
				if (local151 > local141) {
					local141++;
				} else if (local151 < local141) {
					local141--;
				}
				if ((Static327.aByteArrayArrayArray11[Static221.anInt4855][local137][local141] & 0x4) != 0) {
					Static124.method1882(false, 1, local137, Static40.aClass53ArrayArrayArray2, local141);
					return;
				}
				local253 += local251;
				if (local253 >= 65536) {
					if (local137 < local146) {
						local137++;
					} else if (local137 > local146) {
						local137--;
					}
					local253 -= 65536;
					if ((Static327.aByteArrayArrayArray11[Static221.anInt4855][local137][local141] & 0x4) != 0) {
						Static124.method1882(false, 1, local137, Static40.aClass53ArrayArrayArray2, local141);
						return;
					}
				}
			}
			return;
		}
		Static273.method3690("RC: " + local137 + "," + local141 + " " + local146 + "," + local151 + " " + Static381.anInt6688 + "," + Static285.anInt5187, null);
		return;
	}
}
