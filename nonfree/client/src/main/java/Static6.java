import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	public static int anInt4960;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!vd;")
	public static Class178 aClass178_8;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public static int anInt4958 = 0;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Z")
	public static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString189 = "cyan:";

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
	public static void method4140(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static159.method2719(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static212.method3492(local7);
			local7 = Static100.method4620(local7, ":", "%3a");
			local7 = Static100.method4620(local7, "@", "%40");
			local7 = Static100.method4620(local7, "&", "%26");
			local7 = Static100.method4620(local7, "#", "%23");
			if (Static17.aClass176_1.anApplet1 == null) {
				return;
			}
			@Pc(104) Class153 local104 = Static17.aClass176_1.method4366(new URL(Static17.aClass176_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static31.anInt570 + "&u=" + Static215.aLong152 + "&v1=" + Static290.aString207 + "&v2=" + Static290.aString204 + "&e=" + local7));
			while (local104.anInt4614 == 0) {
				Static16.method242(1L);
			}
			if (local104.anInt4614 == 1) {
				@Pc(124) DataInputStream local124 = (DataInputStream) local104.anObject6;
				local124.read();
				local124.close();
			}
		} catch (@Pc(131) Exception local131) {
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!nm;I)V")
	public static void method4141(@OriginalArg(0) Class119 arg0) {
		Static315.aClass119_97 = arg0;
	}
}
