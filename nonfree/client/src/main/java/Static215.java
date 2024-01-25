import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static215 {

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "Lclient!in;")
	public static final Class169 aClass169_262 = new Class169(73, 0);

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(B)V")
	public static void method9562() throws Exception_Sub1 {
		if (Static255.anInt4904 == 1) {
			Static435.aClass101_11.method8081(Static5.anInt88, Static590.anInt10296);
		} else {
			Static435.aClass101_11.method8081(0, 0);
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BI)V")
	public static void method9564(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static169.anInt3597 = arg0;
		Static190.aClass15_Sub5Array1 = new Class15_Sub5[Static235.anIntArray218[Static169.anInt3597] + 1];
		Static91.anInt1670 = 0;
		Static124.anInt2434 = 0;
	}
}
