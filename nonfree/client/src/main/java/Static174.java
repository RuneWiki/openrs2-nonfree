import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString32;

	@OriginalMember(owner = "client!ft", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString34;

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!ft", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString36;

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "I")
	public static int anInt3558;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ft", name = "y", descriptor = "Ljava/lang/Class;")
	public static Class aClass7;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ft", name = "x", descriptor = "Ljava/lang/Class;")
	public static Class aClass8;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ft", name = "B", descriptor = "Ljava/lang/Class;")
	public static Class aClass9;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ft", name = "e", descriptor = "Ljava/lang/Class;")
	public static Class aClass10;

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "J")
	public static volatile long aLong101 = 0L;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!rv;")
	public static Class320 method3358(@OriginalArg(0) String arg0) {
		return method3363(aString31, arg0, anInt3558);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lclient!rv;")
	public static Class320 method3363(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(29) String local29;
		if (arg2 == 33) {
			local29 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local29 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local29 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(118) String[] local118 = new String[] { "c:/rscache/", "/rscache/", aString32, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(120) int local120 = 0; local120 < local118.length; local120++) {
			@Pc(125) String local125 = local118[local120];
			if (local125.length() <= 0 || (new File(local125)).exists()) {
				try {
					return new Class320(new File(local125, local29), "rw", 10000L);
				} catch (@Pc(152) Exception local152) {
				}
			}
		}
		return null;
	}
}
