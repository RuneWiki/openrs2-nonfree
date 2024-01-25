import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!saa", name = "d", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "[S")
	public static short[] aShortArray117;

	@OriginalMember(owner = "client!saa", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray34;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_84 = new Class306("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!saa", name = "g", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_288 = new Class296(50, -1);

	@OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
	public static int anInt6478 = -2;

	@OriginalMember(owner = "client!saa", name = "i", descriptor = "[I")
	public static final int[] anIntArray655 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!saa", name = "j", descriptor = "Lclient!jq;")
	public static Class156 aClass156_15 = null;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIIIIZ)Z")
	public static boolean method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray428[0];
		@Pc(13) int local13 = Static63.aClass49_Sub2_Sub2_Sub1_1.anIntArray427[0];
		if (local8 < 0 || Static459.anInt7799 <= local8 || local13 < 0 || Static482.anInt7990 <= local13) {
			return false;
		} else if (arg0 >= 0 && arg0 < Static459.anInt7799 && arg4 >= 0 && Static482.anInt7990 > arg4) {
			@Pc(78) int local78 = Static311.method1477(arg3, Static63.aClass49_Sub2_Sub2_Sub1_1.method3788(), local13, arg5, arg6, Static491.anIntArray760, arg7, arg4, arg1, arg2, Static86.aClass91Array1[Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98], local8, Static421.anIntArray703, arg0);
			if (local78 < 1) {
				return false;
			}
			Static364.anInt6445 = Static421.anIntArray703[local78 - 1];
			Static377.anInt6886 = Static491.anIntArray760[local78 - 1];
			Static426.aBoolean535 = false;
			Static19.method499();
			return true;
		} else {
			return false;
		}
	}
}
