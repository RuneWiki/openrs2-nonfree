import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	public static int anInt3001;

	@OriginalMember(owner = "client!mj", name = "Sb", descriptor = "Lclient!mj;")
	public static Class64 aClass64_10;

	@OriginalMember(owner = "client!mj", name = "dc", descriptor = "I")
	public static int anInt3049;

	@OriginalMember(owner = "client!mj", name = "sc", descriptor = "I")
	public static int anInt3060;

	@OriginalMember(owner = "client!mj", name = "Bc", descriptor = "[Lclient!b;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!mj", name = "Pc", descriptor = "I")
	public static int anInt3070;

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "Lclient!qe;")
	public static Class78 aClass78_588 = null;

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
	public static int anInt3014 = 0;

	@OriginalMember(owner = "client!mj", name = "qc", descriptor = "Lclient!qe;")
	private static Class78 aClass78_593 = Static199.method3560(" is already on your ignore list)3");

	@OriginalMember(owner = "client!mj", name = "rb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_591 = aClass78_593;

	@OriginalMember(owner = "client!mj", name = "id", descriptor = "I")
	public static int anInt3079 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)I")
	public static int method2405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		while (arg0 > 0) {
			local5 = arg1 & 0x1 | local5 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local5;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	public static void method2413() {
		while (true) {
			if (Static139.aClass2_Sub23_Sub1_4.method2143(Static145.anInt3288) >= 27) {
				@Pc(20) int local20 = Static139.aClass2_Sub23_Sub1_4.method2154(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static95.aClass5_Sub2_Sub1Array1[local20] == null) {
						local27 = true;
						Static95.aClass5_Sub2_Sub1Array1[local20] = new Class5_Sub2_Sub1();
					}
					@Pc(43) Class5_Sub2_Sub1 local43 = Static95.aClass5_Sub2_Sub1Array1[local20];
					Static79.anIntArray286[Static50.anInt908++] = local20;
					local43.anInt1826 = Static123.anInt2808;
					@Pc(61) int local61 = Static101.anIntArray384[Static139.aClass2_Sub23_Sub1_4.method2154(3)];
					if (local27) {
						local43.anInt1852 = local43.anInt1853 = local61;
					}
					local43.aClass2_Sub3_Sub9_1 = Static35.method432(Static139.aClass2_Sub23_Sub1_4.method2154(14));
					@Pc(82) int local82 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
					@Pc(89) int local89 = Static139.aClass2_Sub23_Sub1_4.method2154(5);
					@Pc(94) int local94 = Static139.aClass2_Sub23_Sub1_4.method2154(5);
					if (local94 > 15) {
						local94 -= 32;
					}
					@Pc(103) int local103 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
					if (local103 == 1) {
						Static156.anIntArray598[Static125.anInt1641++] = local20;
					}
					if (local89 > 15) {
						local89 -= 32;
					}
					local43.anInt1855 = local43.aClass2_Sub3_Sub9_1.anInt1266;
					local43.anInt1879 = local43.aClass2_Sub3_Sub9_1.anInt1268;
					local43.anInt1880 = local43.aClass2_Sub3_Sub9_1.anInt1289;
					local43.anInt1847 = local43.aClass2_Sub3_Sub9_1.anInt1297;
					local43.anInt1840 = local43.aClass2_Sub3_Sub9_1.anInt1270;
					local43.anInt1851 = local43.aClass2_Sub3_Sub9_1.anInt1281;
					if (local43.anInt1840 == 0) {
						local43.anInt1853 = 0;
					}
					local43.anInt1866 = local43.aClass2_Sub3_Sub9_1.anInt1283;
					local43.anInt1832 = local43.aClass2_Sub3_Sub9_1.anInt1284;
					local43.anInt1863 = local43.aClass2_Sub3_Sub9_1.anInt1287;
					local43.method1483(Static31.aClass5_Sub2_Sub2_1.anIntArray333[0] + local94, local89 + Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local82 == 1);
					if (local43.aClass2_Sub3_Sub9_1.method1062()) {
						Static162.method2923(local43.anIntArray333[0], local43, null, Static137.anInt3136, null, local43.anIntArray334[0], 0);
					}
					continue;
				}
			}
			Static139.aClass2_Sub23_Sub1_4.method2149();
			return;
		}
	}
}
