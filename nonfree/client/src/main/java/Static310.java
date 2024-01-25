import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!mt;")
	public static Class214 aClass214_1;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "I")
	public static int anInt6429;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt6424 = 0;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!ec;")
	public static final Class86 aClass86_7 = new Class86();

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public static int anInt6428 = 100;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IC)I")
	public static int method5470(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class14_Sub14.anIntArray364.length ? Class14_Sub14.anIntArray364[arg0] : -1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!qo;IIIII)Lclient!eba;")
	public static Class85_Sub1_Sub1 method5472(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean620 || Static468.method7401(arg2) && Static468.method7401(arg4)) {
			return new Class85_Sub1_Sub1(arg0, 3553, arg1, arg3, arg2, arg4, true);
		} else if (arg0.aBoolean629) {
			return new Class85_Sub1_Sub1(arg0, 34037, arg1, arg3, arg2, arg4, true);
		} else {
			return new Class85_Sub1_Sub1(arg0, arg1, arg3, arg2, arg4, Static231.method4407(arg2), Static231.method4407(arg4), true);
		}
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
	public static void method5473() {
		Static154.aClass169_39.method5009();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II[BZIII)V")
	public static void method5474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static468.method7401(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static468.method7401(arg0)) {
			@Pc(34) int local34 = Static452.method7106(arg3);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg1 < arg0 ? arg1 : arg0;
			@Pc(52) int local52 = arg1 >> 1;
			@Pc(56) int local56 = arg0 >> 1;
			@Pc(58) byte[] local58 = arg2;
			@Pc(65) byte[] local65 = new byte[local52 * local56 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local36, arg5, arg1, arg0, 0, arg3, 5121, local58, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(84) int local84 = arg1 * local34;
				@Pc(86) byte[] local86 = local65;
				for (@Pc(88) int local88 = 0; local88 < local34; local88++) {
					@Pc(92) int local92 = local88;
					@Pc(94) int local94 = local88;
					@Pc(98) int local98 = local84 + local88;
					for (@Pc(100) int local100 = 0; local100 < local56; local100++) {
						for (@Pc(104) int local104 = 0; local104 < local52; local104++) {
							@Pc(110) byte local110 = local58[local94];
							local94 += local34;
							@Pc(120) int local120 = local110 + local58[local94];
							@Pc(126) int local126 = local120 + local58[local98];
							local94 += local34;
							local98 += local34;
							@Pc(140) int local140 = local126 + local58[local98];
							local65[local92] = (byte) (local140 >> 2);
							local98 += local34;
							local92 += local34;
						}
						local98 += local84;
						local94 += local84;
					}
				}
				local65 = local58;
				local58 = local86;
				arg0 = local56;
				arg1 = local52;
				local56 >>= 0x1;
				local36++;
				local43 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
