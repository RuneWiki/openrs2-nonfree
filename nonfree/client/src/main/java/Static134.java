import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "[I")
	public static int[] anIntArray239;

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
	public static int anInt2799;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IFIZIIII)[I")
	public static int[] method2690(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub2_Sub28 local10 = new Class2_Sub2_Sub28();
		local10.anInt4643 = 8;
		local10.anInt4660 = 4;
		local10.anInt4659 = 8;
		local10.anInt4648 = (int) (arg0 * 4096.0F);
		local10.aBoolean424 = true;
		local10.anInt4646 = 35;
		local10.method5877();
		Static102.method2280(1, 2048);
		local10.method4173(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)V")
	public static void method2691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static74.aClass2_Sub10_Sub1_2.method2049(155);
		}
		if (arg1 == 1) {
			Static74.aClass2_Sub10_Sub1_2.method2049(234);
		}
		Static74.aClass2_Sub10_Sub1_2.method4435(arg2 + Static342.anInt6864);
		Static74.aClass2_Sub10_Sub1_2.method4459(arg0 + Static138.anInt2879);
		Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
		Static116.anInt2576 = arg2;
		Static264.aBoolean487 = false;
		Static201.anInt3909 = arg0;
		Static271.method4898();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!tq;Z)V")
	public static void method2692(@OriginalArg(0) Class191 arg0) {
		Static339.aClass191_217 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)V")
	public static void method2693(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = Static212.anInt4090 - Static40.anInt799;
		if (local8 >= 100) {
			Static182.anInt3602 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static331.aFloat43;
		if (Static152.anInt3112 >> 8 > local17) {
			local17 = Static152.anInt3112 >> 8;
		}
		if (Static171.aBooleanArray16[4] && local17 < Static6.anIntArray5[4] + 128) {
			local17 = Static6.anIntArray5[4] + 128;
		}
		@Pc(54) int local54 = Static102.anInt2330 + (int) Static92.aFloat28 & 0x3FFF;
		Static168.method3165(local54, local17, arg0, Static321.anInt6465, (local17 >> 3) * 3 + 600, Static138.method2745(Static182.anInt3603, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280) + -50, Static97.anInt6858);
		@Pc(95) float local95 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static163.anInt1495 = (int) ((float) Static156.anInt3174 + (float) (Static163.anInt1495 - Static156.anInt3174) * local95);
		Static290.anInt5837 = (int) (local95 * (float) (Static290.anInt5837 - Static89.anInt2007) + (float) Static89.anInt2007);
		Static287.anInt5819 = (int) (local95 * (float) (Static287.anInt5819 - Static130.anInt4898) + (float) Static130.anInt4898);
		Static283.anInt5723 = (int) ((float) Static312.anInt6300 + (float) (Static283.anInt5723 - Static312.anInt6300) * local95);
		@Pc(152) int local152 = Static291.anInt5883 - Static77.anInt1695;
		if (local152 > 8192) {
			local152 -= 16384;
		} else if (local152 < -8192) {
			local152 += 16384;
		}
		Static291.anInt5883 = (int) (local95 * (float) local152 + (float) Static77.anInt1695);
		Static291.anInt5883 &= 0x3FFF;
	}
}
