import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString116;

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString117;

	@OriginalMember(owner = "client!ufa", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString118;

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString119;

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString120;

	@OriginalMember(owner = "client!ufa", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString121;

	@OriginalMember(owner = "client!ufa", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ufa", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString122;

	@OriginalMember(owner = "client!ufa", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString123;

	@OriginalMember(owner = "client!ufa", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ufa", name = "y", descriptor = "I")
	public static int anInt9609;

	@OriginalMember(owner = "client!ufa", name = "B", descriptor = "J")
	public static volatile long aLong238 = 0L;

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lclient!hr;")
	public static Class148 method7794(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(16) String local16;
		if (arg2 == 33) {
			local16 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local16 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString120, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(98) String local98 = local91[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class148(new File(local98, local16), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(ILjava/lang/String;)Lclient!hr;")
	public static Class148 method7800(@OriginalArg(1) String arg0) {
		return method7794(aString122, arg0, anInt9609);
	}
}
