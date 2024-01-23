import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!rn;")
	public static Class155 aClass155_110;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!rn;")
	public static Class155 aClass155_111;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "[S")
	public static short[] aShortArray88 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString191 = "white:";

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public static void method4396() {
		Static286.method4489();
		Static295.method4155();
		Static104.method1669();
		Static316.aClass33_15.method823();
		Static259.aClass174_1 = new Class174();
		((Class91_Sub1) Static16.anInterface4_1).method2913();
		Static261.method4355();
		Static142.anInt2730 = 0;
		Static142.aClass90Array1 = new Class90[255];
		Static97.method1539();
		Static193.method3215();
		Static19.method316();
		Static306.method4921(false);
		Static216.method3557();
		Static129.method2204();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(51) Class10_Sub5_Sub1 local51 = Static52.aClass10_Sub5_Sub1Array1[local42];
			if (local51 != null) {
				local51.anObject5 = null;
			}
		}
		if (Static283.aBoolean393) {
			Static193.method3202();
			Static178.method2943(Static17.aBoolean31);
			Static71.method1078();
		}
		Static56.method918(Static65.aClass155_31, Static268.aClass155_113);
		Static190.method3182(Static65.aClass155_31);
		Static243.aClass3_Sub4_Sub12_5 = null;
		Static244.aClass3_Sub4_Sub12_6 = null;
		Static286.aClass3_Sub4_Sub12_9 = null;
		Static240.aClass3_Sub4_Sub12_4 = null;
		Static276.aClass3_Sub4_Sub12_10 = null;
		if (Static10.anInt190 == 5) {
			Static126.method2194(Static65.aClass155_31);
		}
		if (Static10.anInt190 == 10) {
			Static133.method2310(false);
		}
		if (Static10.anInt190 == 30) {
			method4398(25);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	public static void method4398(@OriginalArg(0) int arg0) {
		if (arg0 == Static10.anInt190) {
			return;
		}
		if (Static10.anInt190 == 0) {
			Static201.method3342();
		}
		if (arg0 == 40) {
			Static83.method1272();
		}
		if (arg0 != 40 && Static88.aClass139_2 != null) {
			Static88.aClass139_2.method3559();
			Static88.aClass139_2 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static54.anInt1011 = 1;
			Static221.anInt4335 = 0;
			Static66.anInt1235 = 0;
			Static206.anInt4082 = 0;
			Static134.anInt4353 = 1;
			Static306.method4921(true);
		}
		@Pc(77) boolean local77 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 25 || arg0 == 10) {
			Static109.method2615();
		}
		if (arg0 == 5) {
			Static126.method2194(Static65.aClass155_31);
		} else {
			Static216.method3557();
		}
		@Pc(116) boolean local116 = Static10.anInt190 == 5 || Static10.anInt190 == 10 || Static10.anInt190 == 28;
		if (local77 != local116) {
			if (local77) {
				Static201.anInt3962 = Static91.anInt1672;
				if (Static220.anInt5204 == 0) {
					Static233.method3956();
				} else {
					Static102.method1626(Static257.aClass155_106, Static91.anInt1672, 255);
				}
				Static161.aClass177_1.method4542(false);
			} else {
				Static233.method3956();
				Static161.aClass177_1.method4542(true);
			}
		}
		if (Static283.aBoolean393 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static283.method4666();
		}
		Static10.anInt190 = arg0;
	}
}
