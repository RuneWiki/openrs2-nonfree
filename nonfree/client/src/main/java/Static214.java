import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Lclient!in;")
	public static Class157 aClass157_106;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!ha;")
	public static Class20 aClass20_7;

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "Lclient!at;")
	public static Class24 aClass24_9 = null;

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
	public static int anInt4837 = -50;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
	public static void method4182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static293.anInt6193 == arg2 && arg0 == Static619.anInt10830 && arg1 == Static224.anInt4987) {
			return;
		}
		Static293.anInt6193 = arg2;
		Static240.aBoolean380 = true;
		Static224.anInt4987 = arg1;
		Static619.anInt10830 = arg0;
		@Pc(35) double local35 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(45) double local45 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(48) double local48 = Math.cos(local45);
		@Pc(51) double local51 = Math.sin(local45);
		@Pc(54) double local54 = Math.cos(local35);
		@Pc(57) double local57 = Math.sin(local35);
		Static539.aDouble20 = local48;
		Static245.aDouble10 = local57;
		Static619.aDouble29 = local54;
		Static240.aDouble9 = local48 * local54;
		Static332.aDouble16 = local57 * -local48;
		Static136.aDouble6 = local51;
		Static78.aDouble1 = 0.0D;
		Static271.aDouble30 = local54 * -local51;
		Static361.aDouble18 = local51 * local57;
	}
}
