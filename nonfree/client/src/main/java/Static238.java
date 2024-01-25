import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "Lclient!cfa;")
	public static final Class54 aClass54_2 = new Class54();

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "Lclient!vea;")
	public static final Class363 aClass363_4 = new Class363(4);

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "Z")
	public static boolean aBoolean302 = false;

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString49 = "";

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
	public static void method3566() {
		Static16.aClass264_58.method6360();
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(DI)V")
	public static void method3567(@OriginalArg(0) double arg0) {
		if (arg0 == Static363.aDouble2) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(22) int local22 = (int) (Math.pow((double) local10 / 255.0D, arg0) * 255.0D);
			Static569.anIntArray709[local10] = local22 <= 255 ? local22 : 255;
		}
		Static363.aDouble2 = arg0;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIILclient!fj;Lclient!fj;)V")
	public static void method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2_Sub3 arg3, @OriginalArg(4) Class12_Sub2_Sub3 arg4) {
		@Pc(4) Class58 local4 = Static125.method2096(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass12_Sub2_Sub3_2 = arg3;
		local4.aClass12_Sub2_Sub3_1 = arg4;
		@Pc(19) int local19 = Static576.aClass51Array3 == Static473.aClass51Array2 ? 1 : 0;
		if (!arg3.method9161()) {
			arg3.aClass12_Sub2_22 = Static177.aClass12_Sub2Array2[local19];
			Static177.aClass12_Sub2Array2[local19] = arg3;
		} else if (arg3.method9150()) {
			arg3.aClass12_Sub2_22 = Static154.aClass12_Sub2Array1[local19];
			Static154.aClass12_Sub2Array1[local19] = arg3;
		} else {
			arg3.aClass12_Sub2_22 = Static447.aClass12_Sub2Array8[local19];
			Static447.aClass12_Sub2Array8[local19] = arg3;
			Static17.aBoolean15 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9161()) {
			if (arg4.method9150()) {
				arg4.aClass12_Sub2_22 = Static154.aClass12_Sub2Array1[local19];
				Static154.aClass12_Sub2Array1[local19] = arg4;
				return;
			}
			arg4.aClass12_Sub2_22 = Static447.aClass12_Sub2Array8[local19];
			Static447.aClass12_Sub2Array8[local19] = arg4;
			Static17.aBoolean15 = true;
			return;
		}
		arg4.aClass12_Sub2_22 = Static177.aClass12_Sub2Array2[local19];
		Static177.aClass12_Sub2Array2[local19] = arg4;
	}
}
