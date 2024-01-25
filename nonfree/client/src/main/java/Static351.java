import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public static int anInt5574;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!rr;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_55 = new Class144(24, 7);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "Z")
	public static boolean aBoolean362 = false;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIBII)V")
	public static void method4933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 > Static334.anInt5381 || arg0 < Static549.anInt5294) {
			return;
		}
		@Pc(26) boolean local26;
		if (Static82.anInt1902 > arg2) {
			arg2 = Static82.anInt1902;
			local26 = false;
		} else if (Static77.anInt1737 < arg2) {
			arg2 = Static77.anInt1737;
			local26 = false;
		} else {
			local26 = true;
		}
		@Pc(50) boolean local50;
		if (Static82.anInt1902 > arg1) {
			local50 = false;
			arg1 = Static82.anInt1902;
		} else if (Static77.anInt1737 >= arg1) {
			local50 = true;
		} else {
			local50 = false;
			arg1 = Static77.anInt1737;
		}
		if (arg3 >= Static549.anInt5294) {
			Static202.method3077(Static118.anIntArrayArray7[arg3++], arg2, arg4, arg1);
		} else {
			arg3 = Static549.anInt5294;
		}
		if (Static334.anInt5381 < arg0) {
			arg0 = Static334.anInt5381;
		} else {
			Static202.method3077(Static118.anIntArrayArray7[arg0--], arg2, arg4, arg1);
		}
		@Pc(127) int local127;
		if (local26 && local50) {
			for (local127 = arg3; local127 <= arg0; local127++) {
				@Pc(181) int[] local181 = Static118.anIntArrayArray7[local127];
				local181[arg2] = local181[arg1] = arg4;
			}
		} else if (local26) {
			for (local127 = arg3; local127 <= arg0; local127++) {
				Static118.anIntArrayArray7[local127][arg2] = arg4;
			}
		} else if (local50) {
			for (local127 = arg3; local127 <= arg0; local127++) {
				Static118.anIntArrayArray7[local127][arg1] = arg4;
			}
		}
	}
}
