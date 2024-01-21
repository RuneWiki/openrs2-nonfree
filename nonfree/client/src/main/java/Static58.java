import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!ga;")
	public static Class30 aClass30_24;

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!ed;")
	private static Class23 aClass23_600 = Static169.method2903("Connection lost)3");

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_598 = aClass23_600;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!ed;")
	private static Class23 aClass23_599 = Static169.method2903("Attack");

	@OriginalMember(owner = "client!h", name = "i", descriptor = "I")
	public static int anInt1635 = 0;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "Lclient!ed;")
	public static Class23 aClass23_601 = aClass23_599;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!ga;)V")
	public static void method1099(@OriginalArg(1) Class30 arg0) {
		Static70.aClass30_29 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method1100() {
		aClass23_601 = null;
		aClass30_24 = null;
		aClass23_600 = null;
		aClass23_598 = null;
		aClass23_599 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
	public static boolean method1101(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method1102(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static7.anInt323 > 0) {
			local21 = Static23.aByteArrayArray2[--Static7.anInt323];
			Static23.aByteArrayArray2[Static7.anInt323] = null;
			return local21;
		} else if (arg0 == 5000 && Static5.anInt4365 > 0) {
			local21 = Static170.aByteArrayArray5[--Static5.anInt4365];
			Static170.aByteArrayArray5[Static5.anInt4365] = null;
			return local21;
		} else if (arg0 == 30000 && Static45.anInt1253 > 0) {
			local21 = Static146.aByteArrayArray10[--Static45.anInt1253];
			Static146.aByteArrayArray10[Static45.anInt1253] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}
