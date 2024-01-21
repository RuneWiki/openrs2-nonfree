import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "cb", descriptor = "Lclient!ta;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!ba", name = "hb", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!ba", name = "W", descriptor = "Lclient!kc;")
	public static Class36 aClass36_109 = Static14.method2017("(U4");

	@OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
	public static int anInt189 = 0;

	@OriginalMember(owner = "client!ba", name = "Y", descriptor = "[Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2_Sub1[] aClass2_Sub1_Sub4_Sub2_Sub1Array1 = new Class2_Sub1_Sub4_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_110 = Static14.method2017("leuchten1:");

	@OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
	public static int anInt193 = 0;

	@OriginalMember(owner = "client!ba", name = "fb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_111 = Static14.method2017("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
	public static int anInt194 = 0;

	@OriginalMember(owner = "client!ba", name = "ib", descriptor = "Lclient!kc;")
	public static Class36 aClass36_112 = Static14.method2017("::");

	@OriginalMember(owner = "client!ba", name = "kb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_113 = Static14.method2017("Untersuchen");

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(JB)V")
	public static void method170(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < anInt189; local14++) {
			if (Static24.aLongArray2[local14] == arg0) {
				Static100.aBoolean118 = true;
				anInt189--;
				for (@Pc(34) int local34 = local14; local34 < anInt189; local34++) {
					Static43.aClass36Array21[local34] = Static43.aClass36Array21[local34 + 1];
					Static36.anIntArray130[local34] = Static36.anIntArray130[local34 + 1];
					Static24.aLongArray2[local34] = Static24.aLongArray2[local34 + 1];
					Static106.anIntArray330[local34] = Static106.anIntArray330[local34 + 1];
				}
				Static42.aClass2_Sub12_Sub1_1.method1422(11);
				Static42.aClass2_Sub12_Sub1_1.method1377(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	public static void method171() {
		aClass36_110 = null;
		aClass36_113 = null;
		aClass36_111 = null;
		aClass36_112 = null;
		anIntArray19 = null;
		aClass2_Sub1_Sub4_Sub2_Sub1Array1 = null;
		aClass14_3 = null;
		aClass36_109 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ac;Lclient!ac;)V")
	public static void method172(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		Static55.aClass3_24 = arg1;
		Static109.aClass3_25 = arg0;
	}
}
