import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eda")
public abstract class Class94 {

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "[I")
	public static final int[] anIntArray561 = new int[16384];

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "[I")
	public static final int[] anIntArray560 = new int[16384];

	static {
		@Pc(10) double local10 = 3.834951969714103E-4D;
		for (@Pc(12) int local12 = 0; local12 < 16384; local12++) {
			anIntArray561[local12] = (int) (Math.sin(local10 * (double) local12) * 16384.0D);
			anIntArray560[local12] = (int) (Math.cos((double) local12 * local10) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	protected Class94() {
	}
}
