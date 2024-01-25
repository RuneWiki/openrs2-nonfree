import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(III)I")
	public static int method4547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >>> 24;
		@Pc(31) int local31 = (local13 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local13 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(36) int local36 = 255 - local13;
		return (((arg0 & 0xFF00) * local36 & 0xFF0000 | local36 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local31;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)V")
	public static void method4549() {
		if (!Static190.aBoolean232) {
			return;
		}
		@Pc(11) Class279 local11 = Static406.method6473(Static161.anInt3179, Static433.anInt7818);
		if (local11 != null && local11.anObjectArray25 != null) {
			@Pc(20) Class3_Sub21 local20 = new Class3_Sub21();
			local20.anObjectArray1 = local11.anObjectArray25;
			local20.aClass279_5 = local11;
			Static304.method4843(local20);
		}
		Static235.anInt4449 = -1;
		Static190.aBoolean232 = false;
		Static32.anInt7819 = -1;
		if (local11 != null) {
			Static482.method7193(local11);
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(Z)Lclient!g;")
	public static Class96_Sub1 method4551() {
		Static118.anInt2567 = 0;
		return Static208.method7375();
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I")
	public static int method4554(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
