import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class3_Sub1_Sub1_Sub2 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
	public static int[] anIntArray186 = new int[2048];

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "[I")
	public static int[] anIntArray188 = new int[512];

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "[I")
	public static int[] anIntArray191 = new int[2048];

	@OriginalMember(owner = "client!me", name = "mb", descriptor = "[I")
	public static int[] anIntArray189 = new int[2048];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray188[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray191[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray186[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray189[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
