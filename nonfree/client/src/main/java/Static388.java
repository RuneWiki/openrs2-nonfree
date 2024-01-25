import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "Lclient!ug;")
	public static Class86 aClass86_3;

	@OriginalMember(owner = "client!tj", name = "Q", descriptor = "Lclient!st;")
	public static Class236 aClass236_13;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "[I")
	public static final int[] anIntArray674 = new int[256];

	@OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
	public static final int anInt7097 = 0;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "[I")
	public static final int[] anIntArray675 = new int[1000];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/lang/String;Z)Z")
	public static boolean method5417(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static282.anInt5394 != 3) {
			Static156.aClass35_9 = new Class35();
			Static156.aClass35_9.aString6 = arg1;
			Static156.aClass35_9.anInt1006 = arg0;
			if (Static59.aClass248_1 != Static314.aClass248_7) {
				Static156.aClass35_9.anInt1005 = Static156.aClass35_9.anInt1006 + 40000;
				Static156.aClass35_9.anInt1004 = Static156.aClass35_9.anInt1006 + 50000;
			}
			return true;
		}
		@Pc(37) String local37 = "";
		if (Static314.aClass248_7 != Static59.aClass248_1) {
			local37 = ":" + (arg0 + 7000);
		}
		@Pc(57) String local57 = "";
		if (Static325.aString57 != null) {
			local57 = "/p=" + Static325.aString57;
		}
		@Pc(105) String local105 = "http://" + arg1 + local37 + "/l=" + Static365.anInt6682 + "/a=" + Static2.anInt47 + local57 + "/j" + (Static352.aBoolean417 ? "1" : "0") + ",o" + (Static316.aBoolean374 ? "1" : "0") + ",a2";
		try {
			Static271.aClient1.getAppletContext().showDocument(new URL(local105), "_self");
			return true;
		} catch (@Pc(115) Exception local115) {
			return false;
		}
	}
}
