import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "[Lclient!sc;")
	public static Class1_Sub2_Sub2_Sub4[] aClass1_Sub2_Sub2_Sub4Array1;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_48 = Static120.method2057("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "Lclient!tg;")
	private static Class81 aClass81_60 = Static120.method2057("white:");

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_49 = aClass81_60;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "Lclient!tg;")
	public static Class81 aClass81_51 = Static120.method2057("<col=ff0000>");

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	public static int anInt139 = 0;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!tg;")
	private static Class81 aClass81_53 = Static120.method2057("Jan");

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "Lclient!tg;")
	private static Class81 aClass81_61 = Static120.method2057("Feb");

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Lclient!tg;")
	private static Class81 aClass81_62 = Static120.method2057("Mar");

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "Lclient!tg;")
	private static Class81 aClass81_67 = Static120.method2057("Apr");

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!tg;")
	private static Class81 aClass81_58 = Static120.method2057("May");

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "Lclient!tg;")
	private static Class81 aClass81_63 = Static120.method2057("Jun");

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!tg;")
	private static Class81 aClass81_55 = Static120.method2057("Jul");

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "Lclient!tg;")
	private static Class81 aClass81_66 = Static120.method2057("Aug");

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!tg;")
	private static Class81 aClass81_59 = Static120.method2057("Sep");

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!tg;")
	private static Class81 aClass81_52 = Static120.method2057("Oct");

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Lclient!tg;")
	private static Class81 aClass81_65 = Static120.method2057("Nov");

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "Lclient!tg;")
	private static Class81 aClass81_64 = Static120.method2057("Dec");

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array1 = new Class81[] { aClass81_53, aClass81_61, aClass81_62, aClass81_67, aClass81_58, aClass81_63, aClass81_55, aClass81_66, aClass81_59, aClass81_52, aClass81_65, aClass81_64 };

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "Lclient!tg;")
	public static Class81 aClass81_54 = Static120.method2057("Standort");

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Lclient!tg;")
	public static Class81 aClass81_56 = aClass81_60;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "Lclient!tg;")
	public static Class81 aClass81_57 = Static120.method2057("<col=ffff00>");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Z")
	public static boolean method113(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method114() {
		aClass81_67 = null;
		aClass81_51 = null;
		aClass81_58 = null;
		aClass81_63 = null;
		aClass81_64 = null;
		aClass81_60 = null;
		aClass81_48 = null;
		aClass81_53 = null;
		aClass81_56 = null;
		aClass81_54 = null;
		aClass81_66 = null;
		aClass81_55 = null;
		aClass1_Sub2_Sub2_Sub4Array1 = null;
		aClass81_59 = null;
		aClass81_57 = null;
		aClass81_62 = null;
		aClass81_65 = null;
		aClass81_49 = null;
		aClass81_61 = null;
		aClass81_52 = null;
		aClass81Array1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method115(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static112.method1961(arg1);
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
			if (Static125.aClass68_3.anApplet1 != null) {
				@Pc(105) Class47 local105 = Static125.aClass68_3.method2224(new URL(Static125.aClass68_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static3.anInt110 + "&u=" + Static90.aLong73 + "&v1=" + Static130.aString4 + "&v2=" + Static130.aString5 + "&e=" + local7));
				while (local105.anInt1949 == 0) {
					Static133.method2259(1L);
				}
				if (local105.anInt1949 == 1) {
					@Pc(124) DataInputStream local124 = (DataInputStream) local105.anObject1;
					local124.read();
					local124.close();
				}
			}
		} catch (@Pc(131) Exception local131) {
		}
	}
}
