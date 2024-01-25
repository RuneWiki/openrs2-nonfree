import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt2223;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "J")
	public static volatile long aLong64 = 0L;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)Lclient!ro;")
	public static Class312 method1872(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(19) String local19;
		if (arg0 == 33) {
			local19 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local19 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(84) String[] local84 = new String[] { "c:/rscache/", "/rscache/", aString36, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(86) int local86 = 0; local86 < local84.length; local86++) {
			@Pc(91) String local91 = local84[local86];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class312(new File(local91, local19), "rw", 10000L);
				} catch (@Pc(117) Exception local117) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ro;")
	public static Class312 method1878(@OriginalArg(0) String arg0) {
		return method1872(anInt2223, arg0, aString37);
	}
}
