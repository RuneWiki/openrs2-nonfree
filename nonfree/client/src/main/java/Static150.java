import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!fq", name = "O", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!fq", name = "J", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!fq", name = "P", descriptor = "I")
	public static int anInt3207 = 0;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)V")
	public static void method2578(@OriginalArg(0) int arg0) {
		if (!Static420.method6283(arg0)) {
			return;
		}
		@Pc(18) Class155[] local18 = Static535.aClass155ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class155 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt4775 = 0;
				local26.anInt4773 = 0;
				local26.anInt4747 = 1;
			}
		}
	}
}
