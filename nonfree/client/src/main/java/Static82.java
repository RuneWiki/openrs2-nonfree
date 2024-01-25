import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
	public static int anInt1688;

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "[I")
	public static int[] anIntArray115;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_20 = new Class46(11, 16);

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "[Lclient!iaa;")
	public static final Class154[] aClass154Array1 = new Class154[8];

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)V")
	public static void method1379() {
		Static461.aClass87_191.method1793(5);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
	public static void method1380(@OriginalArg(1) int arg0) {
		Static228.anInt4240 = arg0;
		Static207.aClass87_105.method1801();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1382(@OriginalArg(0) String arg0) {
		return Static211.method3645(arg0, lha.class);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)I")
	public static int method1383(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}
}
