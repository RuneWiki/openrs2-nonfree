import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public static int anInt8450;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString98 = "";

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method6954(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) String arg5, @OriginalArg(7) String arg6) {
		@Pc(9) Class227 local9 = Static80.aClass227Array3[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static80.aClass227Array3[local11] = Static80.aClass227Array3[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class227(arg3, arg0, arg1, arg6, arg4, arg2, arg5);
		} else {
			local9.method5478(arg0, arg3, arg1, arg6, arg5, arg4, arg2);
		}
		Static7.anInt9361 = Static413.anInt7729;
		Static80.aClass227Array3[0] = local9;
		Static98.anInt2284++;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	public static void method6961(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static122.anInt2825 = -1;
		Static445.anInt8114 = 1;
		Static331.method5281(false, arg0, arg1);
	}
}
