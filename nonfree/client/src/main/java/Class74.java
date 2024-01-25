import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class74 {

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[16384];

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[16384];

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray3[local15] = (float) Math.sin((double) local15 * local13);
			aFloatArray4[local15] = (float) Math.cos(local13 * (double) local15);
		}
	}
}
