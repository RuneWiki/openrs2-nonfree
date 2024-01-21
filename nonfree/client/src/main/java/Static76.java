import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "Lclient!kc;")
	public static Class36 aClass36_936 = Static14.method2017("Handel)4Duell");

	@OriginalMember(owner = "client!oe", name = "Y", descriptor = "Lclient!kc;")
	public static Class36 aClass36_937 = Static14.method2017("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!oe", name = "Z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_938 = Static14.method2017("Passwort: ");

	@OriginalMember(owner = "client!oe", name = "ab", descriptor = "Lclient!kc;")
	public static Class36 aClass36_939 = Static14.method2017("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!oe", name = "cb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_940 = Static14.method2017("rot:");

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
	public static int anInt2015 = 0;

	@OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
	public static int anInt2016 = 1;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method1457() {
		if (Static7.anInt191 > 0) {
			Static117.method1386();
		} else {
			Static104.method1914(40);
			Static13.aClass51_2 = Static57.aClass51_3;
			Static57.aClass51_3 = null;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)V")
	public static void method1458() {
		aClass36_937 = null;
		aClass36_940 = null;
		aClass36_938 = null;
		aClass36_936 = null;
		aClass36_939 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Lclient!oe;")
	public static Class2_Sub1_Sub12 method1461(@OriginalArg(0) int arg0) {
		@Pc(6) Class2_Sub1_Sub12 local6 = (Class2_Sub1_Sub12) Static85.aClass22_30.method711((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static29.aClass3_3.method928(arg0, 5);
		local6 = new Class2_Sub1_Sub12();
		if (local20 != null) {
			local6.method1460(new Class2_Sub12(local20));
		}
		Static85.aClass22_30.method712(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lclient!ed;")
	public static Class2_Sub1_Sub6 method1462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub1_Sub6 local12 = Static71.method1274(arg1);
		if (arg0 == -1) {
			return local12;
		} else if (local12 == null || local12.aClass2_Sub1_Sub6Array1 == null || local12.aClass2_Sub1_Sub6Array1.length <= arg0) {
			return null;
		} else {
			return local12.aClass2_Sub1_Sub6Array1[arg0];
		}
	}
}
