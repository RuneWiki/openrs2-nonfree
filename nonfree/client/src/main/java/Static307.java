import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!fk;")
	public static Class85 aClass85_6;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_131 = new Class81(31, 2);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method4385(@OriginalArg(0) Class26 arg0) {
		if (Static417.aBoolean624) {
			Static53.method1029(arg0);
		} else {
			Static37.method710(arg0);
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIBIII)V")
	public static void method4387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg4 + 1;
		Static49.method990(Static277.anIntArrayArray40[arg4], arg1, arg2, arg3);
		@Pc(17) int local17 = arg0 - 1;
		Static49.method990(Static277.anIntArrayArray40[arg0], arg1, arg2, arg3);
		for (@Pc(25) int local25 = local4; local25 <= local17; local25++) {
			@Pc(31) int[] local31 = Static277.anIntArrayArray40[local25];
			local31[arg2] = local31[arg1] = arg3;
		}
	}
}
