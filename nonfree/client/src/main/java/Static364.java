import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!s", name = "n", descriptor = "Lclient!pc;")
	public static Class195 aClass195_3;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_38 = new Class181();

	@OriginalMember(owner = "client!s", name = "q", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_156 = new Class25(57, 8);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "([[BLclient!hd;Z)V")
	public static void method5125(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class107_Sub1 arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.anInt2740; local11++) {
			Static230.method3117();
			for (@Pc(17) int local17 = 0; local17 < Static234.anInt3949 >> 3; local17++) {
				for (@Pc(21) int local21 = 0; local21 < Static371.anInt6492 >> 3; local21++) {
					@Pc(31) int local31 = Static111.anIntArrayArrayArray4[local11][local17][local21];
					if (local31 != -1) {
						@Pc(40) int local40 = local31 >> 24 & 0x3;
						if (!arg1.aBoolean171 || local40 == 0) {
							@Pc(51) int local51 = local31 >> 1 & 0x3;
							@Pc(57) int local57 = local31 >> 14 & 0x3FF;
							@Pc(63) int local63 = local31 >> 3 & 0x7FF;
							@Pc(73) int local73 = local63 / 8 + (local57 / 8 << 8);
							for (@Pc(75) int local75 = 0; local75 < Static450.anIntArray635.length; local75++) {
								if (Static450.anIntArray635[local75] == local73 && arg0[local75] != null) {
									arg1.method2284(local11, local21 * 8, Static257.aClass75_8, (local63 & 0x7) * 8, arg0[local75], (local57 & 0x7) * 8, Static89.aClass225Array2, local51, local17 * 8, local40);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!gh;Z)V")
	public static void method5127(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static377.anInt6585 >= 400) {
			return;
		}
		if (Static127.aClass11_Sub5_Sub2_Sub1_2 != arg0) {
			@Pc(178) String local178;
			@Pc(103) int local103;
			if (arg0.anInt2408 == 0) {
				@Pc(52) boolean local52 = true;
				if (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2404 != -1 && arg0.anInt2404 != -1) {
					@Pc(77) int local77 = arg0.anInt2410 < Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410 ? Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410 : arg0.anInt2410;
					@Pc(92) int local92 = arg0.anInt2404 <= Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2404 ? arg0.anInt2404 : Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2404;
					local103 = local77 * 10 / 100 + local92 + 5;
					@Pc(110) int local110 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410 - arg0.anInt2410;
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local103 < local110) {
						local52 = false;
					}
				}
				@Pc(139) String local139 = Static10.aClass200_1 == Static201.aClass200_4 ? Static10.aClass231_2.method5261(Static80.anInt6195) : Static300.aClass231_94.method5261(Static80.anInt6195);
				if (arg0.anInt2414 <= arg0.anInt2410) {
					local178 = arg0.method2112() + (local52 ? Static195.method2781(Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410, arg0.anInt2410) : "<col=ffffff>") + " (" + local139 + arg0.anInt2410 + ")";
				} else {
					local178 = arg0.method2112() + (local52 ? Static195.method2781(Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410, arg0.anInt2410) : "<col=ffffff>") + " (" + local139 + arg0.anInt2410 + "+" + (arg0.anInt2414 - arg0.anInt2410) + ")";
				}
			} else {
				local178 = arg0.method2112() + " (" + Static234.aClass231_72.method5261(Static80.anInt6195) + arg0.anInt2408 + ")";
			}
			if (Static11.aBoolean7) {
				if (!arg1 && (Static331.anInt5940 & 0x8) != 0) {
					Static202.method2833((long) arg0.anInt7670, 0, true, false, Static359.aString66 + " -> <col=ffffff>" + local178, -1, 0, Static88.aString38, 49, Static252.anInt4355);
				}
			} else if (arg1) {
				Static202.method2833(0L, 0, false, true, "", 0, 0, "<col=cccccc>" + local178, -1, -1);
			} else {
				for (@Pc(291) int local291 = 7; local291 >= 0; local291--) {
					if (Static206.aStringArray42[local291] != null) {
						@Pc(299) short local299 = 0;
						if (Static183.aClass200_3 == Static10.aClass200_1 && Static206.aStringArray42[local291].equalsIgnoreCase(Static349.aClass231_110.method5261(Static80.anInt6195))) {
							if (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2410 < arg0.anInt2410) {
								local299 = 2000;
							}
							if (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2413 != 0 && arg0.anInt2413 != 0) {
								if (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt2413 == arg0.anInt2413) {
									local299 = 2000;
								} else {
									local299 = 0;
								}
							}
						} else if (Static192.aBooleanArray13[local291]) {
							local299 = 2000;
						}
						@Pc(353) short local353 = (short) (local299 + Static350.aShortArray87[local291]);
						local103 = Static67.anIntArray86[local291] == -1 ? Static385.anInt6687 : Static67.anIntArray86[local291];
						Static202.method2833((long) arg0.anInt7670, 0, true, false, "<col=ffffff>" + local178, -1, 0, Static206.aStringArray42[local291], local353, local103);
					}
				}
			}
			if (!arg1) {
				for (@Pc(432) Class2_Sub35 local432 = (Class2_Sub35) Static93.aClass181_7.method3972(); local432 != null; local432 = (Class2_Sub35) Static93.aClass181_7.method3975()) {
					if (local432.anInt5875 == 47) {
						local432.aString61 = "<col=ffffff>" + local178;
						return;
					}
				}
			}
		} else if (Static11.aBoolean7 && (Static331.anInt5940 & 0x10) != 0) {
			Static202.method2833(0L, 0, true, false, Static359.aString66 + " -> <col=ffffff>" + Static93.aClass231_30.method5261(Static80.anInt6195), -1, 0, Static88.aString38, 46, Static252.anInt4355);
		}
	}
}
