import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
	public static int anInt3673;

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[6][];

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Z")
	public static boolean method3030(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 2 || arg0 == 59 || arg0 == 57 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method3031(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class175 local9 = Static70.aClass175Array1[99];
		for (@Pc(19) int local19 = 99; local19 > 0; local19--) {
			Static70.aClass175Array1[local19] = Static70.aClass175Array1[local19 - 1];
		}
		if (local9 == null) {
			local9 = new Class175(arg2, arg0, arg6, arg3, arg5, arg4, arg7, arg1);
		} else {
			local9.method3857(arg6, arg0, arg2, arg3, arg1, arg7, arg4, arg5);
		}
		Static37.anInt990++;
		Static70.aClass175Array1[0] = local9;
		Static513.anInt9020 = Static441.anInt7833;
	}
}
