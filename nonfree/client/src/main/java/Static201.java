import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
	public static int anInt3736;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array7;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "Z")
	public static boolean aBoolean257 = false;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	public static int anInt3737 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!bs;II)V")
	public static void method3116(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (Static415.aBoolean464) {
			arg1 = 0;
			Static415.aBoolean464 = false;
		}
		if (Static109.aClass33_1 != null && Static109.aClass33_1.method668(arg0)) {
			return;
		}
		Static109.aClass33_1 = arg0;
		Static153.aLong190 = Static101.method1557();
		Static57.anInt1183 = arg1;
		Static222.anInt6920 = arg1;
		if (Static222.anInt6920 == 0) {
			Static373.method5115();
			return;
		}
		Static109.aFloat34 = Static219.aFloat74;
		Static441.aClass78_4 = Static256.aClass78_3;
		Static216.aFloat73 = Static449.aFloat95;
		Static189.aFloat63 = Static300.aFloat82;
		Static91.anInt1742 = Static229.anInt5114;
		Static183.anInt3354 = Static187.anInt4911;
		Static32.anInt624 = Static452.anInt7813;
		Static450.aFloat96 = Static153.aFloat88;
		Static387.aFloat90 = Static208.aFloat69;
		Static60.aFloat29 = Static153.aFloat87;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
	public static void method3117(@OriginalArg(0) int arg0) {
		Static440.anInt7583 = -1;
		Static397.anInt6910 = 100;
		Static66.anInt1356 = arg0;
		Static273.anInt4877 = 3;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLclient!lh;)V")
	public static void method3118(@OriginalArg(1) Class1_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static116.anInt2032; local12++) {
			@Pc(18) int local18 = arg0.method4096();
			@Pc(22) int local22 = arg0.method4093();
			if (local22 == 65535) {
				local22 = -1;
			}
			if (Static4.aClass196_Sub1Array1[local18] != null) {
				Static4.aClass196_Sub1Array1[local18].anInt7418 = local22;
			}
		}
	}
}
