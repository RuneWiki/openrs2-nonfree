import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "[[I")
	public static int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
	public static int anInt460 = 50;

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "[I")
	public static int[] anIntArray49 = new int[anInt460];

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
	public static int anInt448 = -1;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9 = new String[anInt460];

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "[I")
	public static int[] anIntArray50 = new int[anInt460];

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "[I")
	public static int[] anIntArray51 = new int[anInt460];

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "[I")
	public static int[] anIntArray52 = new int[anInt460];

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "[I")
	public static int[] anIntArray53 = new int[anInt460];

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
	public static int[] anIntArray54 = new int[anInt460];

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
	public static int anInt454 = 0;

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
	public static int anInt458 = 0;

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "[I")
	public static int[] anIntArray55 = new int[anInt460];

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BIZLjava/lang/String;)I")
	public static int method421(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = false;
		@Pc(35) int local35 = arg1.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(48) char local48 = arg1.charAt(local37);
			if (local37 == 0) {
				if (local48 == '-') {
					local32 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(87) int local87;
			if (local48 >= '0' && local48 <= '9') {
				local87 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local87 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local87 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local87) {
				throw new NumberFormatException();
			}
			if (local32) {
				local87 = -local87;
			}
			@Pc(124) int local124 = local87 + arg0 * local30;
			if (local30 != local124 / arg0) {
				throw new NumberFormatException();
			}
			local28 = true;
			local30 = local124;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIILclient!dn;IJZ)Z")
	public static boolean method423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static163.method2819(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBIII)V")
	public static void method424(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static277.aBoolean412) {
			Static41.method847(arg1, arg0, arg1 + arg3, arg2 + arg0);
			Static41.method832(arg1, arg0, arg3, arg2, 0);
		} else {
			Static50.method950(arg1, arg0, arg1 + arg3, arg0 - -arg2);
			Static50.method954(arg1, arg0, arg3, arg2, 0);
		}
		if (Static192.anInt3954 < 100) {
			return;
		}
		if (Static164.aClass1_Sub2_Sub11_14 == null || Static164.aClass1_Sub2_Sub11_14.anInt4874 != arg3 || Static164.aClass1_Sub2_Sub11_14.anInt4869 != arg2) {
			@Pc(66) Class1_Sub2_Sub11_Sub2 local66 = new Class1_Sub2_Sub11_Sub2(arg3, arg2);
			Static50.method958(local66.anIntArray426, arg3, arg2);
			Static129.method2209(Static95.anInt2218, arg2, Static164.anInt3508, 0, 0, 0, 0, arg3);
			if (Static277.aBoolean412) {
				Static164.aClass1_Sub2_Sub11_14 = new Class1_Sub2_Sub11_Sub1(local66);
			} else {
				Static164.aClass1_Sub2_Sub11_14 = local66;
			}
			if (Static277.aBoolean412) {
				Static50.anIntArray107 = null;
			} else {
				Static72.aClass99_1.method3516();
			}
		}
		@Pc(103) int local103 = 16711680;
		Static164.aClass1_Sub2_Sub11_14.method3775(arg1, arg0);
		@Pc(115) int local115 = arg2 * Static149.anInt3224 / Static95.anInt2218 + arg0;
		@Pc(121) int local121 = Static193.anInt3981 * arg2 / Static95.anInt2218;
		@Pc(130) int local130 = arg1 + Static154.anInt3333 * arg3 / Static164.anInt3508;
		@Pc(136) int local136 = arg3 * Static142.anInt3046 / Static164.anInt3508;
		if (Static87.anInt1946 == 1) {
			local103 = 16777215;
		}
		if (Static277.aBoolean412) {
			Static41.method839(local130, local115, local136, local121, local103, 128);
			Static41.method844(local130, local115, local136, local121, local103);
		} else {
			Static50.method961(local130, local115, local136, local121, local103, 128);
			Static50.method946(local130, local115, local136, local121, local103);
		}
		if (Static240.anInt4766 <= 0) {
			return;
		}
		@Pc(188) int local188;
		if (Static296.anInt5584 <= 10) {
			local188 = Static296.anInt5584 * 25;
		} else {
			local188 = 500 - Static296.anInt5584 * 25;
		}
		for (@Pc(202) Class1_Sub7 local202 = (Class1_Sub7) Static134.aClass61_17.method1835(); local202 != null; local202 = (Class1_Sub7) Static134.aClass61_17.method1836()) {
			if (Static146.anInt3173 == local202.anInt287) {
				@Pc(219) int local219 = arg1 + local202.anInt288 * arg3 / Static164.anInt3508;
				@Pc(229) int local229 = arg0 + local202.anInt290 * arg2 / Static95.anInt2218;
				if (Static277.aBoolean412) {
					Static41.method839(local219 - 2, local229 + -2, 4, 4, 16776960, local188);
				} else {
					Static50.method961(local219 - 2, local229 + -2, 4, 4, 16776960, local188);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lclient!bn;")
	public static Class1_Sub2_Sub1_Sub2 method425(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub1_Sub2 local15 = (Class1_Sub2_Sub1_Sub2) Static86.aClass135_8.method3316((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static24.aClass91_169.method2495(arg0, 0);
		local15 = new Class1_Sub2_Sub1_Sub2(local25);
		local15.method452(Static221.aClass12Array6, null);
		Static86.aClass135_8.method3321((long) arg0, local15);
		return local15;
	}
}
