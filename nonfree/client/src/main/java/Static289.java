import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static289 {

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public static int anInt4579;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
	public static final int[] anIntArray350 = new int[4];

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray20 = new String[200];

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[250][];

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "[I")
	public static int[] anIntArray351 = new int[2];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!gda;ZZ)V")
	public static void method4138(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean771 = arg1;
		if (Static186.aBoolean244) {
			Static48.aClass394Array1[Static48.aClass394Array1.length - 1].method8978(arg0);
		} else {
			Static390.method5013(arg0, Static35.aClass4_Sub29Array2);
		}
	}
}
