import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "I")
	public static int anInt6805;

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(B)I")
	public static int method5832() {
		@Pc(10) Class10 local10 = Static569.aClass10_54;
		synchronized (Static569.aClass10_54) {
			return Static569.aClass10_54.method379();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIIIIIZ)V")
	public static void method5833(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 <= arg4) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg4) / 2;
		@Pc(16) int local16 = arg4;
		@Pc(20) Class235_Sub1 local20 = Static668.aClass235_Sub1Array2[local14];
		Static668.aClass235_Sub1Array2[local14] = Static668.aClass235_Sub1Array2[arg3];
		Static668.aClass235_Sub1Array2[arg3] = local20;
		for (@Pc(32) int local32 = arg4; local32 < arg3; local32++) {
			if (Static481.method7021(arg1, Static668.aClass235_Sub1Array2[local32], arg2, arg0, local20, arg5) <= 0) {
				@Pc(49) Class235_Sub1 local49 = Static668.aClass235_Sub1Array2[local32];
				Static668.aClass235_Sub1Array2[local32] = Static668.aClass235_Sub1Array2[local16];
				Static668.aClass235_Sub1Array2[local16++] = local49;
			}
		}
		Static668.aClass235_Sub1Array2[arg3] = Static668.aClass235_Sub1Array2[local16];
		Static668.aClass235_Sub1Array2[local16] = local20;
		method5833(arg0, arg1, arg2, local16 - 1, arg4, arg5);
		method5833(arg0, arg1, arg2, arg3, local16 + 1, arg5);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BII)Z")
	public static boolean method5834(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII[[[BLclient!ha;IIIIII)V")
	public static void method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) Class132 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg8 == 0 || arg1 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg8 = 1;
			arg3 = arg3 + 1 & 0x3;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg3 = arg3 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg3 = arg3 + 3 & 0x3;
			arg8 = 8;
		}
		arg6.Q(arg11, arg10, arg7, arg4, arg2, arg0, arg5[arg8 - 1][arg3], arg1, arg9);
	}
}
