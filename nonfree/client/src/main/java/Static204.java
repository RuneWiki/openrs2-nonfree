import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!ica", name = "I", descriptor = "Lclient!tj;")
	public static Class282 aClass282_1;

	@OriginalMember(owner = "client!ica", name = "B", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_61 = new Class40("Take", "Nehmen", "Prendre", "Pegar");

	@OriginalMember(owner = "client!ica", name = "J", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_92 = new Class150(72, -2);

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!aj;IB)V")
	public static void method3339(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static271.aBoolean369 = false;
		Static457.anInt7876 = 0;
		Static265.method4418(arg0);
		Static350.method4110(arg0);
		if (Static271.aBoolean369) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt4960) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4960 + " psize:" + arg1);
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BI)I")
	public static int method3343(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
