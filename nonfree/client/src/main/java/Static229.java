import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public static int anInt4373;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIBIII)V")
	public static void method3519(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(23) int local23 = arg1 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(45) int local45 = local23 * (Static10.aShort4 - Static72.aShort39) / 100 + Static72.aShort39;
		if (local45 < Static447.aShort54) {
			local45 = Static447.aShort54;
		} else if (local45 > Static37.aShort7) {
			local45 = Static37.aShort7;
		}
		@Pc(75) int local75 = arg1 * local45 * 512 / (arg4 * 334);
		@Pc(108) int local108;
		@Pc(115) int local115;
		@Pc(83) short local83;
		if (local75 < Static157.aShort35) {
			local83 = Static157.aShort35;
			local45 = local83 * arg4 * 334 / (arg1 * 512);
			if (local45 > Static37.aShort7) {
				local45 = Static37.aShort7;
				local108 = local45 * arg1 * 512 / (local83 * 334);
				local115 = (arg4 - local108) / 2;
				if (arg0) {
					Static387.aClass26_9.va();
					Static387.aClass26_9.method2245(arg1, arg3, arg2, local115, -16777216);
					Static387.aClass26_9.method2245(arg1, arg3 + arg4 - local115, arg2, local115, -16777216);
				}
				arg4 -= local115 * 2;
				arg3 += local115;
			}
		} else if (Static23.aShort5 < local75) {
			local83 = Static23.aShort5;
			local45 = arg4 * local83 * 334 / (arg1 * 512);
			if (Static447.aShort54 > local45) {
				local45 = Static447.aShort54;
				local108 = arg4 * 334 * local83 / (local45 * 512);
				local115 = (arg1 - local108) / 2;
				if (arg0) {
					Static387.aClass26_9.va();
					Static387.aClass26_9.method2245(local115, arg3, arg2, arg4, -16777216);
					Static387.aClass26_9.method2245(local115, arg3, arg2 + arg1 - local115, arg4, -16777216);
				}
				arg1 -= local115 * 2;
				arg2 += local115;
			}
		}
		Static85.anInt3262 = arg2;
		Static191.anInt3765 = (short) arg1;
		Static102.anInt2188 = (short) arg4;
		Static49.anInt1356 = local45 * arg1 / 334;
		Static361.anInt6364 = arg3;
	}
}
