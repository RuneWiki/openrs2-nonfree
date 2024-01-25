import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class108 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "[F")
	public static final float[] aFloatArray20 = new float[16384];

	@OriginalMember(owner = "client!in", name = "b", descriptor = "[F")
	public static final float[] aFloatArray21 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray21[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray20[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}
}
