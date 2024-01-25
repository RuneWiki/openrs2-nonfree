import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ok", name = "z", descriptor = "Lclient!jl;")
	public static final Class109 aClass109_6 = new Class109();

	@OriginalMember(owner = "client!ok", name = "C", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_76 = new Class70(30);

	@OriginalMember(owner = "client!ok", name = "J", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)V")
	public static void method4059(@OriginalArg(1) int arg0) {
		Static342.anInt6219 = arg0;
		@Pc(7) Class70 local7 = Static141.aClass70_50;
		synchronized (Static141.aClass70_50) {
			Static141.aClass70_50.method1399();
		}
		local7 = Static136.aClass70_47;
		synchronized (Static136.aClass70_47) {
			Static136.aClass70_47.method1399();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)I")
	public static int method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg0;
		}
	}
}
