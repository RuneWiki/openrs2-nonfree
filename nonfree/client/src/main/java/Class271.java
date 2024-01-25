import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class271 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[F")
	public static final float[] aFloatArray54 = new float[16384];

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[16384];

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			aFloatArray55[local15] = (float) Math.sin(local13 * (double) local15);
			aFloatArray54[local15] = (float) Math.cos((double) local15 * local13);
		}
	}

	@OriginalMember(owner = "client!qf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
