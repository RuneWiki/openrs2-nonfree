import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!lc;")
	public static Class98 aClass98_88;

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
	public static boolean aBoolean193 = false;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!dh;")
	public static Class33 aClass33_24 = new Class33(64);

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString96 = "Loaded interfaces";

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString97 = "Attack";

	@OriginalMember(owner = "client!l", name = "A", descriptor = "[I")
	public static int[] anIntArray277 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!l", name = "H", descriptor = "I")
	public static int anInt2968 = 0;

	@OriginalMember(owner = "client!l", name = "I", descriptor = "I")
	public static int anInt2969 = 99;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZZI)V")
	public static void method2343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (Static178.aBoolean216) {
			@Pc(26) int local26 = arg0 - 334;
			if (local26 < 0) {
				local26 = 0;
			} else if (local26 > 100) {
				local26 = 100;
			}
			@Pc(51) int local51 = (Static165.aShort17 - Static180.aShort18) * local26 / 100 + Static180.aShort18;
			if (local51 < Static258.aShort30) {
				local51 = Static258.aShort30;
			} else if (Static157.aShort16 < local51) {
				local51 = Static157.aShort16;
			}
			@Pc(74) int local74 = local51 * arg0 * 512 / (arg1 * 334);
			@Pc(115) int local115;
			@Pc(121) int local121;
			@Pc(86) short local86;
			if (Static242.aShort31 > local74) {
				local86 = Static242.aShort31;
				local51 = local86 * 334 * arg1 / (arg0 * 512);
				if (local51 > Static157.aShort16) {
					local51 = Static157.aShort16;
					local115 = arg0 * 512 * local51 / (local86 * 334);
					local121 = (arg1 - local115) / 2;
					if (arg3) {
						Static186.method2957();
						Static186.method2968(arg2, arg4, local121, arg0, 0);
						Static186.method2968(arg2 + arg1 - local121, arg4, local121, arg0, 0);
					}
					arg2 += local121;
					arg1 -= local121 * 2;
				}
			} else if (local74 > Static69.aShort13) {
				local86 = Static69.aShort13;
				local51 = local86 * arg1 * 334 / (arg0 * 512);
				if (local51 < Static258.aShort30) {
					local51 = Static258.aShort30;
					local115 = local86 * 334 * arg1 / (local51 * 512);
					local121 = (arg0 - local115) / 2;
					if (arg3) {
						Static186.method2957();
						Static186.method2968(arg2, arg4, arg1, local121, 0);
						Static186.method2968(arg2, arg4 + arg0 - local121, arg1, local121, 0);
					}
					arg0 -= local121 * 2;
					arg4 += local121;
				}
			}
			Static126.anInt2699 = arg0 * local51 / 334;
		}
		Static92.anInt1910 = arg2;
		Static272.anInt5103 = arg4;
		Static84.anInt1698 = (short) arg0;
		Static272.anInt5104 = (short) arg1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fb;I)V")
	public static void method2344(@OriginalArg(0) Class4_Sub9 arg0) {
		if (arg0.aClass4_Sub15_5 != null) {
			arg0.aClass4_Sub15_5.anInt1903 = 0;
		}
		arg0.aBoolean142 = false;
		for (@Pc(24) Class4_Sub9 local24 = arg0.method1468(); local24 != null; local24 = arg0.method1463()) {
			method2344(local24);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qb;[I[II[I)V")
	public static void method2345(@OriginalArg(0) Class12_Sub3_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(19) int local19 = arg2[local7];
			@Pc(23) int local23 = arg1[local7];
			@Pc(27) int local27 = arg3[local7];
			@Pc(29) int local29 = 0;
			while (local23 != 0 && local29 < arg0.aClass28Array3.length) {
				if ((local23 & 0x1) != 0) {
					if (local19 == -1) {
						arg0.aClass28Array3[local29] = null;
					} else {
						@Pc(59) Class141 local59 = Static296.method1376(local19);
						@Pc(62) int local62 = local59.anInt4349;
						@Pc(67) Class28 local67 = arg0.aClass28Array3[local29];
						if (local67 != null) {
							if (local67.anInt860 == local19) {
								if (local62 == 0) {
									local67 = arg0.aClass28Array3[local29] = null;
								} else if (local62 == 1) {
									local67.anInt853 = 0;
									local67.anInt857 = 1;
									local67.anInt855 = 0;
									local67.anInt851 = local27;
									local67.anInt858 = 0;
									Static11.method188(Static239.aClass12_Sub3_Sub2_2 == arg0, local59, arg0.anInt4141, arg0.anInt4113, 0);
								} else if (local62 == 2) {
									local67.anInt853 = 0;
								}
							} else if (local59.anInt4358 >= Static296.method1376(local67.anInt860).anInt4358) {
								local67 = arg0.aClass28Array3[local29] = null;
							}
						}
						if (local67 == null) {
							local67 = arg0.aClass28Array3[local29] = new Class28();
							local67.anInt858 = 0;
							local67.anInt860 = local19;
							local67.anInt853 = 0;
							local67.anInt857 = 1;
							local67.anInt851 = local27;
							local67.anInt855 = 0;
							Static11.method188(Static239.aClass12_Sub3_Sub2_2 == arg0, local59, arg0.anInt4141, arg0.anInt4113, 0);
						}
					}
				}
				local29++;
				local23 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public static void method2346() {
		@Pc(9) int local9 = Static289.aClass4_Sub2_Sub12_3.method4195(Static288.aString71);
		@Pc(11) int local11;
		@Pc(28) int local28;
		for (local11 = 0; local11 < Static60.anInt1152; local11++) {
			local28 = Static289.aClass4_Sub2_Sub12_3.method4195(Static249.method3767(local11));
			if (local28 > local9) {
				local9 = local28;
			}
		}
		local9 += 8;
		@Pc(44) int local44 = Static273.anInt1118 - local9 / 2;
		local11 = Static60.anInt1152 * 15 + 21;
		local28 = Static105.anInt2256;
		if (Static216.anInt4287 < local28 + local11) {
			local28 = Static216.anInt4287 - local11;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		if (Static111.anInt2450 < local9 + local44) {
			local44 = Static111.anInt2450 - local9;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		if (Static209.anInt5551 == 1) {
			if (Static273.anInt1118 == Static24.anInt440 && Static53.anInt1061 == Static105.anInt2256) {
				Static142.aBoolean192 = true;
				Static205.anInt4000 = local28;
				Static209.anInt5551 = 0;
				Static139.anInt2867 = Static60.anInt1152 * 15 + (Static32.aBoolean50 ? 26 : 22);
				Static261.anInt4963 = local44;
				Static206.anInt4044 = local9;
			}
		} else if (Static273.anInt1118 == Static35.anInt708 && Static147.anInt2993 == Static105.anInt2256) {
			Static139.anInt2867 = Static60.anInt1152 * 15 + (Static32.aBoolean50 ? 26 : 22);
			Static209.anInt5551 = 0;
			Static206.anInt4044 = local9;
			Static205.anInt4000 = local28;
			Static261.anInt4963 = local44;
			Static142.aBoolean192 = true;
		} else {
			Static209.anInt5551 = 1;
			Static53.anInt1061 = Static147.anInt2993;
			Static24.anInt440 = Static35.anInt708;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!lc;I)Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 method2347(@OriginalArg(0) int arg0, @OriginalArg(1) Class98 arg1) {
		return Static243.method3715(arg0, arg1) ? Static161.method2511() : null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method2348() {
		@Pc(39) String local39;
		if (Static216.anInt4288 == 1 && Static60.anInt1152 < 2) {
			local39 = Static212.aString133 + Static254.aString164 + Static222.aString143 + " ->";
		} else if (Static26.aBoolean30 && Static60.anInt1152 < 2) {
			local39 = Static235.aString155 + Static254.aString164 + Static254.aString165 + " ->";
		} else if (Static86.aBoolean133 && Static96.aBooleanArray15[81] && Static60.anInt1152 > 2) {
			local39 = Static249.method3767(Static60.anInt1152 - 2);
		} else {
			local39 = Static249.method3767(Static60.anInt1152 - 1);
		}
		if (Static60.anInt1152 > 2) {
			local39 = local39 + "<col=ffffff> / " + (Static60.anInt1152 - 2) + Static198.aString70;
		}
		return local39;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
	public static void method2349() {
		aString96 = null;
		aString98 = null;
		aString97 = null;
		aClass98_88 = null;
		anIntArray277 = null;
		aClass33_24 = null;
	}
}
