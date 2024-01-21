import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!ah;")
	public static Class7 aClass7_60;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	public static int anInt3635;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt3634 = 0;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1212 = Static170.method3101("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1214 = Static170.method3101("flash3:");

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1213 = aClass28_1214;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1215 = Static170.method3101("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lclient!eh;")
	public static Class28[] aClass28Array22 = new Class28[500];

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1216 = aClass28_1212;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1217 = aClass28_1214;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1218 = Static170.method3101("hel");

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1219 = Static170.method3101("auf der Hautpseite)3");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3 method2780() {
		@Pc(7) Class3_Sub2_Sub2_Sub3 local7 = new Class3_Sub2_Sub2_Sub3();
		local7.anIntArray187 = Static55.anIntArray272;
		local7.anInt1015 = Static114.anInt2920;
		local7.aByteArray12 = Static59.aByteArrayArray41[0];
		local7.anInt1010 = Static172.anInt4139;
		local7.anInt1014 = Static95.anIntArray452[0];
		local7.anInt1011 = Static173.anIntArray690[0];
		local7.anInt1012 = Static59.anIntArray293[0];
		local7.anInt1013 = Static83.anIntArray394[0];
		Static82.method1880();
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!eh;II)V")
	public static void method2781(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1) {
		Static51.aClass3_Sub8_Sub1_2.method1559(201);
		Static51.aClass3_Sub8_Sub1_2.method1523(arg1);
		Static51.aClass3_Sub8_Sub1_2.method1553(arg0.method924());
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method2782() {
		aClass28_1218 = null;
		aClass28_1217 = null;
		aClass7_60 = null;
		aClass28_1219 = null;
		aClass28_1215 = null;
		aClass28Array22 = null;
		aClass28_1213 = null;
		aClass28_1212 = null;
		aClass28_1216 = null;
		aClass28_1214 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public static void method2783(@OriginalArg(0) int arg0) {
		Static123.anInt3178 = 1000 / arg0;
	}
}
