import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!dr", name = "bb", descriptor = "I")
	public static int anInt1458;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!us;")
	public static final Class234 aClass234_32 = new Class234(67, 1);

	@OriginalMember(owner = "client!dr", name = "A", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!dr", name = "eb", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public static void method1209() {
		@Pc(13) int[] local13 = new int[Static176.aClass78_3.anInt1957];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static176.aClass78_3.anInt1957; local17++) {
			@Pc(24) Class51 local24 = Static176.aClass78_3.method1641(local17);
			if (local24.anInt1189 >= 0 || local24.anInt1184 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static4.anIntArray12 = new int[local15];
		for (@Pc(51) int local51 = 0; local51 < local15; local51++) {
			Static4.anIntArray12[local51] = local13[local51];
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public static void method1213() {
		Static125.aClass134_3.method2925();
		Static147.aClass210_3.method4767();
		Static102.aClass223_1.method5082();
		Static97.aClass217_4.method5008();
		Static90.aClass83_2.method1718();
		Static176.aClass78_3.method1648();
		Static176.aClass43_2.method934();
		Static224.aClass203_2.method4563();
		Static139.aClass163_1.method3737();
		Static131.aClass183_1.method4261();
		Static79.aClass124_1.method2633();
		Static319.aClass24_4.method320();
		Static326.aClass195_4.method4495();
		Static330.aClass26_1.method335();
		Static255.aClass187_2.method4283();
		Static66.aClass182_1.method4249();
		Static253.aClass218_1.method5014();
		Static13.aClass97_3.method2013();
		Static205.aClass224_2.method5109();
		Static125.aClass212_1.method4800();
		Static157.method2410();
		Static6.method91();
		Static123.method1996();
		Static66.method1121();
		Static390.aClass139_79.method3072();
		Static252.aClass139_51.method3072();
		Static171.aClass139_36.method3072();
		Static208.aClass139_44.method3072();
		Static124.aClass139_28.method3072();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([[BLclient!ir;I)V")
	public static void method1215(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class117_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(22) int local22 = 0; local22 < arg1.anInt2835; local22++) {
			Static381.method5665();
			for (@Pc(28) int local28 = 0; local28 < Static12.anInt161 >> 3; local28++) {
				for (@Pc(32) int local32 = 0; local32 < Static44.anInt787 >> 3; local32++) {
					@Pc(36) boolean local36 = false;
					@Pc(44) int local44 = Static81.anIntArrayArrayArray9[local22][local28][local32];
					if (local44 != -1) {
						@Pc(53) int local53 = local44 >> 24 & 0x3;
						if (!arg1.aBoolean215 || local53 == 0) {
							@Pc(64) int local64 = local44 >> 1 & 0x3;
							@Pc(70) int local70 = local44 >> 14 & 0x3FF;
							@Pc(76) int local76 = local44 >> 3 & 0x7FF;
							@Pc(87) int local87 = (local70 / 8 << 8) + (local76 / 8);
							for (@Pc(89) int local89 = 0; local89 < Static136.anIntArray273.length; local89++) {
								if (local87 == Static136.anIntArray273[local89] && arg0[local89] != null) {
									@Pc(111) Class3_Sub5 local111 = new Class3_Sub5(arg0[local89]);
									arg1.method2433(Static160.aClass67Array3, local70, local53, local32 * 8, local111, local76, local22, local64, local28 * 8);
									local36 = true;
									arg1.method2442(local64, Static347.aClass155_9, local32 * 8, local28 * 8, local12[0] == -1 ? local12 : null, local53, local22, local111, local76, local70);
									break;
								}
							}
						}
					}
					if (!local36) {
						arg1.method2429(8, local32 * 8, 8, local28 * 8, local22);
					}
				}
			}
		}
		if (local12[0] == -1) {
			Static29.aClass101_3 = null;
		} else {
			Static29.aClass101_3 = Static66.aClass182_1.method4248(local12[2], local12[1], local12[0], Static253.aClass218_1, local12[3]);
			Static251.anInt4519 = local12[4];
		}
	}
}
