import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	public static int anInt6452;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_176 = new Class363(38, 6);

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_177 = new Class363(82, -2);

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
	public static long aLong173 = 20000000L;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray115 = new String[100];

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public static void method5405(@OriginalArg(0) int arg0) {
		if (Static409.anInt7111 == 0) {
			Static396.aClass2_Sub10_Sub2_3.method1531(arg0);
		} else {
			Static526.anInt8654 = arg0;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Z")
	public static boolean method5407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
