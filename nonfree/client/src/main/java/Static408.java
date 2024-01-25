import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString55;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString56;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString57;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString58;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString61;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString62;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	public static int anInt7020;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "J")
	public static volatile long aLong197 = 0L;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)Lclient!mca;")
	public static Class204 method5885(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(23) String local23;
		if (arg1 == 33) {
			local23 = "jagex_" + arg2 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg1 == 34) {
			local23 = "jagex_" + arg2 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local23 = "jagex_" + arg2 + "_preferences" + arg0 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString57, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(95) String local95 = local88[local90];
			if (local95.length() <= 0 || (new File(local95)).exists()) {
				try {
					return new Class204(new File(local95, local23), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!mca;")
	public static Class204 method5892(@OriginalArg(0) String arg0) {
		return method5885(arg0, anInt7020, aString58);
	}
}
