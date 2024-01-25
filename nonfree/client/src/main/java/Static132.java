import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!ew", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString28;

	@OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
	public static int anInt2141;

	@OriginalMember(owner = "client!ew", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString29;

	@OriginalMember(owner = "client!ew", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ew", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!ew", name = "t", descriptor = "J")
	public static volatile long aLong52 = 0L;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sr;")
	public static Class317 method1782(@OriginalArg(0) String arg0) {
		return method1788(aString31, anInt2141, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lclient!sr;")
	public static Class317 method1788(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString27, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local86.length; local93++) {
			@Pc(98) String local98 = local86[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class317(new File(local98, local16), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}
}
