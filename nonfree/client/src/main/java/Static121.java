import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1053 = Static161.method2971("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
	public static int anInt3152 = -1;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1054 = Static161.method2971("<col=40ff00>");

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!fd;II)Lclient!dd;")
	public static Class13 method2235(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1) {
		if (!Static43.method1140(arg1, Static53.method1292(arg0)) && arg0.anObjectArray19 == null) {
			return null;
		} else if (arg0.aClass13Array12 == null || arg0.aClass13Array12.length <= arg1 || arg0.aClass13Array12[arg1] == null || arg0.aClass13Array12[arg1].method897().method904() == 0) {
			return Static184.aBoolean317 ? Static57.method1349(new Class13[] { Static31.aClass13_381, Static3.method75(arg1) }) : null;
		} else {
			return arg0.aClass13Array12[arg1];
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public static void method2236() {
		aClass13_1053 = null;
		aCRC32_1 = null;
		anIntArrayArray25 = null;
		aClass13_1054 = null;
	}
}
