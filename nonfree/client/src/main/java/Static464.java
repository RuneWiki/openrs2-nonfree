import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!rj", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!rj", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
	public static int anInt7970;

	@OriginalMember(owner = "client!rj", name = "B", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "J")
	public static volatile long aLong216 = 0L;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)Lclient!cu;")
	public static Class63 method6536(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(18) String local18;
		if (arg0 == 33) {
			local18 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local18 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local18 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString80, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(104) String local104 = local88[local90];
			if (local104.length() <= 0 || (new File(local104)).exists()) {
				try {
					return new Class63(new File(local104, local18), "rw", 10000L);
				} catch (@Pc(127) Exception local127) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!cu;")
	public static Class63 method6538(@OriginalArg(0) String arg0) {
		return method6536(anInt7970, arg0, aString78);
	}
}
