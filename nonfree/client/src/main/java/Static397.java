import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	public static int anInt5797;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_99 = new Class216(10, 7);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!iaa;[I[II[I)V")
	public static void method5090(@OriginalArg(0) Class3_Sub1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg2[local3];
			@Pc(17) int local17 = arg1[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg0.aClass143Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass143Array3[local19] = null;
					} else {
						@Pc(37) Class124 local37 = Static99.aClass2_1.method22(local9);
						@Pc(40) int local40 = local37.anInt3024;
						@Pc(45) Class143 local45 = arg0.aClass143Array3[local19];
						if (local45 != null) {
							if (local45.anInt3386 == local9) {
								if (local40 == 0) {
									local45 = arg0.aClass143Array3[local19] = null;
								} else if (local40 == 1) {
									local45.anInt3383 = local17;
									local45.anInt3385 = 0;
									local45.anInt3384 = 0;
									local45.anInt3388 = 0;
									local45.anInt3382 = 1;
									if (!arg0.aBoolean773) {
										Static633.method8389(0, arg0, local37);
									}
								} else if (local40 == 2) {
									local45.anInt3384 = 0;
								}
							} else if (local37.anInt3029 >= Static99.aClass2_1.method22(local45.anInt3386).anInt3029) {
								local45 = arg0.aClass143Array3[local19] = null;
							}
						}
						if (local45 == null) {
							local45 = arg0.aClass143Array3[local19] = new Class143();
							local45.anInt3382 = 1;
							local45.anInt3388 = 0;
							local45.anInt3383 = local17;
							local45.anInt3385 = 0;
							local45.anInt3386 = local9;
							local45.anInt3384 = 0;
							if (!arg0.aBoolean773) {
								Static633.method8389(0, arg0, local37);
							}
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method5091(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static306.anInt4811 = 1;
		Static141.anInt2583 = -1;
		Static395.method2777(arg1, false, false, arg0);
	}
}
