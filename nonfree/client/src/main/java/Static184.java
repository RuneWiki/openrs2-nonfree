import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[IB[ILclient!kfa;)V")
	public static void method6376(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub4_Sub2_Sub1_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg0[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && arg3.aClass129Array3.length > local23) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg3.aClass129Array3[local23] = null;
					} else {
						@Pc(47) Class365 local47 = Static61.aClass48_1.method1016(local13);
						@Pc(50) int local50 = local47.anInt10221;
						@Pc(55) Class129 local55 = arg3.aClass129Array3[local23];
						if (local55 != null) {
							if (local13 == local55.anInt3570) {
								if (local50 == 0) {
									local55 = arg3.aClass129Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt3572 = 0;
									local55.anInt3566 = 0;
									local55.anInt3571 = 1;
									local55.anInt3569 = local21;
									local55.anInt3565 = 0;
									if (!arg3.aBoolean590) {
										Static301.method5179(local47, arg3, 0);
									}
								} else if (local50 == 2) {
									local55.anInt3565 = 0;
								}
							} else if (local47.anInt10218 >= Static61.aClass48_1.method1016(local55.anInt3570).anInt10218) {
								local55 = arg3.aClass129Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg3.aClass129Array3[local23] = new Class129();
							local55.anInt3571 = 1;
							local55.anInt3570 = local13;
							local55.anInt3569 = local21;
							local55.anInt3572 = 0;
							local55.anInt3566 = 0;
							local55.anInt3565 = 0;
							if (!arg3.aBoolean590) {
								Static301.method5179(local47, arg3, 0);
							}
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}
}
