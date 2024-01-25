import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!wj", name = "L", descriptor = "[I")
	public static final int[] anIntArray595 = new int[14];

	@OriginalMember(owner = "client!wj", name = "P", descriptor = "Z")
	public static boolean aBoolean721 = true;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!pca;)V")
	public static void method8016(@OriginalArg(1) Class251 arg0) {
		if (Static177.anInt3896 == arg0.anInt7282) {
			Static544.aBooleanArray32[arg0.anInt7286] = true;
		}
	}

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)Lclient!kt;")
	public static Class3_Sub33 method8017() {
		if (Static157.aClass244_22 == null || Static126.aClass85_1 == null) {
			return null;
		}
		Static126.aClass85_1.method2290(Static157.aClass244_22);
		@Pc(25) Class3_Sub33 local25 = (Class3_Sub33) Static126.aClass85_1.method2289();
		if (local25 == null) {
			return null;
		} else {
			@Pc(35) Class338 local35 = Static157.aClass189_2.method4642(local25.anInt5496);
			return local35 != null && local35.aBoolean645 && local35.method7661(Static157.anInterface7_2) ? local25 : Static56.method1375();
		}
	}
}
