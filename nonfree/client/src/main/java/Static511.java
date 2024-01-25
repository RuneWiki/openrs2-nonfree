import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
	public static int anInt8791;

	@OriginalMember(owner = "client!tw", name = "j", descriptor = "Lclient!wk;")
	public static Class347 aClass347_1;

	@OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
	public static int anInt8799;

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_142 = new Class98(32, 8);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method7008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static205.aClass46Array1 == null) {
			return;
		}
		@Pc(8) Class15_Sub2_Sub4 local8 = null;
		@Pc(15) int local15;
		if (arg10 < 0) {
			local15 = -arg10 - 1;
			if (Static517.anInt8881 == local15) {
				local8 = Static461.aClass15_Sub2_Sub4_Sub2_2;
			} else {
				local8 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local15];
			}
		} else {
			local15 = arg10 - 1;
			@Pc(43) Class6_Sub49 local43 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local15);
			if (local43 != null) {
				local8 = local43.aClass15_Sub2_Sub4_Sub1_2;
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(56) Class192 local56 = Static85.aClass27_1.method516(arg3);
		@Pc(67) int local67;
		@Pc(70) int local70;
		if (arg8 == 1 || arg8 == 3) {
			local67 = local56.anInt5577;
			local70 = local56.anInt5570;
		} else {
			local70 = local56.anInt5577;
			local67 = local56.anInt5570;
		}
		@Pc(84) int local84 = (local70 >> 1) + arg7;
		@Pc(93) int local93 = arg7 + (local70 + 1 >> 1);
		@Pc(99) int local99 = (local67 >> 1) + arg4;
		@Pc(107) int local107 = (local67 + 1 >> 1) + arg4;
		@Pc(111) Class46 local111 = Static205.aClass46Array1[arg12];
		@Pc(140) int local140 = local111.JA(local84, local99) + local111.JA(local93, local99) + local111.JA(local84, local107) + local111.JA(local93, local107) >> 2;
		@Pc(144) Class6_Sub42 local144 = new Class6_Sub42();
		local144.anInt8152 = arg4;
		@Pc(156) int local156;
		if (arg9 < arg11) {
			local156 = arg11;
			arg11 = arg9;
			arg9 = local156;
		}
		local144.anInt8154 = arg0 + Static363.anInt6671;
		local144.anInt8162 = arg7;
		local144.anInt8165 = arg2 + Static363.anInt6671;
		local144.anInt8161 = local8.aByte98;
		local144.anInt8158 = arg3;
		local144.anInt8153 = arg6;
		local144.anInt8147 = arg8;
		local144.anInt8148 = arg11 + arg7;
		local144.anInt8160 = arg7 + arg9;
		if (arg1 < arg5) {
			local156 = arg5;
			arg5 = arg1;
			arg1 = local156;
		}
		local144.anInt8159 = (local67 << 8) + (local144.anInt8152 << 9);
		local144.anInt8157 = (local70 << 8) + (local144.anInt8162 << 9);
		local144.anInt8156 = arg5 + arg4;
		local144.anInt8163 = local140;
		local144.anInt8155 = arg1 + arg4;
		Static54.aClass298_24.method6812(local144);
		local8.aClass6_Sub42_3 = local144;
	}
}
