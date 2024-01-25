import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
	public static int anInt4431;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_194 = new Class22(8, -2);

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
	public static int anInt4424 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ga;ILclient!ya;)V")
	public static void method3465(@OriginalArg(0) Interface7 arg0, @OriginalArg(2) Class19 arg1) {
		if (Static148.aClass4_Sub1_Sub5_3 == null) {
			return;
		}
		if (Static69.anInt3429 < 10) {
			if (!Static148.aClass76_73.method2103(Static148.aClass4_Sub1_Sub5_3.aString16)) {
				Static69.anInt3429 = Static163.aClass76_39.method2113(Static148.aClass4_Sub1_Sub5_3.aString16) / 10;
				return;
			}
			Static424.method5412();
			Static69.anInt3429 = 10;
		}
		if (Static69.anInt3429 == 10) {
			Static148.anInt5732 = Static148.aClass4_Sub1_Sub5_3.anInt1010 >> 6 << 6;
			Static148.anInt5724 = Static148.aClass4_Sub1_Sub5_3.anInt1018 >> 6 << 6;
			Static148.anInt5729 = (Static148.aClass4_Sub1_Sub5_3.anInt1014 >> 6 << 6) + 64 - Static148.anInt5732;
			Static148.anInt5733 = (Static148.aClass4_Sub1_Sub5_3.anInt1019 >> 6 << 6) + 64 - Static148.anInt5724;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static148.aClass4_Sub1_Sub5_3.method935(local74, Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7) + Static86.anInt1771, Static180.anInt3453 - -(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7))) {
				local76 = local74[1] - Static148.anInt5732;
				local78 = local74[2] - Static148.anInt5724;
			}
			if (!Static58.aBoolean98 && local76 >= 0 && Static148.anInt5729 > local76 && local78 >= 0 && Static148.anInt5733 > local78) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static314.anInt5471 = local76;
				Static46.anInt5156 = local78;
			} else if (Static303.anInt5361 == -1 || Static80.anInt1620 == -1) {
				Static148.aClass4_Sub1_Sub5_3.method931(local74, Static148.aClass4_Sub1_Sub5_3.anInt1023 & 0x3FFF, Static148.aClass4_Sub1_Sub5_3.anInt1023 >> 14 & 0x3FFF);
				Static46.anInt5156 = local74[2] - Static148.anInt5724;
				Static314.anInt5471 = local74[1] - Static148.anInt5732;
			} else {
				Static148.aClass4_Sub1_Sub5_3.method931(local74, Static80.anInt1620, Static303.anInt5361);
				if (local74 != null) {
					Static314.anInt5471 = local74[1] - Static148.anInt5732;
					Static46.anInt5156 = local74[2] - Static148.anInt5724;
				}
				Static58.aBoolean98 = false;
				Static80.anInt1620 = -1;
				Static303.anInt5361 = -1;
			}
			if (Static148.aClass4_Sub1_Sub5_3.anInt1016 == 37) {
				Static148.aFloat178 = 3.0F;
				Static148.aFloat179 = 3.0F;
			} else if (Static148.aClass4_Sub1_Sub5_3.anInt1016 == 50) {
				Static148.aFloat178 = 4.0F;
				Static148.aFloat179 = 4.0F;
			} else if (Static148.aClass4_Sub1_Sub5_3.anInt1016 == 75) {
				Static148.aFloat178 = 6.0F;
				Static148.aFloat179 = 6.0F;
			} else if (Static148.aClass4_Sub1_Sub5_3.anInt1016 == 100) {
				Static148.aFloat178 = 8.0F;
				Static148.aFloat179 = 8.0F;
			} else if (Static148.aClass4_Sub1_Sub5_3.anInt1016 == 200) {
				Static148.aFloat178 = 16.0F;
				Static148.aFloat179 = 16.0F;
			} else {
				Static148.aFloat178 = 8.0F;
				Static148.aFloat179 = 8.0F;
			}
			Static148.anInt5720 = (int) Static148.aFloat178 >> 1;
			Static148.aByteArrayArrayArray5 = Static449.method5655(Static148.anInt5720);
			Static394.method5160();
			Static148.method4502();
			Static378.aClass183_29 = new Class183();
			Static148.anInt5719 += (int) (Math.random() * 5.0D) - 2;
			if (Static148.anInt5719 < -8) {
				Static148.anInt5719 = -8;
			}
			Static148.anInt5721 += (int) (Math.random() * 5.0D) - 2;
			if (Static148.anInt5719 > 8) {
				Static148.anInt5719 = 8;
			}
			if (Static148.anInt5721 < -16) {
				Static148.anInt5721 = -16;
			}
			if (Static148.anInt5721 > 16) {
				Static148.anInt5721 = 16;
			}
			Static148.method4512(arg0, Static148.anInt5719 >> 2 << 10, Static148.anInt5721 >> 1);
			Static148.aClass182_3.method4131(256, 1024);
			Static148.aClass265_4.method5591(256, 256);
			Static148.aClass262_3.method5565(4096);
			Static26.aClass26_1.method646(256);
			Static69.anInt3429 = 20;
		} else if (Static69.anInt3429 == 20) {
			Static299.method4087(true);
			Static148.method4498(arg1, Static148.anInt5719, Static148.anInt5721);
			Static69.anInt3429 = 60;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 60) {
			if (Static148.aClass76_73.method2107(Static148.aClass4_Sub1_Sub5_3.aString16 + "_staticelements")) {
				if (!Static148.aClass76_73.method2103(Static148.aClass4_Sub1_Sub5_3.aString16 + "_staticelements")) {
					return;
				}
				Static148.aClass195_3 = Static380.method5018(Static148.aClass76_73, Static148.aClass4_Sub1_Sub5_3.aString16 + "_staticelements", Static325.aBoolean506);
			} else {
				Static148.aClass195_3 = new Class195(0);
			}
			Static148.method4503();
			Static69.anInt3429 = 70;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 70) {
			Static258.aClass212_6 = new Class212(arg1, 11, true, Static273.aCanvas5);
			Static69.anInt3429 = 73;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 73) {
			Static373.aClass212_8 = new Class212(arg1, 12, true, Static273.aCanvas5);
			Static69.anInt3429 = 76;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 76) {
			Static239.aClass212_5 = new Class212(arg1, 14, true, Static273.aCanvas5);
			Static69.anInt3429 = 79;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 79) {
			Static108.aClass212_3 = new Class212(arg1, 17, true, Static273.aCanvas5);
			Static69.anInt3429 = 82;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 82) {
			Static262.aClass212_7 = new Class212(arg1, 19, true, Static273.aCanvas5);
			Static69.anInt3429 = 85;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 85) {
			Static81.aClass212_2 = new Class212(arg1, 22, true, Static273.aCanvas5);
			Static69.anInt3429 = 88;
			Static299.method4087(true);
			Static252.method3660();
		} else if (Static69.anInt3429 == 88) {
			Static58.aClass212_1 = new Class212(arg1, 26, true, Static273.aCanvas5);
			Static69.anInt3429 = 91;
			Static299.method4087(true);
			Static252.method3660();
		} else {
			Static117.aClass212_4 = new Class212(arg1, 30, true, Static273.aCanvas5);
			Static69.anInt3429 = 100;
			Static299.method4087(true);
			Static252.method3660();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)Z")
	public static boolean method3468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static72.method1353(arg0, arg1) | Static183.method2904(arg0, arg1)) & Static49.method2002(arg1, arg0);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)V")
	public static void method3470() {
		Static448.anInt7307 = 0;
		@Pc(11) int local11 = Static146.aClass4_Sub12_Sub1_3.method2489();
		@Pc(15) int local15 = Static146.aClass4_Sub12_Sub1_3.method2548();
		@Pc(19) int local19 = Static146.aClass4_Sub12_Sub1_3.method2515();
		@Pc(30) boolean local30 = Static146.aClass4_Sub12_Sub1_3.method2520() == 1;
		Static263.method3809(local11);
		@Pc(41) int local41 = (Static454.anInt4075 - Static146.aClass4_Sub12_Sub1_3.anInt2997) / 16;
		Static376.anIntArrayArray50 = new int[local41][4];
		@Pc(51) int local51;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static376.anIntArrayArray50[local47][local51] = Static146.aClass4_Sub12_Sub1_3.method2529();
			}
		}
		Static247.aByteArrayArray16 = new byte[local41][];
		Static346.anIntArray418 = new int[local41];
		Static95.anIntArray155 = new int[local41];
		Static435.aByteArrayArray30 = new byte[local41][];
		Static308.anIntArray372 = new int[local41];
		Static225.anIntArray291 = new int[local41];
		Static386.aByteArrayArray15 = new byte[local41][];
		Static34.aByteArrayArray1 = null;
		Static189.anIntArray236 = new int[local41];
		Static193.aByteArrayArray13 = new byte[local41][];
		Static175.anIntArray222 = null;
		local41 = 0;
		for (local51 = (local15 - (Static326.anInt5666 >> 4)) / 8; local51 <= ((Static326.anInt5666 >> 4) + local15) / 8; local51++) {
			for (@Pc(122) int local122 = (local19 - (Static283.anInt5187 >> 4)) / 8; local122 <= ((Static283.anInt5187 >> 4) + local19) / 8; local122++) {
				Static308.anIntArray372[local41] = local122 + (local51 << 8);
				Static225.anIntArray291[local41] = Static49.aClass76_27.method2099("m" + local51 + "_" + local122);
				Static346.anIntArray418[local41] = Static49.aClass76_27.method2099("l" + local51 + "_" + local122);
				Static95.anIntArray155[local41] = Static49.aClass76_27.method2099("um" + local51 + "_" + local122);
				Static189.anIntArray236[local41] = Static49.aClass76_27.method2099("ul" + local51 + "_" + local122);
				local41++;
			}
		}
		Static311.method4167(false, local19, local15, local30);
	}
}
