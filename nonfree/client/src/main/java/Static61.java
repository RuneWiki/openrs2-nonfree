import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!fd;")
	public static Class24 aClass24_18;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!g;")
	public static Class26 aClass26_32;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	public static int anInt1680;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_8;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!je;")
	public static Class40 aClass40_824 = Static69.method1231("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!uf;")
	public static Class77 aClass77_6 = new Class77(8);

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_825 = Static69.method1231("Okay");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method1110() {
		aClass26_32 = null;
		aClass24_Sub1_8 = null;
		aClass40_825 = null;
		aClass40_824 = null;
		aClass24_18 = null;
		aClass77_6 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	public static void method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static66.anInt1735 == 0 || arg2 == 0 || Static70.anInt1888 >= 50) {
			return;
		}
		Static48.anIntArray137[Static70.anInt1888] = arg1;
		Static104.anIntArray285[Static70.anInt1888] = arg2;
		Static106.anIntArray289[Static70.anInt1888] = arg0;
		Static64.aClass66Array1[Static70.anInt1888] = null;
		Static121.anIntArray331[Static70.anInt1888] = 0;
		Static70.anInt1888++;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Z")
	public static boolean method1112(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)I")
	public static int method1113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(16) int local16 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local16;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Lclient!va;")
	public static Class2_Sub1_Sub15 method1114(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub15 local10 = (Class2_Sub1_Sub15) Static3.aClass55_7.method1410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static50.aClass24_13.method1931(arg0, 5);
		local10 = new Class2_Sub1_Sub15();
		if (local20 != null) {
			local10.method2061(new Class2_Sub9(local20));
		}
		Static3.aClass55_7.method1411((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lclient!je;")
	public static Class40 method1115(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 - arg0;
		if (local15 < -9) {
			return Static66.aClass40_862;
		} else if (local15 < -6) {
			return Static67.aClass40_890;
		} else if (local15 < -3) {
			return Static3.aClass40_74;
		} else if (local15 < 0) {
			return Static49.aClass40_654;
		} else if (local15 > 9) {
			return Static84.aClass40_1163;
		} else if (local15 > 6) {
			return Static70.aClass40_935;
		} else if (local15 > 3) {
			return Static74.aClass40_518;
		} else if (local15 > 0) {
			return Static11.aClass40_198;
		} else {
			return Static51.aClass40_693;
		}
	}
}
