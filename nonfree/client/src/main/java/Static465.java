import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString66;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString67;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!qg", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!qg", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!qg", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
	public static int anInt7529;

	@OriginalMember(owner = "client!qg", name = "z", descriptor = "J")
	public static volatile long aLong207 = 0L;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Lclient!dq;")
	public static Class82 method6569(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(25) String local25;
		if (arg2 == 33) {
			local25 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local25 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local25 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(93) String[] local93 = new String[] { "c:/rscache/", "/rscache/", aString64, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local93.length; local95++) {
			@Pc(100) String local100 = local93[local95];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class82(new File(local100, local25), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;)Lclient!dq;")
	public static Class82 method6576(@OriginalArg(1) String arg0) {
		return method6569(aString70, arg0, anInt7529);
	}
}
