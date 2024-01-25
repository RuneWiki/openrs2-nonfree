import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(Lclient!ft;[I[I[II)V")
	public static void method8506(@OriginalArg(0) Class28_Sub1_Sub4_Sub2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg1[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg0.aClass321Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass321Array3[local19] = null;
					} else {
						@Pc(33) Class175 local33 = Static591.aClass66_2.method1768(local9);
						@Pc(36) int local36 = local33.anInt5022;
						@Pc(41) Class321 local41 = arg0.aClass321Array3[local19];
						if (local41 != null) {
							if (local41.anInt8974 == local9) {
								if (local36 == 0) {
									local41 = arg0.aClass321Array3[local19] = null;
								} else if (local36 == 1) {
									local41.anInt8970 = local17;
									local41.anInt8972 = 0;
									local41.anInt8975 = 0;
									local41.anInt8976 = 0;
									local41.anInt8971 = 1;
									if (!arg0.aBoolean468) {
										Static146.method2653(0, local33, arg0);
									}
								} else if (local36 == 2) {
									local41.anInt8972 = 0;
								}
							} else if (local33.anInt5018 >= Static591.aClass66_2.method1768(local41.anInt8974).anInt5018) {
								local41 = arg0.aClass321Array3[local19] = null;
							}
						}
						if (local41 == null) {
							local41 = arg0.aClass321Array3[local19] = new Class321();
							local41.anInt8976 = 0;
							local41.anInt8972 = 0;
							local41.anInt8975 = 0;
							local41.anInt8974 = local9;
							local41.anInt8971 = 1;
							local41.anInt8970 = local17;
							if (!arg0.aBoolean468) {
								Static146.method2653(0, local33, arg0);
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
