import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "Z")
	public static boolean aBoolean276;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CB)Z")
	public static boolean method3500(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static218.aCharArray3;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (arg0 == local45) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIII)V")
	public static void method3501(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(9, (long) arg0);
		local9.method2438();
		local9.anInt2749 = arg2;
		local9.anInt2740 = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIIIII)V")
	public static void method3502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static556.method7635(arg4);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg4 - arg0;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(28) int local28 = arg4;
		@Pc(31) int local31 = -arg4;
		@Pc(33) int local33 = local17;
		@Pc(36) int local36 = -local17;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static286.anIntArrayArray42[arg1];
		@Pc(49) int local49 = arg3 - local17;
		@Pc(53) int local53 = local17 + arg3;
		Static343.method5202(arg3 - arg4, local44, arg5, local49);
		Static343.method5202(local49, local44, arg2, local53);
		Static343.method5202(local53, local44, arg5, arg3 + arg4);
		while (local12 < local28) {
			local38 += 2;
			local40 += 2;
			local31 += local38;
			local36 += local40;
			if (local36 >= 0 && local33 >= 1) {
				Static131.anIntArray115[local33] = local12;
				local33--;
				local36 -= local33 << 1;
			}
			local12++;
			@Pc(134) int[] local134;
			@Pc(141) int[] local141;
			@Pc(145) int local145;
			@Pc(150) int local150;
			@Pc(155) int local155;
			@Pc(159) int local159;
			@Pc(164) int local164;
			if (local31 >= 0) {
				local28--;
				local31 -= local28 << 1;
				if (local17 > local28) {
					local134 = Static286.anIntArrayArray42[arg1 + local28];
					local141 = Static286.anIntArrayArray42[arg1 - local28];
					local145 = Static131.anIntArray115[local28];
					local150 = arg3 + local12;
					local155 = arg3 - local12;
					local159 = local145 + arg3;
					local164 = arg3 - local145;
					Static343.method5202(local155, local134, arg5, local164);
					Static343.method5202(local164, local134, arg2, local159);
					Static343.method5202(local159, local134, arg5, local150);
					Static343.method5202(local155, local141, arg5, local164);
					Static343.method5202(local164, local141, arg2, local159);
					Static343.method5202(local159, local141, arg5, local150);
				} else {
					local134 = Static286.anIntArrayArray42[local28 + arg1];
					local141 = Static286.anIntArrayArray42[arg1 - local28];
					local145 = local12 + arg3;
					local150 = arg3 - local12;
					Static343.method5202(local150, local134, arg5, local145);
					Static343.method5202(local150, local141, arg5, local145);
				}
			}
			local134 = Static286.anIntArrayArray42[arg1 + local12];
			local141 = Static286.anIntArrayArray42[arg1 - local12];
			local145 = local28 + arg3;
			local150 = arg3 - local28;
			if (local17 <= local12) {
				Static343.method5202(local150, local134, arg5, local145);
				Static343.method5202(local150, local141, arg5, local145);
			} else {
				local155 = local33 >= local12 ? local33 : Static131.anIntArray115[local12];
				local159 = local155 + arg3;
				local164 = arg3 - local155;
				Static343.method5202(local150, local134, arg5, local164);
				Static343.method5202(local164, local134, arg2, local159);
				Static343.method5202(local159, local134, arg5, local145);
				Static343.method5202(local150, local141, arg5, local164);
				Static343.method5202(local164, local141, arg2, local159);
				Static343.method5202(local159, local141, arg5, local145);
			}
		}
	}
}
