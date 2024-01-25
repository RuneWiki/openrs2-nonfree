import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kw", name = "I", descriptor = "I")
	public static int anInt4861;

	@OriginalMember(owner = "client!kw", name = "K", descriptor = "Lclient!d;")
	public static Interface8 anInterface8_5;

	@OriginalMember(owner = "client!kw", name = "H", descriptor = "Lclient!kg;")
	public static final Class186 aClass186_10 = new Class186(2, 4, 4, 0);

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(Lclient!jm;)V")
	public static void method4439(@OriginalArg(0) Class175 arg0) {
		if (Static181.anInt3279 >= 65535) {
			return;
		}
		@Pc(6) Class5_Sub27 local6 = arg0.aClass5_Sub27_2;
		Static580.aClass175Array12[Static181.anInt3279] = arg0;
		Static467.aBooleanArray48[Static181.anInt3279] = false;
		Static181.anInt3279++;
		@Pc(21) int local21 = arg0.anInt4431;
		if (arg0.aBoolean363) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt4431;
		if (arg0.aBoolean361) {
			local29 = Static36.anInt662 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method6335() + Static617.anInt10032 - local6.method6338() >> Static162.anInt2830;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method6335() + local6.method6338() - Static617.anInt10032 >> Static162.anInt2830;
			if (local73 >= Static150.anInt2400) {
				local73 = Static150.anInt2400 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray59[local41++];
				@Pc(105) int local105 = (local6.method6330() + Static617.anInt10032 - local6.method6338() >> Static162.anInt2830) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static129.anInt6336) {
					local113 = Static129.anInt6336 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static484.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static484.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static181.anInt3279;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static484.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static181.anInt3279 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static484.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static181.anInt3279 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static484.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static181.anInt3279 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
	public static void method4441(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg0;
		@Pc(17) int local17 = -arg0;
		@Pc(19) int local19 = -1;
		@Pc(29) int local29 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg0 + arg3);
		@Pc(40) int local40 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg3 - arg0);
		Static260.method3979(arg2, local40, Static267.anIntArrayArray20[arg1], local29);
		while (local7 < local14) {
			local19 += 2;
			local17 += local19;
			@Pc(74) int local74;
			@Pc(78) int local78;
			@Pc(94) int local94;
			@Pc(103) int local103;
			if (local17 > 0) {
				local14--;
				local17 -= local14 << 1;
				local74 = arg1 - local14;
				local78 = arg1 + local14;
				if (local78 >= Static304.anInt4824 && Static231.anInt3977 >= local74) {
					local94 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg3 + local7);
					local103 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg3 - local7);
					if (local78 <= Static231.anInt3977) {
						Static260.method3979(arg2, local103, Static267.anIntArrayArray20[local78], local94);
					}
					if (local74 >= Static304.anInt4824) {
						Static260.method3979(arg2, local103, Static267.anIntArrayArray20[local74], local94);
					}
				}
			}
			local7++;
			local74 = arg1 - local7;
			local78 = arg1 + local7;
			if (Static304.anInt4824 <= local78 && Static231.anInt3977 >= local74) {
				local94 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, local14 + arg3);
				local103 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg3 - local14);
				if (local78 <= Static231.anInt3977) {
					Static260.method3979(arg2, local103, Static267.anIntArrayArray20[local78], local94);
				}
				if (local74 >= Static304.anInt4824) {
					Static260.method3979(arg2, local103, Static267.anIntArrayArray20[local74], local94);
				}
			}
		}
	}
}
