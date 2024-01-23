import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!ji", name = "U", descriptor = "Lclient!qe;")
	private static Class78 aClass78_504 = Static199.method3560("");

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "Lclient!qe;")
	public static Class78 aClass78_500 = aClass78_504;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "Lclient!qe;")
	public static Class78 aClass78_501 = Static199.method3560("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!ji", name = "R", descriptor = "Lclient!qe;")
	public static Class78 aClass78_502 = Static199.method3560("");

	@OriginalMember(owner = "client!ji", name = "S", descriptor = "Lclient!qe;")
	public static Class78 aClass78_503 = Static199.method3560("(Udns");

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V")
	public static void method1813() {
		Static3.anInt99 = 0;
		Static125.anInt1641 = 0;
		Static192.method3522();
		Static52.method673();
		Static195.method3543();
		Static114.method1983();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static3.anInt99; local27++) {
			local33 = Static156.anIntArray597[local27];
			if (Static123.anInt2808 != Static213.aClass5_Sub2_Sub2Array3[local33].anInt1826) {
				if (Static213.aClass5_Sub2_Sub2Array3[local33].anInt1901 > 0) {
					Static188.method3488(Static213.aClass5_Sub2_Sub2Array3[local33]);
				}
				Static213.aClass5_Sub2_Sub2Array3[local33] = null;
			}
		}
		if (Static139.aClass2_Sub23_Sub1_4.anInt2703 != Static145.anInt3288) {
			throw new RuntimeException("gpp1 pos:" + Static139.aClass2_Sub23_Sub1_4.anInt2703 + " psize:" + Static145.anInt3288);
		}
		for (local33 = 0; local33 < Static180.anInt4193; local33++) {
			if (Static213.aClass5_Sub2_Sub2Array3[Static16.anIntArray792[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static180.anInt4193);
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)J")
	public static long method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass27_1 == null ? 0L : local7.aClass27_1.aLong30;
	}
}
