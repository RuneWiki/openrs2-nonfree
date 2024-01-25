import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public final class Class260 {

	@OriginalMember(owner = "client!ou", name = "j", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[16384];

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[16384];

	static {
		@Pc(69) double local69 = 3.834951969714103E-4D;
		for (@Pc(71) int local71 = 0; local71 < 16384; local71++) {
			aFloatArray57[local71] = (float) Math.sin((double) local71 * local69);
			aFloatArray58[local71] = (float) Math.cos((double) local71 * local69);
		}
	}

	@OriginalMember(owner = "client!ou", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
