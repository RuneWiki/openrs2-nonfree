import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!cc;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
	public static int anInt3398 = 0;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt3400 = 0;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public static int anInt3404 = 0;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static int anInt3405 = 0;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1481 = Static51.method932("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1482 = aClass10_1481;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
	public static boolean method2424(@OriginalArg(0) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!kh;I)Z")
	public static boolean method2425(@OriginalArg(1) Class29 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method1032(arg1);
		if (local8 == null) {
			return false;
		} else {
			Static155.method2393(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!cd;Lclient!cd;ILclient!cd;)V")
	public static void method2426(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) Class10 arg2) {
		Static95.aClass10_947 = arg1;
		Static95.aClass10_940 = arg0;
		Static95.aClass10_948 = arg2;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method2427() {
		aClass10_1481 = null;
		aClass9_1 = null;
		aClass10_1482 = null;
	}
}
