import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class77 {

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "[F")
	public static final float[] aFloatArray7 = new float[16384];

	@OriginalMember(owner = "client!dq", name = "f", descriptor = "[F")
	public static final float[] aFloatArray8 = new float[16384];

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			aFloatArray8[local11] = (float) Math.sin((double) local11 * local9);
			aFloatArray7[local11] = (float) Math.cos(local9 * (double) local11);
		}
	}
}
