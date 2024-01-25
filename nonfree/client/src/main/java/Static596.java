import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_135 = new Class61(79, -1);

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "[I")
	public static final int[] anIntArray724 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "Z")
	public static boolean aBoolean689 = false;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(BI)V")
	public static void method8015(@OriginalArg(1) int arg0) {
		Static403.anInt6989 = arg0;
		@Pc(7) Class223 local7 = Static52.aClass223_7;
		synchronized (Static52.aClass223_7) {
			Static52.aClass223_7.method4932();
		}
		local7 = Static291.aClass223_42;
		synchronized (Static291.aClass223_42) {
			Static291.aClass223_42.method4932();
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)V")
	public static void method8017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass10_Sub2_3 != null) {
			local7.aClass10_Sub2_3 = null;
		}
		if (local7.aClass10_Sub2_2 != null) {
			local7.aClass10_Sub2_2 = null;
		}
	}
}
