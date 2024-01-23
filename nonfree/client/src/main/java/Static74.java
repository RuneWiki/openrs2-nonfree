import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "Lclient!nm;")
	public static Class119 aClass119_28;

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString60 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
	public static int anInt1611 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static void method1487() {
		if (Static122.method2212() != 2) {
			return;
		}
		@Pc(20) int local20 = Static121.anInt2463 % 104;
		@Pc(27) byte local27 = (byte) (Static121.anInt2463 - 4 & 0xFF);
		@Pc(29) int local29;
		@Pc(34) int local34;
		for (local29 = 0; local29 < 4; local29++) {
			for (local34 = 0; local34 < 104; local34++) {
				Static35.aByteArrayArrayArray2[local29][local20][local34] = local27;
			}
		}
		if (Static132.anInt2608 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static283.anIntArray564[local29] = -1000000;
			Static117.anIntArray171[local29] = 1000000;
			Static192.anIntArray397[local29] = 0;
			Static26.anIntArray59[local29] = 1000000;
			Static174.anIntArray612[local29] = 0;
		}
		if (Static228.anInt4270 != 1) {
			local29 = Static42.method768(Static273.anInt5035, Static132.anInt2608, Static87.anInt1875);
			if (local29 - Static283.anInt5144 < 800 && (Static17.aByteArrayArrayArray1[Static132.anInt2608][Static273.anInt5035 >> 7][Static87.anInt1875 >> 7] & 0x4) != 0) {
				Static134.method2335(Static87.anInt1875 >> 7, Static254.aClass1_Sub16ArrayArrayArray3, false, Static273.anInt5035 >> 7, 1);
			}
			return;
		}
		if ((Static17.aByteArrayArrayArray1[Static132.anInt2608][Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7][Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7] & 0x4) != 0) {
			Static134.method2335(Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7, Static254.aClass1_Sub16ArrayArrayArray3, false, Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7, 0);
		}
		if (Static53.anInt1161 >= 310) {
			return;
		}
		local34 = Static87.anInt1875 >> 7;
		@Pc(139) int local139 = Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7;
		local29 = Static273.anInt5035 >> 7;
		@Pc(148) int local148 = Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7;
		@Pc(156) int local156;
		if (local29 >= local139) {
			local156 = local29 - local139;
		} else {
			local156 = local139 - local29;
		}
		@Pc(175) int local175;
		if (local148 <= local34) {
			local175 = local34 - local148;
		} else {
			local175 = local148 - local34;
		}
		if (local156 == 0 && local175 == 0 || local156 <= -104 || local156 >= 104 || local175 <= -104 || local175 >= 104) {
			Static6.method4140(null, "RC: " + local29 + "," + local34 + " " + local139 + "," + local148 + " " + Static38.anInt714 + "," + Static135.anInt2659);
			return;
		}
		@Pc(248) int local248;
		@Pc(250) int local250;
		if (local156 > local175) {
			local248 = local175 * 65536 / local156;
			local250 = 32768;
			while (local139 != local29) {
				if (local29 < local139) {
					local29++;
				} else if (local29 > local139) {
					local29--;
				}
				if ((Static17.aByteArrayArrayArray1[Static132.anInt2608][local29][local34] & 0x4) != 0) {
					Static134.method2335(local34, Static254.aClass1_Sub16ArrayArrayArray3, false, local29, 1);
					break;
				}
				local250 += local248;
				if (local250 >= 65536) {
					local250 -= 65536;
					if (local148 > local34) {
						local34++;
					} else if (local148 < local34) {
						local34--;
					}
					if ((Static17.aByteArrayArrayArray1[Static132.anInt2608][local29][local34] & 0x4) != 0) {
						Static134.method2335(local34, Static254.aClass1_Sub16ArrayArrayArray3, false, local29, 1);
						break;
					}
				}
			}
			return;
		}
		local248 = local156 * 65536 / local175;
		local250 = 32768;
		while (local34 != local148) {
			if (local34 < local148) {
				local34++;
			} else if (local148 < local34) {
				local34--;
			}
			if ((Static17.aByteArrayArrayArray1[Static132.anInt2608][local29][local34] & 0x4) != 0) {
				Static134.method2335(local34, Static254.aClass1_Sub16ArrayArrayArray3, false, local29, 1);
				break;
			}
			local250 += local248;
			if (local250 >= 65536) {
				if (local139 > local29) {
					local29++;
				} else if (local139 < local29) {
					local29--;
				}
				local250 -= 65536;
				if ((Static17.aByteArrayArrayArray1[Static132.anInt2608][local29][local34] & 0x4) != 0) {
					Static134.method2335(local34, Static254.aClass1_Sub16ArrayArrayArray3, false, local29, 1);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILclient!nm;)Lclient!le;")
	public static Class1_Sub5_Sub6_Sub1 method1491(@OriginalArg(0) int arg0, @OriginalArg(2) Class119 arg1) {
		return Static219.method3548(arg1, arg0) ? Static16.method241() : null;
	}
}
