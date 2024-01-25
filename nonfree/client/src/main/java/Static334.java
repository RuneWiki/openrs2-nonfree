import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
	public static int anInt5671;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	public static int anInt5669 = 0;

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	public static void method4655() {
		if (Static216.anInt4135 == 3) {
			Static426.method5887(4);
		} else if (Static216.anInt4135 == 7) {
			Static426.method5887(8);
		} else if (Static216.anInt4135 == 10) {
			Static426.method5887(11);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V")
	public static void method4657(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub6_Sub16 local8 = Static212.method3332(10, arg0);
		local8.method6593();
	}
}
