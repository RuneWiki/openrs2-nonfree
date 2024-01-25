import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_18 = new Class56(15, 6);

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
	public static void method496() {
		@Pc(5) int local5;
		if (Static182.aClass308Array3 != null) {
			for (local5 = 0; local5 < Static118.anInt2726; local5++) {
				Static182.aClass308Array3[local5] = null;
			}
			Static182.aClass308Array3 = null;
		}
		if (Static88.aClass308Array1 != null) {
			for (local5 = 0; local5 < Static145.anInt3113; local5++) {
				Static88.aClass308Array1[local5] = null;
			}
			Static88.aClass308Array1 = null;
		}
		if (Static206.aClass308Array4 != null) {
			for (local5 = 0; local5 < Static188.anInt7665; local5++) {
				Static206.aClass308Array4[local5] = null;
			}
			Static206.aClass308Array4 = null;
		}
		Static555.anIntArrayArrayArray20 = null;
		Static76.anInt1726 = -1;
		Static365.anInt6275 = -1;
		Static128.anIntArray130 = null;
		Static121.aClass308Array2 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!wp;)V")
	public static void method497(@OriginalArg(1) Class361 arg0) {
		if (arg0.anInt9665 == 5 && arg0.anInt9645 != -1) {
			Static303.method4453(Static505.aClass45_11, arg0);
		}
	}
}
