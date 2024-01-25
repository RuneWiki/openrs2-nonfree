import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "Z")
	public static boolean aBoolean40 = true;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
	public static volatile boolean aBoolean41 = true;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	public static int anInt967 = 0;

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString22 = null;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
	public static void method892(@OriginalArg(1) int arg0) {
		Static45.anInt1006 = arg0;
		@Pc(13) Class288 local13 = Static195.aClass288_26;
		synchronized (Static195.aClass288_26) {
			Static195.aClass288_26.method6744();
		}
	}
}
