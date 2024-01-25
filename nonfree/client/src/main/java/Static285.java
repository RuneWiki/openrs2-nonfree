import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString57;

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString58;

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!laa", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
	public static int anInt5221;

	@OriginalMember(owner = "client!laa", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!laa", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!laa", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString63;

	@OriginalMember(owner = "client!laa", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!laa", name = "r", descriptor = "J")
	public static volatile long aLong129 = 0L;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!pk;")
	public static Class268 method4284(@OriginalArg(0) String arg0) {
		return method4288(aString60, arg0, anInt5221);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lclient!pk;")
	public static Class268 method4288(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(19) String local19;
		if (arg2 == 33) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(89) String[] local89 = new String[] { "c:/rscache/", "/rscache/", aString61, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			@Pc(96) String local96 = local89[local91];
			if (local96.length() <= 0 || (new File(local96)).exists()) {
				try {
					return new Class268(new File(local96, local19), "rw", 10000L);
				} catch (@Pc(122) Exception local122) {
				}
			}
		}
		return null;
	}
}
