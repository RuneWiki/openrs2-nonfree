import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "[Lclient!ra;")
	public static Class72[] aClass72Array2;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!pi;")
	public static final Class67 aClass67_15 = new Class67();

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1315 = Static158.method3034(")1j");

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1317 = Static158.method3034("Players");

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1316 = aClass60_1317;

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array26 = new Class60[500];

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1318 = Static158.method3034("<br>(X100(U(Y");

	@OriginalMember(owner = "client!wf", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1319 = Static158.method3034("(U0a )2 via: ");

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1322 = Static158.method3034("wishes to trade with you)3");

	@OriginalMember(owner = "client!wf", name = "j", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1320 = aClass60_1322;

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1321 = Static158.method3034("Stufe)2");

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "[Lclient!ob;")
	public static final Class60[] aClass60Array27 = new Class60[100];

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
	public static final int[] anIntArray504 = new int[1000];

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public static void method3548() {
		for (@Pc(10) Class2_Sub1_Sub1_Sub2 local10 = (Class2_Sub1_Sub1_Sub2) Static30.aClass67_1.method2848(); local10 != null; local10 = (Class2_Sub1_Sub1_Sub2) Static30.aClass67_1.method2851()) {
			if (local10.anInt1050 != Static62.anInt1923 || local10.anInt1063 < Static20.anInt580) {
				local10.method3556();
			} else if (local10.anInt1059 <= Static20.anInt580) {
				if (local10.anInt1051 > 0) {
					@Pc(41) Class2_Sub1_Sub1_Sub3_Sub2 local41 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local10.anInt1051 - 1];
					if (local41 != null && local41.anInt3302 >= 0 && local41.anInt3302 < 13312 && local41.anInt3273 >= 0 && local41.anInt3273 < 13312) {
						local10.method820(Static20.anInt580, local41.anInt3273, Static182.method3393(local10.anInt1050, local41.anInt3302, local41.anInt3273) - local10.anInt1071, local41.anInt3302);
					}
				}
				if (local10.anInt1051 < 0) {
					@Pc(93) int local93 = -local10.anInt1051 - 1;
					@Pc(100) Class2_Sub1_Sub1_Sub3_Sub1 local100;
					if (local93 == Static89.anInt2601) {
						local100 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1;
					} else {
						local100 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local93];
					}
					if (local100 != null && local100.anInt3302 >= 0 && local100.anInt3302 < 13312 && local100.anInt3273 >= 0 && local100.anInt3273 < 13312) {
						local10.method820(Static20.anInt580, local100.anInt3273, Static182.method3393(local10.anInt1050, local100.anInt3302, local100.anInt3273) - local10.anInt1071, local100.anInt3302);
					}
				}
				local10.method823(Static35.anInt3071);
				Static98.method2268(Static62.anInt1923, (int) local10.aDouble3, (int) local10.aDouble4, (int) local10.aDouble2, 60, local10, local10.anInt1070, -1L, false);
			}
		}
	}
}
