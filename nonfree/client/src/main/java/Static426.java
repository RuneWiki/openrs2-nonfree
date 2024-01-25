import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!fq;")
	public static final Class104 aClass104_14 = new Class104(4, 1, 1, 1);

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "S")
	public static short aShort104 = 256;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public static int anInt7833 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method6557() {
		@Pc(17) byte[] local17;
		if (Static392.anObject15 == null) {
			@Pc(10) Class43_Sub1_Sub1 local10 = new Class43_Sub1_Sub1();
			local17 = local10.method6779();
			Static392.anObject15 = Static368.method5897(local17);
		}
		if (Static482.anObject16 == null) {
			@Pc(32) Class43_Sub2_Sub2 local32 = new Class43_Sub2_Sub2();
			local17 = local32.method8292();
			Static482.anObject16 = Static368.method5897(local17);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILclient!td;Lclient!td;)V")
	public static void method6561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub3_Sub2 arg3, @OriginalArg(4) Class2_Sub3_Sub2 arg4) {
		@Pc(4) Class106 local4 = Static139.method3134(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass2_Sub3_Sub2_2 = arg3;
		local4.aClass2_Sub3_Sub2_1 = arg4;
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
}
