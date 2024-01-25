import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_13 = new Class349(113, 6);

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "Lclient!oba;")
	public static final Class250 aClass250_1 = new Class250();

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "[Lclient!np;")
	public static final Class243[] aClass243Array1 = new Class243[100];

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_6 = new Class154(75, -1);

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
	public static int anInt757 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIII)V")
	public static void method688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg2; local8 <= arg0; local8++) {
			Static437.method5735(arg3, Static238.anIntArrayArray36[local8], arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILclient!po;Lclient!po;)V")
	public static void method689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2_Sub5 arg3, @OriginalArg(4) Class12_Sub2_Sub5 arg4) {
		@Pc(4) Class228 local4 = Static199.method2502(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass12_Sub2_Sub5_1 = arg3;
		local4.aClass12_Sub2_Sub5_2 = arg4;
		@Pc(19) int local19 = Static114.aClass151Array1 == Static320.aClass151Array3 ? 1 : 0;
		if (!arg3.method7513()) {
			Static585.aClass12_Sub2ArrayArray3[local19][Static535.anIntArray577[local19]++] = arg3;
		} else if (arg3.method7503()) {
			Static310.aClass12_Sub2ArrayArray2[local19][Static503.anIntArray540[local19]++] = arg3;
		} else {
			Static146.aClass12_Sub2ArrayArray1[local19][Static313.anIntArray359[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7513()) {
			if (arg4.method7503()) {
				Static310.aClass12_Sub2ArrayArray2[local19][Static503.anIntArray540[local19]++] = arg4;
				return;
			}
			Static146.aClass12_Sub2ArrayArray1[local19][Static313.anIntArray359[local19]++] = arg4;
			return;
		}
		Static585.aClass12_Sub2ArrayArray3[local19][Static535.anIntArray577[local19]++] = arg4;
	}
}
