import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!fl", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	public static int anInt3661;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "J")
	public static volatile long aLong96 = 0L;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(ILjava/lang/String;)Lclient!vl;")
	public static Class360 method3134(@OriginalArg(1) String arg0) {
		return method3140(aString36, arg0, anInt3661);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)Lclient!vl;")
	public static Class360 method3140(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(19) String local19;
		if (arg2 == 33) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local19 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(84) String[] local84 = new String[] { "c:/rscache/", "/rscache/", aString32, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(94) int local94 = 0; local94 < local84.length; local94++) {
			@Pc(99) String local99 = local84[local94];
			if (local99.length() <= 0 || (new File(local99)).exists()) {
				try {
					return new Class360(new File(local99, local19), "rw", 10000L);
				} catch (@Pc(122) Exception local122) {
				}
			}
		}
		return null;
	}
}
