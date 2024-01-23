import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	public static int anInt5058;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "Lclient!kc;")
	public static Class92 aClass92_8;

	@OriginalMember(owner = "client!ti", name = "gb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray71;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "Z")
	public static boolean aBoolean408 = true;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(ZI)Z")
	public static boolean method3840(@OriginalArg(0) boolean arg0) {
		@Pc(5) boolean local5 = Static154.method2459();
		if (local5 == arg0) {
			return true;
		}
		if (!arg0) {
			Static154.method2462();
		} else if (!Static154.method2465() || !Static154.method2457() || !Static154.method2458()) {
			arg0 = false;
		}
		Static270.aBoolean450 = arg0;
		Static269.method3754(Static199.aClass17_3);
		if (arg0 == local5) {
			return false;
		} else {
			((Class49_Sub1) Static96.anInterface4_1).method1275();
			return true;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3841(@OriginalArg(0) String arg0) {
		@Pc(17) int local17 = Static185.method2873(arg0);
		if (local17 != -1) {
			@Pc(48) int[] local48 = Static267.aClass8_Sub1_Sub2_2.method423(Static245.aClass130_2.anIntArray297[local17] >> 28 & 0x3, Static245.aClass130_2.anIntArray297[local17] & 0x3FFF, Static245.aClass130_2.anIntArray297[local17] >> 14 & 0x3FFF);
			Static28.method469(local48[2], local48[1]);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
	public static boolean method3842(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		@Pc(4) int local4 = arg0.length();
		@Pc(7) int local7 = arg1.length();
		if (local7 > local4) {
			return false;
		}
		for (@Pc(29) int local29 = 0; local29 < local7; local29++) {
			@Pc(36) char local36 = arg0.charAt(local29);
			@Pc(40) char local40 = arg1.charAt(local29);
			if (local36 != local40 && Character.toLowerCase(local36) != Character.toLowerCase(local40) && Character.toUpperCase(local36) != Character.toUpperCase(local40)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)Lclient!vd;")
	public static Class170 method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4857; local13++) {
			@Pc(22) Class170 local22 = local7.aClass170Array3[local13];
			if ((local22.aLong196 >> 29 & 0x3L) == 2L && local22.anInt5463 == arg1 && local22.anInt5460 == arg2) {
				Static108.method1774(local22);
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZILclient!pk;BII)V")
	public static void method3844(@OriginalArg(0) int arg0, @OriginalArg(3) Class132 arg1, @OriginalArg(6) int arg2) {
		Static149.anInt3007 = arg0;
		Static283.anInt5551 = 1;
		Static144.aBoolean239 = false;
		Static98.anInt2035 = 0;
		Static240.aClass132_82 = arg1;
		Static50.anInt1118 = 2;
		Static86.anInt1847 = arg2;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(Z)V")
	public static void method3845() {
		Static66.aClass8_Sub2_Sub1_4.method2398(40);
		Static66.aClass8_Sub2_Sub1_4.method2340(Static99.method1585());
		Static66.aClass8_Sub2_Sub1_4.method2333(Static250.anInt4959);
		Static66.aClass8_Sub2_Sub1_4.method2333(Static13.anInt356);
		Static66.aClass8_Sub2_Sub1_4.method2340(Static215.anInt4429);
	}
}
