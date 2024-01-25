import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_63 = new Class5(64);

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
	public static int anInt7446 = 0;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "[I")
	public static int[] anIntArray563 = new int[2];

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
	public static int anInt7447 = -1;

	@OriginalMember(owner = "client!rm", name = "B", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_242 = new Class175("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!rm", name = "C", descriptor = "[S")
	public static final short[] aShortArray106 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_248 = new Class92(4, 3);

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
	public static int anInt7448 = 1;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Z")
	public static boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BI)V")
	public static void method5827(@OriginalArg(1) int arg0) {
		if (!Static294.method4291(arg0)) {
			return;
		}
		@Pc(12) Class68[] local12 = Static300.aClass68ArrayArray3[arg0];
		for (@Pc(18) int local18 = 0; local18 < local12.length; local18++) {
			@Pc(23) Class68 local23 = local12[local18];
			if (local23 != null) {
				local23.anInt2216 = 1;
				local23.anInt2152 = 0;
				local23.anInt2139 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(B)V")
	public static void method5828() {
		Static110.aClass3_Sub2_Sub2_1.method6056();
		@Pc(11) int local11 = Static110.aClass3_Sub2_Sub2_1.method6057(8);
		@Pc(16) int local16;
		if (Static453.anInt7682 > local11) {
			for (local16 = local11; local16 < Static453.anInt7682; local16++) {
				Static195.anIntArray297[Static378.anInt6656++] = Static29.anIntArray56[local16];
			}
		}
		if (Static453.anInt7682 < local11) {
			throw new RuntimeException("gnpov1");
		}
		Static453.anInt7682 = 0;
		for (local16 = 0; local16 < local11; local16++) {
			@Pc(48) int local48 = Static29.anIntArray56[local16];
			@Pc(52) Class1_Sub3_Sub3_Sub2 local52 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local48];
			@Pc(57) int local57 = Static110.aClass3_Sub2_Sub2_1.method6057(1);
			if (local57 == 0) {
				Static29.anIntArray56[Static453.anInt7682++] = local48;
				local52.anInt6126 = Static290.anInt5325;
			} else {
				@Pc(79) int local79 = Static110.aClass3_Sub2_Sub2_1.method6057(2);
				if (local79 == 0) {
					Static29.anIntArray56[Static453.anInt7682++] = local48;
					local52.anInt6126 = Static290.anInt5325;
					Static168.anIntArray263[Static229.anInt4389++] = local48;
				} else {
					@Pc(123) int local123;
					@Pc(133) int local133;
					if (local79 == 1) {
						Static29.anIntArray56[Static453.anInt7682++] = local48;
						local52.anInt6126 = Static290.anInt5325;
						local123 = Static110.aClass3_Sub2_Sub2_1.method6057(3);
						local52.method4852(local123, 1);
						local133 = Static110.aClass3_Sub2_Sub2_1.method6057(1);
						if (local133 == 1) {
							Static168.anIntArray263[Static229.anInt4389++] = local48;
						}
					} else if (local79 == 2) {
						Static29.anIntArray56[Static453.anInt7682++] = local48;
						local52.anInt6126 = Static290.anInt5325;
						if (Static110.aClass3_Sub2_Sub2_1.method6057(1) == 1) {
							local123 = Static110.aClass3_Sub2_Sub2_1.method6057(3);
							local52.method4852(local123, 2);
							local133 = Static110.aClass3_Sub2_Sub2_1.method6057(3);
							local52.method4852(local133, 2);
						} else {
							local123 = Static110.aClass3_Sub2_Sub2_1.method6057(3);
							local52.method4852(local123, 0);
						}
						local123 = Static110.aClass3_Sub2_Sub2_1.method6057(1);
						if (local123 == 1) {
							Static168.anIntArray263[Static229.anInt4389++] = local48;
						}
					} else if (local79 == 3) {
						Static195.anIntArray297[Static378.anInt6656++] = local48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIII)V")
	public static void method5832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = arg1 + 1;
		Static15.method463(arg2, Static376.anIntArrayArray64[arg1], arg4, arg0);
		@Pc(22) int local22 = arg3 - 1;
		Static15.method463(arg2, Static376.anIntArrayArray64[arg3], arg4, arg0);
		for (@Pc(29) int local29 = local13; local29 <= local22; local29++) {
			@Pc(35) int[] local35 = Static376.anIntArrayArray64[local29];
			local35[arg4] = local35[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[Ljava/lang/Object;I[II)V")
	public static void method5833(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(16) int local16 = (arg3 + arg1) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) int local22 = arg2[local16];
		arg2[local16] = arg2[arg1];
		arg2[arg1] = local22;
		@Pc(36) Object local36 = arg0[local16];
		arg0[local16] = arg0[arg1];
		arg0[arg1] = local36;
		@Pc(55) int local55 = ~local22 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg3; local57 < arg1; local57++) {
			if (arg2[local57] < local22 + (local57 & local55)) {
				@Pc(72) int local72 = arg2[local57];
				arg2[local57] = arg2[local18];
				arg2[local18] = local72;
				@Pc(86) Object local86 = arg0[local57];
				arg0[local57] = arg0[local18];
				arg0[local18++] = local86;
			}
		}
		arg2[arg1] = arg2[local18];
		arg2[local18] = local22;
		arg0[arg1] = arg0[local18];
		arg0[local18] = local36;
		method5833(arg0, local18 - 1, arg2, arg3);
		method5833(arg0, arg1, arg2, local18 + 1);
	}
}
