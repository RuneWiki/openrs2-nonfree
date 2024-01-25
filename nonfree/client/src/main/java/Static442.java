import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "[I")
	public static int[] anIntArray463;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "[I")
	public static int[] anIntArray464;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "Lclient!wha;")
	public static Class388 aClass388_1;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_148 = new Class126(130, -1);

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	public static int anInt7680 = 0;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "([BB)Z")
	public static boolean method6429(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub17 local8 = new Class3_Sub17(arg0);
		@Pc(12) int local12 = local8.method4888();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method4888() == 1;
		if (local28) {
			Static221.method3457(local8);
		}
		Static426.method6084(local8);
		return true;
	}
}
