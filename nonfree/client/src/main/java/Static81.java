import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "[Lclient!jo;")
	public static Class3_Sub2[] aClass3_Sub2Array1;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
	public static int anInt1998;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Lclient!fe;")
	public static final Class74 aClass74_10 = new Class74(16);

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "[I")
	public static final int[] anIntArray118 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBI)V")
	public static void method1550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg1, 16);
		local8.method3088();
		local8.anInt3749 = arg0;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIII)V")
	public static void method1552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static205.method3146(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg4;
		@Pc(27) int local27 = -arg4;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(39) int local39 = -1;
		@Pc(41) int local41 = -1;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (arg3 >= Static172.anInt3442 && arg3 <= Static324.anInt5590) {
			@Pc(55) int[] local55 = Static62.anIntArrayArray7[arg3];
			local64 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 - arg4);
			local72 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + arg4);
			local81 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 - local15);
			local90 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + local15);
			Static298.method4405(local55, arg2, local81, local64);
			Static298.method4405(local55, arg5, local90, local81);
			Static298.method4405(local55, arg2, local72, local90);
		}
		while (local24 > local10) {
			local41 += 2;
			local39 += 2;
			local27 += local39;
			local32 += local41;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static201.anIntArray321[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(243) int local243;
			@Pc(251) int local251;
			@Pc(258) int[] local258;
			@Pc(154) int local154;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local154 = arg3 - local24;
				local64 = arg3 + local24;
				if (local64 >= Static172.anInt3442 && local154 <= Static324.anInt5590) {
					if (local24 >= local15) {
						local72 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + local10);
						local81 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 - local10);
						if (Static324.anInt5590 >= local64) {
							Static298.method4405(Static62.anIntArrayArray7[local64], arg2, local72, local81);
						}
						if (local154 >= Static172.anInt3442) {
							Static298.method4405(Static62.anIntArrayArray7[local154], arg2, local72, local81);
						}
					} else {
						local72 = Static201.anIntArray321[local24];
						local81 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + local10);
						local90 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 - local10);
						local243 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + local72);
						local251 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 - local72);
						if (Static324.anInt5590 >= local64) {
							local258 = Static62.anIntArrayArray7[local64];
							Static298.method4405(local258, arg2, local251, local90);
							Static298.method4405(local258, arg5, local243, local251);
							Static298.method4405(local258, arg2, local81, local243);
						}
						if (local154 >= Static172.anInt3442) {
							local258 = Static62.anIntArrayArray7[local154];
							Static298.method4405(local258, arg2, local251, local90);
							Static298.method4405(local258, arg5, local243, local251);
							Static298.method4405(local258, arg2, local81, local243);
						}
					}
				}
			}
			local154 = arg3 - local10;
			local64 = arg3 + local10;
			if (local64 >= Static172.anInt3442 && Static324.anInt5590 >= local154) {
				local72 = arg1 + local24;
				local81 = arg1 - local24;
				if (local72 >= Static165.anInt3313 && local81 <= Static152.anInt3132) {
					local72 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, local72);
					local81 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, local81);
					if (local15 <= local10) {
						if (Static324.anInt5590 >= local64) {
							Static298.method4405(Static62.anIntArrayArray7[local64], arg2, local72, local81);
						}
						if (local154 >= Static172.anInt3442) {
							Static298.method4405(Static62.anIntArrayArray7[local154], arg2, local72, local81);
						}
					} else {
						local90 = local10 <= local29 ? local29 : Static201.anIntArray321[local10];
						local243 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 + local90);
						local251 = Static120.method2814(Static165.anInt3313, Static152.anInt3132, arg1 - local90);
						if (local64 <= Static324.anInt5590) {
							local258 = Static62.anIntArrayArray7[local64];
							Static298.method4405(local258, arg2, local251, local81);
							Static298.method4405(local258, arg5, local243, local251);
							Static298.method4405(local258, arg2, local72, local243);
						}
						if (Static172.anInt3442 <= local154) {
							local258 = Static62.anIntArrayArray7[local154];
							Static298.method4405(local258, arg2, local251, local81);
							Static298.method4405(local258, arg5, local243, local251);
							Static298.method4405(local258, arg2, local72, local243);
						}
					}
				}
			}
		}
	}
}
