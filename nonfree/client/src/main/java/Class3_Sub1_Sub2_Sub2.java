import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "[I")
	public static int[] anIntArray98 = new int[2048];

	@OriginalMember(owner = "client!ec", name = "Y", descriptor = "[I")
	public static int[] anIntArray97 = new int[2048];

	@OriginalMember(owner = "client!ec", name = "jb", descriptor = "[I")
	public static int[] anIntArray100 = new int[512];

	@OriginalMember(owner = "client!ec", name = "mb", descriptor = "[I")
	public static int[] anIntArray101 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray100[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray97[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray101[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray98[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
