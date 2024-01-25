import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static240 {

	@OriginalMember(owner = "client!kaa", name = "w", descriptor = "Lclient!ci;")
	public static Class3_Sub9_Sub1 aClass3_Sub9_Sub1_1;

	@OriginalMember(owner = "client!kaa", name = "v", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_20 = new Class267(64);

	@OriginalMember(owner = "client!kaa", name = "y", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
	public static void method4199(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static471.aHashtable6.put(arg1, arg0);
	}
}
