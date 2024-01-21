import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class51 {

	@OriginalMember(owner = "client!od", name = "q", descriptor = "[I")
	public static int[] anIntArray224 = new int[32];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public int anInt1970;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "I")
	public int anInt1971;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public int anInt1978;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	public int anInt1979;

	static {
		@Pc(14) int local14 = 2;
		for (@Pc(16) int local16 = 0; local16 < 32; local16++) {
			anIntArray224[local16] = local14 - 1;
			local14 += local14;
		}
	}
}
