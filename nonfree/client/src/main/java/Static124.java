import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1215 = Static51.method932(": ");

	@OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
	public static int anInt2817 = 0;

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1216 = Static51.method932("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1217 = Static51.method932("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!pe", name = "ib", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1218 = Static51.method932("(U5");

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	public static void method1998() {
		aClass10_1216 = null;
		aClass10_1217 = null;
		aClass10_1215 = null;
		aClass10_1218 = null;
		aBigInteger2 = null;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
	public static void method2000() {
		@Pc(10) int local10 = Static75.aClass2_Sub11_Sub1_1.method1490(8);
		@Pc(19) int local19;
		if (local10 < Static54.anInt1354) {
			for (local19 = local10; local19 < Static54.anInt1354; local19++) {
				Static53.anIntArray144[Static94.anInt2248++] = Static66.anIntArray175[local19];
			}
		}
		if (local10 > Static54.anInt1354) {
			throw new RuntimeException("gppov1");
		}
		Static54.anInt1354 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(66) int local66 = Static66.anIntArray175[local19];
			@Pc(70) Class2_Sub1_Sub3_Sub2_Sub1 local70 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local66];
			@Pc(77) int local77 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
			if (local77 == 0) {
				Static66.anIntArray175[Static54.anInt1354++] = local66;
				local70.anInt3491 = Static14.anInt386;
			} else {
				@Pc(100) int local100 = Static75.aClass2_Sub11_Sub1_1.method1490(2);
				if (local100 == 0) {
					Static66.anIntArray175[Static54.anInt1354++] = local66;
					local70.anInt3491 = Static14.anInt386;
					Static142.anIntArray334[Static97.anInt2273++] = local66;
				} else {
					@Pc(144) int local144;
					@Pc(154) int local154;
					if (local100 == 1) {
						Static66.anIntArray175[Static54.anInt1354++] = local66;
						local70.anInt3491 = Static14.anInt386;
						local144 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
						local70.method2461(false, local144);
						local154 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
						if (local154 == 1) {
							Static142.anIntArray334[Static97.anInt2273++] = local66;
						}
					} else if (local100 == 2) {
						Static66.anIntArray175[Static54.anInt1354++] = local66;
						local70.anInt3491 = Static14.anInt386;
						local144 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
						local70.method2461(true, local144);
						local154 = Static75.aClass2_Sub11_Sub1_1.method1490(3);
						local70.method2461(true, local154);
						@Pc(208) int local208 = Static75.aClass2_Sub11_Sub1_1.method1490(1);
						if (local208 == 1) {
							Static142.anIntArray334[Static97.anInt2273++] = local66;
						}
					} else if (local100 == 3) {
						Static53.anIntArray144[Static94.anInt2248++] = local66;
					}
				}
			}
		}
	}
}
