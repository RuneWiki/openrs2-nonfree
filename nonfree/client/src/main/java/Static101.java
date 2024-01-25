import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!gaa;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	public static int anInt1604 = -1;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_26 = new Class186(79, 0);

	@OriginalMember(owner = "client!db", name = "f", descriptor = "[I")
	public static final int[] anIntArray95 = new int[1024];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BILclient!lb;)Lclient!saa;")
	public static Class330 method1316(@OriginalArg(1) int arg0, @OriginalArg(2) Class221 arg1) {
		@Pc(8) byte[] local8 = arg1.method5077(arg0);
		return local8 == null ? null : new Class330(local8);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method1318() {
		Static558.anInt9284 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static677.aClass3_Sub28Array1[local14] = null;
			Static443.aByteArray65[local14] = 1;
			Static286.aClass342Array5[local14] = null;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public static void method1319() throws Exception_Sub1 {
		if (Static293.anInt5243 == 1) {
			Static622.aClass67_15.method7630(Static292.anInt5232, Static575.anInt9444);
		} else {
			Static622.aClass67_15.method7630(0, 0);
		}
	}
}
