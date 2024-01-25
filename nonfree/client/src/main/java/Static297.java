import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!le", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_99 = new Class56(80, -1);

	@OriginalMember(owner = "client!le", name = "N", descriptor = "Z")
	public static boolean aBoolean376 = false;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	public static void method4420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static335.anInt5608 + arg1;
		@Pc(13) int local13 = arg0 + Static246.anInt4344;
		if (Static309.aClass299ArrayArrayArray3 == null || arg1 < 0 || arg0 < 0 || Static54.anInt1038 <= arg1 || Static140.anInt3026 <= arg0 || !Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312) && arg2 != Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117) {
			return;
		}
		@Pc(62) long local62 = (long) (local13 << 14 | arg2 << 28 | local9);
		@Pc(70) Class3_Sub31 local70 = (Class3_Sub31) Static211.aClass354_17.method7689(local62);
		if (local70 == null) {
			Static85.method1682(arg2, arg1, arg0);
			return;
		}
		@Pc(84) Class3_Sub25 local84 = (Class3_Sub25) local70.aClass112_28.method3088();
		if (local84 == null) {
			Static85.method1682(arg2, arg1, arg0);
			return;
		}
		@Pc(102) Class41_Sub2_Sub4_Sub1 local102 = (Class41_Sub2_Sub4_Sub1) Static85.method1682(arg2, arg1, arg0);
		if (local102 == null) {
			local102 = new Class41_Sub2_Sub4_Sub1(arg1 << 9, Static68.aClass34Array1[arg2].method6525(arg0, arg1), arg0 << 9, arg2, arg2);
		} else {
			local102.anInt5403 = local102.anInt5394 = -1;
		}
		local102.anInt5398 = local84.anInt3630;
		local102.anInt5402 = local84.anInt3631;
		label56: while (true) {
			@Pc(145) Class3_Sub25 local145 = (Class3_Sub25) local70.aClass112_28.method3084();
			if (local145 == null) {
				break;
			}
			if (local102.anInt5398 != local145.anInt3630) {
				local102.anInt5404 = local145.anInt3631;
				local102.anInt5403 = local145.anInt3630;
				while (true) {
					@Pc(170) Class3_Sub25 local170 = (Class3_Sub25) local70.aClass112_28.method3084();
					if (local170 == null) {
						break label56;
					}
					if (local170.anInt3630 != local102.anInt5398 && local102.anInt5403 != local170.anInt3630) {
						local102.anInt5401 = local170.anInt3631;
						local102.anInt5394 = local170.anInt3630;
					}
				}
			}
		}
		@Pc(218) int local218 = Static475.method6537((arg0 << 9) + 256, arg2, (arg1 << 9) + 256);
		local102.anInt9443 = local218;
		local102.anInt5391 = 0;
		local102.aByte117 = (byte) arg2;
		local102.anInt9442 = arg0 << 9;
		local102.anInt9444 = arg1 << 9;
		local102.aByte118 = (byte) arg2;
		if (Static511.method6886(arg0, arg1)) {
			local102.aByte118++;
		}
		Static419.method5971(arg2, arg1, arg0, local218, local102);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V")
	public static void method4421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			Static583.method7816(Static158.anIntArrayArray66[arg1], arg2, arg3, arg0);
		} else {
			Static583.method7816(Static158.anIntArrayArray66[arg1], arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIIIIIII)V")
	public static void method4422(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1 > 0 && !Static259.method3984(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static259.method3984(arg3)) {
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg3 > arg1 ? arg1 : arg3;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(66) int[] local66 = arg0;
			@Pc(71) int[] local71 = new int[local55 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg5, local44, arg4, arg1, arg3, 0, 32993, arg2, local66, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(89) int local89 = 0;
				@Pc(91) int local91 = 0;
				@Pc(96) int local96 = arg1;
				@Pc(98) int[] local98 = local71;
				for (@Pc(100) int local100 = 0; local100 < local59; local100++) {
					for (@Pc(104) int local104 = 0; local104 < local55; local104++) {
						@Pc(111) int local111 = local66[local91++];
						@Pc(116) int local116 = local66[local96++];
						@Pc(121) int local121 = local66[local91++];
						@Pc(127) int local127 = local111 >> 24 & 0xFF;
						@Pc(131) int local131 = local111 & 0xFF;
						@Pc(136) int local136 = local66[local96++];
						@Pc(142) int local142 = local111 >> 8 & 0xFF;
						@Pc(148) int local148 = local111 >> 16 & 0xFF;
						@Pc(154) int local154 = local131 + (local121 & 0xFF);
						@Pc(162) int local162 = local148 + (local121 >> 16 & 0xFF);
						@Pc(170) int local170 = local127 + (local121 >> 24 & 0xFF);
						@Pc(178) int local178 = local142 + (local121 >> 8 & 0xFF);
						@Pc(184) int local184 = local154 + (local116 & 0xFF);
						@Pc(192) int local192 = local162 + (local116 >> 16 & 0xFF);
						@Pc(200) int local200 = local178 + (local116 >> 8 & 0xFF);
						@Pc(208) int local208 = local170 + (local116 >> 24 & 0xFF);
						@Pc(214) int local214 = local184 + (local136 & 0xFF);
						@Pc(222) int local222 = local200 + (local136 >> 8 & 0xFF);
						@Pc(230) int local230 = local208 + (local136 >> 24 & 0xFF);
						@Pc(238) int local238 = local192 + (local136 >> 16 & 0xFF);
						local71[local89++] = local214 >> 2 & 0xFF | (local222 & 0x3FC) << 6 | (local238 & 0x3FC) << 14 | (local230 & 0x3FC) << 22;
					}
					local96 += arg1;
					local91 += arg1;
				}
				local71 = local66;
				arg3 = local59;
				arg1 = local55;
				local66 = local98;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local51 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)I")
	public static int method4423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}
}
