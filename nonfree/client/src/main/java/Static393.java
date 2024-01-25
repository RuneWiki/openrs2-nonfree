import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "Lclient!so;")
	public static final Class224 aClass224_24 = new Class224(10, 6);

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_200 = new Class151("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLclient!wp;)I")
	public static int method4973(@OriginalArg(1) Class1_Sub45 arg0) {
		@Pc(15) String local15 = Static258.method3272(arg0);
		@Pc(17) int[] local17 = null;
		if (Static97.method1391(arg0.anInt7398)) {
			local17 = Static227.aClass65_2.method1327((int) arg0.aLong225).anIntArray87;
		} else if (arg0.anInt7396 != -1) {
			local17 = Static227.aClass65_2.method1327(arg0.anInt7396).anIntArray87;
		} else if (Static109.method1524(arg0.anInt7398)) {
			@Pc(90) Class20_Sub3_Sub3_Sub2 local90 = Static98.aClass20_Sub3_Sub3_Sub2Array1[(int) arg0.aLong225];
			if (local90 != null) {
				@Pc(95) Class246 local95 = local90.aClass246_1;
				if (local95.anIntArray459 != null) {
					local95 = local95.method5255(Static364.aClass259_1);
				}
				if (local95 != null) {
					local17 = local95.anIntArray455;
				}
			}
		} else if (Static29.method506(arg0.anInt7398)) {
			@Pc(58) Class141 local58;
			if (arg0.anInt7398 == 1006) {
				local58 = Static259.aClass95_3.method1821((int) arg0.aLong225);
			} else {
				local58 = Static259.aClass95_3.method1821((int) (arg0.aLong225 >>> 32 & 0x7FFFFFFFL));
			}
			if (local58.anIntArray184 != null) {
				local58 = local58.method2832(Static364.aClass259_1);
			}
			if (local58 != null) {
				local17 = local58.anIntArray187;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static108.method1518(local17);
		}
		@Pc(136) int local136 = Static6.aClass122_1.method2474(local15, Static214.aClass49Array147);
		if (arg0.aBoolean606) {
			local136 += Static238.aClass49_10.UA() + 4;
		}
		return local136;
	}
}
