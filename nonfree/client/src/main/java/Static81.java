import java.awt.Canvas;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "Lclient!pga;")
	public static Class278 aClass278_1;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "Lclient!pja;")
	public static final Class279 aClass279_9 = new Class279(50);

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
	public static int anInt1786 = -1;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IBI)Z")
	public static boolean method1704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/awt/Canvas;Lclient!d;II)Lclient!ha;")
	public static Class16 method1705(@OriginalArg(1) Canvas arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class16_Sub3(arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
	public static void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		if (arg2 < arg0) {
			for (local14 = arg2; local14 < arg0; local14++) {
				Static299.anIntArrayArray58[local14][arg1] = arg3;
			}
		} else {
			for (local14 = arg0; local14 < arg2; local14++) {
				Static299.anIntArrayArray58[local14][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
	public static void method1711(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static95.method1893(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static318.method4997(local7);
			local7 = Static599.method3045(":", "%3a", local7);
			local7 = Static599.method3045("@", "%40", local7);
			local7 = Static599.method3045("&", "%26", local7);
			local7 = Static599.method3045("#", "%23", local7);
			if (Static220.anApplet1 != null) {
				@Pc(106) Class129 local106 = Static310.aClass231_2.method5292(new URL(Static220.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static334.anInt6107 + "&u=" + (Static409.aString93 == null ? String.valueOf(Static423.aLong205) : Static409.aString93) + "&v1=" + Static353.aString79 + "&v2=" + Static353.aString84 + "&e=" + local7));
				while (local106.anInt3299 == 0) {
					Static365.method3472(1L);
				}
				if (local106.anInt3299 == 1) {
					@Pc(127) DataInputStream local127 = (DataInputStream) local106.anObject7;
					local127.read();
					local127.close();
				}
			}
		} catch (@Pc(134) Exception local134) {
		}
	}
}
