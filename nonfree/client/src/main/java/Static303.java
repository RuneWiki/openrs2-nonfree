import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!paa;)V")
	public static void method4175(@OriginalArg(1) Class261 arg0) {
		if (Static283.anInt7445 != arg0.anInt6573) {
			return;
		}
		if (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50 == null) {
			arg0.anInt6593 = 0;
			arg0.anInt6576 = 0;
			return;
		}
		arg0.anInt6644 = 150;
		arg0.anInt6667 = (int) (Math.sin((double) Static262.anInt5597 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt6634 = 5;
		arg0.anInt6576 = Static528.anInt8672;
		arg0.anInt6593 = Static435.method2764(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aString50);
		arg0.anInt6578 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4553;
		arg0.anInt6581 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4628;
		arg0.anInt6636 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4621;
		arg0.anInt6597 = 0;
		@Pc(71) Class81 local71 = arg0.anInt6578 == -1 ? null : Static540.aClass173_2.method3791(arg0.anInt6578);
		if (local71 != null) {
			Static350.method4702(arg0.anInt6581, local71);
		}
	}
}
