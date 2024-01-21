import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] aClass3_Sub2_Sub3_Sub3Array1;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
	public static int anInt25;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	public static int anInt22 = 0;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!kb;")
	public static Class46 aClass46_3 = Static65.method1172("l");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!h;)Lclient!h;")
	public static Class33 method11(@OriginalArg(1) Class33 arg0) {
		@Pc(12) Class33 local12 = Static122.method2083(arg0);
		if (local12 == null) {
			local12 = arg0.aClass33_4;
		}
		return local12;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	public static void method12() {
		anIntArray2 = null;
		aClass3_Sub2_Sub3_Sub3Array1 = null;
		aClass46_3 = null;
	}
}
