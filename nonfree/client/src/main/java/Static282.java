import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
	public static int anInt4836;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
	public static int anInt4837 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!ns;I)V")
	public static void method4111(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg1) {
		if (arg1.anIntArray296 == null) {
			return;
		}
		@Pc(17) int local17 = arg1.anIntArray296[arg0 + 1];
		if (arg1.anInt5077 == local17) {
			return;
		}
		arg1.anInt5090 = 0;
		arg1.anInt5120 = arg1.anInt5119;
		arg1.anInt5115 = 0;
		arg1.anInt5077 = local17;
		arg1.anInt5049 = 1;
		arg1.anInt5054 = 0;
		if (arg1.anInt5077 != -1) {
			Static658.method8966(arg1, arg1.anInt5115, Static334.aClass268_2.method6469(arg1.anInt5077));
			return;
		}
	}
}
