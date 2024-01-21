import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!me", name = "ad", descriptor = "I")
	public static int anInt1825;

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_877 = Static38.method736("(Z");

	@OriginalMember(owner = "client!me", name = "ic", descriptor = "Lclient!qa;")
	public static Class54 aClass54_28 = new Class54(260);

	@OriginalMember(owner = "client!me", name = "xc", descriptor = "Lclient!vc;")
	private static Class71 aClass71_880 = Static38.method736("Off");

	@OriginalMember(owner = "client!me", name = "Vc", descriptor = "Lclient!vc;")
	public static Class71 aClass71_883 = aClass71_880;

	@OriginalMember(owner = "client!me", name = "bd", descriptor = "Lclient!vc;")
	public static Class71 aClass71_884 = Static38.method736("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!me", name = "fd", descriptor = "Lclient!vc;")
	public static Class71 aClass71_886 = Static38.method736("Null");

	@OriginalMember(owner = "client!me", name = "gd", descriptor = "Lclient!qa;")
	public static Class54 aClass54_29 = new Class54(64);

	@OriginalMember(owner = "client!me", name = "jd", descriptor = "I")
	public static int anInt1828 = 500;

	@OriginalMember(owner = "client!me", name = "ld", descriptor = "[I")
	public static int[] anIntArray224 = new int[2048];

	@OriginalMember(owner = "client!me", name = "md", descriptor = "Lclient!vc;")
	public static Class71 aClass71_887 = Static38.method736("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!td;IBII)V")
	public static void method1195(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class5_Sub4 local7 = new Class5_Sub4();
		local7.anInt818 = arg1.anInt2549 * 128;
		@Pc(16) int local16 = arg1.anInt2559;
		local7.anInt812 = arg1.anInt2565;
		local7.anInt825 = arg4 * 128;
		@Pc(28) int local28 = arg1.anInt2572;
		local7.anInt810 = arg1.anInt2578;
		local7.anInt816 = arg2;
		local7.anIntArray102 = arg1.anIntArray269;
		local7.anInt813 = arg1.anInt2554;
		local7.anInt823 = arg0 * 128;
		if (arg3 == 1 || arg3 == 3) {
			local28 = arg1.anInt2559;
			local16 = arg1.anInt2572;
		}
		local7.anInt817 = (arg0 + local16) * 128;
		local7.anInt814 = (arg4 + local28) * 128;
		if (arg1.anIntArray267 != null) {
			local7.aClass5_Sub1_Sub15_1 = arg1;
			local7.method603();
		}
		Static14.aClass52_3.method1362(local7);
		if (local7.anIntArray102 != null) {
			local7.anInt824 = (int) ((double) (local7.anInt810 - local7.anInt812) * Math.random()) + local7.anInt812;
		}
	}

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	public static void method1197() {
		aClass71_884 = null;
		aClass54_29 = null;
		aClass71_883 = null;
		aClass71_887 = null;
		aClass71_877 = null;
		aClass71_880 = null;
		aClass71_886 = null;
		anIntArray224 = null;
		aClass54_28 = null;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] method1202() {
		@Pc(13) Class5_Sub1_Sub10_Sub1[] local13 = new Class5_Sub1_Sub10_Sub1[Static87.anInt2053];
		for (@Pc(15) int local15 = 0; local15 < Static87.anInt2053; local15++) {
			@Pc(25) Class5_Sub1_Sub10_Sub1 local25 = local13[local15] = new Class5_Sub1_Sub10_Sub1();
			local25.anInt1353 = Static29.anInt778;
			local25.anInt1354 = Static118.anInt2914;
			local25.anInt1352 = Static66.anIntArray192[local15];
			local25.anInt1355 = Static40.anIntArray85[local15];
			local25.anInt1350 = Static5.anIntArray8[local15];
			local25.anInt1351 = Static48.anIntArray157[local15];
			local25.anIntArray154 = Static40.anIntArray84;
			local25.aByteArray8 = Static116.aByteArrayArray10[local15];
		}
		Static74.method676();
		return local13;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[BI)I")
	public static int method1206(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static58.method1031(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Z")
	public static boolean method1207(@OriginalArg(0) int arg0) {
		if (!Static106.method1689(arg0)) {
			return false;
		}
		@Pc(18) boolean local18 = false;
		@Pc(22) Class5_Sub1_Sub11[] local22 = Static30.aClass5_Sub1_Sub11ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class5_Sub1_Sub11 local30 = local22[local24];
			if (local30 != null && local30.anInt1790 == 6) {
				@Pc(55) int local55;
				if (local30.anInt1788 != -1 || local30.anInt1823 != -1) {
					@Pc(50) boolean local50 = Static7.method187(local30);
					if (local50) {
						local55 = local30.anInt1823;
					} else {
						local55 = local30.anInt1788;
					}
					if (local55 != -1) {
						@Pc(68) Class5_Sub1_Sub18 local68 = Static57.method1017(local55);
						local30.anInt1798 += Static58.anInt1515;
						while (local30.anInt1798 > local68.anIntArray290[local30.anInt1767]) {
							local30.anInt1798 -= local68.anIntArray290[local30.anInt1767];
							local30.anInt1767++;
							if (local30.anInt1767 >= local68.anIntArray294.length) {
								local30.anInt1767 -= local68.anInt2945;
								if (local30.anInt1767 < 0 || local68.anIntArray294.length <= local30.anInt1767) {
									local30.anInt1767 = 0;
								}
							}
							local18 = true;
						}
					}
				}
				if (local30.anInt1771 != 0 && !local30.aBoolean75) {
					local18 = true;
					@Pc(151) int local151 = local30.anInt1771 >> 16;
					local55 = local30.anInt1771 << 16 >> 16;
					@Pc(162) int local162 = local151 * Static58.anInt1515;
					local55 *= Static58.anInt1515;
					local30.anInt1829 = local30.anInt1829 + local162 & 0x7FF;
					local30.anInt1808 = local30.anInt1808 + local55 & 0x7FF;
				}
			}
		}
		return local18;
	}
}
