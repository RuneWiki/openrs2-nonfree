import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "Lclient!mb;")
	public static final Class220 aClass220_9 = new Class220();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method5094(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static329.method4760(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static121.method1726(local7);
			local7 = Static287.method4080(local7, ":", "%3a");
			local7 = Static287.method4080(local7, "@", "%40");
			local7 = Static287.method4080(local7, "&", "%26");
			local7 = Static287.method4080(local7, "#", "%23");
			if (Static18.anApplet3 == null) {
				return;
			}
			@Pc(97) Class5 local97 = Static172.aClass99_3.method1784(new URL(Static18.anApplet3.getCodeBase(), "clienterror.ws?c=" + Static281.anInt4824 + "&u=" + Static593.aLong271 + "&v1=" + Static132.aString32 + "&v2=" + Static132.aString26 + "&e=" + local7));
			while (local97.anInt151 == 0) {
				Static263.method3671(1L);
			}
			if (local97.anInt151 == 1) {
				@Pc(113) DataInputStream local113 = (DataInputStream) local97.anObject1;
				local113.read();
				local113.close();
			}
		} catch (@Pc(120) Exception local120) {
		}
	}
}
