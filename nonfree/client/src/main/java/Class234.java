import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class234 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[16384];

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray28[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray29[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}
}
