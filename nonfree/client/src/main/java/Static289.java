import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	public static int anInt4757;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_36 = new Class156();

	@OriginalMember(owner = "client!om", name = "n", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_13 = new Class225(5, 16);

	@OriginalMember(owner = "client!om", name = "o", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_106 = new Class211(53, 0);

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_107 = new Class211(14, 0);

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_37 = new Class156();

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	public static int anInt4758 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIZ)I")
	public static int method3845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
	public static boolean method3848(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)Lclient!kb;")
	public static Class133 method3850(@OriginalArg(0) int arg0) {
		@Pc(8) Class133[] local8 = Static25.method364();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class133 local21 = local8[local15];
			if (local21.anInt3403 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!dk;Lclient!dk;Lclient!dk;Lclient!dk;)V")
	public static void method3853(@OriginalArg(1) Class54 arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) Class54 arg2, @OriginalArg(4) Class54 arg3) {
		Static445.aClass54_116 = arg1;
		Static64.aClass54_24 = arg0;
		Static268.aClass54_76 = arg3;
		Static70.aClass54_25 = arg2;
		Static151.aClass16ArrayArray1 = new Class16[Static445.aClass54_116.method1107()][];
		Static119.aBooleanArray10 = new boolean[Static445.aClass54_116.method1107()];
	}
}
