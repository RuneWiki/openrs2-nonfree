import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "[S")
	public static short[] aShortArray112;

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
	public static int anInt8754 = 0;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIILclient!r;II[[[BIIII)V")
	public static void method7217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class12 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg0 == 0 || arg11 == 0) {
			return;
		}
		if (arg0 == 9) {
			arg9 = arg9 + 1 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 10) {
			arg9 = arg9 + 3 & 0x3;
			arg0 = 1;
		}
		if (arg0 == 11) {
			arg0 = 8;
			arg9 = arg9 + 3 & 0x3;
		}
		arg4.IA(arg8, arg1, arg3, arg2, arg10, arg6, arg7[arg0 - 1][arg9], arg11, arg5);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)V")
	public static void method7220(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub3_Sub1 local12 = Static374.method5445(6, arg0);
		local12.method488();
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)Lclient!se;")
	public static Class293 method7221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static118.aClass293ArrayArrayArray14[0][arg1][arg2] != null && Static118.aClass293ArrayArrayArray14[0][arg1][arg2].aClass293_1 != null;
			if (local28 && arg0 >= Static101.anInt2104 - 1) {
				return null;
			}
			Static331.method4978(arg0, arg1, arg2);
		}
		return Static118.aClass293ArrayArrayArray14[arg0][arg1][arg2];
	}
}
