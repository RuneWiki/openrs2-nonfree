import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!jq", name = "V", descriptor = "Lclient!ha;")
	public static Class2 aClass2_27;

	@OriginalMember(owner = "client!jq", name = "Yc", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!jq", name = "ic", descriptor = "I")
	public static int anInt4709 = 0;

	@OriginalMember(owner = "client!jq", name = "ed", descriptor = "[Lclient!taa;")
	public static Class185_Sub1[] aClass185_Sub1Array1 = new Class185_Sub1[0];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V")
	public static void method4047() {
		if (Static145.aClass21_4 != Static247.aClass21_5) {
			try {
				Static557.method5219("tbrefresh", Static230.aClient2);
			} catch (@Pc(18) Throwable local18) {
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
	public static void method4051(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static530.method7337(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static250.method4228(local7);
			local7 = Static508.method7025(":", local7, "%3a");
			local7 = Static508.method7025("@", local7, "%40");
			local7 = Static508.method7025("&", local7, "%26");
			local7 = Static508.method7025("#", local7, "%23");
			if (Static52.aClass102_2.anApplet1 != null) {
				@Pc(103) Class157 local103 = Static52.aClass102_2.method2396(new URL(Static52.aClass102_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static318.anInt5845 + "&u=" + Static360.aLong280 + "&v1=" + Static151.aString29 + "&v2=" + Static151.aString24 + "&e=" + local7));
				while (local103.anInt4742 == 0) {
					Static209.method3565(1L);
				}
				if (local103.anInt4742 == 1) {
					@Pc(119) DataInputStream local119 = (DataInputStream) local103.anObject12;
					local119.read();
					local119.close();
				}
			}
		} catch (@Pc(126) Exception local126) {
		}
	}
}
