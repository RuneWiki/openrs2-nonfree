import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[8];

	@OriginalMember(owner = "client!lk", name = "E", descriptor = "I")
	public static int anInt4107 = 0;

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_126 = new Class107(108, 0);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ah;I)V")
	public static void method3453(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static194.anInt3474; local12++) {
			@Pc(18) int local18 = Static260.anIntArray404[local12];
			@Pc(22) Class31_Sub2_Sub1_Sub1 local22 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local18];
			@Pc(26) int local26 = arg0.method5366();
			if ((local26 & 0x8) != 0) {
				local26 += arg0.method5366() << 8;
			}
			if ((local26 & 0x400) != 0) {
				local26 += arg0.method5366() << 16;
			}
			Static181.method2871(local26, local22, arg0, local18);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)V")
	public static void method3455(@OriginalArg(0) boolean arg0) {
		if (Static82.aClass229_1 != null) {
			Static82.aClass229_1.method5204();
			Static82.aClass229_1 = null;
		}
		Static90.anInt1905 = 0;
		Static67.method1324();
		Static266.method5703();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static125.aClass188Array1[local22].method4320();
		}
		Static127.method2242(false);
		System.gc();
		Static148.method2441();
		Static176.aBoolean196 = false;
		Static105.anInt2176 = -1;
		Static245.method3716(true);
		Static23.anInt5194 = 0;
		Static165.anInt3049 = 0;
		Static303.anInt5255 = 0;
		Static345.anInt5799 = 0;
		Static307.anInt5295 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static353.aClass83Array2.length; local58++) {
			Static353.aClass83Array2[local58] = null;
		}
		Static126.method2240();
		for (@Pc(76) int local76 = 0; local76 < 2048; local76++) {
			Static458.aClass31_Sub2_Sub1_Sub1Array1[local76] = null;
		}
		Static5.anInt163 = 0;
		for (@Pc(91) int local91 = 0; local91 < 32768; local91++) {
			Static98.aClass31_Sub2_Sub1_Sub2Array1[local91] = null;
		}
		Static129.aClass96_24.method2338();
		Static400.method5339();
		Static16.anInt474 = 0;
		Static394.aClass23_1.method601();
		Static74.method1491();
		Static363.method2949();
		Static171.aClass1_Sub39_1 = null;
		Static115.aLong80 = 0L;
		if (arg0) {
			Static193.method2987(11);
			return;
		}
		Static193.method2987(2);
		try {
			Static463.method2376("loggedout", Static77.aClass180_1.anApplet1);
		} catch (@Pc(133) Throwable local133) {
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)Z")
	public static boolean method3457() {
		try {
			if (Static390.anInt6278 == 2) {
				if (Static233.aClass1_Sub1_2 == null) {
					Static233.aClass1_Sub1_2 = Static460.method13(Static157.aClass246_114, Static152.anInt2905, Static286.anInt5015);
					if (Static233.aClass1_Sub1_2 == null) {
						return false;
					}
				}
				if (Static39.aClass24_1 == null) {
					Static39.aClass24_1 = new Class24(Static132.aClass246_83, Static331.aClass246_222);
				}
				if (Static244.aClass1_Sub19_Sub4_2.method3663(Static39.aClass24_1, Static233.aClass1_Sub1_2, Static108.aClass246_66)) {
					Static244.aClass1_Sub19_Sub4_2.method3656();
					Static244.aClass1_Sub19_Sub4_2.method3684(Static53.anInt991);
					Static244.aClass1_Sub19_Sub4_2.method3682(Static59.aBoolean86, Static233.aClass1_Sub1_2);
					Static39.aClass24_1 = null;
					Static157.aClass246_114 = null;
					Static390.anInt6278 = 0;
					Static233.aClass1_Sub1_2 = null;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static244.aClass1_Sub19_Sub4_2.method3664();
			Static39.aClass24_1 = null;
			Static233.aClass1_Sub1_2 = null;
			Static157.aClass246_114 = null;
			Static390.anInt6278 = 0;
		}
		return false;
	}
}
