import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	public static int anInt4553;

	@OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
	public static int anInt4556;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "[I")
	public static final int[] anIntArray353 = new int[14];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	public static void method3708() {
		if (Static233.anInt4493 > 0) {
			Static378.method5234();
		} else {
			Static388.aClass27_4 = Static122.aClass27_1;
			Static122.aClass27_1 = null;
			Static293.method2805(40);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIII)V")
	public static void method3709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = Static439.method5863(arg1, Static163.anInt3488, Static161.anInt3448);
		@Pc(25) int local25 = Static439.method5863(arg4, Static163.anInt3488, Static161.anInt3448);
		@Pc(33) int local33 = Static439.method5863(arg2, Static450.anInt7594, Static142.anInt3212);
		@Pc(39) int local39 = Static439.method5863(arg3, Static450.anInt7594, Static142.anInt3212);
		for (@Pc(41) int local41 = local17; local41 <= local25; local41++) {
			Static15.method463(arg0, Static376.anIntArrayArray64[local41], local33, local39);
		}
	}
}
