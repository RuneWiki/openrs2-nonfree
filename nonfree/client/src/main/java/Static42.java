import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!eg", name = "jb", descriptor = "Lclient!o;")
	public static Class4_Sub1 aClass4_Sub1_21;

	@OriginalMember(owner = "client!eg", name = "kb", descriptor = "Z")
	public static boolean aBoolean96;

	@OriginalMember(owner = "client!eg", name = "mb", descriptor = "Lclient!ag;")
	public static Class4 aClass4_41;

	@OriginalMember(owner = "client!eg", name = "gb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_487 = Static161.method2971("Please reload this page)3");

	@OriginalMember(owner = "client!eg", name = "eb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_485 = aClass13_487;

	@OriginalMember(owner = "client!eg", name = "pb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_489 = Static161.method2971("Hidden");

	@OriginalMember(owner = "client!eg", name = "fb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_486 = aClass13_489;

	@OriginalMember(owner = "client!eg", name = "lb", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[5];

	@OriginalMember(owner = "client!eg", name = "nb", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!eg", name = "ob", descriptor = "Lclient!dd;")
	public static Class13 aClass13_488 = Static161.method2971("leuchten3:");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIILclient!lc;IJZ)Z")
	public static boolean method1117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
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
		return method1118(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIILclient!lc;IZJ)Z")
	public static boolean method1118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub2_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static101.anInt2832 || local4 >= Static90.anInt2623) {
					return false;
				}
				@Pc(25) Class1_Sub10 local25 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][local1][local4];
				if (local25 != null && local25.anInt1544 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class59 local49 = new Class59();
		local49.aLong106 = arg11;
		local49.anInt3136 = arg0;
		local49.anInt3139 = arg5;
		local49.anInt3132 = arg6;
		local49.anInt3138 = arg7;
		local49.aClass1_Sub2_Sub2_7 = arg8;
		local49.anInt3137 = arg9;
		local49.anInt3133 = arg1;
		local49.anInt3130 = arg2;
		local49.anInt3142 = arg1 + arg3 - 1;
		local49.anInt3143 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static170.aClass1_Sub10ArrayArrayArray35[local124][local92][local95] == null) {
						Static170.aClass1_Sub10ArrayArrayArray35[local124][local92][local95] = new Class1_Sub10(local124, local92, local95);
					}
				}
				@Pc(157) Class1_Sub10 local157 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][local92][local95];
				local157.aClass59Array4[local157.anInt1544] = local49;
				local157.anIntArray160[local157.anInt1544] = local98;
				local157.anInt1538 |= local98;
				local157.anInt1544++;
			}
		}
		if (arg10) {
			Static17.aClass59Array1[Static125.anInt3234++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(B)V")
	public static void method1119() {
		aClass4_41 = null;
		aClass4_Sub1_21 = null;
		aClass13_485 = null;
		aClass13_486 = null;
		aClass13_488 = null;
		aClass13_487 = null;
		aClass13_489 = null;
		aBooleanArray22 = null;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(BI)Lclient!qb;")
	public static Class1_Sub2_Sub16 method1120(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub2_Sub16 local18 = (Class1_Sub2_Sub16) Static61.aClass47_14.method1999((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static170.aClass4_98.method2243(5, arg0);
		local18 = new Class1_Sub2_Sub16();
		if (local28 != null) {
			local18.method2458(new Class1_Sub8(local28));
		}
		Static61.aClass47_14.method1998(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)Lclient!bf;")
	public static Class1_Sub2_Sub3 method1121(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub3 local6 = (Class1_Sub2_Sub3) Static39.aClass47_9.method1999((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static180.aClass4_101.method2243(13, arg0);
		local6 = new Class1_Sub2_Sub3();
		local6.anInt482 = arg0;
		if (local28 != null) {
			local6.method534(new Class1_Sub8(local28));
		}
		Static39.aClass47_9.method1998(local6, (long) arg0);
		return local6;
	}
}
