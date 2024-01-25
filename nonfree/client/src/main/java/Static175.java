import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
	public static int anInt4172;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!gh", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString53;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "J")
	public static volatile long aLong108 = 0L;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)Lclient!ww;")
	public static Class379 method3401(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		if (arg2 == 33) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString49, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(98) String local98 = local91[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class379(new File(local98, local21), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLjava/lang/String;)Lclient!ww;")
	public static Class379 method3409(@OriginalArg(1) String arg0) {
		return method3401(aString53, arg0, anInt4172);
	}
}
