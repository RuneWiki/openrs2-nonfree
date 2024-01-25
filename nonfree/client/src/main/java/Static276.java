import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray49;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
	public static int anInt10228 = 0;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIILclient!pa;)V")
	public static void method8469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub1_Sub2 arg3) {
		@Pc(4) Class226 local4 = Static288.method4659(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass28_Sub1_Sub2_1 = arg3;
		@Pc(16) int local16 = Static495.aClass109Array4 == Static111.aClass109Array3 ? 1 : 0;
		if (arg3.method8963()) {
			if (arg3.method8965()) {
				arg3.aClass28_Sub1_23 = Static135.aClass28_Sub1Array2[local16];
				Static135.aClass28_Sub1Array2[local16] = arg3;
				return;
			}
			arg3.aClass28_Sub1_23 = Static654.aClass28_Sub1Array5[local16];
			Static654.aClass28_Sub1Array5[local16] = arg3;
			Static375.aBoolean591 = true;
			return;
		}
		arg3.aClass28_Sub1_23 = Static110.aClass28_Sub1Array1[local16];
		Static110.aClass28_Sub1Array1[local16] = arg3;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIII)Z")
	public static boolean method8471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static151.aClass254_3.method7355(arg0, arg2, arg1, Static653.anIntArray599);
		@Pc(13) int local13 = Static653.anIntArray599[2];
		if (local13 < 50) {
			return false;
		} else {
			Static653.anIntArray599[0] = Static222.anInt4111 + Static268.anInt4963 * Static653.anIntArray599[0] / local13;
			Static653.anIntArray599[1] = Static655.anInt10580 + Static258.anInt4782 * Static653.anIntArray599[1] / local13;
			Static653.anIntArray599[2] = local13;
			return true;
		}
	}
}
