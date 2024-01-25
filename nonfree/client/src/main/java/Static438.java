import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_117 = new Class349(92, 12);

	@OriginalMember(owner = "client!qi", name = "i", descriptor = "Z")
	public static boolean aBoolean577 = false;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "Z")
	public static boolean aBoolean578 = false;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZBI)I")
	public static int method5747(@OriginalArg(2) int arg0) {
		@Pc(19) Class2_Sub16 local19 = Static261.method3663(arg0, false);
		if (local19 == null) {
			return Static569.aClass113_1.method2089(arg0).anInt7604;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local19.anIntArray215.length; local31++) {
			if (local19.anIntArray215[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static569.aClass113_1.method2089(arg0).anInt7604 - local19.anIntArray215.length;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIILclient!kn;)V")
	public static void method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12_Sub2_Sub3 arg4) {
		@Pc(4) Class228 local4 = Static199.method2502(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9374 = (arg1 << Static562.anInt9207) + Static437.anInt7021;
		arg4.anInt9373 = arg3;
		arg4.anInt9375 = (arg2 << Static562.anInt9207) + Static437.anInt7021;
		if (local4.aClass12_Sub2_Sub2_1 != null) {
			arg4.anInt9373 -= local4.aClass12_Sub2_Sub2_1.aShort39;
		}
		local4.aClass12_Sub2_Sub3_1 = arg4;
		@Pc(44) int local44 = Static114.aClass151Array1 == Static320.aClass151Array3 ? 1 : 0;
		if (arg4.method7513()) {
			if (arg4.method7503()) {
				Static310.aClass12_Sub2ArrayArray2[local44][Static503.anIntArray540[local44]++] = arg4;
				return;
			}
			Static146.aClass12_Sub2ArrayArray1[local44][Static313.anIntArray359[local44]++] = arg4;
			return;
		}
		Static585.aClass12_Sub2ArrayArray3[local44][Static535.anIntArray577[local44]++] = arg4;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;IIJIBLjava/lang/String;ZIIZ)V")
	public static void method5750(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (!Static572.aBoolean774 && Static484.anInt7715 < 500) {
			@Pc(26) int local26 = arg8 == -1 ? Static409.anInt6677 : arg8;
			@Pc(40) Class2_Sub27 local40 = new Class2_Sub27(arg0, arg5, local26, arg2, arg7, arg3, arg4, arg1, arg9, arg6);
			Static411.aClass70_43.method1269(local40);
			Static484.anInt7715++;
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)[I")
	public static int[] method5751() {
		return new int[] { Static164.anInt2535, Static9.anInt230, Static160.anInt2499 };
	}
}
