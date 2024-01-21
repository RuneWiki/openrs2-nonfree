import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 aClass3_Sub3_Sub2_Sub2_3;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!hb;")
	private static Class27 aClass27_397 = Static87.method1648("Loading )2 please wait)3");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_396 = aClass27_397;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	public static int anInt812 = 0;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!hb;")
	public static Class27 aClass27_398 = Static87.method1648("::fpsoff");

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
	public static int anInt813 = 0;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!hb;")
	private static Class27 aClass27_399 = Static87.method1648("Error loading your profile)3");

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Lclient!hb;")
	public static Class27 aClass27_400 = aClass27_399;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!hb;")
	public static Class27 aClass27_401 = Static87.method1648("backbase1");

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public static int anInt817 = 0;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!ic;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method667() {
		aClass27_399 = null;
		aClass27_396 = null;
		aClass3_Sub3_Sub2_Sub2_3 = null;
		aClass27_400 = null;
		aClass27_397 = null;
		aClass27_401 = null;
		aClass27_398 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!td;BLclient!td;)V")
	public static void method668(@OriginalArg(0) Class54 arg0, @OriginalArg(2) Class54 arg1) {
		Static107.aClass54_34 = arg0;
		Static8.aClass54_2 = arg1;
		Static42.anInt1230 = Static8.aClass54_2.method1609(3);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public static void method669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class28 local7 = Static71.aClass28ArrayArrayArray1[Static68.anInt1747][arg1][arg0];
		if (local7 == null) {
			Static76.aClass18_1.method532(Static68.anInt1747, arg1, arg0);
			return;
		}
		@Pc(29) int local29 = -99999999;
		@Pc(31) Class3_Sub3_Sub1_Sub5 local31 = null;
		@Pc(36) Class3_Sub3_Sub1_Sub5 local36;
		for (local36 = (Class3_Sub3_Sub1_Sub5) local7.method884(); local36 != null; local36 = (Class3_Sub3_Sub1_Sub5) local7.method875()) {
			@Pc(42) Class3_Sub3_Sub9 local42 = Static37.method696(local36.anInt1496);
			@Pc(45) int local45 = local42.anInt1811;
			if (local42.anInt1786 == 1) {
				local45 *= local36.anInt1505 + 1;
			}
			if (local29 < local45) {
				local31 = local36;
				local29 = local45;
			}
		}
		if (local31 == null) {
			Static76.aClass18_1.method532(Static68.anInt1747, arg1, arg0);
			return;
		}
		@Pc(80) Class3_Sub3_Sub1_Sub5 local80 = null;
		@Pc(88) int local88 = arg1 + (arg0 << 7) + 1610612736;
		local7.method881(local31);
		@Pc(94) Class3_Sub3_Sub1_Sub5 local94 = null;
		for (local36 = (Class3_Sub3_Sub1_Sub5) local7.method884(); local36 != null; local36 = (Class3_Sub3_Sub1_Sub5) local7.method875()) {
			if (local36.anInt1496 != local31.anInt1496) {
				if (local80 == null) {
					local80 = local36;
				}
				if (local80.anInt1496 != local36.anInt1496 && local94 == null) {
					local94 = local36;
				}
			}
		}
		Static76.aClass18_1.method517(Static68.anInt1747, arg1, arg0, Static48.method1675(arg0 * 128 + 64, Static68.anInt1747, arg1 * 128 + 64), local31, local88, local80, local94);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method670() {
		Static3.aClass21_2.method663();
	}
}
