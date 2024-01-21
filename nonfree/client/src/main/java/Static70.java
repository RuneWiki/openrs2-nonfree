import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public static int anInt1741 = 2;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!ai;")
	private static Class6 aClass6_517 = Static38.method685("Unable to find ");

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_518 = Static38.method685("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_519 = aClass6_517;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public static int anInt1745 = 0;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_520 = Static38.method685("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method1105(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static117.aBooleanArray9[arg0]) {
			return;
		}
		Static121.aClass10_93.method1582(arg0);
		if (Static180.aClass87ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(25) boolean local25 = true;
		for (@Pc(27) int local27 = 0; local27 < Static180.aClass87ArrayArray1[arg0].length; local27++) {
			if (Static180.aClass87ArrayArray1[arg0][local27] != null) {
				if (Static180.aClass87ArrayArray1[arg0][local27].anInt4116 == 2) {
					local25 = false;
				} else {
					Static180.aClass87ArrayArray1[arg0][local27] = null;
				}
			}
		}
		if (local25) {
			Static180.aClass87ArrayArray1[arg0] = null;
		}
		Static117.aBooleanArray9[arg0] = false;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)J")
	public static synchronized long method1106() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static50.aLong75) {
			Static165.aLong228 += Static50.aLong75 - local10;
		}
		Static50.aLong75 = local10;
		return Static165.aLong228 + local10;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	public static void method1107() {
		aClass6_518 = null;
		aClass6_519 = null;
		aClass6_517 = null;
		aClass6_520 = null;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)Lclient!ai;")
	public static Class6 method1108(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static58.method956(new Class6[] { Static172.aClass6_1204, Static106.method2806(arg0), Static132.aClass6_887 });
		} else if (arg0 < 10000000) {
			return Static58.method956(new Class6[] { Static84.aClass6_639, Static106.method2806(arg0 / 1000), Static165.aClass6_1152, Static132.aClass6_887 });
		} else {
			return Static58.method956(new Class6[] { Static127.aClass6_851, Static106.method2806(arg0 / 1000000), Static159.aClass6_1115, Static132.aClass6_887 });
		}
	}
}
