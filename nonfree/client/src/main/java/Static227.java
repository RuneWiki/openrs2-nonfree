import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
	public static int anInt5145;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "[I")
	public static final int[] anIntArray292 = new int[8];

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!mq;")
	public static final Class218 aClass218_63 = new Class218(0, -2);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method4348() {
		@Pc(7) Class375[] local7 = Class3_Sub1_Sub6_Sub1.aClass375Array1;
		synchronized (Class3_Sub1_Sub6_Sub1.aClass375Array1) {
			for (@Pc(17) int local17 = 0; local17 < Class3_Sub1_Sub6_Sub1.aClass375Array1.length; local17++) {
				Class3_Sub1_Sub6_Sub1.aClass375Array1[local17] = new Class375();
				Static605.anIntArray608[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)V")
	public static void method4350(@OriginalArg(1) int arg0) {
		Static198.anInt4626 = arg0;
		Static29.aClass112_5.method3638();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)V")
	public static void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static647.method8666(arg1);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg1 - arg4;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(26) int local26 = arg1;
		@Pc(29) int local29 = -arg1;
		@Pc(31) int local31 = local17;
		@Pc(34) int local34 = -local17;
		@Pc(36) int local36 = -1;
		@Pc(43) int local43 = -1;
		@Pc(47) int[] local47 = Static104.anIntArrayArray24[arg5];
		@Pc(52) int local52 = arg3 - local17;
		Static580.method8027(local47, local52, arg3 - arg1, arg2);
		@Pc(64) int local64 = local17 + arg3;
		Static580.method8027(local47, local64, local52, arg0);
		Static580.method8027(local47, arg1 + arg3, local64, arg2);
		while (local12 < local26) {
			local36 += 2;
			local43 += 2;
			local34 += local43;
			local29 += local36;
			if (local34 >= 0 && local31 >= 1) {
				Static506.anIntArray562[local31] = local12;
				local31--;
				local34 -= local31 << 1;
			}
			local12++;
			@Pc(134) int[] local134;
			@Pc(141) int[] local141;
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(158) int local158;
			@Pc(163) int local163;
			if (local29 >= 0) {
				local26--;
				local29 -= local26 << 1;
				if (local17 > local26) {
					local134 = Static104.anIntArrayArray24[arg5 + local26];
					local141 = Static104.anIntArrayArray24[arg5 - local26];
					local145 = Static506.anIntArray562[local26];
					local149 = arg3 + local12;
					local154 = arg3 - local12;
					local158 = local145 + arg3;
					local163 = arg3 - local145;
					Static580.method8027(local134, local163, local154, arg2);
					Static580.method8027(local134, local158, local163, arg0);
					Static580.method8027(local134, local149, local158, arg2);
					Static580.method8027(local141, local163, local154, arg2);
					Static580.method8027(local141, local158, local163, arg0);
					Static580.method8027(local141, local149, local158, arg2);
				} else {
					local134 = Static104.anIntArrayArray24[arg5 + local26];
					local141 = Static104.anIntArrayArray24[arg5 - local26];
					local145 = arg3 + local12;
					local149 = arg3 - local12;
					Static580.method8027(local134, local145, local149, arg2);
					Static580.method8027(local141, local145, local149, arg2);
				}
			}
			local134 = Static104.anIntArrayArray24[local12 + arg5];
			local141 = Static104.anIntArrayArray24[arg5 - local12];
			local145 = arg3 + local26;
			local149 = arg3 - local26;
			if (local12 < local17) {
				local154 = local12 <= local31 ? local31 : Static506.anIntArray562[local12];
				local158 = arg3 + local154;
				local163 = arg3 - local154;
				Static580.method8027(local134, local163, local149, arg2);
				Static580.method8027(local134, local158, local163, arg0);
				Static580.method8027(local134, local145, local158, arg2);
				Static580.method8027(local141, local163, local149, arg2);
				Static580.method8027(local141, local158, local163, arg0);
				Static580.method8027(local141, local145, local158, arg2);
			} else {
				Static580.method8027(local134, local145, local149, arg2);
				Static580.method8027(local141, local145, local149, arg2);
			}
		}
	}
}
