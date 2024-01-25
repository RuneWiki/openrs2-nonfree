import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!js", name = "m", descriptor = "I")
	public static int anInt3421;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method2769(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static375.method4933(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static345.method4479(local7);
			local7 = Static6.method94("%3a", local7, ":");
			local7 = Static6.method94("%40", local7, "@");
			local7 = Static6.method94("%26", local7, "&");
			local7 = Static6.method94("%23", local7, "#");
			if (Static253.aClass93_3.anApplet1 != null) {
				@Pc(107) Class268 local107 = Static253.aClass93_3.method2074(new URL(Static253.aClass93_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static182.anInt3091 + "&u=" + Static269.aLong130 + "&v1=" + Static144.aString23 + "&v2=" + Static144.aString25 + "&e=" + local7));
				while (local107.anInt7420 == 0) {
					Static140.method2004(1L);
				}
				if (local107.anInt7420 == 1) {
					@Pc(128) DataInputStream local128 = (DataInputStream) local107.anObject10;
					local128.read();
					local128.close();
				}
			}
		} catch (@Pc(135) Exception local135) {
		}
	}
}
