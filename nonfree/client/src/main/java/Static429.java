import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
	public static int anInt7512;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString64;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString66;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString67;

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString68;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!oq", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!oq", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "J")
	public static volatile long aLong202 = 0L;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!vm;")
	public static Class373 method6325(@OriginalArg(0) String arg0) {
		return method6332(aString70, arg0, anInt7512);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lclient!vm;")
	public static Class373 method6332(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(18) String local18;
		if (arg2 == 33) {
			local18 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local18 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local18 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString67, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(95) String local95 = local88[local90];
			if (local95.length() <= 0 || (new File(local95)).exists()) {
				try {
					return new Class373(new File(local95, local18), "rw", 10000L);
				} catch (@Pc(118) Exception local118) {
				}
			}
		}
		return null;
	}
}
