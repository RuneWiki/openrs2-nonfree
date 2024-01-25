import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class41 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[16384];

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray23[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray24[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!bl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
