import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!kfa", name = "k", descriptor = "I")
	public static int anInt5005;

	@OriginalMember(owner = "client!kfa", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean376 = false;

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_23 = new Class330();

	@OriginalMember(owner = "client!kfa", name = "l", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V")
	public static void method4494() {
		Static573.method2154(255, -1);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZIII[B)V")
	public static void method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5) {
		if (arg4 > 0 && !Static413.method8723(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static413.method8723(arg1)) {
			@Pc(34) int local34 = Static646.method9053(arg3);
			@Pc(43) int local43 = 0;
			@Pc(50) int local50 = arg1 <= arg4 ? arg1 : arg4;
			@Pc(54) int local54 = arg4 >> 1;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(60) byte[] local60 = arg5;
			@Pc(67) byte[] local67 = new byte[local58 * local54 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local43, arg2, arg4, arg1, 0, arg3, 5121, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(85) int local85 = arg4 * local34;
				for (@Pc(87) int local87 = 0; local87 < local34; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(98) int local98 = local87 + local85;
					for (@Pc(100) int local100 = 0; local100 < local58; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local54; local104++) {
							@Pc(110) byte local110 = local60[local93];
							local93 += local34;
							@Pc(120) int local120 = local110 + local60[local93];
							local93 += local34;
							@Pc(130) int local130 = local120 + local60[local98];
							local98 += local34;
							@Pc(140) int local140 = local130 + local60[local98];
							local98 += local34;
							local67[local91] = (byte) (local140 >> 2);
							local91 += local34;
						}
						local93 += local85;
						local98 += local85;
					}
				}
				@Pc(181) byte[] local181 = local67;
				local67 = local60;
				arg4 = local54;
				arg1 = local58;
				local60 = local181;
				local58 >>= 0x1;
				local43++;
				local54 >>= 0x1;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BI)Z")
	public static boolean method4496(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IILjava/lang/String;)Lclient!wfa;")
	public static Class247 method4497(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class247 local13;
		try {
			local13 = (Class247) Class.forName("Class247_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class247_Sub1();
		}
		local13.aString69 = arg1;
		local13.anInt6263 = arg0;
		return local13;
	}
}
