import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "Lclient!dl;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
	public static int anInt2365;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "[I")
	public static final int[] anIntArray176 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
	public static int anInt2358 = 0;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Lclient!en;")
	public static final Class100 aClass100_2 = new Class100();

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBLclient!sl;)Ljava/lang/String;")
	public static String method1984(@OriginalArg(2) Class2_Sub17 arg0) {
		try {
			@Pc(15) int local15 = arg0.method2853();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local15];
			arg0.anInt3378 += Static618.aClass346_1.method8019(arg0.anInt3378, arg0.aByteArray26, local15, local27, 0);
			return Static422.method6164(0, local15, local27);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg7 < 1 || arg1 < 1 || Static456.anInt7428 - 2 < arg7 || arg1 > Static5.anInt112 - 2) {
			return;
		}
		@Pc(44) int local44 = arg0;
		if (arg0 < 3 && Static481.method6813(arg1, arg7)) {
			local44 = arg0 + 1;
		}
		if (Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 0 && !Static168.method2928(local44, arg7, arg1, Static245.anInt4753)) {
			return;
		}
		if (Static348.aClass84ArrayArrayArray5 == null) {
			return;
		}
		Static348.aClass309_Sub1_1.method7105(arg2, arg1, arg0, Static141.aClass13_27, Static520.aClass175Array1[arg0], arg7);
		if (arg3 < 0) {
			return;
		}
		@Pc(94) int local94 = Static305.aClass2_Sub49_15.aClass33_Sub21_1.method5680();
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub21_1, 1);
		Static348.aClass309_Sub1_1.method7109(arg6, arg7, arg0, Static520.aClass175Array1[arg0], arg4, arg1, local44, arg5, Static141.aClass13_27, arg3);
		Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub21_1, local94);
		return;
	}
}
