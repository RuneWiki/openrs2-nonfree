import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
	public static int anInt5924;

	@OriginalMember(owner = "client!rv", name = "J", descriptor = "Lclient!ul;")
	public static Class246 aClass246_194;

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "[Lclient!tp;")
	public static final Class236[] aClass236Array1 = new Class236[4];

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!rv", name = "M", descriptor = "Z")
	public static boolean aBoolean414 = false;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(III)I")
	public static int method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
	public static int method4936() {
		@Pc(13) Class134 local13 = Static384.aClass134_49;
		synchronized (Static384.aClass134_49) {
			return Static384.aClass134_49.method3264();
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(III)I")
	public static int method4937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static210.anIntArray329[arg0 & 0x3] : Static202.anIntArray322[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIBII[F)V")
	public static void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5) {
		if (arg0 > 0 && !Static400.method5337(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static400.method5337(arg1)) {
			@Pc(34) int local34 = Static57.method1234(6408);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg0 < arg1 ? arg0 : arg1;
			@Pc(47) int local47 = arg0 >> 1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(53) float[] local53 = arg5;
			@Pc(60) float[] local60 = new float[local34 * local47 * local51];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg0, arg1, 0, 6408, 5126, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(80) int local80 = arg0 * local34;
				@Pc(82) float[] local82 = local60;
				for (@Pc(84) int local84 = 0; local84 < local34; local84++) {
					@Pc(87) int local87 = local84;
					@Pc(89) int local89 = local84;
					@Pc(93) int local93 = local80 + local84;
					for (@Pc(95) int local95 = 0; local95 < local51; local95++) {
						for (@Pc(98) int local98 = 0; local98 < local47; local98++) {
							@Pc(103) float local103 = local53[local89];
							local89 += local34;
							@Pc(113) float local113 = local103 + local53[local89];
							local89 += local34;
							@Pc(123) float local123 = local113 + local53[local93];
							local93 += local34;
							@Pc(133) float local133 = local123 + local53[local93];
							local93 += local34;
							local60[local87] = local133 * 0.25F;
							local87 += local34;
						}
						local89 += local80;
						local93 += local80;
					}
				}
				local60 = local53;
				arg1 = local51;
				local53 = local82;
				arg0 = local47;
				local36++;
				local43 >>= 0x1;
				local47 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V")
	public static void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class80 local7 = client.lb[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class80 local28 = client.lb[local9][arg0][arg1] = client.lb[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte47--;
				for (@Pc(40) Class22 local40 = local28.aClass22_2; local40 != null; local40 = local40.aClass22_1) {
					@Pc(44) Class31_Sub2 local44 = local40.aClass31_Sub2_1;
					if (local44.aShort103 == arg0 && local44.aShort102 == arg1) {
						local44.aByte100--;
					}
				}
			}
		}
		if (client.lb[0][arg0][arg1] == null) {
			client.lb[0][arg0][arg1] = new Class80(0, arg0, arg1);
			client.lb[0][arg0][arg1].aByte52 = 1;
		}
		client.lb[0][arg0][arg1].aClass80_1 = local7;
		client.lb[3][arg0][arg1] = null;
	}
}
