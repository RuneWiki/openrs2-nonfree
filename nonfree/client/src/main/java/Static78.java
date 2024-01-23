import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	public static int anInt1455;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
	public static int anInt1465;

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "Lclient!ph;")
	public static Class138 aClass138_22;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
	public static int anInt1449 = 0;

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString47 = "wave:";

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!qf;I)Z")
	public static boolean method1214(@OriginalArg(0) Class146 arg0) {
		if (arg0.anInt4350 == 205) {
			Static212.anInt4177 = 250;
			return true;
		} else {
			return false;
		}
	}
}
