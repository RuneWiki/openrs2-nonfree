import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!g", name = "o", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_79 = new Class107(46, -2);

	@OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
	public static final int[] anIntArray196 = new int[5];

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public static int anInt2467 = 0;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public static int anInt2468 = -1;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([[[Lclient!fq;B)V")
	public static void method2191(@OriginalArg(0) Class80[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(11) Class80[][] local11 = arg0[local1];
			for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
				for (@Pc(16) int local16 = 0; local16 < local11[local13].length; local16++) {
					@Pc(23) Class80 local23 = local11[local13][local16];
					if (local23 != null) {
						if (local23.aClass31_Sub1_2 instanceof Interface5) {
							((Interface5) local23.aClass31_Sub1_2).method5171();
						}
						if (local23.aClass31_Sub4_2 instanceof Interface5) {
							((Interface5) local23.aClass31_Sub4_2).method5171();
						}
						if (local23.aClass31_Sub4_1 instanceof Interface5) {
							((Interface5) local23.aClass31_Sub4_1).method5171();
						}
						if (local23.aClass31_Sub3_3 instanceof Interface5) {
							((Interface5) local23.aClass31_Sub3_3).method5171();
						}
						if (local23.aClass31_Sub3_2 instanceof Interface5) {
							((Interface5) local23.aClass31_Sub3_2).method5171();
						}
						for (@Pc(73) Class22 local73 = local23.aClass22_2; local73 != null; local73 = local73.aClass22_1) {
							@Pc(77) Class31_Sub2 local77 = local73.aClass31_Sub2_1;
							if (local77 instanceof Interface5) {
								((Interface5) local77).method5171();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ya;BLclient!ul;)V")
	public static void method2193(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class246 arg1) {
		@Pc(8) Class51[] local8 = Static461.method1446(arg1, Static350.anInt5830);
		Static251.aClass143Array8 = new Class143[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static251.aClass143Array8[local14] = arg0.method4549(local8[local14]);
		}
		local8 = Static461.method1446(arg1, Static287.anInt5019);
		Static218.aClass143Array7 = new Class143[local8.length];
		for (@Pc(44) int local44 = 0; local44 < local8.length; local44++) {
			Static218.aClass143Array7[local44] = arg0.method4549(local8[local44]);
		}
		local8 = Static461.method1446(arg1, Static390.anInt6279);
		Static446.aClass143Array14 = new Class143[local8.length];
		for (@Pc(70) int local70 = 0; local70 < local8.length; local70++) {
			Static446.aClass143Array14[local70] = arg0.method4549(local8[local70]);
		}
		local8 = Static461.method1446(arg1, Static117.anInt2416);
		Static150.aClass143Array5 = new Class143[local8.length];
		for (@Pc(100) int local100 = 0; local100 < local8.length; local100++) {
			Static150.aClass143Array5[local100] = arg0.method4549(local8[local100]);
		}
		local8 = Static461.method1446(arg1, Static278.anInt4902);
		Static311.aClass143Array9 = new Class143[local8.length];
		for (@Pc(126) int local126 = 0; local126 < local8.length; local126++) {
			Static311.aClass143Array9[local126] = arg0.method4549(local8[local126]);
		}
		local8 = Static461.method1446(arg1, Static20.anInt4991);
		Static141.aClass143Array3 = new Class143[local8.length];
		for (@Pc(156) int local156 = 0; local156 < local8.length; local156++) {
			Static141.aClass143Array3[local156] = arg0.method4549(local8[local156]);
		}
		local8 = Static461.method1446(arg1, Static158.anInt2981);
		Static410.aClass143Array13 = new Class143[local8.length];
		for (@Pc(187) int local187 = 0; local187 < local8.length; local187++) {
			Static410.aClass143Array13[local187] = arg0.method4549(local8[local187]);
		}
		local8 = Static461.method1446(arg1, Static426.anInt6882);
		Static17.aClass143Array1 = new Class143[local8.length];
		for (@Pc(213) int local213 = 0; local213 < local8.length; local213++) {
			Static17.aClass143Array1[local213] = arg0.method4549(local8[local213]);
		}
		local8 = Static461.method1446(arg1, Static156.anInt2955);
		Static333.aClass143Array10 = new Class143[local8.length];
		for (@Pc(239) int local239 = 0; local239 < local8.length; local239++) {
			Static333.aClass143Array10[local239] = arg0.method4549(local8[local239]);
		}
		local8 = Static461.method1446(arg1, Static180.anInt6842);
		Static118.aClass143Array2 = new Class143[local8.length];
		for (@Pc(265) int local265 = 0; local265 < local8.length; local265++) {
			Static118.aClass143Array2[local265] = arg0.method4549(local8[local265]);
		}
		local8 = Static461.method1446(arg1, Static174.anInt3226);
		Static347.aClass143Array11 = new Class143[local8.length];
		for (@Pc(291) int local291 = 0; local291 < local8.length; local291++) {
			Static347.aClass143Array11[local291] = arg0.method4549(local8[local291]);
		}
		local8 = Static461.method1446(arg1, Static191.anInt3422);
		Static148.aClass143Array4 = new Class143[local8.length];
		for (@Pc(321) int local321 = 0; local321 < local8.length; local321++) {
			Static148.aClass143Array4[local321] = arg0.method4549(local8[local321]);
		}
		Static58.aClass143_10 = arg0.method4549(Static461.method1450(arg1, Static269.anInt4765, 0));
		Static57.aClass143_9 = arg0.method4549(Static461.method1450(arg1, Static310.anInt5356, 0));
		local8 = Static461.method1446(arg1, Static242.anInt4444);
		Static384.aClass143Array12 = new Class143[local8.length];
		for (@Pc(367) int local367 = 0; local367 < local8.length; local367++) {
			Static384.aClass143Array12[local367] = arg0.method4549(local8[local367]);
		}
	}
}
