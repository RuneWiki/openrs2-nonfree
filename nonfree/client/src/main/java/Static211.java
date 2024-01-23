import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "Lclient!dj;")
	public static Class2_Sub8_Sub5_Sub1 aClass2_Sub8_Sub5_Sub1_2;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "Lclient!ih;")
	public static Class2_Sub16_Sub1 aClass2_Sub16_Sub1_2 = new Class2_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public static int anInt4324 = 0;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32 = null;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	public static void method3513() {
		if (Static293.method4501() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static80.anInt1910 - 4 & 0xFF);
		@Pc(24) int local24 = Static80.anInt1910 % 104;
		@Pc(26) int local26;
		@Pc(31) int local31;
		for (local26 = 0; local26 < 4; local26++) {
			for (local31 = 0; local31 < 104; local31++) {
				Static242.aByteArrayArrayArray19[local26][local24][local31] = local20;
			}
		}
		if (Static32.anInt876 == 3) {
			return;
		}
		for (local26 = 0; local26 < 2; local26++) {
			Static9.anIntArray301[local26] = -1000000;
			Static173.anIntArray374[local26] = 1000000;
			Static108.anIntArray215[local26] = 0;
			Static232.anIntArray459[local26] = 1000000;
			Static154.anIntArray350[local26] = 0;
		}
		if (Static16.anInt342 != 1) {
			local26 = Static234.method3798(Static192.anInt4017, Static80.anInt1911, Static32.anInt876);
			if (local26 - Static162.anInt3612 < 800 && (Static13.aByteArrayArrayArray2[Static32.anInt876][Static80.anInt1911 >> 7][Static192.anInt4017 >> 7] & 0x4) != 0) {
				Static225.method4283(1, Static52.aClass2_Sub13ArrayArrayArray1, Static80.anInt1911 >> 7, false, Static192.anInt4017 >> 7);
			}
			return;
		}
		if ((Static13.aByteArrayArrayArray2[Static32.anInt876][Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7][Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7] & 0x4) != 0) {
			Static225.method4283(0, Static52.aClass2_Sub13ArrayArrayArray1, Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7, false, Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7);
		}
		if (Static295.anInt5738 >= 310) {
			return;
		}
		local26 = Static80.anInt1911 >> 7;
		@Pc(181) int local181 = Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7;
		@Pc(186) int local186 = Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7;
		@Pc(198) int local198;
		if (local186 > local26) {
			local198 = local186 - local26;
		} else {
			local198 = local26 - local186;
		}
		local31 = Static192.anInt4017 >> 7;
		@Pc(217) int local217;
		if (local181 > local31) {
			local217 = local181 - local31;
		} else {
			local217 = local31 - local181;
		}
		if (local198 == 0 && local217 == 0 || local198 <= -104 || local198 >= 104 || local217 <= -104 || local217 >= 104) {
			Static183.method3240(null, "RC: " + local26 + "," + local31 + " " + local186 + "," + local181 + " " + Static160.anInt5159 + "," + Static234.anInt4705);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local198 > local217) {
			local295 = local217 * 65536 / local198;
			local297 = 32768;
			while (local26 != local186) {
				if (local186 > local26) {
					local26++;
				} else if (local186 < local26) {
					local26--;
				}
				if ((Static13.aByteArrayArrayArray2[Static32.anInt876][local26][local31] & 0x4) != 0) {
					Static225.method4283(1, Static52.aClass2_Sub13ArrayArrayArray1, local26, false, local31);
					break;
				}
				local297 += local295;
				if (local297 >= 65536) {
					if (local31 < local181) {
						local31++;
					} else if (local181 < local31) {
						local31--;
					}
					local297 -= 65536;
					if ((Static13.aByteArrayArrayArray2[Static32.anInt876][local26][local31] & 0x4) != 0) {
						Static225.method4283(1, Static52.aClass2_Sub13ArrayArrayArray1, local26, false, local31);
						break;
					}
				}
			}
			return;
		}
		local295 = local198 * 65536 / local217;
		local297 = 32768;
		while (local181 != local31) {
			if (local181 > local31) {
				local31++;
			} else if (local181 < local31) {
				local31--;
			}
			if ((Static13.aByteArrayArrayArray2[Static32.anInt876][local26][local31] & 0x4) != 0) {
				Static225.method4283(1, Static52.aClass2_Sub13ArrayArrayArray1, local26, false, local31);
				break;
			}
			local297 += local295;
			if (local297 >= 65536) {
				local297 -= 65536;
				if (local26 < local186) {
					local26++;
				} else if (local186 < local26) {
					local26--;
				}
				if ((Static13.aByteArrayArrayArray2[Static32.anInt876][local26][local31] & 0x4) != 0) {
					Static225.method4283(1, Static52.aClass2_Sub13ArrayArrayArray1, local26, false, local31);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V")
	public static void method3515(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static52.aClass2_Sub13ArrayArrayArray1 = Static136.aClass2_Sub13ArrayArrayArray3;
			Static9.anIntArrayArrayArray7 = Static85.anIntArrayArrayArray4;
			Static247.aClass2_Sub32ArrayArray2 = Static89.aClass2_Sub32ArrayArray3;
		} else {
			Static52.aClass2_Sub13ArrayArrayArray1 = Static86.aClass2_Sub13ArrayArrayArray2;
			Static9.anIntArrayArrayArray7 = Static300.anIntArrayArrayArray15;
			Static247.aClass2_Sub32ArrayArray2 = Static296.aClass2_Sub32ArrayArray4;
		}
		Static46.anInt1155 = Static52.aClass2_Sub13ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	public static void method3516(@OriginalArg(0) int arg0) {
		Static68.anInt1741--;
		if (Static68.anInt1741 == arg0) {
			return;
		}
		Static323.method3556(Static56.aStringArray8, arg0 + 1, Static56.aStringArray8, arg0, Static68.anInt1741 - arg0);
		Static323.method3556(Static175.aStringArray28, arg0 + 1, Static175.aStringArray28, arg0, Static68.anInt1741 - arg0);
		Static323.method3550(Static131.anIntArray297, arg0 + 1, Static131.anIntArray297, arg0, Static68.anInt1741 - arg0);
		Static323.method3555(Static290.aShortArray85, arg0 + 1, Static290.aShortArray85, arg0, Static68.anInt1741 - arg0);
		Static323.method3551(Static166.aLongArray4, arg0 + 1, Static166.aLongArray4, arg0, Static68.anInt1741 - arg0);
		Static323.method3550(Static67.anIntArray144, arg0 + 1, Static67.anIntArray144, arg0, Static68.anInt1741 - arg0);
		Static323.method3550(Static56.anIntArray123, arg0 + 1, Static56.anIntArray123, arg0, Static68.anInt1741 - arg0);
	}
}
