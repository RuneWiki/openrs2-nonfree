import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public static final int anInt2592 = 50;

	@OriginalMember(owner = "client!ib", name = "P", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray8 = new int[2][][];

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!rg;)V")
	public static void method2517(@OriginalArg(1) Class177 arg0) {
		if (arg0.anInt5248 == Static32.anInt790) {
			Static313.aBooleanArray30[arg0.anInt5242] = true;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)Lclient!lo;")
	public static Class121 method2520(@OriginalArg(1) int arg0) {
		@Pc(12) Class140 local12 = Static50.aClass140_29;
		@Pc(21) Class121 local21;
		synchronized (Static50.aClass140_29) {
			local21 = (Class121) Static50.aClass140_29.method3816((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(41) byte[] local41 = Static31.aClass165_11.method4508(Static72.method1424(arg0), Static205.method3806(arg0));
		local21 = new Class121();
		local21.anInt3771 = arg0;
		if (local41 != null) {
			local21.method3557(new Class1_Sub7(local41));
		}
		local21.method3555();
		@Pc(62) Class140 local62 = Static50.aClass140_29;
		synchronized (Static50.aClass140_29) {
			Static50.aClass140_29.method3817((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)V")
	public static void method2522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static156.method2956(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(58) int local58;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(82) int local82;
		if (Static49.anInt1124 <= arg0 && arg0 <= Static291.anInt5657) {
			@Pc(50) int[] local50 = Static327.anIntArrayArray63[arg0];
			local58 = Static216.method3969(Static251.anInt6512, arg5 - arg1, Static106.anInt2157);
			local66 = Static216.method3969(Static251.anInt6512, arg1 + arg5, Static106.anInt2157);
			local74 = Static216.method3969(Static251.anInt6512, arg5 - local15, Static106.anInt2157);
			local82 = Static216.method3969(Static251.anInt6512, local15 + arg5, Static106.anInt2157);
			Static97.method1784(local58, local50, arg4, local74);
			Static97.method1784(local74, local50, arg2, local82);
			Static97.method1784(local82, local50, arg4, local66);
		}
		while (local24 > local10) {
			local34 += 2;
			local36 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				local32 -= local29 << 1;
				Static157.anIntArray359[local29] = local10;
			}
			local10++;
			@Pc(255) int local255;
			@Pc(263) int local263;
			@Pc(270) int[] local270;
			@Pc(153) int local153;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local153 = arg0 - local24;
				local58 = local24 + arg0;
				if (local58 >= Static49.anInt1124 && local153 <= Static291.anInt5657) {
					if (local15 <= local24) {
						local66 = Static216.method3969(Static251.anInt6512, local10 + arg5, Static106.anInt2157);
						local74 = Static216.method3969(Static251.anInt6512, arg5 - local10, Static106.anInt2157);
						if (local58 <= Static291.anInt5657) {
							Static97.method1784(local74, Static327.anIntArrayArray63[local58], arg4, local66);
						}
						if (local153 >= Static49.anInt1124) {
							Static97.method1784(local74, Static327.anIntArrayArray63[local153], arg4, local66);
						}
					} else {
						local66 = Static157.anIntArray359[local24];
						local74 = Static216.method3969(Static251.anInt6512, arg5 + local10, Static106.anInt2157);
						local82 = Static216.method3969(Static251.anInt6512, arg5 - local10, Static106.anInt2157);
						local255 = Static216.method3969(Static251.anInt6512, arg5 + local66, Static106.anInt2157);
						local263 = Static216.method3969(Static251.anInt6512, arg5 - local66, Static106.anInt2157);
						if (local58 <= Static291.anInt5657) {
							local270 = Static327.anIntArrayArray63[local58];
							Static97.method1784(local82, local270, arg4, local263);
							Static97.method1784(local263, local270, arg2, local255);
							Static97.method1784(local255, local270, arg4, local74);
						}
						if (Static49.anInt1124 <= local153) {
							local270 = Static327.anIntArrayArray63[local153];
							Static97.method1784(local82, local270, arg4, local263);
							Static97.method1784(local263, local270, arg2, local255);
							Static97.method1784(local255, local270, arg4, local74);
						}
					}
				}
			}
			local153 = arg0 - local10;
			local58 = local10 + arg0;
			if (Static49.anInt1124 <= local58 && local153 <= Static291.anInt5657) {
				local66 = arg5 + local24;
				local74 = arg5 - local24;
				if (Static106.anInt2157 <= local66 && Static251.anInt6512 >= local74) {
					local66 = Static216.method3969(Static251.anInt6512, local66, Static106.anInt2157);
					local74 = Static216.method3969(Static251.anInt6512, local74, Static106.anInt2157);
					if (local15 <= local10) {
						if (Static291.anInt5657 >= local58) {
							Static97.method1784(local74, Static327.anIntArrayArray63[local58], arg4, local66);
						}
						if (local153 >= Static49.anInt1124) {
							Static97.method1784(local74, Static327.anIntArrayArray63[local153], arg4, local66);
						}
					} else {
						local82 = local29 < local10 ? Static157.anIntArray359[local10] : local29;
						local255 = Static216.method3969(Static251.anInt6512, local82 + arg5, Static106.anInt2157);
						local263 = Static216.method3969(Static251.anInt6512, arg5 - local82, Static106.anInt2157);
						if (Static291.anInt5657 >= local58) {
							local270 = Static327.anIntArrayArray63[local58];
							Static97.method1784(local74, local270, arg4, local263);
							Static97.method1784(local263, local270, arg2, local255);
							Static97.method1784(local255, local270, arg4, local66);
						}
						if (local153 >= Static49.anInt1124) {
							local270 = Static327.anIntArrayArray63[local153];
							Static97.method1784(local74, local270, arg4, local263);
							Static97.method1784(local263, local270, arg2, local255);
							Static97.method1784(local255, local270, arg4, local66);
						}
					}
				}
			}
		}
	}
}
