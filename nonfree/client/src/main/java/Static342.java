import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	public static int anInt6023;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString86;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString87;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "J")
	public static volatile long aLong172 = 0L;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!oaa;")
	public static Class235 method5189(@OriginalArg(0) String arg0) {
		return method5193(aString87, arg0, anInt6023);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lclient!oaa;")
	public static Class235 method5193(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(21) String local21;
		if (arg2 == 33) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString80, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			@Pc(101) String local101 = local86[local88];
			if (local101.length() <= 0 || (new File(local101)).exists()) {
				try {
					return new Class235(new File(local101, local21), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}
}
