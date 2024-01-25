import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public static void method2767() {
		if (Static268.aString131.toLowerCase().indexOf("microsoft") != -1) {
			Static564.anIntArray565[190] = 72;
			Static564.anIntArray565[188] = 71;
			Static564.anIntArray565[222] = 59;
			Static564.anIntArray565[219] = 42;
			Static564.anIntArray565[186] = 57;
			Static564.anIntArray565[192] = 58;
			Static564.anIntArray565[221] = 43;
			Static564.anIntArray565[187] = 27;
			Static564.anIntArray565[191] = 73;
			Static564.anIntArray565[223] = 28;
			Static564.anIntArray565[220] = 74;
			Static564.anIntArray565[189] = 26;
			return;
		}
		Static564.anIntArray565[47] = 73;
		Static564.anIntArray565[61] = 27;
		Static564.anIntArray565[44] = 71;
		Static564.anIntArray565[46] = 72;
		Static564.anIntArray565[93] = 43;
		if (Static268.aMethod2 == null) {
			Static564.anIntArray565[192] = 58;
			Static564.anIntArray565[222] = 59;
		} else {
			Static564.anIntArray565[520] = 59;
			Static564.anIntArray565[222] = 58;
			Static564.anIntArray565[192] = 28;
		}
		Static564.anIntArray565[91] = 42;
		Static564.anIntArray565[45] = 26;
		Static564.anIntArray565[59] = 57;
		Static564.anIntArray565[92] = 74;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(III)V")
	public static void method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static530.anInt9251 != 0) {
			if (arg0 < 0) {
				for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
					Static338.anIntArray341[local18] = arg1;
				}
			} else {
				Static338.anIntArray341[arg0] = arg1;
			}
		}
		Static548.aClass3_Sub16_Sub3_4.method6100(arg1, arg0);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIZIIIII)V")
	public static void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static348.aClass3_Sub51_Sub1_5.anInt9949 != 0 && arg2 != 0 && Static345.anInt6219 < 50 && arg0 != -1) {
			Static73.aClass367Array4[Static345.anInt6219++] = new Class367((byte) 2, arg0, arg2, arg3, arg5, arg1, arg4, null);
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(III)V")
	public static void method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class333 local7 = Static189.aClass333ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static478.method6527(local7.aClass25_Sub2_Sub1_2);
		Static478.method6527(local7.aClass25_Sub2_Sub1_1);
		if (local7.aClass25_Sub2_Sub1_2 != null) {
			local7.aClass25_Sub2_Sub1_2 = null;
		}
		if (local7.aClass25_Sub2_Sub1_1 != null) {
			local7.aClass25_Sub2_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!sp;ZI)V")
	public static void method2772(@OriginalArg(0) Class25_Sub2_Sub2_Sub5_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Static161.anInt3613 >= 400) {
			return;
		}
		@Pc(14) Class213 local14 = arg0.aClass213_1;
		if (local14.anIntArray345 != null) {
			local14 = local14.method4998(Static206.aClass143_3);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean443) {
			return;
		}
		@Pc(32) String local32 = local14.aString160;
		if (local14.lb != 0) {
			@Pc(48) String local48 = Static40.aClass89_2 == Static31.aClass89_1 ? Static573.aClass350_34.method7730(Static201.anInt4321) : Static573.aClass350_32.method7730(Static201.anInt4321);
			local32 = local32 + Static239.method3810(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167, local14.lb) + " (" + local48 + local14.lb + ")";
		}
		if (Static253.aBoolean325 && !arg1) {
			@Pc(86) Class41 local86 = Static191.anInt4131 == -1 ? null : Static106.aClass27_1.method483(Static191.anInt4131);
			if ((Static182.anInt3987 & 0x2) != 0 && (local86 == null || local14.method5005(Static191.anInt4131, local86.anInt1311) != local86.anInt1311)) {
				Static367.method5215(0, -1, Static421.aString201, Static238.aString114 + " -> <col=ffff00>" + local32, true, 45, false, (long) arg0.anInt8529, 0, Static455.anInt7961);
			}
		}
		if (!arg1) {
			@Pc(133) String[] local133 = local14.aStringArray28;
			if (Static295.aBoolean377) {
				local133 = Static169.method3025(local133);
			}
			@Pc(143) int local143;
			if (local133 != null) {
				for (local143 = 4; local143 >= 0; local143--) {
					if (local133[local143] != null && (local14.aByte77 == 0 || !local133[local143].equalsIgnoreCase(Static573.aClass350_27.method7730(Static201.anInt4321)))) {
						@Pc(166) byte local166 = 0;
						@Pc(168) int local168 = Static473.anInt8220;
						if (local143 == 0) {
							local166 = 25;
						}
						if (local143 == 1) {
							local166 = 4;
						}
						if (local143 == 2) {
							local166 = 60;
						}
						if (local143 == 3) {
							local166 = 2;
						}
						if (local14.anInt6191 == local143) {
							local168 = local14.anInt6216;
						}
						if (local143 == 4) {
							local166 = 46;
						}
						if (local14.anInt6179 == local143) {
							local168 = local14.anInt6180;
						}
						Static367.method5215(0, -1, local133[local143], "<col=ffff00>" + local32, true, local166, false, (long) arg0.anInt8529, 0, local133[local143].equalsIgnoreCase(Static573.aClass350_27.method7730(Static201.anInt4321)) ? local14.anInt6184 : local168);
					}
				}
			}
			if (local14.aByte77 == 1 && local133 != null) {
				for (local143 = 4; local143 >= 0; local143--) {
					if (local133[local143] != null && local133[local143].equalsIgnoreCase(Static573.aClass350_27.method7730(Static201.anInt4321))) {
						@Pc(280) short local280 = 0;
						if (local14.lb > Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167) {
							local280 = 2000;
						}
						@Pc(293) short local293 = 0;
						if (local143 == 0) {
							local293 = 25;
						}
						if (local143 == 1) {
							local293 = 4;
						}
						if (local143 == 2) {
							local293 = 60;
						}
						if (local143 == 3) {
							local293 = 2;
						}
						if (local143 == 4) {
							local293 = 46;
						}
						if (local293 != 0) {
							local293 += local280;
						}
						Static367.method5215(0, -1, local133[local143], "<col=ffff00>" + local32, true, local293, false, (long) arg0.anInt8529, 0, local14.anInt6184);
					}
				}
			}
		}
		Static367.method5215(0, -1, Static573.aClass350_26.method7730(Static201.anInt4321), "<col=ffff00>" + local32, true, 1012, arg1, (long) arg0.anInt8529, 0, Static496.anInt8607);
	}
}
