import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!is", name = "t", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)I")
	public static int method2838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 31 & arg0 - 1;
		return (arg1 + (arg1 >>> 31)) % arg0 + local11;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIII)V")
	public static void method2839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static177.method3442(arg0);
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = arg0 - arg5;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(28) int local28 = arg0;
		@Pc(31) int local31 = -arg0;
		@Pc(33) int local33 = local19;
		@Pc(36) int local36 = -local19;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static43.anIntArrayArray57[arg4];
		@Pc(49) int local49 = arg1 - local19;
		@Pc(54) int local54 = arg1 + local19;
		Static367.method6081(arg2, arg1 - arg0, local44, local49);
		Static367.method6081(arg3, local49, local44, local54);
		Static367.method6081(arg2, local54, local44, arg1 + arg0);
		while (local28 > local14) {
			local40 += 2;
			local38 += 2;
			local36 += local40;
			local31 += local38;
			if (local36 >= 0 && local33 >= 1) {
				Static360.anIntArray510[local33] = local14;
				local33--;
				local36 -= local33 << 1;
			}
			local14++;
			@Pc(126) int[] local126;
			@Pc(133) int[] local133;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(182) int local182;
			@Pc(186) int local186;
			@Pc(191) int local191;
			if (local31 >= 0) {
				local28--;
				if (local28 >= local19) {
					local126 = Static43.anIntArrayArray57[arg4 + local28];
					local133 = Static43.anIntArrayArray57[arg4 - local28];
					local137 = arg1 + local14;
					local142 = arg1 - local14;
					Static367.method6081(arg2, local142, local126, local137);
					Static367.method6081(arg2, local142, local133, local137);
				} else {
					local126 = Static43.anIntArrayArray57[local28 + arg4];
					local133 = Static43.anIntArrayArray57[arg4 - local28];
					local137 = Static360.anIntArray510[local28];
					local142 = arg1 + local14;
					local182 = arg1 - local14;
					local186 = local137 + arg1;
					local191 = arg1 - local137;
					Static367.method6081(arg2, local182, local126, local191);
					Static367.method6081(arg3, local191, local126, local186);
					Static367.method6081(arg2, local186, local126, local142);
					Static367.method6081(arg2, local182, local133, local191);
					Static367.method6081(arg3, local191, local133, local186);
					Static367.method6081(arg2, local186, local133, local142);
				}
				local31 -= local28 << 1;
			}
			local126 = Static43.anIntArrayArray57[local14 + arg4];
			local133 = Static43.anIntArrayArray57[arg4 - local14];
			local137 = local28 + arg1;
			local142 = arg1 - local28;
			if (local14 >= local19) {
				Static367.method6081(arg2, local142, local126, local137);
				Static367.method6081(arg2, local142, local133, local137);
			} else {
				local182 = local33 >= local14 ? local33 : Static360.anIntArray510[local14];
				local186 = arg1 + local182;
				local191 = arg1 - local182;
				Static367.method6081(arg2, local142, local126, local191);
				Static367.method6081(arg3, local191, local126, local186);
				Static367.method6081(arg2, local186, local126, local137);
				Static367.method6081(arg2, local142, local133, local191);
				Static367.method6081(arg3, local191, local133, local186);
				Static367.method6081(arg2, local186, local133, local137);
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
	public static void method2840() {
		Static368.aClass21_182.method857();
	}
}
