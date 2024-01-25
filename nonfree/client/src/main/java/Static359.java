import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString66;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString67;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	public static int anInt5677;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "J")
	public static volatile long aLong154 = 0L;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lclient!el;")
	public static Class92 method4848(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(19) String local19;
		if (arg2 == 33) {
			local19 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local19 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(84) String[] local84 = new String[] { "c:/rscache/", "/rscache/", aString68, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(86) int local86 = 0; local86 < local84.length; local86++) {
			@Pc(91) String local91 = local84[local86];
			if (local91.length() <= 0 || (new File(local91)).exists()) {
				try {
					return new Class92(new File(local91, local19), "rw", 10000L);
				} catch (@Pc(114) Exception local114) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILjava/lang/String;)Lclient!el;")
	public static Class92 method4856(@OriginalArg(1) String arg0) {
		return method4848(arg0, aString73, anInt5677);
	}
}
