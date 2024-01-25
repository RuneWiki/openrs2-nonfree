import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!ae;")
	public static Class8 aClass8_71;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_178 = new Class179(81, 0);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([II[ILclient!kf;[I)V")
	public static void method3989(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) int local13 = arg3[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg0[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg2.aClass245Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg2.aClass245Array3[local23] = null;
					} else {
						@Pc(37) Class119 local37 = Static334.aClass268_2.method6469(local13);
						@Pc(40) int local40 = local37.anInt3012;
						@Pc(45) Class245 local45 = arg2.aClass245Array3[local23];
						if (local45 != null) {
							if (local45.anInt6821 == local13) {
								if (local40 == 0) {
									local45 = arg2.aClass245Array3[local23] = null;
								} else if (local40 == 1) {
									local45.anInt6824 = 1;
									local45.anInt6818 = 0;
									local45.anInt6825 = 0;
									local45.anInt6823 = local21;
									local45.anInt6819 = 0;
									if (!arg2.aBoolean329) {
										Static658.method8966(arg2, 0, local37);
									}
								} else if (local40 == 2) {
									local45.anInt6825 = 0;
								}
							} else if (local37.anInt3004 >= Static334.aClass268_2.method6469(local45.anInt6821).anInt3004) {
								local45 = arg2.aClass245Array3[local23] = null;
							}
						}
						if (local45 == null) {
							local45 = arg2.aClass245Array3[local23] = new Class245();
							local45.anInt6825 = 0;
							local45.anInt6818 = 0;
							local45.anInt6824 = 1;
							local45.anInt6823 = local21;
							local45.anInt6819 = 0;
							local45.anInt6821 = local13;
							if (!arg2.aBoolean329) {
								Static658.method8966(arg2, 0, local37);
							}
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;ZI)V")
	public static void method3990(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static280.method4105(arg3, true, -1, arg1, arg0, arg2);
	}
}
