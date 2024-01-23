import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "[I")
	public static int[] anIntArray587;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public static int anInt5013 = 0;

	@OriginalMember(owner = "client!sg", name = "y", descriptor = "[Lclient!pi;")
	public static Class133[] aClass133Array2 = new Class133[14];

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
	public static void method3850() {
		Static224.anInt4696++;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIII)I")
	public static int method3852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg2 - 1 & arg1;
		@Pc(13) int local13 = arg0 / arg2;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(28) int local28 = Static198.method3034(local13, local17);
		@Pc(35) int local35 = Static198.method3034(local13, local17 + 1);
		@Pc(42) int local42 = Static198.method3034(local13 + 1, local17);
		@Pc(51) int local51 = Static198.method3034(local13 + 1, local17 + 1);
		@Pc(66) int local66 = Static293.method4496(local35, arg2, local28, local9);
		@Pc(73) int local73 = Static293.method4496(local51, arg2, local42, local9);
		return Static293.method4496(local73, arg2, local66, local23);
	}
}
