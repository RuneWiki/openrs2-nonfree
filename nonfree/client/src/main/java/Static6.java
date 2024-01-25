import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
	public static int anInt97;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "Lclient!db;")
	public static final Class64 aClass64_7 = new Class64(88, 28);

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "[I")
	public static final int[] anIntArray8 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
	public static int anInt96 = 0;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)Ljava/lang/String;")
	public static String method102() {
		@Pc(7) String local7 = "www";
		if (Static250.aClass315_5 == Static327.aClass315_8) {
			local7 = "www-wtrc";
		} else if (Static327.aClass315_8 == Static58.aClass315_3) {
			local7 = "www-wtqa";
		} else if (Static327.aClass315_8 == Static463.aClass315_7) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static71.aString16 != null) {
			local28 = "/p=" + Static71.aString16;
		}
		return "http://" + local7 + "." + Static538.aClass263_5.aString80 + ".com/l=" + Static56.anInt953 + "/a=" + Static431.anInt7395 + local28 + "/";
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)Z")
	public static boolean method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static299.method4652(arg0, arg1) | (arg1 & 0x10000) != 0 || Static73.method1301(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static270.method4371(arg0, arg1);
		}
	}
}
