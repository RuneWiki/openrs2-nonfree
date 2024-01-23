import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!td", name = "M", descriptor = "Lclient!h;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array11;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	public static int anInt4785 = -2;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString164 = " ";

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString165 = null;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIILclient!en;Lclient!en;IIIIJ)V")
	public static void method3832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class104 local6 = new Class104();
		local6.aLong112 = arg10;
		local6.anInt3171 = arg1 * 128 + 64;
		local6.anInt3165 = arg2 * 128 + 64;
		local6.anInt3164 = arg3;
		local6.aClass12_6 = arg4;
		local6.aClass12_7 = arg5;
		local6.anInt3173 = arg6;
		local6.anInt3172 = arg7;
		local6.anInt3167 = arg8;
		local6.anInt3166 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static127.aClass4_Sub11ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static127.aClass4_Sub11ArrayArrayArray1[local46][arg1][arg2] = new Class4_Sub11(local46, arg1, arg2);
			}
		}
		Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass104_1 = local6;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method3833() {
		Static105.aClass33_17.method839();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!cc;)Z")
	public static boolean method3834(@OriginalArg(1) Class22 arg0) {
		if (arg0.anIntArray64 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray64.length; local17++) {
			@Pc(31) int local31 = Static277.method4118(arg0, local17);
			@Pc(36) int local36 = arg0.anIntArray50[local17];
			if (arg0.anIntArray64[local17] == 2) {
				if (local31 >= local36) {
					return false;
				}
			} else if (arg0.anIntArray64[local17] == 3) {
				if (local36 >= local31) {
					return false;
				}
			} else if (arg0.anIntArray64[local17] == 4) {
				if (local31 == local36) {
					return false;
				}
			} else if (local36 != local31) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(Z)V")
	public static void method3836() {
		aClass4_Sub2_Sub1Array11 = null;
		aString165 = null;
		aString164 = null;
		aClass56_1 = null;
	}
}
