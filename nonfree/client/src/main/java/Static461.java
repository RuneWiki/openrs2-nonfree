import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_7 = new Class146(5, 1);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public static void method7014(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub25 local18 = (Class3_Sub25) Static597.aClass280_45.method7107((long) arg0);
		if (local18 != null) {
			local18.aBoolean229 = !local18.aBoolean229;
			local18.aClass119_Sub1_1.method3531(local18.aBoolean229);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)V")
	public static void method7016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1006) {
			Static304.method4842(Static473.aClass311_10, arg2, arg0);
		} else if (arg1 == 1008) {
			Static304.method4842(Static507.aClass311_11, arg2, arg0);
		} else if (arg1 == 1001) {
			Static304.method4842(Static561.aClass311_14, arg2, arg0);
		} else if (arg1 == 1007) {
			Static304.method4842(Static5.aClass311_4, arg2, arg0);
		} else if (arg1 == 1010) {
			Static304.method4842(Static393.aClass311_8, arg2, arg0);
		}
	}
}
