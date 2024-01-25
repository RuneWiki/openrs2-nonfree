import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bja", name = "j", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_11 = new Class181(76, -1);

	@OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
	public static int anInt744 = -2;

	@OriginalMember(owner = "client!bja", name = "l", descriptor = "[I")
	public static final int[] anIntArray59 = new int[2048];

	@OriginalMember(owner = "client!bja", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString15 = null;

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(I)V")
	public static void method765(@OriginalArg(0) int arg0) {
		Static46.anInt746 = arg0;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V")
	public static void method767(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class112 local9 = Static26.aClass112Array1[99];
		for (@Pc(11) int local11 = 99; local11 > 0; local11--) {
			Static26.aClass112Array1[local11] = Static26.aClass112Array1[local11 - 1];
		}
		if (local9 == null) {
			local9 = new Class112(arg4, arg3, arg6, arg5, arg2, arg0, arg7, arg1);
		} else {
			local9.method2409(arg0, arg7, arg3, arg4, arg2, arg1, arg6, arg5);
		}
		Static36.anInt660 = Static278.anInt4551;
		Static73.anInt1144++;
		Static26.aClass112Array1[0] = local9;
	}
}
