import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString110;

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString111;

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString112;

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString113;

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!wea", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString114;

	@OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
	public static int anInt10877;

	@OriginalMember(owner = "client!wea", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString115;

	@OriginalMember(owner = "client!wea", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString116;

	@OriginalMember(owner = "client!wea", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString117;

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "J")
	public static volatile long aLong272 = 0L;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!so;")
	public static Class320 method9066(@OriginalArg(0) String arg0) {
		return method9076(arg0, aString114, anInt10877);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lclient!so;")
	public static Class320 method9076(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) String local18;
		if (arg2 == 33) {
			local18 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local18 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local18 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString116, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(98) String local98 = local91[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class320(new File(local98, local18), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}
}
