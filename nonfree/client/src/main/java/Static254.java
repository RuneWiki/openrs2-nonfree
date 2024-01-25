import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
	public static int anInt3860;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_70 = new Class231("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_34 = new Class88();

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "[I")
	public static final int[] anIntArray328 = new int[32];

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "[Lclient!ea;")
	public static final Class61[] aClass61Array2 = new Class61[4];

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "I")
	public static int anInt3861 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)I")
	public static int method3445(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Lclient!cf;")
	public static Class3_Sub2 method3449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class3_Sub2 local14 = local7.aClass3_Sub2_1;
			local7.aClass3_Sub2_1 = null;
			return local14;
		}
	}
}
