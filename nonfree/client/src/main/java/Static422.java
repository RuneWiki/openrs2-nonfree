import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static422 {

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "[S")
	public static short[] aShortArray125 = new short[256];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BI)V")
	public static void method6222(@OriginalArg(1) int arg0) {
		if (Static293.anInt5245 == 1) {
			Static194.anInt3395 = arg0;
		} else if (Static293.anInt5245 == 2) {
			Static249.anInt8065 = arg0;
		}
	}
}
