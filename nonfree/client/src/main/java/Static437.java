import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_96 = new Class44(4, -1);

	@OriginalMember(owner = "client!we", name = "v", descriptor = "I")
	public static final int anInt7642 = 328;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIZII)Z")
	public static boolean method5919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0];
		@Pc(13) int local13 = Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0];
		if (local8 < 0 || Static81.anInt1950 <= local8 || local13 < 0 || Static171.anInt3288 <= local13) {
			return false;
		} else if (arg6 >= 0 && Static81.anInt1950 > arg6 && arg2 >= 0 && arg2 < Static171.anInt3288) {
			@Pc(76) int local76 = Static408.method5530(arg7, arg4, arg3, arg2, local8, arg0, local13, Static332.aClass37Array1[Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92], Static150.anIntArray199, Static231.aClass4_Sub2_Sub2_Sub1_2.method5118(), Static174.anIntArray222, arg6, arg1, arg5);
			if (local76 < 1) {
				return false;
			}
			Static425.anInt5530 = Static174.anIntArray222[local76 - 1];
			Static176.anInt3417 = Static150.anIntArray199[local76 - 1];
			Static226.aBoolean362 = false;
			Static143.method5897();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I")
	public static int method5921() {
		return 2;
	}
}
