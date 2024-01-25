import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_37 = new Class387(61, 2);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V")
	public static void method2754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class120 local9 = Static110.aClass120ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static594.anInt10010 = local9.anInt2504;
			Static662.anInt10638 = local9.anInt2503;
			Static61.anInt970 = local9.anInt2507;
		}
		Static265.method3879();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)V")
	public static void method2755(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static642.anInt10429 <= arg5 - arg3 && arg3 + arg5 <= Static456.anInt7806 && Static456.anInt7815 <= arg4 - arg3 && Static604.anInt10083 >= arg3 + arg4) {
			Static205.method2930(arg2, arg5, arg3, arg4, arg1, arg0);
		} else {
			Static244.method3620(arg5, arg4, arg3, arg2, arg1, arg0);
		}
	}
}
