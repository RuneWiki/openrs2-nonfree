import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!dj", name = "Gb", descriptor = "[I")
	public static int[] anIntArray103;

	@OriginalMember(owner = "client!dj", name = "ac", descriptor = "I")
	public static int anInt1214;

	@OriginalMember(owner = "client!dj", name = "mc", descriptor = "I")
	public static int anInt1221;

	@OriginalMember(owner = "client!dj", name = "Rb", descriptor = "Lclient!i;")
	public static Class41 aClass41_361 = Static184.method2923("::autoshadow on");

	@OriginalMember(owner = "client!dj", name = "hc", descriptor = "Lclient!i;")
	public static Class41 aClass41_363 = Static184.method2923("Texturen geladen)3");

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)V")
	public static void method855(@OriginalArg(0) int arg0) {
		Static146.anInt3317 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static44.anInt1331; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static59.anInt1642; local6++) {
				if (Static27.aClass2_Sub7ArrayArrayArray4[arg0][local3][local6] == null) {
					Static27.aClass2_Sub7ArrayArrayArray4[arg0][local3][local6] = new Class2_Sub7(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(DB)V")
	public static void method856(@OriginalArg(0) double arg0) {
		if (Static189.aDouble11 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static156.anIntArray392[local7] = local19 <= 255 ? local19 : 255;
		}
		Static189.aDouble11 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IBZI)V")
	public static void method858(@OriginalArg(2) boolean arg0) {
		Static10.anInt374 = 22050;
		Static6.aBoolean13 = arg0;
		Static196.anInt4429 = 2;
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
	public static void method861() {
		for (@Pc(15) Class2_Sub16 local15 = (Class2_Sub16) Static59.aClass108_5.method3322(); local15 != null; local15 = (Class2_Sub16) Static59.aClass108_5.method3331()) {
			if (local15.aClass2_Sub6_Sub2_3 != null) {
				Static200.aClass2_Sub6_Sub4_2.method3097(local15.aClass2_Sub6_Sub2_3);
				local15.aClass2_Sub6_Sub2_3 = null;
			}
			if (local15.aClass2_Sub6_Sub2_2 != null) {
				Static200.aClass2_Sub6_Sub4_2.method3097(local15.aClass2_Sub6_Sub2_2);
				local15.aClass2_Sub6_Sub2_2 = null;
			}
		}
		Static59.aClass108_5.method3328();
	}
}
