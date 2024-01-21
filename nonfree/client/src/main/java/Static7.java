import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1 = new Class25(20);

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Lclient!rf;")
	public static Class70 aClass70_90 = Static49.method1293("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!rf;")
	private static Class70 aClass70_92 = Static49.method1293("Click to switch");

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Lclient!rf;")
	public static Class70 aClass70_91 = aClass70_92;

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "Lclient!rf;")
	public static Class70 aClass70_93 = Static49.method1293("http:)4)4");

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method240() {
		aClass70_93 = null;
		aClass25_1 = null;
		aClass70_92 = null;
		aCRC32_1 = null;
		aClass70_90 = null;
		aClass70_91 = null;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Z")
	public static boolean method244(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}
}
