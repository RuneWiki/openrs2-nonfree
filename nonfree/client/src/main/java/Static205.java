import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "J")
	public static long aLong158;

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Z")
	public static boolean aBoolean195 = false;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
	public static int anInt4112 = 0;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Z")
	public static boolean aBoolean196 = true;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public static void method3251() {
		Static118.aFontMetrics1 = null;
		Static28.aFont1 = null;
		Static206.anImage3 = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!v;ILclient!vg;B)V")
	public static void method3252(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class123 arg2) {
		@Pc(7) Class1_Sub26 local7 = new Class1_Sub26();
		local7.anInt4151 = 1;
		local7.aLong173 = arg1;
		local7.aClass123_6 = arg2;
		local7.aClass86_Sub1_39 = arg0;
		@Pc(22) Class75 local22 = Static18.aClass75_2;
		synchronized (Static18.aClass75_2) {
			Static18.aClass75_2.method2240(local7);
		}
		Static142.method2344();
	}
}
