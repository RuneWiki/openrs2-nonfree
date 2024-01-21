import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ib", name = "ab", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!ib", name = "lb", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!ib", name = "rb", descriptor = "Lclient!tb;")
	public static Class44 aClass44_33;

	@OriginalMember(owner = "client!ib", name = "xb", descriptor = "Lclient!md;")
	public static Class30 aClass30_8;

	@OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
	public static int anInt1424 = 0;

	@OriginalMember(owner = "client!ib", name = "eb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_800 = Static33.method650("Enter object name");

	@OriginalMember(owner = "client!ib", name = "ib", descriptor = "Lclient!oa;")
	public static Class56 aClass56_801 = Static33.method650("@yel@");

	@OriginalMember(owner = "client!ib", name = "nb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_802 = aClass56_800;

	@OriginalMember(owner = "client!ib", name = "qb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_803 = Static33.method650("@gre@");

	@OriginalMember(owner = "client!ib", name = "ub", descriptor = "Lclient!oa;")
	private static Class56 aClass56_805 = Static33.method650("Bad session id)3");

	@OriginalMember(owner = "client!ib", name = "sb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_804 = aClass56_805;

	@OriginalMember(owner = "client!ib", name = "vb", descriptor = "I")
	public static int anInt1438 = 0;

	@OriginalMember(owner = "client!ib", name = "yb", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIII)I")
	public static int method901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(16) int local16 = arg5;
			arg5 = arg2;
			arg2 = local16;
		}
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 + 1 - arg4 - arg5;
		} else if (local7 == 2) {
			return 7 + 1 - arg0 - arg2;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public static void method902() {
		anIntArray99 = null;
		aClass56_802 = null;
		aClass44_33 = null;
		aClass56_800 = null;
		aClass56_804 = null;
		aClass56_801 = null;
		anIntArray98 = null;
		aClass56_805 = null;
		aClass30_8 = null;
		aClass56_803 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLclient!td;)Lclient!td;")
	public static Class3_Sub1_Sub16 method905(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		@Pc(15) Class3_Sub1_Sub16 local15 = Static19.method402(arg0);
		if (local15 == null) {
			local15 = arg0.aClass3_Sub1_Sub16_5;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBI)V")
	public static void method907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			Static111.aClass3_Sub2_Sub1_4.method325(121);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 2) {
			Static111.aClass3_Sub2_Sub1_4.method325(144);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 3) {
			Static111.aClass3_Sub2_Sub1_4.method325(217);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 4) {
			Static111.aClass3_Sub2_Sub1_4.method325(77);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 5) {
			Static111.aClass3_Sub2_Sub1_4.method325(193);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 6) {
			Static111.aClass3_Sub2_Sub1_4.method325(176);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 7) {
			Static111.aClass3_Sub2_Sub1_4.method325(247);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 8) {
			Static111.aClass3_Sub2_Sub1_4.method325(234);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 9) {
			Static111.aClass3_Sub2_Sub1_4.method325(128);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		if (arg2 == 10) {
			Static111.aClass3_Sub2_Sub1_4.method325(175);
			Static111.aClass3_Sub2_Sub1_4.method280(arg0);
			Static111.aClass3_Sub2_Sub1_4.method289(arg1);
		}
		@Pc(214) Class3_Sub1_Sub16 local214 = Static42.method784(arg0, arg1);
		if (local214 != null && local214.anObjectArray14 != null) {
			Static56.method1067(local214, arg2, null, local214.anObjectArray14, 0, 0);
		}
	}
}
