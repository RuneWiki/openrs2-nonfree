import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class93 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[16384];

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray3[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray2[local9] = (float) Math.cos((double) local9 * local7);
		}
	}
}
