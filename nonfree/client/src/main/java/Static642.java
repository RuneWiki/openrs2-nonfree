import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_47 = new Class273(8);

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_157 = new Class337(105, 10);

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "Z")
	public static boolean aBoolean725 = true;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
	public static int anInt10098 = -1;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "[I")
	public static final int[] anIntArray577 = new int[13];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!ofa;)Lclient!fw;")
	public static Class5_Sub2 method8630(@OriginalArg(1) Class5_Sub22 arg0) {
		arg0.method5966();
		@Pc(21) int local21 = arg0.method5966();
		@Pc(25) Class5_Sub2 local25 = Static255.method4188(local21);
		local25.anInt10638 = arg0.method5966();
		@Pc(34) int local34 = arg0.method5966();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method5966();
			local25.method9040(arg0, local42);
		}
		local25.method9044();
		return local25;
	}
}
