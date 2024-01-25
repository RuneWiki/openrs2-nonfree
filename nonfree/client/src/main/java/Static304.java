import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_52 = new Class87(256);

	@OriginalMember(owner = "client!th", name = "P", descriptor = "Z")
	public static boolean aBoolean580 = true;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!gi;III[Z)V")
	public static void method5121(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static298.aClass53Array3 == Static269.aClass53Array2) {
			return;
		}
		@Pc(9) int local9 = Static190.aClass53Array1[arg1].method2792(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class53 local22 = Static190.aClass53Array1[local11];
				if (local22 != null) {
					local22.method2782(arg0, arg2, local9 - local22.method2792(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!pd;Lclient!na;Lclient!uo;Z)V")
	public static void method5123(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) Class32 arg2) {
		@Pc(10) Class5 local10 = arg1.method3811(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method3629();
		if (local16 < local10.method3623()) {
			local16 = local10.method3623();
		}
		@Pc(28) int local28 = arg0.anInt4781;
		@Pc(31) int local31 = arg0.anInt4782;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg1.aString37 != null) {
			local33 = Static26.aClass63_2.method1745(Static92.aStringArray33, null, null, arg1.aString37);
			for (local55 = 0; local55 < local33; local55++) {
				@Pc(61) String local61 = Static92.aStringArray33[local55];
				if (local33 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static351.aClass106_9.method2846(local61);
				if (local35 < local82) {
					local35 = local82;
				}
			}
			local41 = local33 * Static351.aClass106_9.method2842() + Static351.aClass106_9.method2848() / 2;
		}
		local55 = arg0.anInt4781 + local16 / 2;
		@Pc(120) int local120 = arg0.anInt4782;
		if (local16 + Static79.anInt4163 > local28) {
			local28 = Static79.anInt4163;
			local55 = local16 / 2 + Static79.anInt4163 + local35 / 2 + 5 + 10;
		} else if (Static79.anInt4164 - local16 < local28) {
			local28 = Static79.anInt4164 - local16;
			local55 = Static79.anInt4164 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		if (Static79.anInt4167 + local16 > local31) {
			local31 = Static79.anInt4167;
			local120 = local16 / 2 + Static79.anInt4167 + 10;
		} else if (local31 > Static79.anInt4160 - local16) {
			local31 = Static79.anInt4160 - local16;
			local120 = Static79.anInt4160 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local28 - arg0.anInt4781), (double) (local31 - arg0.anInt4782)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method3624((float) local28 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local31, 4096, local82);
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		@Pc(269) int local269 = -2;
		@Pc(271) int local271 = -2;
		if (arg1.aString37 != null) {
			local265 = local55 - local35 / 2 - 5;
			local267 = local120;
			local271 = local33 * Static351.aClass106_9.method2842() + local120 + 3;
			local269 = local265 + local35 + 10;
			if (arg1.anInt4240 != 0) {
				arg2.method2191(arg1.anInt4240, local265, local269 - local265, local120, local271 - local120);
			}
			if (arg1.anInt4242 != 0) {
				arg2.method2183(local265, local120, local269 - local265, arg1.anInt4242, local271 - local120);
			}
			for (@Pc(341) int local341 = 0; local341 < local33; local341++) {
				@Pc(347) String local347 = Static92.aStringArray33[local341];
				if (local33 - 1 > local341) {
					local347 = local347.substring(0, local347.length() - 4);
				}
				Static351.aClass106_9.method2844(arg2, local347, local55, local120, arg1.anInt4239);
				local120 += Static351.aClass106_9.method2842();
			}
		}
		if (arg1.anInt4245 == -1 && arg1.aString37 == null) {
			return;
		}
		@Pc(399) Class1_Sub28 local399 = new Class1_Sub28(arg0);
		local16 >>= 0x1;
		local399.anInt5207 = local265;
		local399.anInt5208 = local31 - local16;
		local399.anInt5220 = local16 + local31;
		local399.anInt5215 = local271;
		local399.anInt5221 = local267;
		local399.anInt5210 = local28 - local16;
		local399.anInt5212 = local28 + local16;
		local399.anInt5219 = local269;
		Static280.aClass16_32.method416(local399);
	}
}
