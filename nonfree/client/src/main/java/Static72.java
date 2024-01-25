import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!cea", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString17;

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString18;

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "I")
	public static int anInt1366;

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!cea", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!cea", name = "A", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "J")
	public static volatile long aLong50 = 0L;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Lclient!ji;")
	public static Class182 method1311(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) String local18;
		if (arg2 == 33) {
			local18 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local18 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString19, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(95) String local95 = local88[local90];
			if (local95.length() <= 0 || (new File(local95)).exists()) {
				try {
					return new Class182(new File(local95, local18), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ji;")
	public static Class182 method1318(@OriginalArg(1) String arg0) {
		return method1311(aString20, arg0, anInt1366);
	}
}
