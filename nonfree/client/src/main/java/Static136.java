import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fea", name = "N", descriptor = "Z")
	public static boolean aBoolean168 = false;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BLclient!jj;)V")
	public static void method2051(@OriginalArg(1) Class160 arg0) {
		Static218.aClass6_Sub14_Sub2_1.method6049(arg0.method3424());
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!rq;IIIILclient!rq;IIII)V")
	public static void method2052(@OriginalArg(0) Class29_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class29_Sub2_Sub1 arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg0.method7001();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class4 local21 = (Class4) Static306.aClass332_129.method7502((long) local7);
		if (local21 == null) {
			@Pc(28) Class196[] local28 = Static589.method4748(Static447.aClass251_141, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static176.aClass121_5.method7157(local28[0]);
			Static306.aClass332_129.method7498((long) local7, local21);
		}
		Static196.method2957(arg3.method7008() * 256, 0, arg3.aByte103, arg3.anInt9222, arg1 >> 1, arg2 >> 1, arg3.anInt9218);
		@Pc(74) int local74 = Static550.anIntArray695[0] + arg5 - 18;
		@Pc(82) int local82 = local74 + arg4 / 4 * 18;
		@Pc(91) int local91 = arg6 + Static550.anIntArray695[1] - 70;
		@Pc(99) int local99 = local91 + arg4 % 4 * 18;
		local21.method6514(local82, local99);
		if (arg3 == arg0) {
			Static176.aClass121_5.method7160(18, local99 - 1, -256, local82 - 1, 18);
		}
		@Pc(123) Class102_Sub8 local123 = Static523.method7350();
		local123.anInt9286 = local82;
		local123.aClass29_Sub2_Sub1_1 = arg0;
		local123.anInt9283 = local99;
		local123.anInt9284 = local82 + 16;
		local123.anInt9282 = local99 + 16;
		Static501.aClass249_8.method5809(local123);
	}
}
