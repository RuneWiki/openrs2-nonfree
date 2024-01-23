import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
	public static int anInt665;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "C")
	public static char aChar1;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
	public static volatile int anInt669 = 0;

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
	public static int anInt670 = 0;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!pk;ZLjava/lang/String;)Lclient!pe;")
	public static Class130 method461(@OriginalArg(0) Class132 arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = arg0.method3185(arg1);
		if (local10 == -1) {
			return new Class130(0);
		}
		@Pc(24) int[] local24 = arg0.method3167(local10);
		@Pc(30) Class130 local30 = new Class130(local24.length);
		for (@Pc(32) int local32 = 0; local32 < local30.anInt3917; local32++) {
			@Pc(57) Class8_Sub2 local57 = new Class8_Sub2(arg0.method3194(local10, local24[local32]));
			local30.aStringArray61[local32] = local57.method2372();
			local30.aByteArray34[local32] = local57.method2374();
			local30.anIntArray297[local32] = local57.method2352();
			local30.anIntArray298[local32] = local57.method2352();
		}
		return local30;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!pf;Z)V")
	public static void method462(@OriginalArg(0) Class36_Sub3_Sub1 arg0) {
		@Pc(12) Class8_Sub12 local12 = (Class8_Sub12) Static247.aClass129_29.method3043(Static31.method513(arg0.aString144));
		if (local12 == null) {
			return;
		}
		if (local12.aClass8_Sub8_Sub4_3 != null) {
			Static84.aClass8_Sub8_Sub1_1.method837(local12.aClass8_Sub8_Sub4_3);
			local12.aClass8_Sub8_Sub4_3 = null;
		}
		local12.method4273();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!tk;IIIIIIB)V")
	public static void method463(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (Static243.aBoolean390) {
			Static277.anInt5666 = 32;
		} else {
			Static277.anInt5666 = 0;
		}
		Static243.aBoolean390 = false;
		@Pc(142) int local142;
		if (Static47.anInt1046 != 0) {
			if (arg3 <= arg6 && arg6 < arg3 + 16 && arg2 >= arg4 && arg4 + 16 > arg2) {
				arg0.anInt5176 -= 4;
				Static128.method2075(arg0);
			} else if (arg3 <= arg6 && arg6 < arg3 + 16 && arg5 + arg4 - 16 <= arg2 && arg4 + arg5 > arg2) {
				arg0.anInt5176 += 4;
				Static128.method2075(arg0);
			} else if (arg6 >= arg3 - Static277.anInt5666 && Static277.anInt5666 + arg3 + 16 > arg6 && arg2 >= arg4 + 16 && arg2 < arg4 + arg5 - 16) {
				local142 = arg5 * (arg5 - 32) / arg1;
				if (local142 < 8) {
					local142 = 8;
				}
				@Pc(161) int local161 = arg2 - local142 / 2 - arg4 - 16;
				@Pc(168) int local168 = arg5 - local142 - 32;
				arg0.anInt5176 = local161 * (arg1 - arg5) / local168;
				Static128.method2075(arg0);
				Static243.aBoolean390 = true;
			}
		}
		if (Static183.anInt3587 == 0) {
			return;
		}
		local142 = arg0.anInt5123;
		if (arg6 >= arg3 - local142 && arg4 <= arg2 && arg3 + 16 > arg6 && arg2 <= arg4 + arg5) {
			arg0.anInt5176 += Static183.anInt3587 * 45;
			Static128.method2075(arg0);
		}
	}
}
