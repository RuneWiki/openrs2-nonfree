import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!rj;")
	public static Class287 aClass287_6;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(ZI)V")
	public static void method5525(@OriginalArg(1) int arg0) {
		if (!Static72.aClass2_Sub12_Sub1_1.aBoolean161) {
			arg0 = -1;
		}
		if (arg0 == Static252.anInt4688) {
			return;
		}
		if (arg0 != -1) {
			@Pc(30) Class12 local30 = Static156.aClass273_6.method6378(arg0);
			@Pc(34) Class13 local34 = local30.method245();
			if (local34 == null) {
				arg0 = -1;
			} else {
				Static356.aClass287_5.method6546(local34.method257(), new Point(local30.anInt424, local30.anInt419), local34.method250(), local34.method252(), Static471.aCanvas12);
				Static252.anInt4688 = arg0;
			}
		}
		if (arg0 == -1 && Static252.anInt4688 != -1) {
			Static356.aClass287_5.method6546(null, new Point(), -1, -1, Static471.aCanvas12);
			Static252.anInt4688 = -1;
		}
	}
}
