import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "[I")
	public static int[] anIntArray15;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
	public static int[] anIntArray16;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_123 = Static38.method685("headicons_hint");

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_124 = Static38.method685("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(JB)V")
	public static void method299(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static68.anInt1729 >= 100) {
			Static6.method932(0, Static111.aClass6_768, Static9.aClass6_71);
			return;
		}
		@Pc(25) Class6 local25 = Static49.method884(arg0).method106();
		for (@Pc(27) int local27 = 0; local27 < Static68.anInt1729; local27++) {
			if (Static138.aLongArray6[local27] == arg0) {
				Static6.method932(0, Static58.method956(new Class6[] { local25, Static165.aClass6_1149 }), Static9.aClass6_71);
				return;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static111.anInt2637; local58++) {
			if (arg0 == Static102.aLongArray3[local58]) {
				Static6.method932(0, Static58.method956(new Class6[] { Static4.aClass6_38, local25, Static134.aClass6_901 }), Static9.aClass6_71);
				return;
			}
		}
		if (local25.method131(Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.aClass6_244)) {
			Static6.method932(0, Static104.aClass6_720, Static9.aClass6_71);
			return;
		}
		Static138.aLongArray6[Static68.anInt1729] = arg0;
		Static10.aClass6Array2[Static68.anInt1729++] = Static49.method884(arg0);
		Static86.anInt2209 = Static7.anInt124;
		Static66.aClass2_Sub13_Sub1_2.method1455(32);
		Static66.aClass2_Sub13_Sub1_2.method1418(arg0);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	public static int method300() {
		@Pc(9) int local9 = Static131.method2041(Static106.anInt4184, Static28.anInt722, Static36.anInt1020);
		return local9 - Static12.anInt313 >= 800 || (Static164.aByteArrayArrayArray7[Static36.anInt1020][Static106.anInt4184 >> 7][Static28.anInt722 >> 7] & 0x4) == 0 ? 3 : Static36.anInt1020;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method301() {
		aClass6_124 = null;
		anIntArray15 = null;
		anIntArray16 = null;
		anIntArray17 = null;
		aClass6_123 = null;
	}
}
