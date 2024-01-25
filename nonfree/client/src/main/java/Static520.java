import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_151 = new Class73(29, 6);

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "Lclient!uv;")
	public static final Class340 aClass340_8 = new Class340();

	@OriginalMember(owner = "client!tv", name = "m", descriptor = "[B")
	public static final byte[] aByteArray101 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IILclient!cu;ZIII)V")
	public static void method6532(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static559.anInt9221 >= 50 || (arg1 == null || arg1.anIntArrayArray12 == null || arg1.anIntArrayArray12.length <= arg4 || arg1.anIntArrayArray12[arg4] == null)) {
			return;
		}
		@Pc(41) int local41 = arg1.anIntArrayArray12[arg4][0];
		@Pc(45) int local45 = local41 >> 8;
		@Pc(51) int local51 = local41 >> 5 & 0x7;
		@Pc(55) int local55 = local41 & 0x1F;
		@Pc(72) int local72;
		if (arg1.anIntArrayArray12[arg4].length > 1) {
			local72 = (int) ((double) arg1.anIntArrayArray12[arg4].length * Math.random());
			if (local72 > 0) {
				local45 = arg1.anIntArrayArray12[arg4][local72];
			}
		}
		if (local55 == 0) {
			if (arg2) {
				if (arg1.aBoolean115) {
					Static366.method5502(local45, 0, 255, false, local51);
					return;
				}
				Static588.method1983(255, local45, 0, local51);
			}
		} else if (Static140.aClass6_Sub48_Sub1_1.anInt9004 != 0) {
			local72 = arg3 - 256 >> 9;
			@Pc(125) int local125 = arg5 - 256 >> 9;
			Static546.aClass39Array1[Static559.anInt9221++] = new Class39((byte) (arg1.aBoolean115 ? 2 : 1), local45, local51, 0, 255, local55 + (local72 << 16) + (arg0 << 24) + (local125 << 8));
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZI)Lclient!hg;")
	public static Class132 method6533(@OriginalArg(1) int arg0) {
		@Pc(8) Class132[] local8 = Static471.method5523();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class132 local16 = local8[local10];
			if (local16.anInt3866 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
