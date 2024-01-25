import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class213 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[16384];

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray27[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray28[local9] = (float) Math.cos((double) local9 * local7);
		}
	}
}
