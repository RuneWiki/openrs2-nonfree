import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	public static int anInt3939;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public static int anInt3932 = 0;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_69 = new Class66(50);

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
	public static int[] anIntArray285 = new int[2];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Lclient!dh;")
	public static Class47_Sub1 method3624() {
		Static285.anInt5768 = 0;
		return Static15.method517();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ac;I[[BI[[BILclient!ac;Z[[I[[B[[BILclient!en;)V")
	public static void method3626(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class59 arg11) {
		if (Static134.anInt2746 == 0 && !Static90.aBoolean316) {
			Static57.method1221(arg1, arg11, arg0, arg2, arg3, arg9, arg6, arg5, arg4, arg8, arg10, arg7);
		} else {
			Static205.method3639(arg9, arg10, arg8, arg2, arg6, arg7, arg0, arg3, arg11, arg5, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	public static void method3627(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static324.aBoolean461) {
			Static324.aBoolean461 = arg0;
			Static155.method3612();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3628(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(15) Class5_Sub9_Sub16 local15 = Static239.method4052(3, arg0);
		local15.method4140();
		local15.aString276 = arg1;
	}
}
