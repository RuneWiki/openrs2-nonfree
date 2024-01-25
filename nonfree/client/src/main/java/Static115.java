import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "Lclient!kda;")
	public static Class160 aClass160_24;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "F")
	public static float aFloat77 = 0.25F;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "I")
	public static int anInt2806 = -1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public static void method2633() {
		if (Static89.aClass1_Sub28_Sub1_1.method4271(Static526.anInt8926) != 2) {
			return;
		}
		@Pc(22) byte local22 = (byte) (Static15.anInt833 - 4 & 0xFF);
		@Pc(26) int local26 = Static15.anInt833 % Static542.anInt9387;
		@Pc(31) int local31;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			for (local31 = 0; local31 < Static36.anInt1324; local31++) {
				Static388.aByteArrayArrayArray16[local28][local26][local31] = local22;
			}
		}
		if (Static245.anInt4747 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static213.anIntArray327[local31] = -1000000;
			Static298.anIntArray407[local31] = 1000000;
			Static9.anIntArray16[local31] = 0;
			Static460.anIntArray621[local31] = 1000000;
			Static55.anIntArray141[local31] = 0;
		}
		@Pc(96) int local96;
		if (Static464.anInt8003 != 1) {
			local96 = Static74.method1954(Static245.anInt4747, Static347.anInt6404, Static308.anInt5918);
			if (local96 - Static520.anInt8842 < 800 && (Static542.aByteArrayArrayArray17[Static245.anInt4747][Static308.anInt5918 >> 7][Static347.anInt6404 >> 7] & 0x4) != 0) {
				Static181.method3475(1, Static313.aClass206ArrayArrayArray2, false, Static347.anInt6404 >> 7, Static308.anInt5918 >> 7);
				return;
			}
			return;
		}
		if ((Static542.aByteArrayArrayArray17[Static245.anInt4747][Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7][Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7] & 0x4) != 0) {
			Static181.method3475(0, Static313.aClass206ArrayArrayArray2, false, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7);
		}
		if (Static411.anInt7178 >= 2560) {
			return;
		}
		local96 = Static308.anInt5918 >> 7;
		@Pc(173) int local173 = Static347.anInt6404 >> 7;
		@Pc(178) int local178 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7;
		@Pc(183) int local183 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7;
		@Pc(195) int local195;
		if (local178 > local96) {
			local195 = local178 - local96;
		} else {
			local195 = local96 - local178;
		}
		@Pc(208) int local208;
		if (local183 > local173) {
			local208 = local183 - local173;
		} else {
			local208 = local173 - local183;
		}
		if (local195 == 0 && local208 == 0 || -Static542.anInt9387 >= local195 || Static542.anInt9387 <= local195 || -Static36.anInt1324 >= local208 || local208 >= Static36.anInt1324) {
			Static41.method1359(null, "RC: " + local96 + "," + local173 + " " + local178 + "," + local183 + " " + Static324.anInt6132 + "," + Static517.anInt8716);
			return;
		}
		@Pc(279) int local279;
		@Pc(281) int local281;
		if (local208 >= local195) {
			local279 = local195 * 65536 / local208;
			local281 = 32768;
			while (local173 != local183) {
				if (local183 > local173) {
					local173++;
				} else if (local183 < local173) {
					local173--;
				}
				if ((Static542.aByteArrayArrayArray17[Static245.anInt4747][local96][local173] & 0x4) != 0) {
					Static181.method3475(1, Static313.aClass206ArrayArrayArray2, false, local173, local96);
					return;
				}
				local281 += local279;
				if (local281 >= 65536) {
					if (local178 > local96) {
						local96++;
					} else if (local178 < local96) {
						local96--;
					}
					local281 -= 65536;
					if ((Static542.aByteArrayArrayArray17[Static245.anInt4747][local96][local173] & 0x4) != 0) {
						Static181.method3475(1, Static313.aClass206ArrayArrayArray2, false, local173, local96);
						return;
					}
				}
			}
			return;
		}
		local279 = local208 * 65536 / local195;
		local281 = 32768;
		while (local178 != local96) {
			if (local178 > local96) {
				local96++;
			} else if (local178 < local96) {
				local96--;
			}
			if ((Static542.aByteArrayArrayArray17[Static245.anInt4747][local96][local173] & 0x4) != 0) {
				Static181.method3475(1, Static313.aClass206ArrayArrayArray2, false, local173, local96);
				return;
			}
			local281 += local279;
			if (local281 >= 65536) {
				local281 -= 65536;
				if (local183 > local173) {
					local173++;
				} else if (local183 < local173) {
					local173--;
				}
				if ((Static542.aByteArrayArrayArray17[Static245.anInt4747][local96][local173] & 0x4) != 0) {
					Static181.method3475(1, Static313.aClass206ArrayArrayArray2, false, local173, local96);
					return;
				}
			}
		}
	}
}
