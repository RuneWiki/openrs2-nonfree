import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_124 = new Class349(106, 10);

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_35 = new Class63(10, 2, 2, 0);

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
	public static int anInt7311 = 0;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([I[IBLclient!mq;[I)V")
	public static void method5930(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class12_Sub2_Sub1_Sub4_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg2.aClass324Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass324Array3[local19] = null;
					} else {
						@Pc(37) Class148 local37 = Static117.aClass18_1.method296(local9);
						@Pc(40) int local40 = local37.anInt3043;
						@Pc(45) Class324 local45 = arg2.aClass324Array3[local19];
						if (local45 != null) {
							if (local45.anInt8135 == local9) {
								if (local40 == 0) {
									local45 = arg2.aClass324Array3[local19] = null;
								} else if (local40 == 1) {
									local45.anInt8130 = 0;
									local45.anInt8129 = 0;
									local45.anInt8128 = 1;
									local45.anInt8131 = local17;
									local45.anInt8133 = 0;
									if (!arg2.aBoolean709) {
										Static543.method7102(arg2, 0, local37);
									}
								} else if (local40 == 2) {
									local45.anInt8130 = 0;
								}
							} else if (local37.anInt3050 >= Static117.aClass18_1.method296(local45.anInt8135).anInt3050) {
								local45 = arg2.aClass324Array3[local19] = null;
							}
						}
						if (local45 == null) {
							local45 = arg2.aClass324Array3[local19] = new Class324();
							local45.anInt8131 = local17;
							local45.anInt8129 = 0;
							local45.anInt8135 = local9;
							local45.anInt8128 = 1;
							local45.anInt8133 = 0;
							local45.anInt8130 = 0;
							if (!arg2.aBoolean709) {
								Static543.method7102(arg2, 0, local37);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}
}
