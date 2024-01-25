import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "[[[Lclient!vf;")
	public static Class346[][][] aClass346ArrayArrayArray2;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "F")
	public static float aFloat199 = 1.0F;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "Lclient!tda;")
	public static final Class315 aClass315_8 = new Class315(1);

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	public static final int anInt6836 = 4;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(FIIIIIFI[FII)V")
	public static void method5720(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg8 - arg4;
		@Pc(13) int local13 = arg3 - arg5;
		@Pc(17) int local17 = arg9 - arg1;
		@Pc(38) float local38 = (float) local5 * arg7[0] + (float) local17 * arg7[1] + (float) local13 * arg7[2];
		@Pc(59) float local59 = arg7[5] * (float) local13 + arg7[3] * (float) local5 + arg7[4] * (float) local17;
		@Pc(80) float local80 = (float) local5 * arg7[6] + arg7[7] * (float) local17 + (float) local13 * arg7[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local91 *= arg6;
		}
		@Pc(105) float local105 = local59 + arg0 + 0.5F;
		@Pc(122) float local122;
		if (arg2 == 1) {
			local122 = local91;
			local91 = -local105;
			local105 = local122;
		} else if (arg2 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg2 == 3) {
			local122 = local91;
			local91 = local105;
			local105 = -local122;
		}
		Static314.aFloat257 = local105;
		Static325.aFloat267 = local91;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/awt/Canvas;)Lclient!nc;")
	public static Class2_Sub17 method5721(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class2_Sub17_Sub2");
			@Pc(10) Class2_Sub17 local10 = (Class2_Sub17) local6.getDeclaredConstructor().newInstance();
			local10.method3774(arg0);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class2_Sub17_Sub1 local28 = new Class2_Sub17_Sub1();
			local28.method3774(arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLclient!ni;)V")
	public static void method5722(@OriginalArg(1) Class6_Sub1_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt7353 == Static412.anInt575 || arg0.anInt7370 == -1 || arg0.anInt7406 != 0) {
			local5 = true;
		} else {
			@Pc(27) Class84 local27 = Static116.aClass140_2.method3287(arg0.anInt7370);
			if (local27.aBoolean186 || local27.anIntArray110[arg0.anInt7416] < arg0.anInt7400 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(59) int local59 = arg0.anInt7353 - arg0.anInt7415;
			@Pc(64) int local64 = Static412.anInt575 - arg0.anInt7415;
			@Pc(76) int local76 = arg0.anInt7340 * 512 + arg0.method6165() * 256;
			@Pc(87) int local87 = arg0.anInt7397 * 512 + arg0.method6165() * 256;
			@Pc(99) int local99 = arg0.anInt7390 * 512 + arg0.method6165() * 256;
			@Pc(110) int local110 = arg0.anInt7374 * 512 + arg0.method6165() * 256;
			arg0.anInt8761 = (local76 * (local59 - local64) + local64 * local99) / local59;
			arg0.anInt8764 = (local64 * local110 + (local59 - local64) * local87) / local59;
		}
		arg0.anInt7421 = 0;
		if (arg0.anInt7367 == 0) {
			arg0.method6169(8192, false);
		}
		if (arg0.anInt7367 == 1) {
			arg0.method6169(12288, false);
		}
		if (arg0.anInt7367 == 2) {
			arg0.method6169(0, false);
		}
		if (arg0.anInt7367 == 3) {
			arg0.method6169(4096, false);
		}
	}
}
