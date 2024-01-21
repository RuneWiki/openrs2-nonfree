import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	public static int anInt2773;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1286 = Static193.method3027(")1");

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1287 = Static193.method3027("::qa_op_test");

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[I")
	public static final int[] anIntArray200 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1288 = Static193.method3027("AUS");

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "[Lclient!oc;")
	public static final Class70[] aClass70Array48 = new Class70[500];

	@OriginalMember(owner = "client!nf", name = "q", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1289 = null;

	@OriginalMember(owner = "client!nf", name = "t", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1290 = Static193.method3027("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
	public static int anInt2776 = 0;

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
	public static int anInt2777 = -1;

	@OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
	public static int anInt2779 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[Lclient!oc;I)Lclient!oc;")
	public static Class70 method1941(@OriginalArg(0) int arg0, @OriginalArg(2) Class70[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			if (arg1[local7 + arg0] == null) {
				arg1[local7 + arg0] = Static89.aClass70_307;
			}
			local5 += arg1[local7 + arg0].anInt2899;
		}
		@Pc(36) byte[] local36 = new byte[local5];
		@Pc(38) int local38 = 0;
		@Pc(47) Class70 local47;
		for (@Pc(40) int local40 = 0; local40 < arg2; local40++) {
			local47 = arg1[local40 + arg0];
			Static218.method2016(local47.aByteArray30, 0, local36, local38, local47.anInt2899);
			local38 += local47.anInt2899;
		}
		local47 = new Class70();
		local47.aByteArray30 = local36;
		local47.anInt2899 = local5;
		return local47;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIB)I")
	public static int method1942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!oc;Lclient!ke;Lclient!oc;B)[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] method1943(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class70 arg2) {
		@Pc(15) int local15 = arg1.method1560(arg2);
		@Pc(23) int local23 = arg1.method1554(arg0, local15);
		return Static192.method3012(local15, local23, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII)V")
	public static void method1945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == Static191.anInt3881 && Static37.anInt3233 == arg4 && (arg2 == Static182.anInt3727 || !Static50.aBoolean66)) {
			return;
		}
		Static37.anInt3233 = arg4;
		Static191.anInt3881 = arg0;
		Static182.anInt3727 = arg2;
		if (!Static50.aBoolean66) {
			Static182.anInt3727 = 0;
		}
		Static29.method515(25);
		Static60.method2392(true, Static92.aClass70_953);
		@Pc(44) int local44 = Static30.anInt695;
		@Pc(46) int local46 = Static55.anInt1184;
		Static30.anInt695 = arg0 * 8 - 48;
		Static55.anInt1184 = (arg4 - 6) * 8;
		@Pc(63) int local63 = Static55.anInt1184 - local46;
		@Pc(68) int local68 = Static30.anInt695 - local44;
		for (@Pc(74) int local74 = 0; local74 < 32768; local74++) {
			@Pc(80) Class26_Sub2_Sub2 local80 = Static8.aClass26_Sub2_Sub2Array1[local74];
			if (local80 != null) {
				for (@Pc(84) int local84 = 0; local84 < 10; local84++) {
					local80.anIntArray182[local84] -= local68;
					local80.anIntArray185[local84] -= local63;
				}
				local80.anInt2611 -= local63 * 128;
				local80.anInt2593 -= local68 * 128;
			}
		}
		for (@Pc(130) int local130 = 0; local130 < 2048; local130++) {
			@Pc(136) Class26_Sub2_Sub1 local136 = Static146.aClass26_Sub2_Sub1Array1[local130];
			if (local136 != null) {
				for (@Pc(140) int local140 = 0; local140 < 10; local140++) {
					local136.anIntArray182[local140] -= local68;
					local136.anIntArray185[local140] -= local63;
				}
				local136.anInt2611 -= local63 * 128;
				local136.anInt2593 -= local68 * 128;
			}
		}
		Static137.anInt2795 = arg2;
		@Pc(188) byte local188 = 0;
		@Pc(190) byte local190 = 104;
		Static144.aClass26_Sub2_Sub1_1.method1858(arg1, false, arg3);
		@Pc(198) byte local198 = 1;
		@Pc(200) byte local200 = 0;
		@Pc(202) byte local202 = 104;
		@Pc(204) byte local204 = 1;
		if (local68 < 0) {
			local188 = 103;
			local198 = -1;
			local190 = -1;
		}
		if (local63 < 0) {
			local200 = 103;
			local202 = -1;
			local204 = -1;
		}
		for (@Pc(228) int local228 = local188; local228 != local190; local228 += local198) {
			for (@Pc(232) int local232 = local200; local232 != local202; local232 += local204) {
				@Pc(238) int local238 = local68 + local228;
				@Pc(242) int local242 = local63 + local232;
				for (@Pc(244) int local244 = 0; local244 < 4; local244++) {
					if (local238 >= 0 && local242 >= 0 && local238 < 104 && local242 < 104) {
						Static29.aClass10ArrayArrayArray1[local244][local228][local232] = Static29.aClass10ArrayArrayArray1[local244][local238][local242];
					} else {
						Static29.aClass10ArrayArrayArray1[local244][local228][local232] = null;
					}
				}
			}
		}
		for (@Pc(310) Class3_Sub22 local310 = (Class3_Sub22) Static95.aClass10_53.method267(); local310 != null; local310 = (Class3_Sub22) Static95.aClass10_53.method268()) {
			local310.anInt3542 -= local63;
			local310.anInt3540 -= local68;
			if (local310.anInt3540 < 0 || local310.anInt3542 < 0 || local310.anInt3540 >= 104 || local310.anInt3542 >= 104) {
				local310.method3320();
			}
		}
		Static45.anInt953 = 0;
		Static192.aBoolean174 = false;
		Static191.anInt3886 = -1;
		if (Static65.anInt1365 != 0) {
			Static101.anInt2072 -= local63;
			Static65.anInt1365 -= local68;
		}
		Static153.aClass10_85.method262();
		Static157.aClass10_90.method262();
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Z")
	public static boolean method1947(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}
}
