import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method848(@OriginalArg(1) String arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static62.aStringArray16.length; local15++) {
			if (Static62.aStringArray16[local15].equalsIgnoreCase(arg0)) {
				return local15;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)V")
	public static void method849() {
		Static647.aClass251_1.method6713();
		Static429.aClass71_1.method7700();
		Static119.aClient1.method1353();
		Static271.aCanvas6.setBackground(Color.black);
		Static495.anInt8594 = -1;
		Static647.aClass251_1 = Static72.method1291(Static271.aCanvas6);
		Static429.aClass71_1 = Static538.method7913(Static271.aCanvas6);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIIIII)V")
	public static void method850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 - arg5;
		@Pc(14) int local14 = arg2 + arg5;
		for (@Pc(16) int local16 = arg2; local16 < local14; local16++) {
			Static312.method5228(arg4, Static484.anIntArrayArray41[local16], arg3, arg6);
		}
		@Pc(39) int local39 = arg3 - arg5;
		@Pc(44) int local44 = arg6 + arg5;
		for (@Pc(46) int local46 = arg0; local46 > local9; local46--) {
			Static312.method5228(arg4, Static484.anIntArrayArray41[local46], arg3, arg6);
		}
		for (@Pc(62) int local62 = local14; local62 <= local9; local62++) {
			@Pc(68) int[] local68 = Static484.anIntArrayArray41[local62];
			Static312.method5228(arg4, local68, local44, arg6);
			Static312.method5228(arg1, local68, local39, local44);
			Static312.method5228(arg4, local68, arg3, local39);
		}
	}
}
