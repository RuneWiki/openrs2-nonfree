import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "[Lclient!aw;")
	public static final Class18[] aClass18Array1 = new Class18[16];

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "[I")
	public static final int[] anIntArray452 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	public static void method4906() {
		@Pc(8) Class1_Sub22 local8 = (Class1_Sub22) Static335.aClass142_42.method3199();
		@Pc(16) boolean local16 = Static206.aClass229_6 != null || Static105.anInt2085 > 0;
		if (local16) {
			Static228.anInt3921 = 1;
		}
		if (Static54.aBoolean82 && Static254.aClass10_1.method221(81) && Static119.anInt2296 > 2) {
			if (local16) {
				Static241.aClass1_Sub3_2 = (Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261.aClass1_261;
			} else {
				Static257.method3642((Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261.aClass1_261, local8.method2936(), local8.method2939());
			}
		} else if (local16) {
			Static241.aClass1_Sub3_2 = (Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261;
		} else {
			Static257.method3642((Class1_Sub3) Static251.aClass142_26.aClass1_143.aClass1_261, local8.method2936(), local8.method2939());
		}
	}
}
