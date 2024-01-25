import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "[I")
	public static final int[] anIntArray357 = new int[1];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method3335(@OriginalArg(0) String arg0) {
		return Static159.method2587(16, arg0);
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public static void method3339() {
		@Pc(8) Class2_Sub15 local8 = (Class2_Sub15) Static360.aClass14_47.method309();
		@Pc(16) boolean local16 = Static182.aClass68_7 != null || Static110.anInt2578 > 0;
		if (local16) {
			Static222.anInt4314 = 1;
		}
		if (Static424.aBoolean472 && Static334.aClass226_1.method4977(81) && Static373.anInt4900 > 2) {
			if (local16) {
				Static77.aClass2_Sub22_1 = (Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262.aClass2_262;
			} else {
				Static437.method5683(local8.method2336(), local8.method2334(), (Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262.aClass2_262);
			}
		} else if (local16) {
			Static77.aClass2_Sub22_1 = (Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262;
		} else {
			Static437.method5683(local8.method2336(), local8.method2334(), (Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262);
		}
	}
}
