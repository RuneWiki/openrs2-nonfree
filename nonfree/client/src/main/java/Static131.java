import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
	public static int anInt2754;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public static int anInt2755;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public static int anInt2749 = 0;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[I")
	public static final int[] anIntArray181 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method2230() {
		if (Static309.aBoolean418 && Static192.aBooleanArray19[81] && Static170.anInt6279 > 2) {
			Static107.method1839((Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247.aClass3_247);
		} else {
			Static107.method1839((Class3_Sub26) Static116.aClass127_12.aClass3_156.aClass3_247);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method2231() {
		Static243.aClass198_46.method5243(5);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!mq;)V")
	public static void method2232(@OriginalArg(1) Class3_Sub2 arg0) {
		arg0.aBoolean413 = false;
		if (arg0.aClass3_Sub17_5 != null) {
			arg0.aClass3_Sub17_5.anInt2520 = 0;
		}
		for (@Pc(18) Class3_Sub2 local18 = arg0.method5110(); local18 != null; local18 = arg0.method5111()) {
			method2232(local18);
		}
	}
}
