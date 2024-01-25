import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!os", name = "I", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
	public static int anInt5495;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "[I")
	public static final int[] anIntArray466 = new int[5];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIILclient!or;Lclient!or;)V")
	public static void method4350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3, @OriginalArg(4) Class11_Sub2 arg4) {
		@Pc(4) Class36 local4 = Static61.method976(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub2_1 = arg3;
			local4.aClass11_Sub2_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BI)I")
	public static int method4352(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!gi;Lclient!gi;I)V")
	public static void method4353(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class93 arg1) {
		Static164.method2403(Static255.aClass208_61);
		Static389.aClass2_Sub17_Sub1_2.method6170(arg0.anInt2508);
		Static389.aClass2_Sub17_Sub1_2.method6112(arg1.anInt2424);
		Static389.aClass2_Sub17_Sub1_2.method6136(arg1.anInt2508);
		Static389.aClass2_Sub17_Sub1_2.method6112(arg0.anInt2488);
		Static389.aClass2_Sub17_Sub1_2.method6117(arg1.anInt2488);
		Static389.aClass2_Sub17_Sub1_2.method6130(arg0.anInt2424);
	}

	@OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
	public static void method4354() {
		@Pc(10) Class2_Sub11 local10 = (Class2_Sub11) Static292.aClass181_26.method3972();
		@Pc(18) boolean local18 = Static125.aClass93_11 != null || Static102.anInt1595 > 0;
		if (local18) {
			Static46.anInt754 = 1;
		}
		if (Static111.aBoolean107 && Static161.aClass115_1.method2374(81) && Static377.anInt6585 > 2) {
			if (local18) {
				Static122.aClass2_Sub35_1 = (Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267.aClass2_267;
			} else {
				Static430.method5865((Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267.aClass2_267, local10.method4365(), local10.method4368());
			}
		} else if (local18) {
			Static122.aClass2_Sub35_1 = (Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267;
		} else {
			Static430.method5865((Class2_Sub35) Static93.aClass181_7.aClass2_156.aClass2_267, local10.method4365(), local10.method4368());
		}
	}
}
