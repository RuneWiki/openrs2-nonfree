import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class353 {

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "[I")
	public static final int[] anIntArray681 = new int[16384];

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "[I")
	public static final int[] anIntArray682 = new int[16384];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	public int anInt9765;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public int anInt9767;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public int anInt9768;

	static {
		@Pc(12) double local12 = 3.834951969714103E-4D;
		for (@Pc(14) int local14 = 0; local14 < 16384; local14++) {
			anIntArray681[local14] = (int) (Math.sin((double) local14 * local12) * 16384.0D);
			anIntArray682[local14] = (int) (Math.cos((double) local14 * local12) * 16384.0D);
		}
	}
}
