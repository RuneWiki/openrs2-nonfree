import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public static int anInt6459;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public static int anInt6469 = 0;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!vda;")
	public static final Class299 aClass299_8 = new Class299();

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "[F")
	public static final float[] aFloatArray43 = new float[16];

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_286 = new Class296(13, -1);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V")
	public static void method5430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static400.method6041(arg0, Static205.anInt4042, Static99.anInt1988);
		@Pc(17) int local17 = Static400.method6041(arg3, Static205.anInt4042, Static99.anInt1988);
		@Pc(23) int local23 = Static400.method6041(arg1, Static216.anInt4203, Static358.anInt8908);
		@Pc(29) int local29 = Static400.method6041(arg4, Static216.anInt4203, Static358.anInt8908);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static424.method6216(local29, arg2, local23, Static447.anIntArrayArray99[local31]);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Z")
	public static boolean method5431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static300.method4753(arg1, arg0) || Static231.method4009(arg0, arg1);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method5433() {
		@Pc(7) Class177 local7 = null;
		try {
			@Pc(13) Class157 local13 = Static466.aClass102_4.method2388(true, "2");
			while (local13.anInt4742 == 0) {
				Static209.method3565(1L);
			}
			if (local13.anInt4742 == 1) {
				local7 = (Class177) local13.anObject12;
				@Pc(37) byte[] local37 = new byte[(int) local7.method4410()];
				@Pc(54) int local54;
				for (@Pc(39) int local39 = 0; local39 < local37.length; local39 += local54) {
					local54 = local7.method4406(local37.length - local39, local37, local39);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				Static512.method7098(new Class1_Sub6(local37));
			}
		} catch (@Pc(78) Exception local78) {
		}
		try {
			if (local7 != null) {
				local7.method4411();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)I")
	public static int method5439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static170.method2588(4, arg1 + 91923, arg0 + 45365) + (Static170.method2588(2, arg1 - -37821, arg0 + 10294) + -128 >> 1) + (Static170.method2588(1, arg1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
