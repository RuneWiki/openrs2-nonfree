import jaggl.OpenGL;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString78 = null;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_116 = new Class21("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIBIII)Z")
	public static boolean method6039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg2; local15 <= arg4; local15++) {
			for (@Pc(19) int local19 = arg3; local19 <= arg1; local19++) {
				if (arg0 == Static352.anIntArrayArray44[local15][local19] && Static224.anIntArrayArray30[local15][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Ljava/awt/Component;ZB)Lclient!hh;")
	public static Class95 method6041(@OriginalArg(0) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class95_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class95) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class95_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIII[FI)V")
	public static void method6042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static39.method809(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static39.method809(arg5)) {
			@Pc(37) int local37 = Static302.method4667(6408);
			@Pc(39) int local39 = 0;
			@Pc(50) int local50 = arg3 < arg5 ? arg3 : arg5;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(58) int local58 = arg5 >> 1;
			@Pc(60) float[] local60 = arg4;
			@Pc(67) float[] local67 = new float[local37 * local54 * local58];
			while (true) {
				OpenGL.glTexImage2Df(3553, local39, 34842, arg3, arg5, 0, 6408, 5126, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(87) int local87 = local37 * arg3;
				@Pc(89) float[] local89 = local67;
				for (@Pc(91) int local91 = 0; local91 < local37; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local87 + local91;
					for (@Pc(103) int local103 = 0; local103 < local58; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local54; local107++) {
							@Pc(113) float local113 = local60[local97];
							local97 += local37;
							@Pc(123) float local123 = local113 + local60[local97];
							local97 += local37;
							@Pc(133) float local133 = local123 + local60[local101];
							local101 += local37;
							@Pc(143) float local143 = local133 + local60[local101];
							local101 += local37;
							local67[local95] = local143 * 0.25F;
							local95 += local37;
						}
						local101 += local87;
						local97 += local87;
					}
				}
				local67 = local60;
				arg5 = local58;
				local60 = local89;
				arg3 = local54;
				local58 >>= 0x1;
				local50 >>= 0x1;
				local54 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)V")
	public static void method6045() {
		@Pc(7) Class137 local7 = null;
		try {
			@Pc(13) Class87 local13 = Static390.aClass255_5.method5847("2", true);
			while (local13.anInt2679 == 0) {
				Static77.method1653(1L);
			}
			if (local13.anInt2679 == 1) {
				local7 = (Class137) local13.anObject3;
				@Pc(40) Class4_Sub20 local40 = new Class4_Sub20(Static228.anInt4540 * 6 + 3);
				local40.method4590(1);
				local40.method4558(Static228.anInt4540);
				for (@Pc(50) int local50 = 0; local50 < Static355.anIntArray503.length; local50++) {
					if (Static241.aBooleanArray89[local50]) {
						local40.method4558(local50);
						local40.method4561(Static355.anIntArray503[local50]);
					}
				}
				local7.method3706(local40.aByteArray77, local40.anInt5526, 0);
			}
		} catch (@Pc(81) Exception local81) {
		}
		try {
			if (local7 != null) {
				local7.method3708();
			}
		} catch (@Pc(99) Exception local99) {
		}
		Static73.aLong53 = Static167.method2929();
		Static67.aBoolean117 = false;
	}
}
