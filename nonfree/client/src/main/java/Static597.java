import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIIIIIIII)Z")
	public static boolean method8258(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0];
		@Pc(13) int local13 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0];
		if (local8 < 0 || local8 >= Static544.anInt9261 || local13 < 0 || local13 >= Static282.anInt4887) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static544.anInt9261 && arg2 >= 0 && arg2 < Static282.anInt4887) {
			@Pc(90) int local90 = Static429.method6353(local13, Static670.aClass88Array1[Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145], arg2, arg1, arg7, Static196.anIntArray186, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method5993(), arg3, Static106.anIntArray93, arg5, arg4, arg6, arg0, local8);
			if (local90 < 1) {
				return false;
			}
			Static86.anInt1451 = Static106.anIntArray93[local90 - 1];
			Static669.anInt10711 = Static196.anIntArray186[local90 - 1];
			Static437.aBoolean584 = false;
			Static522.method7559();
			return true;
		} else {
			return false;
		}
	}
}
