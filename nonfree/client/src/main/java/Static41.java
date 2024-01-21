import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ha", name = "sb", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_7;

	@OriginalMember(owner = "client!ha", name = "xb", descriptor = "Lclient!eb;")
	public static Class17 aClass17_22 = new Class17(50);

	@OriginalMember(owner = "client!ha", name = "yb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_597 = Static59.method1195("Your account has been disabled)3");

	@OriginalMember(owner = "client!ha", name = "Ib", descriptor = "Lclient!qf;")
	public static Class60 aClass60_598 = aClass60_597;

	@OriginalMember(owner = "client!ha", name = "Mb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_599 = Static59.method1195(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ha", name = "Ob", descriptor = "Lclient!qf;")
	public static Class60 aClass60_600 = Static59.method1195("<col=ff7000>");

	@OriginalMember(owner = "client!ha", name = "Pb", descriptor = "[I")
	public static int[] anIntArray159 = new int[200];

	@OriginalMember(owner = "client!ha", name = "Qb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_601 = Static59.method1195(")1");

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public static void method938() {
		if (Static36.anInt1216 == 0) {
			return;
		}
		@Pc(13) Class3_Sub1_Sub2_Sub2 local13 = Static20.aClass3_Sub1_Sub2_Sub2_2;
		@Pc(15) int local15 = 0;
		if (Static11.anInt345 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static126.aClass60Array23[local21] != null) {
				@Pc(36) int local36 = Static57.anIntArray384[local21];
				@Pc(40) Class60 local40 = Static99.aClass60Array18[local21];
				@Pc(42) byte local42 = 0;
				if (local40 != null && local40.method1853(Static43.aClass60_624)) {
					local42 = 1;
					local40 = local40.method1829(5);
				}
				if (local40 != null && local40.method1853(Static103.aClass60_1258)) {
					local42 = 2;
					local40 = local40.method1829(5);
				}
				@Pc(101) int local101;
				if ((local36 == 3 || local36 == 7) && (local36 == 7 || Static57.anInt3392 == 0 || Static57.anInt3392 == 1 && Static67.method1384(local40))) {
					local101 = 329 - local15 * 13;
					local15++;
					local13.method847(Static56.aClass60_789, 4, local101 - 1, 65535, 0);
					@Pc(119) int local119 = local13.method848(Static56.aClass60_789) + 4;
					local119 += local13.method850(32);
					if (local42 == 1) {
						Static98.aClass3_Sub1_Sub2_Sub4Array8[0].method1903(local119, local101 - 12);
						local119 += 14;
					}
					if (local42 == 2) {
						Static98.aClass3_Sub1_Sub2_Sub4Array8[1].method1903(local119, local101 - 12);
						local119 += 14;
					}
					local13.method847(Static60.method1211(new Class60[] { local40, Static8.aClass60_134, Static126.aClass60Array23[local21] }), local119, local101 - 1, 65535, 0);
					if (local15 >= 5) {
						return;
					}
				}
				if (local36 == 5 && Static57.anInt3392 < 2) {
					local101 = 329 - local15 * 13;
					local13.method847(Static126.aClass60Array23[local21], 4, local101 - 1, 65535, 0);
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
				if (local36 == 6 && Static57.anInt3392 < 2) {
					local101 = 329 - local15 * 13;
					local13.method847(Static60.method1211(new Class60[] { Static128.aClass60_1432, Static30.aClass60_408, local40, Static8.aClass60_134, Static126.aClass60Array23[local21] }), 4, local101 - 1, 65535, 0);
					local15++;
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public static void method940() {
		aClass17_22 = null;
		aClass60_601 = null;
		aClass60_598 = null;
		aClass60_600 = null;
		anIntArray159 = null;
		aClass60_597 = null;
		aClass25_Sub1_7 = null;
		aClass60_599 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLclient!mf;)V")
	public static void method941(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(8) int local8 = arg0.anInt2286 >> 16;
		if (local8 == Static78.anInt2429 || local8 == Static129.anInt3460) {
			Static71.aBoolean49 = true;
		}
		if (Static119.anInt3242 == local8 || local8 == Static22.anIntArray87[Static51.anInt1340]) {
			Static118.aBoolean115 = true;
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IB)Lclient!ff;")
	public static Class3_Sub1_Sub6 method942(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub6 local10 = (Class3_Sub1_Sub6) Static112.aClass17_50.method643((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static89.aClass25_27.method931(arg0, 14);
		local10 = new Class3_Sub1_Sub6();
		if (local20 != null) {
			local10.method750(new Class3_Sub12(local20));
		}
		Static112.aClass17_50.method644((long) arg0, local10);
		return local10;
	}
}
