import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static21 {

	@OriginalMember(owner = "client!am", name = "k", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_2 = new Class244(7, 7);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V")
	public static void method339(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static51.aHashtable1.put(arg0, arg1);
	}
}
