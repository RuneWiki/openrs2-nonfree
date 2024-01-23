import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray4 = new int[5][5000];

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!ia;")
	public static Class51 aClass51_224 = Static64.method1101("welle:");

	@OriginalMember(owner = "client!d", name = "n", descriptor = "Lclient!ia;")
	private static Class51 aClass51_225 = Static64.method1101("Loading sprites )2 ");

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!ia;")
	public static Class51 aClass51_226 = aClass51_225;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	public static int anInt805 = 0;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "[Lclient!pb;")
	public static Class83[] aClass83Array2 = new Class83[5000];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method595(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static155.method2675(arg1);
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
			if (Static150.aClass72_4.anApplet1 != null) {
				@Pc(105) Class38 local105 = Static150.aClass72_4.method2250(new URL(Static150.aClass72_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static31.anInt696 + "&u=" + Static59.aLong44 + "&v1=" + Static130.aString3 + "&v2=" + Static130.aString4 + "&e=" + local7));
				while (local105.anInt1236 == 0) {
					Static186.method3115(1L);
				}
				if (local105.anInt1236 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local105.anObject3;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}
