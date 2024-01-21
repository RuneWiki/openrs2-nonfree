import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	public static int anInt1413;

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lclient!kh;")
	public static Class29 aClass29_27;

	@OriginalMember(owner = "client!gd", name = "tb", descriptor = "I")
	public static int anInt1427;

	@OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
	public static int anInt1420 = 0;

	@OriginalMember(owner = "client!gd", name = "ib", descriptor = "Lclient!cd;")
	public static Class10 aClass10_609 = Static51.method932(")1p");

	@OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_610 = Static51.method932("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIZ)Lclient!ea;")
	public static Class2_Sub1_Sub4_Sub2 method1047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(23) long local23 = ((long) arg2 << 40) + ((long) arg0 << 38) + ((long) arg1 << 16) + (long) arg3;
		@Pc(33) Class2_Sub1_Sub4_Sub2 local33;
		if (!arg4) {
			local33 = (Class2_Sub1_Sub4_Sub2) Static40.aClass72_10.method2259(local23);
			if (local33 != null) {
				return local33;
			}
		}
		@Pc(41) Class2_Sub1_Sub6 local41 = Static78.method577(arg3);
		if (arg1 > 1 && local41.anIntArray172 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (arg1 >= local41.anIntArray171[local51] && local41.anIntArray171[local51] != 0) {
					local49 = local41.anIntArray172[local51];
				}
			}
			if (local49 != -1) {
				local41 = Static78.method577(local49);
			}
		}
		@Pc(87) Class2_Sub1_Sub3_Sub3 local87 = local41.method1090(1);
		if (local87 == null) {
			return null;
		}
		@Pc(93) Class2_Sub1_Sub4_Sub2 local93 = null;
		if (local41.anInt1506 != -1) {
			local93 = method1047(1, 10, 0, local41.anInt1512, true);
			if (local93 == null) {
				return null;
			}
		}
		@Pc(117) int[] local117 = Static172.anIntArray298;
		@Pc(119) int local119 = Static172.anInt2832;
		@Pc(122) int[] local122 = new int[4];
		@Pc(124) int local124 = Static172.anInt2829;
		Static172.method2027(local122);
		local33 = new Class2_Sub1_Sub4_Sub2(36, 32);
		Static172.method2019(local33.anIntArray71, 36, 32);
		Static172.method2014();
		Static125.method2032();
		Static125.method2033(16, 16);
		@Pc(145) int local145 = local41.anInt1509;
		if (arg4) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg0 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		Static125.aBoolean124 = false;
		@Pc(177) int local177 = local145 * Class2_Sub1_Sub4_Sub4.anIntArray304[local41.anInt1518] >> 16;
		@Pc(186) int local186 = Class2_Sub1_Sub4_Sub4.anIntArray299[local41.anInt1518] * local145 >> 16;
		local87.method825();
		local87.method818(local41.anInt1532, local41.anInt1496, local41.anInt1518, local41.anInt1529, local186 + local87.anInt3614 / 2 + local41.anInt1515, local177 + local41.anInt1515);
		if (arg0 >= 1) {
			local33.method726(1);
		}
		if (arg0 >= 2) {
			local33.method726(16777215);
		}
		if (arg2 != 0) {
			local33.method724(arg2);
		}
		Static172.method2019(local33.anIntArray71, 36, 32);
		if (local41.anInt1506 != -1) {
			local93.method738(0, 0);
		}
		if (!arg4 && (local41.anInt1507 == 1 || arg1 != 1) && arg1 != -1) {
			Static7.aClass2_Sub1_Sub4_Sub1_Sub1_1.method532(Static152.method2371(arg1), 0, 9, 16776960, 1);
		}
		if (!arg4) {
			Static40.aClass72_10.method2254(local33, local23);
		}
		Static172.method2019(local117, local119, local124);
		Static172.method2024(local122);
		Static125.method2032();
		Static125.aBoolean124 = true;
		return local33;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method1048() {
		aClass10_609 = null;
		aClass29_27 = null;
		aClass10_610 = null;
	}
}
