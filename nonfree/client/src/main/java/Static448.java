import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!st", name = "v", descriptor = "I")
	public static int anInt7534;

	@OriginalMember(owner = "client!st", name = "w", descriptor = "J")
	public static volatile long aLong197 = 0L;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "()V")
	public static void method6439() {
		for (@Pc(1) int local1 = 0; local1 < Static375.anInt6600; local1++) {
			@Pc(6) Class47_Sub2 local6 = Static530.aClass47_Sub2Array3[local1];
			Static211.method3827(local6);
			Static530.aClass47_Sub2Array3[local1] = null;
		}
		Static375.anInt6600 = 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)I")
	public static int method6440(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
