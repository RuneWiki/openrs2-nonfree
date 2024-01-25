import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
	public static int anInt8604 = 0;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!dh;")
	public static final Class64 aClass64_8 = new Class64("", 16);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BIIIII)V")
	public static void method7046(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static535.method7411(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static535.method7411(arg3)) {
			@Pc(37) int local37 = Static228.method3981(arg0);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg3 > arg4 ? arg4 : arg3;
			@Pc(50) int local50 = arg4 >> 1;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(56) byte[] local56 = arg1;
			@Pc(63) byte[] local63 = new byte[local50 * local54 * local37];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local39, arg5, arg4, arg3, 0, arg0, 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(81) int local81 = arg4 * local37;
				@Pc(83) byte[] local83 = local63;
				for (@Pc(85) int local85 = 0; local85 < local37; local85++) {
					@Pc(88) int local88 = local85;
					@Pc(90) int local90 = local85;
					@Pc(94) int local94 = local81 + local85;
					for (@Pc(96) int local96 = 0; local96 < local54; local96++) {
						for (@Pc(99) int local99 = 0; local99 < local50; local99++) {
							@Pc(104) byte local104 = local56[local90];
							local90 += local37;
							@Pc(114) int local114 = local104 + local56[local90];
							local90 += local37;
							@Pc(124) int local124 = local114 + local56[local94];
							local94 += local37;
							@Pc(134) int local134 = local124 + local56[local94];
							local63[local88] = (byte) (local134 >> 2);
							local94 += local37;
							local88 += local37;
						}
						local94 += local81;
						local90 += local81;
					}
				}
				local63 = local56;
				local56 = local83;
				arg4 = local50;
				arg3 = local54;
				local46 >>= 0x1;
				local39++;
				local50 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)I")
	public static int method7051(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!jq;I)Ljava/lang/String;")
	public static String method7053(@OriginalArg(1) Class156 arg0, @OriginalArg(2) int arg1) {
		if (!Static67.method1228(arg0).method2106(arg1) && arg0.anObjectArray26 == null) {
			return null;
		} else if (arg0.aStringArray24 == null || arg1 >= arg0.aStringArray24.length || arg0.aStringArray24[arg1] == null || arg0.aStringArray24[arg1].trim().length() == 0) {
			return Static54.aBoolean69 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray24[arg1];
		}
	}
}
