import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
	public static int anInt2853;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "Lclient!vd;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
	public static int anInt2852 = 0;

	@OriginalMember(owner = "client!wd", name = "X", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1604 = Static75.method1216("");

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1600 = aClass4_1604;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1601 = aClass4_1604;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array11 = new Class3_Sub1_Sub4_Sub2[1000];

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1602 = aClass4_1604;

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1603 = aClass4_1604;

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "[[B")
	public static byte[][] aByteArrayArray10 = new byte[1000][];

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
	public static final int anInt2856 = 2301979;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "[B")
	public static byte[] aByteArray24 = new byte[520];

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	public static final int anInt2857 = 7759444;

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1605 = aClass4_1604;

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
	public static int anInt2860 = 0;

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1606 = aClass4_1604;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)I")
	public static int method1933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(13) int local13 = arg2 & arg0 - 1;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(23) int local23 = arg0 - 1 & arg1;
		@Pc(28) int local28 = Static4.method112(local17, local7);
		@Pc(35) int local35 = Static4.method112(local17, local7 + 1);
		@Pc(47) int local47 = Static4.method112(local17 + 1, local7);
		@Pc(56) int local56 = Static4.method112(local17 + 1, local7 + 1);
		@Pc(63) int local63 = Static5.method147(arg0, local13, local35, local28);
		@Pc(70) int local70 = Static5.method147(arg0, local13, local56, local47);
		return Static5.method147(arg0, local23, local70, local63);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public static void method1934() {
		aClass3_Sub1_Sub4_Sub4_3 = null;
		aClass4_1606 = null;
		aClass4_1602 = null;
		aByteArrayArray10 = null;
		aClass4_1603 = null;
		aClass4_1600 = null;
		aClass4_1601 = null;
		aClass4_1604 = null;
		aClass4_1605 = null;
		aClass3_Sub1_Sub4_Sub2Array11 = null;
		anIntArray337 = null;
		aByteArray24 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([BZ)V")
	public static void method1935(@OriginalArg(0) byte[] arg0) {
		@Pc(6) Class3_Sub4 local6 = new Class3_Sub4(arg0);
		local6.anInt627 = arg0.length - 2;
		Static64.anInt1616 = local6.method459();
		Static55.anIntArray188 = new int[Static64.anInt1616];
		Static15.anIntArray31 = new int[Static64.anInt1616];
		Static16.aByteArrayArray2 = new byte[Static64.anInt1616][];
		Static39.anIntArray112 = new int[Static64.anInt1616];
		Static34.anIntArray96 = new int[Static64.anInt1616];
		local6.anInt627 = arg0.length - Static64.anInt1616 * 8 - 7;
		Static5.anInt256 = local6.method459();
		Static77.anInt1836 = local6.method459();
		@Pc(62) int local62 = (local6.method446() & 0xFF) + 1;
		for (@Pc(69) int local69 = 0; local69 < Static64.anInt1616; local69++) {
			Static55.anIntArray188[local69] = local6.method459();
		}
		for (@Pc(87) int local87 = 0; local87 < Static64.anInt1616; local87++) {
			Static34.anIntArray96[local87] = local6.method459();
		}
		for (@Pc(101) int local101 = 0; local101 < Static64.anInt1616; local101++) {
			Static15.anIntArray31[local101] = local6.method459();
		}
		for (@Pc(115) int local115 = 0; local115 < Static64.anInt1616; local115++) {
			Static39.anIntArray112[local115] = local6.method459();
		}
		local6.anInt627 = arg0.length + 3 - Static64.anInt1616 * 8 - local62 * 3 - 7;
		Static42.anIntArray156 = new int[local62];
		for (@Pc(149) int local149 = 1; local149 < local62; local149++) {
			Static42.anIntArray156[local149] = local6.method458();
			if (Static42.anIntArray156[local149] == 0) {
				Static42.anIntArray156[local149] = 1;
			}
		}
		local6.anInt627 = 0;
		for (@Pc(178) int local178 = 0; local178 < Static64.anInt1616; local178++) {
			@Pc(184) int local184 = Static15.anIntArray31[local178];
			@Pc(188) int local188 = Static39.anIntArray112[local178];
			@Pc(192) int local192 = local188 * local184;
			@Pc(195) byte[] local195 = new byte[local192];
			Static16.aByteArrayArray2[local178] = local195;
			@Pc(203) int local203 = local6.method446();
			@Pc(210) int local210;
			if (local203 == 0) {
				for (local210 = 0; local210 < local192; local210++) {
					local195[local210] = local6.method434();
				}
			} else if (local203 == 1) {
				for (local210 = 0; local210 < local184; local210++) {
					for (@Pc(235) int local235 = 0; local235 < local188; local235++) {
						local195[local184 * local235 + local210] = local6.method434();
					}
				}
			}
		}
	}
}
