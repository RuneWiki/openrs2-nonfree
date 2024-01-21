import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub1_Sub5_Sub4 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!v", name = "rb", descriptor = "[I")
	public static int[] anIntArray428 = new int[512];

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
	public static int[] anIntArray426 = new int[2048];

	@OriginalMember(owner = "client!v", name = "pb", descriptor = "[I")
	public static int[] anIntArray427 = new int[2048];

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "[I")
	public static int[] anIntArray429 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray428[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray426[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray427[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray429[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
