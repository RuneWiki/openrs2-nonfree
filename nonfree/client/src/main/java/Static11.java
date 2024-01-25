import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Lclient!jf;")
	public static Class123 aClass123_5;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	public static int anInt3910 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIZI)V")
	public static void method3589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static279.anInt4940 = arg0;
		Static276.anInt4913 = arg3;
		Static78.anInt1505 = arg2;
		Static195.anInt3565 = arg1;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)V")
	public static void method3591(@OriginalArg(1) int arg0) {
		Static17.anInt416 = arg0;
		@Pc(7) Class154 local7 = Static350.aClass154_53;
		synchronized (Static350.aClass154_53) {
			Static350.aClass154_53.method3748();
		}
		local7 = Static329.aClass154_48;
		synchronized (Static329.aClass154_48) {
			Static329.aClass154_48.method3748();
		}
	}
}
