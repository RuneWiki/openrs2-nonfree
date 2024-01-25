import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
	public static int anInt7575;

	@OriginalMember(owner = "client!oda", name = "L", descriptor = "[[I")
	public static int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!oda", name = "M", descriptor = "I")
	public static int anInt7579 = 0;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!tn;)Lclient!ag;")
	public static Class12 method6337(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(15) int local15 = arg0.method8414();
		return new Class12(local15);
	}

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)V")
	public static void method6338() {
		if (Static284.anInterface15Array1 == null) {
			return;
		}
		@Pc(9) Interface15[] local9 = Static284.anInterface15Array1;
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(17) Interface15 local17 = local9[local11];
			local17.method7158();
		}
	}
}
