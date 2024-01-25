import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
	public static int anInt2904;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	public static int anInt2906;

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	public static int anInt2907;

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_37 = new Class215(62, 8);

	@OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
	public static int anInt2908 = 0;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class4_Sub9 local7 = null;
		for (@Pc(12) Class4_Sub9 local12 = (Class4_Sub9) Static115.aClass183_15.method4140(); local12 != null; local12 = (Class4_Sub9) Static115.aClass183_15.method4144()) {
			if (arg5 == local12.anInt800 && arg0 == local12.anInt793 && arg4 == local12.anInt790 && arg3 == local12.anInt792) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub9();
			local7.anInt793 = arg0;
			local7.anInt790 = arg4;
			local7.anInt792 = arg3;
			local7.anInt800 = arg5;
			if (arg0 >= 0 && arg4 >= 0 && Static326.anInt5666 > arg0 && Static283.anInt5187 > arg4) {
				Static20.method216(local7);
			}
			Static115.aClass183_15.method4137(local7);
		}
		local7.anInt794 = arg2;
		local7.anInt804 = arg6;
		local7.anInt796 = -1;
		local7.anInt799 = 0;
		local7.anInt801 = arg1;
	}
}
