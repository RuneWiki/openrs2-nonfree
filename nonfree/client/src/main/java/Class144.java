import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class144 {

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[16384];

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "[F")
	public static final float[] aFloatArray44 = new float[16384];

	static {
		@Pc(28) double local28 = 3.834951969714103E-4D;
		for (@Pc(30) int local30 = 0; local30 < 16384; local30++) {
			aFloatArray44[local30] = (float) Math.sin((double) local30 * local28);
			aFloatArray43[local30] = (float) Math.cos(local28 * (double) local30);
		}
	}
}
