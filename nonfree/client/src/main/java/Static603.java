import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "[I")
	public static int[] anIntArray739;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
	public static final int[] anIntArray738 = new int[14];

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_16 = new Class395(4, 4);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILclient!fha;)V")
	public static void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2_Sub4 arg3) {
		@Pc(4) Class58 local4 = Static125.method2096(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass12_Sub2_Sub4_1 = arg3;
		@Pc(16) int local16 = Static576.aClass51Array3 == Static473.aClass51Array2 ? 1 : 0;
		if (arg3.method9161()) {
			if (arg3.method9150()) {
				arg3.aClass12_Sub2_22 = Static154.aClass12_Sub2Array1[local16];
				Static154.aClass12_Sub2Array1[local16] = arg3;
				return;
			}
			arg3.aClass12_Sub2_22 = Static447.aClass12_Sub2Array8[local16];
			Static447.aClass12_Sub2Array8[local16] = arg3;
			Static17.aBoolean15 = true;
			return;
		}
		arg3.aClass12_Sub2_22 = Static177.aClass12_Sub2Array2[local16];
		Static177.aClass12_Sub2Array2[local16] = arg3;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)Z")
	public static boolean method8473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static400.method5985(arg1, arg0) | (arg1 & 0x2000) != 0 | Static410.method6057(arg1, arg0)) & Static597.method8442(arg1, arg0);
	}
}
