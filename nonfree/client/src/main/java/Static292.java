import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIZIII)V")
	public static void method5186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static71.method1642(arg2);
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg2 - arg0;
		if (local20 < 0) {
			local20 = 0;
		}
		@Pc(26) int local26 = arg2;
		@Pc(29) int local29 = -arg2;
		@Pc(31) int local31 = local20;
		@Pc(34) int local34 = -local20;
		@Pc(36) int local36 = -1;
		@Pc(38) int local38 = -1;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (arg5 >= Static228.anInt920 && arg5 <= Static307.anInt6214) {
			@Pc(48) int[] local48 = Static146.anIntArrayArray91[arg5];
			local56 = Static24.method734(Static96.anInt2180, arg3 - arg2, Static124.anInt4221);
			local64 = Static24.method734(Static96.anInt2180, arg3 + arg2, Static124.anInt4221);
			local73 = Static24.method734(Static96.anInt2180, arg3 - local20, Static124.anInt4221);
			local81 = Static24.method734(Static96.anInt2180, arg3 + local20, Static124.anInt4221);
			Static205.method3670(arg4, local73, local48, local56);
			Static205.method3670(arg1, local81, local48, local73);
			Static205.method3670(arg4, local64, local48, local81);
		}
		while (local26 > local15) {
			local38 += 2;
			local36 += 2;
			local29 += local36;
			local34 += local38;
			if (local34 >= 0 && local31 >= 1) {
				local31--;
				Static300.anIntArray424[local31] = local15;
				local34 -= local31 << 1;
			}
			local15++;
			@Pc(248) int local248;
			@Pc(261) int local261;
			@Pc(272) int[] local272;
			@Pc(144) int local144;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				local144 = arg5 - local26;
				local56 = arg5 + local26;
				if (Static228.anInt920 <= local56 && Static307.anInt6214 >= local144) {
					if (local26 >= local20) {
						local64 = Static24.method734(Static96.anInt2180, arg3 + local15, Static124.anInt4221);
						local73 = Static24.method734(Static96.anInt2180, arg3 - local15, Static124.anInt4221);
						if (Static307.anInt6214 >= local56) {
							Static205.method3670(arg4, local64, Static146.anIntArrayArray91[local56], local73);
						}
						if (Static228.anInt920 <= local144) {
							Static205.method3670(arg4, local64, Static146.anIntArrayArray91[local144], local73);
						}
					} else {
						local64 = Static300.anIntArray424[local26];
						local73 = Static24.method734(Static96.anInt2180, arg3 + local15, Static124.anInt4221);
						local81 = Static24.method734(Static96.anInt2180, arg3 - local15, Static124.anInt4221);
						local248 = Static24.method734(Static96.anInt2180, local64 + arg3, Static124.anInt4221);
						local261 = Static24.method734(Static96.anInt2180, arg3 - local64, Static124.anInt4221);
						if (Static307.anInt6214 >= local56) {
							local272 = Static146.anIntArrayArray91[local56];
							Static205.method3670(arg4, local261, local272, local81);
							Static205.method3670(arg1, local248, local272, local261);
							Static205.method3670(arg4, local73, local272, local248);
						}
						if (Static228.anInt920 <= local144) {
							local272 = Static146.anIntArrayArray91[local144];
							Static205.method3670(arg4, local261, local272, local81);
							Static205.method3670(arg1, local248, local272, local261);
							Static205.method3670(arg4, local73, local272, local248);
						}
					}
				}
			}
			local144 = arg5 - local15;
			local56 = arg5 + local15;
			if (Static228.anInt920 <= local56 && local144 <= Static307.anInt6214) {
				local64 = local26 + arg3;
				local73 = arg3 - local26;
				if (local64 >= Static124.anInt4221 && Static96.anInt2180 >= local73) {
					local64 = Static24.method734(Static96.anInt2180, local64, Static124.anInt4221);
					local73 = Static24.method734(Static96.anInt2180, local73, Static124.anInt4221);
					if (local15 < local20) {
						local81 = local15 <= local31 ? local31 : Static300.anIntArray424[local15];
						local248 = Static24.method734(Static96.anInt2180, arg3 + local81, Static124.anInt4221);
						local261 = Static24.method734(Static96.anInt2180, arg3 - local81, Static124.anInt4221);
						if (local56 <= Static307.anInt6214) {
							local272 = Static146.anIntArrayArray91[local56];
							Static205.method3670(arg4, local261, local272, local73);
							Static205.method3670(arg1, local248, local272, local261);
							Static205.method3670(arg4, local64, local272, local248);
						}
						if (local144 >= Static228.anInt920) {
							local272 = Static146.anIntArrayArray91[local144];
							Static205.method3670(arg4, local261, local272, local73);
							Static205.method3670(arg1, local248, local272, local261);
							Static205.method3670(arg4, local64, local272, local248);
						}
					} else {
						if (Static307.anInt6214 >= local56) {
							Static205.method3670(arg4, local64, Static146.anIntArrayArray91[local56], local73);
						}
						if (Static228.anInt920 <= local144) {
							Static205.method3670(arg4, local64, Static146.anIntArrayArray91[local144], local73);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(B)V")
	public static void method5187() {
		Static330.aClass119_203.method3312();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZCLjava/lang/String;)I")
	public static int method5189(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local12++;
			}
		}
		return local12;
	}
}
