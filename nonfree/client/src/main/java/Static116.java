import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1136 = Static51.method932("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1137 = Static51.method932("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1138 = Static51.method932("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!of", name = "v", descriptor = "[Lclient!cd;")
	public static Class10[] aClass10Array20 = new Class10[100];

	@OriginalMember(owner = "client!of", name = "w", descriptor = "I")
	public static int anInt2644 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
	public static void method1882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static5.anInt120 = -1;
			Static117.anInt2671 = -1;
			return;
		}
		@Pc(37) int local37 = Static178.method2702(arg2, arg1, Static56.anInt1432) - arg0;
		@Pc(41) int local41 = arg1 - Static107.anInt2447;
		@Pc(45) int local45 = local37 - Static110.anInt2509;
		@Pc(49) int local49 = Class2_Sub1_Sub4_Sub4.anIntArray299[Static161.anInt3427];
		@Pc(53) int local53 = Class2_Sub1_Sub4_Sub4.anIntArray299[Static95.anInt2250];
		@Pc(57) int local57 = Class2_Sub1_Sub4_Sub4.anIntArray304[Static95.anInt2250];
		@Pc(61) int local61 = arg2 - Static104.anInt2384;
		@Pc(65) int local65 = Class2_Sub1_Sub4_Sub4.anIntArray304[Static161.anInt3427];
		@Pc(76) int local76 = local49 * local61 + local65 * local41 >> 16;
		@Pc(87) int local87 = local65 * local61 - local41 * local49 >> 16;
		@Pc(89) int local89 = local76;
		@Pc(99) int local99 = local57 * local45 - local53 * local87 >> 16;
		@Pc(109) int local109 = local87 * local57 + local45 * local53 >> 16;
		if (local109 >= 50) {
			Static117.anInt2671 = (local99 << 9) / local109 + 167;
			Static5.anInt120 = (local89 << 9) / local109 + 256;
		} else {
			Static117.anInt2671 = -1;
			Static5.anInt120 = -1;
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
	public static void method1883() {
		Static99.aClass72_18.method2261();
		Static24.aClass72_3.method2261();
		Static27.aClass72_6.method2261();
		Static119.aClass72_20.method2261();
		Static48.aClass72_12.method2261();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BB)[B")
	public static byte[] method1884(@OriginalArg(0) byte[] arg0) {
		@Pc(11) Class2_Sub11 local11 = new Class2_Sub11(arg0);
		@Pc(19) int local19 = local11.method1461();
		@Pc(23) int local23 = local11.method1449();
		if (local23 < 0 || Static109.anInt2492 != 0 && Static109.anInt2492 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(89) byte[] local89 = new byte[local23];
			local11.method1473(local23, local89);
			return local89;
		} else {
			@Pc(46) int local46 = local11.method1449();
			if (local46 < 0 || Static109.anInt2492 != 0 && Static109.anInt2492 < local46) {
				throw new RuntimeException();
			}
			@Pc(67) byte[] local67 = new byte[local46];
			if (local19 == 1) {
				Static31.method651(local67, local46, arg0, local23);
			} else {
				Static100.aClass53_1.method1663(local67, local11);
			}
			return local67;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method1885() {
		aClass10_1136 = null;
		aClass10Array20 = null;
		aClass10_1138 = null;
		aClass10_1137 = null;
	}
}
