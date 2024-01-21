import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	public static final int anInt12 = 3;
}
