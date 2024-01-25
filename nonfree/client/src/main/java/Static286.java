import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
	public static int anInt5015;

	@OriginalMember(owner = "client!oi", name = "I", descriptor = "[Z")
	public static final boolean[] aBooleanArray36 = new boolean[8];

	@OriginalMember(owner = "client!oi", name = "L", descriptor = "[Lclient!sm;")
	public static final Class223[] aClass223Array2 = new Class223[14];

	@OriginalMember(owner = "client!oi", name = "N", descriptor = "[I")
	public static final int[] anIntArray437 = new int[4096];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
	public static void method4164(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static407.anInt6564 != -1) {
				Static272.method4010(Static407.anInt6564);
			}
			for (@Pc(13) Class1_Sub23 local13 = (Class1_Sub23) Static101.aClass96_16.method2342(); local13 != null; local13 = (Class1_Sub23) Static101.aClass96_16.method2339()) {
				if (!local13.method6017()) {
					local13 = (Class1_Sub23) Static101.aClass96_16.method2342();
					if (local13 == null) {
						break;
					}
				}
				Static441.method5820(false, true, local13);
			}
			Static407.anInt6564 = -1;
			Static101.aClass96_16 = new Class96(8);
			Static46.method821();
			Static407.anInt6564 = Static247.anInt7107;
			Static292.method4245(false);
			Static319.method3515();
			Static13.method362(Static407.anInt6564);
		}
		Static309.aBoolean382 = false;
		Static338.aString57 = "";
		Static450.aString71 = "";
		Static92.method1681();
		Static221.anInt2659 = -1;
		Static38.method696(Static402.anInt6499);
		Static452.aClass31_Sub2_Sub1_Sub1_2 = new Class31_Sub2_Sub1_Sub1();
		Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 = Static118.anInt2419 * 128 / 2;
		Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray658[0] = Static195.anInt3537 / 2;
		Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 = Static195.anInt3537 * 128 / 2;
		Static92.anInt1946 = 0;
		Static139.anInt2727 = 0;
		Static452.aClass31_Sub2_Sub1_Sub1_2.anIntArray657[0] = Static118.anInt2419 / 2;
		if (Static345.anInt5797 == 2) {
			Static139.anInt2727 = Static258.anInt3113 << 7;
			Static92.anInt1946 = Static145.anInt2798 << 7;
		} else {
			Static182.method2891();
		}
		Static355.method4889();
	}
}
