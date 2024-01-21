import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "[I")
	public static int[] anIntArray84;

	@OriginalMember(owner = "client!ge", name = "C", descriptor = "Lclient!cd;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!ge", name = "G", descriptor = "[I")
	public static int[] anIntArray85;

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	public static int anInt713 = 0;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "Lclient!vc;")
	private static Class71 aClass71_412 = Static38.method736("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!vc;")
	public static Class71 aClass71_411 = aClass71_412;

	@OriginalMember(owner = "client!ge", name = "D", descriptor = "Lclient!vc;")
	public static Class71 aClass71_413 = Static38.method736("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
	public static int anInt716 = 0;

	@OriginalMember(owner = "client!ge", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
	public static int anInt717 = 0;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
	public static int method535(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static3.anIntArray4[arg0];
		@Pc(11) int local11 = (local3 * Static8.anInt285 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)V")
	public static void method539() {
		if (Static49.anInt1394 < 2 && Static81.anInt1990 == 0 && !Static33.aBoolean40) {
			return;
		}
		@Pc(51) Class71 local51;
		if (Static81.anInt1990 == 1 && Static49.anInt1394 < 2) {
			local51 = Static74.method677(new Class71[] { Static31.aClass71_480, Static91.aClass71_1058, Static94.aClass71_1106, Static85.aClass71_1016 });
		} else if (Static33.aBoolean40 && Static49.anInt1394 < 2) {
			local51 = Static74.method677(new Class71[] { Static82.aClass71_991, Static91.aClass71_1058, Static10.aClass71_222, Static85.aClass71_1016 });
		} else {
			local51 = Static24.aClass71Array8[Static49.anInt1394 - 1];
		}
		if (Static49.anInt1394 > 2) {
			local51 = Static74.method677(new Class71[] { local51, Static76.aClass71_912, Static51.method962(Static49.anInt1394 - 2), Static69.aClass71_841 });
		}
		Static35.aClass5_Sub1_Sub10_Sub4_2.method2045(local51, 4, 16777215, Static95.anInt2285 / 1000);
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)V")
	public static void method540() {
		aClass71_412 = null;
		anIntArray85 = null;
		anIntArray84 = null;
		aClass71_413 = null;
		aClass71_411 = null;
		aBooleanArray6 = null;
		aClass13_3 = null;
	}
}
