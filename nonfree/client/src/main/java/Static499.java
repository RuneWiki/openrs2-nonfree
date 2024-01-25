import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array18;

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
	public static int anInt8643;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
	public static void method7443() {
		@Pc(5) int local5 = 0;
		if (Static348.aClass6_Sub22_19.aClass15_Sub1_1.method331() == 1) {
			local5 = 55;
		}
		if (Static348.aClass6_Sub22_19.aClass15_Sub27_1.method8659() == 0) {
			local5 |= 0x40;
		}
		Static15.method5156(local5);
		Static283.aClass210_2.method5639(local5);
		Static266.aClass138_1.method3728(local5);
		Static563.aClass346_2.method8200(local5);
		Static436.aClass292_2.method7394(local5);
		Static472.method7140(local5);
		Static594.method8353(local5);
		Static119.method1975(local5);
		Static333.method8036(local5);
		Static348.method5622();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILclient!vt;)V")
	public static void method7444(@OriginalArg(1) Class6_Sub40_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static26.anInt506; local7++) {
			@Pc(13) int local13 = Static87.anIntArray119[local7];
			@Pc(17) Class20_Sub2_Sub2_Sub1_Sub1 local17 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local13];
			@Pc(23) int local23 = arg0.method8604();
			if ((local23 & 0x4) != 0) {
				local23 += arg0.method8604() << 8;
			}
			if ((local23 & 0x400) != 0) {
				local23 += arg0.method8604() << 16;
			}
			Static610.method8507(local17, local23, arg0, local13);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(BI)Lclient!cha;")
	public static Class51_Sub1 method7445(@OriginalArg(1) int arg0) {
		return Static224.aBoolean311 && Static550.anInt9388 <= arg0 && Static320.anInt6122 >= arg0 ? Static231.aClass51_Sub1Array2[arg0 - Static550.anInt9388] : null;
	}
}
