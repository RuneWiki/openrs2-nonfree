import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "J")
	public static long aLong111;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[8];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method3450(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static444.method6841(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static581.method8259(local7);
			local7 = Static395.method6258(":", local7, "%3a");
			local7 = Static395.method6258("@", local7, "%40");
			local7 = Static395.method6258("&", local7, "%26");
			local7 = Static395.method6258("#", local7, "%23");
			if (Static401.anApplet2 != null) {
				@Pc(104) Class234 local104 = Static358.aClass354_3.method8218(new URL(Static401.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static278.anInt5702 + "&u=" + Static578.aLong263 + "&v1=" + Static576.aString99 + "&v2=" + Static576.aString98 + "&e=" + local7));
				while (local104.anInt6717 == 0) {
					Static63.method1019(1L);
				}
				if (local104.anInt6717 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local104.anObject16;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!dc;I)V")
	public static void method3453(@OriginalArg(1) Class4_Sub11_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static70.anInt1211 = 0;
		Static538.aBoolean618 = false;
		Static432.method6757(arg0);
		Static208.method3464(arg0);
		if (Static538.aBoolean618) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt5831 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt5831 + " psize:" + arg1);
		}
	}
}
