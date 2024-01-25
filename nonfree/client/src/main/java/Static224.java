import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;I)V")
	public static void method3527(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7) {
		@Pc(13) Class359 local13 = Static413.aClass359Array1[99];
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static413.aClass359Array1[local15] = Static413.aClass359Array1[local15 - 1];
		}
		if (local13 == null) {
			local13 = new Class359(arg5, arg6, arg4, arg1, arg0, arg2, arg3, arg7);
		} else {
			local13.method7759(arg6, arg1, arg3, arg5, arg4, arg0, arg2, arg7);
		}
		Static413.aClass359Array1[0] = local13;
		Static389.anInt410++;
		Static360.anInt6250 = Static109.anInt2171;
	}
}
