import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class177 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
	public static final int[] anIntArray361 = new int[16384];

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
	public static final int[] anIntArray360 = new int[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray361[local9] = (int) (Math.sin(local7 * (double) local9) * 16384.0D);
			anIntArray360[local9] = (int) (Math.cos(local7 * (double) local9) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
