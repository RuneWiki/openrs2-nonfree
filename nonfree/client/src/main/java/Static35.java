import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!vc;")
	public static Class65 aClass65_2;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Lclient!fc;")
	public static Class21 aClass21_10;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "[I")
	public static int[] anIntArray83;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public static int anInt1334;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!rc;")
	public static Class55 aClass55_521 = Static34.method846("Cabbage");

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!rc;")
	private static Class55 aClass55_525 = Static34.method846("skill)2");

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_522 = aClass55_525;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array11 = new Class55[100];

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!rc;")
	private static Class55 aClass55_524 = Static34.method846("Please reload this page)3");

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_523 = aClass55_524;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static int anInt1333 = 0;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public static int anInt1336 = 0;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
	public static int[] anIntArray84 = new int[2000];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method861() {
		aClass65_2 = null;
		aClass55Array11 = null;
		aClass55_521 = null;
		anIntArray82 = null;
		aClass21_10 = null;
		aClass55_523 = null;
		aClass55_525 = null;
		anIntArray83 = null;
		aClass55_524 = null;
		aClass55_522 = null;
		anIntArray84 = null;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method862() {
		if (Static57.aClass65_3 != null) {
			Static57.aClass65_3.method2012();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method863() {
		while (true) {
			@Pc(10) Class3 local10 = Static90.aClass3_6;
			@Pc(17) Class6_Sub8 local17;
			synchronized (Static90.aClass3_6) {
				local17 = (Class6_Sub8) Static93.aClass3_7.method34();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass40_Sub1_21.method1257(local17.aClass32_2, false, (int) local17.aLong114, local17.aByteArray7);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
	public static void method864() {
		Static13.method503(10, false, 0, null);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!b;)Lclient!rc;")
	public static Class55 method865(@OriginalArg(1) Class6_Sub1 arg0) {
		return Static92.method1747(arg0);
	}
}
