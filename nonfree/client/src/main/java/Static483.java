import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	public static int anInt8361;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "Lclient!qk;")
	public static Class3_Sub16_Sub3 aClass3_Sub16_Sub3_2;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "[Lclient!tb;")
	public static Class311[] aClass311Array1;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "Lclient!or;")
	public static final Class244 aClass244_60 = new Class244();

	@OriginalMember(owner = "client!se", name = "p", descriptor = "S")
	public static short aShort105 = 32767;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!kt;Lclient!ps;IILclient!r;Lclient!vca;)V")
	public static void method6563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub33 arg2, @OriginalArg(3) Class262 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class31 arg5, @OriginalArg(7) Class338 arg6) {
		@Pc(15) int local15 = arg2.anInt5489 - arg4 / 2 - 5;
		@Pc(19) int local19 = arg1 + 2;
		if (arg6.anInt9719 != 0) {
			arg5.method8094(local19, local15, arg1 + arg0 * arg3.method5833() + 1 - local19, arg4 + 10, arg6.anInt9719);
		}
		if (arg6.anInt9721 != 0) {
			arg5.method8084(arg6.anInt9721, arg3.method5833() * arg0 + arg1 + 1 - local19, arg4 - -10, local15, local19);
		}
		@Pc(72) int local72 = arg6.anInt9736;
		if (arg2.aBoolean376 && arg6.anInt9725 != -1) {
			local72 = arg6.anInt9725;
		}
		for (@Pc(89) int local89 = 0; local89 < arg0; local89++) {
			@Pc(95) String local95 = Static243.aStringArray43[local89];
			if (local89 < arg0 - 1) {
				local95 = local95.substring(0, local95.length() - 4);
			}
			arg3.method5837(arg5, local95, arg2.anInt5489, arg1, local72);
			arg1 += arg3.method5833();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)V")
	public static void method6564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) int local21 = Static35.aClass328_1.method7371(Static573.aClass350_28.method7730(Static201.anInt4321));
		@Pc(32) int local32;
		for (@Pc(26) Class3_Sub13 local26 = (Class3_Sub13) Static260.aClass244_40.method5572(); local26 != null; local26 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
			local32 = Static424.method7515(local26);
			if (local21 < local32) {
				local21 = local32;
			}
		}
		local21 += 8;
		local32 = Static161.anInt3613 * 16 + 21;
		@Pc(62) int local62 = arg1 - local21 / 2;
		if (local62 + local21 > Static34.anInt3201) {
			local62 = Static34.anInt3201 - local21;
		}
		if (local62 < 0) {
			local62 = 0;
		}
		@Pc(85) int local85 = arg0;
		if (arg0 + local32 > Static492.anInt8445) {
			local85 = Static492.anInt8445 - local32;
		}
		Static89.anInt2311 = local62;
		if (local85 < 0) {
			local85 = 0;
		}
		Static289.aBoolean370 = true;
		Static111.anInt2680 = local85;
		Static126.anInt2888 = (Static582.aBoolean697 ? 26 : 22) + Static161.anInt3613 * 16;
		Static240.anInt4751 = local21;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZBLclient!pba;)V")
	public static void method6565(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class25_Sub2_Sub2_Sub5_Sub1 arg1) {
		if (Static161.anInt3613 >= 400) {
			return;
		}
		if (arg1 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1) {
			@Pc(73) String local73;
			@Pc(145) int local145;
			if (arg1.anInt7165 == 0) {
				@Pc(101) boolean local101 = true;
				if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7164 != -1 && arg1.anInt7164 != -1) {
					@Pc(120) int local120 = arg1.anInt7167 >= Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167 ? arg1.anInt7167 : Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167;
					@Pc(135) int local135 = arg1.anInt7164 <= Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7164 ? arg1.anInt7164 : Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7164;
					local145 = local135 + local120 * 10 / 100 + 5;
					@Pc(152) int local152 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167 - arg1.anInt7167;
					if (local152 < 0) {
						local152 = -local152;
					}
					if (local152 > local145) {
						local101 = false;
					}
				}
				@Pc(175) String local175 = Static40.aClass89_2 == Static31.aClass89_1 ? Static573.aClass350_34.method7730(Static201.anInt4321) : Static573.aClass350_32.method7730(Static201.anInt4321);
				if (arg1.anInt7173 > arg1.anInt7167) {
					local73 = arg1.method5676() + (local101 ? Static239.method3810(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167, arg1.anInt7167) : "<col=ffffff>") + " (" + local175 + arg1.anInt7167 + "+" + (arg1.anInt7173 - arg1.anInt7167) + ")";
				} else {
					local73 = arg1.method5676() + (local101 ? Static239.method3810(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167, arg1.anInt7167) : "<col=ffffff>") + " (" + local175 + arg1.anInt7167 + ")";
				}
			} else if (arg1.anInt7165 == -1) {
				local73 = arg1.method5676();
			} else {
				local73 = arg1.method5676() + " (" + Static573.aClass350_33.method7730(Static201.anInt4321) + arg1.anInt7165 + ")";
			}
			if (Static253.aBoolean325 && !arg0 && (Static182.anInt3987 & 0x8) != 0) {
				Static367.method5215(0, -1, Static421.aString201, Static238.aString114 + " -> <col=ffffff>" + local73, true, 51, false, (long) arg1.anInt8529, 0, Static455.anInt7961);
			}
			if (arg0) {
				Static367.method5215(0, 0, "<col=cccccc>" + local73, "", false, -1, true, 0L, 0, -1);
			} else {
				for (@Pc(297) int local297 = 7; local297 >= 0; local297--) {
					if (Static40.aStringArray4[local297] != null) {
						@Pc(305) short local305 = 0;
						if (Static70.aClass89_3 == Static31.aClass89_1 && Static40.aStringArray4[local297].equalsIgnoreCase(Static573.aClass350_27.method7730(Static201.anInt4321))) {
							if (arg1.anInt7167 > Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7167) {
								local305 = 2000;
							}
							if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7145 != 0 && arg1.anInt7145 != 0) {
								if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7145 == arg1.anInt7145) {
									local305 = 2000;
								} else {
									local305 = 0;
								}
							}
						} else if (Static429.aBooleanArray26[local297]) {
							local305 = 2000;
						}
						@Pc(356) short local356 = (short) (local305 + Static433.aShortArray40[local297]);
						local145 = Static459.anIntArray476[local297] == -1 ? Static473.anInt8220 : Static459.anIntArray476[local297];
						Static367.method5215(0, -1, Static40.aStringArray4[local297], "<col=ffffff>" + local73, true, local356, false, (long) arg1.anInt8529, 0, local145);
					}
				}
			}
			if (!arg0) {
				for (@Pc(426) Class3_Sub13 local426 = (Class3_Sub13) Static260.aClass244_40.method5572(); local426 != null; local426 = (Class3_Sub13) Static260.aClass244_40.method5576()) {
					if (local426.anInt2364 == 6) {
						local426.aString45 = "<col=ffffff>" + local73;
						return;
					}
				}
			}
		} else if (Static253.aBoolean325 && (Static182.anInt3987 & 0x10) != 0) {
			Static367.method5215(0, -1, Static421.aString201, Static238.aString114 + " -> <col=ffffff>" + Static573.aClass350_41.method7730(Static201.anInt4321), true, 49, false, 0L, 0, Static455.anInt7961);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	public static void method6567(@OriginalArg(0) int arg0) {
		if (Static403.anInt7291 == 1) {
			Static579.anInt10037 = arg0;
		} else if (Static403.anInt7291 == 2 || Static403.anInt7291 == 3) {
			Static181.anInt3977 = arg0;
		}
	}
}
