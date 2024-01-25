import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "Lclient!sea;")
	public static Class308 aClass308_3;

	@OriginalMember(owner = "client!ag", name = "z", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!ag", name = "K", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array2;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "[I")
	public static final int[] anIntArray12 = new int[1024];

	@OriginalMember(owner = "client!ag", name = "r", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)[Lclient!rg;")
	public static Class295[] method246() {
		return new Class295[] { Static501.aClass295_12, Static431.aClass295_11, Static560.aClass295_14, Static55.aClass295_1, Static122.aClass295_2, Static304.aClass295_5, Static509.aClass295_13, Static341.aClass295_6, Static355.aClass295_7, Static593.aClass295_15, Static149.aClass295_3, Static383.aClass295_8, Static420.aClass295_10, Static419.aClass295_9, Static303.aClass295_4 };
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)I")
	public static int method249() {
		@Pc(12) int local12 = Static203.aClass246_1.method5315();
		if (Static124.aClass246Array1.length - 1 > local12) {
			Static203.aClass246_1 = Static124.aClass246Array1[local12 + 1];
		}
		return 100;
	}
}
