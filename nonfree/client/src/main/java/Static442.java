import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "Lclient!vk;")
	public static Class342 aClass342_5;

	@OriginalMember(owner = "client!raa", name = "d", descriptor = "[I")
	public static int[] anIntArray449;

	@OriginalMember(owner = "client!raa", name = "i", descriptor = "Lclient!f;")
	public static Class78 aClass78_30;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "I")
	public static int anInt8224;

	@OriginalMember(owner = "client!raa", name = "r", descriptor = "[[Lclient!gba;")
	public static Class112[][] aClass112ArrayArray1;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(JIIZ)V")
	public static void method6823(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static398.method6283(local17, arg1, 0, local10, true, 0, arg2, 0);
			return;
		}
		@Pc(57) Class101 local57 = Static204.aClass139_8.method3309(local29);
		@Pc(67) int local67;
		@Pc(70) int local70;
		if (local17 == 0 || local17 == 2) {
			local67 = local57.anInt2946;
			local70 = local57.anInt2969;
		} else {
			local67 = local57.anInt2969;
			local70 = local57.anInt2946;
		}
		@Pc(81) int local81 = local57.anInt2952;
		if (local17 != 0) {
			local81 = (local81 << local17 & 0xF) + (local81 >> 4 - local17);
		}
		Static398.method6283(0, arg1, local81, 0, true, local67, arg2, local70);
	}
}
