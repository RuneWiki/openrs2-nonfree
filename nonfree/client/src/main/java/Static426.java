import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "[Lclient!uf;")
	public static Class239[] aClass239Array1 = new Class239[50];

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIIIII)V")
	public static void method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg2);
		@Pc(17) int local17 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg5);
		@Pc(23) int local23 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg6);
		@Pc(29) int local29 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg0);
		@Pc(37) int local37 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg2 + arg1);
		@Pc(46) int local46 = Static248.method3569(Static357.anInt6537, Static85.anInt1517, arg5 - arg1);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static23.method323(Static283.anIntArrayArray30[local48], local23, arg3, local29);
		}
		for (@Pc(66) int local66 = local17; local66 > local46; local66--) {
			Static23.method323(Static283.anIntArrayArray30[local66], local23, arg3, local29);
		}
		@Pc(88) int local88 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg1 + arg6);
		@Pc(97) int local97 = Static248.method3569(Static47.anInt762, Static60.anInt1086, arg0 - arg1);
		for (@Pc(99) int local99 = local37; local99 <= local46; local99++) {
			@Pc(110) int[] local110 = Static283.anIntArrayArray30[local99];
			Static23.method323(local110, local23, arg3, local88);
			Static23.method323(local110, local88, arg4, local97);
			Static23.method323(local110, local97, arg3, local29);
		}
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
	public static void method5750() {
		if (Static261.aClass159_6 == null) {
			return;
		}
		if (Static261.aClass159_6.anInt4271 == 1) {
			Static261.aClass159_6 = null;
			return;
		}
		if (Static261.aClass159_6.anInt4271 == 2) {
			Static26.method374(2, Static308.aClass42_7, Static363.aString76);
			Static261.aClass159_6 = null;
			return;
		}
	}
}
