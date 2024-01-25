import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString128;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString129;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString130;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString131;

	@OriginalMember(owner = "client!k", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString132;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString133;

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString134;

	@OriginalMember(owner = "client!k", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString135;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "I")
	public static int anInt5105;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "J")
	public static volatile long aLong127 = 0L;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLjava/lang/String;)Lclient!qq;")
	public static Class272 method4092(@OriginalArg(1) String arg0) {
		return method4093(anInt5105, arg0, aString135);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)Lclient!qq;")
	public static Class272 method4093(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(25) String local25;
		if (arg0 == 33) {
			local25 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local25 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local25 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(95) String[] local95 = new String[] { "c:/rscache/", "/rscache/", aString133, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			@Pc(102) String local102 = local95[local97];
			if (local102.length() <= 0 || (new File(local102)).exists()) {
				try {
					return new Class272(new File(local102, local25), "rw", 10000L);
				} catch (@Pc(128) Exception local128) {
				}
			}
		}
		return null;
	}
}
