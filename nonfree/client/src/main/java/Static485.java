import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Lclient!ada;")
	public static Class8 aClass8_56;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!qaa;")
	public static Class265 aClass265_1;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Lclient!vd;")
	public static Class353 aClass353_90;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static int anInt8403 = 500;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "[I")
	public static final int[] anIntArray526 = new int[5];

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_152 = new Class268(82, -1);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method7236() {
		@Pc(10) int local10 = Static348.aClass6_Sub22_19.aClass15_Sub10_2.method2360();
		if (local10 == 0) {
			Static312.aByteArrayArrayArray17 = null;
			Static107.method1754(0);
		} else if (local10 == 1) {
			Static627.method8753((byte) 0);
			Static107.method1754(512);
			if (Static197.aByteArrayArrayArray24 != null) {
				Static494.method7393();
			}
		} else {
			Static627.method8753((byte) (Static167.anInt3480 - 4 & 0xFF));
			Static107.method1754(2);
		}
		Static454.anInt8106 = Static175.anInt3636;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public static void method7238() {
		while (true) {
			if (Static456.aClass6_Sub40_Sub2_2.method8630(Static501.anInt8676) >= 15) {
				@Pc(14) int local14 = Static456.aClass6_Sub40_Sub2_2.method8619(15);
				if (local14 != 32767) {
					@Pc(21) boolean local21 = false;
					@Pc(28) Class6_Sub46 local28 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local14);
					@Pc(34) Class20_Sub2_Sub2_Sub1_Sub2 local34;
					if (local28 == null) {
						local34 = new Class20_Sub2_Sub2_Sub1_Sub2();
						local34.anInt5567 = local14;
						local28 = new Class6_Sub46(local34);
						Static347.aClass128_23.method3551((long) local14, local28);
						Static1.aClass6_Sub46Array5[Static273.anInt5420++] = local28;
						local21 = true;
					}
					local34 = local28.aClass20_Sub2_Sub2_Sub1_Sub2_1;
					Static483.anIntArray525[Static252.anInt5066++] = local14;
					local34.anInt5569 = Static430.anInt7816;
					if (local34.aClass247_1 != null && local34.aClass247_1.method6611()) {
						Static648.method9036(local34);
					}
					@Pc(88) int local88 = Static456.aClass6_Sub40_Sub2_2.method8619(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(103) int local103 = Static456.aClass6_Sub40_Sub2_2.method8619(3) + 4 << 11 & 0x3F7F;
					@Pc(108) int local108 = Static456.aClass6_Sub40_Sub2_2.method8619(1);
					if (local108 == 1) {
						Static73.anIntArray110[Static501.anInt8668++] = local14;
					}
					@Pc(126) int local126 = Static456.aClass6_Sub40_Sub2_2.method8619(1);
					@Pc(131) int local131 = Static456.aClass6_Sub40_Sub2_2.method8619(5);
					if (local131 > 15) {
						local131 -= 32;
					}
					@Pc(142) int local142 = Static456.aClass6_Sub40_Sub2_2.method8619(2);
					local34.method4928(Static563.aClass346_2.method8199(Static456.aClass6_Sub40_Sub2_2.method8619(14)));
					local34.method4908(local34.aClass247_1.anInt7681);
					local34.anInt5544 = local34.aClass247_1.anInt7691 << 3;
					if (local21) {
						local34.method4920(true, local103);
					}
					local34.method4924(local142, local126 == 1, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray336[0] + local88, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anIntArray335[0] - -local131, local34.method4913());
					if (local34.aClass247_1.method6611()) {
						Static474.method7154((Class20_Sub2_Sub2_Sub1_Sub1) null, local34.anIntArray335[0], local34.anIntArray336[0], 0, local34, local34.aByte131, (Class312) null);
					}
					continue;
				}
			}
			Static456.aClass6_Sub40_Sub2_2.method8631();
			return;
		}
	}
}
