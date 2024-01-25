import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!vt;")
	public static Class380 aClass380_5;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static int anInt8447 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!hw;Lclient!ha;ZZLclient!da;Ljava/lang/String;)V")
	public static void method7180(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class19 arg3, @OriginalArg(5) String arg4) {
		@Pc(12) boolean local12 = !Static636.aBoolean722 || Static487.method7082();
		if (!local12) {
			return;
		}
		@Pc(45) int local45;
		@Pc(54) int local54;
		if (Static636.aBoolean722 && local12) {
			@Pc(32) Class151 local32 = Static119.aClass151_3;
			@Pc(38) Class19 local38 = arg1.method7518(local32, Static602.aClass112Array1);
			local45 = local32.method3327(250, (Class9[]) null, arg4);
			local54 = local32.method3324(arg4, 250, local32.anInt3920, (Class9[]) null);
			@Pc(57) int local57 = Static445.aClass112_3.anInt2743;
			@Pc(61) int local61 = local57 + 4;
			local54 += local61 * 2;
			local45 += local61 * 2;
			if (local54 < Static381.anInt7650) {
				local54 = Static381.anInt7650;
			}
			if (local45 < Static579.anInt9555) {
				local45 = Static579.anInt9555;
			}
			@Pc(96) int local96 = Static176.aClass7_5.method247(Static365.anInt6242, local45) + Static490.anInt8335;
			@Pc(105) int local105 = Static255.aClass249_9.method6236(Static335.anInt5755, local54) + Static375.anInt6323;
			if (Static594.aBoolean693) {
				local96 += Static234.method3562();
				local105 += Static314.method4504();
			}
			arg1.method7488(Static45.aClass112_1, false).method8926(local96 + Static204.aClass112_2.anInt2743, Static204.aClass112_2.anInt2740 + local105, local45 - Static204.aClass112_2.anInt2743 * 2, local54 - Static204.aClass112_2.anInt2740 * 2, 1, 0, 0);
			arg1.method7488(Static204.aClass112_2, true).method8920(local96, local105);
			Static204.aClass112_2.method2320();
			arg1.method7488(Static204.aClass112_2, true).method8920(local45 + local96 - local57, local105);
			Static204.aClass112_2.method2321();
			arg1.method7488(Static204.aClass112_2, true).method8920(local96 + local45 - local57, local105 + local54 - local57);
			Static204.aClass112_2.method2320();
			arg1.method7488(Static204.aClass112_2, true).method8920(local96, local54 + local105 - local57);
			Static204.aClass112_2.method2321();
			arg1.method7488(Static445.aClass112_3, true).method8928(local96, local105 + Static204.aClass112_2.anInt2740, local57, local54 - Static204.aClass112_2.anInt2740 * 2);
			Static445.aClass112_3.method2316();
			arg1.method7488(Static445.aClass112_3, true).method8928(Static204.aClass112_2.anInt2743 + local96, local105, local45 - Static204.aClass112_2.anInt2743 * 2, local57);
			Static445.aClass112_3.method2316();
			arg1.method7488(Static445.aClass112_3, true).method8928(local96 + local45 - local57, Static204.aClass112_2.anInt2740 + local105, local57, local54 - Static204.aClass112_2.anInt2740 * 2);
			Static445.aClass112_3.method2316();
			arg1.method7488(Static445.aClass112_3, true).method8928(Static204.aClass112_2.anInt2743 + local96, local105 + local54 + -local57, local45 - Static204.aClass112_2.anInt2743 * 2, local57);
			Static445.aClass112_3.method2316();
			local38.method6326(local61 + local105, 0, 1, local61 + local96, 1, local45 - local61 * 2, local54 + -(local61 * 2), (Class9[]) null, arg4, Static318.anInt5395 | 0xFF000000, (Class1) null, -1, 0, 0, (int[]) null);
			Static94.method1546(local105, local54, local45, local96);
		} else {
			local45 = arg0.method3327(250, (Class9[]) null, arg4);
			local54 = arg0.method3330(250, arg4, (Class9[]) null) * 13;
			arg1.aa(6, 6, local45 + 4 + 4, local54 + 4 - -4, -16777216, 0);
			arg1.method7481(6, 6, local45 + 8, local54 + 4 - -4, -1, 0);
			arg3.method6326(10, 0, 1, 10, 1, local45, local54, (Class9[]) null, arg4, -1, (Class1) null, -1, 0, 0, (int[]) null);
			Static94.method1546(6, local54 + 8, local45 + 8, 6);
		}
		if (!arg2) {
			return;
		}
		try {
			if (Static594.aBoolean693) {
				Static375.method5344();
			} else {
				arg1.method7461();
			}
		} catch (@Pc(458) Exception_Sub1 local458) {
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method7182(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg0 ? Static418.aClass377_1.anInt10376 : Static418.aClass377_1.anInt10382);
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class6_Sub4_Sub13 local38 = Static418.aClass377_1.method8763(local31);
			if (local38.aBoolean508 && local38.method6582().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static123.aShortArray41 = null;
					Static403.anInt6786 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(74) short[] local74 = new short[local11.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
						local74[local76] = local11[local76];
					}
					local11 = local74;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static123.aShortArray41 = local11;
		Static277.anInt4792 = 0;
		Static403.anInt6786 = local13;
		@Pc(122) String[] local122 = new String[Static403.anInt6786];
		for (@Pc(124) int local124 = 0; local124 < Static403.anInt6786; local124++) {
			local122[local124] = Static418.aClass377_1.method8763(local11[local124]).method6582();
		}
		Static510.method7254(Static123.aShortArray41, local122);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)V")
	public static void method7183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(10) Class2_Sub7 local10 = (Class2_Sub7) Static214.aClass43_7.method1087(); local10 != null; local10 = (Class2_Sub7) Static214.aClass43_7.method1088()) {
			if (Static90.anInt1698 >= local10.anInt3617) {
				local10.method8436();
			} else {
				Static378.method6989(arg2 >> 1, arg0 >> 1, (local10.anInt3611 << 9) + 256, local10.anInt3613, local10.anInt3620 * 2, (local10.anInt3612 << 9) + 256);
				Static51.aClass19_4.method6328(arg3 + Static574.anIntArray632[1], local10.anInt3618 | 0xFF000000, local10.aString36, 0, arg1 + Static574.anIntArray632[0]);
			}
		}
	}
}
