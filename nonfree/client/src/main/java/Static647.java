import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString143;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString144;

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString145;

	@OriginalMember(owner = "client!vt", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString146;

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString147;

	@OriginalMember(owner = "client!vt", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!vt", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString148;

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
	public static int anInt10433;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString149;

	@OriginalMember(owner = "client!vt", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString150;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "J")
	public static volatile long aLong297 = 0L;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;)Lclient!gba;")
	public static Class114 method8809(@OriginalArg(1) String arg0) {
		return method8810(arg0, anInt10433, aString143);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lclient!gba;")
	public static Class114 method8810(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(23) String local23;
		if (arg1 == 33) {
			local23 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local23 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local23 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString149, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(95) String local95 = local88[local90];
			if (local95.length() <= 0 || (new File(local95)).exists()) {
				try {
					return new Class114(new File(local95, local23), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}
}
