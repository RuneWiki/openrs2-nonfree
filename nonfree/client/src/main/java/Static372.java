import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!fha;")
	public static Class109 aClass109_37;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!uha;")
	public static Class177 aClass177_5;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject14;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	public static int anInt5855 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!ha;IZLclient!kha;I)V")
	public static void method5019(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class191 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class273 local9 = Static264.aClass207_3.method4286(arg3.anInt4793);
		if (local9.anInt7076 == -1) {
			return;
		}
		if (arg3.aBoolean347) {
			@Pc(22) int local22 = arg4 + arg3.anInt4775;
			arg4 = local22 & 0x3;
		} else {
			arg4 = 0;
		}
		@Pc(38) Class61 local38 = local9.method6026(arg3.aBoolean343, arg1, arg4);
		if (local38 == null) {
			return;
		}
		@Pc(54) int local54 = arg3.anInt4814;
		@Pc(57) int local57 = arg3.anInt4817;
		if ((arg4 & 0x1) == 1) {
			local54 = arg3.anInt4817;
			local57 = arg3.anInt4814;
		}
		@Pc(73) int local73 = local38.method6446();
		@Pc(76) int local76 = local38.method6438();
		if (local9.aBoolean531) {
			local76 = local57 * 4;
			local73 = local54 * 4;
		}
		if (local9.anInt7068 == 0) {
			local38.method6430(arg2, arg0 - (local57 - 1) * 4, local73, local76);
		} else {
			local38.method6440(arg2, arg0 + 4 - local57 * 4, local73, local76, 0, local9.anInt7068 | 0xFF000000, 1);
		}
	}
}
