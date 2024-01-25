import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array3;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public static int anInt2062;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	public static int anInt2070;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
	public static int anInt2065 = 0;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	public static int anInt2066 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ge;I)V")
	public static void method1752(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (Static197.aClass307_6 == null) {
			return;
		}
		try {
			Static197.aClass307_6.method7175(0L);
			Static197.aClass307_6.method7184(arg0.aByteArray66, arg1, 24);
		} catch (@Pc(16) Exception local16) {
		}
	}
}
