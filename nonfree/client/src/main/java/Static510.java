import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "[I")
	public static final int[] anIntArray547 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZLclient!je;)Z")
	public static boolean method6614(@OriginalArg(1) Interface14 arg0) {
		@Pc(17) Class216 local17 = Static362.aClass290_2.method5799(arg0.method7094());
		if (local17.anInt5273 == -1) {
			return true;
		} else {
			@Pc(29) Class252 local29 = Static369.aClass212_6.method4407(local17.anInt5273);
			return local29.anInt6295 == -1 ? true : local29.method5254();
		}
	}
}
