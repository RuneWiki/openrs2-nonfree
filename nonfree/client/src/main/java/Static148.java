import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!ft", name = "v", descriptor = "I")
	public static int anInt2737;

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!ft", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "J")
	public static volatile long aLong89 = 0L;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!em;")
	public static Class91 method2167(@OriginalArg(0) String arg0) {
		return method2178(arg0, anInt2737, aString25);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)Lclient!em;")
	public static Class91 method2178(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(21) String local21;
		if (arg1 == 33) {
			local21 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local21 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString26, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local86.length; local95++) {
			@Pc(100) String local100 = local86[local95];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class91(new File(local100, local21), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}
}
