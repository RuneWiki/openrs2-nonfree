import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!l;")
	public static Class45 aClass45_5 = new Class45(4096);

	@OriginalMember(owner = "client!dc", name = "X", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!dc", name = "Y", descriptor = "Lclient!ld;")
	public static Class47 aClass47_7 = new Class47(100);

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "[I")
	public static int[] anIntArray115 = new int[500];

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
	public static int anInt1044 = 0;

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_345 = Static161.method2971("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_344 = aClass13_345;

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_346 = Static161.method2971("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(BI)Lclient!lg;")
	public static Class1_Sub2_Sub10 method872(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub10 local6 = (Class1_Sub2_Sub10) Static91.aClass47_19.method1999((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static88.aClass4_59.method2243(8, arg0);
		local6 = new Class1_Sub2_Sub10();
		if (local28 != null) {
			local6.method2035(new Class1_Sub8(local28));
		}
		Static91.aClass47_19.method1998(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	public static void method873() {
		aClass13_344 = null;
		aClass47_7 = null;
		aClass13_346 = null;
		anIntArray115 = null;
		aClass45_5 = null;
		aClass13_345 = null;
	}
}
