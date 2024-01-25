import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!qp", name = "M", descriptor = "[Lclient!oe;")
	public static Class241[] aClass241Array30;

	@OriginalMember(owner = "client!qp", name = "P", descriptor = "B")
	public static byte aByte100;

	@OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
	public static int anInt7242 = 0;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLclient!om;Lclient!fa;)V")
	public static void method6151(@OriginalArg(1) Class246 arg0, @OriginalArg(2) Interface8 arg1) {
		Static1.anInterface8_1 = arg1;
		Static167.aClass246_83 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIBIZIII)Z")
	public static boolean method6152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray518[0];
		@Pc(13) int local13 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anIntArray517[0];
		if (local8 < 0 || local8 >= Static400.anInt6818 || local13 < 0 || local13 >= Static271.anInt5050) {
			return false;
		} else if (arg0 >= 0 && arg0 < Static400.anInt6818 && arg6 >= 0 && Static271.anInt5050 > arg6) {
			@Pc(74) int local74 = Static258.method4312(Static583.anIntArray691, arg3, arg2, arg4, arg1, arg7, arg6, arg5, Static221.aClass95Array2[Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126], local13, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5569(), local8, arg0, Static10.anIntArray18);
			if (local74 < 1) {
				return false;
			}
			Static341.anInt6021 = Static10.anIntArray18[local74 - 1];
			Static329.anInt5894 = Static583.anIntArray691[local74 - 1];
			Static77.aBoolean168 = false;
			Static468.method6468();
			return true;
		} else {
			return false;
		}
	}
}
