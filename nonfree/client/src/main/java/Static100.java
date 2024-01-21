import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!u", name = "z", descriptor = "Lclient!le;")
	public static Class36 aClass36_35 = new Class36(200);

	@OriginalMember(owner = "client!u", name = "C", descriptor = "I")
	public static int anInt2945 = -1;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	public static int anInt2949 = 0;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "[Lclient!ub;")
	public static Class61[] aClass61Array1 = new Class61[13];

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1233 = Static34.method846("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!u", name = "J", descriptor = "[I")
	public static int[] anIntArray276 = new int[100];

	@OriginalMember(owner = "client!u", name = "K", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1234 = Static34.method846("Angreifen");

	@OriginalMember(owner = "client!u", name = "N", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1237 = Static34.method846("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!u", name = "L", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1235 = aClass55_1237;

	@OriginalMember(owner = "client!u", name = "M", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1236 = aClass55_1237;

	@OriginalMember(owner = "client!u", name = "O", descriptor = "[I")
	public static int[] anIntArray277 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!u", name = "P", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1238 = aClass55_1233;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1239 = Static34.method846("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!sd;")
	public static Class6_Sub2_Sub11 method1912(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub2_Sub11 local10 = (Class6_Sub2_Sub11) Static8.aClass36_5.method1154((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static92.aClass40_32.method1243(arg0, 4);
		local10 = new Class6_Sub2_Sub11();
		if (local25 != null) {
			local10.method1772(arg0, new Class6_Sub1(local25));
		}
		local10.method1771();
		Static8.aClass36_5.method1161((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static void method1913() {
		aClass55_1237 = null;
		aClass55_1239 = null;
		aClass55_1238 = null;
		aClass61Array1 = null;
		anIntArray276 = null;
		anIntArray277 = null;
		aClass55_1234 = null;
		aClass36_35 = null;
		aClass55_1233 = null;
		aClass55_1236 = null;
		aClass55_1235 = null;
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)[Lclient!bd;")
	public static Class6_Sub2_Sub2_Sub1[] method1914() {
		@Pc(4) Class6_Sub2_Sub2_Sub1[] local4 = new Class6_Sub2_Sub2_Sub1[Static68.anInt2016];
		for (@Pc(6) int local6 = 0; local6 < Static68.anInt2016; local6++) {
			@Pc(16) Class6_Sub2_Sub2_Sub1 local16 = local4[local6] = new Class6_Sub2_Sub2_Sub1();
			local16.anInt367 = Static94.anInt2642;
			local16.anInt365 = Static88.anInt3274;
			local16.anInt366 = Static34.anIntArray80[local6];
			local16.anInt363 = Static94.anIntArray248[local6];
			local16.anInt364 = Static72.anIntArray195[local6];
			local16.anInt368 = Static38.anIntArray95[local6];
			local16.anIntArray24 = Static44.anIntArray257;
			local16.aByteArray4 = Static67.aByteArrayArray6[local6];
		}
		Static6.method238();
		return local4;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	public static void method1915() {
		if (Static94.anInt2645 < 2 && Static43.anInt1463 == 0 && Static102.anInt3029 == 0) {
			return;
		}
		@Pc(49) Class55 local49;
		if (Static43.anInt1463 == 1 && Static94.anInt2645 < 2) {
			local49 = Static89.method1698(new Class55[] { Static34.aClass55_513, Static52.aClass55_637, Static22.aClass55_370, Static92.aClass55_1076 });
		} else if (Static102.anInt3029 == 1 && Static94.anInt2645 < 2) {
			local49 = Static89.method1698(new Class55[] { Static66.aClass55_780, Static52.aClass55_637, Static86.aClass55_1000, Static92.aClass55_1076 });
		} else {
			local49 = Static76.aClass55Array20[Static94.anInt2645 - 1];
		}
		if (Static94.anInt2645 > 2) {
			local49 = Static89.method1698(new Class55[] { local49, Static106.aClass55_963, Static58.method1196(Static94.anInt2645 - 2), Static52.aClass55_630 });
		}
		Static81.aClass6_Sub2_Sub2_Sub4_4.method1298(local49, 4, 16777215, Static85.anInt2389 / 1000);
	}
}
