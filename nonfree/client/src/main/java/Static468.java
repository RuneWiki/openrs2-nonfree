import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	public static int anInt8751;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	public static int anInt8769;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
	public static void method7192(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static52.method1284(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			Static258.method4584(local5);
			local5 = Static18.method744(":", local5, "%3a");
			local5 = Static18.method744("@", local5, "%40");
			local5 = Static18.method744("&", local5, "%26");
			local5 = Static18.method744("#", local5, "%23");
			if (Static586.anApplet4 != null) {
				@Pc(95) Class66 local95 = Static594.aClass326_6.method7790(new URL(Static586.anApplet4.getCodeBase(), "clienterror.ws?c=" + Static142.anInt3266 + "&u=" + Static148.aLong101 + "&v1=" + Static530.aString121 + "&v2=" + Static530.aString123 + "&e=" + local5));
				while (local95.anInt2308 == 0) {
					Static1.method125(1L);
				}
				if (local95.anInt2308 == 1) {
					@Pc(115) DataInputStream local115 = (DataInputStream) local95.anObject4;
					local115.read();
					local115.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public static void method7195() {
		if (Static537.aClass24_3 != null) {
			Static537.aClass24_3.method1125();
		}
		if (Static481.aClass24_1 != null) {
			Static481.aClass24_1.method1125();
		}
	}
}
