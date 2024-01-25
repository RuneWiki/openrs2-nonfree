import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString235;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString236;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	public static int anInt10605;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString237;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString238;

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString239;

	@OriginalMember(owner = "client!wv", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!wv", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString240;

	@OriginalMember(owner = "client!wv", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString241;

	@OriginalMember(owner = "client!wv", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString242;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "J")
	public static volatile long aLong296 = 0L;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lclient!wc;")
	public static Class354 method8269(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		if (arg2 == 33) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString240, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			@Pc(93) String local93 = local86[local88];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class354(new File(local93, local21), "rw", 10000L);
				} catch (@Pc(116) Exception local116) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLjava/lang/String;)Lclient!wc;")
	public static Class354 method8281(@OriginalArg(1) String arg0) {
		return method8269(aString236, arg0, anInt10605);
	}
}
