import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Lclient!qk;")
	public static final Class208 aClass208_1 = new Class208();

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
	public static int anInt882 = 0;

	@OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
	public static int anInt883 = 0;

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method799(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static179.method2800(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static127.method2069(local7);
			local7 = Static222.method4771("%3a", local7, ":");
			local7 = Static222.method4771("%40", local7, "@");
			local7 = Static222.method4771("%26", local7, "&");
			local7 = Static222.method4771("%23", local7, "#");
			if (Static281.aClass103_4.anApplet1 != null) {
				@Pc(99) Class249 local99 = Static281.aClass103_4.method2375(new URL(Static281.aClass103_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static342.anInt5732 + "&u=" + Static34.aLong26 + "&v1=" + Static143.aString28 + "&v2=" + Static143.aString24 + "&e=" + local7));
				while (local99.anInt6929 == 0) {
					Static170.method1617(1L);
				}
				if (local99.anInt6929 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local99.anObject10;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(127) Exception local127) {
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method800(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static298.method4373(Static335.aClass25_90);
		Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(arg1) + 1);
		Static449.aClass6_Sub15_Sub1_2.method3091(arg0);
		Static449.aClass6_Sub15_Sub1_2.method3094(arg1);
	}
}
