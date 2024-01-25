import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static442 {

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	public static int anInt7034;

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "J")
	public static long aLong222;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
	public static int anInt7035;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "Lclient!rda;")
	public static final Class299 aClass299_2 = new Class299("LIVE", 0);

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "Z")
	public static boolean aBoolean513 = false;

	@OriginalMember(owner = "client!ou", name = "h", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!qn;BLjava/lang/String;I)Lclient!eba;")
	public static Class81 method6277(@OriginalArg(0) Class291 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Static496.method7117(arg1, arg0, "openjs", arg2);
	}
}
