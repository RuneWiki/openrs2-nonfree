import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([[BILclient!eda;)V")
	public static void method397(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class85_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt2678; local14++) {
			Static464.method6712();
			for (@Pc(20) int local20 = 0; local20 < Static38.anInt740 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static38.anInt741 >> 3; local24++) {
					@Pc(34) int local34 = Static536.anIntArrayArrayArray22[local14][local20][local24];
					if (local34 != -1) {
						@Pc(43) int local43 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean215 || local43 == 0) {
							@Pc(54) int local54 = local34 >> 1 & 0x3;
							@Pc(60) int local60 = local34 >> 14 & 0x3FF;
							@Pc(66) int local66 = local34 >> 3 & 0x7FF;
							@Pc(76) int local76 = local66 / 8 + (local60 / 8 << 8);
							for (@Pc(78) int local78 = 0; local78 < Static380.anIntArray543.length; local78++) {
								if (Static380.anIntArray543[local78] == local76 && arg0[local78] != null) {
									@Pc(100) Class4_Sub9 local100 = new Class4_Sub9(arg0[local78]);
									arg1.method2374(local100, local43, local54, Static15.aClass84Array1, local60, local20 * 8, local24 * 8, local14, local66);
									arg1.method2396(local14, Static185.aClass66_14, local60, local24 * 8, local66, local54, local100, local12[0] == -1 ? local12 : null, local20 * 8, local43);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static122.aClass255_3 = Static5.aClass60_1.method1362(local12[1], local12[0], local12[3], Static276.aClass110_1, local12[2]);
			Static529.anInt8997 = local12[4];
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIFZIII)[[I")
	public static int[][] method398(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class4_Sub4_Sub28 local13 = new Class4_Sub4_Sub28();
		local13.aBoolean530 = false;
		local13.anInt7439 = 4;
		local13.anInt7448 = 8;
		local13.anInt7445 = (int) ((float) 4096 * arg0);
		local13.anInt7442 = 3;
		local13.method7894();
		Static162.method3175(64, 256);
		for (@Pc(41) int local41 = 0; local41 < 256; local41++) {
			local13.method6163(local9[local41], local41);
		}
		return local9;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)Z")
	public static boolean method399() {
		return Static157.method5013("jaclib") ? Static157.method5013("hw3d") : false;
	}
}
