import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[[[Lclient!we;")
	public static Class213[][][] aClass213ArrayArrayArray3;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!mo;")
	public static Class143 aClass143_115;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public static int anInt6538 = 0;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[I")
	public static final int[] anIntArray625 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	public static int anInt6542 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method5833() {
		@Pc(10) Class11 local10 = Static22.aClass11_15;
		synchronized (Static22.aClass11_15) {
			Static22.aClass11_15.method215(5);
		}
		local10 = Static24.aClass11_16;
		synchronized (Static24.aClass11_16) {
			Static24.aClass11_16.method215(5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method5834(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static116.aString96 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static59.aString57 + "</col>";
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZIIII)V")
	public static void method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static156.method5346(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(36) int local36 = -local15;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(44) int[] local44 = Static104.anIntArrayArray31[arg0];
		@Pc(49) int local49 = arg2 - local15;
		@Pc(53) int local53 = local15 + arg2;
		Static27.method690(local49, local44, arg1, arg2 - arg3);
		Static27.method690(local53, local44, arg5, local49);
		Static27.method690(arg2 + arg3, local44, arg1, local53);
		while (local10 < local24) {
			local40 += 2;
			local38 += 2;
			local36 += local40;
			local27 += local38;
			if (local36 >= 0 && local29 >= 1) {
				Static208.anIntArray360[local29] = local10;
				local29--;
				local36 -= local29 << 1;
			}
			local10++;
			@Pc(134) int[] local134;
			@Pc(141) int[] local141;
			@Pc(145) int local145;
			@Pc(149) int local149;
			@Pc(154) int local154;
			@Pc(158) int local158;
			@Pc(162) int local162;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local24 < local15) {
					local134 = Static104.anIntArrayArray31[arg0 + local24];
					local141 = Static104.anIntArrayArray31[arg0 - local24];
					local145 = Static208.anIntArray360[local24];
					local149 = arg2 + local10;
					local154 = arg2 - local10;
					local158 = local145 + arg2;
					local162 = arg2 - local145;
					Static27.method690(local162, local134, arg1, local154);
					Static27.method690(local158, local134, arg5, local162);
					Static27.method690(local149, local134, arg1, local158);
					Static27.method690(local162, local141, arg1, local154);
					Static27.method690(local158, local141, arg5, local162);
					Static27.method690(local149, local141, arg1, local158);
				} else {
					local134 = Static104.anIntArrayArray31[arg0 + local24];
					local141 = Static104.anIntArrayArray31[arg0 - local24];
					local145 = local10 + arg2;
					local149 = arg2 - local10;
					Static27.method690(local145, local134, arg1, local149);
					Static27.method690(local145, local141, arg1, local149);
				}
			}
			local134 = Static104.anIntArrayArray31[local10 + arg0];
			local141 = Static104.anIntArrayArray31[arg0 - local10];
			local145 = local24 + arg2;
			local149 = arg2 - local24;
			if (local10 >= local15) {
				Static27.method690(local145, local134, arg1, local149);
				Static27.method690(local145, local141, arg1, local149);
			} else {
				local154 = local10 <= local29 ? local29 : Static208.anIntArray360[local10];
				local158 = arg2 + local154;
				local162 = arg2 - local154;
				Static27.method690(local162, local134, arg1, local149);
				Static27.method690(local158, local134, arg5, local162);
				Static27.method690(local145, local134, arg1, local158);
				Static27.method690(local162, local141, arg1, local149);
				Static27.method690(local158, local141, arg5, local162);
				Static27.method690(local145, local141, arg1, local158);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	public static void method5836(@OriginalArg(0) int arg0) {
		@Pc(8) Class14_Sub2_Sub13 local8 = Static1.method5711(6, arg0);
		local8.method3539();
	}
}
