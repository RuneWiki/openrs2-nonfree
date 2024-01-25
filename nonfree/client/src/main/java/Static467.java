import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "F")
	public static float aFloat149;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray4;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "[I")
	public static final int[] anIntArray447 = new int[3];

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
	public static void method6571() {
		Static365.aClass389_9.method9077();
		Static365.aClass389_9.aClass156_218 = null;
		Static365.aClass389_9.anInt10758 = 0;
		Static365.aClass389_9.aClass156_220 = null;
		Static365.aClass389_9.aClass5_Sub36_Sub2_2.anInt8456 = 0;
		Static365.aClass389_9.aClass156_217 = null;
		Static365.aClass389_9.aClass156_219 = null;
		Static365.aClass389_9.anInt10756 = 0;
		Static413.anInt6991 = 0;
		Static34.method557(122);
		Static29.method499();
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local38] = null;
		}
		Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 = null;
		for (@Pc(56) int local56 = 0; local56 < Static259.anInt4657; local56++) {
			@Pc(65) Class4_Sub1_Sub1_Sub2_Sub2 local65 = Static591.aClass5_Sub9Array1[local56].aClass4_Sub1_Sub1_Sub2_Sub2_1;
			if (local65 != null) {
				local65.anInt6863 = -1;
			}
		}
		Static26.method398();
		Static417.anInt7039 = -1;
		Static227.anInt9451 = -1;
		Static426.anInt7111 = 1;
		Static411.method6060(11, -3);
		for (@Pc(95) int local95 = 0; local95 < 100; local95++) {
			Static325.aBooleanArray15[local95] = true;
		}
		Static18.method271();
		Static484.aLong227 = 0L;
		Static437.aClass5_Sub16_2 = null;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([SIII[Ljava/lang/String;)V")
	public static void method6572(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if (local20 == null || arg3[local46] != null && arg3[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(73) String local73 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local73;
				@Pc(87) short local87 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local87;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method6572(arg0, local16 - 1, arg2, arg3);
		method6572(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIILjava/lang/String;Ljava/lang/String;JJBIZZZ)V")
	public static void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) long arg6, @OriginalArg(7) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) boolean arg11) {
		if (!Static490.aBoolean536 && Static651.anInt10662 < 500) {
			@Pc(28) int local28 = arg3 == -1 ? Static586.anInt9462 : arg3;
			@Pc(44) Class5_Sub1_Sub13 local44 = new Class5_Sub1_Sub13(arg5, arg4, local28, arg1, arg2, arg6, arg0, arg8, arg11, arg10, arg7, arg9);
			Static4.method7573(local44);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)Ljava/lang/String;")
	public static String method6574() {
		@Pc(9) String local9 = "www";
		if (Static670.aClass242_7 == Static45.aClass242_1) {
			local9 = "www-wtrc";
		} else if (Static161.aClass242_4 == Static670.aClass242_7) {
			local9 = "www-wtqa";
		} else if (Static670.aClass242_7 == Static581.aClass242_10) {
			local9 = "www-wtwip";
		}
		@Pc(46) String local46 = "";
		if (Static565.aString101 != null) {
			local46 = "/p=" + Static565.aString101;
		}
		return "http://" + local9 + "." + Static536.aClass290_6.aString91 + ".com/l=" + Static375.anInt7800 + "/a=" + Static653.anInt10666 + local46 + "/";
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIIIIZI)Z")
	public static boolean method6578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray405[0];
		@Pc(13) int local13 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anIntArray404[0];
		if (local8 < 0 || local8 >= Static271.anInt4910 || local13 < 0 || Static613.anInt9909 <= local13) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static271.anInt4910 && arg1 >= 0 && Static613.anInt9909 > arg1) {
			@Pc(94) int local94 = Static637.method6718(arg5, arg0, Static53.anIntArray63, arg7, arg3, arg6, arg1, Static553.aClass169Array1[Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139], local8, Static489.anIntArray460, local13, 53, arg4, arg2, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932());
			if (local94 < 1) {
				return false;
			}
			Static19.anInt250 = Static53.anIntArray63[local94 - 1];
			Static405.anInt10904 = Static489.anIntArray460[local94 - 1];
			Static286.aBoolean749 = false;
			Static102.method1577();
			return true;
		} else {
			return false;
		}
	}
}
