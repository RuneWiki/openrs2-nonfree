import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static305 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "[I")
	public static int[] anIntArray416;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_85 = new Class186(77, 0);

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!gba;BI)V")
	public static void method5088(@OriginalArg(0) Class1_Sub13_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static89.aBoolean165 = false;
		Static125.anInt3025 = 0;
		Static17.method818(arg0);
		Static409.method6130(arg0);
		if (Static89.aBoolean165) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt3400 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt3400 + " psize:" + arg1);
		}
	}
}
