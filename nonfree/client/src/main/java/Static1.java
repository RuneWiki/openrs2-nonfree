import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public static final int anInt1 = 3;
}
