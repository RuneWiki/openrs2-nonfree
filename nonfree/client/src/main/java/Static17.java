import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!ch;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!pca;")
	public static final Class265 aClass265_1 = new Class265();

	@OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
	public static final int[] anIntArray19 = new int[64];

	@OriginalMember(owner = "client!am", name = "e", descriptor = "Lclient!sc;")
	public static final Class105 aClass105_1 = Static370.method5422();

	@OriginalMember(owner = "client!am", name = "g", descriptor = "[I")
	public static final int[] anIntArray20 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Z")
	public static boolean method395() {
		try {
			if (Static2.anInt71 == 2) {
				if (Static394.aClass1_Sub36_2 == null) {
					Static394.aClass1_Sub36_2 = Static602.method5160(Static148.aClass308_59, Static403.anInt7226, Static215.anInt3929);
					if (Static394.aClass1_Sub36_2 == null) {
						return false;
					}
				}
				if (Static145.aClass257_1 == null) {
					Static145.aClass257_1 = new Class257(Static182.aClass308_73, Static319.aClass308_113);
				}
				@Pc(31) Class1_Sub6_Sub2 local31 = Static54.aClass1_Sub6_Sub2_2;
				if (Static144.aClass1_Sub6_Sub2_4 != null) {
					local31 = Static144.aClass1_Sub6_Sub2_4;
				}
				if (local31.method3514(Static588.aClass308_196, Static394.aClass1_Sub36_2, Static145.aClass257_1)) {
					Static54.aClass1_Sub6_Sub2_2 = local31;
					Static54.aClass1_Sub6_Sub2_2.method3526();
					@Pc(70) int local70;
					if (Static556.anInt9256 > 0) {
						Static2.anInt71 = 3;
						Static54.aClass1_Sub6_Sub2_2.method3512(Static556.anInt9256 > Static429.anInt7683 ? Static429.anInt7683 : Static556.anInt9256);
						for (local70 = 0; local70 < Static527.anIntArray557.length; local70++) {
							Static54.aClass1_Sub6_Sub2_2.method3522(local70, Static527.anIntArray557[local70]);
							Static527.anIntArray557[local70] = 255;
						}
					} else {
						Static2.anInt71 = 0;
						Static54.aClass1_Sub6_Sub2_2.method3512(Static429.anInt7683);
						for (local70 = 0; local70 < Static527.anIntArray557.length; local70++) {
							Static54.aClass1_Sub6_Sub2_2.method3522(local70, Static527.anIntArray557[local70]);
							Static527.anIntArray557[local70] = 255;
						}
					}
					if (Static144.aClass1_Sub6_Sub2_4 == null) {
						if (Static308.aLong139 <= 0L) {
							Static54.aClass1_Sub6_Sub2_2.method3521(Static394.aClass1_Sub36_2, Static167.aBoolean229);
						} else {
							Static54.aClass1_Sub6_Sub2_2.method3523(Static308.aLong139, Static394.aClass1_Sub36_2, Static167.aBoolean229);
						}
					}
					if (Static193.aClass76_6 != null) {
						Static193.aClass76_6.method2506(Static54.aClass1_Sub6_Sub2_2);
					}
					Static394.aClass1_Sub36_2 = null;
					Static148.aClass308_59 = null;
					Static308.aLong139 = 0L;
					Static145.aClass257_1 = null;
					Static144.aClass1_Sub6_Sub2_4 = null;
					return true;
				}
			}
		} catch (@Pc(159) Exception local159) {
			local159.printStackTrace();
			Static54.aClass1_Sub6_Sub2_2.method3527();
			Static144.aClass1_Sub6_Sub2_4 = null;
			Static2.anInt71 = 0;
			Static145.aClass257_1 = null;
			Static148.aClass308_59 = null;
			Static394.aClass1_Sub36_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIZIII)V")
	public static void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 ? Static86.aClass1_Sub30_Sub1_1.anInt6205 : Static86.aClass1_Sub30_Sub1_1.anInt6185) != 0 && arg1 != 0 && Static439.anInt8379 < 50 && arg3 != -1) {
			Static73.aClass239Array1[Static439.anInt8379++] = new Class239((byte) (arg2 ? 3 : 2), arg3, arg1, arg5, arg4, 0, arg0, null);
		}
	}
}
