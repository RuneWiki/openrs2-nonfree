import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString47;

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	public static int anInt5488;

	@OriginalMember(owner = "client!kj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString49;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString50;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod1;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString53;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "Ljava/lang/reflect/Method;")
	public static Method aMethod2;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "J")
	public static volatile long aLong158 = 0L;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;B)Lclient!qaa;")
	public static Class281 method4735(@OriginalArg(0) String arg0) {
		return method4736(aString49, arg0, anInt5488);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)Lclient!qaa;")
	public static Class281 method4736(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(21) String local21;
		if (arg2 == 33) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_rc.dat";
		} else if (arg2 == 34) {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + "_wip.dat";
		} else {
			local21 = "jagex_" + arg0 + "_preferences" + arg1 + ".dat";
		}
		@Pc(86) String[] local86 = new String[] { "c:/rscache/", "/rscache/", aString48, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(88) int local88 = 0; local88 < local86.length; local88++) {
			@Pc(97) String local97 = local86[local88];
			if (local97.length() <= 0 || (new File(local97)).exists()) {
				try {
					return new Class281(new File(local97, local21), "rw", 10000L);
				} catch (@Pc(123) Exception local123) {
				}
			}
		}
		return null;
	}
}
