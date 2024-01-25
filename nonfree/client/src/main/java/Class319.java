import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class319 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[16384];

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "[F")
	public static final float[] aFloatArray59 = new float[16384];

	static {
		@Pc(12) double local12 = 3.834951969714103E-4D;
		for (@Pc(14) int local14 = 0; local14 < 16384; local14++) {
			aFloatArray59[local14] = (float) Math.sin(local12 * (double) local14);
			aFloatArray58[local14] = (float) Math.cos((double) local14 * local12);
		}
	}
}
