import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method3320(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 512 || arg2 < 512 || arg0 > (Static26.anInt462 - 2) * 512 || (Static445.anInt6140 - 2) * 512 < arg2) {
			Static599.anIntArray449[0] = Static599.anIntArray449[1] = -1;
			return;
		}
		@Pc(43) int local43 = Static152.method2434(arg0, arg3, arg2) - arg4;
		if (Static128.aBoolean202) {
			Static505.method7392(true);
		} else {
			Static551.aClass26_7.method6443(arg5, 0, 0);
			Static677.aClass137_47.method7950(Static551.aClass26_7);
		}
		if (Static401.aBoolean511) {
			Static677.aClass137_47.HA(arg0, local43, arg2, Static331.anInt6277, Static599.anIntArray449);
		} else {
			Static677.aClass137_47.da(arg0, local43, arg2, Static599.anIntArray449);
		}
		if (Static128.aBoolean202) {
			Static279.method4042();
		} else {
			Static551.aClass26_7.method6443(-arg5, 0, 0);
			Static677.aClass137_47.method7950(Static551.aClass26_7);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ha;Lclient!mea;I)V")
	public static void method3323(@OriginalArg(0) Class137 arg0, @OriginalArg(1) Class230 arg1) {
		@Pc(35) boolean local35 = Static175.aClass247_2.method5957(arg1.aBoolean471 ? Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aClass325_1 : null, arg1.anInt6646, arg1.anInt6712, arg0, arg1.anInt6692, arg1.anInt6721, arg1.anInt6698 | 0xFF000000) == null;
		if (local35) {
			Static231.aClass262_20.method6314(new Class14_Sub47(arg1.anInt6646, arg1.anInt6692, arg1.anInt6712, arg1.anInt6698 | 0xFF000000, arg1.anInt6721, arg1.aBoolean471));
			Static634.method8860(arg1);
		}
	}
}
