import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_106 = new Class27(81, 4);

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)V")
	public static void method5735() {
		@Pc(7) int local7 = Static270.anInt4754;
		@Pc(14) int[] local14 = Static53.anIntArray79;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class24_Sub3_Sub2_Sub2 local24 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local14[local16]];
			if (local24 != null) {
				Static100.method1784(local24, local24.method4919());
			}
		}
	}
}
