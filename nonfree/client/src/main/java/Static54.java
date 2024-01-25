import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
	public static int anInt1025;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	public static int anInt1024 = 0;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
	public static int anInt1026 = 1;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "Z")
	public static boolean aBoolean64 = false;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
	public static void method821() {
		@Pc(1) Class26 local1 = Static253.aClass26_45;
		synchronized (Static253.aClass26_45) {
			Static253.aClass26_45.method333();
		}
		local1 = Static11.aClass26_1;
		synchronized (Static11.aClass26_1) {
			Static11.aClass26_1.method333();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static223.method3985(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg1;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg0;
		@Pc(24) int local24 = -arg0;
		@Pc(31) int local31 = local15;
		@Pc(34) int local34 = -local15;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static73.anIntArrayArray6[arg3];
		@Pc(46) int local46 = arg2 - local15;
		Static224.method5303(local42, local46, arg4, arg2 - arg0);
		@Pc(59) int local59 = local15 + arg2;
		Static224.method5303(local42, local59, arg5, local46);
		Static224.method5303(local42, arg0 + arg2, arg4, local59);
		while (local10 < local21) {
			local38 += 2;
			local36 += 2;
			local34 += local38;
			local24 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static164.anIntArray206[local31] = local10;
				local31--;
				local34 -= local31 << 1;
			}
			local10++;
			@Pc(130) int[] local130;
			@Pc(136) int[] local136;
			@Pc(140) int local140;
			@Pc(144) int local144;
			@Pc(148) int local148;
			@Pc(152) int local152;
			@Pc(157) int local157;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 < local15) {
					local130 = Static73.anIntArrayArray6[local21 + arg3];
					local136 = Static73.anIntArrayArray6[arg3 - local21];
					local140 = Static164.anIntArray206[local21];
					local144 = arg2 + local10;
					local148 = arg2 - local10;
					local152 = local140 + arg2;
					local157 = arg2 - local140;
					Static224.method5303(local130, local157, arg4, local148);
					Static224.method5303(local130, local152, arg5, local157);
					Static224.method5303(local130, local144, arg4, local152);
					Static224.method5303(local136, local157, arg4, local148);
					Static224.method5303(local136, local152, arg5, local157);
					Static224.method5303(local136, local144, arg4, local152);
				} else {
					local130 = Static73.anIntArrayArray6[arg3 + local21];
					local136 = Static73.anIntArrayArray6[arg3 - local21];
					local140 = arg2 + local10;
					local144 = arg2 - local10;
					Static224.method5303(local130, local140, arg4, local144);
					Static224.method5303(local136, local140, arg4, local144);
				}
			}
			local130 = Static73.anIntArrayArray6[local10 + arg3];
			local136 = Static73.anIntArrayArray6[arg3 - local10];
			local140 = arg2 + local21;
			local144 = arg2 - local21;
			if (local10 >= local15) {
				Static224.method5303(local130, local140, arg4, local144);
				Static224.method5303(local136, local140, arg4, local144);
			} else {
				local148 = local10 <= local31 ? local31 : Static164.anIntArray206[local10];
				local152 = local148 + arg2;
				local157 = arg2 - local148;
				Static224.method5303(local130, local157, arg4, local144);
				Static224.method5303(local130, local152, arg5, local157);
				Static224.method5303(local130, local140, arg4, local152);
				Static224.method5303(local136, local157, arg4, local144);
				Static224.method5303(local136, local152, arg5, local157);
				Static224.method5303(local136, local140, arg4, local152);
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
	public static void method823() {
		for (@Pc(10) Class10_Sub6 local10 = (Class10_Sub6) Static169.aClass210_14.method5616(); local10 != null; local10 = (Class10_Sub6) Static169.aClass210_14.method5616()) {
			Static72.method1113(local10);
		}
		Static42.method645();
		Static42.method646();
		Static42.method639();
		Static42.method636();
		Static42.method648();
		Static42.method632();
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
	public static void method825() {
		Static218.aClass26_27.method333();
	}
}
