import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!vl", name = "Q", descriptor = "Lclient!bi;")
	public static Class26 aClass26_30;

	@OriginalMember(owner = "client!vl", name = "X", descriptor = "[I")
	public static int[] anIntArray814;

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
	public static int anInt6352 = 1;

	@OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
	public static int anInt6357 = 0;

	@OriginalMember(owner = "client!vl", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString419 = "Select";

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "I")
	public static int anInt6358 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)V")
	public static void method5366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class142 local3 = new Class142();
		local3.anInt4243 = arg1 >> 7;
		local3.anInt4248 = arg2 >> 7;
		local3.anInt4251 = arg3 >> 7;
		local3.anInt4241 = arg4 >> 7;
		local3.anInt4259 = arg0;
		local3.anInt4249 = arg1;
		local3.anInt4262 = arg2;
		local3.anInt4253 = arg3;
		local3.anInt4263 = arg4;
		local3.anInt4254 = arg5;
		local3.anInt4242 = arg6;
		Static125.aClass142Array2[Static140.anInt3044++] = local3;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(Z)V")
	public static void method5367() {
		@Pc(5) Class103 local5 = Static299.aClass103_61;
		synchronized (Static299.aClass103_61) {
			Static299.aClass103_61.method2678();
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I")
	public static int method5369(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(14) Class7_Sub9 local14 = (Class7_Sub9) Static175.aClass10_32.method163((long) arg0);
		if (local14 == null) {
			return Static163.method3108(arg0).anInt6242;
		}
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = 0; local27 < local14.anIntArray262.length; local27++) {
			if (local14.anIntArray262[local27] == -1) {
				local25++;
			}
		}
		return local25 + Static163.method3108(arg0).anInt6242 - local14.anIntArray262.length;
	}

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "(I)V")
	public static void method5370() {
		if (Static118.method5346() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static233.anInt4634 - 4 & 0xFF);
		@Pc(21) int local21 = Static233.anInt4634 % Static15.anInt287;
		@Pc(26) int local26;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (local26 = 0; local26 < Static325.anInt6173; local26++) {
				Static301.aByteArrayArrayArray11[local23][local21][local26] = local17;
			}
		}
		if (Static168.anInt3508 == 3) {
			return;
		}
		for (local26 = 0; local26 < 2; local26++) {
			Static88.anIntArray550[local26] = -1000000;
			Static168.anIntArray473[local26] = 1000000;
			Static272.anIntArray689[local26] = 0;
			Static346.anIntArray831[local26] = 1000000;
			Static273.anIntArray692[local26] = 0;
		}
		@Pc(87) int local87;
		if (Static118.anInt6324 != 1) {
			local87 = Static341.method5540(Static168.anInt3508, Static24.anInt478, Static203.anInt4014);
			if (local87 - Static271.anInt5361 < 800 && (Static92.aByteArrayArrayArray3[Static168.anInt3508][Static203.anInt4014 >> 7][Static24.anInt478 >> 7] & 0x4) != 0) {
				Static348.method5582(Static24.anInt478 >> 7, 1, Static203.anInt4014 >> 7, Static229.aClass49ArrayArrayArray6, false);
				return;
			}
			return;
		}
		if ((Static92.aByteArrayArrayArray3[Static168.anInt3508][Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7][Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7] & 0x4) != 0) {
			Static348.method5582(Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7, 0, Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7, Static229.aClass49ArrayArrayArray6, false);
		}
		if (Static179.anInt3660 >= 2560) {
			return;
		}
		local87 = Static203.anInt4014 >> 7;
		@Pc(163) int local163 = Static24.anInt478 >> 7;
		@Pc(168) int local168 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7;
		@Pc(173) int local173 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7;
		@Pc(181) int local181;
		if (local168 > local87) {
			local181 = local168 - local87;
		} else {
			local181 = local87 - local168;
		}
		@Pc(195) int local195;
		if (local173 > local163) {
			local195 = local173 - local163;
		} else {
			local195 = local163 - local173;
		}
		if (local181 == 0 && local195 == 0 || local181 <= -Static15.anInt287 || local181 >= Static15.anInt287 || local195 <= -Static325.anInt6173 || Static325.anInt6173 <= local195) {
			Static46.method1056("RC: " + local87 + "," + local163 + " " + local168 + "," + local173 + " " + Static350.anInt6609 + "," + Static237.anInt4696, null);
			return;
		}
		@Pc(280) int local280;
		@Pc(282) int local282;
		if (local181 <= local195) {
			local280 = local181 * 65536 / local195;
			local282 = 32768;
			while (local163 != local173) {
				if (local163 < local173) {
					local163++;
				} else if (local173 < local163) {
					local163--;
				}
				if ((Static92.aByteArrayArrayArray3[Static168.anInt3508][local87][local163] & 0x4) != 0) {
					Static348.method5582(local163, 1, local87, Static229.aClass49ArrayArrayArray6, false);
					return;
				}
				local282 += local280;
				if (local282 >= 65536) {
					if (local87 < local168) {
						local87++;
					} else if (local168 < local87) {
						local87--;
					}
					local282 -= 65536;
					if ((Static92.aByteArrayArrayArray3[Static168.anInt3508][local87][local163] & 0x4) != 0) {
						Static348.method5582(local163, 1, local87, Static229.aClass49ArrayArrayArray6, false);
						return;
					}
				}
			}
			return;
		}
		local280 = local195 * 65536 / local181;
		local282 = 32768;
		while (local87 != local168) {
			if (local168 > local87) {
				local87++;
			} else if (local168 < local87) {
				local87--;
			}
			if ((Static92.aByteArrayArrayArray3[Static168.anInt3508][local87][local163] & 0x4) != 0) {
				Static348.method5582(local163, 1, local87, Static229.aClass49ArrayArrayArray6, false);
				return;
			}
			local282 += local280;
			if (local282 >= 65536) {
				if (local173 > local163) {
					local163++;
				} else if (local163 > local173) {
					local163--;
				}
				local282 -= 65536;
				if ((Static92.aByteArrayArrayArray3[Static168.anInt3508][local87][local163] & 0x4) != 0) {
					Static348.method5582(local163, 1, local87, Static229.aClass49ArrayArrayArray6, false);
					return;
				}
			}
		}
	}
}
