import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!wt", name = "L", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!wt", name = "S", descriptor = "I")
	public static int anInt6749;

	@OriginalMember(owner = "client!wt", name = "T", descriptor = "I")
	public static int anInt6750 = 0;

	@OriginalMember(owner = "client!wt", name = "U", descriptor = "I")
	public static int anInt6751 = 104;

	@OriginalMember(owner = "client!wt", name = "Y", descriptor = "Lclient!ms;")
	public static Class155 aClass155_39 = null;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIII)V")
	public static void method5754(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static345.anInt6084 < arg2 || arg3 < Static313.anInt5542) {
			return;
		}
		@Pc(20) boolean local20;
		if (arg0 < Static332.anInt5823) {
			local20 = false;
			arg0 = Static332.anInt5823;
		} else if (Static202.anInt3722 >= arg0) {
			local20 = true;
		} else {
			arg0 = Static202.anInt3722;
			local20 = false;
		}
		@Pc(47) boolean local47;
		if (arg4 < Static332.anInt5823) {
			arg4 = Static332.anInt5823;
			local47 = false;
		} else if (Static202.anInt3722 >= arg4) {
			local47 = true;
		} else {
			arg4 = Static202.anInt3722;
			local47 = false;
		}
		if (arg2 >= Static313.anInt5542) {
			Static264.method4096(Static267.anIntArrayArray38[arg2++], arg1, arg4, arg0);
		} else {
			arg2 = Static313.anInt5542;
		}
		if (arg3 <= Static345.anInt6084) {
			Static264.method4096(Static267.anIntArrayArray38[arg3--], arg1, arg4, arg0);
		} else {
			arg3 = Static345.anInt6084;
		}
		@Pc(107) int local107;
		if (local20 && local47) {
			for (local107 = arg2; local107 <= arg3; local107++) {
				@Pc(151) int[] local151 = Static267.anIntArrayArray38[local107];
				local151[arg0] = local151[arg4] = arg1;
			}
		} else if (local20) {
			for (local107 = arg2; local107 <= arg3; local107++) {
				Static267.anIntArrayArray38[local107][arg0] = arg1;
			}
		} else if (local47) {
			for (local107 = arg2; local107 <= arg3; local107++) {
				Static267.anIntArrayArray38[local107][arg4] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method5760(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static168.method2732(arg0, "%0a", "\n"));
	}
}
