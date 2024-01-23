import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
	public static int anInt1675;

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "Lclient!fm;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!fh", name = "J", descriptor = "[Lclient!hn;")
	public static Class76[] aClass76Array1 = new Class76[14];

	@OriginalMember(owner = "client!fh", name = "N", descriptor = "[S")
	public static short[] aShortArray12 = new short[256];

	@OriginalMember(owner = "client!fh", name = "U", descriptor = "[I")
	public static int[] anIntArray112 = new int[25];

	@OriginalMember(owner = "client!fh", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString64 = "Ok";

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method1226(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(20) int local20 = arg2.indexOf(arg0); local20 != -1; local20 = arg2.indexOf(arg0, arg1.length() + local20)) {
			arg2 = arg2.substring(0, local20) + arg1 + arg2.substring(arg0.length() + local20);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIILclient!pf;I)V")
	public static void method1227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36_Sub3_Sub1 arg3) {
		if (Static21.aClass36_Sub3_Sub1_1 == arg3 || Static185.anInt3679 >= 400) {
			return;
		}
		@Pc(38) String local38;
		if (arg3.anInt4024 == 0) {
			@Pc(42) boolean local42 = true;
			if (Static21.aClass36_Sub3_Sub1_1.anInt4021 != -1 && arg3.anInt4021 != -1) {
				@Pc(67) int local67 = Static21.aClass36_Sub3_Sub1_1.anInt4018 > arg3.anInt4018 ? Static21.aClass36_Sub3_Sub1_1.anInt4018 : arg3.anInt4018;
				@Pc(82) int local82 = arg3.anInt4021 <= Static21.aClass36_Sub3_Sub1_1.anInt4021 ? arg3.anInt4021 : Static21.aClass36_Sub3_Sub1_1.anInt4021;
				@Pc(92) int local92 = local82 + local67 * 10 / 100 + 5;
				@Pc(99) int local99 = Static21.aClass36_Sub3_Sub1_1.anInt4018 - arg3.anInt4018;
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local92 < local99) {
					local42 = false;
				}
			}
			@Pc(125) String local125 = Static198.anInt3914 == 1 ? Static172.aString120 : Static115.aString87;
			if (arg3.anInt4018 >= arg3.anInt4034) {
				local38 = arg3.method3084() + (local42 ? Static279.method4118(arg3.anInt4018, Static21.aClass36_Sub3_Sub1_1.anInt4018) : "<col=ffffff>") + " (" + local125 + arg3.anInt4018 + ")";
			} else {
				local38 = arg3.method3084() + (local42 ? Static279.method4118(arg3.anInt4018, Static21.aClass36_Sub3_Sub1_1.anInt4018) : "<col=ffffff>") + " (" + local125 + arg3.anInt4018 + "+" + (arg3.anInt4034 - arg3.anInt4018) + ")";
			}
		} else {
			local38 = arg3.method3084() + " (" + Static198.aString141 + arg3.anInt4024 + ")";
		}
		@Pc(205) int local205;
		if (Static149.anInt3012 == 1) {
			Static28.method477(arg0, Static255.aString176, arg2, Static141.aString100 + " -> <col=ffffff>" + local38, Static241.anInt4825, (long) arg1, (short) 30);
		} else if (!Static215.aBoolean357) {
			for (local205 = 7; local205 >= 0; local205--) {
				if (Static184.aStringArray56[local205] != null) {
					@Pc(220) short local220 = 0;
					if (Static198.anInt3914 == 0 && Static184.aStringArray56[local205].equalsIgnoreCase(Static50.aString43)) {
						if (arg3.anInt4018 > Static21.aClass36_Sub3_Sub1_1.anInt4018) {
							local220 = 2000;
						}
						if (Static21.aClass36_Sub3_Sub1_1.anInt4047 != 0 && arg3.anInt4047 != 0) {
							if (arg3.anInt4047 == Static21.aClass36_Sub3_Sub1_1.anInt4047) {
								local220 = 2000;
							} else {
								local220 = 0;
							}
						}
					} else if (Static195.aBooleanArray11[local205]) {
						local220 = 2000;
					}
					@Pc(275) short local275 = Static181.aShortArray28[local205];
					@Pc(280) short local280 = (short) (local275 + local220);
					Static28.method477(arg0, Static184.aStringArray56[local205], arg2, "<col=ffffff>" + local38, Static245.anIntArray370[local205], (long) arg1, local280);
				}
			}
		} else if ((Static234.anInt4722 & 0x8) != 0) {
			Static28.method477(arg0, Static47.aString39, arg2, Static153.aString105 + " -> <col=ffffff>" + local38, Static57.anInt1261, (long) arg1, (short) 16);
		}
		for (local205 = 0; local205 < Static185.anInt3679; local205++) {
			if (Static204.aShortArray34[local205] == 31) {
				Static161.aStringArray47[local205] = "<col=ffffff>" + local38;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)V")
	public static void method1228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static253.anInt4996 <= arg4 && Static52.anInt1146 >= arg0 && arg3 >= Static228.anInt4643 && Static244.anInt4872 >= arg1) {
			if (arg2 == 1) {
				Static85.method1375(arg4, arg1, arg0, arg5, arg3);
			} else {
				Static260.method3918(arg0, arg2, arg5, arg1, arg4, arg3);
			}
		} else if (arg2 == 1) {
			Static168.method4145(arg4, arg1, arg3, arg5, arg0);
		} else {
			Static257.method3872(arg3, arg5, arg0, arg1, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)I")
	public static int method1231(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(17) Class8_Sub23 local17 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg0);
		if (local17 == null) {
			return Static49.method775(arg0).anInt4501;
		}
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local17.anIntArray270.length; local29++) {
			if (local17.anIntArray270[local29] == -1) {
				local27++;
			}
		}
		return local27 + Static49.method775(arg0).anInt4501 - local17.anIntArray270.length;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1233(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class8_Sub1_Sub6 local4 = Static181.method2779(3, arg1);
		local4.method931();
		local4.aString50 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZIILclient!am;I)Lclient!wd;")
	public static Class8_Sub1_Sub7 method1234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = (arg5 << 17) + (arg2 ? 65536 : 0) + arg1 + (arg3 << 19);
		@Pc(38) long local38 = (long) arg0 * 3147483667L + (long) local15 * 3849834839L;
		@Pc(44) Class8_Sub1_Sub7 local44 = (Class8_Sub1_Sub7) Static156.aClass61_26.method1384(local38);
		if (local44 != null) {
			return local44;
		}
		Static96.aBoolean146 = false;
		local44 = Static250.method3751(arg1, arg4, false, false, arg3, arg2, arg0, arg5);
		if (local44 != null && !Static96.aBoolean146) {
			Static156.aClass61_26.method1377(local38, local44);
		}
		return local44;
	}
}
