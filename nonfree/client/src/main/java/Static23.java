import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!de", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_12;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!wb;")
	private static Class65 aClass65_312 = Static24.method441("flash2:");

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!wb;")
	private static Class65 aClass65_313 = Static24.method441("glow2:");

	@OriginalMember(owner = "client!de", name = "D", descriptor = "Lclient!wb;")
	private static Class65 aClass65_319 = Static24.method441("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_314 = aClass65_319;

	@OriginalMember(owner = "client!de", name = "q", descriptor = "I")
	public static int anInt670 = 0;

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_315 = aClass65_313;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_316 = aClass65_312;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!wb;")
	private static Class65 aClass65_317 = Static24.method441("purple:");

	@OriginalMember(owner = "client!de", name = "B", descriptor = "Lclient!wb;")
	public static Class65 aClass65_318 = Static24.method441("@gr3@");

	@OriginalMember(owner = "client!de", name = "E", descriptor = "Lclient!wb;")
	public static Class65 aClass65_320 = Static24.method441("Neuer Benutzer");

	@OriginalMember(owner = "client!de", name = "J", descriptor = "I")
	public static int anInt678 = 0;

	@OriginalMember(owner = "client!de", name = "K", descriptor = "[I")
	public static int[] anIntArray92 = new int[32768];

	@OriginalMember(owner = "client!de", name = "T", descriptor = "Lclient!wb;")
	public static Class65 aClass65_321 = Static24.method441("Mio");

	@OriginalMember(owner = "client!de", name = "X", descriptor = "Lclient!wb;")
	public static Class65 aClass65_322 = aClass65_317;

	@OriginalMember(owner = "client!de", name = "ab", descriptor = "Lclient!wb;")
	public static Class65 aClass65_323 = Static24.method441(" x ");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	public static void method419() {
		anIntArray92 = null;
		aClass65_322 = null;
		aByteArrayArray1 = null;
		aClass65_312 = null;
		aClass65_318 = null;
		aClass65_317 = null;
		aClass65_315 = null;
		aClass65_313 = null;
		aClass65_321 = null;
		aClass33_Sub1_12 = null;
		aClass65_320 = null;
		aClass65_319 = null;
		aClass65_316 = null;
		aClass65_323 = null;
		aClass65_314 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[Lclient!wb;I)Lclient!wb;")
	public static Class65 method420(@OriginalArg(1) int arg0, @OriginalArg(2) Class65[] arg1) {
		@Pc(12) int local12 = 0;
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			if (arg1[local18] == null) {
				arg1[local18] = Static53.aClass65_887;
			}
			local12 += arg1[local18].anInt2878;
		}
		@Pc(51) int local51 = 0;
		@Pc(54) byte[] local54 = new byte[local12];
		@Pc(64) Class65 local64;
		for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
			local64 = arg1[local56];
			Static118.method1745(local64.aByteArray70, 0, local54, local51, local64.anInt2878);
			local51 += local64.anInt2878;
		}
		local64 = new Class65();
		local64.anInt2878 = local12;
		local64.aByteArray70 = local54;
		return local64;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!wb;Lclient!wb;ILclient!k;)Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 method421(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(3) Class33 arg2) {
		@Pc(8) int local8 = arg2.method1149(arg1);
		@Pc(19) int local19 = arg2.method1144(arg0, local8);
		return Static56.method992(local8, arg2, local19);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIBLclient!ab;)V")
	public static void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class2_Sub1_Sub2 arg7) {
		if (Static17.aBoolean40) {
			Static106.anInt2836 = 32;
		} else {
			Static106.anInt2836 = 0;
		}
		Static17.aBoolean40 = false;
		if (arg5 <= arg0 && arg5 + 16 > arg0 && arg1 <= arg2 && arg1 + 16 > arg2) {
			if (arg6 == 1) {
				Static19.aBoolean99 = true;
			}
			arg7.anInt192 -= Static92.anInt2582 * 4;
			if (arg6 == 2 || arg6 == 3) {
				Static107.aBoolean156 = true;
			}
		} else if (arg5 <= arg0 && arg0 < arg5 + 16 && arg1 + arg4 - 16 <= arg2 && arg4 + arg1 > arg2) {
			arg7.anInt192 += Static92.anInt2582 * 4;
			if (arg6 == 2 || arg6 == 3) {
				Static107.aBoolean156 = true;
			}
			if (arg6 == 1) {
				Static19.aBoolean99 = true;
				return;
			}
		} else if (arg0 >= arg5 - Static106.anInt2836 && arg0 < Static106.anInt2836 + arg5 + 16 && arg1 + 16 <= arg2 && arg2 < arg1 + arg4 - 16 && Static92.anInt2582 > 0) {
			Static17.aBoolean40 = true;
			if (arg6 == 1) {
				Static19.aBoolean99 = true;
			}
			if (arg6 == 2 || arg6 == 3) {
				Static107.aBoolean156 = true;
			}
			@Pc(150) int local150 = arg4 * (arg4 - 32) / arg3;
			if (local150 < 8) {
				local150 = 8;
			}
			@Pc(169) int local169 = arg2 - local150 / 2 - arg1 - 16;
			@Pc(176) int local176 = arg4 - local150 - 32;
			arg7.anInt192 = local169 * (arg3 - arg4) / local176;
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method423() {
		Static63.aClass21_27.method743();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZLclient!sb;)Z")
	public static boolean method424(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class53 arg1) {
		Static39.anInt1240 = 20;
		try {
			Static78.aClass14_2 = (Class14) Class.forName("Class14_Sub2_Sub2").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(17) Interface3 local17 = arg1.method1624();
			if (local17 != null) {
				Static78.aClass14_2 = new Class14_Sub2_Sub1(arg1, local17);
				return true;
			} else if (arg0) {
				Static78.aClass14_2 = new Class14_Sub1(arg1);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!k;BII)Z")
	public static boolean method425(@OriginalArg(0) Class33 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1150(arg2, arg1);
		if (local9 == null) {
			return false;
		} else {
			Static29.method516(local9);
			return true;
		}
	}
}
