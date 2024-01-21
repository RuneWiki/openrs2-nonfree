import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "[I")
	public static int[] anIntArray141 = new int[512];

	@OriginalMember(owner = "client!ia", name = "pb", descriptor = "[I")
	public static int[] anIntArray144 = new int[2048];

	@OriginalMember(owner = "client!ia", name = "mb", descriptor = "[I")
	public static int[] anIntArray142 = new int[2048];

	@OriginalMember(owner = "client!ia", name = "nb", descriptor = "[I")
	public static int[] anIntArray143 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray141[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray142[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray144[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray143[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
