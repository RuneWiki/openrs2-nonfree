import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V")
	public static void method7684() {
		Static385.anInt10557 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static122.aClass3_Sub15Array1[local9] = null;
			Static584.aByteArray98[local9] = 1;
			Static546.aClass329Array3[local9] = null;
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[[[BIILclient!ha;IIIIIII)V")
	public static void method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class33 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg7 == 0 || arg4 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg7 = 1;
		}
		if (arg7 == 11) {
			arg1 = arg1 + 3 & 0x3;
			arg7 = 8;
		}
		arg5.Q(arg8, arg11, arg10, arg6, arg9, arg0, arg2[arg7 - 1][arg1], arg4, arg3);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(B[I[J)V")
	public static void method7686(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static58.method1280(arg0, 0, arg1, arg1.length - 1);
	}
}
