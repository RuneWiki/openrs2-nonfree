import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
	public static int anInt1226;

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "[I")
	public static final int[] anIntArray128 = new int[200];

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)V")
	public static void method1091() {
		if (Static642.aClass26_39 == null) {
			return;
		}
		if (Static642.aClass26_39.anInt762 == 1) {
			Static642.aClass26_39 = null;
			return;
		}
		if (Static642.aClass26_39.anInt762 == 2) {
			Static607.method8296(Static440.aClass359_5, 2, Static531.aString81);
			Static642.aClass26_39 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZI)V")
	public static void method1092(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub5_Sub10 local13 = Static594.method8175(arg0, 3);
		local13.method4387();
	}
}
