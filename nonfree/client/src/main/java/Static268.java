import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "Lclient!jb;")
	public static Class171 aClass171_64;

	@OriginalMember(owner = "client!jaa", name = "v", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_46 = new Class240(28, 2);

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
	public static int anInt4647 = -1;

	@OriginalMember(owner = "client!jaa", name = "t", descriptor = "Lclient!gm;")
	public static final Class135 aClass135_5 = new Class135("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
	public static String method3987(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg2.indexOf(arg1); local14 != -1; local14 = arg2.indexOf(arg1, local14 + arg0.length())) {
			arg2 = arg2.substring(0, local14) + arg0 + arg2.substring(local14 + arg1.length());
		}
		return arg2;
	}
}
