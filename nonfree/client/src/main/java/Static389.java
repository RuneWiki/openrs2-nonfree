import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString86;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString87;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString88;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString89;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString90;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString91;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString92;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public static int anInt7292;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
	public static volatile long aLong163 = 0L;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Lclient!ip;")
	public static Class155 method6133(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(21) String local21;
		if (arg2 == 33) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString86, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			@Pc(93) String local93 = local86[local88];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class155(new File(local93, local21), "rw", 10000L);
				} catch (@Pc(119) Exception local119) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!ip;")
	public static Class155 method6137(@OriginalArg(1) String arg0) {
		return method6133(aString90, arg0, anInt7292);
	}
}
