import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static595 {

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Lclient!db;")
	public static final Class64 aClass64_492 = new Class64(78, 10);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)Z")
	public static boolean method8009(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static554.method7655(arg0, arg1) & Static521.method7302(arg0, arg1);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!ee;B)Z")
	public static boolean method8010(@OriginalArg(0) Class86 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean218) {
			return false;
		} else if (!arg0.method2406(Static392.anInterface1_2)) {
			return false;
		} else if (Static552.aClass183_40.method4289((long) arg0.anInt2711) == null) {
			return Static363.aClass183_26.method4289((long) arg0.anInt2697) == null;
		} else {
			return false;
		}
	}
}
