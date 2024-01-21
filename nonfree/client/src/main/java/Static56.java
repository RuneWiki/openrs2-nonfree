import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[B")
	public static byte[] aByteArray16;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Z")
	public static boolean aBoolean97;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public static int anInt1397 = 0;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_716 = Static75.method1216("Name eingeben:");

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public static int anInt1400 = -1;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_717 = Static75.method1216("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_718 = Static75.method1216("");

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_719 = Static75.method1216("chatback");

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_720 = Static75.method1216("titlebutton");

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Lclient!ad;")
	public static Class4 aClass4_721 = Static75.method1216("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_722 = Static75.method1216("welle2:");

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method938() {
		Static107.aClass8_31.method198();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method939() {
		aByteArray16 = null;
		aClass4_722 = null;
		aClass4_718 = null;
		aClass4_720 = null;
		aClass4_717 = null;
		aByteArrayArray5 = null;
		aClass4_721 = null;
		aClass4_719 = null;
		aClass4_716 = null;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method940() {
		Static77.aFontMetrics1 = null;
		Static111.anImage4 = null;
		Static11.aFont47 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ad;Lclient!ad;Lclient!rd;B)Lclient!vd;")
	public static Class3_Sub1_Sub4_Sub4 method941(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) Class64 arg2) {
		@Pc(13) int local13 = arg2.method1638(arg1);
		@Pc(19) int local19 = arg2.method1626(local13, arg0);
		return Static82.method1289(local13, arg2, local19);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!rd;Lclient!rd;)V")
	public static void method942(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class64 arg1) {
		Static91.aClass64_59 = arg0;
		Static89.aClass64_57 = arg1;
		Static89.anInt2048 = Static89.aClass64_57.method1637(3);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public static void method943() {
		Static89.aClass8_26.method198();
		Static7.aClass8_3.method198();
	}
}
