import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!hh", name = "bb", descriptor = "[I")
	public static int[] anIntArray194;

	@OriginalMember(owner = "client!hh", name = "fb", descriptor = "Lclient!nb;")
	public static Class15 aClass15_18;

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_48;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
	public static int anInt1950 = 0;

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_590 = Static184.method2923("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "Lclient!i;")
	public static Class41 aClass41_591 = Static184.method2923("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!hh", name = "X", descriptor = "Lclient!i;")
	public static Class41 aClass41_592 = Static184.method2923("Spielwelt erstellt)3");

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "Lclient!i;")
	private static Class41 aClass41_593 = Static184.method2923("Loaded wordpack");

	@OriginalMember(owner = "client!hh", name = "hb", descriptor = "Lclient!i;")
	public static Class41 aClass41_594 = aClass41_593;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	public static void method1379() {
		@Pc(5) byte[][] local5 = Static41.aByteArrayArray5;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			Static194.method3305();
			for (@Pc(17) int local17 = 0; local17 < 13; local17++) {
				for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
					@Pc(31) int local31 = Static97.anIntArrayArrayArray13[local11][local17][local21];
					if (local31 != -1) {
						@Pc(40) int local40 = local31 >> 24 & 0x3;
						@Pc(53) int local53 = local31 >> 1 & 0x3;
						@Pc(59) int local59 = local31 >> 14 & 0x3FF;
						@Pc(65) int local65 = local31 >> 3 & 0x7FF;
						@Pc(76) int local76 = (local59 / 8 << 8) + (local65 / 8);
						for (@Pc(78) int local78 = 0; local78 < Static131.anIntArray320.length; local78++) {
							if (local76 == Static131.anIntArray320[local78] && local5[local78] != null) {
								Static188.method2995(local53, (local59 & 0x7) * 8, Static149.aClass42Array1, (local65 & 0x7) * 8, local11, local5[local78], local40, local21 * 8, local17 * 8);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ea;I)Lclient!lb;")
	public static Class28_Sub3 method1380(@OriginalArg(0) Class2_Sub3 arg0) {
		return new Class28_Sub3(arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method166(), arg0.method166(), arg0.method209());
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
	public static void method1382() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static10.anInt369; local1++) {
			for (local4 = 0; local4 < Static44.anInt1331; local4++) {
				for (local7 = 0; local7 < Static59.anInt1642; local7++) {
					Static27.aClass2_Sub7ArrayArrayArray4[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static56.anInt1606; local4++) {
			for (local7 = 0; local7 < Static56.anIntArray158[local4]; local7++) {
				Static56.aClass8ArrayArray1[local4][local7] = null;
			}
			Static56.anIntArray158[local4] = 0;
		}
		for (local7 = 0; local7 < Static23.anInt594; local7++) {
			Static134.aClass51Array2[local7] = null;
		}
		Static23.anInt594 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static212.aClass51Array3.length; local69++) {
			Static212.aClass51Array3[local69] = null;
		}
	}
}
