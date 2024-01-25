import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sm", name = "B", descriptor = "[I")
	public static final int[] anIntArray494 = new int[4096];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IJ)V")
	public static void method5214(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static219.method3250(arg0 - 1L);
			Static219.method3250(1L);
		} else {
			Static219.method3250(arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V")
	public static void method5216() {
		@Pc(5) int local5 = 0;
		if (Static327.aClass230_Sub1_1.method5639(Static146.anInt2664)) {
			local5 = 55;
		}
		if (!Static327.aClass230_Sub1_1.aBoolean617) {
			local5 |= 0x40;
		}
		Static106.method1705(local5);
		Static251.aClass207_2.method4982(local5);
		Static388.aClass193_3.method4246(local5);
		Static268.aClass26_1.method432(local5);
		Static294.aClass125_2.method2965(local5);
		Static116.method1803(local5);
		Static289.method3980(local5);
		Static238.method3493(local5);
		Static203.method1673(local5);
		if (Static40.anInt629 == 10) {
			Static169.method2637(28);
		} else if (Static40.anInt629 == 30) {
			Static169.method2637(25);
		}
	}
}
