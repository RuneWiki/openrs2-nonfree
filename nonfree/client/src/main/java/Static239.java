import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!qb;")
	public static Class12_Sub3_Sub2 aClass12_Sub3_Sub2_2;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray18;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
	public static int anInt4613;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	public static int anInt4616;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
	public static int[] anIntArray426 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
	public static int anInt4612 = -1;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method3684() {
		aByteArrayArray18 = null;
		anIntArray426 = null;
		aClass12_Sub3_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public static int method3685(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V")
	public static void method3686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class104 local13 = local7.aClass104_1;
		if (local13 != null) {
			local13.anInt3167 = local13.anInt3167 * arg3 / 16;
			local13.anInt3166 = local13.anInt3166 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IB)Lclient!rb;")
	public static Class144 method3687(@OriginalArg(0) int arg0) {
		@Pc(10) Class144 local10 = (Class144) Static227.aClass33_30.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static45.aClass98_25.method2396(arg0, 33);
		local10 = new Class144();
		if (local21 != null) {
			local10.method3577(arg0, new Class4_Sub17(local21));
		}
		Static227.aClass33_30.method845(local10, (long) arg0);
		return local10;
	}
}
