import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static volatile int anInt460 = -1;

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
	public static int anInt465 = 0;

	@OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
	public static int[] anIntArray65 = new int[1000];

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public static int anInt472 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method334() {
		Static69.aByteArrayArrayArray5 = null;
		Static1.anIntArray1 = null;
		Static79.anIntArray153 = null;
		Static57.aByteArrayArrayArray4 = null;
		Static79.anIntArrayArray29 = null;
		Static3.anIntArray13 = null;
		Static73.aByteArrayArrayArray6 = null;
		Static86.anIntArrayArrayArray5 = null;
		Static82.aByteArrayArrayArray7 = null;
		Static66.anIntArray297 = null;
		Static48.aByteArrayArrayArray10 = null;
		Static12.anIntArray52 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	public static void method335() {
		anIntArray65 = null;
		aClass3_Sub3_Sub2_Sub2Array7 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLclient!qd;ILclient!r;)V")
	public static void method338(@OriginalArg(1) Class54_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(7) Class3_Sub12 local7 = new Class3_Sub12();
		local7.aLong83 = arg1;
		local7.aClass54_Sub1_45 = arg0;
		local7.anInt2521 = 1;
		local7.aClass55_4 = arg2;
		@Pc(22) Class28 local22 = Static106.aClass28_7;
		synchronized (Static106.aClass28_7) {
			Static106.aClass28_7.method889(local7);
		}
		Static56.method1074();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)V")
	public static void method342(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static43.anInt1241; local19++) {
			if (arg0 == Static53.aLongArray8[local19]) {
				Static75.aBoolean101 = true;
				Static43.anInt1241--;
				for (@Pc(43) int local43 = local19; local43 < Static43.anInt1241; local43++) {
					Static46.aClass27Array5[local43] = Static46.aClass27Array5[local43 + 1];
					Static22.anIntArray116[local43] = Static22.anIntArray116[local43 + 1];
					Static53.aLongArray8[local43] = Static53.aLongArray8[local43 + 1];
				}
				Static78.aClass3_Sub11_Sub1_3.method1478(158);
				Static78.aClass3_Sub11_Sub1_3.method1468(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
	public static void method345() {
		for (@Pc(16) Class3_Sub3_Sub1_Sub6 local16 = (Class3_Sub3_Sub1_Sub6) Static19.aClass28_5.method884(); local16 != null; local16 = (Class3_Sub3_Sub1_Sub6) Static19.aClass28_5.method875()) {
			if (Static68.anInt1747 != local16.anInt1870 || local16.aBoolean96) {
				local16.method1883();
			} else if (local16.anInt1868 <= Static2.anInt38) {
				local16.method1302(Static39.anInt989);
				if (local16.aBoolean96) {
					local16.method1883();
				} else {
					Static76.aClass18_1.method516(local16.anInt1870, local16.anInt1867, local16.anInt1869, local16.anInt1865, 60, local16, 0, -1, false);
				}
			}
		}
	}
}
