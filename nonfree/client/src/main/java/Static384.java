import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z")
	public static boolean method5634(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Z")
	public static boolean method5635() {
		return Static207.aBoolean229;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
	public static boolean method5636(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method5637() {
		if (Static603.anInterface7Array1 == null) {
			return;
		}
		@Pc(11) Interface7[] local11 = Static603.anInterface7Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(18) Interface7 local18 = local11[local13];
			local18.method8442();
		}
	}
}
