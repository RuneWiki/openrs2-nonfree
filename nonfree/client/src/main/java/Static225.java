import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_68;

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lclient!bh;")
	public static Class1_Sub4_Sub1 aClass1_Sub4_Sub1_3;

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "Lclient!wi;")
	public static Class1_Sub16_Sub1 aClass1_Sub16_Sub1_4 = new Class1_Sub16_Sub1(5000);

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1612 = Static64.method1101("unzap");

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "Lclient!ie;")
	public static Class53 aClass53_32 = new Class53(30);

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "[I")
	public static int[] anIntArray375 = new int[50];

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1614 = Static64.method1101("Hidden");

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1613 = aClass51_1614;

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
	public static int anInt4729 = 0;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1615 = Static64.method1101("welle2:");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method3684() {
		Static37.anInt896 = 0;
		Static226.anInt4738 = 0;
		Static199.method3290();
		Static141.method2423();
		Static15.method289();
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static37.anInt896; local22++) {
			local28 = Static61.anIntArray91[local22];
			if (Static109.anInt2430 != Static168.aClass5_Sub1_Sub2Array1[local28].anInt3627) {
				if (Static168.aClass5_Sub1_Sub2Array1[local28].aClass27_1.method603()) {
					Static82.method1410(Static168.aClass5_Sub1_Sub2Array1[local28]);
				}
				Static168.aClass5_Sub1_Sub2Array1[local28].aClass27_1 = null;
				Static168.aClass5_Sub1_Sub2Array1[local28] = null;
			}
		}
		if (Static142.anInt3128 != aClass1_Sub16_Sub1_4.anInt4860) {
			throw new RuntimeException("gnp1 pos:" + aClass1_Sub16_Sub1_4.anInt4860 + " psize:" + Static142.anInt3128);
		}
		for (local28 = 0; local28 < Static58.anInt1372; local28++) {
			if (Static168.aClass5_Sub1_Sub2Array1[Static202.anIntArray326[local28]] == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static58.anInt1372);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)J")
	public static long method3687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass62_1 == null ? 0L : local7.aClass62_1.aLong84;
	}
}
