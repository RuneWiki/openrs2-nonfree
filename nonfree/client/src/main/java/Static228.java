import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!hl", name = "z", descriptor = "Lclient!rg;")
	public static Class310 aClass310_50;

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "[I")
	public static final int[] anIntArray225 = new int[8];

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_113 = new Class160(78, 1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!cg;I)Z")
	public static boolean method3846(@OriginalArg(0) Class59 arg0) {
		return arg0 == Static351.aClass59_12 || Static268.aClass59_7 == arg0 || arg0 == Static530.aClass59_8 || arg0 == Static594.aClass59_11 || Static142.aClass59_5 == arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([FIZ)[F")
	public static float[] method3850(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) float[] local15 = new float[arg1];
		Static691.method88(arg0, 0, local15, 0, arg1);
		return local15;
	}
}
