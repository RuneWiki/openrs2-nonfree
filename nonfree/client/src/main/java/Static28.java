import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray1 = new int[2][][];

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_10 = new Class73(22, 6);

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!gg;Z[[[BIB)Z")
	public static boolean method767(@OriginalArg(0) Class9_Sub4 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static525.aBoolean738) {
			return false;
		}
		@Pc(8) int local8 = arg0.anInt10360 >> Static606.anInt10280;
		@Pc(10) int local10 = local8;
		@Pc(15) int local15 = arg0.anInt10357 >> Static606.anInt10280;
		@Pc(17) int local17 = local15;
		if (arg0 instanceof Class9_Sub4_Sub2) {
			local10 = ((Class9_Sub4_Sub2) arg0).aShort117;
			local17 = ((Class9_Sub4_Sub2) arg0).aShort116;
			local8 = ((Class9_Sub4_Sub2) arg0).aShort115;
			local15 = ((Class9_Sub4_Sub2) arg0).aShort114;
		}
		for (@Pc(38) int local38 = local8; local38 <= local10; local38++) {
			for (@Pc(41) int local41 = local15; local41 <= local17; local41++) {
				if (arg0.aByte134 < Static618.anInt10427 && local38 >= Static530.anInt9217 && local38 < Static329.anInt6607 && local41 >= Static318.anInt6330 && local41 < Static67.anInt2301) {
					if ((arg2 == null || arg0.aByte135 < arg3 || arg2[arg0.aByte135][local38][local41] != arg4) && arg0.method8426() && !arg0.method8412(Static472.aClass5_14)) {
						return false;
					}
					if (!arg1 && local38 >= Static427.anInt7834 - 16 && local38 <= Static427.anInt7834 + 16 && local41 >= Static594.anInt10050 - 16 && local41 <= Static594.anInt10050 + 16) {
						if (Static640.aBoolean844) {
							Static512.aClass260Array1[Static444.anInt8038++].method6663(arg0);
							Static444.anInt8038 %= Static40.anInt1428;
						} else {
							arg0.method8423(Static472.aClass5_14);
						}
					}
				}
			}
		}
		return true;
	}
}
