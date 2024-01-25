import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!tj;")
	public static Class122 aClass122_6;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Lclient!ir;")
	public static Class100 aClass100_84;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!pl;")
	public static Class160 aClass160_2;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "I")
	public static int anInt4000 = 0;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[112];

	@OriginalMember(owner = "client!me", name = "k", descriptor = "I")
	public static int anInt4004 = 1;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)I")
	public static int method3421() {
		return ((Static260.anInt5195 == 0 ? 0 : 1) << 22) + ((Static224.anInt4582 == 0 ? 0 : 1) << 20) + ((Static302.aBoolean410 ? 1 : 0) << 16) + ((Static333.aBoolean435 ? 1 : 0) << 15) + ((Static77.anInt1520 & 0x3) << 11) + ((Static5.aBoolean13 ? 1 : 0) << 9) + ((Static274.aBoolean403 ? 1 : 0) << 8) + ((Static352.aBoolean453 ? 1 : 0) << 6) + (Static144.anInt2893 & 0x7) + ((Static186.aBoolean166 ? 1 : 0) << 3) + ((Static228.aBoolean265 ? 1 : 0) << 4) + ((Static271.aBoolean338 ? 1 : 0) << 5) + ((Static21.aBoolean29 ? 1 : 0) << 10) + ((Static118.aBoolean141 ? 1 : 0) << 13) + (Static226.anInt4626 << 17) + ((Static149.aBoolean162 ? 1 : 0) << 19) + ((Static36.anInt809 == 0 ? 0 : 1) << 21) + (Static126.method3740() << 23) + (Static33.anInt778 << 25) + ((Static250.aBoolean274 ? 1 : 0) << 27) + (Static197.anInt4054 << 28);
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z")
	public static boolean method3424(@OriginalArg(0) int arg0) {
		if (arg0 == 8 || arg0 == 4 || arg0 == 47 || arg0 == 15 || arg0 == 30 || arg0 == 3 || arg0 == 21 || arg0 == 33) {
			return true;
		} else if (arg0 == 6 || arg0 == 51 || arg0 == 1002 || arg0 == 1008) {
			return true;
		} else if (arg0 == 1 || arg0 == 41 || arg0 == 60 || arg0 == 5 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 50 || arg0 == 11 || arg0 == 2 || arg0 == 26 || arg0 == 59;
		}
	}
}
