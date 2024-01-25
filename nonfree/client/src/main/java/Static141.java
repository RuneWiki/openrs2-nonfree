import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	public static final int anInt2667 = 52;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZ)I")
	public static int method2439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return 7 - arg1;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)V")
	public static void method2442(@OriginalArg(1) int arg0) {
		Static384.anIntArray26 = new int[arg0];
		Static309.anIntArray373 = new int[arg0];
		Static457.anIntArray475 = new int[arg0];
		Static676.anIntArray669 = new int[arg0];
		Static112.anIntArray151 = new int[arg0];
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method2446(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static2.method24();
		Static643.method8441();
		Static360.method5392();
		Static627.method8272(arg1, arg2, arg0);
		Static333.method5119();
		Static255.method4046(Static582.aClass16_12);
		Static254.method4040(Static582.aClass16_12);
		Static436.method6383(Static582.aClass16_12, Static235.aClass143_57);
		Static248.method3935();
		Static368.method5459(Static111.aClass102Array25);
		Static517.method7334();
		Static260.method4105();
		if (Static520.anInt6836 == 3) {
			Static482.method6863(4);
		} else if (Static520.anInt6836 == 7) {
			Static482.method6863(8);
		} else if (Static520.anInt6836 == 10) {
			Static482.method6863(11);
		} else if (Static520.anInt6836 == 1 || Static520.anInt6836 == 2) {
			Static200.method3155();
		}
	}
}
