import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
	public static int anInt2071;

	@OriginalMember(owner = "client!daa", name = "g", descriptor = "Lclient!kda;")
	public static Class160 aClass160_18;

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_26 = new Class6(18, -1);

	@OriginalMember(owner = "client!daa", name = "e", descriptor = "Lclient!h;")
	public static final Class114 aClass114_44 = new Class114("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIZBIIIII)Z")
	public static boolean method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray362[0];
		@Pc(18) int local18 = Static16.aClass47_Sub2_Sub3_Sub2_1.anIntArray361[0];
		if (local8 < 0 || local8 >= Static542.anInt9387 || local18 < 0 || Static36.anInt1324 <= local18) {
			return false;
		} else if (arg0 >= 0 && Static542.anInt9387 > arg0 && arg3 >= 0 && arg3 < Static36.anInt1324) {
			@Pc(80) int local80 = Static470.method5658(arg7, arg3, arg6, arg0, local18, Static519.anIntArray760, arg4, arg2, Static70.aClass299Array1[Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94], arg5, arg1, local8, Static329.anIntArray457, Static16.aClass47_Sub2_Sub3_Sub2_1.method4350());
			if (local80 < 1) {
				return false;
			}
			Static540.anInt9357 = Static519.anIntArray760[local80 - 1];
			Static417.anInt6093 = Static329.anIntArray457[local80 - 1];
			Static79.aBoolean156 = false;
			Static503.method7223();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IIIIIIZII)Z")
	public static boolean method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg6 + arg1 && arg2 + arg7 > arg1) {
			return arg3 < arg4 + arg5 && arg0 + arg3 > arg5;
		} else {
			return false;
		}
	}
}
