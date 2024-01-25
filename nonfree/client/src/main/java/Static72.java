import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cs", name = "g", descriptor = "Lclient!dg;")
	public static Class2_Sub12_Sub1 aClass2_Sub12_Sub1_1;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
	public static int anInt1637;

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "Lclient!pl;")
	public static Class259 aClass259_33;

	@OriginalMember(owner = "client!cs", name = "f", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_27 = new Class286(39, 16);

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)V")
	public static void method1170() {
		if (aClass2_Sub12_Sub1_1.method1430(Static391.anInt6846) != 2) {
			return;
		}
		@Pc(24) byte local24 = (byte) (Static485.anInt8225 - 4 & 0xFF);
		@Pc(28) int local28 = Static485.anInt8225 % Static188.anInt3850;
		@Pc(34) int local34;
		for (@Pc(30) int local30 = 0; local30 < 4; local30++) {
			for (local34 = 0; local34 < Static49.anInt1174; local34++) {
				Static143.aByteArrayArrayArray50[local30][local28][local34] = local24;
			}
		}
		if (Static566.anInt9278 == 3) {
			return;
		}
		for (local34 = 0; local34 < 2; local34++) {
			Static381.anIntArray484[local34] = -1000000;
			Static326.anIntArray423[local34] = 1000000;
			Static204.anIntArray238[local34] = 0;
			Static323.anIntArray421[local34] = 1000000;
			Static177.anIntArray207[local34] = 0;
		}
		@Pc(91) int local91 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761;
		@Pc(94) int local94 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764;
		@Pc(106) int local106;
		if (Static311.anInt5570 != 1 && Static238.anInt4482 == -1) {
			local106 = Static524.method7217(Static90.anInt1932, Static566.anInt9278, Static7.anInt337);
			if (local106 - Static548.anInt8906 < 3200 && (Static521.aByteArrayArrayArray45[Static566.anInt9278][Static90.anInt1932 >> 9][Static7.anInt337 >> 9] & 0x4) != 0) {
				Static450.method6453(false, 1, Static7.anInt337 >> 9, Static90.anInt1932 >> 9, Static389.aClass346ArrayArrayArray2);
				return;
			}
			return;
		}
		if (Static311.anInt5570 != 1) {
			local94 = Static94.anInt2006;
			local91 = Static238.anInt4482;
		}
		if ((Static521.aByteArrayArrayArray45[Static566.anInt9278][local91 >> 9][local94 >> 9] & 0x4) != 0) {
			Static450.method6453(false, 0, local94 >> 9, local91 >> 9, Static389.aClass346ArrayArrayArray2);
		}
		if (Static323.anInt6015 >= 2560) {
			return;
		}
		local106 = Static90.anInt1932 >> 9;
		@Pc(185) int local185 = Static7.anInt337 >> 9;
		@Pc(189) int local189 = local91 >> 9;
		@Pc(193) int local193 = local94 >> 9;
		@Pc(201) int local201;
		if (local106 >= local189) {
			local201 = local106 - local189;
		} else {
			local201 = local189 - local106;
		}
		@Pc(219) int local219;
		if (local185 < local193) {
			local219 = local193 - local185;
		} else {
			local219 = local185 - local193;
		}
		if (local201 == 0 && local219 == 0 || local201 <= -Static188.anInt3850 || Static188.anInt3850 <= local201 || local219 <= -Static49.anInt1174 || Static49.anInt1174 <= local219) {
			Static58.method946("RC: " + local106 + "," + local185 + " " + local189 + "," + local193 + " " + Static35.anInt906 + "," + Static130.anInt5246, null);
			return;
		}
		@Pc(291) int local291;
		@Pc(293) int local293;
		if (local219 < local201) {
			local291 = local219 * 65536 / local201;
			local293 = 32768;
			while (local189 != local106) {
				if (local106 < local189) {
					local106++;
				} else if (local189 < local106) {
					local106--;
				}
				if ((Static521.aByteArrayArrayArray45[Static566.anInt9278][local106][local185] & 0x4) != 0) {
					Static450.method6453(false, 1, local185, local106, Static389.aClass346ArrayArrayArray2);
					return;
				}
				local293 += local291;
				if (local293 >= 65536) {
					local293 -= 65536;
					if (local185 < local193) {
						local185++;
					} else if (local193 < local185) {
						local185--;
					}
					if ((Static521.aByteArrayArrayArray45[Static566.anInt9278][local106][local185] & 0x4) != 0) {
						Static450.method6453(false, 1, local185, local106, Static389.aClass346ArrayArrayArray2);
						return;
					}
				}
			}
			return;
		}
		local291 = local201 * 65536 / local219;
		local293 = 32768;
		while (local193 != local185) {
			if (local185 < local193) {
				local185++;
			} else if (local193 < local185) {
				local185--;
			}
			if ((Static521.aByteArrayArrayArray45[Static566.anInt9278][local106][local185] & 0x4) != 0) {
				Static450.method6453(false, 1, local185, local106, Static389.aClass346ArrayArrayArray2);
				return;
			}
			local293 += local291;
			if (local293 >= 65536) {
				local293 -= 65536;
				if (local189 > local106) {
					local106++;
				} else if (local106 > local189) {
					local106--;
				}
				if ((Static521.aByteArrayArrayArray45[Static566.anInt9278][local106][local185] & 0x4) != 0) {
					Static450.method6453(false, 1, local185, local106, Static389.aClass346ArrayArrayArray2);
					return;
				}
			}
		}
	}
}
