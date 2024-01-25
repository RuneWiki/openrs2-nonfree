import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!iha", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString58;

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!iha", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!iha", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!iha", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!iha", name = "u", descriptor = "I")
	public static int anInt4764;

	@OriginalMember(owner = "client!iha", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString63;

	@OriginalMember(owner = "client!iha", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!iha", name = "z", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!iha", name = "i", descriptor = "Ljava/lang/Class;")
	public static Class aClass27;

	// $FF: synthetic field
	@OriginalMember(owner = "client!iha", name = "t", descriptor = "Ljava/lang/Class;")
	public static Class aClass28;

	// $FF: synthetic field
	@OriginalMember(owner = "client!iha", name = "e", descriptor = "Ljava/lang/Class;")
	public static Class aClass29;

	// $FF: synthetic field
	@OriginalMember(owner = "client!iha", name = "n", descriptor = "Ljava/lang/Class;")
	public static Class aClass30;

	@OriginalMember(owner = "client!iha", name = "B", descriptor = "J")
	public static volatile long aLong132 = 0L;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lclient!td;")
	public static Class345 method4241(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(24) String local24;
		if (arg1 == 33) {
			local24 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local24 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local24 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(116) String[] local116 = new String[] { "c:/rscache/", "/rscache/", aString63, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(118) int local118 = 0; local118 < local116.length; local118++) {
			@Pc(123) String local123 = local116[local118];
			if (local123.length() <= 0 || (new File(local123)).exists()) {
				try {
					return new Class345(new File(local123, local24), "rw", 10000L);
				} catch (@Pc(150) Exception local150) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILjava/lang/String;)Lclient!td;")
	public static Class345 method4243(@OriginalArg(1) String arg0) {
		return method4241(aString58, anInt4764, arg0);
	}
}
