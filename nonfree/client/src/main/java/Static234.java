import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!mn;")
	public static Class171 aClass171_52;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "F")
	public static float aFloat30 = 1024.0F;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_72 = new Class231("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!li", name = "w", descriptor = "I")
	public static int anInt3948 = 0;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	public static int anInt3949 = 104;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
	public static void method3190() {
		if (Static433.anInt7309 == 8) {
			Static274.method3920(4);
		} else if (Static433.anInt7309 == 4 || Static433.anInt7309 == 5) {
			Static274.method3920(2);
		} else if (Static433.anInt7309 == 11) {
			Static274.method3920(2);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!za;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method3191(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static29.aClass75_4 = arg0;
		Static399.anInt6981 = arg1;
		Static34.aClass6_1 = arg3;
		Static457.aBoolean511 = Static29.aClass75_4.method5994() > 0;
		Static308.anInt5540 = arg4 >> Static146.anInt2674;
		Static109.anInt1838 = arg6 >> Static146.anInt2674;
		Static268.anInt4658 = arg4;
		Static171.anInt5502 = arg6;
		Static22.anInt425 = arg5;
		Static152.anInt2787 = Static308.anInt5540 - Static30.anInt535;
		if (Static152.anInt2787 < 0) {
			Static381.anInt6602 = -Static152.anInt2787;
			Static152.anInt2787 = 0;
		} else {
			Static381.anInt6602 = 0;
		}
		Static371.anInt6494 = Static109.anInt1838 - Static30.anInt535;
		if (Static371.anInt6494 < 0) {
			Static186.anInt3293 = -Static371.anInt6494;
			Static371.anInt6494 = 0;
		} else {
			Static186.anInt3293 = 0;
		}
		Static352.anInt6218 = Static308.anInt5540 + Static30.anInt535;
		if (Static352.anInt6218 > Static212.anInt3636) {
			Static352.anInt6218 = Static212.anInt3636;
		}
		Static450.anInt7752 = Static109.anInt1838 + Static30.anInt535;
		if (Static450.anInt7752 > Static104.anInt1675) {
			Static450.anInt7752 = Static104.anInt1675;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static30.anInt535 + Static30.anInt535 + 2; local74++) {
			for (local77 = 0; local77 < Static30.anInt535 + Static30.anInt535 + 2; local77++) {
				local84 = Static308.anInt5540 + local74 - Static30.anInt535;
				local90 = Static109.anInt1838 + local77 - Static30.anInt535;
				if (local84 >= 0 && local90 >= 0 && local84 < Static212.anInt3636 && local90 < Static104.anInt1675) {
					@Pc(104) int local104 = local84 << Static146.anInt2674;
					@Pc(108) int local108 = local90 << Static146.anInt2674;
					@Pc(124) int local124 = Static114.aClass22Array2[Static114.aClass22Array2.length - 1].ua(local84, local90) - (0x3E8 << Static146.anInt2674 - 7);
					@Pc(144) int local144 = Static46.aClass22Array1 == null ? Static114.aClass22Array2[0].ua(local84, local90) + Static327.anInt5862 : Static46.aClass22Array1[0].ua(local84, local90) + Static327.anInt5862;
					Static150.aBooleanArrayArray20[local74][local77] = Static29.aClass75_4.VA(local104, local124, local108, local104, local144, local108);
				} else {
					Static150.aBooleanArrayArray20[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static30.anInt535 + Static30.anInt535 + 1; local77++) {
			for (local84 = 0; local84 < Static30.anInt535 + Static30.anInt535 + 1; local84++) {
				Static409.aBooleanArrayArray5[local77][local84] = Static150.aBooleanArrayArray20[local77][local84] || Static150.aBooleanArrayArray20[local77 + 1][local84] || Static150.aBooleanArrayArray20[local77][local84 + 1] || Static150.aBooleanArrayArray20[local77 + 1][local84 + 1];
			}
		}
		Static136.anIntArray210 = arg8;
		Static96.anIntArray108 = arg9;
		Static421.anIntArray582 = arg10;
		Static183.anIntArray266 = arg11;
		Static160.anIntArray251 = arg12;
		Static41.method626();
		Static117.method1915();
		for (@Pc(260) Class28_Sub5 local260 = (Class28_Sub5) Static393.aClass97_8.method2145(); local260 != null; local260 = (Class28_Sub5) Static393.aClass97_8.method2148()) {
			local260.method5916();
			Static56.method903(local260);
		}
		if (Static457.aBoolean511) {
			for (local90 = 0; local90 < Static439.anInt7384; local90++) {
				Static330.aClass38Array1[local90].method740(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static29.aClass75_4.method5974(0);
			if (Static45.aClass20_1 == null || Static45.aClass20_1 instanceof Class20_Sub2) {
				Static45.aClass20_1 = new Class20_Sub1();
			}
		} else if (Static45.aClass20_1 == null || Static45.aClass20_1 instanceof Class20_Sub1) {
			Static45.aClass20_1 = new Class20_Sub2();
		}
		Static45.aClass20_1.method5677(arg2);
		Static45.aClass20_1.method5682();
		if (Static317.aClass36ArrayArrayArray3 != null) {
			Static368.method6267(true);
			Static45.aClass20_1.method5678(22);
			Static286.method4050(arg2, null, 0, (byte) 0, arg15, arg16);
			Static45.aClass20_1.method5682();
			Static45.aClass20_1.method5678(23);
			Static368.method6267(false);
		}
		Static286.method4050(arg2, arg7, arg13, arg14, arg15, arg16);
		Static45.aClass20_1.method5682();
		Static45.aClass20_1.method5684();
		Static45.aClass20_1.method5682();
		if (arg2 > 1) {
			Static29.aClass75_4.method5954(0);
		}
		Static29.aClass75_4.method6018(0, null);
	}
}
