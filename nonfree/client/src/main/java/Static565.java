import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	public static int anInt9782;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString93;

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString94;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString96;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!td", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString99;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString100;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "J")
	public static volatile long aLong255 = 0L;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lclient!qia;")
	public static Class285 method8135(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(23) String local23;
		if (arg2 == 33) {
			local23 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local23 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local23 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString93, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(98) String local98 = local91[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class285(new File(local98, local23), "rw", 10000L);
				} catch (@Pc(124) Exception local124) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/lang/String;)Lclient!qia;")
	public static Class285 method8148(@OriginalArg(1) String arg0) {
		return method8135(arg0, aString97, anInt9782);
	}
}
