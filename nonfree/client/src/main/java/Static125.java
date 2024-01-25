import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!faa", name = "S", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "(I)V")
	public static void method2133() {
		Static271.anInt5150 = Static97.aClass1_Sub6_Sub2_1.method3941();
		@Pc(13) int local13 = Static97.aClass1_Sub6_Sub2_1.method3914();
		@Pc(17) int local17 = Static97.aClass1_Sub6_Sub2_1.method3941();
		@Pc(26) boolean local26 = Static97.aClass1_Sub6_Sub2_1.method3912() == 1;
		@Pc(30) int local30 = Static97.aClass1_Sub6_Sub2_1.method3914();
		Static176.method2651();
		Static491.method6722(local17);
		Static97.aClass1_Sub6_Sub2_1.method3972();
		@Pc(44) int local44;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static459.anInt7799 >> 3; local44++) {
				for (@Pc(48) int local48 = 0; local48 < Static482.anInt7990 >> 3; local48++) {
					local55 = Static97.aClass1_Sub6_Sub2_1.method3976(1);
					if (local55 == 1) {
						Static178.anIntArrayArrayArray2[local40][local44][local48] = Static97.aClass1_Sub6_Sub2_1.method3976(26);
					} else {
						Static178.anIntArrayArrayArray2[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static97.aClass1_Sub6_Sub2_1.method3977();
		local44 = (Static405.anInt9105 - Static97.aClass1_Sub6_Sub2_1.anInt4555) / 16;
		Static13.anIntArrayArray4 = new int[local44][4];
		@Pc(136) int local136;
		for (local55 = 0; local55 < local44; local55++) {
			for (local136 = 0; local136 < 4; local136++) {
				Static13.anIntArrayArray4[local55][local136] = Static97.aClass1_Sub6_Sub2_1.method3925();
			}
		}
		Static324.aByteArrayArray16 = new byte[local44][];
		Static453.anIntArray725 = new int[local44];
		Static433.anIntArray716 = new int[local44];
		Static388.anIntArray681 = new int[local44];
		Static381.aByteArrayArray20 = null;
		Static226.anIntArray440 = null;
		Static529.aByteArrayArray32 = new byte[local44][];
		Static227.aByteArrayArray10 = new byte[local44][];
		Static449.aByteArrayArray27 = new byte[local44][];
		Static9.anIntArray23 = new int[local44];
		Static356.anIntArray641 = new int[local44];
		local44 = 0;
		for (local136 = 0; local136 < 4; local136++) {
			for (@Pc(199) int local199 = 0; local199 < Static459.anInt7799 >> 3; local199++) {
				for (@Pc(203) int local203 = 0; local203 < Static482.anInt7990 >> 3; local203++) {
					@Pc(213) int local213 = Static178.anIntArrayArrayArray2[local136][local199][local203];
					if (local213 != -1) {
						@Pc(223) int local223 = local213 >> 14 & 0x3FF;
						@Pc(229) int local229 = local213 >> 3 & 0x7FF;
						@Pc(240) int local240 = (local223 / 8 << 8) + (local229 / 8);
						for (@Pc(242) int local242 = 0; local242 < local44; local242++) {
							if (local240 == Static9.anIntArray23[local242]) {
								local240 = -1;
								break;
							}
						}
						if (local240 != -1) {
							Static9.anIntArray23[local44] = local240;
							@Pc(278) int local278 = local240 >> 8 & 0xFF;
							@Pc(282) int local282 = local240 & 0xFF;
							Static433.anIntArray716[local44] = Static223.aClass171_77.method4338("m" + local278 + "_" + local282);
							Static388.anIntArray681[local44] = Static223.aClass171_77.method4338("l" + local278 + "_" + local282);
							Static453.anIntArray725[local44] = Static223.aClass171_77.method4338("um" + local278 + "_" + local282);
							Static356.anIntArray641[local44] = Static223.aClass171_77.method4338("ul" + local278 + "_" + local282);
							local44++;
						}
					}
				}
			}
		}
		Static329.method5062(local30, local13, 10, local26);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "([IILclient!dg;[I[I)V")
	public static void method2134(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class49_Sub2_Sub2_Sub1 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg3.length; local8++) {
			@Pc(14) int local14 = arg3[local8];
			@Pc(18) int local18 = arg0[local8];
			@Pc(22) int local22 = arg2[local8];
			@Pc(24) int local24 = 0;
			while (local18 != 0 && local24 < arg1.aClass166Array3.length) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg1.aClass166Array3[local24] = null;
					} else {
						@Pc(48) Class199 local48 = Static182.aClass218_1.method5221(local14);
						@Pc(51) int local51 = local48.anInt5744;
						@Pc(56) Class166 local56 = arg1.aClass166Array3[local24];
						if (local56 != null) {
							if (local14 == local56.anInt4909) {
								if (local51 == 0) {
									local56 = arg1.aClass166Array3[local24] = null;
								} else if (local51 == 1) {
									local56.anInt4904 = 0;
									local56.anInt4905 = 1;
									local56.anInt4907 = 0;
									local56.anInt4911 = local22;
									local56.anInt4903 = 0;
									Static381.method5839(arg1.anInt7141, Static63.aClass49_Sub2_Sub2_Sub1_1 == arg1, local48, 0, arg1.aByte98, arg1.anInt7137);
								} else if (local51 == 2) {
									local56.anInt4907 = 0;
								}
							} else if (local48.anInt5750 >= Static182.aClass218_1.method5221(local56.anInt4909).anInt5750) {
								local56 = arg1.aClass166Array3[local24] = null;
							}
						}
						if (local56 == null) {
							local56 = arg1.aClass166Array3[local24] = new Class166();
							local56.anInt4911 = local22;
							local56.anInt4907 = 0;
							local56.anInt4903 = 0;
							local56.anInt4905 = 1;
							local56.anInt4909 = local14;
							local56.anInt4904 = 0;
							Static381.method5839(arg1.anInt7141, arg1 == Static63.aClass49_Sub2_Sub2_Sub1_1, local48, 0, arg1.aByte98, arg1.anInt7137);
						}
					}
				}
				local24++;
				local18 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "j", descriptor = "(I)V")
	public static void method2135() {
		Static479.method7105();
		Static487.aClass122_8 = null;
		Static181.aClass45_3 = null;
		Static104.aClass45_2 = null;
		Static251.aClass283ArrayArray1 = null;
		Static5.aClass45_1 = null;
	}
}
