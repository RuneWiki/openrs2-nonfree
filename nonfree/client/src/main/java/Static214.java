import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static int anInt2074 = -1;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "J")
	public static long aLong61 = 0L;

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
	public static final int[] anIntArray120 = new int[13];

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lclient!uq;")
	public static Class127 method1927(@OriginalArg(0) Component arg0) {
		return new Class127_Sub1(arg0, true);
	}
}
