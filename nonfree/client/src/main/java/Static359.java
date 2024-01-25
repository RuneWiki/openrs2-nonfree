import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "Lclient!fi;")
	public static Class76 aClass76_13 = null;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "J")
	public static long aLong180 = 0L;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "[Lclient!sj;")
	public static final Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array1 = new Class2_Sub1_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
	public static int anInt5856 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIIBIII)V")
	public static void method4640(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static147.method2135(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static147.method2135(arg1)) {
			@Pc(34) int local34 = Static331.method4086(arg3);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg2 < arg1 ? arg2 : arg1;
			@Pc(47) int local47 = arg2 >> 1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(60) byte[] local60 = arg0;
			@Pc(67) byte[] local67 = new byte[local34 * local47 * local58];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local36, arg4, arg2, arg1, 0, arg3, 5121, local60, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(87) int local87 = local34 * arg2;
				for (@Pc(89) int local89 = 0; local89 < local34; local89++) {
					@Pc(93) int local93 = local89;
					@Pc(95) int local95 = local89;
					@Pc(99) int local99 = local87 + local89;
					for (@Pc(101) int local101 = 0; local101 < local58; local101++) {
						for (@Pc(105) int local105 = 0; local105 < local47; local105++) {
							@Pc(111) byte local111 = local60[local95];
							local95 += local34;
							@Pc(121) int local121 = local111 + local60[local95];
							@Pc(127) int local127 = local121 + local60[local99];
							local95 += local34;
							local99 += local34;
							@Pc(141) int local141 = local127 + local60[local99];
							local99 += local34;
							local67[local93] = (byte) (local141 >> 2);
							local93 += local34;
						}
						local99 += local87;
						local95 += local87;
					}
				}
				@Pc(182) byte[] local182 = local67;
				local67 = local60;
				arg1 = local58;
				arg2 = local47;
				local60 = local182;
				local43 >>= 0x1;
				local36++;
				local47 >>= 0x1;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!sj;Z)V")
	public static void method4641(@OriginalArg(0) Class2_Sub1_Sub3_Sub2 arg0) {
		@Pc(16) Class5_Sub31 local16 = (Class5_Sub31) Static464.aClass252_39.method5659((long) arg0.anInt6126);
		if (local16 == null) {
			Static168.method3851(null, arg0.anIntArray434[0], null, arg0.aByte105, arg0, arg0.anIntArray433[0], 0);
		} else {
			local16.method3901();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!um;ILclient!l;)V")
	public static void method4643(@OriginalArg(0) Class243 arg0, @OriginalArg(2) Interface8 arg1) {
		Static48.anInterface8_21 = arg1;
		Static344.aClass243_195 = arg0;
	}
}
