import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class310 {

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "[F")
	public static final float[] aFloatArray61 = new float[16384];

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "[F")
	public static final float[] aFloatArray62 = new float[16384];

	static {
		@Pc(19) double local19 = 3.834951969714103E-4D;
		for (@Pc(21) int local21 = 0; local21 < 16384; local21++) {
			aFloatArray62[local21] = (float) Math.sin((double) local21 * local19);
			aFloatArray61[local21] = (float) Math.cos((double) local21 * local19);
		}
	}
}
