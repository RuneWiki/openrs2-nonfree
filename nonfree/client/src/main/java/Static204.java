import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array6;

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
	public static int anInt4108;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_36;

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public static int anInt4101 = 0;

	@OriginalMember(owner = "client!ti", name = "q", descriptor = "[I")
	public static int[] anIntArray465 = new int[50];

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "[I")
	public static int[] anIntArray466 = new int[32];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method3249(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(14) String local14 = "";
			if (arg0 != null) {
				local14 = Static44.method689(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local14 = local14 + " | ";
				}
				local14 = local14 + arg1;
			}
			System.out.println("Error: " + local14);
			local14 = local14.replace(':', '.');
			local14 = local14.replace('@', '_');
			local14 = local14.replace('&', '_');
			local14 = local14.replace('#', '_');
			if (Static123.aClass87_6.anApplet1 != null) {
				@Pc(108) Class116 local108 = Static123.aClass87_6.method2692(new URL(Static123.aClass87_6.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static7.anInt154 + "&u=" + Static148.aLong122 + "&v1=" + Static161.aString6 + "&v2=" + Static161.aString8 + "&e=" + local14));
				while (local108.anInt4156 == 0) {
					method3250(1L);
				}
				if (local108.anInt4156 == 1) {
					@Pc(127) DataInputStream local127 = (DataInputStream) local108.anObject5;
					local127.read();
					local127.close();
				}
			}
		} catch (@Pc(134) Exception local134) {
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)V")
	public static void method3250(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static50.method780(arg0 - 1L);
			Static50.method780(1L);
		} else {
			Static50.method780(arg0);
		}
	}
}
