import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "[I")
	public static final int[] anIntArray411 = new int[8];

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	public static void method4146() {
		@Pc(12) byte[] local12;
		if (Static491.anObject14 == null) {
			@Pc(5) Class18_Sub2_Sub2 local5 = new Class18_Sub2_Sub2();
			local12 = local5.method7254();
			Static491.anObject14 = Static540.method7762(local12);
		}
		if (Static475.anObject13 == null) {
			@Pc(27) Class18_Sub1_Sub1 local27 = new Class18_Sub1_Sub1();
			local12 = local27.method3740();
			Static475.anObject13 = Static540.method7762(local12);
		}
	}
}
