import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lclient!mj;")
	public static Class64 aClass64_9 = null;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
	public static int anInt2799 = 0;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "[S")
	public static short[] aShortArray84 = new short[256];

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "Lclient!qe;")
	public static Class78 aClass78_560 = Static199.method3560("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ld", name = "bb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_561 = Static199.method3560("sl_stars");

	@OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
	public static int anInt2804 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZII)V")
	public static void method2207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub3_Sub28 local7 = Static203.method3592(arg0);
		@Pc(16) int local16 = local7.anInt4641;
		@Pc(19) int local19 = local7.anInt4635;
		@Pc(22) int local22 = local7.anInt4637;
		@Pc(29) int local29 = Class109.anIntArray770[local22 - local19];
		if (arg1 < 0 || local29 < arg1) {
			arg1 = 0;
		}
		local29 <<= local19;
		Static212.method3689(local16, Static94.anIntArray369[local16] & ~local29 | arg1 << local19 & local29);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!nc;I)V")
	public static void method2208(@OriginalArg(0) Class2_Sub3_Sub7 arg0) {
		if (Static226.anInt4903 != 0 && Static226.anInt4903 != 5) {
			return;
		}
		arg0.method886(Static207.aClass78_813, 382, 225, 16777215, -1);
		Static217.method3751(230, 233, 304, 34, 9179409);
		Static217.method3751(231, 234, 302, 32, 0);
		Static217.method3761(232, 235, Static184.anInt4292 * 3, 30, 9179409);
		Static217.method3761(Static184.anInt4292 * 3 + 232, 235, 300 - Static184.anInt4292 * 3, 30, 0);
		arg0.method886(Static105.aClass78_500, 382, 256, 16777215, -1);
	}

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)Z")
	public static boolean method2210() {
		try {
			if (Static9.anInt274 == 2) {
				if (Static209.aClass2_Sub6_2 == null) {
					Static209.aClass2_Sub6_2 = Static228.method380(Static41.aClass72_52, Static129.anInt2911, Static126.anInt2869);
					if (Static209.aClass2_Sub6_2 == null) {
						return false;
					}
				}
				if (Static87.aClass46_1 == null) {
					Static87.aClass46_1 = new Class46(Static29.aClass72_34, Static121.aClass72_288);
				}
				if (Static39.aClass2_Sub21_Sub2_1.method2784(Static209.aClass2_Sub6_2, Static121.aClass72_287, Static87.aClass46_1)) {
					Static39.aClass2_Sub21_Sub2_1.method2792();
					Static39.aClass2_Sub21_Sub2_1.method2797(Static81.anInt1743);
					Static39.aClass2_Sub21_Sub2_1.method2775(Static209.aClass2_Sub6_2, Static142.aBoolean143);
					Static87.aClass46_1 = null;
					Static209.aClass2_Sub6_2 = null;
					Static9.anInt274 = 0;
					Static41.aClass72_52 = null;
					return true;
				}
			}
		} catch (@Pc(66) Exception local66) {
			local66.printStackTrace();
			Static39.aClass2_Sub21_Sub2_1.method2800();
			Static87.aClass46_1 = null;
			Static41.aClass72_52 = null;
			Static9.anInt274 = 0;
			Static209.aClass2_Sub6_2 = null;
		}
		return false;
	}
}
