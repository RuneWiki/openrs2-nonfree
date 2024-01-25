import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
	public static int anInt4259;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "Lclient!sm;")
	public static Class210 aClass210_30 = new Class210();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!fc;)I")
	public static int method3803(@OriginalArg(1) Class71 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1560(Static10.anInt310)) {
			local5++;
		}
		if (arg0.method1560(Static58.anInt5536)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method3804(@OriginalArg(0) Class82 arg0) {
		if (Static372.aBoolean487) {
			Static98.method1778(arg0);
		} else {
			Static31.method735(arg0);
		}
	}
}
