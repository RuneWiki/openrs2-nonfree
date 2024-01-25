import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	public static int anInt8505;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "J")
	public static volatile long aLong264 = 0L;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)Lclient!wr;")
	public static Class323 method7033(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(84) String[] local84 = new String[] { "c:/rscache/", "/rscache/", aString73, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(86) int local86 = 0; local86 < local84.length; local86++) {
			@Pc(91) String local91 = local84[local86];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class323(new File(local91, local16), "rw", 10000L);
				} catch (@Pc(117) Exception local117) {
				}
			}
		}
		return null;
	}
}
