import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!gda", name = "i", descriptor = "Lclient!dn;")
	public static Class69 aClass69_32;

	@OriginalMember(owner = "client!gda", name = "j", descriptor = "I")
	public static int anInt3001 = 0;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(FFIBF)F")
	public static float method2820(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static224.aFloatArrayArray5[arg2];
		return local7[2] * arg0 + local7[1] * arg3 + arg1 * local7[0];
	}
}
