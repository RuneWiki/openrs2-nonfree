import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array9;

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "Z")
	public static boolean aBoolean324;

	@OriginalMember(owner = "client!mg", name = "v", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_61 = new Class208(78, 16);

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
	public static int anInt4459 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V")
	public static void method3563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg0; local7++) {
			Static215.method3035(arg2, arg4, Static46.anIntArrayArray24[local7], arg3);
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!hw;)Lclient!re;")
	public static Class105_Sub3 method3565(@OriginalArg(1) Class2_Sub17 arg0) {
		return new Class105_Sub3(arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6149(), arg0.method6145(), arg0.method6138());
	}
}
