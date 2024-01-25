import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt4180;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Z")
	public static boolean aBoolean341;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!sfa;")
	public static final Class302 aClass302_5 = new Class302();

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public static int anInt4184 = -1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Ljava/lang/String;Ljava/io/File;I)V")
	public static void method3493(@OriginalArg(0) String arg0, @OriginalArg(1) File arg1) {
		Static9.aHashtable1.put(arg0, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Z")
	public static boolean method3494(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static95.method1481(arg0, arg1) | Static80.method1266(arg1, arg0) | Static91.method1445(arg0, arg1)) & Static149.method2444(arg0, arg1);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BII)Z")
	public static boolean method3495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
