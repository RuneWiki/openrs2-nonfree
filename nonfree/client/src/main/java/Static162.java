import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gba", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!gba", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!gba", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!gba", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!gba", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!gba", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!gba", name = "q", descriptor = "I")
	public static int anInt2964;

	@OriginalMember(owner = "client!gba", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!gba", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!gba", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!gba", name = "A", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!gba", name = "e", descriptor = "J")
	public static volatile long aLong140 = 0L;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lclient!rg;")
	public static Class283 method2499(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(23) String local23;
		if (arg0 == 33) {
			local23 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local23 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local23 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString36, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(95) String local95 = local88[local90];
			if (local95.length() <= 0 || (new File(local95)).exists()) {
				try {
					return new Class283(new File(local95, local23), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gba", name = "b", descriptor = "(Ljava/lang/String;B)Lclient!rg;")
	public static Class283 method2515(@OriginalArg(0) String arg0) {
		return method2499(anInt2964, arg0, aString35);
	}
}
