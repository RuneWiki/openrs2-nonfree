import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	public static int anInt7120;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!e;")
	public static Interface2 anInterface2_13;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public static void method5691() {
		Static318.aBoolean442 = false;
		Static134.anIntArray558 = null;
		Static572.anIntArray721 = null;
		Static348.anIntArray458 = null;
		Static487.anIntArray604 = null;
		Static507.anIntArray626 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method5693(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static166.method3819(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static363.method5391(local7);
			local7 = Static429.method6103(":", "%3a", local7);
			local7 = Static429.method6103("@", "%40", local7);
			local7 = Static429.method6103("&", "%26", local7);
			local7 = Static429.method6103("#", "%23", local7);
			if (Static312.anApplet2 != null) {
				@Pc(104) Class224 local104 = Static118.aClass313_51.method6995(new URL(Static312.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static282.anInt5205 + "&u=" + Static297.aLong123 + "&v1=" + Static508.aString76 + "&v2=" + Static508.aString78 + "&e=" + local7));
				while (local104.anInt6632 == 0) {
					Static183.method3079(1L);
				}
				if (local104.anInt6632 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local104.anObject14;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}
}
