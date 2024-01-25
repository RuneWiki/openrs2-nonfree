import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
	public static int anInt8773;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!tt", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "J")
	public static volatile long aLong221 = 0L;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)Lclient!fn;")
	public static Class108 method6987(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(16) String local16;
		if (arg0 == 33) {
			local16 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local16 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(95) String[] local95 = new String[] { "c:/rscache/", "/rscache/", aString79, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			@Pc(102) String local102 = local95[local97];
			if (local102.length() <= 0 || (new File(local102)).exists()) {
				try {
					return new Class108(new File(local102, local16), "rw", 10000L);
				} catch (@Pc(125) Exception local125) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!fn;")
	public static Class108 method6990(@OriginalArg(0) String arg0) {
		return method6987(anInt8773, arg0, aString75);
	}
}
