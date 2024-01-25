import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_10 = new Class228(0, 1);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIIIZII)Z")
	public static boolean method8257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7) {
		@Pc(8) int local8 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray253[0];
		@Pc(13) int local13 = Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.anIntArray252[0];
		if (local8 < 0 || local8 >= Static111.anInt1752 || local13 < 0 || local13 >= Static279.anInt4567) {
			return false;
		} else if (arg7 >= 0 && arg7 < Static111.anInt1752 && arg1 >= 0 && Static279.anInt4567 > arg1) {
			@Pc(84) int local84 = Static551.method7788(arg3, local8, Static308.aClass182Array1[Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125], local13, Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.method2509(), Static202.anIntArray294, arg6, arg5, arg0, arg1, arg2, Static325.anIntArray411, arg7, arg4);
			if (local84 < 1) {
				return false;
			}
			Static269.anInt1227 = Static202.anIntArray294[local84 - 1];
			Static119.anInt1885 = Static325.anIntArray411[local84 - 1];
			Static647.aBoolean840 = false;
			Static162.method2436();
			return true;
		} else {
			return false;
		}
	}
}
