import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method6178(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class114 local9 = Static339.aClass114Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static339.aClass114Array1[local11] = Static339.aClass114Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class114(arg3, arg1, arg2, arg5, arg0, arg6, arg4, arg7);
		} else {
			local9.method2834(arg0, arg5, arg4, arg2, arg3, arg1, arg7, arg6);
		}
		Static339.aClass114Array1[0] = local9;
		Static405.anInt10896++;
		Static27.anInt365 = Static55.anInt959;
	}
}
