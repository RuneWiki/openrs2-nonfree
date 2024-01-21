import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!md", name = "b", descriptor = "I")
	public static int anInt1549 = 127;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "Lclient!dd;")
	public static Class19 aClass19_55 = new Class19(100);

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!rd;")
	public static Class64 aClass64_972 = method1153("(Y");

	@OriginalMember(owner = "client!md", name = "p", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!md", name = "t", descriptor = "J")
	public static long aLong45 = 0L;

	@OriginalMember(owner = "client!md", name = "w", descriptor = "Lclient!rd;")
	private static Class64 aClass64_975 = method1153("wishes to trade with you)3");

	@OriginalMember(owner = "client!md", name = "u", descriptor = "Lclient!rd;")
	public static Class64 aClass64_973 = aClass64_975;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "Lclient!rd;")
	private static Class64 aClass64_974 = method1153("Drop");

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_976 = aClass64_974;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	public static int anInt1562 = 0;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!rd;")
	public static Class64 aClass64_977 = method1153("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BZ)V")
	public static void method1140(@OriginalArg(1) boolean arg0) {
		if (Static53.aClass27_3 == null) {
			return;
		}
		try {
			@Pc(15) Class1_Sub6 local15 = new Class1_Sub6(4);
			local15.method1853(arg0 ? 2 : 3);
			local15.method1838(0);
			Static53.aClass27_3.method560(4, local15.aByteArray27);
		} catch (@Pc(36) IOException local36) {
			try {
				Static53.aClass27_3.method562();
			} catch (@Pc(41) Exception local41) {
			}
			Static53.aClass27_3 = null;
			Static11.anInt427++;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
	public static void method1146() {
		aClass64_977 = null;
		aLongArray5 = null;
		aClass64_974 = null;
		aClass64_973 = null;
		aClass64_975 = null;
		aClass19_55 = null;
		aClass64_972 = null;
		aClass64_976 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!pb;Lclient!pb;B)V")
	public static void method1148(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1) {
		Static61.aClass41_35 = arg0;
		Static94.aClass41_51 = arg1;
		Static93.anInt2074 = Static61.aClass41_35.method1068(3);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!rd;")
	public static Class64 method1153(@OriginalArg(0) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(11) int local11 = 0;
		@Pc(15) Class64 local15 = new Class64();
		local15.aByteArray24 = new byte[local9];
		while (local11 < local9) {
			@Pc(32) int local32 = local6[local11++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local11 >= local9) {
					break;
				}
				@Pc(65) int local65 = local6[local11++] & 0xFF;
				local15.aByteArray24[local15.anInt2086++] = (byte) (local65 + local32 * 43 - 48 - 1720);
			} else if (local32 != 0) {
				local15.aByteArray24[local15.anInt2086++] = (byte) local32;
			}
		}
		local15.method1495();
		return local15.method1467();
	}
}
