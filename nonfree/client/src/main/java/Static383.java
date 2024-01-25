import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!th", name = "r", descriptor = "[I")
	public static final int[] anIntArray479 = new int[1];

	@OriginalMember(owner = "client!th", name = "s", descriptor = "I")
	public static int anInt6683 = 0;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZII)V")
	public static void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static186.aLong117 = 0L;
		@Pc(8) int local8 = Static38.method898();
		if (arg1 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static266.aClass75_7.method2578()) {
			arg2 = true;
		}
		Static335.method4866(arg0, local8, arg3, arg1, arg2);
	}
}
