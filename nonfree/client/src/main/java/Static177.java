import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString40;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString41;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString42;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString43;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
	public static int anInt3645;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "J")
	public static volatile long aLong94 = 0L;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lclient!kda;")
	public static Class171 method3224(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(23) String local23;
		if (arg2 == 33) {
			local23 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local23 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local23 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(91) String[] local91 = new String[] { "c:/rscache/", "/rscache/", aString42, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			@Pc(98) String local98 = local91[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class171(new File(local98, local23), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILjava/lang/String;)Lclient!kda;")
	public static Class171 method3227(@OriginalArg(1) String arg0) {
		return method3224(aString40, arg0, anInt3645);
	}
}
