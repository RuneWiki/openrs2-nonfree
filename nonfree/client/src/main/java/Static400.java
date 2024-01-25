import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static400 {

	@OriginalMember(owner = "client!no", name = "u", descriptor = "Lclient!la;")
	public static Class208 aClass208_90;

	@OriginalMember(owner = "client!no", name = "F", descriptor = "I")
	public static int anInt6886 = -1;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "Z")
	public static boolean aBoolean529 = true;

	@OriginalMember(owner = "client!no", name = "G", descriptor = "Z")
	public static boolean aBoolean530 = false;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	public static void method5892() {
		Static183.aLong91 = 0L;
		Static537.aString57 = "";
		Static471.anInt7980 = -1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	public static void method5893() {
		Static640.anImage13 = null;
		Static303.aFont1 = null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/io/File;Ljava/lang/String;)V")
	public static void method5894(@OriginalArg(1) File arg0, @OriginalArg(2) String arg1) {
		Static357.aHashtable8.put(arg1, arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI)V")
	public static void method5896(@OriginalArg(1) int arg0) {
		Static510.aLong257 = 1000000000L / (long) arg0;
	}
}
