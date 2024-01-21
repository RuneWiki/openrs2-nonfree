import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] aClass1_Sub3_Sub1_Sub3Array2;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Lclient!of;")
	public static Class1_Sub17 aClass1_Sub17_9;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "Lclient!af;")
	private static Class5 aClass5_103 = Static45.method1937("wishes to trade with you)3");

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!af;")
	public static Class5 aClass5_104 = Static45.method1937("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt153 = 500;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!af;")
	public static Class5 aClass5_105 = Static45.method1937(" )2>");

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_106 = Static45.method1937("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_107 = aClass5_103;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "[I")
	public static int[] anIntArray28 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_108 = Static45.method1937("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method175() {
		aClass1_Sub17_9 = null;
		aClass5_108 = null;
		aClass5_106 = null;
		aClass5_105 = null;
		aClass5_103 = null;
		aClass5_107 = null;
		aClass5_104 = null;
		aClass1_Sub3_Sub1_Sub3Array2 = null;
		anIntArray28 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
	public static void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg2 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(18) int local18 = 2048 - arg5 & 0x7FF;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg3;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (local10 != 0) {
			local31 = Class1_Sub3_Sub1_Sub4.anIntArray425[local10];
			local35 = Class1_Sub3_Sub1_Sub4.anIntArray424[local10];
			local46 = local35 * 0 - local31 * arg3 >> 16;
			local22 = local31 * 0 + local35 * arg3 >> 16;
			local20 = local46;
		}
		if (local18 != 0) {
			local31 = Class1_Sub3_Sub1_Sub4.anIntArray425[local18];
			local35 = Class1_Sub3_Sub1_Sub4.anIntArray424[local18];
			local46 = local31 * local22 + local35 * 0 >> 16;
			local22 = local22 * local35 - local31 * 0 >> 16;
			local12 = local46;
		}
		Static109.anInt2693 = arg2;
		Static91.anInt2286 = arg1 - local20;
		Static66.anInt3170 = arg0 - local12;
		Static76.anInt1794 = arg5;
		Static121.anInt3115 = arg4 - local22;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	public static void method178() {
		Static103.anInt2537 = 0;
		Static86.anInt2184 = 0;
		Static131.method2260();
		Static79.method1371();
		Static1.method51();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static103.anInt2537; local17++) {
			local23 = Static75.anIntArray289[local17];
			if (Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local23].anInt3066 != Static131.anInt3270) {
				Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local23].aClass1_Sub3_Sub12_1 = null;
				Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local23] = null;
			}
		}
		if (Static79.aClass1_Sub20_Sub1_2.anInt2951 != Static77.anInt1803) {
			throw new RuntimeException("gnp1 pos:" + Static79.aClass1_Sub20_Sub1_2.anInt2951 + " psize:" + Static77.anInt1803);
		}
		for (local23 = 0; local23 < Static93.anInt2338; local23++) {
			if (Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[Static131.anIntArray468[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static93.anInt2338);
			}
		}
	}
}
