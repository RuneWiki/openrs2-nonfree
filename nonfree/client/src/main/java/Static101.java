import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static101 {

	@OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!u", name = "hb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2681 = Static94.method1596("blinken1:");

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "Lclient!a;")
	public static Class1 aClass1_2682 = Static94.method1596("Offline");

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2683 = Static94.method1596("Freunde");

	@OriginalMember(owner = "client!u", name = "wb", descriptor = "[Lclient!vd;")
	public static Class2_Sub1_Sub1_Sub1_Sub2[] aClass2_Sub1_Sub1_Sub1_Sub2Array1 = new Class2_Sub1_Sub1_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!u", name = "xb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2684 = Static94.method1596("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!u", name = "zb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2685 = Static94.method1596(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!u", name = "Cb", descriptor = "I")
	public static int anInt2594 = -1;

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	public static void method1715() {
		aClass1_2682 = null;
		aClass2_Sub1_Sub1_Sub1_Sub2Array1 = null;
		aClass1_2683 = null;
		aClass1_2681 = null;
		aClass1_2685 = null;
		aClass1_2684 = null;
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(II)Lclient!a;")
	public static Class1 method1716(@OriginalArg(0) int arg0) {
		return Static97.method1655(new Class1[] { Static43.method994(arg0 >> 24 & 0xFF), Static69.aClass1_2949, Static43.method994(arg0 >> 16 & 0xFF), Static69.aClass1_2949, Static43.method994(arg0 >> 8 & 0xFF), Static69.aClass1_2949, Static43.method994(arg0 & 0xFF) });
	}
}
