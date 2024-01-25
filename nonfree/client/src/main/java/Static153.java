import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
	public static int anInt3365;

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
	public static int anInt3367;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "Lclient!bi;")
	public static Class31 aClass31_33;

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[I[ILclient!st;[I)V")
	public static void method3080(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class10_Sub1_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg0[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass261Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass261Array3[local19] = null;
					} else {
						@Pc(41) Class77 local41 = Static168.aClass327_2.method7326(local9);
						@Pc(44) int local44 = local41.anInt2586;
						@Pc(49) Class261 local49 = arg2.aClass261Array3[local19];
						if (local49 != null) {
							if (local49.anInt6949 == local9) {
								if (local44 == 0) {
									local49 = arg2.aClass261Array3[local19] = null;
								} else if (local44 == 1) {
									local49.anInt6947 = 0;
									local49.anInt6948 = 1;
									local49.anInt6946 = local17;
									local49.anInt6950 = 0;
									local49.anInt6945 = 0;
									Static240.method4084(arg2.aByte101, arg2.anInt8934, arg2.anInt8929, 0, local41, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg2);
								} else if (local44 == 2) {
									local49.anInt6945 = 0;
								}
							} else if (local41.anInt2582 >= Static168.aClass327_2.method7326(local49.anInt6949).anInt2582) {
								local49 = arg2.aClass261Array3[local19] = null;
							}
						}
						if (local49 == null) {
							local49 = arg2.aClass261Array3[local19] = new Class261();
							local49.anInt6947 = 0;
							local49.anInt6946 = local17;
							local49.anInt6950 = 0;
							local49.anInt6948 = 1;
							local49.anInt6949 = local9;
							local49.anInt6945 = 0;
							Static240.method4084(arg2.aByte101, arg2.anInt8934, arg2.anInt8929, 0, local41, Static129.aClass10_Sub1_Sub2_Sub2_1 == arg2);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method3082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class4_Sub9 local12 = new Class4_Sub9(arg4);
		@Pc(14) int local14 = -1;
		label54: while (true) {
			@Pc(18) int local18 = local12.method5976();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(26) int local26 = 0;
			@Pc(28) boolean local28 = false;
			while (true) {
				@Pc(34) int local34;
				while (!local28) {
					local34 = local12.method5978();
					if (local34 == 0) {
						continue label54;
					}
					local26 += local34 - 1;
					@Pc(65) int local65 = local26 & 0x3F;
					@Pc(71) int local71 = local26 >> 6 & 0x3F;
					@Pc(77) int local77 = local12.method6015() >> 2;
					@Pc(82) int local82 = local71 + arg1;
					@Pc(86) int local86 = local65 + arg3;
					if (local82 > 0 && local86 > 0 && local82 < arg0 - 1 && local86 < arg2 - 1) {
						@Pc(116) Class25 local116 = Static553.aClass288_4.method6419(local14);
						if (local77 != 22 || Static189.aClass4_Sub2_Sub1_1.aBoolean656 || local116.anInt599 != 0 || local116.anInt607 == 1 || local116.aBoolean61) {
							local28 = true;
							if (!local116.method573()) {
								Static407.anInt7051++;
								local7 = false;
							}
						}
					}
				}
				local34 = local12.method5978();
				if (local34 == 0) {
					break;
				}
				local12.method6015();
			}
		}
	}
}
