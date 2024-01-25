import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!jka", name = "c", descriptor = "J")
	public static long aLong141 = -1L;

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
	public static int anInt4921 = 0;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZI)V")
	public static void method4463(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class5_Sub55 local10 = arg0 ? Static605.aClass5_Sub55_3 : Static348.aClass5_Sub55_2;
		if (local10 == null || arg1 < 0 || local10.anInt10883 <= arg1) {
			return;
		}
		@Pc(33) Class395 local33 = local10.aClass395Array1[arg1];
		if (local33.aByte147 != -1) {
			return;
		}
		@Pc(42) String local42 = local33.aString120;
		@Pc(45) Class389 local45 = Static120.method1769(false);
		@Pc(53) Class5_Sub41 local53 = Static647.method8905(Static600.aClass381_250, local45.aClass393_2);
		local53.aClass5_Sub36_Sub2_1.method7324(Static271.method4453(local42) + 3);
		local53.aClass5_Sub36_Sub2_1.method7324(arg0 ? 1 : 0);
		local53.aClass5_Sub36_Sub2_1.method7296(arg1);
		local53.aClass5_Sub36_Sub2_1.method7327(local42);
		local45.method9079(local53);
	}
}
