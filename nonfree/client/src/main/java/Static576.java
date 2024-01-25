import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tga", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString103;

	@OriginalMember(owner = "client!tga", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!tga", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString104;

	@OriginalMember(owner = "client!tga", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString105;

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString106;

	@OriginalMember(owner = "client!tga", name = "x", descriptor = "I")
	public static int anInt9006;

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString107;

	@OriginalMember(owner = "client!tga", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString108;

	@OriginalMember(owner = "client!tga", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString109;

	@OriginalMember(owner = "client!tga", name = "F", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!tga", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString110;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tga", name = "D", descriptor = "Ljava/lang/Class;")
	public static Class aClass22;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tga", name = "c", descriptor = "Ljava/lang/Class;")
	public static Class aClass23;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tga", name = "z", descriptor = "Ljava/lang/Class;")
	public static Class aClass24;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tga", name = "u", descriptor = "Ljava/lang/Class;")
	public static Class aClass25;

	@OriginalMember(owner = "client!tga", name = "y", descriptor = "J")
	public static volatile long aLong266 = 0L;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!lm;")
	public static Class223 method7734(@OriginalArg(0) String arg0) {
		return method7739(anInt9006, arg0, aString105);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)Lclient!lm;")
	public static Class223 method7739(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(31) String local31;
		if (arg0 == 33) {
			local31 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local31 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local31 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(126) String[] local126 = new String[] { "c:/rscache/", "/rscache/", aString108, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(128) int local128 = 0; local128 < local126.length; local128++) {
			@Pc(133) String local133 = local126[local128];
			if (local133.length() <= 0 || (new File(local133)).exists()) {
				try {
					return new Class223(new File(local133, local31), "rw", 10000L);
				} catch (@Pc(160) Exception local160) {
				}
			}
		}
		return null;
	}
}
