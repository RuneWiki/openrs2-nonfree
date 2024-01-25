import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!ow", name = "h", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_105 = new Class289(72, 2);

	@OriginalMember(owner = "client!ow", name = "m", descriptor = "[I")
	public static final int[] anIntArray495 = new int[4096];

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lclient!ib;III)V")
	public static void method6429(@OriginalArg(0) Class2_Sub1_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int[] local10 = new int[4];
		Static679.method1566(local10, 0, local10.length, arg1);
		Static453.method1443(arg2, arg0, local10);
	}
}
