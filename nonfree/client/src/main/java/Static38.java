import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_30 = new Class363(16, 6);

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_1 = new Class113(8, 6);

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_12 = new Class286(31, -1);

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_31 = new Class363(49, -2);

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "[I")
	public static final int[] anIntArray53 = new int[13];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIB)I")
	public static int method664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(18) int local18 = arg2 & arg1 - 1;
		@Pc(22) int local22 = arg0 / arg1;
		@Pc(28) int local28 = arg1 - 1 & arg0;
		@Pc(33) int local33 = Static362.method5083(local7, local22);
		@Pc(40) int local40 = Static362.method5083(local7 + 1, local22);
		@Pc(47) int local47 = Static362.method5083(local7, local22 + 1);
		@Pc(56) int local56 = Static362.method5083(local7 + 1, local22 - -1);
		@Pc(63) int local63 = Static469.method6596(arg1, local18, local33, local40);
		@Pc(70) int local70 = Static469.method6596(arg1, local18, local47, local56);
		return Static469.method6596(arg1, local28, local63, local70);
	}
}
