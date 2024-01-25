import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!vq", name = "N", descriptor = "F")
	public static float aFloat228;

	@OriginalMember(owner = "client!vq", name = "D", descriptor = "I")
	public static int anInt9830 = 0;

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_316 = new Class123(116, 0);

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLclient!rfa;[[B)V")
	public static void method7726(@OriginalArg(1) Class268_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt7987; local19++) {
			Static245.method3870();
			for (@Pc(25) int local25 = 0; local25 < Static345.anInt6228 >> 3; local25++) {
				for (@Pc(29) int local29 = 0; local29 < Static535.anInt9341 >> 3; local29++) {
					@Pc(39) int local39 = Static110.anIntArrayArrayArray1[local19][local25][local29];
					if (local39 != -1) {
						@Pc(49) int local49 = local39 >> 24 & 0x3;
						if (!arg0.aBoolean552 || local49 == 0) {
							@Pc(60) int local60 = local39 >> 1 & 0x3;
							@Pc(66) int local66 = local39 >> 14 & 0x3FF;
							@Pc(72) int local72 = local39 >> 3 & 0x7FF;
							@Pc(82) int local82 = local72 / 8 + (local66 / 8 << 8);
							for (@Pc(84) int local84 = 0; local84 < Static178.anIntArray159.length; local84++) {
								if (local82 == Static178.anIntArray159[local84] && arg1[local84] != null) {
									@Pc(106) Class3_Sub26 local106 = new Class3_Sub26(arg1[local84]);
									arg0.method6290(local29 * 8, Static187.aClass220Array1, local106, local25 * 8, local19, local72, local49, local60, local66);
									arg0.method6309(local25 * 8, local12[0] == -1 ? local12 : null, local60, local29 * 8, local49, Static319.aClass31_11, local106, local19, local72, local66);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static177.aClass256_1 = Static345.aClass103_1.method2773(local12[2], local12[3], Static240.aClass13_1, local12[0], local12[1]);
			Static111.anInt2678 = local12[4];
		}
	}
}
