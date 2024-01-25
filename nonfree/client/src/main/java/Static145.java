import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public static int anInt3035;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "I")
	public static int anInt3038;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_6 = new Class88(64);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!n;[I[I[II)V")
	public static void method2599(@OriginalArg(0) Class10_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg3[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg0.aClass138Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass138Array3[local23] = null;
					} else {
						@Pc(36) Class177 local36 = Static354.method5863(local13);
						@Pc(39) int local39 = local36.anInt5420;
						@Pc(44) Class138 local44 = arg0.aClass138Array3[local23];
						if (local44 != null) {
							if (local44.anInt3779 == local13) {
								if (local39 == 0) {
									local44 = arg0.aClass138Array3[local23] = null;
								} else if (local39 == 1) {
									local44.anInt3780 = local21;
									local44.anInt3781 = 0;
									local44.anInt3771 = 0;
									local44.anInt3778 = 0;
									local44.anInt3777 = 1;
									Static351.method3417(arg0.anInt6726, arg0 == Static127.aClass10_Sub1_Sub2_Sub2_1, arg0.anInt6728, 0, local36);
								} else if (local39 == 2) {
									local44.anInt3781 = 0;
								}
							} else if (local36.anInt5417 >= Static354.method5863(local44.anInt3779).anInt5417) {
								local44 = arg0.aClass138Array3[local23] = null;
							}
						}
						if (local44 == null) {
							local44 = arg0.aClass138Array3[local23] = new Class138();
							local44.anInt3780 = local21;
							local44.anInt3771 = 0;
							local44.anInt3778 = 0;
							local44.anInt3779 = local13;
							local44.anInt3777 = 1;
							local44.anInt3781 = 0;
							Static351.method3417(arg0.anInt6726, arg0 == Static127.aClass10_Sub1_Sub2_Sub2_1, arg0.anInt6728, 0, local36);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
