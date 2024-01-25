import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "[Lclient!gh;")
	public static Class119[] aClass119Array1;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!gv;BII)V")
	public static void method5770(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int[] local10 = new int[4];
		Static653.method6539(local10, 0, local10.length, arg2);
		Static341.method5674(arg1, arg0, local10);
	}
}
