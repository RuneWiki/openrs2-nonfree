import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!bt;")
	public static Class34 aClass34_24;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "[I")
	public static final int[] anIntArray142 = new int[1];

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public static int anInt2131 = 0;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "[I")
	public static final int[] anIntArray143 = new int[4];

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method2065(@OriginalArg(1) Class33 arg0) {
		if (Static574.anInt8895 < 2 && !Static463.aBoolean582 || Static507.aClass199_12 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static463.aBoolean582 && Static574.anInt8895 < 2) {
			local41 = Static384.aString73 + Static279.aClass179_32.method4066(Static164.anInt2984) + Static203.aString30 + " ->";
		} else if (Static625.aBoolean764 && Static231.aClass102_6.method4311(81) && Static574.anInt8895 > 2) {
			local41 = Static624.method8379(Static111.aClass4_Sub5_Sub17_2);
		} else {
			@Pc(45) Class4_Sub5_Sub17 local45 = Static111.aClass4_Sub5_Sub17_2;
			if (local45 == null) {
				return;
			}
			local41 = Static624.method8379(local45);
			@Pc(54) int[] local54 = null;
			if (Static566.method7494(local45.anInt7673)) {
				local54 = Static532.aClass255_2.method5210((int) local45.aLong226).anIntArray199;
			} else if (local45.anInt7675 != -1) {
				local54 = Static532.aClass255_2.method5210(local45.anInt7675).anIntArray199;
			} else if (Static98.method1982(local45.anInt7673)) {
				@Pc(143) Class4_Sub45 local143 = (Class4_Sub45) Static597.aClass66_41.method1994((long) (int) local45.aLong226);
				if (local143 != null) {
					@Pc(148) Class3_Sub1_Sub2_Sub2_Sub2 local148 = local143.aClass3_Sub1_Sub2_Sub2_Sub2_2;
					@Pc(151) Class345 local151 = local148.aClass345_1;
					if (local151.anIntArray624 != null) {
						local151 = local151.method7529(Static526.aClass293_1);
					}
					if (local151 != null) {
						local54 = local151.anIntArray626;
					}
				}
			} else if (Static193.method3007(local45.anInt7673)) {
				@Pc(112) Class342 local112;
				if (local45.anInt7673 == 1011) {
					local112 = Static441.aClass74_169.method2075((int) local45.aLong226);
				} else {
					local112 = Static441.aClass74_169.method2075((int) (local45.aLong226 >>> 32 & 0x7FFFFFFFL));
				}
				if (local112.anIntArray620 != null) {
					local112 = local112.method7495(Static526.aClass293_1);
				}
				if (local112 != null) {
					local54 = local112.anIntArray619;
				}
			}
			if (local54 != null) {
				local41 = local41 + Static314.method4357(local54);
			}
		}
		if (Static574.anInt8895 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static574.anInt8895 - 2) + Static279.aClass179_25.method4066(Static164.anInt2984);
		}
		if (Static374.aClass199_9 != null) {
			@Pc(227) Class56 local227 = Static374.aClass199_9.method4420(arg0);
			if (local227 == null) {
				local227 = Static344.aClass56_10;
			}
			local227.method8050(Static128.aClass17Array3, Static397.anInt5797, Static374.aClass199_9.anInt4994, Static374.aClass199_9.anInt4986, Static374.aClass199_9.anInt4987, Static289.anIntArray350, Static20.aRandom1, local41, Static374.aClass199_9.anInt4950, Static374.aClass199_9.anInt5022, Static100.anInt2070, Static2.anIntArray1, Static180.anInt9924, Static374.aClass199_9.anInt5035);
			Static66.method1452(Static289.anIntArray350[3], Static289.anIntArray350[0], Static289.anIntArray350[1], Static289.anIntArray350[2]);
		} else if (Static514.aClass199_13 != null && Static179.aClass234_2 == Static333.aClass234_5) {
			@Pc(292) int local292 = Static344.aClass56_10.method8066(Static24.anInt563 + 16, Static2.anIntArray1, Static128.aClass17Array3, local41, Static20.aRandom1, Static678.anInt10617 + 4, Static397.anInt5797);
			Static66.method1452(16, Static678.anInt10617 + 4, Static24.anInt563, local292 + Static641.aClass31_10.method1024(local41));
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!oia;B)V")
	public static void method2066(@OriginalArg(0) Class4_Sub3 arg0) {
		if (arg0.aClass4_Sub4_6 != null) {
			arg0.aClass4_Sub4_6.anInt191 = 0;
		}
		arg0.aBoolean714 = false;
		for (@Pc(22) Class4_Sub3 local22 = arg0.method7719(); local22 != null; local22 = arg0.method7720()) {
			method2066(local22);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public static void method2067(@OriginalArg(0) int arg0) {
		Static289.anIntArray351 = new int[arg0];
		Static481.anIntArray515 = new int[arg0];
		Static533.anIntArray564 = new int[arg0];
		Static27.anIntArray52 = new int[arg0];
		Static248.anIntArray296 = new int[arg0];
	}
}
