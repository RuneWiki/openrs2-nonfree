import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static516 {

	@OriginalMember(owner = "client!tu", name = "R", descriptor = "Lclient!gm;")
	public static Class127 aClass127_2;

	@OriginalMember(owner = "client!tu", name = "Y", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!tu", name = "P", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_16 = new Class277(4, 4);

	@OriginalMember(owner = "client!tu", name = "V", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!tu", name = "W", descriptor = "[I")
	public static final int[] anIntArray542 = new int[14];

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(III)Z")
	public static boolean method7352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static195.method6871(arg1, arg0) || Static363.method5477(arg0, arg1);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILclient!ek;)Ljava/lang/String;")
	public static String method7353(@OriginalArg(1) Class4_Sub13 arg0) {
		return Static517.method8195(arg0);
	}
}
