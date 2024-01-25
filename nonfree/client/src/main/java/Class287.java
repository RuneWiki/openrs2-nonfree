import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class287 {

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "[F")
	public static final float[] aFloatArray75 = new float[16384];

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[16384];

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray74[local15] = (float) Math.sin(local13 * (double) local15);
			aFloatArray75[local15] = (float) Math.cos(local13 * (double) local15);
		}
	}
}
