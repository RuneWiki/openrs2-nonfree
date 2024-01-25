import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public static int anInt10417 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
	public static void method8861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class48 local9 = Static20.aClass48ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static237.anInt4363 = local9.anInt1311;
			Static446.anInt7613 = local9.anInt1305;
			Static278.anInt4932 = local9.anInt1308;
		}
		Static133.method1984();
	}
}
