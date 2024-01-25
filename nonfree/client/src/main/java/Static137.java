import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!rt;")
	public static Class295 aClass295_1;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_24 = new Class70(54, 3);

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_25 = new Class70(0, 4);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Z")
	public static boolean method2089(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!rk;IIZIII)V")
	public static void method2090(@OriginalArg(0) Class290 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static507.anInt8646 >= 50 || (arg0 == null || arg0.anIntArrayArray172 == null || arg2 >= arg0.anIntArrayArray172.length || arg0.anIntArrayArray172[arg2] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray172[arg2][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg0.anIntArrayArray172[arg2].length > 1) {
			local63 = (int) ((double) arg0.anIntArrayArray172[arg2].length * Math.random());
			if (local63 > 0) {
				local40 = arg0.anIntArrayArray172[arg2][local63];
			}
		}
		@Pc(79) int local79 = local36 & 0x1F;
		if (local79 == 0) {
			if (arg3) {
				if (!arg0.aBoolean600) {
					Static159.method2289(local40, local46, 0, 255);
					return;
				}
				Static255.method3727(0, false, 255, local46, local40);
			}
		} else if (Static348.aClass1_Sub30_Sub1_1.anInt4858 != 0) {
			local63 = arg1 - 256 >> 9;
			@Pc(123) int local123 = arg4 - 256 >> 9;
			Static150.aClass104Array1[Static507.anInt8646++] = new Class104((byte) (arg0.aBoolean600 ? 2 : 1), local40, local46, 0, 255, local79 + (local123 << 8) + (local63 << 16) + (arg5 << 24));
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
	public static void method2093() {
		Static337.anInt8004 = 0;
		Static310.aClass353_32.method7680();
		Static554.aBoolean708 = false;
	}
}
