import java.awt.Font;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "Z")
	public static boolean aBoolean7;

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
	public static int anInt261;

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	public static int anInt251 = -2;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
	public static final int[] anIntArray5 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString9 = "Loaded defaults";

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
	public static void method241() {
		@Pc(5) Class66 local5 = Static289.aClass66_97;
		synchronized (Static289.aClass66_97) {
			Static289.aClass66_97.method1944(5);
		}
		local5 = Static244.aClass66_84;
		synchronized (Static244.aClass66_84) {
			Static244.aClass66_84.method1944(5);
		}
		local5 = Static37.aClass66_9;
		synchronized (Static37.aClass66_9) {
			Static37.aClass66_9.method1944(5);
		}
		local5 = Static203.aClass66_69;
		synchronized (Static203.aClass66_69) {
			Static203.aClass66_69.method1944(5);
		}
	}
}
