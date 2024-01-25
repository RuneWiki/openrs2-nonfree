import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static217 {

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "Z")
	public static volatile boolean aBoolean340 = true;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZZI)V")
	public static void method3969(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static16.anInt229--;
			if (Static16.anInt229 == 0) {
				Static229.anIntArray228 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static279.anInt5095--;
		if (Static279.anInt5095 == 0) {
			Static123.anIntArray129 = null;
			return;
		}
	}
}
