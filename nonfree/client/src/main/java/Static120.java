import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Lclient!js;")
	public static Class123 aClass123_2;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "Lclient!la;")
	public static final Class136 aClass136_59 = new Class136(112, 6);

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	public static int anInt2109 = -1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIII)V")
	public static void method1925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static39.aClass79_Sub1_1.anInt2158 != 0 && arg1 != 0 && Static139.anInt2476 < 50 && arg0 != -1) {
			Static342.aClass216Array1[Static139.anInt2476++] = new Class216((byte) 1, arg0, arg1, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1926(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static310.method4365(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static343.method4802(local7);
			local7 = Static394.method5443(":", "%3a", local7);
			local7 = Static394.method5443("@", "%40", local7);
			local7 = Static394.method5443("&", "%26", local7);
			local7 = Static394.method5443("#", "%23", local7);
			if (Static106.aClass51_5.anApplet1 != null) {
				@Pc(99) Class181 local99 = Static106.aClass51_5.method1366(new URL(Static106.aClass51_5.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static332.anInt5532 + "&u=" + Static79.aLong55 + "&v1=" + Static75.aString21 + "&v2=" + Static75.aString15 + "&e=" + local7));
				while (local99.anInt5298 == 0) {
					Static83.method1499(1L);
				}
				if (local99.anInt5298 == 1) {
					@Pc(115) DataInputStream local115 = (DataInputStream) local99.anObject7;
					local115.read();
					local115.close();
				}
			}
		} catch (@Pc(122) Exception local122) {
		}
	}
}
