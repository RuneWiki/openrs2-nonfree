import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!lga;")
	public static Class223 aClass223_35;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public static int anInt3556;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray61;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "[I")
	public static final int[] anIntArray191 = new int[4096];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)I")
	public static int method3341(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (arg0 * local25 >> 12) + 40960;
		return local33 * local19 >> 12;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public static void method3342() {
		Static625.aClass359_66.method8507();
	}
}
