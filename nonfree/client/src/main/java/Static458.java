import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
	public static int anInt7818 = -1;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
	public static int anInt7819 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIII)V")
	public static void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg4);
		@Pc(27) int local27 = Static22.method360(Static55.anInt1319, Static162.anInt1715, arg0);
		@Pc(33) int local33 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg1);
		@Pc(41) int local41 = Static22.method360(Static418.anInt3023, Static176.anInt3462, arg3);
		for (@Pc(43) int local43 = local11; local43 <= local27; local43++) {
			Static236.method3990(local41, local33, Static400.anIntArrayArray54[local43], arg2);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	public static void method6215(@OriginalArg(0) int arg0) {
		if (Static418.anIntArray250 == null || arg0 > Static418.anIntArray250.length) {
			Static418.anIntArray250 = new int[arg0];
		}
	}
}
