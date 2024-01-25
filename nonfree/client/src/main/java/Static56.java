import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
	public static int anInt979;

	@OriginalMember(owner = "client!bm", name = "tc", descriptor = "[Lclient!go;")
	public static Class143[] aClass143Array1;

	@OriginalMember(owner = "client!bm", name = "hc", descriptor = "[I")
	public static final int[] anIntArray88 = new int[1];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!eu;B)Z")
	public static boolean method898(@OriginalArg(0) Class2_Sub21 arg0) {
		if (arg0 == null) {
			return true;
		}
		if (Static82.aClass2_Sub21_1 != arg0) {
			Static69.anInt1208 = 0;
			Static82.aClass2_Sub21_1 = arg0;
		}
		@Pc(25) Class2_Sub23_Sub5 local25 = Static442.aClass2_Sub23_Sub5_3;
		if (Static478.aClass2_Sub23_Sub5_4 != null) {
			local25 = Static478.aClass2_Sub23_Sub5_4;
		}
		if (Static69.anInt1208 == 0) {
			if (Static314.aClass6_1 == null) {
				Static314.aClass6_1 = new Class6(Static60.aClass254_34, Static59.aClass254_33);
			}
			local25.method7713();
			Static69.anInt1208 = 1;
		}
		if (Static69.anInt1208 == 1) {
			if (!local25.method7686(arg0, Static357.aClass254_101, Static314.aClass6_1)) {
				return false;
			}
			Static39.anInt535 = 0;
			Static82.aClass2_Sub21_1 = null;
			Static69.anInt1208 = 2;
		}
		return true;
	}
}
