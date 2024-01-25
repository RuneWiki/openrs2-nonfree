import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
	public static int anInt6309;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString86;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "J")
	public static volatile long aLong164 = 0L;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lclient!fi;")
	public static Class123 method5285(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(18) String local18;
		if (arg1 == 33) {
			local18 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local18 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(94) String[] local94 = new String[] { "c:/rscache/", "/rscache/", aString85, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(96) int local96 = 0; local96 < local94.length; local96++) {
			@Pc(101) String local101 = local94[local96];
			if (local101.length() <= 0 || (new File(local101)).exists()) {
				try {
					return new Class123(new File(local101, local18), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!fi;")
	public static Class123 method5289(@OriginalArg(0) String arg0) {
		return method5285(aString81, anInt6309, arg0);
	}
}
