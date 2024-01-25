import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wl", name = "q", descriptor = "[[Lclient!uq;")
	public static Class251[][] aClass251ArrayArray3;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "Lclient!rj;")
	public static Class209 aClass209_5;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "S")
	public static short aShort99 = 1;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "J")
	public static long aLong219 = -1L;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIZIII)V")
	public static void method5927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static28.anInt644 && Static125.anInt2545 >= arg4 && arg0 >= Static108.anInt2276 && arg2 <= Static173.anInt3208) {
			if (arg1 == 1) {
				Static454.method5961(arg0, arg4, arg5, arg3, arg2);
			} else {
				Static418.method5567(arg3, arg0, arg4, arg5, arg2, arg1);
			}
		} else if (arg1 == 1) {
			Static406.method5438(arg3, arg0, arg2, arg4, arg5);
		} else {
			Static172.method2767(arg5, arg1, arg0, arg2, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!l;IIIILclient!uq;Lclient!ma;I)V")
	public static void method5929(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class251 arg5, @OriginalArg(6) Class133 arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(17) int local17;
		if (Static345.anInt5797 == 4) {
			local17 = (int) Static142.aFloat89 & 0x3FFF;
		} else {
			local17 = (int) Static142.aFloat89 + Static82.anInt1815 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg5.anInt6687 / 2, arg5.anInt6677 / 2) + 10;
		@Pc(45) int local45 = arg4 * arg4 + arg3 * arg3;
		if (local45 > local36 * local36) {
			return;
		}
		@Pc(55) int local55 = Class183.anIntArray433[local17];
		@Pc(59) int local59 = Class183.anIntArray434[local17];
		if (Static345.anInt5797 != 4) {
			local59 = local59 * 256 / (Static119.anInt840 + 256);
			local55 = local55 * 256 / (Static119.anInt840 + 256);
		}
		@Pc(88) int local88 = arg4 * local59 + arg3 * local55 >> 15;
		@Pc(99) int local99 = local59 * arg3 - arg4 * local55 >> 15;
		arg0.method5720(arg1 + arg5.anInt6687 / 2 + local88 - arg0.j() / 2, -local99 + arg2 - (-(arg5.anInt6677 / 2) - -(arg0.T() / 2)), arg6, arg1, arg2);
	}
}
