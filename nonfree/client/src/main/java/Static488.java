import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_188 = new Class200(23, 2);

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(II)Lclient!bia;")
	public static Class36 method6981(@OriginalArg(1) int arg0) {
		@Pc(6) Class36[] local6 = Static54.method1271();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(13) Class36 local13 = local6[local8];
			if (arg0 == local13.anInt1123) {
				return local13;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rba", name = "i", descriptor = "(I)V")
	public static void method6989() {
		if (Static360.anInt6253 == 5) {
			Static360.anInt6253 = 6;
		}
	}
}
