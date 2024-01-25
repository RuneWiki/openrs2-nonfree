import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_112 = new Class231("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Z")
	public static boolean aBoolean453 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([[IB)V")
	public static void method5374(@OriginalArg(0) int[][] arg0) {
		Static46.anIntArrayArray24 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([III[IILclient!na;)Lclient!gu;")
	public static Class102_Sub1 method5377(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75_Sub2 arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg3];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(22) int local22 = arg3 * local12 + arg2[local12];
			for (@Pc(24) int local24 = 0; local24 < arg0[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class102_Sub1(arg4, arg3, arg1, local10);
	}
}
