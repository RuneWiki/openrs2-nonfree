import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString63;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
	public static int anInt5176;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString66;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString67;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "J")
	public static volatile long aLong159 = 0L;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lclient!ea;")
	public static Class80 method4577(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(21) String local21;
		if (arg1 == 33) {
			local21 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local21 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString63, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local86.length; local95++) {
			@Pc(100) String local100 = local86[local95];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class80(new File(local100, local21), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ea;")
	public static Class80 method4580(@OriginalArg(0) String arg0) {
		return method4577(arg0, anInt5176, aString60);
	}
}
