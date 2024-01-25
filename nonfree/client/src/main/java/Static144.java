import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public static int anInt2486;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "J")
	public static volatile long aLong72 = 0L;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!dq;")
	public static Class79 method2094(@OriginalArg(0) String arg0) {
		return method2096(arg0, anInt2486, aString28);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lclient!dq;")
	public static Class79 method2096(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(26) String local26;
		if (arg1 == 33) {
			local26 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local26 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local26 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString31, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(98) String local98 = local91[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class79(new File(local98, local26), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}
}
