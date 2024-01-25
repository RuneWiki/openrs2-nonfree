import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "Lclient!mn;")
	public static Class171 aClass171_81;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
	public static int anInt6254;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "Z")
	public static final boolean aBoolean432 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub42 local7 = null;
		for (@Pc(20) Class2_Sub42 local20 = (Class2_Sub42) Static465.aClass181_49.method3972(); local20 != null; local20 = (Class2_Sub42) Static465.aClass181_49.method3975()) {
			if (local20.anInt7065 == arg5 && local20.anInt7064 == arg2 && arg3 == local20.anInt7066 && arg0 == local20.anInt7060) {
				local7 = local20;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub42();
			local7.anInt7060 = arg0;
			local7.anInt7065 = arg5;
			local7.anInt7066 = arg3;
			local7.anInt7064 = arg2;
			if (arg2 >= 0 && arg3 >= 0 && arg2 < Static234.anInt3949 && Static371.anInt6492 > arg3) {
				Static437.method5905(local7);
			}
			Static465.aClass181_49.method3973(local7);
		}
		local7.anInt7058 = arg1;
		local7.anInt7068 = arg6;
		local7.anInt7067 = -1;
		local7.anInt7059 = arg4;
		local7.anInt7069 = 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V")
	public static void method4986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 - arg3 >= Static347.anInt6160 && Static385.anInt6686 >= arg1 + arg3 && arg2 - arg3 >= Static118.anInt2005 && Static123.anInt2069 >= arg3 + arg2) {
			Static408.method1354(arg2, arg3, arg0, arg1);
		} else {
			Static212.method3009(arg0, arg2, arg3, arg1);
		}
	}
}
