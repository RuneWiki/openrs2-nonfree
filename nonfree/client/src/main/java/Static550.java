import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!to", name = "vb", descriptor = "I")
	public static int anInt9875 = -1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public static void method8230(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(9) Class242 local9 = Static608.aClass242Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static608.aClass242Array1[local11] = Static608.aClass242Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class242(arg5, arg6, arg3, arg0, arg7, arg4, arg2, arg1);
		} else {
			local9.method6491(arg5, arg6, arg7, arg0, arg4, arg2, arg3, arg1);
		}
		Static608.aClass242Array1[0] = local9;
		Static328.anInt6626 = Static7.anInt132;
		Static13.anInt195++;
	}
}
