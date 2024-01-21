import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!m", name = "z", descriptor = "Lclient!ef;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!m", name = "C", descriptor = "Lclient!rf;")
	public static Class70 aClass70_965 = Static49.method1293("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!m", name = "E", descriptor = "[I")
	public static int[] anIntArray289 = new int[5];

	@OriginalMember(owner = "client!m", name = "I", descriptor = "Lclient!rf;")
	public static Class70 aClass70_966 = null;

	@OriginalMember(owner = "client!m", name = "L", descriptor = "Lclient!rf;")
	public static Class70 aClass70_967 = Static49.method1293("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!m", name = "N", descriptor = "I")
	public static int anInt2980 = 0;

	@OriginalMember(owner = "client!m", name = "O", descriptor = "I")
	public static int anInt2981 = 0;

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "[I")
	public static int[] anIntArray290 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)Lclient!ob;")
	public static Class1_Sub1_Sub14 method2208(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub14 local10 = (Class1_Sub1_Sub14) Static173.aClass25_26.method1302((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static117.aClass76_95.method3316(arg0, 5);
		local10 = new Class1_Sub1_Sub14();
		if (local28 != null) {
			local10.method2494(new Class1_Sub9(local28));
		}
		Static173.aClass25_26.method1299(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
	public static void method2211() {
		aClass70_965 = null;
		anIntArray289 = null;
		anIntArray290 = null;
		aClass1_Sub8_Sub1_1 = null;
		aClass70_966 = null;
		aClass70_967 = null;
	}
}
