import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class122 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "[F")
	public static final float[] aFloatArray17 = new float[16384];

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray18[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray17[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}
}
