import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public static int anInt10054;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString97;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString99;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString100;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString101;

	@OriginalMember(owner = "client!wd", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString102;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString103;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString104;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "J")
	public static volatile long aLong261 = 0L;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lclient!vba;")
	public static Class337 method8216(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(16) String local16;
		if (arg2 == 33) {
			local16 = "jagex_" + arg1 + "_preferences" + arg0 + "_rc.dat";
		} else if (arg2 == 34) {
			local16 = "jagex_" + arg1 + "_preferences" + arg0 + "_wip.dat";
		} else {
			local16 = "jagex_" + arg1 + "_preferences" + arg0 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString103, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(93) int local93 = 0; local93 < local86.length; local93++) {
			@Pc(98) String local98 = local86[local93];
			if (local98.length() <= 0 || (new File(local98)).exists()) {
				try {
					return new Class337(new File(local98, local16), "rw", 10000L);
				} catch (@Pc(121) Exception local121) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;Z)Lclient!vba;")
	public static Class337 method8228(@OriginalArg(0) String arg0) {
		return method8216(arg0, aString101, anInt10054);
	}
}
