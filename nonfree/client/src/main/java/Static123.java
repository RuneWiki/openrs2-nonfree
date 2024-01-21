import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString3;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!we", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!we", name = "l", descriptor = "I")
	public static final int anInt3158 = 3;
}
