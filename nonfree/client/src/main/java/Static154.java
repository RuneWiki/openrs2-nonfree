import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
	public static int anInt3652;

	@OriginalMember(owner = "client!sc", name = "sb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1259 = Static161.method2971("Your ignore list is full)3 Max of 100 users)3");

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1256 = aClass13_1259;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1257 = Static161.method2971("headicons_prayer");

	@OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
	public static int anInt3651 = 20;

	@OriginalMember(owner = "client!sc", name = "hb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1258 = Static161.method2971("blinken3:");

	@OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
	public static int anInt3664 = 0;

	@OriginalMember(owner = "client!sc", name = "yb", descriptor = "I")
	public static int anInt3674 = 0;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	public static void method2646() {
		aClass13_1258 = null;
		aClass13_1257 = null;
		aClass13_1259 = null;
		aClass13_1256 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method2654(@OriginalArg(0) int arg0) {
		if (Static48.anInt1535 == 0) {
			Static74.aClass1_Sub12_Sub4_1.method2656(arg0);
		} else {
			Static23.anInt1010 = arg0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method2661(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static90.method1892(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static182.aClass16_3.anApplet1 != null) {
				@Pc(105) Class32 local105 = Static182.aClass16_3.method983(new URL(Static182.aClass16_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static5.anInt150 + "&u=" + Static134.aLong112 + "&v1=" + Static36.aString1 + "&v2=" + Static36.aString2 + "&e=" + local7));
				while (local105.anInt1974 == 0) {
					Static181.method2982(1L);
				}
				if (local105.anInt1974 == 1) {
					@Pc(121) DataInputStream local121 = (DataInputStream) local105.anObject2;
					local121.read();
					local121.close();
				}
			}
		} catch (@Pc(128) Exception local128) {
		}
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(II)Z")
	public static boolean method2668(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
