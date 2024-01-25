import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_124 = new Class119(62, -2);

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	public static int anInt5820 = 0;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
	public static int anInt5823 = -1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method4554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class179 local13 = local7.aClass179_2; local13 != null; local13 = local13.aClass179_3) {
			@Pc(17) Class7_Sub2 local17 = local13.aClass7_Sub2_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort71 == arg1 && local17.aShort73 == arg2) {
				Static156.method2537(local17);
				return;
			}
		}
	}
}
