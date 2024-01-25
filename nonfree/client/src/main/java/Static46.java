import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[S)[S")
	public static short[] method1077(@OriginalArg(1) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static601.method2933(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
