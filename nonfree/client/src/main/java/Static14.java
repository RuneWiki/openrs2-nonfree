import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "S")
	public static short aShort73 = 32767;

	@OriginalMember(owner = "client!an", name = "c", descriptor = "I")
	public static int anInt5474 = -1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIZIIIZI)Z")
	public static boolean method4213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0];
		@Pc(13) int local13 = Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0];
		if (local8 < 0 || Static126.anInt2569 <= local8 || local13 < 0 || Static190.anInt3697 <= local13) {
			return false;
		} else if (arg7 >= 0 && arg7 < Static126.anInt2569 && arg6 >= 0 && Static190.anInt3697 > arg6) {
			@Pc(67) int local67 = Static48.method1022(arg5, Static395.aClass268Array1[Static375.aClass6_Sub2_Sub1_Sub1_3.aByte86], arg7, Static41.anIntArray78, arg1, local13, arg0, arg4, arg2, Static244.anIntArray368, Static375.aClass6_Sub2_Sub1_Sub1_3.method4763(), arg6, local8, arg3);
			if (local67 < 1) {
				return false;
			}
			Static454.anInt7591 = Static41.anIntArray78[local67 - 1];
			Static52.anInt1390 = Static244.anIntArray368[local67 - 1];
			Static319.aBoolean380 = false;
			Static200.method2884();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)Z")
	public static boolean method4215() {
		return Static130.aClass239_4 != Static427.aClass239_7 || Static189.anInt3643 >= 2;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(BI)Z")
	public static boolean method4217(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
