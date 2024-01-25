import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "client!nga", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!nga", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!nga", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!nga", name = "t", descriptor = "I")
	public static int anInt7076;

	@OriginalMember(owner = "client!nga", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!nga", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "client!nga", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "client!nga", name = "v", descriptor = "J")
	public static volatile long aLong166 = 0L;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;)Lclient!is;")
	public static Class150 method5930(@OriginalArg(1) String arg0) {
		return method5941(anInt7076, aString77, arg0);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lclient!is;")
	public static Class150 method5941(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(16) String local16;
		if (arg0 == 33) {
			local16 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg0 == 34) {
			local16 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
		}
		@Pc(93) String[] local93 = new String[] { "c:/rscache/", "/rscache/", aString82, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local93.length; local95++) {
			@Pc(100) String local100 = local93[local95];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class150(new File(local100, local16), "rw", 10000L);
				} catch (@Pc(123) Exception local123) {
				}
			}
		}
		return null;
	}
}
