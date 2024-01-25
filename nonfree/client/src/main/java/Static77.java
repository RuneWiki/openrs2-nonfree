import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Lclient!qj;")
	public static Class165 aClass165_25;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	public static int anInt1554 = 0;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString61 = "Loaded client variable data";

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Z")
	public static boolean method1481(@OriginalArg(0) int arg0) {
		Static169.anInt4508 = arg0 + 1 & 0xFFFF;
		Static317.aBoolean539 = true;
		return true;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method1482() {
		if (Static339.aBoolean568) {
			Static339.aBoolean568 = false;
			Static322.aClass90_18 = null;
			Static287.aClass90_16 = null;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1484(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(22) int local22 = 0; local22 < local8; local22++) {
			@Pc(28) char local28 = arg0.charAt(local22);
			if (local13 == 0) {
				local28 = Character.toLowerCase(local28);
			} else if (local13 == 2 || Character.isUpperCase(local28)) {
				local28 = Static3.method166(local28);
			}
			if (Character.isLetter(local28)) {
				local13 = 0;
			} else if (local28 == '.' || local28 == '?' || local28 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local28)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local22] = local28;
		}
		return new String(local11);
	}
}
