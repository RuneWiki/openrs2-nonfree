import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public static int anInt9723;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "[Lclient!vr;")
	public static Class33[] aClass33Array27;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!aj;")
	public static Class15 aClass15_150;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Lclient!wr;")
	public static Class3_Sub11_Sub21 aClass3_Sub11_Sub21_3;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_146 = new Class218(75, 2);

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "J")
	public static final long aLong289 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "J")
	public static long aLong290 = 0L;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	public static void method8547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub34 local17 = Static172.method3123(Static163.aClass375_1, Static20.aClass218_117);
		local17.aClass3_Sub25_Sub1_2.method8595(arg0);
		local17.aClass3_Sub25_Sub1_2.method8596(arg1);
		Static441.method6275(local17);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method8549() {
		Static133.method9230();
		Static72.method1380();
	}
}
