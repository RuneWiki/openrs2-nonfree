import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public static void method2555(@OriginalArg(1) int arg0) {
		Static346.anInt6299 = arg0;
		@Pc(11) Class5 local11 = Static142.aClass5_26;
		synchronized (Static142.aClass5_26) {
			Static142.aClass5_26.method116();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public static void method2556() {
		if (Static183.aClass33_4 != null) {
			Static183.aClass33_4.method3050();
		}
		if (Static14.aClass33_1 != null) {
			Static14.aClass33_1.method3050();
		}
	}
}
