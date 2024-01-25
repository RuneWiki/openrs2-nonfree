import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "I")
	public static int anInt10147;

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_59 = new Class264(10);

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZII)Z")
	public static boolean method8442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!vn;IIIIIILclient!vn;II)V")
	public static void method8443(@OriginalArg(0) Class12_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class12_Sub2_Sub2_Sub1 arg5, @OriginalArg(8) int arg6) {
		@Pc(9) int local9 = arg0.method2421();
		if (local9 == -1) {
			return;
		}
		@Pc(28) Class20 local28 = (Class20) Static433.aClass264_61.method6367((long) local9);
		if (local28 == null) {
			@Pc(35) Class356[] local35 = Static688.method8628(Static666.aClass386_141, local9);
			if (local35 == null) {
				return;
			}
			local28 = Static677.aClass137_47.method7951(local35[0], true);
			Static433.aClass264_61.method6364((long) local9, local28);
		}
		Static210.method3320(arg5.anInt10998, arg4 >> 1, arg5.anInt11002, arg5.aByte146, 0, arg5.method2422() * 256, arg2 >> 1);
		@Pc(82) int local82 = arg3 + Static599.anIntArray449[0] - 18;
		@Pc(92) int local92 = Static599.anIntArray449[1] + arg1 - 16 - 54;
		@Pc(100) int local100 = local82 + arg6 / 4 * 18;
		@Pc(108) int local108 = local92 + arg6 % 4 * 18;
		local28.method7399(local100, local108);
		if (arg0 == arg5) {
			Static677.aClass137_47.method7941(18, local100 - 1, -256, local108 - 1, 18);
		}
		Static357.method5407(local100 - 1, local108 - 1, local108 + 18, local100 + 18);
		@Pc(144) Class12_Sub9 local144 = Static505.method7391();
		local144.anInt7203 = local108 + 16;
		local144.aClass12_Sub2_Sub2_Sub1_1 = arg0;
		local144.anInt7200 = local100;
		local144.anInt7202 = local100 + 16;
		local144.anInt7201 = local108;
		Static532.aClass376_8.method9011(local144);
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(B)Z")
	public static boolean method8445() {
		return Static527.aBoolean641;
	}

	@OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
	public static void method8448() {
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_2, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_2, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub27_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub22_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub4_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub19_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub10_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub1_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub28_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub18_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub8_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub17_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_2, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub16_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub3_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub29_1, 0);
		Static61.method1233();
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub23_1, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub11_1, 2);
		Static221.method6306();
		Static677.method9300();
		Static6.aBoolean3 = true;
	}
}
