import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!fr", name = "K", descriptor = "[I")
	public static int[] anIntArray101;

	@OriginalMember(owner = "client!fr", name = "Q", descriptor = "Lclient!qa;")
	public static Class128 aClass128_14;

	@OriginalMember(owner = "client!fr", name = "J", descriptor = "I")
	public static int anInt2155 = 1;

	@OriginalMember(owner = "client!fr", name = "O", descriptor = "I")
	public static final int anInt2159 = 1;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)V")
	public static void method1715() {
		@Pc(12) Class1_Sub3_Sub13 local12 = Static397.method4998(15, 0);
		local12.method3458();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI)V")
	public static void method1716(@OriginalArg(1) int arg0) {
		Static92.anInt1629 = 100;
		Static157.anInt2629 = arg0;
		Static176.anInt2869 = -1;
		Static409.anInt6639 = 3;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!dh;I)Ljava/lang/String;")
	public static String method1717(@OriginalArg(0) Class1_Sub11 arg0) {
		return Static400.method4918(arg0);
	}
}
