import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
	public static int anInt1219;

	@OriginalMember(owner = "client!fg", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!fg", name = "N", descriptor = "Lclient!tg;")
	public static Class81 aClass81_438 = Static120.method2057("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!fg", name = "T", descriptor = "Lclient!tg;")
	public static Class81 aClass81_439 = Static120.method2057("null");

	@OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "[Lclient!gh;")
	public static Class1_Sub2_Sub1_Sub3_Sub1[] aClass1_Sub2_Sub1_Sub3_Sub1Array1 = new Class1_Sub2_Sub1_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!fg", name = "ab", descriptor = "[I")
	public static int[] anIntArray103 = new int[50];

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	public static void method911() {
		aClass1_Sub2_Sub1_Sub3_Sub1Array1 = null;
		aBooleanArray4 = null;
		anIntArray103 = null;
		aClass81_438 = null;
		aClass81_439 = null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!rh;)V")
	public static void method913(@OriginalArg(1) Class77 arg0) {
		if (Static184.anInt4118 == arg0.anInt3235) {
			Static87.aBooleanArray11[arg0.anInt3262] = true;
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
	public static int method914() {
		return Static116.anInt2613++;
	}
}
