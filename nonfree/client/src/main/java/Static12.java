import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
	public static int anInt136;

	@OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
	public static int anInt137;

	@OriginalMember(owner = "client!afa", name = "e", descriptor = "Lclient!sc;")
	public static Class300 aClass300_1;

	@OriginalMember(owner = "client!afa", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[6][];

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(III)Z")
	public static boolean method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static596.method7818(arg1, arg0) || Static524.method6964(arg1, arg0);
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!qh;I)Lclient!wn;")
	public static Class91 method129(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(7) int local7 = arg0.method3109();
		@Pc(16) Class300 local16 = Static175.method3039()[arg0.method3118()];
		@Pc(25) Class140 local25 = Static53.method999()[arg0.method3118()];
		@Pc(34) int local34 = arg0.method3107();
		@Pc(38) int local38 = arg0.method3107();
		return new Class91(local7, local16, local25, local34, local38);
	}

	@OriginalMember(owner = "client!afa", name = "b", descriptor = "(III)V")
	public static void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static251.method4061(local7.aClass9_Sub1_Sub2_1);
		Static251.method4061(local7.aClass9_Sub1_Sub2_2);
		if (local7.aClass9_Sub1_Sub2_1 != null) {
			local7.aClass9_Sub1_Sub2_1 = null;
		}
		if (local7.aClass9_Sub1_Sub2_2 != null) {
			local7.aClass9_Sub1_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)Z")
	public static boolean method132(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
