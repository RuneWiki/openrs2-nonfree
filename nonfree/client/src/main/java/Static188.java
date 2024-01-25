import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "[Lclient!cn;")
	public static Class23_Sub2[] aClass23_Sub2Array1;

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
	public static int anInt3451 = 1;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILclient!gj;)Lclient!nf;")
	public static Class102 method3032(@OriginalArg(0) int arg0, @OriginalArg(2) Class143 arg1) {
		@Pc(10) Class102 local10 = (Class102) Static131.aClass279_13.method6631((long) arg0);
		if (local10 == null) {
			if (Static519.aBoolean656) {
				local10 = Static582.aClass16_12.method8132(Static683.method3279(arg1, arg0), true);
			} else {
				local10 = Static479.method6832(arg1.method3135(arg0));
			}
			Static131.aClass279_13.method6635(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I[IIIIIII)V")
	public static void method3033(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static9.method94(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static9.method94(arg1)) {
			@Pc(45) int local45 = 0;
			@Pc(56) int local56 = arg2 >= arg1 ? arg1 : arg2;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(68) int local68 = arg1 >> 1;
			@Pc(70) int[] local70 = arg0;
			@Pc(75) int[] local75 = new int[local68 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local45, arg4, arg2, arg1, 0, 32993, arg5, local70, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(94) int local94 = 0;
				@Pc(96) int local96 = 0;
				@Pc(100) int local100 = arg2;
				@Pc(102) int[] local102 = local75;
				for (@Pc(104) int local104 = 0; local104 < local68; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local60; local108++) {
						@Pc(115) int local115 = local70[local96++];
						@Pc(120) int local120 = local70[local96++];
						@Pc(125) int local125 = local70[local100++];
						@Pc(131) int local131 = local115 >> 8 & 0xFF;
						@Pc(135) int local135 = local115 & 0xFF;
						@Pc(140) int local140 = local70[local100++];
						@Pc(146) int local146 = local115 >> 16 & 0xFF;
						@Pc(152) int local152 = local115 >> 24 & 0xFF;
						@Pc(160) int local160 = local131 + (local120 >> 8 & 0xFF);
						@Pc(166) int local166 = local135 + (local120 & 0xFF);
						@Pc(174) int local174 = local152 + (local120 >> 24 & 0xFF);
						@Pc(182) int local182 = local146 + (local120 >> 16 & 0xFF);
						@Pc(190) int local190 = local182 + (local125 >> 16 & 0xFF);
						@Pc(198) int local198 = local160 + (local125 >> 8 & 0xFF);
						@Pc(204) int local204 = local166 + (local125 & 0xFF);
						@Pc(212) int local212 = local174 + (local125 >> 24 & 0xFF);
						@Pc(220) int local220 = local190 + (local140 >> 16 & 0xFF);
						@Pc(228) int local228 = local212 + (local140 >> 24 & 0xFF);
						@Pc(234) int local234 = local204 + (local140 & 0xFF);
						@Pc(242) int local242 = local198 + (local140 >> 8 & 0xFF);
						local75[local94++] = local234 >> 2 & 0xFF | (local228 & 0x3FC) << 22 | (local220 & 0x3FC) << 14 | (local242 & 0x3FC) << 6;
					}
					local96 += arg2;
					local100 += arg2;
				}
				local75 = local70;
				local70 = local102;
				arg2 = local60;
				arg1 = local68;
				local68 >>= 0x1;
				local56 >>= 0x1;
				local45++;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3036(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(17) int local17 = local6 + 3 & 0xFFFFFFFC;
		@Pc(23) int local23 = local17 / 4 * 3;
		if (local6 <= local17 - 2 || Static215.method5251(arg0.charAt(local17 - 2)) == -1) {
			local23 -= 2;
		} else if (local6 <= local17 - 1 || Static215.method5251(arg0.charAt(local17 - 1)) == -1) {
			local23--;
		}
		@Pc(64) byte[] local64 = new byte[local23];
		Static86.method1785(0, local64, arg0);
		return local64;
	}
}
