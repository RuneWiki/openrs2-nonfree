import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static417 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	public static int anInt7267;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method5814(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static186.method3392(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static19.method307(local7);
			local7 = Static10.method162("%3a", local7, ":");
			local7 = Static10.method162("%40", local7, "@");
			local7 = Static10.method162("%26", local7, "&");
			local7 = Static10.method162("%23", local7, "#");
			if (Static114.aClass255_2.anApplet1 != null) {
				@Pc(104) Class87 local104 = Static114.aClass255_2.method5840(new URL(Static114.aClass255_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static202.anInt3962 + "&u=" + Static145.aLong94 + "&v1=" + Static419.aString69 + "&v2=" + Static419.aString72 + "&e=" + local7));
				while (local104.anInt2679 == 0) {
					Static77.method1653(1L);
				}
				if (local104.anInt2679 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local104.anObject3;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method5815() {
		@Pc(4) Class83 local4 = Static408.aClass83_58;
		synchronized (Static408.aClass83_58) {
			Static408.aClass83_58.method2336();
		}
	}
}
