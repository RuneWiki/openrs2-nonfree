import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIIIIIILclient!jb;Lclient!ha;)V")
	public static void method3770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub6_Sub7 arg9, @OriginalArg(11) Class145 arg10) {
		if (arg1 < arg3 && arg0 + arg1 > arg3 && arg7 > arg8 - 13 && arg7 < arg8 + 3) {
			arg5 = arg4;
		}
		@Pc(45) String local45 = Static370.method3242(arg9);
		Static387.aClass68_12.method7895(arg5, arg8, local45, Static467.aClass43Array17, Static464.anIntArray538, arg1 + 3);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)Z")
	public static boolean method3771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
