import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt1499;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString50 = "";

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "[I")
	public static int[] anIntArray124 = new int[200];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method1236() {
		while (Static2.aFloat1 >= 2048.0F) {
			Static2.aFloat1 -= 2048.0F;
		}
		while (Static2.aFloat1 < 0.0F) {
			Static2.aFloat1 += 2048.0F;
		}
		@Pc(29) int local29 = Static142.anInt2794 >> 7;
		if (Static15.aFloat2 < 128.0F) {
			Static15.aFloat2 = 128.0F;
		}
		@Pc(39) int local39 = Static216.anInt4233 >> 7;
		@Pc(49) int local49 = 0;
		if (Static15.aFloat2 > 383.0F) {
			Static15.aFloat2 = 383.0F;
		}
		@Pc(61) int local61 = Static104.method1648(Static295.anInt5586, Static216.anInt4233, Static142.anInt2794);
		@Pc(82) int local82;
		if (local39 > 3 && local29 > 3 && local39 < 100 && local29 < 100) {
			for (local82 = local39 - 4; local82 <= local39 + 4; local82++) {
				for (@Pc(91) int local91 = local29 - 4; local91 <= local29 + 4; local91++) {
					@Pc(98) int local98 = Static295.anInt5586;
					if (local98 < 3 && (Static94.aByteArrayArrayArray9[1][local82][local91] & 0x2) == 2) {
						local98++;
					}
					@Pc(141) int local141 = (Static159.aByteArrayArrayArray17[local98][local82][local91] & 0xFF) * 8 + local61 - Static208.anIntArrayArrayArray11[local98][local82][local91];
					if (local141 > local49) {
						local49 = local141;
					}
				}
			}
		}
		local82 = local49 * 192;
		if (local82 > 98048) {
			local82 = 98048;
		}
		if (local82 < 32768) {
			local82 = 32768;
		}
		if (Static215.anInt4230 < local82) {
			Static215.anInt4230 += (local82 - Static215.anInt4230) / 24;
		} else if (Static215.anInt4230 > local82) {
			Static215.anInt4230 += (local82 - Static215.anInt4230) / 80;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public static int method1237(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method1238() {
		if (Static199.aClass101_1 != null) {
			Static199.aClass101_1.method2799();
		}
		if (Static313.aClass101_2 != null) {
			Static313.aClass101_2.method2799();
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public static void method1239() {
		Static44.aClass169_32.method4018();
		Static299.aClass169_159.method4018();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method1240() {
		Static237.aClass1_Sub14_Sub1_7.method2659();
		@Pc(11) int local11 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
		if (local11 == 0) {
			return;
		}
		@Pc(28) int local28 = Static237.aClass1_Sub14_Sub1_7.method2657(2);
		if (local28 == 0) {
			Static158.anIntArray179[Static17.anInt300++] = 2047;
			return;
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		if (local28 == 1) {
			local52 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
			Static229.aClass22_Sub3_Sub2_2.method3644(1, local52);
			local62 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
			if (local62 == 1) {
				Static158.anIntArray179[Static17.anInt300++] = 2047;
			}
		} else if (local28 == 2) {
			if (Static237.aClass1_Sub14_Sub1_7.method2657(1) == 1) {
				local52 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
				Static229.aClass22_Sub3_Sub2_2.method3644(2, local52);
				local62 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
				Static229.aClass22_Sub3_Sub2_2.method3644(2, local62);
			} else {
				local52 = Static237.aClass1_Sub14_Sub1_7.method2657(3);
				Static229.aClass22_Sub3_Sub2_2.method3644(0, local52);
			}
			local52 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
			if (local52 == 1) {
				Static158.anIntArray179[Static17.anInt300++] = 2047;
			}
		} else if (local28 == 3) {
			local52 = Static237.aClass1_Sub14_Sub1_7.method2657(7);
			local62 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
			if (local62 == 1) {
				Static158.anIntArray179[Static17.anInt300++] = 2047;
			}
			@Pc(178) int local178 = Static237.aClass1_Sub14_Sub1_7.method2657(7);
			@Pc(183) int local183 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
			Static295.anInt5586 = Static237.aClass1_Sub14_Sub1_7.method2657(2);
			Static229.aClass22_Sub3_Sub2_2.method3661(local52, local178, local183 == 1);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[B)Lclient!kc;")
	public static Class1_Sub1_Sub12 method1241(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(27) Class1_Sub1_Sub12 local27;
		if (Static291.aBoolean404) {
			local27 = new Class1_Sub1_Sub12_Sub1(arg0, Static201.anIntArray327, Static148.anIntArray242, Static134.anIntArray220, Static255.anIntArray450, Static255.aByteArrayArray15);
		} else {
			local27 = new Class1_Sub1_Sub12_Sub2(arg0, Static201.anIntArray327, Static148.anIntArray242, Static134.anIntArray220, Static255.anIntArray450, Static255.aByteArrayArray15);
		}
		Static295.method4395();
		return local27;
	}
}
