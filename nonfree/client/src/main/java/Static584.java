import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!ur", name = "kb", descriptor = "[I")
	public static int[] anIntArray649;

	@OriginalMember(owner = "client!ur", name = "W", descriptor = "[I")
	public static final int[] anIntArray648 = new int[4];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZB)V")
	public static void method7988() {
		@Pc(14) Class2_Sub40 local14 = Static464.method6285(Static251.aClass131_1, Static567.aClass179_117);
		Static528.method7295(local14);
		for (@Pc(26) Class2_Sub9 local26 = (Class2_Sub9) Static606.aClass118_47.method2596(); local26 != null; local26 = (Class2_Sub9) Static606.aClass118_47.method2597()) {
			if (!local26.method8652()) {
				local26 = (Class2_Sub9) Static606.aClass118_47.method2596();
				if (local26 == null) {
					break;
				}
			}
			if (local26.anInt2172 == 0) {
				Static588.method8013(local26, true, true);
			}
		}
		if (Static11.aClass261_1 != null) {
			Static624.method8351(Static11.aClass261_1);
			Static11.aClass261_1 = null;
		}
	}
}
