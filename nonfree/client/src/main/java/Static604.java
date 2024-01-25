import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString91;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString92;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
	public static int anInt9904;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString93;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!vk", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString94;

	@OriginalMember(owner = "client!vk", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString95;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString96;

	@OriginalMember(owner = "client!vk", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "client!vk", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!vk", name = "A", descriptor = "J")
	public static volatile long aLong267 = 0L;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)Lclient!bt;")
	public static Class44 method8269(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(16) String local16;
		if (arg2 == 33) {
			local16 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local16 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(93) String[] local93 = new String[] { "c:/rscache/", "/rscache/", aString93, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(95) int local95 = 0; local95 < local93.length; local95++) {
			@Pc(100) String local100 = local93[local95];
			if (local100.length() <= 0 || (new File(local100)).exists()) {
				try {
					return new Class44(new File(local100, local16), "rw", 10000L);
				} catch (@Pc(123) Exception local123) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!bt;")
	public static Class44 method8270(@OriginalArg(1) String arg0) {
		return method8269(arg0, aString97, anInt9904);
	}
}
