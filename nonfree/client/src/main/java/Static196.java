import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
	public static int anInt4619;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "Lclient!ac;")
	public static Class5 aClass5_25;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IIIZ)Lclient!kha;")
	public static Class181 method3926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) Class370 local5 = null;
		if (Static169.aClass76_1 != null) {
			local5 = new Class370(arg1, Static169.aClass76_1, Static287.aClass76Array1[arg1], 1000000);
		}
		Static215.aClass120_Sub1Array1[arg1] = Static638.aClass331_1.method7985(local5, Static433.aClass370_3, arg1);
		Static215.aClass120_Sub1Array1[arg1].method3839();
		return new Class181(Static215.aClass120_Sub1Array1[arg1], arg2, arg0);
	}
}
