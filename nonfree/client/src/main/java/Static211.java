import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString42;

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
	public static int anInt4043;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!hga", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!hga", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!hga", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!hga", name = "x", descriptor = "J")
	public static volatile long aLong112 = 0L;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!jn;")
	public static Class175 method3582(@OriginalArg(0) String arg0) {
		return method3584(anInt4043, aString48, arg0);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)Lclient!jn;")
	public static Class175 method3584(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(25) String local25;
		if (arg0 == 33) {
			local25 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg0 == 34) {
			local25 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local25 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
		}
		@Pc(93) String[] local93 = new String[] { "c:/rscache/", "/rscache/", aString46, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local93.length; local95++) {
			@Pc(100) String local100 = local93[local95];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class175(new File(local100, local25), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}
}
