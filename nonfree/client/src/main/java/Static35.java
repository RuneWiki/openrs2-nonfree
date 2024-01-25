import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "Lclient!kl;")
	public static Class137 aClass137_11;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_208 = new Class107(38, 11);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIZII)V")
	public static void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static125.method2231(arg2)) {
			if (Static451.aClass251ArrayArray3[arg2] == null) {
				Static132.method2290(-1, arg4, arg6, Static437.aClass251ArrayArray2[arg2], arg1, arg7, arg0, arg3, arg5);
			} else {
				Static132.method2290(-1, arg4, arg6, Static451.aClass251ArrayArray3[arg2], arg1, arg7, arg0, arg3, arg5);
			}
		} else if (arg3 == -1) {
			for (@Pc(18) int local18 = 0; local18 < 100; local18++) {
				Static71.aBooleanArray25[local18] = true;
			}
		} else {
			Static71.aBooleanArray25[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method5796(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static437.method3294(0, arg0.length - 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)I")
	public static int method5797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg2 & arg1 - 1;
		@Pc(28) int local28 = Static444.method5852(local7, local17);
		@Pc(35) int local35 = Static444.method5852(local7 + 1, local17);
		@Pc(42) int local42 = Static444.method5852(local7, local17 + 1);
		@Pc(56) int local56 = Static444.method5852(local7 + 1, local17 - -1);
		@Pc(63) int local63 = Static353.method5923(local35, local28, local13, arg1);
		@Pc(70) int local70 = Static353.method5923(local56, local42, local13, arg1);
		return Static353.method5923(local70, local63, local23, arg1);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public static void method5798() {
		if (Static282.anInt4930 != 3) {
			Static451.aClass209_5 = Static181.aClass209_2;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[I[I[ILclient!cl;)V")
	public static void method5802(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class31_Sub2_Sub1_Sub1 arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(18) int local18 = arg1[local7];
			@Pc(22) int local22 = arg2[local7];
			@Pc(26) int local26 = arg0[local7];
			for (@Pc(28) int local28 = 0; local22 != 0 && local28 < arg3.aClass225Array3.length; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass225Array3[local28] = null;
					} else {
						@Pc(42) Class223 local42 = Static293.aClass127_1.method2975(local18);
						@Pc(45) int local45 = local42.anInt6050;
						@Pc(50) Class225 local50 = arg3.aClass225Array3[local28];
						if (local50 != null) {
							if (local18 == local50.anInt6081) {
								if (local45 == 0) {
									local50 = arg3.aClass225Array3[local28] = null;
								} else if (local45 == 1) {
									local50.anInt6087 = 0;
									local50.anInt6083 = 0;
									local50.anInt6085 = local26;
									local50.anInt6082 = 1;
									local50.anInt6088 = 0;
									Static172.method2762(local42, arg3.anInt7300, arg3 == Static452.aClass31_Sub2_Sub1_Sub1_2, 0, arg3.aByte100, arg3.anInt7298);
								} else if (local45 == 2) {
									local50.anInt6083 = 0;
								}
							} else if (local42.anInt6039 >= Static293.aClass127_1.method2975(local50.anInt6081).anInt6039) {
								local50 = arg3.aClass225Array3[local28] = null;
							}
						}
						if (local50 == null) {
							local50 = arg3.aClass225Array3[local28] = new Class225();
							local50.anInt6085 = local26;
							local50.anInt6083 = 0;
							local50.anInt6081 = local18;
							local50.anInt6087 = 0;
							local50.anInt6088 = 0;
							local50.anInt6082 = 1;
							Static172.method2762(local42, arg3.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == arg3, 0, arg3.aByte100, arg3.anInt7298);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}
}
