import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class21 {

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[16384];

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[16384];

	static {
		@Pc(19) double local19 = 3.834951969714103E-4D;
		for (@Pc(21) int local21 = 0; local21 < 16384; local21++) {
			aFloatArray2[local21] = (float) Math.sin(local19 * (double) local21);
			aFloatArray3[local21] = (float) Math.cos(local19 * (double) local21);
		}
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
