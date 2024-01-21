import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!cc", name = "lb", descriptor = "Lclient!va;")
	private static Class61 aClass61_104 = Static88.method1421("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "Lclient!va;")
	public static Class61 aClass61_103 = aClass61_104;

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "I")
	public static int anInt385 = 1;

	@OriginalMember(owner = "client!cc", name = "tb", descriptor = "Lclient!va;")
	private static Class61 aClass61_106 = Static88.method1421("Login");

	@OriginalMember(owner = "client!cc", name = "rb", descriptor = "Lclient!va;")
	public static Class61 aClass61_105 = aClass61_106;

	@OriginalMember(owner = "client!cc", name = "yb", descriptor = "I")
	public static int anInt394 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)I")
	public static int method277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIBLclient!ub;)V")
	public static void method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class10_Sub1_Sub1_Sub4 arg3) {
		Static25.aClass15_15.method597();
		Static47.aClass10_Sub1_Sub1_Sub2_13.method873(0, 0);
		arg3.method1543(Static83.aClass61_896, 55, 28, 16777215, true);
		if (arg2 == 0) {
			arg3.method1543(Static9.aClass61_80, 55, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg3.method1543(Static60.aClass61_669, 55, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg3.method1543(Static103.aClass61_404, 55, 41, 16711680, true);
		}
		if (arg2 == 3) {
			arg3.method1543(Static24.aClass61_927, 55, 41, 65535, true);
		}
		arg3.method1543(Static20.aClass61_1071, 184, 28, 16777215, true);
		if (arg1 == 0) {
			arg3.method1543(Static9.aClass61_80, 184, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg3.method1543(Static60.aClass61_669, 184, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg3.method1543(Static103.aClass61_404, 184, 41, 16711680, true);
		}
		arg3.method1543(Static37.aClass61_434, 324, 28, 16777215, true);
		if (arg0 == 0) {
			arg3.method1543(Static9.aClass61_80, 324, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg3.method1543(Static60.aClass61_669, 324, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg3.method1543(Static103.aClass61_404, 324, 41, 16711680, true);
		}
		arg3.method1543(Static47.aClass61_544, 458, 33, 16777215, true);
		try {
			@Pc(144) Graphics local144 = Static38.aCanvas1.getGraphics();
			Static25.aClass15_15.method594(453, 0, local144);
		} catch (@Pc(157) Exception local157) {
			Static38.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	public static void method280() {
		@Pc(11) int local11 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1654 + Static34.anInt1014;
		@Pc(17) int local17 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anInt1649 + Static51.anInt1412;
		if (Static31.anInt927 - local11 < -500 || Static31.anInt927 - local11 > 500 || Static25.anInt783 - local17 < -500 || Static25.anInt783 - local17 > 500) {
			Static25.anInt783 = local17;
			Static31.anInt927 = local11;
		}
		if (Static31.anInt927 != local11) {
			Static31.anInt927 += (local11 - Static31.anInt927) / 16;
		}
		if (local17 != Static25.anInt783) {
			Static25.anInt783 += (local17 - Static25.anInt783) / 16;
		}
		if (Static19.aBooleanArray2[96]) {
			Static47.anInt1307 += (-Static47.anInt1307 - 24) / 2;
		} else if (Static19.aBooleanArray2[97]) {
			Static47.anInt1307 += (24 - Static47.anInt1307) / 2;
		} else {
			Static47.anInt1307 /= 2;
		}
		@Pc(116) int local116 = Static31.anInt927 >> 7;
		@Pc(118) int local118 = 0;
		@Pc(122) int local122 = Static25.anInt783 >> 7;
		if (Static19.aBooleanArray2[98]) {
			Static32.anInt944 += (12 - Static32.anInt944) / 2;
		} else if (Static19.aBooleanArray2[99]) {
			Static32.anInt944 += (-Static32.anInt944 - 12) / 2;
		} else {
			Static32.anInt944 /= 2;
		}
		Static78.anInt2131 += Static32.anInt944 / 2;
		Static79.anInt2144 = Static79.anInt2144 + Static47.anInt1307 / 2 & 0x7FF;
		if (Static78.anInt2131 < 128) {
			Static78.anInt2131 = 128;
		}
		if (Static78.anInt2131 > 383) {
			Static78.anInt2131 = 383;
		}
		@Pc(190) int local190 = Static39.method230(Static31.anInt927, Static101.anInt2582, Static25.anInt783);
		@Pc(208) int local208;
		if (local116 > 3 && local122 > 3 && local116 < 100 && local122 < 100) {
			for (local208 = local116 - 4; local208 <= local116 + 4; local208++) {
				for (@Pc(214) int local214 = local122 - 4; local214 <= local122 + 4; local214++) {
					@Pc(218) int local218 = Static101.anInt2582;
					if (local218 < 3 && (Static21.aByteArrayArrayArray4[1][local208][local214] & 0x2) == 2) {
						local218++;
					}
					@Pc(246) int local246 = local190 - Static37.anIntArrayArrayArray1[local218][local208][local214];
					if (local246 > local118) {
						local118 = local246;
					}
				}
			}
		}
		local208 = local118 * 192;
		if (local208 > 98048) {
			local208 = 98048;
		}
		if (local208 < 32768) {
			local208 = 32768;
		}
		if (local208 > Static12.anInt348) {
			Static12.anInt348 += (local208 - Static12.anInt348) / 24;
		} else if (Static12.anInt348 > local208) {
			Static12.anInt348 += (local208 - Static12.anInt348) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!he;)I")
	public static int method283(@OriginalArg(1) Class11 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method224(Static101.aClass61_1034, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static49.aClass61_570, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static76.aClass61_816, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static61.aClass61_678, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static76.aClass61_814, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static40.aClass61_457, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static40.aClass61_459, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static58.aClass61_643, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static27.aClass61_331, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static82.aClass61_880, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static18.aClass61_202, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static37.aClass61_424, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static24.aClass61_928, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static4.aClass61_4, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static46.aClass61_535, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static8.aClass61_72, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static104.aClass61_1057, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static99.aClass61_1032, Static19.aClass61_220)) {
			local10++;
		}
		if (arg0.method224(Static41.aClass61_482, Static19.aClass61_220)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	public static void method285() {
		aClass61_103 = null;
		aClass61_104 = null;
		aClass61_106 = null;
		aClass61_105 = null;
	}
}
