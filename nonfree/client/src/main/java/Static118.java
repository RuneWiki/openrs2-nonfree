import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!sea;")
	public static Class308 aClass308_46;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_8 = new Class207(8);

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	public static boolean method2139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZIIIIIIIIILclient!r;[[[BI)V")
	public static void method2141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class78 arg9, @OriginalArg(11) byte[][][] arg10, @OriginalArg(12) int arg11) {
		if (arg4 == 0 || arg2 == 0) {
			return;
		}
		if (arg4 == 9) {
			arg4 = 1;
			arg11 = arg11 + 1 & 0x3;
		}
		if (arg4 == 10) {
			arg4 = 1;
			arg11 = arg11 + 3 & 0x3;
		}
		if (arg4 == 11) {
			arg4 = 8;
			arg11 = arg11 + 3 & 0x3;
		}
		arg9.IA(arg5, arg1, arg8, arg0, arg7, arg6, arg10[arg4 - 1][arg11], arg2, arg3);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)V")
	public static void method2142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(0, 15);
		local8.method4833();
		local8.anInt5968 = arg0;
		local8.anInt5970 = arg1;
	}
}
