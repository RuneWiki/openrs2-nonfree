import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Z")
	public static boolean aBoolean22;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "Lclient!wa;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "Lclient!im;")
	public static final Class140 aClass140_8 = new Class140(30, 12);

	@OriginalMember(owner = "client!ao", name = "o", descriptor = "Lclient!dh;")
	public static final Class64 aClass64_3 = new Class64("", 11);

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZZ)V")
	public static void method500(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static467.anInt7880++;
			Static168.method4652();
		}
		if (arg0) {
			Static452.anInt7735++;
			Static228.method3982();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method501() {
		for (@Pc(6) Class1_Sub10 local6 = (Class1_Sub10) Static237.aClass37_49.method977(); local6 != null; local6 = (Class1_Sub10) Static237.aClass37_49.method971()) {
			if (local6.aBoolean74) {
				local6.method1182();
			}
		}
		for (@Pc(32) Class1_Sub10 local32 = (Class1_Sub10) Static487.aClass37_88.method977(); local32 != null; local32 = (Class1_Sub10) Static487.aClass37_88.method971()) {
			if (local32.aBoolean74) {
				local32.method1182();
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILclient!jq;)V")
	public static void method503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class156 arg2) {
		Static421.anInt7340 = arg0;
		Static3.anInt79 = arg1;
		Static430.aClass156_15 = arg2;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	public static void method504(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static97.aClass1_Sub6_Sub2_1.method3980(Static405.anInt9105) >= 15) {
				@Pc(18) int local18 = Static97.aClass1_Sub6_Sub2_1.method3976(15);
				if (local18 != 32767) {
					@Pc(25) boolean local25 = false;
					@Pc(32) Class1_Sub17 local32 = (Class1_Sub17) Static380.aClass17_29.method738((long) local18);
					@Pc(38) Class49_Sub2_Sub2_Sub2 local38;
					if (local32 == null) {
						local38 = new Class49_Sub2_Sub2_Sub2();
						local38.anInt4295 = local18;
						local32 = new Class1_Sub17(local38);
						Static380.aClass17_29.method737(local32, (long) local18);
						local25 = true;
						Static177.aClass1_Sub17Array3[Static350.anInt6254++] = local32;
					}
					local38 = local32.aClass49_Sub2_Sub2_Sub2_2;
					Static427.anIntArray711[Static157.anInt4503++] = local18;
					local38.anInt4300 = Static436.anInt6850;
					if (local38.aClass196_1 != null && local38.aClass196_1.method4863()) {
						Static523.method7179(local38);
					}
					@Pc(92) int local92 = Static97.aClass1_Sub6_Sub2_1.method3976(1);
					local38.method3802(Static538.aClass242_2.method5833(Static97.aClass1_Sub6_Sub2_1.method3976(14)));
					@Pc(115) int local115 = (Static97.aClass1_Sub6_Sub2_1.method3976(3) + 4 & 0xBE800007) << 11;
					@Pc(120) int local120 = Static97.aClass1_Sub6_Sub2_1.method3976(2);
					@Pc(125) int local125 = Static97.aClass1_Sub6_Sub2_1.method3976(1);
					if (local125 == 1) {
						Static344.anIntArray616[Static545.anInt9167++] = local18;
					}
					@Pc(145) int local145;
					if (arg0) {
						local145 = Static97.aClass1_Sub6_Sub2_1.method3976(8);
						if (local145 > 127) {
							local145 -= 256;
						}
					} else {
						local145 = Static97.aClass1_Sub6_Sub2_1.method3976(5);
						if (local145 > 15) {
							local145 -= 32;
						}
					}
					@Pc(169) int local169;
					if (arg0) {
						local169 = Static97.aClass1_Sub6_Sub2_1.method3976(8);
						if (local169 > 127) {
							local169 -= 256;
						}
					} else {
						local169 = Static97.aClass1_Sub6_Sub2_1.method3976(5);
						if (local169 > 15) {
							local169 -= 32;
						}
					}
					local38.method3793(local38.aClass196_1.anInt5718);
					local38.anInt4270 = local38.aClass196_1.anInt5710 << 3;
					if (local25) {
						local38.method3784(local115, true);
					}
					local38.method3808(Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0] + local169, Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0] - -local145, local92 == 1, local38.method3788(), local120);
					if (local38.aClass196_1.method4863()) {
						Static174.method2614(local38.aByte98, 0, local38, local38.anIntArray427[0], null, null, local38.anIntArray428[0]);
					}
					continue;
				}
			}
			Static97.aClass1_Sub6_Sub2_1.method3977();
			return;
		}
	}
}
