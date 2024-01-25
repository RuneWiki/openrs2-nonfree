import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kg", name = "F", descriptor = "Lclient!mq;")
	public static Class71 aClass71_10;

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "Lclient!rl;")
	public static final Class320 aClass320_4 = new Class320();

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "I")
	public static int anInt5608 = -1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ha;Lclient!hca;)I")
	public static int method5089(@OriginalArg(1) Class101 arg0, @OriginalArg(2) Class137 arg1) {
		if (arg1.anInt4434 != -1) {
			return arg1.anInt4434;
		}
		if (arg1.anInt4432 != -1) {
			@Pc(28) Class136 local28 = arg0.anInterface3_12.method1941(arg1.anInt4432);
			if (!local28.aBoolean329) {
				return local28.aShort48;
			}
		}
		return arg1.anInt4435;
	}
}
