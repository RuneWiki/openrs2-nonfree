import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	public static int anInt4550;

	@OriginalMember(owner = "client!ii", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString53;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "J")
	public static volatile long aLong109 = 0L;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!baa;")
	public static Class23 method3813(@OriginalArg(0) String arg0) {
		return method3830(aString46, arg0, anInt4550);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Lclient!baa;")
	public static Class23 method3830(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		if (arg2 == 33) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString50, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			@Pc(93) String local93 = local86[local88];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class23(new File(local93, local21), "rw", 10000L);
				} catch (@Pc(116) Exception local116) {
				}
			}
		}
		return null;
	}
}
