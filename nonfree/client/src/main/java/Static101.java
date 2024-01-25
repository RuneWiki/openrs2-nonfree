import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!ak;")
	public static Class1_Sub3 aClass1_Sub3_1;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public static int anInt1975 = -1;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!nc;")
	public static final Class171 aClass171_1 = new Class171(2);

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_37 = new Class96(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public static int anInt1977 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[FB)[F")
	public static float[] method1628(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static459.method1550(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method1630(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(11) String local11 = "";
			if (arg1 != null) {
				local11 = Static93.method1456(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local11 = local11 + " | ";
				}
				local11 = local11 + arg0;
			}
			Static293.method3994(local11);
			local11 = Static131.method2034(":", local11, "%3a");
			local11 = Static131.method2034("@", local11, "%40");
			local11 = Static131.method2034("&", local11, "%26");
			local11 = Static131.method2034("#", local11, "%23");
			if (Static171.aClass42_4.anApplet1 != null) {
				@Pc(107) Class159 local107 = Static171.aClass42_4.method648(new URL(Static171.aClass42_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static437.anInt7635 + "&u=" + Static279.aLong227 + "&v1=" + Static48.aString14 + "&v2=" + Static48.aString11 + "&e=" + local11));
				while (local107.anInt4271 == 0) {
					Static366.method5214(1L);
				}
				if (local107.anInt4271 == 1) {
					@Pc(127) DataInputStream local127 = (DataInputStream) local107.anObject8;
					local127.read();
					local127.close();
				}
			}
		} catch (@Pc(134) Exception local134) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([J[IB)V")
	public static void method1632(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1) {
		Static148.method5610(arg0.length - 1, arg0, arg1, 0);
	}
}
