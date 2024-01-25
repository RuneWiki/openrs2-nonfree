import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
	public static int anInt3093;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "Lclient!gp;")
	public static Class117 aClass117_77;

	@OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
	public static int anInt3095;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "[I")
	public static final int[] anIntArray244 = new int[6];

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!vt;I)I")
	public static int method2768(@OriginalArg(0) Class306 arg0) {
		if (arg0 == Static523.aClass306_12) {
			return 5120;
		} else if (Static523.aClass306_13 == arg0) {
			return 5122;
		} else if (Static523.aClass306_14 == arg0) {
			return 5124;
		} else if (arg0 == Static523.aClass306_15) {
			return 5121;
		} else if (arg0 == Static523.aClass306_16) {
			return 5123;
		} else if (arg0 == Static523.aClass306_17) {
			return 5125;
		} else if (arg0 == Static523.aClass306_18) {
			return 5131;
		} else if (Static523.aClass306_19 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "([SZ)[S")
	public static short[] method2769(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static553.method2530(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
