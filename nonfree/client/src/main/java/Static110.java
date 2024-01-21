import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!ke;")
	public static Class43 aClass43_2;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
	public static boolean aBoolean136 = false;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
	public static int[] anIntArray318 = new int[5];

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
	public static int anInt2528 = 0;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!id;")
	private static Class34 aClass34_1265 = Static9.method266("Members object");

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1261 = aClass34_1265;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_1262 = Static9.method266("blinken2:");

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "Lclient!id;")
	public static Class34 aClass34_1263 = Static9.method266(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!id;")
	private static Class34 aClass34_1264 = Static9.method266("Loaded title screen");

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "[S")
	public static short[] aShortArray14 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "Lclient!id;")
	public static Class34 aClass34_1266 = aClass34_1264;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Lclient!id;")
	public static Class34 aClass34_1267 = Static9.method266("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!id;")
	public static Class34 aClass34_1268 = Static9.method266("<)4col>");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
	public static void method1675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class38 local7 = Static94.aClass38ArrayArrayArray1[Static42.anInt1208][arg0][arg1];
		if (local7 == null) {
			Static39.aClass44_1.method1152(Static42.anInt1208, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub1_Sub5 local23 = null;
		@Pc(28) Class1_Sub1_Sub1_Sub5 local28;
		for (local28 = (Class1_Sub1_Sub1_Sub5) local7.method1034(); local28 != null; local28 = (Class1_Sub1_Sub1_Sub5) local7.method1038()) {
			@Pc(34) Class1_Sub1_Sub8 local34 = Static74.method1334(local28.anInt2208);
			@Pc(37) int local37 = local34.anInt2011;
			if (local34.anInt2012 == 1) {
				local37 *= local28.anInt2205 + 1;
			}
			if (local21 < local37) {
				local23 = local28;
				local21 = local37;
			}
		}
		if (local23 == null) {
			Static39.aClass44_1.method1152(Static42.anInt1208, arg0, arg1);
			return;
		}
		@Pc(78) Class1_Sub1_Sub1_Sub5 local78 = null;
		@Pc(94) int local94 = arg0 + (arg1 << 7) + 1610612736;
		local7.method1043(local23);
		local28 = (Class1_Sub1_Sub1_Sub5) local7.method1034();
		@Pc(107) Class1_Sub1_Sub1_Sub5 local107 = null;
		while (local28 != null) {
			if (local23.anInt2208 != local28.anInt2208) {
				if (local107 == null) {
					local107 = local28;
				}
				if (local28.anInt2208 != local107.anInt2208 && local78 == null) {
					local78 = local28;
				}
			}
			local28 = (Class1_Sub1_Sub1_Sub5) local7.method1038();
		}
		Static39.aClass44_1.method1182(Static42.anInt1208, arg0, arg1, Static45.method1845(Static42.anInt1208, arg1 * 128 + 64, arg0 * 128 + 64), local23, local94, local107, local78);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method1677() {
		aShortArray14 = null;
		aClass34_1265 = null;
		aClass34_1268 = null;
		aClass43_2 = null;
		aClass34_1261 = null;
		aClass34_1263 = null;
		aClass34_1267 = null;
		aClass34_1266 = null;
		aClass34_1262 = null;
		aClass34_1264 = null;
		anIntArray318 = null;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)I")
	public static int method1678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = local7 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method1680() {
		Static80.aFontMetrics1 = null;
		Static47.anImage3 = null;
		Static54.aFont1 = null;
	}
}
