import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "Lclient!db;")
	public static final Class64 aClass64_157 = new Class64(82, 3);

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_48 = new Class61(47, 7);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([IILclient!hfa;[I[I)V")
	public static void method3549(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class10_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg3[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg1.aClass261Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg1.aClass261Array3[local23] = null;
					} else {
						@Pc(40) Class77 local40 = Static168.aClass327_2.method7326(local13);
						@Pc(43) int local43 = local40.anInt2586;
						@Pc(48) Class261 local48 = arg1.aClass261Array3[local23];
						if (local48 != null) {
							if (local13 == local48.anInt6949) {
								if (local43 == 0) {
									local48 = arg1.aClass261Array3[local23] = null;
								} else if (local43 == 1) {
									local48.anInt6950 = 0;
									local48.anInt6947 = 0;
									local48.anInt6948 = 1;
									local48.anInt6945 = 0;
									local48.anInt6946 = local21;
									Static240.method4084(arg1.aByte101, arg1.anInt8934, arg1.anInt8929, 0, local40, false);
								} else if (local43 == 2) {
									local48.anInt6945 = 0;
								}
							} else if (local40.anInt2582 >= Static168.aClass327_2.method7326(local48.anInt6949).anInt2582) {
								local48 = arg1.aClass261Array3[local23] = null;
							}
						}
						if (local48 == null) {
							local48 = arg1.aClass261Array3[local23] = new Class261();
							local48.anInt6949 = local13;
							local48.anInt6946 = local21;
							local48.anInt6948 = 1;
							local48.anInt6945 = 0;
							local48.anInt6947 = 0;
							local48.anInt6950 = 0;
							Static240.method4084(arg1.aByte101, arg1.anInt8934, arg1.anInt8929, 0, local40, false);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
