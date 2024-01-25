import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!kv", name = "J", descriptor = "I")
	public static int anInt4042 = 0;

	@OriginalMember(owner = "client!kv", name = "K", descriptor = "I")
	public static int anInt4043 = 1;

	@OriginalMember(owner = "client!kv", name = "P", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_83 = new Class83("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "(B)V")
	public static void method3275() {
		Static299.method4087(false);
		Static100.anInt2020 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static386.aByteArrayArray15.length; local14++) {
			if (Static225.anIntArray291[local14] != -1 && Static386.aByteArrayArray15[local14] == null) {
				Static386.aByteArrayArray15[local14] = Static49.aClass76_27.method2104(0, Static225.anIntArray291[local14]);
				if (Static386.aByteArrayArray15[local14] == null) {
					Static100.anInt2020++;
					local12 = false;
				}
			}
			if (Static346.anIntArray418[local14] != -1 && Static247.aByteArrayArray16[local14] == null) {
				Static247.aByteArrayArray16[local14] = Static49.aClass76_27.method2121(Static346.anIntArray418[local14], 0, Static376.anIntArrayArray50[local14]);
				if (Static247.aByteArrayArray16[local14] == null) {
					Static100.anInt2020++;
					local12 = false;
				}
			}
			if (Static95.anIntArray155[local14] != -1 && Static435.aByteArrayArray30[local14] == null) {
				Static435.aByteArrayArray30[local14] = Static49.aClass76_27.method2104(0, Static95.anIntArray155[local14]);
				if (Static435.aByteArrayArray30[local14] == null) {
					Static100.anInt2020++;
					local12 = false;
				}
			}
			if (Static189.anIntArray236[local14] != -1 && Static193.aByteArrayArray13[local14] == null) {
				Static193.aByteArrayArray13[local14] = Static49.aClass76_27.method2104(0, Static189.anIntArray236[local14]);
				if (Static193.aByteArrayArray13[local14] == null) {
					Static100.anInt2020++;
					local12 = false;
				}
			}
			if (Static175.anIntArray222 != null && Static34.aByteArrayArray1[local14] == null && Static175.anIntArray222[local14] != -1) {
				Static34.aByteArrayArray1[local14] = Static49.aClass76_27.method2121(Static175.anIntArray222[local14], 0, Static376.anIntArrayArray50[local14]);
				if (Static34.aByteArrayArray1[local14] == null) {
					Static100.anInt2020++;
					local12 = false;
				}
			}
		}
		if (Static292.aClass195_2 == null) {
			if (Static197.aClass4_Sub1_Sub5_2 == null || !Static163.aClass76_39.method2107(Static197.aClass4_Sub1_Sub5_2.aString16 + "_staticelements")) {
				Static292.aClass195_2 = new Class195(0);
			} else if (Static163.aClass76_39.method2103(Static197.aClass4_Sub1_Sub5_2.aString16 + "_staticelements")) {
				Static292.aClass195_2 = Static380.method5018(Static163.aClass76_39, Static197.aClass4_Sub1_Sub5_2.aString16 + "_staticelements", Static325.aBoolean506);
			} else {
				local12 = false;
				Static100.anInt2020++;
			}
		}
		if (!local12) {
			Static51.anInt883 = 1;
			return;
		}
		local12 = true;
		Static275.anInt5144 = 0;
		@Pc(266) int local266;
		@Pc(276) int local276;
		for (@Pc(248) int local248 = 0; local248 < Static386.aByteArrayArray15.length; local248++) {
			@Pc(254) byte[] local254 = Static247.aByteArrayArray16[local248];
			if (local254 != null) {
				local266 = (Static308.anIntArray372[local248] >> 8) * 64 - Static180.anInt3453;
				local276 = (Static308.anIntArray372[local248] & 0xFF) * 64 - Static86.anInt1771;
				if (Static448.anInt7307 != 0) {
					local266 = 10;
					local276 = 10;
				}
				local12 &= Static361.method4871(Static326.anInt5666, local266, Static283.anInt5187, local254, local276);
			}
			local254 = Static193.aByteArrayArray13[local248];
			if (local254 != null) {
				local266 = (Static308.anIntArray372[local248] >> 8) * 64 - Static180.anInt3453;
				local276 = (Static308.anIntArray372[local248] & 0xFF) * 64 - Static86.anInt1771;
				if (Static448.anInt7307 != 0) {
					local266 = 10;
					local276 = 10;
				}
				local12 &= Static361.method4871(Static326.anInt5666, local266, Static283.anInt5187, local254, local276);
			}
		}
		if (!local12) {
			Static51.anInt883 = 2;
			return;
		}
		if (Static51.anInt883 != 0) {
			Static436.method5519(true, Static439.aClass83_148.method2267(Static178.anInt3423) + "<br>(100%)", Static207.aClass46_9);
		}
		Static159.method2701();
		Static409.method5485();
		@Pc(386) boolean local386 = false;
		if (Static122.aClass19_16.method4261() && Static323.aClass50_Sub1_1.aBoolean294) {
			for (local266 = 0; local266 < Static386.aByteArrayArray15.length; local266++) {
				if (Static193.aByteArrayArray13[local266] != null || Static435.aByteArrayArray30[local266] != null) {
					local386 = true;
					break;
				}
			}
		}
		if (Static323.aClass50_Sub1_1.aBoolean298) {
			local266 = Static149.anIntArray189[Static140.anInt2845];
		} else {
			local266 = Static164.anIntArray302[Static140.anInt2845];
		}
		if (Static122.aClass19_16.method4286()) {
			local266++;
		}
		Static253.method3677(Static326.anInt5666, Static283.anInt5187, local266, local386, Static122.aClass19_16.method4260() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static175.aClass213Array1[local276].method4851();
		}
		Static241.method3555();
		Static388.method5094(false);
		Static265.method3816();
		Static10.aClass242_1 = null;
		Static159.method2701();
		System.gc();
		Static299.method4087(true);
		Static261.method3788();
		Static63.anInt1262 = Static323.aClass50_Sub1_1.method2850(Static177.anInt2973);
		Static41.aBoolean75 = Static70.anInt1503 >= 96;
		Static321.aBoolean498 = Static323.aClass50_Sub1_1.aBoolean294;
		Static242.aBoolean418 = Static323.aClass50_Sub1_1.method2854(Static177.anInt2973);
		Static147.aBoolean263 = !Static323.aClass50_Sub1_1.aBoolean293;
		Static259.anInt4877 = Static323.aClass50_Sub1_1.method2861(Static177.anInt2973) ? -1 : Static317.anInt5523;
		Static436.aBoolean667 = Static323.aClass50_Sub1_1.aBoolean307;
		Static54.aBoolean93 = Static177.anInt2973 == 1 || Static323.aClass50_Sub1_1.aBoolean289;
		Static67.aClass266_Sub1_1 = new Class266_Sub1(4, Static326.anInt5666, Static283.anInt5187, false);
		if (Static448.anInt7307 == 0) {
			Static235.method3523(Static67.aClass266_Sub1_1, Static386.aByteArrayArray15);
		} else {
			Static259.method3757(Static67.aClass266_Sub1_1, Static386.aByteArrayArray15);
		}
		Static7.method4194(Static326.anInt5666 >> 4, Static283.anInt5187 >> 4);
		Static248.method3623();
		if (local386) {
			Static86.method1547(true);
			Static143.aClass266_Sub1_2 = new Class266_Sub1(1, Static326.anInt5666, Static283.anInt5187, true);
			if (Static448.anInt7307 == 0) {
				Static235.method3523(Static143.aClass266_Sub1_2, Static435.aByteArrayArray30);
				Static299.method4087(true);
			} else {
				Static259.method3757(Static143.aClass266_Sub1_2, Static435.aByteArrayArray30);
				Static299.method4087(true);
			}
			Static143.aClass266_Sub1_2.method5633(Static67.aClass266_Sub1_1.anIntArrayArrayArray15[0]);
			Static143.aClass266_Sub1_2.method5635(null, null, Static122.aClass19_16);
			Static86.method1547(false);
		}
		Static67.aClass266_Sub1_1.method5635(local386 ? Static143.aClass266_Sub1_2.anIntArrayArrayArray15 : null, Static175.aClass213Array1, Static122.aClass19_16);
		if (Static448.anInt7307 == 0) {
			Static299.method4087(true);
			Static344.method4655(Static67.aClass266_Sub1_1, Static247.aByteArrayArray16);
			if (Static34.aByteArrayArray1 != null) {
				Static194.method3044();
			}
		} else {
			Static299.method4087(true);
			Static390.method4993(Static67.aClass266_Sub1_1, Static247.aByteArrayArray16);
		}
		Static409.method5485();
		Static299.method4087(true);
		Static67.aClass266_Sub1_1.method5636(null, local386 ? Static285.aClass65Array3[0] : null, Static122.aClass19_16);
		Static67.aClass266_Sub1_1.method5651(Static122.aClass19_16);
		Static299.method4087(true);
		if (local386) {
			Static86.method1547(true);
			Static299.method4087(true);
			if (Static448.anInt7307 == 0) {
				Static344.method4655(Static143.aClass266_Sub1_2, Static193.aByteArrayArray13);
			} else {
				Static390.method4993(Static143.aClass266_Sub1_2, Static193.aByteArrayArray13);
			}
			Static409.method5485();
			Static299.method4087(true);
			Static143.aClass266_Sub1_2.method5636(Static67.aClass65Array1[0], null, Static122.aClass19_16);
			Static143.aClass266_Sub1_2.method5651(Static122.aClass19_16);
			Static299.method4087(true);
			Static86.method1547(false);
		}
		Static270.method3866();
		@Pc(729) int local729 = Static67.aClass266_Sub1_1.anInt7311;
		if (local729 > Static263.anInt4963) {
			local729 = Static263.anInt4963;
		}
		if (Static263.anInt4963 - 1 > local729) {
			local729 = Static263.anInt4963 - 1;
		}
		if (Static323.aClass50_Sub1_1.method2861(Static177.anInt2973)) {
			Static276.method882(0);
		} else {
			Static276.method882(local729);
		}
		@Pc(766) int local766;
		@Pc(770) int local770;
		for (@Pc(762) int local762 = 0; local762 < 4; local762++) {
			for (local766 = 0; local766 < Static326.anInt5666; local766++) {
				for (local770 = 0; local770 < Static283.anInt5187; local770++) {
					Static443.method5595(local762, local766, local770);
				}
			}
		}
		Static215.method3238();
		Static159.method2701();
		Static1.method1();
		Static409.method5485();
		Static199.aBoolean362 = false;
		Static317.method4231();
		if (Static226.aFrame1 != null && Static125.aClass11_5 != null && Static403.anInt6667 == 25) {
			Static429.method5476(Static427.aClass215_94);
			Static3.aClass4_Sub12_Sub1_5.method2531(1057001181);
		}
		if (Static448.anInt7307 == 0) {
			local766 = (Static169.anInt3265 - (Static326.anInt5666 >> 4)) / 8;
			local770 = (Static169.anInt3265 + (Static326.anInt5666 >> 4)) / 8;
			@Pc(856) int local856 = (Static453.anInt7373 - (Static283.anInt5187 >> 4)) / 8;
			@Pc(864) int local864 = (Static453.anInt7373 + (Static283.anInt5187 >> 4)) / 8;
			for (@Pc(868) int local868 = local766 - 1; local868 <= local770 + 1; local868++) {
				for (@Pc(874) int local874 = local856 - 1; local874 <= local864 + 1; local874++) {
					if (local766 > local868 || local770 < local868 || local874 < local856 || local864 < local874) {
						Static49.aClass76_27.method2126("m" + local868 + "_" + local874);
						Static49.aClass76_27.method2126("l" + local868 + "_" + local874);
					}
				}
			}
		}
		if (Static403.anInt6667 == 28) {
			Static187.method2932(10);
		} else {
			Static187.method2932(30);
			if (Static125.aClass11_5 != null) {
				Static429.method5476(Static412.aClass215_90);
			}
		}
		Static126.method2262();
		Static159.method2701();
		Static252.method3660();
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II[Lclient!uu;IIZ)V")
	public static void method3278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class247[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		for (@Pc(8) int local8 = 0; local8 < arg2.length; local8++) {
			@Pc(14) Class247 local14 = arg2[local8];
			if (local14 != null && local14.anInt6850 == arg3) {
				Static43.method5658(arg4, arg0, local14, arg1);
				Static309.method4160(local14, arg0, arg1);
				if (local14.anInt6825 > local14.anInt6821 - local14.anInt6833) {
					local14.anInt6825 = local14.anInt6821 - local14.anInt6833;
				}
				if (local14.anInt6825 < 0) {
					local14.anInt6825 = 0;
				}
				if (local14.anInt6849 > local14.anInt6834 - local14.anInt6805) {
					local14.anInt6849 = local14.anInt6834 - local14.anInt6805;
				}
				if (local14.anInt6849 < 0) {
					local14.anInt6849 = 0;
				}
				if (local14.anInt6840 == 0) {
					Static374.method4998(local14, arg4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)I")
	public static int method3279() {
		return Static216.anInt4008;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IC)Z")
	public static boolean method3280(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZIZ)V")
	public static void method3281(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static50.anInt855--;
			if (Static50.anInt855 == 0) {
				Static72.anIntArray115 = null;
			}
		}
		if (arg0) {
			Static186.anInt3550--;
			if (Static186.anInt3550 == 0) {
				Static335.anIntArray423 = null;
			}
		}
	}
}
