import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	public static int anInt991;

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "Lclient!am;")
	public static Class9 aClass9_4;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BLclient!kl;)Z")
	public static boolean method907(@OriginalArg(1) Class137 arg0) {
		return arg0 == Static64.aClass137_3 || Static176.aClass137_8 == arg0 || arg0 == Static312.aClass137_9 || Static83.aClass137_4 == arg0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method908(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class1_Sub42 local7 = null;
		for (@Pc(16) Class1_Sub42 local16 = (Class1_Sub42) Static16.aClass181_4.method4112(); local16 != null; local16 = (Class1_Sub42) Static16.aClass181_4.method4104()) {
			if (local16.anInt6553 == arg3 && arg1 == local16.anInt6560 && arg0 == local16.anInt6557 && local16.anInt6556 == arg5) {
				local7 = local16;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub42();
			local7.anInt6556 = arg5;
			local7.anInt6553 = arg3;
			local7.anInt6557 = arg0;
			local7.anInt6560 = arg1;
			if (arg1 >= 0 && arg0 >= 0 && Static195.anInt3537 > arg1 && arg0 < Static118.anInt2419) {
				Static384.method5198(local7);
			}
			Static16.aClass181_4.method4102(local7);
		}
		local7.anInt6554 = arg2;
		local7.anInt6559 = arg4;
		local7.anInt6562 = arg6;
		local7.anInt6551 = -1;
		local7.anInt6563 = 0;
	}
}
