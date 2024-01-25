import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "I")
	public static int anInt3735;

	@OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
	public static int anInt3738;

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "[Lclient!ga;")
	public static final Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array2 = new Class3_Sub4_Sub12[14];

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)[Lclient!mv;")
	public static Class219[] method3278() {
		return new Class219[] { Static139.aClass219_7, Static193.aClass219_3, Static459.aClass219_17, Static106.aClass219_4, Static152.aClass219_10, Static274.aClass219_14, Static527.aClass219_16, Static262.aClass219_13, Static88.aClass219_1, Static213.aClass219_11, Static139.aClass219_6, Static117.aClass219_5, Static337.aClass219_15, Static219.aClass219_12 };
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[ILclient!dg;B[I)V")
	public static void method3280(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2_Sub2_Sub1_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(9) int local9 = 0; local9 < arg3.length; local9++) {
			@Pc(14) int local14 = arg3[local9];
			@Pc(18) int local18 = arg1[local9];
			@Pc(22) int local22 = arg0[local9];
			for (@Pc(24) int local24 = 0; local18 != 0 && local24 < arg2.aClass216Array3.length; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg2.aClass216Array3[local24] = null;
					} else {
						@Pc(46) Class174 local46 = Static532.aClass157_2.method3734(local14);
						@Pc(49) int local49 = local46.anInt5488;
						@Pc(54) Class216 local54 = arg2.aClass216Array3[local24];
						if (local54 != null) {
							if (local54.anInt6912 == local14) {
								if (local49 == 0) {
									local54 = arg2.aClass216Array3[local24] = null;
								} else if (local49 == 1) {
									local54.anInt6911 = local22;
									local54.anInt6913 = 0;
									local54.anInt6908 = 0;
									local54.anInt6904 = 1;
									local54.anInt6906 = 0;
									Static28.method957(local46, arg2.aByte103, arg2.anInt9396, arg2.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == arg2, 0);
								} else if (local49 == 2) {
									local54.anInt6908 = 0;
								}
							} else if (local46.anInt5497 >= Static532.aClass157_2.method3734(local54.anInt6912).anInt5497) {
								local54 = arg2.aClass216Array3[local24] = null;
							}
						}
						if (local54 == null) {
							local54 = arg2.aClass216Array3[local24] = new Class216();
							local54.anInt6912 = local14;
							local54.anInt6911 = local22;
							local54.anInt6906 = 0;
							local54.anInt6904 = 1;
							local54.anInt6913 = 0;
							local54.anInt6908 = 0;
							Static28.method957(local46, arg2.aByte103, arg2.anInt9396, arg2.anInt9398, Static443.aClass2_Sub2_Sub1_Sub1_2 == arg2, 0);
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}
}
