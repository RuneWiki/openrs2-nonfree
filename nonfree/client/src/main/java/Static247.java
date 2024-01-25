import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!md", name = "B", descriptor = "[Lclient!ht;")
	public static Class113[] aClass113Array1;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!mo;")
	public static final Class168 aClass168_23 = new Class168(10, -1);

	@OriginalMember(owner = "client!md", name = "I", descriptor = "[S")
	public static short[] aShortArray64 = new short[256];

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method3609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class10_Sub33 local7 = null;
		for (@Pc(12) Class10_Sub33 local12 = (Class10_Sub33) Static418.aClass163_44.method3620(); local12 != null; local12 = (Class10_Sub33) Static418.aClass163_44.method3621()) {
			if (arg5 == local12.anInt5109 && arg6 == local12.anInt5100 && local12.anInt5108 == arg2 && local12.anInt5098 == arg0) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class10_Sub33();
			local7.anInt5100 = arg6;
			local7.anInt5109 = arg5;
			local7.anInt5098 = arg0;
			local7.anInt5108 = arg2;
			if (arg6 >= 0 && arg2 >= 0 && arg6 < Static2.anInt7 && Static17.anInt315 > arg2) {
				Static40.method554(local7);
			}
			Static418.aClass163_44.method3613(local7);
		}
		local7.anInt5105 = arg3;
		local7.anInt5106 = arg1;
		local7.anInt5103 = arg4;
		local7.anInt5095 = -1;
		local7.anInt5097 = 0;
	}
}
