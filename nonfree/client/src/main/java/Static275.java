import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	public static int anInt5502;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_54 = new Class144(56, -1);

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!kt;IIBII)V")
	public static void method4890(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		Static376.method5111(arg3, 0, arg1.anInt10694, arg1.aByte139, arg1.anInt10695);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Z")
	public static boolean method4891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method4893(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static471.method6410(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static97.method1968(local7);
			local7 = Static364.method5039(":", "%3a", local7);
			local7 = Static364.method5039("@", "%40", local7);
			local7 = Static364.method5039("&", "%26", local7);
			local7 = Static364.method5039("#", "%23", local7);
			if (Static159.anApplet2 != null) {
				@Pc(126) Class338 local126 = Static568.aClass47_6.method1393(new URL(Static159.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static344.anInt5516 + "&u=" + (Static293.aString60 == null ? String.valueOf(Static368.aLong198) : Static293.aString60) + "&v1=" + Static60.aString27 + "&v2=" + Static60.aString23 + "&e=" + local7));
				while (local126.anInt8934 == 0) {
					Static550.method7219(1L);
				}
				if (local126.anInt8934 == 1) {
					@Pc(156) DataInputStream local156 = (DataInputStream) local126.anObject16;
					local156.read();
					local156.close();
				}
			}
		} catch (@Pc(163) Exception local163) {
		}
	}
}
