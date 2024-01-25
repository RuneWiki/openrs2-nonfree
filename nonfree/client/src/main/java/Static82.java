import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public static int anInt5145 = 0;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public static final int anInt5148 = 1400;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(III)I")
	public static int method4327(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static241.anIntArray546[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method4329() {
		@Pc(6) Class44 local6 = Static320.aClass44_43;
		synchronized (Static320.aClass44_43) {
			Static320.aClass44_43.method1348();
		}
	}
}
