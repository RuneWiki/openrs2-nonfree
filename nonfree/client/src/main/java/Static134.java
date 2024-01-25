import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_84 = new Class61(33, -1);

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "Lclient!kg;")
	public static final Class4_Sub26 aClass4_Sub26_5 = new Class4_Sub26(0, 0);

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5692(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class4_Sub37 local7 = null;
		for (@Pc(12) Class4_Sub37 local12 = (Class4_Sub37) Static263.aClass124_53.method3267(); local12 != null; local12 = (Class4_Sub37) Static263.aClass124_53.method3273()) {
			if (arg2 == local12.anInt7083 && arg6 == local12.anInt7084 && local12.anInt7086 == arg3 && arg4 == local12.anInt7089) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub37();
			local7.anInt7089 = arg4;
			local7.anInt7084 = arg6;
			local7.anInt7083 = arg2;
			local7.anInt7086 = arg3;
			if (arg6 >= 0 && arg3 >= 0 && arg6 < Static38.anInt740 && arg3 < Static38.anInt741) {
				Static568.method7793(local7);
			}
			Static263.aClass124_53.method3275(local7);
		}
		local7.anInt7090 = 0;
		local7.anInt7094 = arg1;
		local7.anInt7096 = arg0;
		local7.anInt7093 = -1;
		local7.anInt7097 = arg5;
	}
}
