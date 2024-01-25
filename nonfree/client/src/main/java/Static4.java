import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "Lclient!hw;")
	public static Class2_Sub17 aClass2_Sub17_1;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_3 = new Class208(56, -1);

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII)I")
	public static int method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg2;
			arg2 = local8;
		}
		@Pc(16) int local16 = arg1 & 0x3;
		if (local16 == 0) {
			return arg5;
		} else if (local16 == 1) {
			return 1 + 7 - arg0 - arg4;
		} else if (local16 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([[[Lclient!ce;I)V")
	public static void method56(@OriginalArg(0) Class36[][][] arg0) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(14) Class36[][] local14 = arg0[local9];
			for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
				for (@Pc(19) int local19 = 0; local19 < local14[local16].length; local19++) {
					@Pc(26) Class36 local26 = local14[local16][local19];
					if (local26 != null) {
						if (local26.aClass11_Sub3_1 instanceof Interface6) {
							((Interface6) local26.aClass11_Sub3_1).method5716();
						}
						if (local26.aClass11_Sub2_1 instanceof Interface6) {
							((Interface6) local26.aClass11_Sub2_1).method5716();
						}
						if (local26.aClass11_Sub2_2 instanceof Interface6) {
							((Interface6) local26.aClass11_Sub2_2).method5716();
						}
						if (local26.aClass11_Sub1_2 instanceof Interface6) {
							((Interface6) local26.aClass11_Sub1_2).method5716();
						}
						if (local26.aClass11_Sub1_3 instanceof Interface6) {
							((Interface6) local26.aClass11_Sub1_3).method5716();
						}
						for (@Pc(76) Class195 local76 = local26.aClass195_1; local76 != null; local76 = local76.aClass195_2) {
							@Pc(80) Class11_Sub5 local80 = local76.aClass11_Sub5_1;
							if (local80 instanceof Interface6) {
								((Interface6) local80).method5716();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static347.anInt6160 <= arg3 && arg3 <= Static385.anInt6686 && Static347.anInt6160 <= arg2 && arg2 <= Static385.anInt6686 && arg1 >= Static347.anInt6160 && arg1 <= Static385.anInt6686 && Static347.anInt6160 <= arg6 && Static385.anInt6686 >= arg6 && Static118.anInt2005 <= arg0 && Static123.anInt2069 >= arg0 && Static118.anInt2005 <= arg7 && Static123.anInt2069 >= arg7 && arg5 >= Static118.anInt2005 && arg5 <= Static123.anInt2069 && Static118.anInt2005 <= arg8 && Static123.anInt2069 >= arg8) {
			Static18.method361(arg8, arg3, arg0, arg2, arg7, arg6, arg1, arg5, arg4);
		} else {
			Static181.method2410(arg6, arg3, arg4, arg7, arg0, arg1, arg8, arg2, arg5);
		}
	}
}
