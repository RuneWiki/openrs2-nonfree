import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	public static int anInt7814 = 2;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	public static int anInt7818 = -1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZII)V")
	public static void method6769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class3_Sub4_Sub12 local15 = Static556.method8018(10, arg1);
		local15.method3608();
		local15.anInt4064 = arg2;
		local15.anInt4065 = arg3;
		local15.anInt4062 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)Lclient!qk;")
	public static Class279 method6771(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static92.aClass279ArrayArray1[local7] == null || Static92.aClass279ArrayArray1[local7][local11] == null) {
			@Pc(30) boolean local30 = Static219.method3673(local7);
			if (!local30) {
				return null;
			}
		}
		return Static92.aClass279ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Z")
	public static boolean method6773(@OriginalArg(1) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
