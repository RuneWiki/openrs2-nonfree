import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!pja;")
	public static Class6_Sub4_Sub12 aClass6_Sub4_Sub12_4;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!ae;")
	public static Class8 aClass8_131;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;BILjava/lang/String;I)V")
	public static void method8154(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7) {
		@Pc(13) Class277 local13 = Static558.aClass277Array1[99];
		for (@Pc(15) int local15 = 99; local15 > 0; local15--) {
			Static558.aClass277Array1[local15] = Static558.aClass277Array1[local15 - 1];
		}
		if (local13 == null) {
			local13 = new Class277(arg5, arg7, arg1, arg3, arg0, arg6, arg2, arg4);
		} else {
			local13.method6861(arg7, arg1, arg2, arg3, arg0, arg6, arg5, arg4);
		}
		Static339.anInt5859++;
		Static558.aClass277Array1[0] = local13;
		Static500.anInt8447 = Static94.anInt1719;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Z")
	public static boolean method8155(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
