import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Z")
	public static boolean aBoolean657;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array212;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt7645 = 0;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_244 = new Class189("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method5974(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static362.method4779(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			Static219.method3314(local5);
			local5 = Static413.method5299(local5, ":", "%3a");
			local5 = Static413.method5299(local5, "@", "%40");
			local5 = Static413.method5299(local5, "&", "%26");
			local5 = Static413.method5299(local5, "#", "%23");
			if (Static217.aClass143_3.anApplet1 != null) {
				@Pc(97) Class43 local97 = Static217.aClass143_3.method3392(new URL(Static217.aClass143_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static354.anInt6028 + "&u=" + Static455.aLong235 + "&v1=" + Static227.aString27 + "&v2=" + Static227.aString29 + "&e=" + local5));
				while (local97.anInt1521 == 0) {
					Static360.method4758(1L);
				}
				if (local97.anInt1521 == 1) {
					@Pc(114) DataInputStream local114 = (DataInputStream) local97.anObject3;
					local114.read();
					local114.close();
				}
			}
		} catch (@Pc(121) Exception local121) {
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z")
	public static boolean method5976() {
		return Static158.anInt3162 > 0;
	}
}
