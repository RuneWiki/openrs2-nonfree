import java.io.DataInputStream;
import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!o", name = "m", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Lclient!v;")
	public static Class62 aClass62_856 = Static45.method753("gelb:");

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!v;")
	private static Class62 aClass62_857 = Static45.method753("Hidden");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	public static int anInt1948 = 0;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_858 = Static45.method753("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!v;")
	private static Class62 aClass62_859 = Static45.method753("Bad session id)3");

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!v;")
	public static Class62 aClass62_860 = Static45.method753("Texturen geladen)3");

	@OriginalMember(owner = "client!o", name = "g", descriptor = "[I")
	public static int[] anIntArray203 = new int[256];

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!v;")
	public static Class62 aClass62_861 = aClass62_857;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_4 = new CRC32();

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt1950 = 0;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "I")
	public static int anInt1954 = -1;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_862 = aClass62_859;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "[I")
	public static int[] anIntArray205 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
	public static void method1182(@OriginalArg(0) int arg0) {
		if (Static55.aClass38_1 == null) {
			return;
		}
		if (Static22.anInt745 == 0) {
			if (Static30.anInt974 < 0) {
				return;
			}
			Static30.anInt974 = arg0;
			Static55.aClass38_1.method1584(arg0, 0);
		} else if (Static10.aByteArray20 != null) {
			Static59.anInt1620 = arg0;
			return;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method1183() {
		anIntArrayArrayArray3 = null;
		aClass62_861 = null;
		anIntArray206 = null;
		aClass62_857 = null;
		anIntArray203 = null;
		aClass62_860 = null;
		anIntArray204 = null;
		aClass62_858 = null;
		aClass62_862 = null;
		aClass62_856 = null;
		anIntArray205 = null;
		aClass62_859 = null;
		aCRC32_4 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1184(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static54.method1805(arg1);
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
			@Pc(97) Class54 local97 = Static69.aClass35_3.method778(new URL(Static69.aClass35_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static71.anInt1942 + "&u=" + Static54.aLong79 + "&v1=" + Static47.aString8 + "&v2=" + Static47.aString4 + "&e=" + local7));
			while (local97.anInt2217 == 0) {
				Static24.method505(1L);
			}
			if (local97.anInt2217 == 1) {
				@Pc(113) DataInputStream local113 = (DataInputStream) local97.anObject3;
				local113.read();
				local113.close();
			}
		} catch (@Pc(120) Exception local120) {
		}
	}
}
