import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "Lclient!b;")
	public static Class7 aClass7_10 = new Class7(20);

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "[I")
	public static int[] anIntArray181 = new int[32];

	@OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_929 = Static122.method531("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
	public static int anInt1721 = 0;

	@OriginalMember(owner = "client!jg", name = "eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_930 = Static122.method531("<img=1>");

	@OriginalMember(owner = "client!jg", name = "fb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_931 = Static122.method531("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)V")
	public static void method1320(@OriginalArg(1) int arg0) {
		if (Static25.anInt717 == arg0) {
			return;
		}
		if (Static25.anInt717 == 0) {
			Static11.method185();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static43.anInt1011 = 0;
			Static117.anInt2796 = 0;
			Static126.anInt2937 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static91.aClass2_3 != null) {
			Static91.aClass2_3.method12();
			Static91.aClass2_3 = null;
		}
		if (Static25.anInt717 == 25) {
			Static72.anInt1643 = 1;
			Static58.anInt1368 = 1;
			Static86.anInt1938 = 0;
			Static113.anInt2742 = 0;
			Static9.anInt267 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static63.method1126(Static58.aClass13_Sub1_7, Static3.aClass13_Sub1_1, Static102.aCanvas1);
		} else {
			Static127.method486();
		}
		Static25.anInt717 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V")
	public static void method1322() {
		aClass73_929 = null;
		aClass7_10 = null;
		aClass73_931 = null;
		aClass73_930 = null;
		anIntArray181 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
	public static int method1323(@OriginalArg(1) int arg0) {
		@Pc(7) Class3_Sub1_Sub18 local7 = Static160.method2530(arg0);
		@Pc(14) int local14 = local7.anInt3795;
		@Pc(17) int local17 = local7.anInt3791;
		@Pc(20) int local20 = local7.anInt3790;
		@Pc(27) int local27 = Class3_Sub2_Sub37.anIntArray431[local14 - local20];
		return Static81.anIntArray186[local17] >> local20 & local27;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)Lclient!ad;")
	public static Class3_Sub1_Sub2 method1324(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub2 local10 = (Class3_Sub1_Sub2) Static55.aClass7_8.method183((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static48.aClass13_9.method348(1, arg0);
		local10 = new Class3_Sub1_Sub2();
		if (local25 != null) {
			local10.method63(new Class3_Sub12(local25), arg0);
		}
		local10.method62();
		Static55.aClass7_8.method186(local10, (long) arg0);
		return local10;
	}
}
