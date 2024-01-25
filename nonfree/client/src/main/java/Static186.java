import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!tv;")
	public static Class241 aClass241_6;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_6 = new Class83(9, 0, 4, 1);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method2721() {
		for (@Pc(8) Class7_Sub39 local8 = (Class7_Sub39) Static237.aClass85_26.method2010(); local8 != null; local8 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			if (Static242.method3278(local8.anInt5893)) {
				Static206.method2965(local8);
			}
		}
		if (Static102.anInt2085 == 1) {
			Static422.method5401();
			return;
		}
		Static136.method2147(Static253.anInt4289, Static351.anInt5637, Static171.anInt3077, Static415.anInt6598);
		@Pc(51) int local51 = Static35.aClass57_13.method1387(Static448.aClass55_146.method1205(Static5.anInt20));
		for (@Pc(56) Class7_Sub39 local56 = (Class7_Sub39) Static237.aClass85_26.method2010(); local56 != null; local56 = (Class7_Sub39) Static237.aClass85_26.method2000()) {
			@Pc(62) int local62 = Static218.method3068(local56);
			if (local51 < local62) {
				local51 = local62;
			}
		}
		Static253.anInt4289 = (Static425.aBoolean471 ? 26 : 22) + Static102.anInt2085 * 16;
		Static171.anInt3077 = local51 + 8;
	}
}
