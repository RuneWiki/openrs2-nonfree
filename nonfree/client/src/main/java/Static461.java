import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!qga", name = "v", descriptor = "I")
	public static int anInt8175;

	@OriginalMember(owner = "client!qga", name = "w", descriptor = "Z")
	public static boolean aBoolean555 = false;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZIIII)V")
	public static void method7050(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static81.anInt1699 = arg1;
		Static222.anInt4352 = arg0;
		Static26.anInt536 = arg3;
		Static80.anInt1683 = arg4;
		Static358.anInt6653 = arg2;
		if (Static222.anInt4352 >= 100) {
			@Pc(24) int local24 = Static80.anInt1683 * 512 + 256;
			@Pc(30) int local30 = Static81.anInt1699 * 512 + 256;
			@Pc(38) int local38 = Static138.method2248(local24, Static175.anInt3636, local30) - Static26.anInt536;
			@Pc(43) int local43 = local24 - Static580.anInt9662;
			@Pc(48) int local48 = local38 - Static428.anInt7788;
			@Pc(53) int local53 = local30 - Static524.anInt9123;
			@Pc(64) int local64 = (int) Math.sqrt((double) (local53 * local53 + local43 * local43));
			Static263.anInt5239 = (int) (Math.atan2((double) local48, (double) local64) * 2607.5945876176133D) & 0x3FFF;
			Static470.anInt8261 = (int) (Math.atan2((double) local43, (double) local53) * -2607.5945876176133D) & 0x3FFF;
			Static9.anInt193 = 0;
			if (Static263.anInt5239 < 1024) {
				Static263.anInt5239 = 1024;
			}
			if (Static263.anInt5239 > 3072) {
				Static263.anInt5239 = 3072;
			}
		}
		Static624.anInt10280 = -1;
		Static160.anInt3352 = -1;
		Static334.anInt6354 = 2;
	}
}
