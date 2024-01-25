import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString19;

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString20;

	@OriginalMember(owner = "client!cea", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString21;

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString22;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!cea", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString25;

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString26;

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "I")
	public static int anInt1151;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cea", name = "t", descriptor = "Ljava/lang/Class;")
	public static Class aClass1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cea", name = "C", descriptor = "Ljava/lang/Class;")
	public static Class aClass2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cea", name = "v", descriptor = "Ljava/lang/Class;")
	public static Class aClass3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cea", name = "m", descriptor = "Ljava/lang/Class;")
	public static Class aClass4;

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "J")
	public static volatile long aLong53 = 0L;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)Lclient!sd;")
	public static Class333 method950(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(24) String local24;
		if (arg1 == 33) {
			local24 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local24 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local24 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(122) String[] local122 = new String[] { "c:/rscache/", "/rscache/", aString20, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(124) int local124 = 0; local124 < local122.length; local124++) {
			@Pc(129) String local129 = local122[local124];
			if (local129.length() <= 0 || (new File(local129)).exists()) {
				try {
					return new Class333(new File(local129, local24), "rw", 10000L);
				} catch (@Pc(159) Exception local159) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/String;)Lclient!sd;")
	public static Class333 method958(@OriginalArg(1) String arg0) {
		return method950(aString23, anInt1151, arg0);
	}
}
