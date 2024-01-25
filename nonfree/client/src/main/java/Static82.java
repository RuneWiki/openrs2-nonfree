import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_41 = new Class36(43, 3);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIBIII)V")
	public static void method1416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg3 + 1;
		Static335.method4533(arg4, arg1, arg0, Static162.anIntArrayArray58[arg3]);
		@Pc(21) int local21 = arg2 - 1;
		Static335.method4533(arg4, arg1, arg0, Static162.anIntArrayArray58[arg2]);
		for (@Pc(25) int local25 = local12; local25 <= local21; local25++) {
			@Pc(36) int[] local36 = Static162.anIntArrayArray58[local25];
			local36[arg0] = local36[arg4] = arg1;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBIZI)V")
	public static void method1419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static286.anInt5207 == 0) {
			Static455.method5875(false);
		} else {
			Static214.anInt4016 = Static286.anInt5207;
			Static435.method5598(0);
		}
		Static65.anInt1633 = arg3;
		Static299.anInt5399 = arg1;
		Static450.aBoolean499 = arg2;
		Static137.method4294(arg0);
	}
}
