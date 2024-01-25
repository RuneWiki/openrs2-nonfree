import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "B")
	public static byte aByte22;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt1555 = -2;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_36 = new Class208(59, -2);

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
	public static int anInt1556 = 0;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "[I")
	public static final int[] anIntArray115 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIII)V")
	public static void method1263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static69.anInt1551 || Static317.anInt5793 > arg0) {
			return;
		}
		@Pc(23) boolean local23;
		if (Static179.anInt3768 > arg1) {
			local23 = false;
			arg1 = Static179.anInt3768;
		} else if (Static121.anInt6758 < arg1) {
			local23 = false;
			arg1 = Static121.anInt6758;
		} else {
			local23 = true;
		}
		@Pc(46) boolean local46;
		if (arg2 < Static179.anInt3768) {
			arg2 = Static179.anInt3768;
			local46 = false;
		} else if (Static121.anInt6758 >= arg2) {
			local46 = true;
		} else {
			local46 = false;
			arg2 = Static121.anInt6758;
		}
		if (Static317.anInt5793 > arg4) {
			arg4 = Static317.anInt5793;
		} else {
			Static307.method5019(Static152.anIntArrayArray30[arg4++], arg2, arg3, arg1);
		}
		if (arg0 <= Static69.anInt1551) {
			Static307.method5019(Static152.anIntArrayArray30[arg0--], arg2, arg3, arg1);
		} else {
			arg0 = Static69.anInt1551;
		}
		@Pc(107) int local107;
		if (local23 && local46) {
			for (local107 = arg4; local107 <= arg0; local107++) {
				@Pc(145) int[] local145 = Static152.anIntArrayArray30[local107];
				local145[arg1] = local145[arg2] = arg3;
			}
		} else if (local23) {
			for (local107 = arg4; local107 <= arg0; local107++) {
				Static152.anIntArrayArray30[local107][arg1] = arg3;
			}
		} else if (local46) {
			for (local107 = arg4; local107 <= arg0; local107++) {
				Static152.anIntArrayArray30[local107][arg2] = arg3;
			}
		}
	}
}
