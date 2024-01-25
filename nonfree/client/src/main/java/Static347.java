import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[I")
	public static int[] anIntArray627 = new int[1];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_100 = new Class361();

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_169 = new Class319(50, 2);

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public static int anInt9410 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIILclient!qv;)V")
	public static void method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20_Sub2_Sub5 arg4) {
		@Pc(4) Class293 local4 = Static528.method7221(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt8796 = (arg1 << Static378.anInt6665) + Static159.anInt2896;
		arg4.anInt8790 = arg3;
		arg4.anInt8795 = (arg2 << Static378.anInt6665) + Static159.anInt2896;
		if (local4.aClass20_Sub2_Sub3_1 != null) {
			arg4.anInt8790 -= local4.aClass20_Sub2_Sub3_1.aShort76;
		}
		local4.aClass20_Sub2_Sub5_1 = arg4;
		@Pc(44) int local44 = Static20.aClass17Array1 == Static499.aClass17Array3 ? 1 : 0;
		if (arg4.method7249()) {
			if (arg4.method7256()) {
				Static386.aClass20_Sub2ArrayArray3[local44][Static288.anIntArray327[local44]++] = arg4;
				return;
			}
			Static166.aClass20_Sub2ArrayArray1[local44][Static464.anIntArray526[local44]++] = arg4;
			return;
		}
		Static379.aClass20_Sub2ArrayArray2[local44][Static431.anIntArray499[local44]++] = arg4;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIB)Z")
	public static boolean method7779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = arg1; local7 <= arg3; local7++) {
			for (@Pc(14) int local14 = arg2; local14 <= arg0; local14++) {
				if (arg4 == Static582.anIntArrayArray61[local7][local14] && Static70.anIntArrayArray9[local7][local14] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
