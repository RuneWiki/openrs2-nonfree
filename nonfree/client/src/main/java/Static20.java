import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
	public static int anInt949 = 0;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!rc;")
	private static Class55 aClass55_337 = Static34.method846("white:");

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!rc;")
	public static Class55 aClass55_338 = Static34.method846("compass");

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!rc;")
	private static Class55 aClass55_343 = Static34.method846("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!rc;")
	public static Class55 aClass55_339 = aClass55_343;

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!mb;")
	public static Class38 aClass38_11 = new Class38(4096);

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_340 = aClass55_337;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!rc;")
	public static Class55 aClass55_341 = Static34.method846("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_342 = Static34.method846("p11_full");

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "Lclient!rc;")
	private static Class55 aClass55_346 = Static34.method846("Enter name of friend to add to list");

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_344 = aClass55_346;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!rc;")
	private static Class55 aClass55_345 = Static34.method846("Enter message to send to ");

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!rc;")
	public static Class55 aClass55_347 = Static34.method846("backright1");

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_348 = aClass55_345;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!pb;Lclient!pb;B)V")
	public static void method590(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1) {
		Static13.aClass40_13 = arg1;
		Static79.aClass40_29 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method591() {
		aClass55_339 = null;
		aClass55_344 = null;
		aClass55_347 = null;
		aClass55_338 = null;
		aClass55_342 = null;
		aClass55_337 = null;
		aClass55_348 = null;
		aClass55_343 = null;
		aClass55_346 = null;
		aClass55_340 = null;
		aClass38_11 = null;
		aClass55_341 = null;
		aClass55_345 = null;
		aByteArrayArrayArray6 = null;
		aByteArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public static void method592() {
		for (@Pc(7) int local7 = 0; local7 < Static85.anInt2391; local7++) {
			@Pc(13) int local13 = Static14.anIntArray47[local7]--;
			if (Static14.anIntArray47[local7] >= -10) {
				@Pc(84) Class28 local84 = Static55.aClass28Array1[local7];
				if (local84 == null) {
					local84 = Static117.method872(Static55.aClass40_Sub1_24, Static95.anIntArray259[local7]);
					if (local84 == null) {
						continue;
					}
					Static14.anIntArray47[local7] += local84.method870();
					Static55.aClass28Array1[local7] = local84;
				}
				if (Static14.anIntArray47[local7] < 0) {
					@Pc(122) int local122;
					if (Static26.anIntArray213[local7] == 0) {
						local122 = Static46.anInt3215;
					} else {
						@Pc(132) int local132 = (Static26.anIntArray213[local7] & 0xFF) * 128;
						@Pc(140) int local140 = Static26.anIntArray213[local7] >> 16 & 0xFF;
						@Pc(148) int local148 = Static26.anIntArray213[local7] >> 8 & 0xFF;
						@Pc(157) int local157 = local148 * 128 + 64 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2744;
						@Pc(167) int local167 = local140 * 128 + 64 - Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anInt2710;
						if (local157 < 0) {
							local157 = -local157;
						}
						if (local167 < 0) {
							local167 = -local167;
						}
						@Pc(189) int local189 = local167 + local157 - 128;
						if (local132 < local189) {
							Static14.anIntArray47[local7] = -100;
							continue;
						}
						if (local189 < 0) {
							local189 = 0;
						}
						local122 = Static74.anInt1807 * (local132 - local189) / local132;
					}
					@Pc(216) Class6_Sub4_Sub1 local216 = local84.method871().method565(Static87.aClass10_1);
					@Pc(221) Class6_Sub3_Sub1 local221 = Static119.method1142(local216, local122);
					local221.method1139(Static23.anIntArray65[local7] - 1);
					Static26.aClass6_Sub3_Sub2_3.method1975(local221);
					Static14.anIntArray47[local7] = -100;
				}
			} else {
				Static85.anInt2391--;
				for (@Pc(27) int local27 = local7; local27 < Static85.anInt2391; local27++) {
					Static95.anIntArray259[local27] = Static95.anIntArray259[local27 + 1];
					Static55.aClass28Array1[local27] = Static55.aClass28Array1[local27 + 1];
					Static23.anIntArray65[local27] = Static23.anIntArray65[local27 + 1];
					Static14.anIntArray47[local27] = Static14.anIntArray47[local27 + 1];
					Static26.anIntArray213[local27] = Static26.anIntArray213[local27 + 1];
				}
				local7--;
			}
		}
		if (Static46.anInt3212 <= 0) {
			return;
		}
		Static46.anInt3212 -= 20;
		if (Static46.anInt3212 < 0) {
			Static46.anInt3212 = 0;
		}
		if (Static46.anInt3212 == 0 && Static96.anInt2811 != 0 && Static6.anInt268 != -1) {
			Static77.method1531(Static96.anInt2811, 0, Static6.anInt268, Static43.aClass40_Sub1_19);
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method593(@OriginalArg(1) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static76.anInt2223 > 0) {
			local26 = Static109.aByteArrayArray9[--Static76.anInt2223];
			Static109.aByteArrayArray9[Static76.anInt2223] = null;
			return local26;
		} else if (arg0 == 5000 && Static31.anInt1204 > 0) {
			local26 = Static75.aByteArrayArray7[--Static31.anInt1204];
			Static75.aByteArrayArray7[Static31.anInt1204] = null;
			return local26;
		} else if (arg0 == 30000 && Static21.anInt1005 > 0) {
			local26 = Static21.aByteArrayArray2[--Static21.anInt1005];
			Static21.aByteArrayArray2[Static21.anInt1005] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}
}
