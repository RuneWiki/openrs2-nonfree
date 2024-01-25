import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public static int anInt8437;

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString74;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString78;

	@OriginalMember(owner = "client!rp", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!rp", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "J")
	public static volatile long aLong221 = 0L;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!ac;")
	public static Class4 method7272(@OriginalArg(0) String arg0) {
		return method7274(anInt8437, arg0, aString76);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)Lclient!ac;")
	public static Class4 method7274(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		@Pc(23) String local23;
		if (arg0 == 33) {
			local23 = "jagex_" + arg2 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg0 == 34) {
			local23 = "jagex_" + arg2 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local23 = "jagex_" + arg2 + "_preferences" + arg1 + ".dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString80, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(102) String local102 = local88[local90];
			if (local102.length() <= 0 || (new File(local102)).exists()) {
				try {
					return new Class4(new File(local102, local23), "rw", 10000L);
				} catch (@Pc(125) Exception local125) {
				}
			}
		}
		return null;
	}
}
