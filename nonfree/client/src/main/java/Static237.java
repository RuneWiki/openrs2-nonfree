import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "Lclient!pk;")
	public static final Class183 aClass183_52 = new Class183();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg6) {
			Static103.method1815(arg2, arg5, arg3, arg4, arg0, arg1);
		} else if (Static354.anInt6186 <= arg2 - arg5 && arg5 + arg2 <= Static208.anInt2656 && arg4 - arg6 >= Static376.anInt6287 && Static168.anInt3256 >= arg6 + arg4) {
			Static243.method3558(arg4, arg6, arg5, arg0, arg1, arg2, arg3);
		} else {
			Static239.method3548(arg2, arg0, arg5, arg3, arg6, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method5625(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) long local11 = (long) 0;
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			local11 = (long) arg0.charAt(local13) + (local11 << 5) - local11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method5626(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static459.method3330(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
