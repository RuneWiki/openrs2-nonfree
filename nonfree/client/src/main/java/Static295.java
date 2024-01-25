import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString71;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString72;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
	public static int anInt4744;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "J")
	public static volatile long aLong148 = 0L;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLjava/lang/String;)Lclient!cr;")
	public static Class62 method4330(@OriginalArg(1) String arg0) {
		return method4333(aString70, anInt4744, arg0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lclient!cr;")
	public static Class62 method4333(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(23) String local23;
		if (arg1 == 33) {
			local23 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local23 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local23 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString72, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local88.length; local95++) {
			@Pc(100) String local100 = local88[local95];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class62(new File(local100, local23), "rw", 10000L);
				} catch (@Pc(126) Exception local126) {
				}
			}
		}
		return null;
	}
}
