import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public static int anInt3377;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!rb;")
	public static Class210 aClass210_2;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "[I")
	public static final int[] anIntArray183 = new int[6];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method2815(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static284.method3699(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static36.method612(local7);
			local7 = Static328.method4200(local7, ":", "%3a");
			local7 = Static328.method4200(local7, "@", "%40");
			local7 = Static328.method4200(local7, "&", "%26");
			local7 = Static328.method4200(local7, "#", "%23");
			if (Static357.aClass124_5.anApplet1 != null) {
				@Pc(106) Class215 local106 = Static357.aClass124_5.method2520(new URL(Static357.aClass124_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static236.anInt3837 + "&u=" + Static204.aLong101 + "&v1=" + Static191.aString30 + "&v2=" + Static191.aString29 + "&e=" + local7));
				while (local106.anInt5791 == 0) {
					Static252.method2874(1L);
				}
				if (local106.anInt5791 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local106.anObject10;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}
