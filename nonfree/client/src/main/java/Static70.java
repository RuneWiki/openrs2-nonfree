import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	public static int anInt1175;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString14;

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString17;

	@OriginalMember(owner = "client!cr", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString18;

	@OriginalMember(owner = "client!cr", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!cr", name = "A", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "J")
	public static volatile long aLong38 = 0L;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lclient!hh;")
	public static Class133 method924(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(16) String local16;
		if (arg1 == 33) {
			local16 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local16 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString13, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			@Pc(93) String local93 = local86[local88];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class133(new File(local93, local16), "rw", 10000L);
				} catch (@Pc(119) Exception local119) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILjava/lang/String;)Lclient!hh;")
	public static Class133 method926(@OriginalArg(1) String arg0) {
		return method924(arg0, anInt1175, aString16);
	}
}
