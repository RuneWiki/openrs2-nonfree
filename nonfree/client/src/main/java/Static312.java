import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public static int anInt5339;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
	public static int anInt5337 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILclient!je;)V")
	public static void method4635(@OriginalArg(1) Class117 arg0) {
		if (Static239.anInt4002 == arg0.anInt3102) {
			Static96.aBooleanArray9[arg0.anInt3038] = true;
		}
	}
}
