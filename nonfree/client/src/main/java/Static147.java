import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Lclient!qaa;")
	public static Class144 aClass144_1;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
	public static int anInt2822;

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_19 = new Class264(20);

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIBIII)V")
	public static void method2329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static370.anInt10475 < arg4 || Static468.anInt355 > arg0) {
			return;
		}
		@Pc(30) boolean local30;
		if (Static313.anInt9045 > arg3) {
			arg3 = Static313.anInt9045;
			local30 = false;
		} else if (Static575.anInt9879 >= arg3) {
			local30 = true;
		} else {
			local30 = false;
			arg3 = Static575.anInt9879;
		}
		@Pc(48) boolean local48;
		if (Static313.anInt9045 > arg2) {
			local48 = false;
			arg2 = Static313.anInt9045;
		} else if (arg2 <= Static575.anInt9879) {
			local48 = true;
		} else {
			local48 = false;
			arg2 = Static575.anInt9879;
		}
		if (Static468.anInt355 > arg4) {
			arg4 = Static468.anInt355;
		} else {
			Static679.method9323(Static274.anIntArrayArray34[arg4++], arg3, arg1, arg2);
		}
		if (Static370.anInt10475 >= arg0) {
			Static679.method9323(Static274.anIntArrayArray34[arg0--], arg3, arg1, arg2);
		} else {
			arg0 = Static370.anInt10475;
		}
		@Pc(109) int local109;
		if (local30 && local48) {
			for (local109 = arg4; local109 <= arg0; local109++) {
				@Pc(115) int[] local115 = Static274.anIntArrayArray34[local109];
				local115[arg3] = local115[arg2] = arg1;
			}
		} else if (local30) {
			for (local109 = arg4; local109 <= arg0; local109++) {
				Static274.anIntArrayArray34[local109][arg3] = arg1;
			}
		} else if (local48) {
			for (local109 = arg4; local109 <= arg0; local109++) {
				Static274.anIntArrayArray34[local109][arg2] = arg1;
			}
		}
	}
}
