import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static int anInt3133;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!ca;")
	public static Class13_Sub1 aClass13_Sub1_14;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_877 = Static158.method3034("p12_full");

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_878 = Static158.method3034("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_881 = Static158.method3034("Checking for updates )2 ");

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!ob;")
	public static Class60 aClass60_879 = aClass60_881;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_880 = Static158.method3034("VOLL");

	@OriginalMember(owner = "client!me", name = "n", descriptor = "[I")
	public static final int[] anIntArray357 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIB)V")
	public static void method2466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
			Static108.anInt3083 = -1;
			Static15.anInt507 = -1;
			return;
		}
		@Pc(37) int local37 = Static182.method3393(Static62.anInt1923, arg2, arg1) - arg0;
		@Pc(41) int local41 = Class2_Sub1_Sub7_Sub1.anIntArray129[Static158.anInt4007];
		@Pc(45) int local45 = Class2_Sub1_Sub7_Sub1.anIntArray133[Static19.anInt3094];
		@Pc(49) int local49 = local37 - Static172.anInt4190;
		@Pc(53) int local53 = Class2_Sub1_Sub7_Sub1.anIntArray133[Static158.anInt4007];
		@Pc(57) int local57 = Class2_Sub1_Sub7_Sub1.anIntArray129[Static19.anInt3094];
		@Pc(61) int local61 = arg1 - Static166.anInt4103;
		@Pc(65) int local65 = arg2 - Static161.anInt4013;
		@Pc(76) int local76 = local61 * local53 + local65 * local41 >> 16;
		@Pc(86) int local86 = local41 * local61 - local53 * local65 >> 16;
		@Pc(88) int local88 = local76;
		@Pc(98) int local98 = local49 * local57 - local45 * local86 >> 16;
		@Pc(109) int local109 = local45 * local49 + local57 * local86 >> 16;
		if (local109 >= 50) {
			Static108.anInt3083 = (local98 << 9) / local109 + 167;
			Static15.anInt507 = (local88 << 9) / local109 + 256;
		} else {
			Static108.anInt3083 = -1;
			Static15.anInt507 = -1;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
	public static void method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt3604; local12++) {
			@Pc(18) Class6 local18 = local7.aClass6Array2[local12];
			if ((local18.aLong8 >> 29 & 0x3L) == 2L && local18.anInt299 == arg1 && local18.anInt291 == arg2) {
				Static1.method6(local18);
				return;
			}
		}
	}
}
