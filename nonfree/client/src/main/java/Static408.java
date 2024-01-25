import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!os", name = "g", descriptor = "[I")
	public static int[] anIntArray496 = new int[2];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z")
	public static boolean method6621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(III)Z")
	public static boolean method6624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method6625(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static481.method7515(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static323.method5599(local7);
			local7 = Static117.method2904("%3a", ":", local7);
			local7 = Static117.method2904("%40", "@", local7);
			local7 = Static117.method2904("%26", "&", local7);
			local7 = Static117.method2904("%23", "#", local7);
			if (Static186.anApplet1 != null) {
				@Pc(110) Class240 local110 = Static519.aClass370_6.method9072(new URL(Static186.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static196.anInt4543 + "&u=" + (Static119.aString24 == null ? String.valueOf(Static324.aLong150) : Static119.aString24) + "&v1=" + Static623.aString112 + "&v2=" + Static623.aString115 + "&e=" + local7));
				while (local110.anInt7566 == 0) {
					Static190.method3914(1L);
				}
				if (local110.anInt7566 == 1) {
					@Pc(131) DataInputStream local131 = (DataInputStream) local110.anObject13;
					local131.read();
					local131.close();
				}
			}
		} catch (@Pc(138) Exception local138) {
		}
	}
}
