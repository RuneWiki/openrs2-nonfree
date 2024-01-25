import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!g", name = "I", descriptor = "Lclient!iv;")
	public static final Class162 aClass162_9 = new Class162(9, 19);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!fga;IIILclient!r;I)V")
	public static void method2845(@OriginalArg(0) Class101 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class44 arg3, @OriginalArg(5) int arg4) {
		@Pc(21) Class293 local21 = Static447.aClass237_3.method5794(arg0.anInt2955);
		if (local21.anInt8556 == -1) {
			return;
		}
		if (arg0.aBoolean230) {
			@Pc(39) int local39 = arg4 + arg0.anInt2920;
			arg4 = local39 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(51) Class78 local51 = local21.method6993(arg4, arg3, arg0.aBoolean229);
		if (local51 == null) {
			return;
		}
		@Pc(57) int local57 = arg0.anInt2946;
		@Pc(60) int local60 = arg0.anInt2969;
		if ((arg4 & 0x1) == 1) {
			local60 = arg0.anInt2946;
			local57 = arg0.anInt2969;
		}
		@Pc(74) int local74 = local51.A();
		@Pc(77) int local77 = local51.ca();
		if (local21.aBoolean607) {
			local77 = local60 * 4;
			local74 = local57 * 4;
		}
		if (local21.anInt8555 == 0) {
			local51.method8187(arg1, arg2 + 4 - local60 * 4, local74, local77);
		} else {
			local51.method8194(arg1, arg2 - (local60 - 1) * 4, local74, local77, 0, local21.anInt8555 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II[FBIII)V")
	public static void method2846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static100.method2181(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static100.method2181(arg0)) {
			@Pc(37) int local37 = Static242.method3879(6408);
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg0 <= arg1 ? arg0 : arg1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(63) int local63 = arg0 >> 1;
			@Pc(65) float[] local65 = arg2;
			@Pc(72) float[] local72 = new float[local37 * local59 * local63];
			while (true) {
				OpenGL.glTexImage2Df(3553, local44, 34842, arg1, arg0, 0, 6408, 5126, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg1 * local37;
				@Pc(93) float[] local93 = local72;
				for (@Pc(95) int local95 = 0; local95 < local37; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(105) int local105 = local91 + local95;
					for (@Pc(107) int local107 = 0; local107 < local63; local107++) {
						for (@Pc(111) int local111 = 0; local111 < local59; local111++) {
							@Pc(117) float local117 = local65[local101];
							local101 += local37;
							@Pc(127) float local127 = local117 + local65[local101];
							local101 += local37;
							@Pc(137) float local137 = local127 + local65[local105];
							local105 += local37;
							@Pc(147) float local147 = local137 + local65[local105];
							local72[local99] = local147 * 0.25F;
							local105 += local37;
							local99 += local37;
						}
						local105 += local91;
						local101 += local91;
					}
				}
				local72 = local65;
				arg1 = local59;
				local65 = local93;
				arg0 = local63;
				local63 >>= 0x1;
				local44++;
				local59 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V")
	public static void method2848() {
		Static366.aClass223_59.method5398();
	}
}
