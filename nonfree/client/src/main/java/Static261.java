import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	public static int anInt4979;

	@OriginalMember(owner = "client!t", name = "n", descriptor = "[I")
	public static int[] anIntArray541;

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	public static volatile int anInt4978 = -1;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	public static int anInt4980 = 1;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "[I")
	public static int[] anIntArray540 = new int[100];

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!fh;ZILclient!fh;)V")
	public static void method4117(@OriginalArg(0) Class58 arg0, @OriginalArg(3) Class58 arg1) {
		Static222.aBoolean302 = true;
		Static311.aClass58_104 = arg1;
		Static44.aClass58_21 = arg0;
	}
}
