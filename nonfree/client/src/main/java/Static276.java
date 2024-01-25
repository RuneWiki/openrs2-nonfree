import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
	public static int anInt5323 = -1;

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "Lclient!st;")
	public static final Class314 aClass314_82 = new Class314(60, 1);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method4535(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray675[0];
		@Pc(13) int local13 = Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anIntArray676[0];
		if (local8 < 0 || local8 >= Static399.anInt7121 || local13 < 0 || local13 >= Static24.anInt345) {
			return false;
		} else if (arg0 >= 0 && Static399.anInt7121 > arg0 && arg2 >= 0 && Static24.anInt345 > arg2) {
			@Pc(67) int local67 = Static589.method8186(Static174.aClass237Array1[Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127], arg6, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619(), arg7, Static347.anIntArray375, arg2, local8, arg5, arg3, arg0, Static192.anIntArray211, local13, arg1, arg4);
			if (local67 < 1) {
				return false;
			}
			Static162.anInt3235 = Static192.anIntArray211[local67 - 1];
			Static258.anInt5032 = Static347.anIntArray375[local67 - 1];
			Static309.aBoolean441 = false;
			Static238.method7923();
			return true;
		} else {
			return false;
		}
	}
}
