import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!mca", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString81;

	@OriginalMember(owner = "client!mca", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString82;

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!mca", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString83;

	@OriginalMember(owner = "client!mca", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString84;

	@OriginalMember(owner = "client!mca", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString85;

	@OriginalMember(owner = "client!mca", name = "B", descriptor = "I")
	public static int anInt6278;

	@OriginalMember(owner = "client!mca", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!mca", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString86;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString87;

	// $FF: synthetic field
	@OriginalMember(owner = "client!mca", name = "v", descriptor = "Ljava/lang/Class;")
	public static Class aClass18;

	// $FF: synthetic field
	@OriginalMember(owner = "client!mca", name = "l", descriptor = "Ljava/lang/Class;")
	public static Class aClass19;

	// $FF: synthetic field
	@OriginalMember(owner = "client!mca", name = "x", descriptor = "Ljava/lang/Class;")
	public static Class aClass20;

	// $FF: synthetic field
	@OriginalMember(owner = "client!mca", name = "C", descriptor = "Ljava/lang/Class;")
	public static Class aClass21;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "J")
	public static volatile long aLong195 = 0L;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!qb;")
	public static Class286 method5354(@OriginalArg(0) String arg0) {
		return method5356(aString86, anInt6278, arg0);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)Lclient!qb;")
	public static Class286 method5356(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(22) String local22;
		if (arg1 == 33) {
			local22 = "jagex_" + arg0 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg1 == 34) {
			local22 = "jagex_" + arg0 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local22 = "jagex_" + arg0 + "_preferences" + arg2 + ".dat";
		}
		@Pc(116) String[] local116 = new String[] { "c:/rscache/", "/rscache/", aString81, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(129) int local129 = 0; local129 < local116.length; local129++) {
			@Pc(134) String local134 = local116[local129];
			if (local134.length() <= 0 || (new File(local134)).exists()) {
				try {
					return new Class286(new File(local134, local22), "rw", 10000L);
				} catch (@Pc(164) Exception local164) {
				}
			}
		}
		return null;
	}
}
