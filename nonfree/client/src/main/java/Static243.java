import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[I")
	public static final int[] anIntArray271 = new int[5];

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	public static int anInt3928 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([ILclient!kc;[II[I)V")
	public static void method3361(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class13_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(18) int local18 = arg2[local7];
			@Pc(22) int local22 = arg0[local7];
			@Pc(26) int local26 = arg3[local7];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && local28 < arg1.aClass250Array3.length) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg1.aClass250Array3[local28] = null;
					} else {
						@Pc(52) Class81 local52 = Static540.aClass173_2.method3791(local18);
						@Pc(55) int local55 = local52.anInt2141;
						@Pc(60) Class250 local60 = arg1.aClass250Array3[local28];
						if (local60 != null) {
							if (local60.anInt6333 == local18) {
								if (local55 == 0) {
									local60 = arg1.aClass250Array3[local28] = null;
								} else if (local55 == 1) {
									local60.anInt6332 = local26;
									local60.anInt6330 = 0;
									local60.anInt6331 = 0;
									local60.anInt6329 = 0;
									local60.anInt6334 = 1;
									if (!arg1.aBoolean317) {
										Static589.method8022(0, local52, arg1);
									}
								} else if (local55 == 2) {
									local60.anInt6329 = 0;
								}
							} else if (local52.anInt2151 >= Static540.aClass173_2.method3791(local60.anInt6333).anInt2151) {
								local60 = arg1.aClass250Array3[local28] = null;
							}
						}
						if (local60 == null) {
							local60 = arg1.aClass250Array3[local28] = new Class250();
							local60.anInt6331 = 0;
							local60.anInt6330 = 0;
							local60.anInt6329 = 0;
							local60.anInt6333 = local18;
							local60.anInt6332 = local26;
							local60.anInt6334 = 1;
							if (!arg1.aBoolean317) {
								Static589.method8022(0, local52, arg1);
							}
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(BLclient!vj;)Lclient!ida;")
	public static Class148 method3362(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(7) int local7 = arg0.method8547();
		@Pc(14) Class361 local14 = Static108.method1608()[arg0.method8547()];
		@Pc(21) Class306 local21 = Static366.method4960()[arg0.method8547()];
		@Pc(25) int local25 = arg0.method8526();
		@Pc(29) int local29 = arg0.method8526();
		@Pc(33) int local33 = arg0.method8546();
		@Pc(39) int local39 = arg0.method8546();
		@Pc(43) int local43 = arg0.method8542();
		@Pc(52) int local52 = arg0.method8542();
		@Pc(56) int local56 = arg0.method8542();
		@Pc(67) boolean local67 = arg0.method8547() == 1;
		return new Class148(local7, local14, local21, local25, local29, local33, local39, local43, local52, local56, local67);
	}
}
