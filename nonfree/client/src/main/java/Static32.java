import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bca", name = "D", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array3;

	@OriginalMember(owner = "client!bca", name = "G", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!bca", name = "H", descriptor = "Lclient!f;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "Lclient!waa;")
	public static final Class350 aClass350_2 = new Class350(16);

	@OriginalMember(owner = "client!bca", name = "C", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!bca", name = "F", descriptor = "I")
	public static int anInt495 = -1;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!la;)V")
	public static void method443(@OriginalArg(0) Class58 arg0) {
		Static440.aClass58_12 = arg0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BII)I")
	public static int method444(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static570.anIntArray536[arg1 & 0x3] : Static199.anIntArray183[arg1 & 0x3];
	}
}
