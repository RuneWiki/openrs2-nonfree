import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!os", name = "d", descriptor = "Lclient!vk;")
	public static Class342 aClass342_4;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "I")
	public static int anInt7402 = -1;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	public static int anInt7403 = 0;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZIIZI)V")
	public static void method6106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static57.anInt942 = arg1;
		Static428.anInt8060 = arg4;
		Static95.anInt2225 = arg5;
		Static1.anInt84 = arg3;
		Static293.anInt5938 = arg0;
		if (arg2 && Static1.anInt84 >= 100) {
			Static24.anInt387 = Static428.anInt8060 * 512 + 256;
			Static110.anInt2624 = Static293.anInt5938 * 512 + 256;
			Static209.anInt3913 = Static501.method5641(Static24.anInt387, Static13.anInt231, Static110.anInt2624) - Static57.anInt942;
		}
		Static166.anInt3419 = 2;
		Static214.anInt3969 = -1;
		Static326.anInt6302 = -1;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([BIIIIZ)V")
	public static void method6108(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		arg1 += arg2;
		@Pc(20) int local20 = arg3 - arg2 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg3 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(25) int local25 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			arg1 = local35 + 1;
			arg0[local35] = 1;
		}
	}
}
