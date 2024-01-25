import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!uga", name = "r", descriptor = "Lclient!ie;")
	public static Class157 aClass157_2;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I[I[I[ILclient!pca;)V")
	public static void method7859(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class2_Sub2_Sub1_Sub2 arg3) {
		for (@Pc(6) int local6 = 0; local6 < arg2.length; local6++) {
			@Pc(11) int local11 = arg2[local6];
			@Pc(15) int local15 = arg0[local6];
			@Pc(19) int local19 = arg1[local6];
			@Pc(21) int local21 = 0;
			while (local15 != 0 && local21 < arg3.aClass216Array3.length) {
				if ((local15 & 0x1) != 0) {
					if (local11 == -1) {
						arg3.aClass216Array3[local21] = null;
					} else {
						@Pc(40) Class174 local40 = aClass157_2.method3734(local11);
						@Pc(43) int local43 = local40.anInt5488;
						@Pc(48) Class216 local48 = arg3.aClass216Array3[local21];
						if (local48 != null) {
							if (local48.anInt6912 == local11) {
								if (local43 == 0) {
									local48 = arg3.aClass216Array3[local21] = null;
								} else if (local43 == 1) {
									local48.anInt6906 = 0;
									local48.anInt6913 = 0;
									local48.anInt6904 = 1;
									local48.anInt6911 = local19;
									local48.anInt6908 = 0;
									Static28.method957(local40, arg3.aByte103, arg3.anInt9396, arg3.anInt9398, false, 0);
								} else if (local43 == 2) {
									local48.anInt6908 = 0;
								}
							} else if (local40.anInt5497 >= aClass157_2.method3734(local48.anInt6912).anInt5497) {
								local48 = arg3.aClass216Array3[local21] = null;
							}
						}
						if (local48 == null) {
							local48 = arg3.aClass216Array3[local21] = new Class216();
							local48.anInt6913 = 0;
							local48.anInt6906 = 0;
							local48.anInt6912 = local11;
							local48.anInt6911 = local19;
							local48.anInt6908 = 0;
							local48.anInt6904 = 1;
							Static28.method957(local40, arg3.aByte103, arg3.anInt9396, arg3.anInt9398, false, 0);
						}
					}
				}
				local21++;
				local15 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "(IIII)V")
	public static void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class2_Sub3 local13 = local7.aClass2_Sub3_2;
		@Pc(16) Class2_Sub3 local16 = local7.aClass2_Sub3_1;
		if (local13 != null) {
			local13.anInt9489 = local13.anInt9489 * arg3 / (0x10 << Static309.anInt6172 - 7);
			local13.anInt9497 = local13.anInt9497 * arg3 / (0x10 << Static309.anInt6172 - 7);
		}
		if (local16 != null) {
			local16.anInt9489 = local16.anInt9489 * arg3 / (0x10 << Static309.anInt6172 - 7);
			local16.anInt9497 = local16.anInt9497 * arg3 / (0x10 << Static309.anInt6172 - 7);
		}
	}
}
