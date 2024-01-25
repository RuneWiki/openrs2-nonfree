import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static518 {

	@OriginalMember(owner = "client!rs", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_89 = new Class187(5, 4);

	@OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
	public static int anInt9184 = 0;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "[I")
	public static final int[] anIntArray508 = new int[1];

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BLclient!cb;Lclient!kj;)V")
	public static void method7709(@OriginalArg(1) Class50 arg0, @OriginalArg(2) Class202 arg1) {
		Static661.aString113 = "";
		Static372.aClass50_106 = arg0;
		Static223.aClass202_3 = arg1;
		if (Class83.aString16.startsWith("win")) {
			Static661.aString113 = Static661.aString113 + "windows/";
		} else if (Class83.aString16.startsWith("linux")) {
			Static661.aString113 = Static661.aString113 + "linux/";
		} else if (Class83.aString16.startsWith("mac")) {
			Static661.aString113 = Static661.aString113 + "macos/";
		}
		if (Static223.aClass202_3.aBoolean386) {
			Static661.aString113 = Static661.aString113 + "msjava/";
		} else if (Class83.aString17.startsWith("amd64") || Class83.aString17.startsWith("x86_64")) {
			Static661.aString113 = Static661.aString113 + "x86_64/";
		} else if (Class83.aString17.startsWith("i386") || Class83.aString17.startsWith("i486") || Class83.aString17.startsWith("i586") || Class83.aString17.startsWith("x86")) {
			Static661.aString113 = Static661.aString113 + "x86/";
		} else if (Class83.aString17.startsWith("ppc")) {
			Static661.aString113 = Static661.aString113 + "ppc/";
		} else {
			Static661.aString113 = Static661.aString113 + "universal/";
		}
	}
}
