import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "Lclient!naa;")
	public static Class241 aClass241_4;

	@OriginalMember(owner = "client!tn", name = "z", descriptor = "Z")
	public static boolean aBoolean658;

	@OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
	public static final int anInt9492 = 1409;

	@OriginalMember(owner = "client!tn", name = "U", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray63 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[I")
	public static int[] method7732(@OriginalArg(1) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static593.method7811(Static604.method8233(arg0));
		local6[0] = Static387.aCalendar2.get(5);
		local6[1] = Static387.aCalendar2.get(2);
		local6[2] = Static387.aCalendar2.get(1);
		return local6;
	}
}
