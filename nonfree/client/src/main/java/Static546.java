import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
	public static int anInt10354;

	@OriginalMember(owner = "client!saa", name = "y", descriptor = "Z")
	public static boolean aBoolean727 = false;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIII)V")
	public static void method8869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static281.anInt5188 || arg2 < Static410.anInt7068) {
			return;
		}
		@Pc(42) boolean local42;
		if (arg1 < Static468.anInt7895) {
			arg1 = Static468.anInt7895;
			local42 = false;
		} else if (arg1 > Static382.anInt6719) {
			local42 = false;
			arg1 = Static382.anInt6719;
		} else {
			local42 = true;
		}
		@Pc(71) boolean local71;
		if (Static468.anInt7895 > arg3) {
			local71 = false;
			arg3 = Static468.anInt7895;
		} else if (Static382.anInt6719 < arg3) {
			local71 = false;
			arg3 = Static382.anInt6719;
		} else {
			local71 = true;
		}
		if (Static410.anInt7068 > arg0) {
			arg0 = Static410.anInt7068;
		} else {
			Static240.method4038(arg3, Static144.anIntArrayArray30[arg0++], arg4, arg1);
		}
		if (Static281.anInt5188 >= arg2) {
			Static240.method4038(arg3, Static144.anIntArrayArray30[arg2--], arg4, arg1);
		} else {
			arg2 = Static281.anInt5188;
		}
		@Pc(135) int local135;
		if (local42 && local71) {
			for (local135 = arg0; local135 <= arg2; local135++) {
				@Pc(141) int[] local141 = Static144.anIntArrayArray30[local135];
				local141[arg1] = local141[arg3] = arg4;
			}
		} else if (local42) {
			for (local135 = arg0; local135 <= arg2; local135++) {
				Static144.anIntArrayArray30[local135][arg1] = arg4;
			}
		} else if (local71) {
			for (local135 = arg0; local135 <= arg2; local135++) {
				Static144.anIntArrayArray30[local135][arg3] = arg4;
			}
			return;
		}
	}
}
