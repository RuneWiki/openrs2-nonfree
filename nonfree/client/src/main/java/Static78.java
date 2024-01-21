import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!mb", name = "Sb", descriptor = "I")
	public static int anInt1981;

	@OriginalMember(owner = "client!mb", name = "Zb", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_14;

	@OriginalMember(owner = "client!mb", name = "ac", descriptor = "I")
	public static int anInt1985;

	@OriginalMember(owner = "client!mb", name = "bc", descriptor = "I")
	public static int anInt1986;

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lclient!qb;")
	public static Class58 aClass58_40 = new Class58();

	@OriginalMember(owner = "client!mb", name = "sb", descriptor = "I")
	public static int anInt1961 = 0;

	@OriginalMember(owner = "client!mb", name = "tb", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!mb", name = "Cb", descriptor = "J")
	public static long aLong64 = 0L;

	@OriginalMember(owner = "client!mb", name = "Wb", descriptor = "Lclient!r;")
	private static Class61 aClass61_599 = Static129.method2060("New User");

	@OriginalMember(owner = "client!mb", name = "Tb", descriptor = "Lclient!r;")
	public static Class61 aClass61_598 = aClass61_599;

	@OriginalMember(owner = "client!mb", name = "Ub", descriptor = "I")
	public static int anInt1982 = 0;

	@OriginalMember(owner = "client!mb", name = "Vb", descriptor = "I")
	public static int anInt1983 = 0;

	@OriginalMember(owner = "client!mb", name = "cc", descriptor = "Lclient!r;")
	private static Class61 aClass61_601 = Static129.method2060("Your profile will be transferred in:");

	@OriginalMember(owner = "client!mb", name = "Xb", descriptor = "Lclient!r;")
	public static Class61 aClass61_600 = aClass61_601;

	@OriginalMember(owner = "client!mb", name = "dc", descriptor = "I")
	public static int anInt1987 = 0;

	@OriginalMember(owner = "client!mb", name = "ec", descriptor = "Lclient!r;")
	private static Class61 aClass61_602 = Static129.method2060(" ");

	@OriginalMember(owner = "client!mb", name = "fc", descriptor = "Lclient!r;")
	public static Class61 aClass61_603 = aClass61_602;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public static void method1268(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !aBoolean75) {
			Static29.method624();
		} else if (arg0 != -1 && Static23.anInt715 != arg0 && Static52.anInt1345 != 0 && !aBoolean75) {
			Static62.method1069(Static42.aClass26_Sub1_6, Static52.anInt1345, 0, arg0);
		}
		Static23.anInt715 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
	public static void method1277() {
		aClass58_40 = null;
		aClass61_603 = null;
		aClass61_599 = null;
		aClass61_602 = null;
		aClass26_Sub1_14 = null;
		aClass61_601 = null;
		aClass61_598 = null;
		aClass61_600 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!ke;Lclient!r;)Lclient!r;")
	public static Class61 method1278(@OriginalArg(1) Class5_Sub11 arg0, @OriginalArg(2) Class61 arg1) {
		if (arg1.method1731(Static85.aClass61_667) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(21) int local21 = arg1.method1731(Static109.aClass61_840);
			if (local21 == -1) {
				while (true) {
					local21 = arg1.method1731(Static91.aClass61_714);
					if (local21 == -1) {
						while (true) {
							local21 = arg1.method1731(Static111.aClass61_860);
							if (local21 == -1) {
								while (true) {
									local21 = arg1.method1731(Static71.aClass61_533);
									if (local21 == -1) {
										while (true) {
											local21 = arg1.method1731(Static49.aClass61_390);
											if (local21 == -1) {
												while (true) {
													local21 = arg1.method1731(Static49.aClass61_388);
													if (local21 == -1) {
														return arg1;
													}
													@Pc(235) Class61 local235 = Static96.aClass61_746;
													if (Static100.aClass10_5 != null) {
														local235 = Static85.method1529(Static100.aClass10_5.anInt243);
														try {
															if (Static100.aClass10_5.anObject1 != null) {
																@Pc(251) byte[] local251 = ((String) Static100.aClass10_5.anObject1).getBytes("ISO-8859-1");
																local235 = Static24.method501(local251, local251.length, 0);
															}
														} catch (@Pc(260) UnsupportedEncodingException local260) {
														}
													}
													arg1 = Static123.method1929(new Class61[] { arg1.method1730(local21, 0), local235, arg1.method1724(local21 + 4) });
												}
											}
											arg1 = Static123.method1929(new Class61[] { arg1.method1730(local21, 0), Static132.method2186(Static41.method1509(arg0, 4)), arg1.method1724(local21 + 2) });
										}
									}
									arg1 = Static123.method1929(new Class61[] { arg1.method1730(local21, 0), Static132.method2186(Static41.method1509(arg0, 3)), arg1.method1724(local21 + 2) });
								}
							}
							arg1 = Static123.method1929(new Class61[] { arg1.method1730(local21, 0), Static132.method2186(Static41.method1509(arg0, 2)), arg1.method1724(local21 + 2) });
						}
					}
					arg1 = Static123.method1929(new Class61[] { arg1.method1730(local21, 0), Static132.method2186(Static41.method1509(arg0, 1)), arg1.method1724(local21 + 2) });
				}
			}
			arg1 = Static123.method1929(new Class61[] { arg1.method1730(local21, 0), Static132.method2186(Static41.method1509(arg0, 0)), arg1.method1724(local21 + 2) });
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBILclient!ff;)[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] method1281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2) {
		return Static8.method174(arg0, arg2, arg1) ? Static36.method699() : null;
	}
}
