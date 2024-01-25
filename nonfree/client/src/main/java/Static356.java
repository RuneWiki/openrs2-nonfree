import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
	public static int anInt6937 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIILclient!pda;Lclient!pda;)V")
	public static void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub3_Sub3 arg3, @OriginalArg(4) Class2_Sub3_Sub3 arg4) {
		@Pc(4) Class106 local4 = Static139.method3134(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass2_Sub3_Sub3_1 = arg3;
		local4.aClass2_Sub3_Sub3_2 = arg4;
		@Pc(19) int local19 = Static500.aClass274Array2 == Static524.aClass274Array3 ? 1 : 0;
		if (!arg3.method8570()) {
			arg3.aClass2_Sub3_23 = Static634.aClass2_Sub3Array7[local19];
			Static634.aClass2_Sub3Array7[local19] = arg3;
		} else if (arg3.method8579()) {
			arg3.aClass2_Sub3_23 = Static464.aClass2_Sub3Array6[local19];
			Static464.aClass2_Sub3Array6[local19] = arg3;
		} else {
			arg3.aClass2_Sub3_23 = Static44.aClass2_Sub3Array3[local19];
			Static44.aClass2_Sub3Array3[local19] = arg3;
			Static160.aBoolean330 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8570()) {
			if (arg4.method8579()) {
				arg4.aClass2_Sub3_23 = Static464.aClass2_Sub3Array6[local19];
				Static464.aClass2_Sub3Array6[local19] = arg4;
				return;
			}
			arg4.aClass2_Sub3_23 = Static44.aClass2_Sub3Array3[local19];
			Static44.aClass2_Sub3Array3[local19] = arg4;
			Static160.aBoolean330 = true;
			return;
		}
		arg4.aClass2_Sub3_23 = Static634.aClass2_Sub3Array7[local19];
		Static634.aClass2_Sub3Array7[local19] = arg4;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
	public static void method5817(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static178.anInt4220 == 1) {
			Static67.aClass33_5.method6229(arg1, arg0, Static640.anInt10507, Static613.anInt10162);
		} else {
			Static67.aClass33_5.method6229(arg1, arg0, 0, 0);
		}
	}
}
