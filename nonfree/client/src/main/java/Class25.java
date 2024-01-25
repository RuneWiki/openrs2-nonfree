import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class25 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[16384];

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray12[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray11[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}
}
