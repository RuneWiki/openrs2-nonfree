import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class207 {

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
	public static final int[] anIntArray697 = new int[16384];

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	public static final int[] anIntArray698 = new int[16384];

	static {
		@Pc(48) double local48 = 3.834951969714103E-4D;
		for (@Pc(50) int local50 = 0; local50 < 16384; local50++) {
			anIntArray697[local50] = (int) (Math.sin(local48 * (double) local50) * 32768.0D);
			anIntArray698[local50] = (int) (Math.cos(local48 * (double) local50) * 32768.0D);
		}
	}
}
