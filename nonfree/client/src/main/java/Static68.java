import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	public static int anInt1263;

	@OriginalMember(owner = "client!el", name = "e", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "[Lclient!tb;")
	public static Class59_Sub2[] aClass59_Sub2Array2;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public static int anInt1262 = 0;

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!el", name = "j", descriptor = "I")
	public static int anInt1269 = 0;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "Lclient!cc;")
	public static Class22 aClass22_7 = null;

	@OriginalMember(owner = "client!el", name = "l", descriptor = "I")
	public static int anInt1270 = 0;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	public static void method1041() {
		@Pc(7) int local7 = Static261.anInt4963;
		@Pc(9) int local9 = Static206.anInt4044;
		@Pc(11) int local11 = Static205.anInt4000;
		@Pc(13) int local13 = Static139.anInt2867;
		if (Static178.aBoolean216) {
			Static186.method2968(local7, local11, local9, local13, 6116423);
			Static186.method2968(local7 + 1, local11 + 1, local9 - 2, 16, 0);
			Static186.method2970(local7 + 1, local11 + 18, local9 - 2, local13 - 19, 0);
		} else {
			Static166.method2627(local7, local11, local9, local13, 6116423);
			Static166.method2627(local7 + 1, local11 + 1, local9 - 2, 16, 0);
			Static166.method2614(local7 + 1, local11 + 18, local9 - 2, local13 - 19, 0);
		}
		Static289.aClass4_Sub2_Sub12_3.method4173(Static288.aString71, local7 + 3, local11 - -14, 6116423, -1);
		@Pc(102) int local102 = Static117.anInt2589;
		@Pc(104) int local104 = Static72.anInt1326;
		for (@Pc(106) int local106 = 0; local106 < Static60.anInt1152; local106++) {
			@Pc(127) int local127 = local11 + (-local106 + -1 + Static60.anInt1152) * 15 + 31;
			@Pc(129) int local129 = 16777215;
			if (local104 > local7 && local104 < local9 + local7 && local127 - 13 < local102 && local102 < local127 + 3) {
				local129 = 16776960;
			}
			Static289.aClass4_Sub2_Sub12_3.method4173(Static249.method3767(local106), local7 + 3, local127, local129, 0);
		}
		Static113.method1929(Static206.anInt4044, Static261.anInt4963, Static139.anInt2867, Static205.anInt4000);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
	public static void method1042() {
		aClass22_7 = null;
		aClass59_Sub2Array2 = null;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
	public static void method1043() {
		Static150.aClass33_25.method843();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
	public static void method1044(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(6) int local6 = 0;
		@Pc(9) short[] local9 = new short[16];
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = local19 + (arg1 ? Static108.anInt2276 : Static62.anInt1168);
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(40) Class4_Sub2_Sub14 local40 = Static248.method3758(local29);
			if (local40.aBoolean236 && local40.method2883().toLowerCase().indexOf(local4) != -1) {
				if (local6 >= 50) {
					Static270.aShortArray84 = null;
					Static18.anInt381 = -1;
					return;
				}
				if (local9.length <= local6) {
					@Pc(78) short[] local78 = new short[local9.length * 2];
					for (@Pc(80) int local80 = 0; local80 < local6; local80++) {
						local78[local80] = local9[local80];
					}
					local9 = local78;
				}
				local9[local6++] = (short) local29;
			}
		}
		Static270.aShortArray84 = local9;
		Static127.anInt2700 = 0;
		Static18.anInt381 = local6;
		@Pc(116) String[] local116 = new String[Static18.anInt381];
		for (@Pc(122) int local122 = 0; local122 < Static18.anInt381; local122++) {
			local116[local122] = Static248.method3758(local9[local122]).method2883();
		}
		Static79.method1228(Static270.aShortArray84, local116);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	public static void method1045() {
		Static106.aClass33_18.method839();
		Static295.aClass33_40.method839();
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	public static void method1046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class4_Sub2_Sub21 local4 = Static39.method4121(arg1, 5);
		local4.method4360();
		local4.anInt5492 = arg0;
	}
}
