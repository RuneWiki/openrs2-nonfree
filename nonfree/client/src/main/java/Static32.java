import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!br", name = "j", descriptor = "I")
	public static int anInt632;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "I")
	public static int anInt633;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	public static int anInt628 = -1;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_18 = new Class103();

	@OriginalMember(owner = "client!br", name = "h", descriptor = "I")
	public static int anInt631 = 0;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public static void method555() {
		Static50.method822(25);
		Static216.method3988();
		System.gc();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!dn;)V")
	public static void method556(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1) {
		Static8.aClass51Array1[arg0] = arg1;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public static void method557() {
		Static128.method3393();
		Static125.method2232();
		Static86.method1558();
		Static320.method5552();
		Static155.method2783();
		Static272.method4781();
		Static220.method4014();
		Static339.method5856();
		Static8.method172();
		Static113.method1984();
		Static186.method3349();
		Static86.method1555();
		Static274.method4828();
		Static87.method1562();
		Static178.method3195();
		Static7.method120();
		Static286.method4983();
		Static134.method1921();
		Static338.method6002();
		Static242.method4303();
		Static355.method6033();
		Static303.method5314();
		Static73.method1356();
		Static150.aClass109_35.method2859(5);
		Static35.aClass109_9.method2859(5);
		Static329.aClass109_59.method2859(5);
		Static286.aClass109_50.method2859(5);
		Static108.aClass109_24.method2859(5);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)Z")
	public static boolean method558(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static236.aClass55_9.method5247();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static236.aClass55_9.method5211();
		} else if (!Static236.aClass55_9.method5209()) {
			arg0 = false;
		}
		if (arg0 == local11) {
			return false;
		} else {
			Static209.aBoolean344 = arg0;
			Static72.method1328(Static182.aClass139_5);
			return true;
		}
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	public static void method560() {
		@Pc(1) Class109 local1 = Static72.aClass109_19;
		synchronized (Static72.aClass109_19) {
			Static72.aClass109_19.method2850();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)Lclient!fk;")
	public static Class71 method561(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static290.aFloat20 == 3.0D) {
				return Static215.aClass71_6;
			}
			if ((double) Static290.aFloat20 == 4.0D) {
				return Static41.aClass71_2;
			}
			if ((double) Static290.aFloat20 == 6.0D) {
				return Static335.aClass71_9;
			}
			if ((double) Static290.aFloat20 >= 8.0D) {
				return Static349.aClass71_10;
			}
		} else if (arg0 == 1) {
			if ((double) Static290.aFloat20 == 3.0D) {
				return Static335.aClass71_9;
			}
			if ((double) Static290.aFloat20 == 4.0D) {
				return Static349.aClass71_10;
			}
			if ((double) Static290.aFloat20 == 6.0D) {
				return Static30.aClass71_1;
			}
			if ((double) Static290.aFloat20 >= 8.0D) {
				return Static319.aClass71_7;
			}
		} else if (arg0 == 2) {
			if ((double) Static290.aFloat20 == 3.0D) {
				return Static30.aClass71_1;
			}
			if ((double) Static290.aFloat20 == 4.0D) {
				return Static319.aClass71_7;
			}
			if ((double) Static290.aFloat20 == 6.0D) {
				return Static133.aClass71_5;
			}
			if ((double) Static290.aFloat20 >= 8.0D) {
				return Static331.aClass71_8;
			}
		}
		return null;
	}
}
