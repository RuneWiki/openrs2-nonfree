import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBI)V")
	public static void method1822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static461.anInt53 / (float) Static461.anInt52;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg2);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg2 - local11) / 2;
		@Pc(49) int local49 = arg0 - (arg1 - local13) / 2;
		Static556.anInt9488 = local40 * Static461.anInt52 / local11;
		Static98.anInt2324 = -1;
		Static427.anInt9633 = -1;
		Static567.anInt7671 = Static461.anInt53 - local49 * Static461.anInt53 / local13;
		Static41.method1128();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
	public static boolean method1823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static370.method5898(arg0, arg1) || Static538.method7765(arg0, arg1);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)V")
	public static void method1824(@OriginalArg(0) int arg0) {
		Static64.anInt1536 = arg0;
		@Pc(15) Class245 local15 = Static551.aClass245_66;
		synchronized (Static551.aClass245_66) {
			Static551.aClass245_66.method6079();
		}
	}
}
