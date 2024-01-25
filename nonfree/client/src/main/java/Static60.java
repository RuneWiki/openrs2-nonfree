import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!br", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "I")
	public static int anInt1493;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!br", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!br", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!br", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!br", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString27;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString28;

	// $FF: synthetic field
	@OriginalMember(owner = "client!br", name = "o", descriptor = "Ljava/lang/Class;")
	public static Class aClass1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!br", name = "A", descriptor = "Ljava/lang/Class;")
	public static Class aClass2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!br", name = "E", descriptor = "Ljava/lang/Class;")
	public static Class aClass3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!br", name = "q", descriptor = "Ljava/lang/Class;")
	public static Class aClass4;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "J")
	public static volatile long aLong47 = 0L;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BILjava/lang/String;Ljava/lang/String;)Lclient!pga;")
	public static Class288 method1386(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(22) String local22;
		if (arg0 == 33) {
			local22 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local22 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local22 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(116) String[] local116 = new String[] { "c:/rscache/", "/rscache/", aString21, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(127) int local127 = 0; local127 < local116.length; local127++) {
			@Pc(132) String local132 = local116[local127];
			if (local132.length() <= 0 || (new File(local132)).exists()) {
				try {
					return new Class288(new File(local132, local22), "rw", 10000L);
				} catch (@Pc(159) Exception local159) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BLjava/lang/String;)Lclient!pga;")
	public static Class288 method1392(@OriginalArg(1) String arg0) {
		return method1386(anInt1493, arg0, aString28);
	}
}
