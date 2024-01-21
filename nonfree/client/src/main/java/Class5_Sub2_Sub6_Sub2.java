import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class5_Sub2_Sub6_Sub2 extends Class5_Sub2_Sub6 {

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "[I")
	public static int[] anIntArray360 = new int[2048];

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "[I")
	public static int[] anIntArray364 = new int[2048];

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "[I")
	public static int[] anIntArray362 = new int[2048];

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "[I")
	public static int[] anIntArray361 = new int[512];

	static {
		for (@Pc(26) int local26 = 1; local26 < 512; local26++) {
			anIntArray361[local26] = 32768 / local26;
		}
		for (@Pc(39) int local39 = 1; local39 < 2048; local39++) {
			anIntArray364[local39] = 65536 / local39;
		}
		for (@Pc(52) int local52 = 0; local52 < 2048; local52++) {
			anIntArray360[local52] = (int) (Math.sin((double) local52 * 0.0030679615D) * 65536.0D);
			anIntArray362[local52] = (int) (Math.cos((double) local52 * 0.0030679615D) * 65536.0D);
		}
	}
}
