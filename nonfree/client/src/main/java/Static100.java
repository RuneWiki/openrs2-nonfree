import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	public static int anInt5565;

	@OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
	public static int anInt5569;

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "Lclient!ui;")
	public static Class175 aClass175_44 = new Class175(260);

	@OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
	public static int anInt5570 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public static void method4618(@OriginalArg(1) boolean arg0) {
		Static222.aBoolean378 = arg0;
		@Pc(77) boolean local77;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(44) int local44;
		@Pc(83) int local83;
		@Pc(158) int local158;
		@Pc(175) int local175;
		@Pc(192) int local192;
		if (!Static222.aBoolean378) {
			local17 = Static10.aClass1_Sub13_Sub1_117.method1879();
			local21 = Static10.aClass1_Sub13_Sub1_117.method1856();
			local29 = (Static5.anInt204 - Static10.aClass1_Sub13_Sub1_117.anInt2018) / 16;
			Static16.anIntArrayArray1 = new int[local29][4];
			for (local35 = 0; local35 < local29; local35++) {
				for (local44 = 0; local44 < 4; local44++) {
					Static16.anIntArrayArray1[local35][local44] = Static10.aClass1_Sub13_Sub1_117.method1860();
				}
			}
			local35 = Static10.aClass1_Sub13_Sub1_117.method1856();
			local44 = Static10.aClass1_Sub13_Sub1_117.method1867();
			local77 = Static31.method537(Static10.aClass1_Sub13_Sub1_117.method1849());
			local83 = Static10.aClass1_Sub13_Sub1_117.method1879();
			Static8.anIntArray20 = new int[local29];
			Static53.anIntArray91 = new int[local29];
			Static186.aByteArrayArray13 = new byte[local29][];
			Static246.anIntArray501 = null;
			Static135.anIntArray209 = new int[local29];
			Static120.aByteArrayArray8 = new byte[local29][];
			Static295.aByteArrayArray21 = new byte[local29][];
			Static110.aByteArrayArray7 = null;
			Static172.aByteArrayArray11 = new byte[local29][];
			@Pc(111) boolean local111 = false;
			Static98.anIntArray146 = new int[local29];
			Static44.anIntArray78 = new int[local29];
			if ((local21 / 8 == 48 || local21 / 8 == 49) && local17 / 8 == 48) {
				local111 = true;
			}
			local29 = 0;
			if (local21 / 8 == 48 && local17 / 8 == 148) {
				local111 = true;
			}
			for (local158 = (local21 - 6) / 8; local158 <= (local21 + 6) / 8; local158++) {
				for (local175 = (local17 - 6) / 8; local175 <= (local17 + 6) / 8; local175++) {
					local192 = local175 + (local158 << 8);
					if (local111 && (local175 == 49 || local175 == 149 || local175 == 147 || local158 == 50 || local158 == 49 && local175 == 47)) {
						Static135.anIntArray209[local29] = local192;
						Static8.anIntArray20[local29] = -1;
						Static98.anIntArray146[local29] = -1;
						Static53.anIntArray91[local29] = -1;
						Static44.anIntArray78[local29] = -1;
					} else {
						Static135.anIntArray209[local29] = local192;
						Static8.anIntArray20[local29] = Static67.aClass119_20.method3241("m" + local158 + "_" + local175);
						Static98.anIntArray146[local29] = Static67.aClass119_20.method3241("l" + local158 + "_" + local175);
						Static53.anIntArray91[local29] = Static67.aClass119_20.method3241("um" + local158 + "_" + local175);
						Static44.anIntArray78[local29] = Static67.aClass119_20.method3241("ul" + local158 + "_" + local175);
					}
					local29++;
				}
			}
			Static131.method2287(local44, local21, false, local35, local77, local17, local83);
			return;
		}
		local77 = Static31.method537(Static10.aClass1_Sub13_Sub1_117.method1849());
		local17 = Static10.aClass1_Sub13_Sub1_117.method1856();
		local21 = Static10.aClass1_Sub13_Sub1_117.method1845();
		local29 = Static10.aClass1_Sub13_Sub1_117.method1856();
		local35 = Static10.aClass1_Sub13_Sub1_117.method1870();
		Static10.aClass1_Sub13_Sub1_117.method1892();
		@Pc(377) int local377;
		for (local44 = 0; local44 < 4; local44++) {
			for (local83 = 0; local83 < 13; local83++) {
				for (local377 = 0; local377 < 13; local377++) {
					local158 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
					if (local158 == 1) {
						Static291.anIntArrayArrayArray14[local44][local83][local377] = Static10.aClass1_Sub13_Sub1_117.method1883(26);
					} else {
						Static291.anIntArrayArrayArray14[local44][local83][local377] = -1;
					}
				}
			}
		}
		Static10.aClass1_Sub13_Sub1_117.method1890();
		local44 = (Static5.anInt204 - Static10.aClass1_Sub13_Sub1_117.anInt2018) / 16;
		Static16.anIntArrayArray1 = new int[local44][4];
		for (local83 = 0; local83 < local44; local83++) {
			for (local377 = 0; local377 < 4; local377++) {
				Static16.anIntArrayArray1[local83][local377] = Static10.aClass1_Sub13_Sub1_117.method1860();
			}
		}
		local83 = Static10.aClass1_Sub13_Sub1_117.method1844();
		Static110.aByteArrayArray7 = null;
		Static53.anIntArray91 = new int[local44];
		Static186.aByteArrayArray13 = new byte[local44][];
		Static295.aByteArrayArray21 = new byte[local44][];
		Static44.anIntArray78 = new int[local44];
		Static120.aByteArrayArray8 = new byte[local44][];
		Static172.aByteArrayArray11 = new byte[local44][];
		Static98.anIntArray146 = new int[local44];
		Static8.anIntArray20 = new int[local44];
		Static246.anIntArray501 = null;
		Static135.anIntArray209 = new int[local44];
		local44 = 0;
		for (local377 = 0; local377 < 4; local377++) {
			for (local158 = 0; local158 < 13; local158++) {
				for (local175 = 0; local175 < 13; local175++) {
					local192 = Static291.anIntArrayArrayArray14[local377][local158][local175];
					if (local192 != -1) {
						@Pc(538) int local538 = local192 >> 14 & 0x3FF;
						@Pc(544) int local544 = local192 >> 3 & 0x7FF;
						@Pc(555) int local555 = (local538 / 8 << 8) + (local544 / 8);
						@Pc(557) int local557;
						for (local557 = 0; local557 < local44; local557++) {
							if (local555 == Static135.anIntArray209[local557]) {
								local555 = -1;
								break;
							}
						}
						if (local555 != -1) {
							Static135.anIntArray209[local44] = local555;
							local557 = local555 >> 8 & 0xFF;
							@Pc(593) int local593 = local555 & 0xFF;
							Static8.anIntArray20[local44] = Static67.aClass119_20.method3241("m" + local557 + "_" + local593);
							Static98.anIntArray146[local44] = Static67.aClass119_20.method3241("l" + local557 + "_" + local593);
							Static53.anIntArray91[local44] = Static67.aClass119_20.method3241("um" + local557 + "_" + local593);
							Static44.anIntArray78[local44] = Static67.aClass119_20.method3241("ul" + local557 + "_" + local593);
							local44++;
						}
					}
				}
			}
		}
		Static131.method2287(local21, local83, false, local35, local77, local17, local29);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4620(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(11) int local11 = arg0.indexOf(arg1); local11 != -1; local11 = arg0.indexOf(arg1, local11 + arg2.length())) {
			arg0 = arg0.substring(0, local11) + arg2 + arg0.substring(arg1.length() + local11);
		}
		return arg0;
	}
}
