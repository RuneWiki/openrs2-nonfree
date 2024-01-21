import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
	public static int anInt3139;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_930 = Static81.method1507("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
	public static int anInt3138 = -1;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_4 = new Class46(50);

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_5 = new Class46(500);

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_931 = Static81.method1507(" is already on your friend list)3");

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "Lclient!dj;")
	public static Class24 aClass24_932 = aClass24_931;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method2433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class101 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class101(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static29.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static29.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass101_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class101(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static29.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static29.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass101_1 = local12;
		} else {
			@Pc(134) Class15 local134 = new Class15(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static29.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static29.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass15_1 = local134;
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([BIIB)I")
	public static int method2434(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg1; local7++) {
			local5 = local5 >>> 8 ^ Class91.anIntArray341[(arg0[local7] ^ local5) & 0xFF];
		}
		return ~local5;
	}
}
