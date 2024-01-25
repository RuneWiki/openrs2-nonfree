import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public static int anInt6523;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method5607(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static537.method3878(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static514.method6876(local7);
			local7 = Static85.method1848("%3a", local7, ":");
			local7 = Static85.method1848("%40", local7, "@");
			local7 = Static85.method1848("%26", local7, "&");
			local7 = Static85.method1848("%23", local7, "#");
			if (Static233.anApplet3 != null) {
				@Pc(101) Class192 local101 = Static547.aClass221_12.method5195(new URL(Static233.anApplet3.getCodeBase(), "clienterror.ws?c=" + Static515.anInt3451 + "&u=" + Static354.aLong176 + "&v1=" + Static342.aString81 + "&v2=" + Static342.aString86 + "&e=" + local7));
				while (local101.anInt5186 == 0) {
					Static374.method5521(1L);
				}
				if (local101.anInt5186 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local101.anObject30;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}
}
