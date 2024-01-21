import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class6_Sub2_Sub2_Sub3 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "[I")
	public static int[] anIntArray75 = new int[512];

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "[I")
	public static int[] anIntArray74 = new int[2048];

	@OriginalMember(owner = "client!ga", name = "nb", descriptor = "[I")
	public static int[] anIntArray73 = new int[2048];

	@OriginalMember(owner = "client!ga", name = "wb", descriptor = "[I")
	public static int[] anIntArray77 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray75[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray74[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray77[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray73[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
