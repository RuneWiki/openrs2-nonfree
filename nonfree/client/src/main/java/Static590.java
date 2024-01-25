import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wq", name = "w", descriptor = "[Lclient!nn;")
	public static final Class240[] aClass240Array1 = new Class240[4];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method7873(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray455[0];
		@Pc(13) int local13 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anIntArray454[0];
		if (local8 < 0 || local8 >= Static458.anInt9736 || local13 < 0 || Static378.anInt6747 <= local13) {
			return false;
		} else if (arg4 >= 0 && Static458.anInt9736 > arg4 && arg0 >= 0 && arg0 < Static378.anInt6747) {
			@Pc(76) int local76 = Static317.method7566(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method6058(), arg3, local13, Static375.anIntArray392, arg7, local8, arg2, arg5, aClass240Array1[Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113], arg0, arg1, Static184.anIntArray181, arg6, arg4);
			if (local76 < 1) {
				return false;
			}
			Static258.anInt4724 = Static184.anIntArray181[local76 - 1];
			Static345.anInt9498 = Static375.anIntArray392[local76 - 1];
			Static395.aBoolean537 = false;
			Static62.method1010();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method7875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "(I)Ljava/lang/String;")
	public static String method7876() {
		return Static406.aBoolean553 || Static231.aClass1_Sub40_1 == null ? "" : Static231.aClass1_Sub40_1.aString89;
	}
}
