import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!om", name = "u", descriptor = "Lclient!rn;")
	public static Class18 aClass18_18;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_62 = new Class32("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!om", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString52 = "";

	@OriginalMember(owner = "client!om", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray113 = new String[200];

	@OriginalMember(owner = "client!om", name = "y", descriptor = "Z")
	public static boolean aBoolean335 = false;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "I")
	public static int anInt4448 = 0;

	@OriginalMember(owner = "client!om", name = "B", descriptor = "I")
	public static int anInt4450 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBII)Z")
	public static boolean method3959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface2 local11 = (Interface2) Static368.method4614(arg1, arg2, arg0);
		if (local11 != null) {
			local5 = Static136.method2644(local11) & true;
		}
		local11 = (Interface2) Static292.method4418(arg1, arg2, arg0, dc.class);
		if (local11 != null) {
			local5 &= Static136.method2644(local11);
		}
		local11 = (Interface2) Static102.method2138(arg1, arg2, arg0);
		if (local11 != null) {
			local5 &= Static136.method2644(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
	public static void method3960() {
		Static130.method2561(Static81.anInt1473);
		@Pc(21) int local21 = (Static224.anInt4006 >> 10) + (Static28.anInt606 >> 3);
		Static382.anInt6523 = Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 = 0;
		@Pc(34) int local34 = (Static319.anInt5425 >> 3) + (Static51.anInt1057 >> 10);
		Static206.aClass1_Sub5_Sub1_Sub1_1.method2248(8, 8);
		Static389.aByteArrayArray22 = new byte[18][];
		Static267.anIntArray894 = new int[18];
		Static3.anIntArray44 = new int[18];
		Static249.anIntArray1342 = new int[18];
		Static265.anIntArrayArray35 = new int[18][4];
		Static200.anIntArray733 = new int[18];
		Static243.aByteArrayArray13 = new byte[18][];
		Static371.aByteArrayArray20 = new byte[18][];
		Static68.anIntArray284 = new int[18];
		Static59.aByteArrayArray2 = new byte[18][];
		Static50.anIntArray212 = new int[18];
		Static45.aByteArrayArray1 = new byte[18][];
		@Pc(80) int local80 = 0;
		@Pc(100) int local100;
		for (@Pc(89) int local89 = (local21 - (Static246.anInt4374 >> 4)) / 8; local89 <= ((Static246.anInt4374 >> 4) + local21) / 8; local89++) {
			for (local100 = (local34 - (Static185.anInt3485 >> 4)) / 8; local100 <= ((Static185.anInt3485 >> 4) + local34) / 8; local100++) {
				@Pc(109) int local109 = (local89 << 8) + local100;
				Static68.anIntArray284[local80] = local109;
				Static50.anIntArray212[local80] = Static200.aClass171_51.method3769("m" + local89 + "_" + local100);
				Static249.anIntArray1342[local80] = Static200.aClass171_51.method3769("l" + local89 + "_" + local100);
				Static267.anIntArray894[local80] = Static200.aClass171_51.method3769("n" + local89 + "_" + local100);
				Static3.anIntArray44[local80] = Static200.aClass171_51.method3769("um" + local89 + "_" + local100);
				Static200.anIntArray733[local80] = Static200.aClass171_51.method3769("ul" + local89 + "_" + local100);
				if (Static267.anIntArray894[local80] == -1) {
					Static50.anIntArray212[local80] = -1;
					Static249.anIntArray1342[local80] = -1;
					Static3.anIntArray44[local80] = -1;
					Static200.anIntArray733[local80] = -1;
				}
				local80++;
			}
		}
		for (local100 = local80; local100 < Static267.anIntArray894.length; local100++) {
			Static267.anIntArray894[local100] = -1;
			Static50.anIntArray212[local100] = -1;
			Static249.anIntArray1342[local100] = -1;
			Static3.anIntArray44[local100] = -1;
			Static200.anIntArray733[local100] = -1;
		}
		Static362.method5290(local34, true, local21, false);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
	public static void method3961(@OriginalArg(1) boolean arg0) {
		Static385.aBoolean468 = arg0;
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(53) int local53;
		if (!Static385.aBoolean468) {
			@Pc(360) int local360 = Static218.aClass2_Sub16_Sub2_3.method5315();
			local22 = Static218.aClass2_Sub16_Sub2_3.method5312();
			local26 = Static218.aClass2_Sub16_Sub2_3.method5317();
			@Pc(377) boolean local377 = Static218.aClass2_Sub16_Sub2_3.method5359() == 1;
			Static130.method2561(local360);
			local38 = (Static276.anInt4757 - Static218.aClass2_Sub16_Sub2_3.anInt6145) / 16;
			Static265.anIntArrayArray35 = new int[local38][4];
			for (local42 = 0; local42 < local38; local42++) {
				for (local46 = 0; local46 < 4; local46++) {
					Static265.anIntArrayArray35[local42][local46] = Static218.aClass2_Sub16_Sub2_3.method5346();
				}
			}
			Static59.aByteArrayArray2 = new byte[local38][];
			Static50.anIntArray212 = new int[local38];
			Static68.anIntArray284 = new int[local38];
			Static3.anIntArray44 = new int[local38];
			Static389.aByteArrayArray22 = null;
			Static243.aByteArrayArray13 = new byte[local38][];
			Static45.aByteArrayArray1 = new byte[local38][];
			Static200.anIntArray733 = new int[local38];
			Static267.anIntArray894 = null;
			Static249.anIntArray1342 = new int[local38];
			Static371.aByteArrayArray20 = new byte[local38][];
			local38 = 0;
			for (local46 = (local22 - (Static246.anInt4374 >> 4)) / 8; local46 <= ((Static246.anInt4374 >> 4) + local22) / 8; local46++) {
				for (local53 = (local26 - (Static185.anInt3485 >> 4)) / 8; local53 <= (local26 + (Static185.anInt3485 >> 4)) / 8; local53++) {
					Static68.anIntArray284[local38] = local53 + (local46 << 8);
					Static50.anIntArray212[local38] = Static200.aClass171_51.method3769("m" + local46 + "_" + local53);
					Static249.anIntArray1342[local38] = Static200.aClass171_51.method3769("l" + local46 + "_" + local53);
					Static3.anIntArray44[local38] = Static200.aClass171_51.method3769("um" + local46 + "_" + local53);
					Static200.anIntArray733[local38] = Static200.aClass171_51.method3769("ul" + local46 + "_" + local53);
					local38++;
				}
			}
			Static362.method5290(local26, false, local22, local377);
			return;
		}
		@Pc(18) boolean local18 = Static218.aClass2_Sub16_Sub2_3.method5350() == 1;
		local22 = Static218.aClass2_Sub16_Sub2_3.method5312();
		local26 = Static218.aClass2_Sub16_Sub2_3.method5317();
		@Pc(30) int local30 = Static218.aClass2_Sub16_Sub2_3.method5359();
		Static130.method2561(local30);
		Static218.aClass2_Sub16_Sub2_3.method5378();
		for (local38 = 0; local38 < 4; local38++) {
			for (local42 = 0; local42 < Static246.anInt4374 >> 3; local42++) {
				for (local46 = 0; local46 < Static185.anInt3485 >> 3; local46++) {
					local53 = Static218.aClass2_Sub16_Sub2_3.method5380(1);
					if (local53 == 1) {
						Static309.anIntArrayArrayArray13[local38][local42][local46] = Static218.aClass2_Sub16_Sub2_3.method5380(26);
					} else {
						Static309.anIntArrayArrayArray13[local38][local42][local46] = -1;
					}
				}
			}
		}
		Static218.aClass2_Sub16_Sub2_3.method5383();
		local42 = (Static276.anInt4757 - Static218.aClass2_Sub16_Sub2_3.anInt6145) / 16;
		Static265.anIntArrayArray35 = new int[local42][4];
		for (local46 = 0; local46 < local42; local46++) {
			for (local53 = 0; local53 < 4; local53++) {
				Static265.anIntArrayArray35[local46][local53] = Static218.aClass2_Sub16_Sub2_3.method5346();
			}
		}
		Static3.anIntArray44 = new int[local42];
		Static68.anIntArray284 = new int[local42];
		Static389.aByteArrayArray22 = null;
		Static50.anIntArray212 = new int[local42];
		Static243.aByteArrayArray13 = new byte[local42][];
		Static59.aByteArrayArray2 = new byte[local42][];
		Static200.anIntArray733 = new int[local42];
		Static249.anIntArray1342 = new int[local42];
		Static267.anIntArray894 = null;
		Static45.aByteArrayArray1 = new byte[local42][];
		Static371.aByteArrayArray20 = new byte[local42][];
		local42 = 0;
		for (local53 = 0; local53 < 4; local53++) {
			for (@Pc(177) int local177 = 0; local177 < Static246.anInt4374 >> 3; local177++) {
				for (@Pc(181) int local181 = 0; local181 < Static185.anInt3485 >> 3; local181++) {
					@Pc(191) int local191 = Static309.anIntArrayArrayArray13[local53][local177][local181];
					if (local191 != -1) {
						@Pc(200) int local200 = local191 >> 14 & 0x3FF;
						@Pc(206) int local206 = local191 >> 3 & 0x7FF;
						@Pc(217) int local217 = (local200 / 8 << 8) + (local206 / 8);
						for (@Pc(219) int local219 = 0; local219 < local42; local219++) {
							if (local217 == Static68.anIntArray284[local219]) {
								local217 = -1;
								break;
							}
						}
						if (local217 != -1) {
							Static68.anIntArray284[local42] = local217;
							@Pc(251) int local251 = local217 >> 8 & 0xFF;
							@Pc(255) int local255 = local217 & 0xFF;
							Static50.anIntArray212[local42] = Static200.aClass171_51.method3769("m" + local251 + "_" + local255);
							Static249.anIntArray1342[local42] = Static200.aClass171_51.method3769("l" + local251 + "_" + local255);
							Static3.anIntArray44[local42] = Static200.aClass171_51.method3769("um" + local251 + "_" + local255);
							Static200.anIntArray733[local42] = Static200.aClass171_51.method3769("ul" + local251 + "_" + local255);
							local42++;
						}
					}
				}
			}
		}
		Static362.method5290(local22, false, local26, local18);
	}
}
