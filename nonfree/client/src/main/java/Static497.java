import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString91;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString92;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString93;

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString94;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "I")
	public static int anInt8155;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString96;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "J")
	public static volatile long aLong246 = 0L;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)Lclient!mea;")
	public static Class214 method7131(@OriginalArg(1) String arg0) {
		return method7140(anInt8155, aString94, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lclient!mea;")
	public static Class214 method7140(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(30) String local30;
		if (arg0 == 33) {
			local30 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg0 == 34) {
			local30 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local30 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
		}
		@Pc(95) String[] local95 = new String[] { "c:/rscache/", "/rscache/", aString97, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			@Pc(102) String local102 = local95[local97];
			if (local102.length() <= 0 || (new File(local102)).exists()) {
				try {
					return new Class214(new File(local102, local30), "rw", 10000L);
				} catch (@Pc(125) Exception local125) {
				}
			}
		}
		return null;
	}
}
