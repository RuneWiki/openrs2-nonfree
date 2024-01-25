import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!nb", name = "jb", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_120 = new Class186(5, -2);

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(ZI)V")
	public static void method5564(@OriginalArg(1) int arg0) {
		@Pc(18) Class3_Sub24 local18 = (Class3_Sub24) Static699.aClass136_50.method3503((long) arg0);
		if (local18 != null) {
			local18.aClass78_Sub1_1.method2102();
			Static656.method8785(local18.anInt3357, local18.aBoolean272);
			local18.method9446();
		}
	}
}
