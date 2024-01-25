import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ofa", name = "c", descriptor = "Lclient!kr;")
	public static Class20 aClass20_30;

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIII)V")
	public static void method6230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static318.anInt5776 == arg1 && arg2 == Static594.anInt9790 && Static491.anInt8363 == arg0) {
			return;
		}
		Static445.aBoolean594 = true;
		Static594.anInt9790 = arg2;
		Static491.anInt8363 = arg0;
		Static318.anInt5776 = arg1;
		@Pc(35) double local35 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(45) double local45 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(48) double local48 = Math.cos(local45);
		@Pc(51) double local51 = Math.sin(local45);
		@Pc(54) double local54 = Math.cos(local35);
		@Pc(57) double local57 = Math.sin(local35);
		Static184.aDouble7 = local48 * local54;
		Static361.aDouble12 = local54;
		Static163.aDouble6 = local57;
		Static565.aDouble23 = local57 * local51;
		Static562.aDouble22 = local51;
		Static233.aDouble10 = local48;
		Static226.aDouble9 = local54 * -local51;
		Static162.aDouble5 = 0.0D;
		Static41.aDouble1 = -local48 * local57;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IBIII)Z")
	public static boolean method6234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static244.aByteArrayArrayArray9[0][arg0][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static244.aByteArrayArrayArray9[arg1][arg0][arg2] & 0x10) == 0) {
			return Static115.method1858(arg1, arg0, arg2) == arg3;
		} else {
			return false;
		}
	}
}
