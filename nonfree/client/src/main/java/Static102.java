import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ha", name = "S", descriptor = "Lclient!rn;")
	public static Class155 aClass155_49;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	public static int anInt1860 = -1;

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "[I")
	public static int[] anIntArray188 = new int[2048];

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
	public static int anInt1875 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public static void method1625() {
		if (Static87.aBoolean314) {
			return;
		}
		if (Static247.aBoolean348) {
			Static84.aFloat21 = (int) Static84.aFloat21 - 65 & 0xFFFFFF80;
		} else {
			Static199.aFloat53 += (-24.0F - Static199.aFloat53) / 2.0F;
		}
		Static153.aBoolean205 = true;
		Static87.aBoolean314 = true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBLclient!rn;IIZI)V")
	public static void method1626(@OriginalArg(2) Class155 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		Static110.anInt2029 = arg2;
		Static306.anInt6012 = arg1;
		Static305.aBoolean426 = false;
		Static93.anInt1696 = 0;
		Static44.anInt828 = 2;
		Static310.aClass155_122 = arg0;
		Static94.anInt1711 = 1;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)Lclient!qg;")
	public static Class87_Sub1 method1627(@OriginalArg(0) int arg0) {
		return Static134.aBoolean312 && arg0 >= Static232.anInt4519 && Static13.anInt240 >= arg0 ? Static186.aClass87_Sub1Array2[arg0 - Static232.anInt4519] : null;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
	public static void method1628() {
		@Pc(13) int[] local13 = new int[Static300.anInt5928];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static300.anInt5928; local17++) {
			@Pc(24) Class21 local24 = Static133.method2309(local17);
			if (local24.anInt495 >= 0 || local24.anInt505 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static95.anIntArray167 = new int[local15];
		for (local17 = 0; local17 < local15; local17++) {
			Static95.anIntArray167[local17] = local13[local17];
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
	public static void method1630() {
		Static286.method4489();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static138.aClass153Array1[local8].method4081();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public static void method1632() {
		if (Static125.aClass41_1 != null) {
			@Pc(9) Class41 local9 = Static125.aClass41_1;
			synchronized (Static125.aClass41_1) {
				Static125.aClass41_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
	public static void method1633() {
		Static192.anInt3770 = 0;
		Static11.anInt5178 = 0;
		Static273.method4494();
		Static104.method1672();
		Static167.method2787();
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static192.anInt3770; local17++) {
			@Pc(24) int local24 = Static103.anIntArray192[local17];
			if (Static110.aClass10_Sub5_Sub2Array1[local24].anInt5095 != Static124.anInt2371) {
				if (Static110.aClass10_Sub5_Sub2Array1[local24].aClass124_1.method3189()) {
					Static5.method103(Static110.aClass10_Sub5_Sub2Array1[local24]);
				}
				Static110.aClass10_Sub5_Sub2Array1[local24].method4209(null);
				Static110.aClass10_Sub5_Sub2Array1[local24] = null;
			}
		}
		if (Static249.aClass3_Sub26_Sub1_3.anInt4615 != Static287.anInt5742) {
			throw new RuntimeException("gnp1 pos:" + Static249.aClass3_Sub26_Sub1_3.anInt4615 + " psize:" + Static287.anInt5742);
		}
		for (local17 = 0; local17 < Static118.anInt2202; local17++) {
			if (Static110.aClass10_Sub5_Sub2Array1[Static253.anIntArray547[local17]] == null) {
				throw new RuntimeException("gnp2 pos:" + local17 + " size:" + Static118.anInt2202);
			}
		}
	}
}
