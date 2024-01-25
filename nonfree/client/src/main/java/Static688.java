import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static688 {

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString118;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString119;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString120;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString121;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString122;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString123;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString124;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString125;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
	public static int anInt10582;

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	// $FF: synthetic field
	@OriginalMember(owner = "client!vo", name = "b", descriptor = "Ljava/lang/Class;")
	public static Class aClass54;

	// $FF: synthetic field
	@OriginalMember(owner = "client!vo", name = "j", descriptor = "Ljava/lang/Class;")
	public static Class aClass55;

	// $FF: synthetic field
	@OriginalMember(owner = "client!vo", name = "F", descriptor = "Ljava/lang/Class;")
	public static Class aClass56;

	// $FF: synthetic field
	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Ljava/lang/Class;")
	public static Class aClass57;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "J")
	public static volatile long aLong333 = 0L;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(Ljava/lang/String;I)Lclient!ob;")
	public static Class268 method9263(@OriginalArg(0) String arg0) {
		return method9266(anInt10582, arg0, aString123);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Lclient!ob;")
	public static Class268 method9266(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(24) String local24;
		if (arg0 == 33) {
			local24 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local24 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local24 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(118) String[] local118 = new String[] { "c:/rscache/", "/rscache/", aString120, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(120) int local120 = 0; local120 < local118.length; local120++) {
			@Pc(125) String local125 = local118[local120];
			if (local125.length() <= 0 || (new File(local125)).exists()) {
				try {
					return new Class268(new File(local125, local24), "rw", 10000L);
				} catch (@Pc(155) Exception local155) {
				}
			}
		}
		return null;
	}
}
