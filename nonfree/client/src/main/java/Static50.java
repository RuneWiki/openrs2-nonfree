import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
	public static int anInt1047;

	@OriginalMember(owner = "client!bq", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	public static int anInt1048 = -1;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "[I")
	public static final int[] anIntArray85 = new int[4096];

	@OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
	public static int anInt1058 = -1;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!hg;B)V")
	public static void method814(@OriginalArg(0) Class13_Sub1_Sub1_Sub1 arg0) {
		@Pc(16) int local16 = arg0.anInt4619 - Static262.anInt5597;
		@Pc(27) int local27 = arg0.anInt4594 * 512 + arg0.method3950() * 256;
		@Pc(38) int local38 = arg0.anInt4590 * 512 + arg0.method3950() * 256;
		arg0.anInt10090 += (local27 - arg0.anInt10090) / local16;
		arg0.anInt4640 = 0;
		arg0.anInt10089 += (local38 - arg0.anInt10089) / local16;
		if (arg0.anInt4571 == 0) {
			arg0.method3956(8192);
		}
		if (arg0.anInt4571 == 1) {
			arg0.method3956(12288);
		}
		if (arg0.anInt4571 == 2) {
			arg0.method3956(0);
		}
		if (arg0.anInt4571 == 3) {
			arg0.method3956(4096);
		}
	}
}
