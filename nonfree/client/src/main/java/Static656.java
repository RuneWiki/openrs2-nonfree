import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static656 {

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_213 = new Class180(86, -1);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ILjava/lang/String;Ljava/io/File;)V")
	public static void method9123(@OriginalArg(1) String arg0, @OriginalArg(2) File arg1) {
		Static590.aHashtable6.put(arg0, arg1);
	}
}
