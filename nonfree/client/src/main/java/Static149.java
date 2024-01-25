import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
	public static int anInt3221 = 0;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!jg;I)Lclient!na;")
	public static Class14_Sub3 method2992(@OriginalArg(0) Class14_Sub4 arg0) {
		arg0.method2548();
		@Pc(13) int local13 = arg0.method2548();
		@Pc(19) Class14_Sub3 local19 = Static296.method5063(local13);
		local19.anInt6731 = arg0.method2548();
		@Pc(28) int local28 = arg0.method2548();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(36) int local36 = arg0.method2548();
			local19.method6000(arg0, local36);
		}
		local19.method5998();
		return local19;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!mo;Lclient!ah;I)V")
	public static void method2997(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Interface2 arg1) {
		Static143.anInterface2_1 = arg1;
		Static44.aClass143_31 = arg0;
	}
}
