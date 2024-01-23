import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "J")
	public static long aLong96;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Z")
	public static boolean aBoolean212 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
	public static void method2364(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class1_Sub2_Sub11 local13 = Static163.method3579(4, arg3);
		local13.method1859();
		local13.anInt2274 = arg1;
		local13.anInt2282 = arg0;
		local13.anInt2279 = arg2;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Lclient!um;")
	public static Class166 method2366(@OriginalArg(0) int arg0) {
		@Pc(6) Class166 local6 = (Class166) Static47.aClass31_45.method852((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(26) byte[] local26 = Static13.aClass7_145.method253(arg0, 3);
		local6 = new Class166();
		if (local26 != null) {
			local6.method4191(new Class1_Sub18(local26));
		}
		Static47.aClass31_45.method851(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)V")
	public static void method2367(@OriginalArg(0) int arg0) {
		Static34.method632(Static34.anInt728, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		Static34.method628(-50.0F, -60.0F, -50.0F);
		Static34.method623(Static34.anInt730, 0, false);
		Static34.method625();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public static void method2369(@OriginalArg(0) boolean arg0) {
		@Pc(17) byte local17;
		@Pc(19) byte[][] local19;
		if (Static240.aBoolean369 && arg0) {
			local19 = Static291.aByteArrayArray14;
			local17 = 1;
		} else {
			local17 = 4;
			local19 = Static242.aByteArrayArray11;
		}
		@Pc(28) int local28 = local19.length;
		@Pc(30) int local30;
		@Pc(51) int local51;
		for (local30 = 0; local30 < local28; local30++) {
			@Pc(39) int[] local39 = null;
			@Pc(45) int local45 = Static177.anIntArray389[local30] >> 8;
			local51 = Static177.anIntArray389[local30] & 0xFF;
			@Pc(58) int local58 = local45 * 64 - Static224.anInt4695;
			@Pc(65) int local65 = local51 * 64 - Static158.anInt2961;
			@Pc(69) byte[] local69 = local19[local30];
			if (local69 != null) {
				Static39.method716();
				local39 = Static63.method1053(local58, Static224.anInt4695, local65, local69, arg0, Static27.aClass2Array1, Static158.anInt2961);
			}
			if (!arg0 && Static75.anInt1495 / 8 == local45 && Static179.anInt3322 / 8 == local51) {
				if (local39 == null) {
					Static139.anInt2613 = -1;
				} else {
					Static139.anInt2613 = local39[0];
					Static143.anInt2664 = local39[4];
					Static298.anInt5907 = local39[3];
					Static67.anInt1384 = local39[2];
					Static23.anInt5827 = local39[1];
				}
			}
		}
		for (local30 = 0; local30 < local28; local30++) {
			@Pc(147) int local147 = (Static177.anIntArray389[local30] >> 8) * 64 - Static224.anInt4695;
			@Pc(151) byte[] local151 = local19[local30];
			@Pc(162) int local162 = (Static177.anIntArray389[local30] & 0xFF) * 64 - Static158.anInt2961;
			if (local151 == null && Static179.anInt3322 < 800) {
				Static39.method716();
				for (local51 = 0; local51 < local17; local51++) {
					Static265.method4065(local162, 64, local51, 64, local147);
				}
			}
		}
	}
}
