import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
	public static int anInt10219;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray169;

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "Lclient!vd;")
	public static Class353 aClass353_136;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "[Lclient!tea;")
	public static final Class319[] aClass319Array1 = new Class319[4];

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "[I")
	public static int[] anIntArray616 = new int[1];

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method8645(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static339.method8375(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static441.method6829(local7);
			local7 = Static647.method9000(":", "%3a", local7);
			local7 = Static647.method9000("@", "%40", local7);
			local7 = Static647.method9000("&", "%26", local7);
			local7 = Static647.method9000("#", "%23", local7);
			if (Static554.anApplet3 == null) {
				return;
			}
			@Pc(104) Class328 local104 = Static413.aClass112_5.method3236(new URL(Static554.anApplet3.getCodeBase(), "clienterror.ws?c=" + Static380.anInt1859 + "&u=" + (Static142.aString29 == null ? String.valueOf(Static40.aLong22) : Static142.aString29) + "&v1=" + Static177.aString43 + "&v2=" + Static177.aString46 + "&e=" + local7));
			while (local104.anInt9389 == 0) {
				Static179.method3254(1L);
			}
			if (local104.anInt9389 == 1) {
				@Pc(127) DataInputStream local127 = (DataInputStream) local104.anObject21;
				local127.read();
				local127.close();
			}
		} catch (@Pc(134) Exception local134) {
		}
	}
}
