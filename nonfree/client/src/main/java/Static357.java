import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "[I")
	public static final int[] anIntArray333 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5425(@OriginalArg(1) String arg0) {
		if (!Static546.aBoolean727 || (Static655.anInt10731 & 0x18) == 0) {
			return;
		}
		@Pc(22) boolean local22 = false;
		@Pc(24) int local24 = Static258.anInt4846;
		@Pc(26) int[] local26 = Static43.anIntArray35;
		for (@Pc(28) int local28 = 0; local28 < local24; local28++) {
			@Pc(35) Class4_Sub3_Sub3_Sub3_Sub2 local35 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local26[local28]];
			if (local35.aString37 != null && local35.aString37.equalsIgnoreCase(arg0) && (local35 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 && (Static655.anInt10731 & 0x10) != 0 || (Static655.anInt10731 & 0x8) != 0)) {
				@Pc(78) Class14_Sub54 local78 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static538.aClass251_218);
				local78.aClass14_Sub21_Sub2_2.method7733(local26[local28]);
				local78.aClass14_Sub21_Sub2_2.method7730(Static613.anInt10111);
				local78.aClass14_Sub21_Sub2_2.method7705(Static578.anInt9567);
				local78.aClass14_Sub21_Sub2_2.method7732(0);
				local78.aClass14_Sub21_Sub2_2.method7702(Static254.anInt4789);
				Static277.aClass347_2.method8308(local78);
				Static369.method5538(local35.anIntArray201[0], true, local35.method2870(0), 0, -2, 0, local35.method2870(0), local35.anIntArray200[0]);
				local22 = true;
				break;
			}
		}
		if (!local22) {
			Static354.method5381(Static21.aClass21_20.method324(Static26.anInt352) + arg0);
		}
		if (Static546.aBoolean727) {
			Static214.method3269();
		}
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)V")
	public static void method5426() {
		@Pc(8) int local8 = Static181.aClass14_Sub26_9.aClass43_Sub7_1.method2650();
		if (local8 == 0) {
			Static436.aByteArrayArrayArray11 = null;
			Static576.method8247(0);
		} else if (local8 == 1) {
			Static167.method2424((byte) 0);
			Static576.method8247(512);
			if (Static446.aByteArrayArrayArray12 != null) {
				Static181.method2654();
			}
		} else {
			Static167.method2424((byte) (Static688.anInt11168 - 4 & 0xFF));
			Static576.method8247(2);
		}
		Static612.anInt10103 = Static391.anInt6811;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V")
	public static void method5427(@OriginalArg(1) int arg0) {
		Static457.anInt7618 = arg0;
		@Pc(7) Class317 local7 = Static306.aClass317_31;
		synchronized (Static306.aClass317_31) {
			Static306.aClass317_31.method7873();
		}
		local7 = Static111.aClass317_12;
		synchronized (Static111.aClass317_12) {
			Static111.aClass317_12.method7873();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZII)Z")
	public static boolean method5429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
