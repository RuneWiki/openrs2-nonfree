import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!dm;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!id;")
	public static Class1_Sub15 aClass1_Sub15_1 = new Class1_Sub15(0, 0);

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!sh;")
	public static Class147 aClass147_1 = new Class147();

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
	public static int anInt480 = -1;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
	public static int[] anIntArray48 = new int[2];

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!qm;B)V")
	public static void method392(@OriginalArg(0) Class1_Sub27 arg0) {
		Static33.method675(200000, arg0);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method393() {
		@Pc(34) String local34;
		if (Static272.anInt5854 == 1 && Static111.anInt2398 < 2) {
			local34 = Static5.aString3 + Static115.aString78 + Static95.aString70 + " ->";
		} else if (Static16.aBoolean22 && Static111.anInt2398 < 2) {
			local34 = Static280.aString193 + Static115.aString78 + Static128.aString80 + " ->";
		} else if (Static66.aBoolean191 && Static35.aBooleanArray2[81] && Static111.anInt2398 > 2) {
			local34 = Static254.method4242(Static111.anInt2398 - 2);
		} else {
			local34 = Static254.method4242(Static111.anInt2398 - 1);
		}
		if (Static111.anInt2398 > 2) {
			local34 = local34 + "<col=ffffff> / " + (Static111.anInt2398 - 2) + Static56.aString48;
		}
		return local34;
	}
}
