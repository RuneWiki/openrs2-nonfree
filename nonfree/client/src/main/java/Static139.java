import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!nh", name = "Hb", descriptor = "Lclient!nh;")
	public static Class2_Sub23 aClass2_Sub23_7;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	public static int anInt2666 = 2;

	@OriginalMember(owner = "client!nh", name = "Z", descriptor = "Z")
	public static boolean aBoolean112 = false;

	@OriginalMember(owner = "client!nh", name = "eb", descriptor = "[I")
	public static int[] anIntArray447 = new int[128];

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "Lclient!l;")
	public static Class2_Sub23_Sub1 aClass2_Sub23_Sub1_4 = new Class2_Sub23_Sub1(5000);

	@OriginalMember(owner = "client!nh", name = "Db", descriptor = "Lclient!qe;")
	public static Class78 aClass78_551 = Static199.method3560("(U4");

	@OriginalMember(owner = "client!nh", name = "Eb", descriptor = "[I")
	public static int[] anIntArray448 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method2127(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg0 != null) {
				local5 = Static137.method2466(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg1;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			if (Static192.aClass41_3.anApplet1 != null) {
				@Pc(104) Class33 local104 = Static192.aClass41_3.method1270(new URL(Static192.aClass41_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static79.anInt1729 + "&u=" + Static160.aLong139 + "&v1=" + Static76.aString5 + "&v2=" + Static76.aString2 + "&e=" + local5));
				while (local104.anInt947 == 0) {
					Static156.method2805(1L);
				}
				if (local104.anInt947 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local104.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}
}
