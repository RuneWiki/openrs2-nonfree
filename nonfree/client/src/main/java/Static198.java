import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "Lclient!ij;")
	public static Class93 aClass93_76;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!tn;")
	public static Class190 aClass190_21 = new Class190(8);

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Lclient!le;")
	public static final Class122 aClass122_8 = new Class122(64);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIBI)V")
	public static void method3483(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static129.aLong84 = 0L;
		@Pc(13) int local13 = Static101.method1804();
		if (arg3 == 3 || local13 == 3) {
			arg1 = true;
		}
		if (!Static236.aClass55_9.method5158()) {
			arg1 = true;
		}
		Static9.method174(local13, arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	public static void method3488() {
		Static195.anInt3883 = 0;
		Static200.anInt3972 = 0;
		Static127.method2264();
		Static271.method4756();
		Static348.method5934();
		Static299.method6015();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static200.anInt3972; local19++) {
			local25 = Static86.anIntArray135[local19];
			if (Static283.anInt5563 != Static62.aClass4_Sub5_Sub2_Sub1Array1[local25].anInt5350) {
				if (Static62.aClass4_Sub5_Sub2_Sub1Array1[local25].anInt4543 > 0) {
					Static235.method4167(Static62.aClass4_Sub5_Sub2_Sub1Array1[local25]);
				}
				Static62.aClass4_Sub5_Sub2_Sub1Array1[local25] = null;
			}
		}
		if (Static187.aClass5_Sub12_Sub2_4.anInt5731 != Static54.anInt1000) {
			throw new RuntimeException("gpp1 pos:" + Static187.aClass5_Sub12_Sub2_4.anInt5731 + " psize:" + Static54.anInt1000);
		}
		for (local25 = 0; local25 < Static22.anInt472; local25++) {
			if (Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static22.anInt472);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
	public static void method3495(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static178.aClass174ArrayArrayArray3 = Static52.aClass174ArrayArrayArray1;
			Static8.aClass51Array1 = Static219.aClass51Array3;
		} else {
			Static178.aClass174ArrayArrayArray3 = Static104.aClass174ArrayArrayArray2;
			Static8.aClass51Array1 = Static56.aClass51Array2;
		}
		Static345.anInt6647 = Static178.aClass174ArrayArrayArray3.length;
	}
}
