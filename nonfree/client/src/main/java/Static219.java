import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
	public static int anInt3532 = 0;

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "[I")
	public static final int[] anIntArray249 = new int[4096];

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/io/File;B)[B")
	public static byte[] method3254(@OriginalArg(0) File arg0) {
		return Static135.method2427((int) arg0.length(), arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!ha;IIIIILclient!jw;IIIII)V")
	public static void method3256(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub5_Sub12 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg8 < arg4 && arg1 + arg8 > arg4 && arg2 - 13 < arg7 && arg2 + 3 > arg7) {
			arg10 = arg5;
		}
		@Pc(37) String local37 = Static336.method8997(arg6);
		Static344.aClass56_10.method8053(Static128.aClass17Array3, arg2, arg8 + 3, Static2.anIntArray1, arg10, local37);
	}
}
