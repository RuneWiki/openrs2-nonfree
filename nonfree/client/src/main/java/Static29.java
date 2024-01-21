import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!fa", name = "Mb", descriptor = "Lclient!te;")
	public static Class75 aClass75_25 = new Class75(64);

	@OriginalMember(owner = "client!fa", name = "Vb", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!fa", name = "Zb", descriptor = "Lclient!na;")
	public static Class53 aClass53_389 = Static109.method1737("Cabbage");

	@OriginalMember(owner = "client!fa", name = "jc", descriptor = "Lclient!na;")
	private static Class53 aClass53_394 = Static109.method1737("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!fa", name = "cc", descriptor = "Lclient!na;")
	public static Class53 aClass53_390 = aClass53_394;

	@OriginalMember(owner = "client!fa", name = "dc", descriptor = "Lclient!na;")
	public static Class53 aClass53_391 = Static109.method1737("(Udns");

	@OriginalMember(owner = "client!fa", name = "ec", descriptor = "Lclient!na;")
	public static Class53 aClass53_392 = Static109.method1737("hitmarks");

	@OriginalMember(owner = "client!fa", name = "fc", descriptor = "Lclient!na;")
	public static Class53 aClass53_393 = Static109.method1737("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!fa", name = "gc", descriptor = "I")
	public static int anInt1013 = 0;

	@OriginalMember(owner = "client!fa", name = "hc", descriptor = "I")
	public static int anInt1014 = 0;

	@OriginalMember(owner = "client!fa", name = "ic", descriptor = "I")
	public static int anInt1015 = 0;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!na;Lclient!we;Lclient!na;I)Lclient!ff;")
	public static Class3_Sub1_Sub5_Sub2 method657(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class53 arg2) {
		@Pc(16) int local16 = arg1.method1504(arg0);
		@Pc(22) int local22 = arg1.method1502(arg2, local16);
		return Static40.method821(local22, arg1, local16);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILclient!we;)I")
	public static int method660(@OriginalArg(1) Class62 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1520(Static117.aClass53_1349, Static63.aClass53_723)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static62.aClass53_716)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static114.aClass53_1305)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static52.aClass53_630)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static42.aClass53_536)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static105.aClass53_1214)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static71.aClass53_796)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static35.aClass53_466)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static120.aClass53_1384)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static53.aClass53_996)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static61.aClass53_712)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static93.aClass53_1072)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static63.aClass53_720)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static93.aClass53_1065)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static102.aClass53_1169)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static3.aClass53_23)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static13.aClass53_124)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static101.aClass53_1161)) {
			local5++;
		}
		if (arg0.method1520(Static117.aClass53_1349, Static65.aClass53_734)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public static void method663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static96.anInt1448 != 0 && arg1 != -1) {
			Static100.method1655(0, Static66.aClass62_Sub1_10, Static96.anInt1448, arg1);
			Static58.aBoolean56 = true;
		}
	}

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "(B)V")
	public static void method664() {
		aClass53_389 = null;
		aClass53_394 = null;
		aClass75_25 = null;
		aClass53_393 = null;
		aClass53_390 = null;
		aClass53_391 = null;
		aClass53_392 = null;
	}
}
