import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "([I[IB[ILclient!u;)V")
	public static void method6249(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class12_Sub2_Sub1_Sub4_Sub2 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg2[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && arg3.aClass324Array3.length > local19; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg3.aClass324Array3[local19] = null;
					} else {
						@Pc(35) Class148 local35 = Static117.aClass18_1.method296(local9);
						@Pc(38) int local38 = local35.anInt3043;
						@Pc(43) Class324 local43 = arg3.aClass324Array3[local19];
						if (local43 != null) {
							if (local43.anInt8135 == local9) {
								if (local38 == 0) {
									local43 = arg3.aClass324Array3[local19] = null;
								} else if (local38 == 1) {
									local43.anInt8130 = 0;
									local43.anInt8133 = 0;
									local43.anInt8129 = 0;
									local43.anInt8128 = 1;
									local43.anInt8131 = local17;
									if (!arg3.aBoolean709) {
										Static543.method7102(arg3, 0, local35);
									}
								} else if (local38 == 2) {
									local43.anInt8130 = 0;
								}
							} else if (local35.anInt3050 >= Static117.aClass18_1.method296(local43.anInt8135).anInt3050) {
								local43 = arg3.aClass324Array3[local19] = null;
							}
						}
						if (local43 == null) {
							local43 = arg3.aClass324Array3[local19] = new Class324();
							local43.anInt8133 = 0;
							local43.anInt8128 = 1;
							local43.anInt8129 = 0;
							local43.anInt8130 = 0;
							local43.anInt8131 = local17;
							local43.anInt8135 = local9;
							if (!arg3.aBoolean709) {
								Static543.method7102(arg3, 0, local35);
							}
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(III)Z")
	public static boolean method6250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
