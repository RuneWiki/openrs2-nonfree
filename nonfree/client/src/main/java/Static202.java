import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	public static int anInt3565;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lclient!ed;")
	public static Class93 method3047(@OriginalArg(0) int arg0) {
		@Pc(13) Class93[] local13 = Static402.method5588();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt2270 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}
}
