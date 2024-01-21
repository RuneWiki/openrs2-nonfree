import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1054 = Static158.method3034("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1055 = Static158.method3034("scape main");

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
	public static int anInt3875 = 0;

	@OriginalMember(owner = "client!ra", name = "Eb", descriptor = "I")
	public static volatile int anInt3901 = 0;

	@OriginalMember(owner = "client!ra", name = "ec", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1060 = Static158.method3034("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ra", name = "mc", descriptor = "I")
	public static int anInt3922 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method2973(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(15) String local15 = "";
			if (arg1 != null) {
				local15 = Static24.method614(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local15 = local15 + " | ";
				}
				local15 = local15 + arg0;
			}
			System.out.println("Error: " + local15);
			local15 = local15.replace(':', '.');
			local15 = local15.replace('@', '_');
			local15 = local15.replace('&', '_');
			local15 = local15.replace('#', '_');
			if (Static104.aClass81_2.anApplet1 != null) {
				@Pc(109) Class25 local109 = Static104.aClass81_2.method3148(new URL(Static104.aClass81_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static75.anInt2298 + "&u=" + Static152.aLong95 + "&v1=" + Static170.aString5 + "&v2=" + Static170.aString4 + "&e=" + local15));
				while (local109.anInt1695 == 0) {
					Static85.method1993(1L);
				}
				if (local109.anInt1695 == 1) {
					@Pc(128) DataInputStream local128 = (DataInputStream) local109.anObject2;
					local128.read();
					local128.close();
				}
			}
		} catch (@Pc(135) Exception local135) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)Lclient!re;")
	public static Class2_Sub20 method2980(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class2_Sub20 local7 = new Class2_Sub20();
		local7.anInt3989 = arg0;
		local7.anInt3986 = arg2;
		Static156.aClass51_11.method2463(local7, (long) arg1);
		Static146.method2942(arg2);
		Static101.method2309(arg2);
		@Pc(29) Class72 local29 = Static173.method3201(arg1);
		if (local29 != null) {
			Static39.method900(local29);
		}
		if (Static164.aClass72_10 != null) {
			Static39.method900(Static164.aClass72_10);
			Static164.aClass72_10 = null;
		}
		Static103.aBoolean115 = false;
		Static169.anInt4148 = 0;
		Static129.method2731(Static176.anInt4301, Static103.anInt2979, Static180.anInt3303, Static73.anInt2175);
		if (Static18.anInt4401 != -1) {
			Static190.method3488(1, Static18.anInt4401);
		}
		return local7;
	}
}
