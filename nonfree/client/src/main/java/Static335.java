import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	public static int anInt5875;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "Lclient!ms;")
	public static Class155 aClass155_35;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_206 = new Class221("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "[I")
	public static final int[] anIntArray713 = new int[25];

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "Z")
	public static boolean aBoolean450 = true;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!ag;Lclient!ag;I)V")
	public static void method5120(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2 arg1) {
		if (arg0.aClass2_243 != null) {
			arg0.method5745();
		}
		arg0.aClass2_243 = arg1.aClass2_243;
		arg0.aClass2_244 = arg1;
		arg0.aClass2_243.aClass2_244 = arg0;
		arg0.aClass2_244.aClass2_243 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!km;Lclient!ji;ILclient!fr;ILclient!pc;I)V")
	public static void method5122(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class2_Sub20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class80 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class176 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg1.anInt2995 - arg2 / 2 - 5;
		@Pc(19) int local19 = arg6 + 2;
		if (arg3.anInt2029 != 0) {
			arg0.method4486(arg6 + arg4 * arg5.method4159() + 1 - local19, arg2 + 10, local15, arg3.anInt2029, local19);
		}
		if (arg3.anInt2050 != 0) {
			arg0.method4525(arg2 + 10, arg4 * arg5.method4159() + (arg6 + -local19 - -1), local19, arg3.anInt2050, local15);
		}
		@Pc(71) int local71 = arg3.anInt2031;
		if (arg1.aBoolean223 && arg3.anInt2036 != -1) {
			local71 = arg3.anInt2036;
		}
		for (@Pc(83) int local83 = 0; local83 < arg4; local83++) {
			@Pc(89) String local89 = Static22.aStringArray5[local83];
			if (local83 < arg4 - 1) {
				local89 = local89.substring(0, local89.length() - 4);
			}
			arg5.method4156(arg0, local89, arg1.anInt2995, arg6, local71);
			arg6 += arg5.method4159();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZIII)I")
	public static int method5124(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub16 local8 = Static108.method2083(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray272.length) {
			return local8.anIntArray272[arg2];
		} else {
			return 0;
		}
	}
}
