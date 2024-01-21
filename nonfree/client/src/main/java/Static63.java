import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!la", name = "m", descriptor = "J")
	public static long aLong47;

	@OriginalMember(owner = "client!la", name = "p", descriptor = "I")
	public static int anInt1819;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "Lclient!oa;")
	private static Class56 aClass56_966 = Static33.method650("Classic");

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!oa;")
	private static Class56 aClass56_967 = Static33.method650("purple:");

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!n;")
	public static Class52 aClass52_37 = new Class52(50);

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public static int anInt1814 = 500;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "Lclient!oa;")
	public static Class56 aClass56_968 = aClass56_967;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_969 = Static33.method650("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_970 = aClass56_967;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_971 = aClass56_966;

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt1817 = 0;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "I")
	public static int anInt1818 = -1;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!oa;")
	public static Class56 aClass56_972 = Static33.method650("Null");

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public static int anInt1820 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1209() {
		Static117.aByteArrayArrayArray8 = new byte[4][105][105];
		Static18.aByteArrayArrayArray1 = new byte[4][104][104];
		Static66.anInt569 = 99;
		Static106.anIntArray226 = new int[104];
		Static15.anIntArray29 = new int[104];
		Static64.anIntArray141 = new int[104];
		Static43.aByteArrayArrayArray6 = new byte[4][104][104];
		Static116.aByteArrayArrayArray7 = new byte[4][104][104];
		Static73.anIntArrayArrayArray5 = new int[4][105][105];
		Static54.anIntArray109 = new int[104];
		Static38.anIntArray63 = new int[104];
		Static43.aByteArrayArrayArray5 = new byte[4][104][104];
		Static38.anIntArrayArray8 = new int[105][105];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I")
	public static int method1210() {
		@Pc(7) int local7 = 3;
		if (Static97.anInt2547 < 310) {
			@Pc(16) int local16 = Static57.anInt1615 >> 7;
			@Pc(20) int local20 = Static15.anInt433 >> 7;
			if ((Static66.aByteArrayArrayArray3[Static94.anInt2470][local16][local20] & 0x4) != 0) {
				local7 = Static94.anInt2470;
			}
			@Pc(37) int local37 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 >> 7;
			@Pc(42) int local42 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 >> 7;
			@Pc(54) int local54;
			if (local16 >= local42) {
				local54 = local16 - local42;
			} else {
				local54 = local42 - local16;
			}
			@Pc(68) int local68;
			if (local37 <= local20) {
				local68 = local20 - local37;
			} else {
				local68 = local37 - local20;
			}
			@Pc(88) int local88;
			@Pc(90) int local90;
			if (local68 >= local54) {
				local88 = local54 * 65536 / local68;
				local90 = 32768;
				while (local20 != local37) {
					local90 += local88;
					if (local37 > local20) {
						local20++;
					} else if (local20 > local37) {
						local20--;
					}
					if ((Static66.aByteArrayArrayArray3[Static94.anInt2470][local16][local20] & 0x4) != 0) {
						local7 = Static94.anInt2470;
					}
					if (local90 >= 65536) {
						if (local16 < local42) {
							local16++;
						} else if (local16 > local42) {
							local16--;
						}
						if ((Static66.aByteArrayArrayArray3[Static94.anInt2470][local16][local20] & 0x4) != 0) {
							local7 = Static94.anInt2470;
						}
						local90 -= 65536;
					}
				}
			} else {
				local90 = 32768;
				local88 = local68 * 65536 / local54;
				while (local16 != local42) {
					local90 += local88;
					if (local42 > local16) {
						local16++;
					} else if (local16 > local42) {
						local16--;
					}
					if ((Static66.aByteArrayArrayArray3[Static94.anInt2470][local16][local20] & 0x4) != 0) {
						local7 = Static94.anInt2470;
					}
					if (local90 >= 65536) {
						local90 -= 65536;
						if (local20 < local37) {
							local20++;
						} else if (local37 < local20) {
							local20--;
						}
						if ((Static66.aByteArrayArrayArray3[Static94.anInt2470][local16][local20] & 0x4) != 0) {
							local7 = Static94.anInt2470;
						}
					}
				}
			}
		}
		if ((Static66.aByteArrayArrayArray3[Static94.anInt2470][Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3187 >> 7][Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.anInt3196 >> 7] & 0x4) != 0) {
			local7 = Static94.anInt2470;
		}
		return local7;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method1211() {
		aClass56_970 = null;
		aClass56_968 = null;
		aClass56_972 = null;
		aClass56_969 = null;
		aClass56_967 = null;
		aClass56_971 = null;
		aClass52_37 = null;
		aClass56_966 = null;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)[Lclient!oc;")
	public static Class3_Sub1_Sub1_Sub4[] method1212() {
		@Pc(8) Class3_Sub1_Sub1_Sub4[] local8 = new Class3_Sub1_Sub1_Sub4[Static59.anInt1711];
		for (@Pc(10) int local10 = 0; local10 < Static59.anInt1711; local10++) {
			@Pc(20) Class3_Sub1_Sub1_Sub4 local20 = local8[local10] = new Class3_Sub1_Sub1_Sub4();
			local20.anInt2251 = Static64.anInt1829;
			local20.anInt2248 = Static84.anInt2277;
			local20.anInt2247 = Static47.anIntArray96[local10];
			local20.anInt2249 = Static69.anIntArray161[local10];
			local20.anInt2250 = Static51.anIntArray103[local10];
			local20.anInt2252 = Static76.anIntArray179[local10];
			local20.anIntArray190 = Static69.anIntArray163;
			local20.aByteArray30 = Static116.aByteArrayArray10[local10];
		}
		Static127.method2040();
		return local8;
	}
}
