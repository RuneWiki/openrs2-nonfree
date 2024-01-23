import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1250 = Static200.method3116(")3)3)3");

	@OriginalMember(owner = "client!rd", name = "jb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1253 = Static200.method3116("shake:");

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1251 = aClass60_1253;

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array27 = new Class60[200];

	@OriginalMember(owner = "client!rd", name = "ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1252 = aClass60_1253;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBIIIII)V")
	public static void method2733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) int local6 = arg3 - arg2;
		@Pc(10) int local10 = arg2 + arg1;
		@Pc(15) int local15 = arg0 - arg2;
		@Pc(19) int local19 = arg4 + arg2;
		for (@Pc(21) int local21 = arg1; local21 < local10; local21++) {
			Static104.method1768(arg4, arg0, arg6, Static148.anIntArrayArray78[local21]);
		}
		for (@Pc(43) int local43 = arg3; local43 > local6; local43--) {
			Static104.method1768(arg4, arg0, arg6, Static148.anIntArrayArray78[local43]);
		}
		for (@Pc(59) int local59 = local10; local59 <= local6; local59++) {
			@Pc(65) int[] local65 = Static148.anIntArrayArray78[local59];
			Static104.method1768(arg4, local19, arg6, local65);
			Static104.method1768(local19, local15, arg5, local65);
			Static104.method1768(local15, arg0, arg6, local65);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg6 < 1 || arg3 > 102 || arg6 > 102) {
			return;
		}
		@Pc(36) int local36;
		if (Static148.aBoolean266 && (Static209.aByteArrayArrayArray13[0][arg3][arg6] & 0x2) == 0) {
			local36 = arg5;
			if ((Static209.aByteArrayArrayArray13[arg5][arg3][arg6] & 0x8) != 0) {
				local36 = 0;
			}
			if (Static204.anInt4327 != local36) {
				return;
			}
		}
		local36 = arg5;
		if (arg5 < 3 && (Static209.aByteArrayArrayArray13[1][arg3][arg6] & 0x2) == 2) {
			local36 = arg5 + 1;
		}
		Static90.method1560(arg3, arg6, Static153.aClass3Array1[arg5], arg0, arg5, local36);
		if (arg4 >= 0) {
			Static50.method1422(Static153.aClass3Array1[arg5], local36, arg2, false, arg5, arg3, arg4, false, arg1, arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIB)I")
	public static int method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(36) int local36 = Static53.method1018(arg0 - 1, arg1 + -1) + Static53.method1018(arg0 + 1, arg1 - 1) + Static53.method1018(arg0 + -1, arg1 + 1) + Static53.method1018(arg0 + 1, arg1 + 1);
		@Pc(65) int local65 = Static53.method1018(arg0 - 1, arg1) + Static53.method1018(arg0 + 1, arg1) + Static53.method1018(arg0, arg1 - 1) + Static53.method1018(arg0, arg1 + 1);
		@Pc(82) int local82 = Static53.method1018(arg0, arg1);
		return local82 / 4 + local65 / 8 + local36 / 16;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[BI)I")
	public static int method2737(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static192.method3003(arg0, 0, arg1);
	}
}
