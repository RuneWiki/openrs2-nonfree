import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!on", name = "y", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "[I")
	public static final int[] anIntArray429 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIILclient!ge;)V")
	public static void method4033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class79 arg3) {
		for (@Pc(15) Class1_Sub43 local15 = (Class1_Sub43) Static305.aClass14_33.method302(); local15 != null; local15 = (Class1_Sub43) Static305.aClass14_33.method313()) {
			if (arg2 == local15.anInt6225 && arg0 * 128 == local15.anInt6217 && local15.anInt6234 == arg1 * 128 && local15.aClass79_1.anInt1898 == arg3.anInt1898) {
				if (local15.aClass1_Sub31_Sub1_3 != null) {
					Static142.aClass1_Sub31_Sub2_1.method4444(local15.aClass1_Sub31_Sub1_3);
					local15.aClass1_Sub31_Sub1_3 = null;
				}
				if (local15.aClass1_Sub31_Sub1_2 != null) {
					Static142.aClass1_Sub31_Sub2_1.method4444(local15.aClass1_Sub31_Sub1_2);
					local15.aClass1_Sub31_Sub1_2 = null;
				}
				local15.method5796();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!wd;Lclient!nj;ZI)V")
	public static void method4036(@OriginalArg(0) Class215 arg0, @OriginalArg(1) Class1_Sub21 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class1_Sub37 local17 = new Class1_Sub37();
		local17.anInt5191 = arg1.method5720();
		local17.anInt5187 = arg1.method5716();
		local17.anIntArray483 = new int[local17.anInt5191];
		local17.anIntArray482 = new int[local17.anInt5191];
		local17.aByteArrayArrayArray8 = new byte[local17.anInt5191][][];
		local17.aClass193Array1 = new Class193[local17.anInt5191];
		local17.aClass193Array2 = new Class193[local17.anInt5191];
		local17.anIntArray484 = new int[local17.anInt5191];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt5191; local59++) {
			try {
				@Pc(65) int local65 = arg1.method5720();
				@Pc(84) String local84;
				@Pc(88) String local88;
				@Pc(90) int local90;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local84 = arg1.method5701();
					local88 = arg1.method5701();
					local90 = 0;
					if (local65 == 1) {
						local90 = arg1.method5716();
					}
					local17.anIntArray482[local59] = local65;
					local17.anIntArray483[local59] = local90;
					local17.aClass193Array1[local59] = arg0.method5669(local88, Static263.method4737(local84));
				} else if (local65 == 3 || local65 == 4) {
					local84 = arg1.method5701();
					local88 = arg1.method5701();
					local90 = arg1.method5720();
					@Pc(143) String[] local143 = new String[local90];
					for (@Pc(145) int local145 = 0; local145 < local90; local145++) {
						local143[local145] = arg1.method5701();
					}
					@Pc(164) byte[][] local164 = new byte[local90][];
					@Pc(177) int local177;
					if (local65 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local90; local171++) {
							local177 = arg1.method5716();
							local164[local171] = new byte[local177];
							arg1.method5730(local164[local171], local177);
						}
					}
					local17.anIntArray482[local59] = local65;
					@Pc(202) Class[] local202 = new Class[local90];
					for (local177 = 0; local177 < local90; local177++) {
						local202[local177] = Static263.method4737(local143[local177]);
					}
					local17.aClass193Array2[local59] = arg0.method5671(Static263.method4737(local84), local202, local88);
					local17.aByteArrayArrayArray8[local59] = local164;
				}
			} catch (@Pc(237) ClassNotFoundException local237) {
				local17.anIntArray484[local59] = -1;
			} catch (@Pc(244) SecurityException local244) {
				local17.anIntArray484[local59] = -2;
			} catch (@Pc(251) NullPointerException local251) {
				local17.anIntArray484[local59] = -3;
			} catch (@Pc(258) Exception local258) {
				local17.anIntArray484[local59] = -4;
			} catch (@Pc(265) Throwable local265) {
				local17.anIntArray484[local59] = -5;
			}
		}
		Static26.aClass14_1.method300(local17);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZIII)V")
	public static void method4037(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static143.aFloat21 = local15;
		if (Static246.anInt5156 == 2) {
			Static290.anInt5827 = 0;
			Static296.anInt5982 = local15;
			Static338.anInt6530 = local11;
		}
		Static318.aFloat77 = local11;
		Static340.method5645();
		Static209.aBoolean344 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4038(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static305.aClass1_Sub21_Sub2_3.method5757(195);
			Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(arg0));
			Static305.aClass1_Sub21_Sub2_3.method5752(arg0);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	public static void method4039(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub15 local8 = Static17.method307(14, arg0);
		local8.method4783();
		local8.anInt5461 = arg1;
	}
}
