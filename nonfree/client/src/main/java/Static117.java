import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "Lclient!sg;")
	public static Class5_Sub5_Sub19 aClass5_Sub5_Sub19_1;

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	// $FF: synthetic field
	@OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/lang/Class;")
	private static Class aClass6;

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)Z")
	public static boolean method1656(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIB)Z")
	public static boolean method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface16 local11 = (Interface16) Static87.method1318(arg1, arg0, arg2);
		if (local11 != null) {
			local5 = Static673.method9268(local11) & true;
		}
		local11 = (Interface16) Static465.method5496(arg1, arg0, arg2, aClass6 == null ? (aClass6 = Class94.a("nda")) : aClass6);
		if (local11 != null) {
			local5 &= Static673.method9268(local11);
		}
		local11 = (Interface16) Static209.method3036(arg1, arg0, arg2);
		if (local11 != null) {
			local5 &= Static673.method9268(local11);
		}
		return local5;
	}
}
