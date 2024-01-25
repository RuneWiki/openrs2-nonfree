import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class119 {

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[16384];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[16384];

	static {
		@Pc(38) double local38 = 3.834951969714103E-4D;
		for (@Pc(40) int local40 = 0; local40 < 16384; local40++) {
			aFloatArray27[local40] = (float) Math.sin(local38 * (double) local40);
			aFloatArray28[local40] = (float) Math.cos(local38 * (double) local40);
		}
	}
}
