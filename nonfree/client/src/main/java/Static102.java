import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!dd;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Lclient!ef;")
	public static Class16 aClass16_127;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!he;")
	private static Class26 aClass26_1502 = Static6.method100("red:");

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_1499 = aClass26_1502;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public static int anInt2770 = 0;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Lclient!he;")
	private static Class26 aClass26_1500 = Static6.method100("OFF");

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!he;")
	public static Class26 aClass26_1501 = Static6.method100("<col=ff9040>");

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!sf;")
	public static Class66 aClass66_23 = new Class66(200);

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1503 = aClass26_1502;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1504 = aClass26_1500;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_1505 = null;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
	public static int anInt2775 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
	public static void method1898(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static73.method1341(arg0)) {
			return;
		}
		@Pc(23) Class3_Sub14[] local23 = Static49.aClass3_Sub14ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
			@Pc(31) Class3_Sub14 local31 = local23[local25];
			if (local31.anObjectArray21 != null) {
				@Pc(38) Class3_Sub15 local38 = new Class3_Sub15();
				local38.anObjectArray28 = local31.anObjectArray21;
				local38.aClass3_Sub14_11 = local31;
				Static28.method595(local38);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	public static void method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class65 local7 = Static64.aClass65ArrayArrayArray1[Static132.anInt3270][arg1][arg0];
		if (local7 == null) {
			Static62.aClass69_1.method2038(Static132.anInt3270, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class3_Sub1_Sub5_Sub4 local23 = null;
		@Pc(30) Class3_Sub1_Sub5_Sub4 local30;
		for (local30 = (Class3_Sub1_Sub5_Sub4) local7.method1958(); local30 != null; local30 = (Class3_Sub1_Sub5_Sub4) local7.method1962()) {
			@Pc(36) Class3_Sub1_Sub9 local36 = Static117.method2099(local30.anInt1244);
			@Pc(39) int local39 = local36.anInt1717;
			if (local36.anInt1715 == 1) {
				local39 *= local30.anInt1243 + 1;
			}
			if (local21 < local39) {
				local23 = local30;
				local21 = local39;
			}
		}
		if (local23 == null) {
			Static62.aClass69_1.method2038(Static132.anInt3270, arg1, arg0);
			return;
		}
		local7.method1964(local23);
		local30 = (Class3_Sub1_Sub5_Sub4) local7.method1958();
		@Pc(85) Class3_Sub1_Sub5_Sub4 local85 = null;
		@Pc(94) int local94 = arg1 + (arg0 << 7) + 1610612736;
		@Pc(96) Class3_Sub1_Sub5_Sub4 local96 = null;
		while (local30 != null) {
			if (local23.anInt1244 != local30.anInt1244) {
				if (local85 == null) {
					local85 = local30;
				}
				if (local85.anInt1244 != local30.anInt1244 && local96 == null) {
					local96 = local30;
				}
			}
			local30 = (Class3_Sub1_Sub5_Sub4) local7.method1962();
		}
		Static62.aClass69_1.method2035(Static132.anInt3270, arg1, arg0, Static110.method2006(arg1 * 128 + 64, arg0 * 128 - -64, Static132.anInt3270), local23, local94, local85, local96);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)V")
	public static void method1900() {
		Static25.method2160();
		Static95.method1772();
		Static14.method242();
		Static75.method1348();
		Static61.method1203();
		Static42.method813();
		Static48.method1033();
		Static80.method1394();
		Static58.method1184();
		Static94.method1700();
		Static75.method1353();
		Static111.method2011();
		((Class34) Static127.anInterface2_1).method1101();
		Static86.aClass66_19.method1971();
		Static121.aClass16_Sub1_18.method556();
		Static7.aClass16_Sub1_1.method556();
		Static95.aClass16_Sub1_14.method556();
		Static107.aClass16_Sub1_16.method556();
		Static42.aClass16_Sub1_6.method556();
		Static89.aClass16_Sub1_12.method556();
		Static119.aClass16_Sub1_17.method556();
		Static20.aClass16_Sub1_3.method556();
		Static29.aClass16_Sub1_4.method556();
		Static125.aClass16_Sub1_19.method556();
		Static39.aClass16_Sub1_5.method556();
		Static90.aClass16_Sub1_13.method556();
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(Z)V")
	public static void method1902() {
		aClass26_1505 = null;
		aClass6_1 = null;
		anIntArray336 = null;
		aClass26_1502 = null;
		aClass16_127 = null;
		aClass26_1503 = null;
		aClass26_1500 = null;
		aClass26_1499 = null;
		aClass26_1501 = null;
		aClass66_23 = null;
		aClass26_1504 = null;
	}
}
