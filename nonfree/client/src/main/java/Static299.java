import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLjava/lang/String;Lclient!da;Lclient!lq;Lclient!ha;B)V")
	public static void method1114(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class80 arg2, @OriginalArg(3) Class224 arg3, @OriginalArg(4) Class57 arg4) {
		@Pc(20) boolean local20 = !Static634.aBoolean767 || Static431.method6358();
		if (!local20) {
			return;
		}
		@Pc(45) int local45;
		@Pc(54) int local54;
		if (Static634.aBoolean767 && local20) {
			@Pc(32) Class224 local32 = Static404.aClass224_9;
			@Pc(38) Class80 local38 = arg4.method7708(local32, Static514.aClass173Array1);
			local45 = local32.method5259(250, (Class134[]) null, arg1);
			local54 = local32.method5251((Class134[]) null, 250, local32.anInt6145, arg1);
			@Pc(57) int local57 = Static526.aClass173_28.anInt4282;
			@Pc(61) int local61 = local57 + 4;
			local45 += local61 * 2;
			local54 += local61 * 2;
			if (local45 < Static27.anInt464) {
				local45 = Static27.anInt464;
			}
			if (Static609.anInt10104 > local54) {
				local54 = Static609.anInt10104;
			}
			@Pc(95) int local95 = Static422.aClass219_9.method5206(local45, Static264.anInt4559) + Static155.anInt2441;
			@Pc(103) int local103 = Static622.aClass368_13.method8776(local54, Static47.anInt794) + Static581.anInt9737;
			if (Static40.aBoolean61) {
				local95 += Static169.method2467();
				local103 += Static375.method5510();
			}
			arg4.method7654(Static197.aClass173_32, false).method9222(Static97.aClass173_4.anInt4282 + local95, local103 + Static97.aClass173_4.anInt4287, local45 - Static97.aClass173_4.anInt4282 * 2, local54 - Static97.aClass173_4.anInt4287 * 2, 1, 0, 0);
			arg4.method7654(Static97.aClass173_4, true).method9235(local95, local103);
			Static97.aClass173_4.method3652();
			arg4.method7654(Static97.aClass173_4, true).method9235(local95 + local45 - local57, local103);
			Static97.aClass173_4.method3659();
			arg4.method7654(Static97.aClass173_4, true).method9235(local95 + local45 - local57, -local57 + local103 + local54);
			Static97.aClass173_4.method3652();
			arg4.method7654(Static97.aClass173_4, true).method9235(local95, local103 + local54 - local57);
			Static97.aClass173_4.method3659();
			arg4.method7654(Static526.aClass173_28, true).method9240(local95, local103 + Static97.aClass173_4.anInt4287, local57, local54 - Static97.aClass173_4.anInt4287 * 2);
			Static526.aClass173_28.method3656();
			arg4.method7654(Static526.aClass173_28, true).method9240(Static97.aClass173_4.anInt4282 + local95, local103, local45 - Static97.aClass173_4.anInt4282 * 2, local57);
			Static526.aClass173_28.method3656();
			arg4.method7654(Static526.aClass173_28, true).method9240(local95 + local45 - local57, Static97.aClass173_4.anInt4287 + local103, local57, local54 - Static97.aClass173_4.anInt4287 * 2);
			Static526.aClass173_28.method3656();
			arg4.method7654(Static526.aClass173_28, true).method9240(Static97.aClass173_4.anInt4282 + local95, -local57 + local103 + local54, local45 - Static97.aClass173_4.anInt4282 * 2, local57);
			Static526.aClass173_28.method3656();
			local38.method8782(1, 0, local54 - local61 * 2, Static385.anInt6579 | 0xFF000000, -1, (Class134[]) null, local45 - local61 * 2, arg1, 0, (int[]) null, local95 + local61, 0, (Class1) null, local61 + local103, 1);
			Static199.method7894(local95, local54, local103, local45);
		} else {
			local45 = arg3.method5259(250, (Class134[]) null, arg1);
			local54 = arg3.method5249(250, (Class134[]) null, arg1) * 13;
			arg4.aa(6, 6, local45 + 4 + 4, local54 - -4 + 4, -16777216, 0);
			arg4.method7681(6, 6, local45 + 8, 4 + 4 + local54, -1, 0);
			arg2.method8782(1, 0, local54, -1, -1, (Class134[]) null, local45, arg1, 0, (int[]) null, 10, 0, (Class1) null, 10, 1);
			Static199.method7894(6, local54 + 4 + 4, 6, local45 + 4 + 4);
		}
		if (!arg0) {
			return;
		}
		try {
			if (Static40.aBoolean61) {
				Static75.method1189();
			} else {
				arg4.method7693();
			}
		} catch (@Pc(455) Exception_Sub1 local455) {
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[BII[BII)V")
	public static void method1115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg1++;
				arg6[local26] += arg3[arg5++];
				@Pc(38) int local38 = arg1++;
				arg6[local38] += arg3[arg5++];
				@Pc(50) int local50 = arg1++;
				arg6[local50] += arg3[arg5++];
				@Pc(62) int local62 = arg1++;
				arg6[local62] += arg3[arg5++];
			}
			for (@Pc(79) int local79 = local15; local79 < 0; local79++) {
				local26 = arg1++;
				arg6[local26] += arg3[arg5++];
			}
			arg1 += arg7;
			arg5 += arg4;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(CI)Z")
	public static boolean method1116(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static469.method6848(arg0)) {
			return true;
		} else {
			@Pc(22) char[] local22 = Static233.aCharArray3;
			for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
				@Pc(32) char local32 = local22[local24];
				if (arg0 == local32) {
					return true;
				}
			}
			if (3 != 3) {
				method1115(-95, -84, 104, (byte[]) null, -62, -57, (byte[]) null, -37);
			}
			@Pc(68) char[] local68 = Static302.aCharArray4;
			for (@Pc(70) int local70 = 0; local70 < local68.length; local70++) {
				@Pc(78) char local78 = local68[local70];
				if (arg0 == local78) {
					return true;
				}
			}
			return false;
		}
	}
}
