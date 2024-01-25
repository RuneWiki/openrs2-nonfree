import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!vca", name = "B", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_269 = new Class88("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!vca", name = "N", descriptor = "I")
	public static int anInt9156 = -1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method7541(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static211.method3965(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static544.method7977(local7);
			local7 = Static365.method5698("%3a", local7, ":");
			local7 = Static365.method5698("%40", local7, "@");
			local7 = Static365.method5698("%26", local7, "&");
			local7 = Static365.method5698("%23", local7, "#");
			if (Static239.aClass71_2.anApplet1 != null) {
				@Pc(104) Class55 local104 = Static239.aClass71_2.method1973(new URL(Static239.aClass71_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static505.anInt9096 + "&u=" + Static293.aLong222 + "&v1=" + Static92.aString15 + "&v2=" + Static92.aString20 + "&e=" + local7));
				while (local104.anInt1481 == 0) {
					Static17.method388(1L);
				}
				if (local104.anInt1481 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local104.anObject5;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "([FBI)[F")
	public static float[] method7542(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float[] local14 = new float[arg1];
		Static554.method3500(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
