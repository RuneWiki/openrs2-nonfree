import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class80 {

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "[F")
	public static final float[] aFloatArray18 = new float[16384];

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[16384];

	@OriginalMember(owner = "client!fq", name = "j", descriptor = "[I")
	public static final int[] anIntArray219;

	static {
		@Pc(23) double local23 = 3.834951969714103E-4D;
		for (@Pc(25) int local25 = 0; local25 < 16384; local25++) {
			aFloatArray18[local25] = (float) Math.sin((double) local25 * local23);
			aFloatArray19[local25] = (float) Math.cos((double) local25 * local23);
		}
		anIntArray219 = new int[4096];
		for (@Pc(55) int local55 = 0; local55 < 4096; local55++) {
			anIntArray219[local55] = Static164.method2883(local55);
		}
	}
}
