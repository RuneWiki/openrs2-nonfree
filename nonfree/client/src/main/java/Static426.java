import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString66;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
	public static int anInt7407;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString67;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "client!qj", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "J")
	public static volatile long aLong204 = 0L;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lclient!bi;")
	public static Class31 method6115(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		if (arg2 == 33) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString66, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			@Pc(93) String local93 = local86[local88];
			if (local93.length() <= 0 || (new File(local93)).exists()) {
				try {
					return new Class31(new File(local93, local21), "rw", 10000L);
				} catch (@Pc(116) Exception local116) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILjava/lang/String;)Lclient!bi;")
	public static Class31 method6120(@OriginalArg(1) String arg0) {
		return method6115(aString71, arg0, anInt7407);
	}
}
