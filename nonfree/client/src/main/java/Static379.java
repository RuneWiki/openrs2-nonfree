import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!td", name = "t", descriptor = "I")
	public static int anInt2075;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public static int anInt2076 = -1;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[4];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!dn;)I")
	public static int method1669(@OriginalArg(1) Class56 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0.method1365(Static97.anInt2135)) {
			local12++;
		}
		if (arg0.method1365(Static376.anInt7413)) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1671(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static108.method2811(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			Static32.method786(local5);
			local5 = Static137.method2515("%3a", local5, ":");
			local5 = Static137.method2515("%40", local5, "@");
			local5 = Static137.method2515("%26", local5, "&");
			local5 = Static137.method2515("%23", local5, "#");
			if (Static129.aClass103_3.anApplet1 != null) {
				@Pc(105) Class190 local105 = Static129.aClass103_3.method2819(new URL(Static129.aClass103_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static86.anInt1836 + "&u=" + Static154.aLong97 + "&v1=" + Static162.aString38 + "&v2=" + Static162.aString35 + "&e=" + local5));
				while (local105.anInt5799 == 0) {
					Static135.method2458(1L);
				}
				if (local105.anInt5799 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local105.anObject7;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
	public static void method1673() {
		Static348.aClass5_63.method116();
	}
}
