import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!km", name = "s", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "Lclient!la;")
	public static final Class136 aClass136_103 = new Class136(3, -2);

	@OriginalMember(owner = "client!km", name = "q", descriptor = "[I")
	public static final int[] anIntArray238 = new int[200];

	@OriginalMember(owner = "client!km", name = "u", descriptor = "[Lclient!wk;")
	public static final Class1_Sub2_Sub6_Sub2[] aClass1_Sub2_Sub6_Sub2Array1 = new Class1_Sub2_Sub6_Sub2[2048];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(CI)Z")
	public static boolean method3200(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(36) char[] local36 = Static81.aCharArray3;
			for (@Pc(38) int local38 = 0; local38 < local36.length; local38++) {
				@Pc(44) char local44 = local36[local38];
				if (arg0 == local44) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
	public static void method3203() {
		Static132.aClass167_4.MA(((float) Static39.aClass79_Sub1_1.anInt2153 * 0.1F + 0.7F) * 1.1523438F);
		Static132.aClass167_4.la(Static424.anInt7154, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
		Static132.aClass167_4.ha(Static26.anInt449, -1, 256);
		Static132.aClass167_4.method5982(Static61.aClass139_1);
	}
}
