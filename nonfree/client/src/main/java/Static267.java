import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	public static int anInt4121 = 0;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString204 = "Loaded interfaces";

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!pa;ZLclient!pa;ZII)I")
	public static int method3344(@OriginalArg(1) Class132_Sub1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class132_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static144.method2547(arg0, arg2, arg5, arg1);
		if (local15 != 0) {
			return arg1 ? -local15 : local15;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(36) int local36 = Static144.method2547(arg0, arg2, arg4, arg3);
			return arg3 ? -local36 : local36;
		}
	}
}
